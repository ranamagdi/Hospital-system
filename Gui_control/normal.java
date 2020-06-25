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
public class normal {
     private SimpleStringProperty id,phone;
    private SimpleStringProperty address,name,Symptoms,Diagnosis,gender,payment;
   

    public normal( String id, String phone, String address,String name, String Symptoms,String Diagnosis,String gender,String payment) {
        this.id =new SimpleStringProperty(id);
        this.phone =new SimpleStringProperty( phone);
        this.address = new SimpleStringProperty(address);
        this.name =new SimpleStringProperty( name);
        this.Symptoms = new SimpleStringProperty(Symptoms);
        this.Diagnosis =new SimpleStringProperty(Diagnosis);
        this.gender = new SimpleStringProperty(gender);
        this.payment = new SimpleStringProperty(payment);
    }

    
 
    
  public void setId(String id) {
        this.id =new SimpleStringProperty( id);
    }

    public void setPhone(String phone) {
        this.phone =new  SimpleStringProperty (phone);
    }

    public void setAddress(String address) {
        this.address = new SimpleStringProperty(address);
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public void setSymptoms(String Symptoms) {
        this.Symptoms =  new SimpleStringProperty(Symptoms);
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = new SimpleStringProperty(Diagnosis);
    }

    public void setGender(String gender) {
        this.gender = new SimpleStringProperty(gender);
    }

    public void setPayment(String payment) {
        this.payment = new SimpleStringProperty(payment);
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

    public String getSymptoms() {
        return Symptoms.get();
    }

    public String getDiagnosis() {
        return Diagnosis.get();
    }

    public String getGender() {
        return gender.get();
    }

    public String getPayment() {
        return payment.get();
    }
    
}
