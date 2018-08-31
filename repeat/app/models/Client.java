package models;

/*

    X000139473
    Ben O'Flaherty

*/
import java.util.*;
import javax.persistence.*;
import java.text.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Client extends Model {

// Properties

@Id
private Long id;

@Constraints.Required
private String name;

@Constraints.Required
private String description;

@OneToOne
private Address address;

@OneToOne
private CV cv;

// Default Constructor

public Client() {

}

// Constructor to initialise object

public Client(Long id, String name, String description, Address address, CV cv) {

this.id = id;
this.name = name;
this.description = description;
this.address =address;
this.cv = cv;
}

    // Generic query helper for entity Project with id of type Long
    public static final Finder<Long, Client> find = new Finder<>(Client.class);
    
        // Return an array list of all Job objects
        public static final List<Client> findAll() {
            return Client.find.all();
        }

// Accessor methods

public Long getId() {

return id;

}

public void setId(Long id) {

this.id = id;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public String getDescription(){
    return description;
}


public void setDescription(String description){
    this.description = description;
}

public Address getAddress(){
    return address;
}

public void setAddress(Address address){
    this.address = address;
}

public CV getCV(){
    return cv;
}

public void setCV(CV cv){
    this.cv = cv;
}


}