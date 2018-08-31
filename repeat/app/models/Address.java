package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Address extends Model {

    @Id
    private Long add_id;
    
    @Constraints.Required
    private String addName;

    @Constraints.Required
    private String eirCode;

    public Address() {

    }

    public Address(String addressName, String eirCode) {
        this.addName = addressName;
        this.eirCode = eirCode;
    }

    
    // Generic query helper for entity Address with id of type Long
    public static final Finder<Long, Address> find = new Finder<>(Address.class);

    // Return an array list of all Address objects
    public static final List<Address> findAll() {
        return Address.find.all();
    }


    public Long getAddressId() {
        return add_id;
    }

    public void setAddressId(Long addressId) {
        this.add_id = addressId;
    }

    public String getAddressName() {
        return addName;
    }

    public void setAddressName(String addressName) {
        this.addName = addressName;
    }

    public String geteirCode() {
        return eirCode;
    }

    public void seteirCode(String eirCode) {
        this.eirCode = eirCode;
    }


}