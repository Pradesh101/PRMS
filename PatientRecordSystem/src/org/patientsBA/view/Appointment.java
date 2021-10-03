/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patientsBA.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.patientsBA.util.myConnection;

/**
 *
 * @author acer
 */
public class Appointment extends javax.swing.JInternalFrame {

    PreparedStatement ps = null;
    ResultSet rs = null;
    public static int id;
    AdminMainFrame amf;
    DoctorMainFrame dmf;
    ReceptionistMainFrame rmf;
    /**
     * Creates new form Appointment
     */
     DefaultTableModel defaultTableModel = new DefaultTableModel();
    public Appointment() {
        initComponents();
        Object columns[] = {"Id", "Doctor Name","Patient Name", "Fee", "Appointment-Date", "Time", "Status"};
        defaultTableModel.setColumnIdentifiers(columns);
        jTable_App.setModel(defaultTableModel);
    }
    
        public void getAMF(AdminMainFrame amf){
        this.amf=amf;
    }
       
        public void getDMF(DoctorMainFrame dmf){
        this.dmf=dmf;
    }
             
    public void getRMF(ReceptionistMainFrame rmf){
        this.rmf=rmf;
    }

    public void clear(){
        jTextField_Id.setText("");
        jTextField_D.setText("");
        jTextField_P.setText("");
        jDateChooser.setDate(null);
        jTextField_Fee.setText("");
        jTextField_Time.setText("");
        buttonGroup1.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jTextField_Time = new javax.swing.JTextField();
        jRadioButton_On = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_App = new javax.swing.JTable();
        jRadioButton_Off = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_D = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_P = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton_Show = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton_Pres = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Fee = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Appointment");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Appointment Details");

        jDateChooser.setDateFormatString("yyyy-MM-dd");

