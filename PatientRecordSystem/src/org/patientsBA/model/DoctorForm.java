/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patientsBA.model;

public class DoctorForm {
    
    private int id;
    private String name;
    private String address;
    private String gender;
    private String age;
    private String contact;
    private String marital;
    private String joiningdate;
    private String doctortype;
    private String username;
    private String password;
    private int adminid;
    
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
    
    public void setJoiningdate(String jdate) {
        this.joiningdate = jdate;
    }
    
    public void setDoctortype(String dtype) {
        this.doctortype = dtype;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
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

    public String getJoiningdate() {
        return joiningdate;
    }
    
    public String getDoctortype() {
        return doctortype;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public int getAdminid() {
        return adminid;
    }
}
