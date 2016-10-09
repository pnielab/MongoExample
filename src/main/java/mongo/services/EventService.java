package mongo.services;

import mongo.models.Event;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
public interface EventService {
    Event save(Event event);

    Event getEntityById(String id);
}
