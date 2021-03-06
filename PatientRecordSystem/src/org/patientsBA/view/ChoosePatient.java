/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patientsBA.view;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.patientsBA.util.myConnection;

/**
 *
 * @author acer
 */
public class ChoosePatient extends javax.swing.JInternalFrame {
    
    ResultSet rs = null;
    PreparedStatement ps = null;
    public static String id;
    public int pid;
    int searchKey;
    public static String dName;
    DefaultTableModel defaultTableModel = new DefaultTableModel();
//    ChooseDoctor camf;
    /**
     * Creates new form ChoosePatient
     */
    public ChoosePatient() {
        initComponents();
        Object columns[] = {"Id", "Name", "Address", "Gender", "Age", "Contact", "Marital", "Register Date"};
        defaultTableModel.setColumnIdentifiers(columns);
        jTable_P.setModel(defaultTableModel);
    }

//    public void getCAMF(ChooseDoctor camf){
//        this.camf=camf;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        SearchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_P = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton_Search = new javax.swing.JButton();
        jButton_Next = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jTextField_Time = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton_On = new javax.swing.JRadioButton();
        jRadioButton_Off = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Fee = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        SearchField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });
        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchFieldKeyPressed(evt);
            }
        });

        jTable_P.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_P);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Id of the patient");

        jButton_Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Search.setText("Search");
        jButton_Search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jButton_Next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Next.setText("Next");
        jButton_Next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Date");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Time");

        jDateChooser.setDateFormatString("yyyy-MM-dd");

        jTextField_Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TimeActionPerformed(evt);
            }
        });
        jTextField_Time.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TimeKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Status");

        buttonGroup1.add(jRadioButton_On);
        jRadioButton_On.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton_On.setText("On");
        jRadioButton_On.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_OnActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_Off);
        jRadioButton_Off.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton_Off.setText("Off");
        jRadioButton_Off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_OffActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Fee");

        jTextField_Fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FeeActionPerformed(evt);
            }
        });
        jTextField_Fee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_FeeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_FeeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton_On)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton_Off))
                                            .addComponent(jTextField_Fee, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(jButton_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_Fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_On)
                            .addComponent(jRadioButton_Off))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void SearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldKeyPressed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        // TODO add your handling code here:
        Connection con = myConnection.getConnection();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        if(SearchField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please insert patient id !!!!!");
            return;
        }
        int searchKey = Integer.parseInt(SearchField.getText());
        String sql = "select id,name,address,gender,age,contact,marital,registerdate from patient where id = ?";
        try {       
            ps = con.prepareStatement(sql);
            ps.setInt(1,searchKey);
            rs = ps.executeQuery();
            
            Object columnData[] = new Object[8];
            while (rs.next()) {
                columnData[0] = rs.getInt("id");
                columnData[1] = rs.getString("name");
                columnData[2] = rs.getString("address");
                columnData[3] = rs.getString("gender");
                columnData[4] = rs.getInt("age");
                columnData[5] = rs.getString("contact");
                columnData[6] = rs.getString("marital");
                columnData[7] = rs.getString("registerdate");
                pid=rs.getInt("id");
                defaultTableModel.addRow(columnData);
            }
            if(searchKey!=pid){
                JOptionPane.showMessageDialog(null, "Patient ID isnot available");
            }
            }
         catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jButton_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextActionPerformed
        // TODO add your handling code here:
        int row = jTable_P.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null,"Please select any one record !!!!!");
            return;
        }
        
        if(jDateChooser.getDate()==null || jTextField_Time.getText().equals("")){
            JOptionPane.showMessageDialog(null,"One or more fields are empty !!!!!");
            return;
        }
                
       String status="";
        if(jRadioButton_On.isSelected()){
             status="On";
        }
        else if(jRadioButton_Off.isSelected()){
             status="Off";
        }
        if(status.equals("")){
            JOptionPane.showMessageDialog(null,"One or more fields are empty !!!!!");
            return;
        }

        try{
            Integer.parseInt(jTextField_Fee.getText());
            }
        catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Fee must be number!!!");
                }
