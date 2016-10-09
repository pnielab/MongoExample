package mongo.services.impl;

import mongo.dtos.EventDTO;
import mongo.models.Event;
import mongo.services.EventToEventDtoConverter;
import org.springframework.stereotype.Service;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
@Service
public class EventToEventDtoConverterImpl implements EventToEventDtoConverter {


    @Override
    public EventDTO convert(Event event) {
        EventDTO eventDTO = new EventDTO();
        eventDTO.setId(event.getId());
        eventDTO.setName(event.getName());
        return eventDTO;
    }
}
