/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patientsBA.view;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.patientsBA.controller.PatientFormDAO;
import org.patientsBA.controller.ReceptionistFormDAO;
import org.patientsBA.model.PatientForm;
import org.patientsBA.model.ReceptionistForm;
import static org.patientsBA.view.ReceptionistFormFrame.currentUserId;

/**
 *
 * @author acer
 */
public class PatientFormFrame extends javax.swing.JInternalFrame {

    public static int currentuserid;
    DefaultTableModel model;
    /**
    /**
     * Creates new form ReceptionistPatientForm
     */
    public PatientFormFrame() {
        initComponents();
        model = new DefaultTableModel(null, new String[]{"Id","Name","Address","Gender","Age","Contact","Marital","Registerdate"});
        jTable_Patient.setModel(model);
    }

        public void loadData(){
        clearModel();
        PatientFormDAO pDAO=new PatientFormDAO();
        ArrayList<PatientForm> pList=pDAO.fetchData();
        for(int i=0;i<pList.size();i++){
        model.addRow(new Object[]{pList.get(i).getId(),pList.get(i).getName(),pList.get(i).getAddress(),pList.get(i).getGender(),pList.get(i).getAge()
        ,pList.get(i).getContact(),pList.get(i).getMarital(),pList.get(i).getRegisterdate()});
    }
    }
        
         public void clearModel(){
        int count=model.getRowCount();
        for(int i=0;i<count;i++){
            model.removeRow(0);
        }
    }
         public void clear(){
        jTextField_Id.setText("");
        jTextField_Name.setText("");
        jTextField_Address.setText("");
        //jTextField_Address.setText("");gender
        genderbuttonGroup.clearSelection();
        jTextField_Age.setText("");
        jTextField_Contact.setText("");
        maritalbuttonGroup.clearSelection();
        jDateChooser.setDate(null);
        //jTextArea_Disease.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderbuttonGroup = new javax.swing.ButtonGroup();
        maritalbuttonGroup = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Contact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton_Save = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Patient = new javax.swing.JTable();
        jButton_Show = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jRadioButton_Married = new javax.swing.JRadioButton();
        jRadioButton_Unmarried = new javax.swing.JRadioButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jButton_Clear = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Patient Form");

        jLabel3.setText("Id");

        jTextField_Id.setEditable(false);
        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jLabel7.setText("Address");

        jTextField_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AddressActionPerformed(evt);
            }
        });

        jLabel1.setText("Gender");

        genderbuttonGroup.add(jRadioButton_Male);
        jRadioButton_Male.setText("Male");
        jRadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleActionPerformed(evt);
            }
        });

        genderbuttonGroup.add(jRadioButton_Female);
        jRadioButton_Female.setText("Female");
        jRadioButton_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FemaleActionPerformed(evt);
            }
        });

        jLabel8.setText("Age");

        jTextField_Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_AgeKeyPressed(evt);
            }
        });

        jLabel5.setText("Contact");

        jTextField_Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ContactActionPerformed(evt);
            }
        });
        jTextField_Contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ContactKeyPressed(evt);
            }
        });

        jLabel10.setText("Marital Status");

        jButton_Save.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\Java Project Picture\\adduser.png")); // NOI18N
        jButton_Save.setText("Save");
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        jButton_Update.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\Java Project Picture\\UPDATESMALL.png")); // NOI18N
        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\Java Project Picture\\DELETESMALL.png")); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jTable_Patient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_Patient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_PatientMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Patient);

        jButton_Show.setText("Show");
        jButton_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ShowActionPerformed(evt);
            }
        });

        jLabel9.setText("Register Date");

        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyReleased(evt);
            }
        });

        maritalbuttonGroup.add(jRadioButton_Married);
        jRadioButton_Married.setText("Married");
        jRadioButton_Married.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MarriedActionPerformed(evt);
            }
        });

        maritalbuttonGroup.add(jRadioButton_Unmarried);
        jRadioButton_Unmarried.setText("Unmarried");
        jRadioButton_Unmarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_UnmarriedActionPerformed(evt);
            }
        });

        jDateChooser.setDateFormatString("yyyy-MM-d");

        jButton_Clear.setText("Clear");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel1)
                        .addComponent(jLabel8)
                        .addComponent(jLabel5)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Save)
                        .addGap(51, 51, 51)
                        .addComponent(jButton_Update)
                        .addGap(51, 51, 51)
                        .addComponent(jButton_Delete)
                        .addGap(48, 48, 48)
                        .addComponent(jButton_Clear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_Married)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_Unmarried)))
                        .addGap(406, 406, 406)
                        .addComponent(jButton_Show))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_Male)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_Female))
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_Male)
                            .addComponent(jRadioButton_Female)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton_Show))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton_Unmarried, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton_Married, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Save)
                    .addComponent(jButton_Update)
                    .addComponent(jButton_Delete)
                    .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jTextField_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AddressActionPerformed

    private void jTextField_ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ContactActionPerformed

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
        // TODO add your handling code here:
        if(jTextField_Id.getText().equals("")==false){
            JOptionPane.showMessageDialog(null,"Please clear all fields first");
            return;
        }
        String name=jTextField_Name.getText().trim();
        String address=jTextField_Address.getText().trim();