//        if(!Character.isDigit(jTextField_Fee)){
//            JOptionPane.showMessageDialog(null,"Fee must be number!!!");
//            return;
//        }
        String pname = (jTable_P.getValueAt(row, 1).toString().trim());
        String rdate=((JTextField)jDateChooser.getDateEditor().getUiComponent()).getText();
        Date currentDate=new Date();
        //System.out.println(currentDate);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(currentDate);
        int fee = Integer.parseInt(jTextField_Fee.getText());
        String time = jTextField_Time.getText().trim();
        //int fee= jTextField_Fee.getText().trim();
//        jRadioButton_On.setActionCommand("On");
//        jRadioButton_Off.setActionCommand("Off");
//        String status = buttonGroup1.getSelection().getActionCommand();

        if((rdate.compareTo(date)<0)){
            JOptionPane.showMessageDialog(null,"Your date is not valid!!!");
        }    
        
        else if((rdate.compareTo(date)>0)){
            JOptionPane.showMessageDialog(null,"Your date is not valid!!!");
        }

        else if(fee!=0){
           System.out.println("Fee is not empty");
       try{
            boolean flag = false;
            int searchKey = Integer.parseInt(SearchField.getText());
            String docid=String.valueOf(id);
            Connection con=myConnection.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            String queryTwo = "select status,time,d_id,p_id from appointment";
            ps = con.prepareStatement(queryTwo);
            rs = ps.executeQuery();
            while (rs.next()) {
                String sta = rs.getString("status");
                String d = rs.getString("d_id");
                int p = rs.getInt("p_id");
                String dbtime=rs.getString("time");
//                System.out.println(rs.getString("status"));
//                System.out.println(rs.getString("d_id"));
//                System.out.println(rs.getString("p_id"));
//                System.out.println("-------");
                if (sta.equals("On")) {
                    if(d.equals(docid)){
                        if(p==pid){
                        JOptionPane.showMessageDialog(null,"Sorry!! Your appointment is set previously");
                        //pNumber.remove(phoneNumber);
                        //System.out.println(pNumber);
                        flag = true;
                        return;
                    }
                    }
                }
                if(time.equals(dbtime)){
                    JOptionPane.showMessageDialog(null,"Sorry!! This time slot is not available");
                    return;
                }
            }
            try {
//        Connection con = myConnection.getConnection();
            String sql = "insert into appointment(doctorName,patientName,fee,appointmentDate,time,status,d_id,p_id) values (?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, dName);
            ps.setString(2, pname);
            ps.setInt(3, fee);
            ps.setString(4, rdate);
            ps.setString(5, time);
            ps.setString(6, status);
            ps.setString(7, id);
            ps.setInt(8, pid);
            ps.execute();
            JOptionPane.showMessageDialog(null, "PATIENT " + pname + " Appointmented with DOCTOR " + dName + " at " + time + " in " + rdate);
//            Appointment app= new Appointment();
//            app.id=id;
//            app.setVisible(true);
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Appointment is already set");
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(DoctorFormFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
       }
        //System.out.println(dName + "." + pname + "." + rdate + "." + time);

    }//GEN-LAST:event_jButton_NextActionPerformed

    private void jRadioButton_OnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_OnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_OnActionPerformed

    private void jRadioButton_OffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_OffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_OffActionPerformed

    private void jTextField_TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TimeActionPerformed

    private void jTextField_FeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FeeActionPerformed

    private void jTextField_FeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FeeKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_PERIOD) || (c==KeyEvent.VK_BACK_SPACE) || Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_FeeKeyTyped

    private void jTextField_TimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TimeKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_PERIOD) || (c==KeyEvent.VK_BACK_SPACE) || Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_TimeKeyTyped

    private void jTextField_FeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FeeKeyPressed
        // TODO add your handling code here:
                String fee = jTextField_Fee.getText();
        int length = fee.length();
        char c = evt.getKeyChar();
        //check for number 0 to 9
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            //check for length not more than 2 digit
            if (length < 5) {
                jTextField_Fee.setEditable(true);
            } else {
                jTextField_Fee.setEditable(false);
            }
        } else {
            //not allows key backsapce and delete for edit
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                jTextField_Fee.setEditable(true);
            } else {
                jTextField_Fee.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextField_FeeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Next;
    private javax.swing.JButton jButton_Search;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton_Off;
    private javax.swing.JRadioButton jRadioButton_On;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_P;
    private javax.swing.JTextField jTextField_Fee;
    private javax.swing.JTextField jTextField_Time;
    // End of variables declaration//GEN-END:variables

    void getCAMF(AdminMainFrame amf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
