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
import org.patientsBA.model.PatientForm;
import org.patientsBA.util.myConnection;


public class PatientFormDAO {
    
         public void saveData(PatientForm ob){
        try{
            Connection con=myConnection.getConnection();
            String sql;
            if(ob.getAdminid()!=0){
            sql="insert into patient(name,address,gender,age,contact,marital,registerdate,adminid)values(?,?,?,?,?,?,?,?)";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
            st.setString(2,ob.getAddress());
            st.setString(3,ob.getGender());
            st.setString(4,ob.getAge());
            st.setString(5,ob.getContact());
            st.setString(6,ob.getMarital());
            st.setString(7,ob.getRegisterdate());
            st.setInt(8,ob.getAdminid());
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
            else{
            sql="insert into patient(name,address,gender,age,contact,marital,registerdate,recepid)values(?,?,?,?,?,?,?,?)";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
            st.setString(2,ob.getAddress());
            st.setString(3,ob.getGender());
            st.setString(4,ob.getAge());
            st.setString(5,ob.getContact());
            st.setString(6,ob.getMarital());
            st.setString(7,ob.getRegisterdate());
            st.setInt(8,ob.getRecpid());
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
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
         public ArrayList<PatientForm> fetchData(){
        ArrayList<PatientForm> pList=new ArrayList();
                try{
            Connection con=myConnection.getConnection();
            String sql="select * from patient";
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                PatientForm ob=new PatientForm();
                ob.setId(rs.getInt("id"));
                ob.setName(rs.getString("name"));
                ob.setAddress(rs.getString("address"));
                ob.setGender(rs.getString("gender"));
                ob.setAge(rs.getString("age"));
                ob.setContact(rs.getString("contact"));
                ob.setMarital(rs.getString("marital"));
                ob.setRegisterdate(rs.getString("registerdate"));
                //ob.setDisease(rs.getString("disease"));
                //int userid1 = userid;
                pList.add(ob);
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
                return pList;
    }
         
         public void updateRecord(PatientForm ob){
         try{
            Connection con=myConnection.getConnection();
            String sql="update patient set name=?,address=?,gender=?,age=?,contact=?,marital=?,registerdate=? where id=?";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
            st.setString(2,ob.getAddress());
            st.setString(3,ob.getGender());
            st.setString(4,ob.getAge());
            st.setString(5,ob.getContact());
            st.setString(6,ob.getMarital());
            st.setString(7,ob.getRegisterdate());
            //st.setString(8,ob.getDisease());
            st.setInt(8,ob.getId());
            st.execute();
            con.close();
            JOptionPane.showMessageDialog(null,"Record Update Sucessfully!!!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
         
         public void deleteRecord(PatientForm ob){
         try{
            Connection con=myConnection.getConnection();
            String sql="delete from patient where id=?";
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
