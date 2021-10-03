/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patientsBA.model;

/**
 *
 * @author acer
 */
public class PrescriptionsForm {
    private int id;
    private String name;
    private String contact;
    private String gender;
    private String age;
    private String disease;
    private String prescription;
    private int appid;
    private String prescriptiondate;
    private int adminid;
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setContact(String contact) {
        this.contact= contact;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setAge(String age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    
    public void setPrescription(String pres) {
        this.prescription = pres;
    }
    
    public void setAppid(int appid) {
        this.appid = appid;
    }

    public void setPrescriptiondate(String pdate) {
        this.prescriptiondate = pdate;
    }
    
    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }
        
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    public String getGender() {
        return gender;
    }
    
    public String getAge() {
        return age;
    }

    public String getContact() {
        return contact;
    }

    public String getDisease() {
        return disease;
    }

    public String getPrescription() {
        return prescription;
    }
    
    public int getAppid() {
        return appid;
    }
    
    public String getPrescriptiondate() {
        return prescriptiondate;
    }
    
    public int getAdminid() {
        return adminid;
    }
}
