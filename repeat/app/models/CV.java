package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class CV extends Model {

    @Id
    private Long cv_id;
    private String cvName;
    private String objective;
    private String education;
    private String workExperience;



    public CV() {

    }

    public CV(String cvName, String objective, String education,String workExperience ) {
        this.cvName = cvName;
        this.objective = objective;
        this.education = education;
        this.workExperience = workExperience;
    }

    
    // Generic query helper for entity Address with id of type Long
    public static final Finder<Long, CV> find = new Finder<>(CV.class);

    // Return an array list of all Address objects
    public static final List<CV> findAll() {
        return CV.find.all();
    }


    public Long getCVId() {
        return cv_id;
    }

    public void setCVId(Long id) {
        this.cv_id = id;
    }

    public String getCVName() {
        return cvName;
    }

    public void setCVName(String name) {
        this.cvName = cvName;
    }

    public String getCVObjective() {
        return objective;
    }

    public void setCVObjective(String objective) {
        this.objective = objective;
    }

    public String getCVEducation() {
        return education;
    }

    public void setCVEducation(String education) {
        this.education = education;
    }

    public String getCVExperience() {
        return workExperience;
    }

    public void setCVExperience(String workExperience) {
        this.workExperience = workExperience;
    }

}