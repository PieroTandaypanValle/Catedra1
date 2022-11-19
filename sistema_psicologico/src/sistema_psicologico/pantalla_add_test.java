
package sistema_psicologico;

import java.sql.*;

public class pantalla_add_test extends javax.swing.JInternalFrame {

    public pantalla_add_test() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id_t = new javax.swing.JTextField();
        idm_t = new javax.swing.JTextField();
        nom_t = new javax.swing.JTextField();
        pmin_t = new javax.swing.JTextField();
        pmax_t = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        id_buscar_t = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        clear = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("            TEST");

        jLabel2.setText("ID Test:");

        jLabel4.setText("ID Psicologo: ");

        jLabel5.setText("Nombre del Test:");

        jLabel6.setText("Puntos Min:");

        jLabel7.setText("Puntos Max:");

        id_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tActionPerformed(evt);
            }
        });

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Id a buscar");

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Bloquear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Desbloquear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        estado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        clear.setText("Limpiar");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_buscar_t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(idm_t, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(id_t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom_t, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pmax_t, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pmin_t, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(clear)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(idm_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nom_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pmin_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pmax_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(id_buscar_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estado)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // INGRESAR
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into test values(?,?,?,?,?,?)");

            pst.setString(1, id_t.getText().trim());
            pst.setString(2, idm_t.getText().trim());
            pst.setString(3, nom_t.getText().trim());
            pst.setString(4, pmin_t.getText().trim());
            pst.setString(5, pmax_t.getText().trim());
            pst.setString(6, "1");
            
            pst.executeUpdate();

            id_t.setText("");
            idm_t.setText("");
            nom_t.setText("");
            pmin_t.setText("");
            pmax_t.setText("");
            
            estado.setText("INGRESO exitoso");

        } catch (Exception e) {
            estado.setText("Error al INGRESAR los datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // ACTUALIZAR
        try {
            String ID = id_buscar_t.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement(
                    "update test set ID_M=?, NAME_TEST=?, PTS_MIN_TEST=?, PTS_MAX_TEST=? where ID_TEST = "+ ID);
            
            pst.setString(1, idm_t.getText().trim());
            pst.setString(2, nom_t.getText().trim());
            pst.setString(3, pmin_t.getText().trim());
            pst.setString(4, pmax_t.getText().trim());
            
            pst.executeUpdate();
            
            estado.setText("ACTUALIZACION exitosa");

        } catch (Exception e) {
            estado.setText("Error al ACTUALIZAR los datos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BUSCAR
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement(
                    "select * from test where ID_TEST = ?");
            pst.setString(1, id_buscar_t.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                   
                id_t.setText(rs.getString("ID_TEST"));
                idm_t.setText(rs.getString("ID_M"));
                nom_t.setText(rs.getString("NAME_TEST"));
                pmin_t.setText(rs.getString("PTS_MIN_TEST"));
                pmax_t.setText(rs.getString("PTS_MAX_TEST"));
                
                estado.setText("BUSQUEDA exitosa");

            } else {
                estado.setText("Test no encontrado");
            }
        } catch (Exception e){
            estado.setText("Error al BUSCAR");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // ELIMINAR
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from test where ID_PAC = ?");
            
            pst.setString(1,id_buscar_t.getText().trim());
            
            pst.executeUpdate();
            
            id_t.setText("");
            idm_t.setText("");
            nom_t.setText("");
            pmin_t.setText("");
            pmax_t.setText("");
            id_buscar_t.setText("");

            estado.setText("Test ELIMINADO.");

        } catch (Exception e) {
            estado.setText("Error al ELIMINAR los datos");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BLOQUEAR
        try {
            String ID = id_buscar_t.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("update test set DELETE_ALL_PAC = 0  where ID_TEST = "+ ID);
            
            pst.executeUpdate();
            
            id_t.setText("");
            idm_t.setText("");
            nom_t.setText("");
            pmin_t.setText("");
            pmax_t.setText("");
            id_buscar_t.setText("");

            estado.setText("BLOQUEADO exitoso");

        } catch (Exception e) {
            estado.setText("Error al BLOQUEAR el test");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // DESBLOQUEAR
        try {
            String ID = id_buscar_t.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("update test set DELETE_ALL_PAC = 1  where ID_TEST = "+ ID);
            
            pst.executeUpdate();
            
            id_t.setText("");
            idm_t.setText("");
            nom_t.setText("");
            pmin_t.setText("");
            pmax_t.setText("");
            id_buscar_t.setText("");

            estado.setText("DESBLOQUEADO exitoso");

        } catch (Exception e) {
            estado.setText("Error al DESBLOQUEAR el test");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // LIMPRIAR
        id_t.setText("");
        idm_t.setText("");
        nom_t.setText("");
        pmin_t.setText("");
        pmax_t.setText("");
        estado.setText("");
        id_buscar_t.setText("");
    }//GEN-LAST:event_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JLabel estado;
    private javax.swing.JTextField id_buscar_t;
    private javax.swing.JTextField id_t;
    private javax.swing.JTextField idm_t;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nom_t;
    private javax.swing.JTextField pmax_t;
    private javax.swing.JTextField pmin_t;
    // End of variables declaration//GEN-END:variables
}
