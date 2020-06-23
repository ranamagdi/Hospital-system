/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import javafx.beans.property.SimpleStringProperty;


public class doctor {
   private SimpleStringProperty id,phone;
    private  SimpleStringProperty address,name,specialty;
  
   

    public doctor(String id, String phone, String address, String name, String specialty) {
        this.id = new SimpleStringProperty (id);
        this.phone = new SimpleStringProperty( phone);
        this.address =new SimpleStringProperty( address);
        this.name = new SimpleStringProperty(name);
        this.specialty =new SimpleStringProperty( specialty);
    }

    public void setId(String id) {
        this.id = new SimpleStringProperty(id);
    }

    public void setPhone(String phone) {
        this.phone = new SimpleStringProperty(phone);
    }

    public void setAddress(String address) {
        this.address =new SimpleStringProperty( address);
    }

    public void setName(String name) {
        this.name =new SimpleStringProperty( name);
    }

    public void setSpecialty(String specialty) {
        this.specialty = new SimpleStringProperty(specialty);
    }

    public String getId() {
        return id.get();
    }

    public String getPhone() {
        return phone.get();
    }

    public String getAddress() {
        return address.get();
    }

    public String getName() {
        return name.get();
    }

    public String getSpecialty() {
        return specialty.get();
    }

    
}
