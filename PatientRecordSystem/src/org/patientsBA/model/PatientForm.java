/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patientsBA.model;

public class PatientForm {
    private int id;
    private String name;
    private String address;
    private String gender;
    private String age;
    private String contact;
    private String marital;
    private String registerdate;
    //private String disease;
    private int adminid;
    private int recpid;
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

        public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    
    public void setContact(String contact) {
        this.contact= contact;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }
    
    public void setRegisterdate(String rdate) {
        this.registerdate = rdate;
    }
    
        public void setAdminid(int adminid) {
        this.adminid = adminid;
    }
    
    public void setRecpid(int recpid) {
        this.recpid = recpid;
    }
    

        
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
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

    public String getMarital() {
        return marital;
    }

    public String getRegisterdate() {
        return registerdate;
    }
    
    public int getAdminid() {
        return adminid;
    }
    
    public int getRecpid() {
        return recpid;
    }
    
}
