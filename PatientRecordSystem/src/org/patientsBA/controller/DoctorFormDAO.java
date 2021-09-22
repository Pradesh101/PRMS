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
import org.patientsBA.model.DoctorForm;
import org.patientsBA.util.myConnection;

public class DoctorFormDAO {
    
         public void saveData(DoctorForm ob){
        try{
            Connection con=myConnection.getConnection();
            String sql="insert into doctor(name,address,gender,age,contact,marital,joiningdate,doctortype,username,password,adminid)values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
            st.setString(2,ob.getAddress());
            st.setString(3,ob.getGender());
            st.setString(4,ob.getAge());
            st.setString(5,ob.getContact());
            st.setString(6,ob.getMarital());
            st.setString(7,ob.getJoiningdate());
            st.setString(8,ob.getDoctortype());
            st.setString(9,ob.getUsername());
            st.setString(10,ob.getPassword());
            st.setInt(11,ob.getAdminid());
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
         
         public ArrayList<DoctorForm> fetchData(int adminid){
        ArrayList<DoctorForm> docList=new ArrayList();
                try{
                    //System.out.println(adminid);
            Connection con=myConnection.getConnection();
            String sql="select * from doctor where adminid = ?";
            PreparedStatement st=con.prepareStatement(sql);
            st.setInt(1,adminid);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                DoctorForm ob=new DoctorForm();
                //System.out.println(rs.getInt("id"));
                ob.setId(rs.getInt("id"));
                //System.out.println(rs.getString("name"));
                ob.setName(rs.getString("name"));
                //System.out.println(rs.getString("address"));
                ob.setAddress(rs.getString("address"));
                //System.out.println(rs.getString("gender"));
                ob.setGender(rs.getString("gender"));
                //System.out.println(rs.getString("age"));
                ob.setAge(rs.getString("age"));
                //System.out.println(rs.getString("contact"));
                ob.setContact(rs.getString("contact"));
                //System.out.println(rs.getString("marital"));
                ob.setMarital(rs.getString("marital"));
                //System.out.println(rs.getString("joiningdate"));
                ob.setJoiningdate(rs.getString("joiningdate"));
                //System.out.println(rs.getString("doctortype"));
                ob.setDoctortype(rs.getString("doctortype"));
                //System.out.println(rs.getString("username"));
                ob.setUsername(rs.getString("username"));
                //System.out.println(rs.getString("password"));
                ob.setPassword(rs.getString("password"));
                //int adminid1 = adminid;
                docList.add(ob);
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
                //System.out.println("Bye");
                return docList;
    }

       
    public void updateRecord(DoctorForm ob){
         try{
            Connection con=myConnection.getConnection();
            String sql="update doctor set name=?,address=?,gender=?,age=?,contact=?,marital=?,joiningdate=?,doctortype=?,username=?,password=? where id=?";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
            st.setString(2,ob.getAddress());
            st.setString(3,ob.getGender());
            st.setString(4,ob.getAge());
            st.setString(5,ob.getContact());
            st.setString(6,ob.getMarital());
            st.setString(7,ob.getJoiningdate());
            st.setString(8,ob.getDoctortype());
            st.setString(9,ob.getUsername());
            st.setString(10,ob.getPassword());
            st.setInt(11,ob.getId());
            st.execute();
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteRecord(DoctorForm ob){
         try{
            Connection con=myConnection.getConnection();
            String sql="delete from doctor where id=?";
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


