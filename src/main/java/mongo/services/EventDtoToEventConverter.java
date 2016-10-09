package mongo.services;

import mongo.dtos.EventDTO;
import mongo.models.Event;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
public interface EventDtoToEventConverter extends Converter<EventDTO, Event> {
}
