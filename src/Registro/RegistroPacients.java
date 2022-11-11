package Registro;

import java.sql.*;
import javax.swing.JOptionPane;

public class RegistroPacients extends javax.swing.JFrame {

    /**
     * Creates new form Ventana2
     */
    public RegistroPacients() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_id1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_run1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_dv1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_names1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_father1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_mother1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_gender1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_date1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_observation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_buscar1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        label_status1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id:");

        txt_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id1ActionPerformed(evt);
            }
        });

        jLabel2.setText("run:");

        txt_run1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_run1ActionPerformed(evt);
            }
        });

        jLabel3.setText("dv:");

        jLabel4.setText("Names:");

        jLabel5.setText("Father_name:");

        jLabel6.setText("Mother_name:");

        jLabel7.setText("Gender:");

        jLabel9.setText("Date_of_birth:");

        jLabel10.setText("Obsevations:");

        txt_observation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_observationActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText("Ingrese la id de la persona que desea buscar:");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        label_status1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_names1, javax.swing.GroupLayout.PREFERRED_SIZE, 187,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_father1, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(txt_id1,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 1,
                                                                        Short.MAX_VALUE)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                        layout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(jLabel1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        24,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                29,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(142, 142, 142)
                                                                        .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(txt_run1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                151,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txt_dv1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                84,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(162, 162, 162)
                                                        .addComponent(jLabel5))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(107, 107, 107)
                                                        .addComponent(jLabel7))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(77, 77, 77)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txt_mother1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 160,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txt_gender1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 135,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(119, 119, 119)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_observation, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel11)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txt_buscar1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 71,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jButton4)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(222, 222, 222)
                                                                .addComponent(jLabel12,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 210,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label_status1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_id1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_run1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_dv1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_names1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_father1, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_mother1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_gender1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_date1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_observation, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(txt_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_status1)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_id1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_id1ActionPerformed

    private void txt_run1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_run1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_run1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/surveys", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into pacients values(?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, txt_id1.getText().trim());
            pst.setString(2, txt_run1.getText().trim());
            pst.setString(3, txt_dv1.getText().trim());
            pst.setString(4, txt_names1.getText().trim());
            pst.setString(5, txt_father1.getText().trim());
            pst.setString(6, txt_mother1.getText().trim());
            pst.setString(7, txt_gender1.getText().trim());
            pst.setString(8, txt_date1.getText().trim());
            pst.setString(9, txt_observation.getText().trim());
            pst.setString(10, "1");
            pst.executeUpdate();

            txt_id1.setText("");
            txt_run1.setText("");
            txt_dv1.setText("");
            txt_names1.setText("");
            txt_father1.setText("");
            txt_mother1.setText("");
            txt_gender1.setText("");
            txt_date1.setText("");
            txt_observation.setText("");

            label_status1.setText("Registro exitoso");

        } catch (Exception e) {

        } // GEN-LAST:event_jButton1ActionPerformed
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        try {
            String ID = txt_buscar1.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/surveys", "root", "");
            PreparedStatement pst = cn.prepareStatement(
                    "update pacients set RUN=?, DV=?, Names=?, Father_name=?, Mother_name=?, Gender=?, Date_of_birth=?, Observation=? where ID = "
                            + ID);

            pst.setString(1, txt_run1.getText().trim());
            pst.setString(2, txt_dv1.getText().trim());
            pst.setString(3, txt_names1.getText().trim());
            pst.setString(4, txt_father1.getText().trim());
            pst.setString(5, txt_mother1.getText().trim());
            pst.setString(6, txt_gender1.getText().trim());
            pst.setString(7, txt_date1.getText().trim());
            pst.setString(8, txt_observation.getText().trim());
            pst.executeUpdate();

            label_status1.setText("Modificacion exitosa.");

        } catch (Exception e) {

        }
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/surveys", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from pacients where ID = ?");

            pst.setString(1, txt_buscar1.getText().trim());
            pst.executeUpdate();

            txt_id1.setText("");
            txt_run1.setText("");
            txt_dv1.setText("");
            txt_names1.setText("");
            txt_father1.setText("");
            txt_mother1.setText("");
            txt_gender1.setText("");
            txt_date1.setText("");
            txt_observation.setText("");

            label_status1.setText("Registro eliminado.");

        } catch (Exception e) {

        }
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/surveys", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from pacients where ID = ?");
            pst.setString(1, txt_buscar1.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                txt_id1.setText(rs.getString("ID"));
                txt_run1.setText(rs.getString("RUN"));
                txt_dv1.setText(rs.getString("DV"));
                txt_names1.setText(rs.getString("Names"));
                txt_father1.setText(rs.getString("Father_name"));
                txt_mother1.setText(rs.getString("Mother_name"));
                txt_gender1.setText(rs.getString("Gender"));
                txt_date1.setText(rs.getString("Date_of_birth"));
                txt_observation.setText(rs.getString("Observation"));

            } else {
                JOptionPane.showMessageDialog(null, "Nombre no registrado.");
            }
        } catch (Exception e) {

        }

    }// GEN-LAST:event_jButton4ActionPerformed

    private void txt_observationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_observationActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_observationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroPacients.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPacients.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPacients.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPacients.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPacients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_status1;
    private javax.swing.JTextField txt_buscar1;
    private javax.swing.JTextField txt_date1;
    private javax.swing.JTextField txt_dv1;
    private javax.swing.JTextField txt_father1;
    private javax.swing.JTextField txt_gender1;
    private javax.swing.JTextField txt_id1;
    private javax.swing.JTextField txt_mother1;
    private javax.swing.JTextField txt_names1;
    private javax.swing.JTextField txt_observation;
    private javax.swing.JTextField txt_run1;
    // End of variables declaration//GEN-END:variables
}
