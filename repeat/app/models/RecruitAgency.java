package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class RecruitAgency extends Model {
    @Id
    private Long id;
    
    @Constraints.Required
    private String name;

    @OneToMany
    private List<Job> jobs;

    public RecruitAgency() {
    }

    public RecruitAgency(Long id, String name, List<Job> jobs) {
        this.id = id;
        this.name = name;
        this.jobs = jobs;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public static Finder<Long, RecruitAgency> find = new Finder<Long, RecruitAgency>(RecruitAgency.class);

    public static List<RecruitAgency> findAll() {
        return RecruitAgency.find.query().where().orderBy("name asc").findList();
    }

    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap();

        for (RecruitAgency r: RecruitAgency.findAll()) {
            options.put(r.getId().toString(), r.getName());
        }
        
        return options;
    }

}