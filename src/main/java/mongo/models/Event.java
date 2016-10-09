package mongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
@Document(collection = "spring-data-events")
@TypeAlias("event")
public class Event implements Serializable {


    private static final long serialVersionUID = -1671976301361931347L;

    @Id
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