        jTextField_Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TimeActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_On);
        jRadioButton_On.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButton_On.setText("On");
        jRadioButton_On.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_OnActionPerformed(evt);
            }
        });

        jTable_App.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_App.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_App.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AppMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_App);

        buttonGroup1.add(jRadioButton_Off);
        jRadioButton_Off.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButton_Off.setText("Off");
        jRadioButton_Off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_OffActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Doctor Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Patient Name");

        jTextField_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Register Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Time");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Status");

        jButton_Show.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_Show.setText("Show");
        jButton_Show.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ShowActionPerformed(evt);
            }
        });

        jButton_Clear.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_Clear.setText("Clear");
        jButton_Clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jButton_Delete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Update.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_Update.setText("Update");
        jButton_Update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Add.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_Add.setText("Create ");
        jButton_Add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Create Appointment here: ");

        jButton_Pres.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_Pres.setText("Prescription");
        jButton_Pres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Pres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PresActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Fee");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Search");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(381, 381, 381))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277)
                        .addComponent(jButton_Pres, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton_Show, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_P, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jTextField_D, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jTextField_Fee))
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_On)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_Off))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(44, 44, 44)
                        .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_On)
                            .addComponent(jRadioButton_Off)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Show, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Pres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_OnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_OnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_OnActionPerformed

    private void jRadioButton_OffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_OffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_OffActionPerformed

    private void jTextField_TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TimeActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        if(jTextField_Id.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please select one record for update");
            return;
        }
        int id = Integer.parseInt(jTextField_Id.getText());
        String dname = jTextField_D.getText();
        String pname = jTextField_P.getText();
        int fee = Integer.parseInt(jTextField_Fee.getText());
        String jdate = ((JTextField) jDateChooser.getDateEditor().getUiComponent()).getText();
        String time = jTextField_Time.getText();
        jRadioButton_On.setActionCommand("On");
        jRadioButton_Off.setActionCommand("Off");
        String status = buttonGroup1.getSelection().getActionCommand();
        Connection con=myConnection.getConnection();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String sql = "update appointment set doctorName=?, patientName=?,fee=?, appointmentDate=?, time=?, status=? where id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dname);
            ps.setString(2, pname);
            ps.setInt(3, fee);
            ps.setString(4, jdate);
            ps.setString(5, time);
            ps.setString(6, status);
            ps.setInt(7, id);
            ps.execute();
            con.close();
            clear();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ShowActionPerformed
        // TODO add your handling code here:
        Connection con=myConnection.getConnection();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        if(amf !=null || rmf!= null){
            String sql = "select id,doctorName,patientName,fee,appointmentDate,time,status from appointment";
        try {
            ps = con.prepareStatement(sql);
            //ps.setInt(1,id);
            rs = ps.executeQuery();
            Object columnData[] = new Object[7];
            while (rs.next()) {
                columnData[0] = rs.getInt("id");
                columnData[1] = rs.getString("doctorName");
                columnData[2] = rs.getString("patientName");
                columnData[3] = rs.getString("fee");
                columnData[4] = rs.getString("appointmentDate");
                columnData[5] = rs.getString("time");
                columnData[6] = rs.getString("status");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        String sql = "select id,doctorName,patientName,fee,appointmentDate,time,status from appointment where d_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            Object columnData[] = new Object[7];
            while (rs.next()) {
                columnData[0] = rs.getInt("id");
                columnData[1] = rs.getString("doctorName");
                columnData[2] = rs.getString("patientName");
                columnData[3] = rs.getString("fee");
                columnData[4] = rs.getString("appointmentDate");
                columnData[5] = rs.getString("time");
                columnData[6] = rs.getString("status");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_ShowActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jTable_AppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AppMouseClicked
        // TODO add your handling code here:
        int row = jTable_App.getSelectedRow();
        jTextField_Id.setText(jTable_App.getValueAt(row, 0).toString());
        jTextField_D.setText(jTable_App.getValueAt(row, 1).toString());
        jTextField_P.setText(jTable_App.getValueAt(row, 2).toString());
        jTextField_Fee.setText(jTable_App.getValueAt(row, 3).toString());
        try {
            //int srow = jTable_App.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) jTable_App.getValueAt(row, 4));
            jDateChooser.setDate(date);
        } catch (Exception e) {
            System.out.println(e);
        }
        jTextField_Time.setText(jTable_App.getValueAt(row, 5).toString());
        String status = jTable_App.getValueAt(row, 6).toString();
        if (status.equals("On")) {
            jRadioButton_On.setSelected(true);
        } else {
            jRadioButton_Off.setSelected(true);
        }
    }//GEN-LAST:event_jTable_AppMouseClicked

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        if(jTextField_Id.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please select one record for delete");
            return;
        }
        int id = Integer.parseInt(jTextField_Id.getText());
        Connection con=myConnection.getConnection();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String sql = "delete from appointment where id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
        clear();
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        // TODO add your handling code here:
        if(dmf !=null){
            JOptionPane.showMessageDialog(null,"Doctor cannot create any Appointment");
            return;
        }
        ChooseDoctor cd = new ChooseDoctor();
        if(amf !=null){
        amf.jDesktopPane1.add(cd);
        cd.getAPPMF(this);
        }
        else{
        rmf.jDesktopPane1.add(cd);
        cd.getAPPRMF(this); 
        }
        cd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_PresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PresActionPerformed
        // TODO add your handling code here:
        if(amf !=null || rmf!= null){
            JOptionPane.showMessageDialog(null,"Only doctor can create prescrption");
            return;
        }
        int row = jTable_App.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null,"Please select any one record !!!!!");
            return;
        }
         Connection con=myConnection.getConnection();
         String id = (jTable_App.getValueAt(row, 0).toString().trim());
         String sql="select id,p_id,d_id from appointment where id= ?";
         try{
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            rs = ps.executeQuery();
            if(rs.next()){
            int p_id=rs.getInt("p_id");
            int d_id=rs.getInt("d_id");
            Prescriptions.appid=rs.getInt("id");
            Prescriptions.dappid=d_id;
            System.out.println(p_id);
            try{
                String sql1="select name, contact, gender, age from patient where id= ?";
                try{
                ps = con.prepareStatement(sql1);
                ps.setInt(1,p_id);
                rs = ps.executeQuery();
                if(rs.next()){
                    Prescriptions.name=rs.getString("name");
                    Prescriptions.age=rs.getInt("age");
                    //Prescriptions.gender=rs.getBoolean("gender");
                    Prescriptions.contact=rs.getLong("contact");
                }
                }
                catch(Exception e){
                  System.out.println(e);
                }
            }
            catch(Exception e){
             System.out.println(e);
         }
         }
         }
         catch(Exception e){
             System.out.println(e);
         }
                 Prescriptions pres= new Prescriptions();
        if(dmf !=null){
        dmf.jDesktopPane1.add(pres);
        pres.getAPPMF(this);
        }
        pres.setVisible(true);
        this.dispose();
//        Prescriptions pres= new Prescriptions();
//        if(dmf !=null){
//        dmf.jDesktopPane1.add(pres);
//        pres.getAPPMF(this);
//        }
//        pres.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jButton_PresActionPerformed

    private void jTextField_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PActionPerformed

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jTextField_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyReleased
        // TODO add your handling code here:
        
                DefaultTableModel table = (DefaultTableModel) jTable_App.getModel();
        String search = jTextField_Search.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTable_App.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField_SearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Pres;
    private javax.swing.JButton jButton_Show;
    private javax.swing.JButton jButton_Update;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton_Off;
    private javax.swing.JRadioButton jRadioButton_On;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_App;
    private javax.swing.JTextField jTextField_D;
    private javax.swing.JTextField jTextField_Fee;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_P;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_Time;
    // End of variables declaration//GEN-END:variables
}
