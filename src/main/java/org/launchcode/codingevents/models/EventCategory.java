package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class EventCategory extends AbstractEntity {

    @NotBlank(message = "Can't be blank!")
    private String name;

    //TODO this constructor not necessary?
    public EventCategory(int id, String name) {
        this.name = name;
    }

    public EventCategory() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
