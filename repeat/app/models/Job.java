package models;

import java.util.*;
import javax.persistence.*;
import java.text.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Job extends Model {

// Properties

@Id
private Long id;

@Constraints.Required
private String name;

@Constraints.Required
private String description;

@Constraints.Required
private String company;

@ManyToOne
private RecruitAgency agency;

@Constraints.Required
private String location;

// Default Constructor

public Job() {

}

// Constructor to initialise object

public Job(Long id, String name, String description, String company, String location) {

this.id = id;
this.name = name;
this.description = description;
this.company = company;
this.location = location;

}

    // Generic query helper for entity Project with id of type Long
    public static final Finder<Long, Job> find = new Finder<>(Job.class);
    
        // Return an array list of all Job objects
        public static final List<Job> findAll() {
            return Job.find.all();
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

public String getCompany(){
    return company;
}

public void setCompany(String company){
    this.company = company;
}

public String getLocation(){
    return location;
}

public void setLocation(String location){
    this.location = location;
}

public RecruitAgency getDRecruitAgency() { 
    return agency; 
} 
public void setRecruitAgency(RecruitAgency RecruitAgency) { 
    this.agency = RecruitAgency; 
} 

}