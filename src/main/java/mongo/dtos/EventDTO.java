package mongo.dtos;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
public class EventDTO implements Serializable {


    private static final long serialVersionUID = 4746689667414718935L;

    private String id;

    @NotEmpty
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
