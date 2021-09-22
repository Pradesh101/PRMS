/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patientsBA.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.patientsBA.model.PrescriptionsForm;
import org.patientsBA.util.myConnection;

/**
 *
 * @author acer
 */
public class PrescriptionsFormDAO {
     public void saveData(PrescriptionsForm ob){
        try{
            Connection con=myConnection.getConnection();
            String sql="insert into prescription(name,contact,gender,age,disease,prescription,doctor_Fee,pres_Date)values(?,?,?,?,?,?,?,?)";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
            st.setString(2,ob.getContact());
            st.setString(3,ob.getGender());
            st.setString(4,ob.getAge());
            st.setString(5,ob.getDisease());
            st.setString(6,ob.getPrescription());
            st.setString(7,ob.getDoctorfee());
            st.setString(8,ob.getPrescriptiondate());
            int count=st.executeUpdate();
            if(count>0){
                //System.out.println("Record Saved");
                 JOptionPane.showMessageDialog(null,"Record Saved Successfully");
            }
            else{
                System.out.println("Record not saved");
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
         
        public ArrayList<PrescriptionsForm> fetchData(){
        ArrayList<PrescriptionsForm> presList=new ArrayList();
                try{
                    //System.out.println(adminid);
            Connection con=myConnection.getConnection();
            String sql="select * from prescription";
            PreparedStatement st=con.prepareStatement(sql);
            //st.setInt(1,1);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                PrescriptionsForm ob=new PrescriptionsForm();
                ob.setId(rs.getInt("id"));
                ob.setName(rs.getString("name"));
                ob.setContact(rs.getString("contact"));
                ob.setGender(rs.getString("gender"));
                ob.setAge(rs.getString("age"));
                ob.setDisease(rs.getString("disease"));
                ob.setPrescription(rs.getString("prescription"));
                ob.setDoctorfee(rs.getString("doctor_Fee"));
                ob.setPrescriptiondate(rs.getString("pres_Date"));
                presList.add(ob);
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
                //System.out.println("Bye");
                return presList;
    }

       
    public void updateRecord(PrescriptionsForm ob){
         try{
            Connection con=myConnection.getConnection();
            String sql="update prescription set name=?,contact=?,gender=?,age=?,disease=?,prescription=?,doctor_Fee=?,pres_Date=? where id=?";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
            st.setString(2,ob.getContact());
            st.setString(3,ob.getGender());
            st.setString(4,ob.getAge());
            st.setString(5,ob.getDisease());
            st.setString(6,ob.getPrescription());
            st.setString(7,ob.getDoctorfee());
            st.setString(8,ob.getPrescriptiondate());
            st.setInt(9,ob.getId());
            st.execute();
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteRecord(PrescriptionsForm ob){
         try{
            Connection con=myConnection.getConnection();
            String sql="delete from prescription where id=?";
            PreparedStatement st=con.prepareStatement(sql);
            st.setInt(1,ob.getId());
            st.execute();
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
