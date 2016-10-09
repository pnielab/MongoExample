package mongo.controllers;

import mongo.dtos.EventDTO;
import mongo.models.Event;
import mongo.services.EventDtoToEventConverter;
import mongo.services.EventService;
import mongo.services.EventToEventDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
@RestController
@RequestMapping(value = "mongo")
@EnableAutoConfiguration
public class MongoController {


    @Autowired
    private EventService eventService;

    @Autowired
    private EventDtoToEventConverter eventDtoToEventConverter;

    @Autowired
    private EventToEventDtoConverter eventToEventDtoConverter;


   // @ApiOperation(httpMethod = "POST", value="event", notes="Description of the service for swagger", response = ServiceResponse.class)
    @RequestMapping(value = "/event", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<EventDTO> saveEvent(@Valid @RequestBody EventDTO eventDTO) {
        Event event = eventDtoToEventConverter.convert(eventDTO);
        event = eventService.save(event);
        eventDTO.setId(event.getId());
        return new ResponseEntity<EventDTO>(eventDTO, HttpStatus.OK);
    }

    @RequestMapping(value = "/event/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<EventDTO> getEvent(@PathVariable String id){
        Event event = eventService.getEntityById(id);
        EventDTO eventDTO =  eventToEventDtoConverter.convert(event);
        return new ResponseEntity<EventDTO>(eventDTO, HttpStatus.OK);
    }


}
