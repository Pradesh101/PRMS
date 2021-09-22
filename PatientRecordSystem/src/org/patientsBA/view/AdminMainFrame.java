/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patientsBA.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Raj Cassette
 */
public class AdminMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form PatientMainFrame
     */
    public AdminMainFrame() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
        Toolkit tk=getToolkit();
        //Dimension size=tk.getScreenSize();
        int xsize= (int) tk.getScreenSize().getWidth();
        int ysize= (int) tk.getScreenSize().getHeight();
        //jDesktopPane1.setSize(size.width,size.height);
        this.setSize(xsize,ysize);
        jDesktopPane1.setSize(xsize,ysize);
//        jPanel1.setSize(xsize,ysize);
//        jLabel1.setSize(xsize,ysize);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Doctor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_Receptionist = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Patient = new javax.swing.JLabel();
        jLabel_Appointment = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_User = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel_Logout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1264, 573));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\Java Project Picture\\RECETIONISTDETAILS.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 50, 150, 160);

        jLabel_Doctor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Doctor.setText("Doctor");
        jLabel_Doctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DoctorMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Doctor);
        jLabel_Doctor.setBounds(360, 480, 80, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\Java Project Picture\\EMPLOYEESDETAILS.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 330, 150, 140);

        jLabel_Receptionist.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Receptionist.setText("Receptionist");
        jLabel_Receptionist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Receptionist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ReceptionistMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Receptionist);
        jLabel_Receptionist.setBounds(330, 220, 130, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\Java Project Picture\\patientdetals.png")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(680, 70, 150, 140);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\Java Project Picture\\checkup.png")); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel7.setMinimumSize(new java.awt.Dimension(150, 150));
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(690, 340, 150, 120);

        jLabel_Patient.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Patient.setText("Patient");
        jLabel_Patient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PatientMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Patient);
        jLabel_Patient.setBounds(720, 220, 80, 28);

        jLabel_Appointment.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Appointment.setText("Appointment");
        jLabel_Appointment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AppointmentMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Appointment);
        jLabel_Appointment.setBounds(700, 470, 140, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Username:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1010, 110, 111, 28);

        jLabel_User.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_User.setText("Admin");
        jPanel1.add(jLabel_User);
        jLabel_User.setBounds(1130, 110, 160, 28);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Role:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1010, 140, 60, 28);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("Admin");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1070, 140, 70, 28);

        jLabel_Logout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_Logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\Java Project Picture\\LOGOUT (2).png")); // NOI18N
        jLabel_Logout.setText("Logout");
        jLabel_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LogoutMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Logout);
        jLabel_Logout.setBounds(1120, 40, 80, 30);

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Documents\\NetBeansProjects\\Java Project Picture\\appointment.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 1270, 590);

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_ReceptionistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReceptionistMouseClicked

        ReceptionistFormFrame rf= new ReceptionistFormFrame();
        jDesktopPane1.add(rf);
        rf.setVisible(true);

    }//GEN-LAST:event_jLabel_ReceptionistMouseClicked

    private void jLabel_PatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PatientMouseClicked
        // TODO add your handling code here:
        PatientFormFrame pf= new PatientFormFrame();
        jDesktopPane1.add(pf);
        pf.setVisible(true);
    }//GEN-LAST:event_jLabel_PatientMouseClicked

    private void jLabel_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LogoutMouseClicked
        // TODO add your handling code here:
        AdminLoginForm af= new AdminLoginForm();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_LogoutMouseClicked

    private void jLabel_DoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DoctorMouseClicked
        // TODO add your handling code here:
        DoctorFormFrame df= new DoctorFormFrame();
        jDesktopPane1.add(df);
        df.setVisible(true);
    }//GEN-LAST:event_jLabel_DoctorMouseClicked

    private void jLabel_AppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AppointmentMouseClicked
        // TODO add your handling code here:
        Appointment app= new Appointment();
        jDesktopPane1.add(app);
        app.getAMF(this);
        app.setVisible(true);
//        ChooseDoctor cd = new ChooseDoctor();
//        jDesktopPane1.add(cd);
//        cd.getAMF(this);
//        cd.setVisible(true);
    }//GEN-LAST:event_jLabel_AppointmentMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Appointment;
    private javax.swing.JLabel jLabel_Doctor;
    private javax.swing.JLabel jLabel_Logout;
    private javax.swing.JLabel jLabel_Patient;
    private javax.swing.JLabel jLabel_Receptionist;
    public javax.swing.JLabel jLabel_User;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