//        jRadioButton_Male.setActionCommand("Male");
//        jRadioButton_Female.setActionCommand("Female");
//        String gender=genderbuttonGroup.getSelection().getActionCommand();
        String gender="";
        if(jRadioButton_Male.isSelected()){
             gender="Male";
        }
        else if(jRadioButton_Female.isSelected()){
             gender="Female";
        }
        String age=jTextField_Age.getText().trim();
        String contact=jTextField_Contact.getText().trim();
//        jRadioButton_Married.setActionCommand("Married");
//        jRadioButton_Unmarried.setActionCommand("Unmarried");
//        String marital=maritalbuttonGroup.getSelection().getActionCommand();
        String marital="";
        if(jRadioButton_Married.isSelected()){
             marital="Married";
        }
        else if(jRadioButton_Unmarried.isSelected()){
             marital="Unmarried";
        }
        String rdate=((JTextField)jDateChooser.getDateEditor().getUiComponent()).getText().trim();
        //String disease=jTextArea_Disease.getText().trim();
       
        if(name.equals("") || address.equals("") || gender.equals("") || age.equals("") || contact.equals("") || marital.equals("") || rdate.equals("")){
      
        JOptionPane.showMessageDialog(null,"One or more fields are empty");
        }
        
        else{
        //set these value into model class "ReceptionistFormFrame" object
        PatientForm ob=new PatientForm();
        ob.setName(name);
        ob.setAddress(address);
        ob.setGender(gender);
        ob.setAge(age);
        ob.setContact(contact);
        ob.setMarital(marital);
        ob.setRegisterdate(rdate);
        //ob.setDisease(disease);
//        ob.setUserid(currentuserid);
        //Hand over this model object to controller class
        PatientFormDAO pDAO=new PatientFormDAO();
        pDAO.saveData(ob);
        loadData();
        clear();
        }
    }//GEN-LAST:event_jButton_SaveActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        if(jTextField_Id.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please select one record for update");
            return;
        }
         int id=Integer.parseInt(jTextField_Id.getText());
        String name=jTextField_Name.getText();
        String address=jTextField_Address.getText();
        jRadioButton_Male.setActionCommand("Male");
        jRadioButton_Female.setActionCommand("Female");
        String gender=genderbuttonGroup.getSelection().getActionCommand();
        String age=jTextField_Age.getText();
        String contact=jTextField_Contact.getText();
        jRadioButton_Married.setActionCommand("Married");
        jRadioButton_Unmarried.setActionCommand("Unmarried");
        String marital=maritalbuttonGroup.getSelection().getActionCommand();
        String rdate=((JTextField)jDateChooser.getDateEditor().getUiComponent()).getText();
        //String disease=jTextArea_Disease.getText();
        
        PatientForm ob=new PatientForm();
        ob.setId(id);
        ob.setName(name);
        ob.setAddress(address);
        ob.setGender(gender);
        ob.setAge(age);
        ob.setContact(contact);
        ob.setMarital(marital);
        ob.setRegisterdate(rdate);
        //ob.setDisease(disease);
