package mongo.daos;

import mongo.models.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
public interface EventServiceDao extends MongoRepository<Event, String> {
}
