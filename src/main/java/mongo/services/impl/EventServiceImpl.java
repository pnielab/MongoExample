package mongo.services.impl;

import mongo.daos.EventServiceDao;
import mongo.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mongo.services.EventService;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventServiceDao eventServiceDao;

    @Override
    public Event save(Event event) {
        return eventServiceDao.save(event);
    }

    @Override
    public Event getEntityById(String id) {
        return eventServiceDao.findOne(id);
    }
}
