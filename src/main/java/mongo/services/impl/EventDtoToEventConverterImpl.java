package mongo.services.impl;

import mongo.dtos.EventDTO;
import mongo.models.Event;
import org.springframework.stereotype.Service;
import mongo.services.EventDtoToEventConverter;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
@Service
public class EventDtoToEventConverterImpl implements EventDtoToEventConverter {

    @Override
    public Event convert(EventDTO eventDTO) {
        Event event = new Event();
        event.setName(eventDTO.getName());
        event.setId(eventDTO.getId());
        return event;
    }
}
