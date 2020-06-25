/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author vip
 */
public class appointment {
    private SimpleStringProperty id,name,specialty;
    LocalDate date;
    

    public appointment(String id, LocalDate date, String name, String specialty) {
        this.id =new SimpleStringProperty(id);
        this.date =date;
        this.name =new SimpleStringProperty(name);
        this.specialty =new SimpleStringProperty( specialty);
    }

    public void setId(String id) {
        this.id =  new SimpleStringProperty(id);
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public void setSpecialty(String specialty) {
        this.specialty = new SimpleStringProperty(specialty);
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

   
    

    public String getId() {
        return id.get();
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name.get();
    }

    public String getSpecialty() {
        return specialty.get();
    }
    
}