//        ob.setUserid(currentuserid);
        
        PatientFormDAO pDAO=new PatientFormDAO();
        pDAO.updateRecord(ob);
        loadData();
        clear();
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        if(jTextField_Id.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please select one record for delete");
            return;
        }
       int id=Integer.parseInt(jTextField_Id.getText());
       PatientForm ob=new PatientForm();
       ob.setId(id);
       PatientFormDAO pDAO=new PatientFormDAO();
       pDAO.deleteRecord(ob);
       loadData();
       clear();
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jTable_PatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_PatientMouseClicked
        // TODO add your handling code here:
        int row=jTable_Patient.getSelectedRow();
               jTextField_Id.setText(jTable_Patient.getValueAt(row,0).toString());
                jTextField_Name.setText(jTable_Patient.getValueAt(row,1).toString());
                jTextField_Address.setText(jTable_Patient.getValueAt(row,2).toString());
                String gender=jTable_Patient.getValueAt(row,3).toString();
                if(gender.equals("Male")){
                    jRadioButton_Male.setSelected(true);
                }
                else{
                     jRadioButton_Female.setSelected(true);
                }
                jTextField_Age.setText(jTable_Patient.getValueAt(row,4).toString());
               jTextField_Contact.setText(jTable_Patient.getValueAt(row,5).toString());
               String marital=jTable_Patient.getValueAt(row,6).toString();
                 if(marital.equals("Married")){
                   jRadioButton_Married.setSelected(true);
                }
                else{
                     jRadioButton_Unmarried.setSelected(true);
                }
                 try{
                   int srow=jTable_Patient.getSelectedRow();
                   Date date= new SimpleDateFormat("yyyy-MM-dd").parse((String)jTable_Patient.getValueAt(row,7));
                   jDateChooser.setDate(date);
                 }
                 catch(Exception e){
                     System.out.println(e);
                 }
                 //jTextArea_Disease.setText(jTable_Patient.getValueAt(row,8).toString());
                 
//                 boolean a= jTable_Patient.isEditing();
//                 if(a==false){
//                     JOptionPane.showMessageDialog(null,"You cannot edit information from Table row!!");
//                 }

    }//GEN-LAST:event_jTable_PatientMouseClicked

    private void jButton_ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ShowActionPerformed
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_jButton_ShowActionPerformed

    private void jRadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MaleActionPerformed

    private void jRadioButton_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_FemaleActionPerformed

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jTextField_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)jTable_Patient.getModel();
        String search=jTextField_Search.getText();
        TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(table);
        jTable_Patient.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField_SearchKeyReleased

    private void jRadioButton_MarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MarriedActionPerformed

    private void jRadioButton_UnmarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_UnmarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_UnmarriedActionPerformed

    private void jTextField_ContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ContactKeyPressed
        // TODO add your handling code here:
        String contact=jTextField_Contact.getText();
        int length=contact.length();
        char c= evt.getKeyChar();
        //check for number 0 to 9
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 10 digit
            if(length<10){
                jTextField_Contact.setEditable(true);
            }
            else{
                jTextField_Contact.setEditable(false);
            }
        }
        else{
            //not allows key backsapce and delete for edit
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                jTextField_Contact.setEditable(true);
            }
            else{
                jTextField_Contact.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextField_ContactKeyPressed

    private void jTextField_AgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_AgeKeyPressed
        // TODO add your handling code here:
        String age=jTextField_Age.getText();
        int length=age.length();
        char c= evt.getKeyChar();
        //check for number 0 to 9
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 3 digit
            if(length<3){
                jTextField_Age.setEditable(true);
            }
            else{
                jTextField_Age.setEditable(false);
            }
        }
        else{
            //not allows key backsapce and delete for edit
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                jTextField_Age.setEditable(true);
            }
            else{
                jTextField_Age.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextField_AgeKeyPressed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton_ClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup genderbuttonGroup;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JButton jButton_Show;
    private javax.swing.JButton jButton_Update;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JRadioButton jRadioButton_Married;
    private javax.swing.JRadioButton jRadioButton_Unmarried;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Patient;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Age;
    private javax.swing.JTextField jTextField_Contact;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.ButtonGroup maritalbuttonGroup;
    // End of variables declaration//GEN-END:variables
}