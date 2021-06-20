package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.*;

@Entity
public class EventDetails extends AbstractEntity {

    @Size(max = 500, message = "Description too long")
    private String description;

    @NotNull(message = "E-mail is required")
    @Email(message = "Invalid e-mail. Try again")
    private String contactEmail;

    @NotBlank(message = "Location is required")
    @NotNull(message = "Can't be null?")
    private String location;

    private boolean regRequired;

    @DecimalMin(value = "1", message = "Must be greater than 0")
    private int noOfAttendees;

    public EventDetails(String description, String contactEmail, String location, boolean regRequired, int noOfAttendees) {
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.regRequired = regRequired;
        this.noOfAttendees = noOfAttendees;
    }

    public EventDetails() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegRequired() {
        return regRequired;
    }

    public void setRegRequired(boolean regRequired) {
        this.regRequired = regRequired;
    }

    public int getNoOfAttendees() {
        return noOfAttendees;
    }

    public void setNoOfAttendees(int noOfAttendees) {
        this.noOfAttendees = noOfAttendees;
    }
}
