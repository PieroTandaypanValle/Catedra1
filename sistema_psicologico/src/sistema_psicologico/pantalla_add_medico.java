
package sistema_psicologico;

import java.sql.*;

public class pantalla_add_medico extends javax.swing.JInternalFrame {

    public pantalla_add_medico() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_m = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rut_m = new javax.swing.JTextField();
        dv_m = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nom_m = new javax.swing.JTextField();
        ape_p_m = new javax.swing.JTextField();
        ape_m_m = new javax.swing.JTextField();
        genero_m = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        id_busca_m = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        bloquear = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        desbloquear = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        clear = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("   Datos del Psicologo");

        jLabel2.setText("ID Medico:");

        jLabel3.setText("RUT:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido Paterno:");

        jLabel6.setText("Apellido Materno:");

        jLabel7.setText("Genero");

        rut_m.setPreferredSize(new java.awt.Dimension(62, 22));
        rut_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rut_mActionPerformed(evt);
            }
        });

        jLabel8.setText("-");

        ape_p_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ape_p_mActionPerformed(evt);
            }
        });

        ape_m_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ape_m_mActionPerformed(evt);
            }
        });

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        jLabel9.setText("Buscar por Rut:");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        bloquear.setText("Bloquear");
        bloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloquearActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        desbloquear.setText("Desbloquear");
        desbloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desbloquearActionPerformed(evt);
            }
        });

        estado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_m, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(genero_m)
                            .addComponent(ape_m_m)
                            .addComponent(ape_p_m)
                            .addComponent(nom_m)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rut_m, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dv_m, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(69, 69, 69)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_busca_m)
                            .addComponent(desbloquear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloquear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(clear)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rut_m, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(dv_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nom_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ape_p_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ape_m_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(genero_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(actualizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(id_busca_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(bloquear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(desbloquear))
                .addGap(18, 18, 18)
                .addComponent(estado)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rut_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rut_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rut_mActionPerformed

    private void ape_p_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ape_p_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ape_p_mActionPerformed

    private void ape_m_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ape_m_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ape_m_mActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // REGISTRAR
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into medical values(?,?,?,?,?,?,?,?)");

            pst.setString(1, id_m.getText().trim());
            pst.setString(2, rut_m.getText().trim());
            pst.setString(3, dv_m.getText().trim());
            pst.setString(4, nom_m.getText().trim());
            pst.setString(5, ape_p_m.getText().trim());
            pst.setString(6, ape_m_m.getText().trim());
            pst.setString(7, genero_m.getText().trim());
            pst.setString(8, "1");
            
            pst.executeUpdate();

            id_m.setText("");
            rut_m.setText("");
            dv_m.setText("");
            nom_m.setText("");
            ape_p_m.setText("");
            ape_m_m.setText("");
            genero_m.setText("");

            estado.setText("Registro exitoso");

        } catch (Exception e) {
            estado.setText("Error");
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // ACTUALIZAR
        try {
            String ID = id_busca_m.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement(
                    "update MEDICAL set RUT_M=?, DV_M=?, NAME_M=?, FATHER_NAME_M=?,"
                            + "MOTHER_NAME_M=?, GENDER_M=?  where RUT_M = "+ ID);
            
            pst.setString(1, rut_m.getText().trim());
            pst.setString(2, dv_m.getText().trim());
            pst.setString(3, nom_m.getText().trim());
            pst.setString(4, ape_p_m.getText().trim());
            pst.setString(5, ape_m_m.getText().trim());
            pst.setString(6, genero_m.getText().trim());
            
            pst.executeUpdate();
            
            estado.setText("ACTUALIZACION exitosa");

        } catch (Exception e) {
            estado.setText("Error al ACTUALIZAR los datos");
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // ELIMINAR
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from MEDICAL where RUT_M = ?");
            
            pst.setString(1,id_busca_m.getText().trim());
            
            pst.executeUpdate();
            
            id_m.setText("");
            rut_m.setText("");
            dv_m.setText("");
            nom_m.setText("");
            ape_p_m.setText("");
            ape_m_m.setText("");
            genero_m.setText("");
            
            estado.setText("ELIMINACION exitosa");

        } catch (Exception e) {
            estado.setText("Error al ELIMINAR los datos");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void bloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloquearActionPerformed
        // BLOQUEAR
        try {
            String ID = id_busca_m.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement(
                    "update MEDICAL set DELETE_ALL_M = 0  where RUT_M = "+ ID);
            
            pst.executeUpdate();
            
            id_m.setText("");
            rut_m.setText("");
            dv_m.setText("");
            nom_m.setText("");
            ape_p_m.setText("");
            ape_m_m.setText("");
            genero_m.setText("");
            
            estado.setText("BLOQUEO exitoso.");

        } catch (Exception e) {
            estado.setText("Error al BLOQUEAR los datos");
        }
    }//GEN-LAST:event_bloquearActionPerformed

    private void desbloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desbloquearActionPerformed
        // DESBLOQUEAR
        try {
            String ID = id_busca_m.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement(
                    "update MEDICAL set DELETE_ALL_M = 1  where RUT_M = "+ ID);
            
            pst.executeUpdate();
            
            id_m.setText("");
            rut_m.setText("");
            dv_m.setText("");
            nom_m.setText("");
            ape_p_m.setText("");
            ape_m_m.setText("");
            genero_m.setText("");
            
            estado.setText("DESBLOQUEO exitoso.");

        } catch (Exception e) {
            estado.setText("Error al DESBLOQUEAR los datos");
        }
    }//GEN-LAST:event_desbloquearActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // BUSCAR
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from medical where RUT_M = ?");
            pst.setString(1, id_busca_m.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                
                id_m.setText(rs.getString("ID_M"));
                rut_m.setText(rs.getString("RUT_M"));
                dv_m.setText(rs.getString("DV_M"));
                nom_m.setText(rs.getString("NAME_M"));
                ape_p_m.setText(rs.getString("FATHER_NAME_M"));
                ape_m_m.setText(rs.getString("MOTHER_NAME_M"));
                genero_m.setText(rs.getString("GENDER_M"));
                
                estado.setText("BUSQUEDA exitosa");

            } else {
                estado.setText("Medico no encontrado");
            }

        } catch (Exception e) {
            estado.setText("Error al BUSCAR los datos");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // LIMPIAR
        id_m.setText("");
        rut_m.setText("");
        dv_m.setText("");
        nom_m.setText("");
        ape_p_m.setText("");
        ape_m_m.setText("");
        genero_m.setText("");
        id_busca_m.setText("");
        estado.setText("");
    }//GEN-LAST:event_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField ape_m_m;
    private javax.swing.JTextField ape_p_m;
    private javax.swing.JButton bloquear;
    private javax.swing.JButton buscar;
    private javax.swing.JButton clear;
    private javax.swing.JButton desbloquear;
    private javax.swing.JTextField dv_m;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel estado;
    private javax.swing.JTextField genero_m;
    private javax.swing.JTextField id_busca_m;
    private javax.swing.JTextField id_m;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nom_m;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField rut_m;
    // End of variables declaration//GEN-END:variables
}
