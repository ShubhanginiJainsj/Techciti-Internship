/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package techciti;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author jains
 */
public class Register extends javax.swing.JFrame {

     Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    /** Creates new form Register */
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        conn = MyConnection.getConnection();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldemail = new javax.swing.JTextField();
        jTextFieldfullname = new javax.swing.JTextField();
        jTextFieldphoneno = new javax.swing.JTextField();
        jTextFielduname = new javax.swing.JTextField();
        jPasswordFieldpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxdesigndesign = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register Page");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("-");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 214, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(91, 91, 91)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel2)
                    .add(jLabel3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(72, 61, 139));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Full Name :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Designation :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone No :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("E-mail Id :");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password :");

        jTextFieldemail.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldemail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldemailActionPerformed(evt);
            }
        });

        jTextFieldfullname.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldfullname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfullnameActionPerformed(evt);
            }
        });

        jTextFieldphoneno.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldphoneno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldphoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldphonenoActionPerformed(evt);
            }
        });

        jTextFielduname.setBackground(new java.awt.Color(204, 204, 204));
        jTextFielduname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFielduname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldunameActionPerformed(evt);
            }
        });

        jPasswordFieldpass.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldpass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Already have an account? LogIn");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jComboBoxdesigndesign.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxdesigndesign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "HR" }));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(107, 107, 107)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jTextFieldemail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jTextFieldfullname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jTextFielduname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jTextFieldphoneno, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .add(jPasswordFieldpass)))))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(96, 96, 96)
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jComboBoxdesigndesign, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(188, 188, 188))
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(199, 199, 199)
                        .add(jButton1))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(153, 153, 153)
                        .add(jLabel10)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(52, 52, 52)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldfullname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBoxdesigndesign))
                .add(14, 14, 14)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFielduname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextFieldphoneno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPasswordFieldpass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jTextFieldemail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 543, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldemailActionPerformed

    private void jTextFieldfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldfullnameActionPerformed

    private void jTextFieldphonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldphonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldphonenoActionPerformed

    private void jTextFieldunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldunameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
               
            }
        });    
           this.dispose();// TODO        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
          System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
            int p = JOptionPane.showConfirmDialog(null, "Are you sure to add this record?", "Add Record", JOptionPane.YES_NO_OPTION);
            if (p == 0){
            String sql = "INSERT INTO `user`(`uname`, `pass`, `Fname`, `Designation`, `email`, `phoneno`) VALUES (?,?,?,?,?,?)";
               
             try
              {
               ps = conn.prepareStatement(sql);
               ps.setString(1,jTextFielduname.getText());
               ps.setString(2,String.valueOf(jPasswordFieldpass.getPassword()));
               ps.setString(3,jTextFieldfullname.getText());
               ps.setString(4,(String)jComboBoxdesigndesign.getSelectedItem());
               ps.setString(5,jTextFieldemail.getText());
               ps.setString(6,jTextFieldphoneno.getText());
               ps.execute();
                JOptionPane.showMessageDialog(null,"Registration Successful");
                 Loginpage lp = new Loginpage();
                 lp.setVisible(true);
                 this.dispose();
               
            }
           catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, ex);  
                  }   
             }
             else
             {
             JOptionPane.showMessageDialog(null,"Registration failed"); 
             }
    }//GEN-LAST:event_jButton1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxdesigndesign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldpass;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldfullname;
    private javax.swing.JTextField jTextFieldphoneno;
    private javax.swing.JTextField jTextFielduname;
    // End of variables declaration//GEN-END:variables

}
