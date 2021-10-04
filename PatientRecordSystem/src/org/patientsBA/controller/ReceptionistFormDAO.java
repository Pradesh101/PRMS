


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
import org.patientsBA.model.ReceptionistForm;
import org.patientsBA.util.myConnection;

/**
 *
 * @author Raj Cassette
 */
public class ReceptionistFormDAO {
    
     public void saveData(ReceptionistForm ob){
        try{
            Connection con=myConnection.getConnection();
            String sql="insert into receptionist(name,address,gender,age,contact,marital,joiningdate,username,password,adminid)values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
            st.setString(2,ob.getAddress());
            st.setString(3,ob.getGender());
            st.setString(4,ob.getAge());
            st.setString(5,ob.getContact());
            st.setString(6,ob.getMarital());
            st.setString(7,ob.getJoiningdate());
            st.setString(8,ob.getUsername());
            st.setString(9,ob.getPassword());
            st.setInt(10,ob.getAdminid());
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
     
     public ArrayList<ReceptionistForm> fetchData(int adminid){
        ArrayList<ReceptionistForm> recepList=new ArrayList();
                try{
            Connection con=myConnection.getConnection();
            String sql="select * from receptionist where adminid =?";
            PreparedStatement st=con.prepareStatement(sql);
            st.setInt(1, adminid);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                ReceptionistForm ob=new ReceptionistForm();
                ob.setId(rs.getInt("id"));
                ob.setName(rs.getString("name"));
                ob.setAddress(rs.getString("address"));
                ob.setGender(rs.getString("gender"));
                ob.setAge(rs.getString("age"));
                ob.setContact(rs.getString("contact"));
                ob.setMarital(rs.getString("marital"));
                ob.setJoiningdate(rs.getString("joiningdate"));
                ob.setUsername(rs.getString("username"));
                ob.setPassword(rs.getString("password"));
                //int adminid1 = adminid;
                recepList.add(ob);
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
                return recepList;
    }

         public void updateRecord(ReceptionistForm ob){
         try{
            Connection con=myConnection.getConnection();
            String sql="update receptionist set name=?,address=?,gender=?,age=?,contact=?,marital=?,joiningdate=?,username=?,password=? where id=?";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
            st.setString(2,ob.getAddress());
            st.setString(3,ob.getGender());
            st.setString(4,ob.getAge());
            st.setString(5,ob.getContact());
            st.setString(6,ob.getMarital());
            st.setString(7,ob.getJoiningdate());
            st.setString(8,ob.getUsername());
            st.setString(9,ob.getPassword());
            st.setInt(10,ob.getId());
            st.execute();
            con.close();
            JOptionPane.showMessageDialog(null,"Record Update Sucessfully!!!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
         
         public void deleteRecord(ReceptionistForm ob){
         try{
            Connection con=myConnection.getConnection();
            String sql="delete from receptionist where id=?";
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
