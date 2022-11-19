
package sistema_psicologico;

import java.sql.*;

public class pantalla_add_pacientes extends javax.swing.JInternalFrame {

    public pantalla_add_pacientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ID_pk_pac = new javax.swing.JTextField();
        ID_fk_pac = new javax.swing.JTextField();
        rut_pac = new javax.swing.JTextField();
        dv_pac = new javax.swing.JTextField();
        nombre_pac = new javax.swing.JTextField();
        ape_p_pac = new javax.swing.JTextField();
        ape_m_pac = new javax.swing.JTextField();
        genero_pac = new javax.swing.JTextField();
        fn_pac = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacion_pac = new javax.swing.JTextArea();
        registrar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        ID_buscar_pac = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        bloquear = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        desbloquear = new javax.swing.JButton();
        estatus = new javax.swing.JLabel();
        clear = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("  Datos del Paciente");

        jLabel2.setText("ID Paciente:");

        jLabel3.setText("ID Medico:");

        jLabel4.setText("RUT:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Apellido Paterno:");

        jLabel7.setText("Apellido Materno:");

        jLabel8.setText("Genero:");

        jLabel9.setText("Fecha Nacimiento:");

        ID_pk_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_pk_pacActionPerformed(evt);
            }
        });

        fn_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fn_pacActionPerformed(evt);
            }
        });

        jLabel10.setText("-");

        jLabel11.setText("Observacion:");

        observacion_pac.setColumns(20);
        observacion_pac.setRows(5);
        jScrollPane1.setViewportView(observacion_pac);

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

        jLabel12.setText("Buscar por RUT:");

        ID_buscar_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_buscar_pacActionPerformed(evt);
            }
        });

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

        estatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5))
                                                    .addGap(68, 68, 68))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(24, 24, 24)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(20, 20, 20)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(74, 74, 74)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(16, 16, 16)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fn_pac)
                                    .addComponent(genero_pac, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ape_m_pac, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ape_p_pac, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(rut_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dv_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nombre_pac, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ID_fk_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(ID_pk_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(clear))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(estatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(ID_buscar_pac))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(desbloquear, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(bloquear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ID_pk_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ID_fk_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rut_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dv_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombre_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ape_p_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ape_m_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(genero_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fn_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(actualizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_buscar_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar)
                    .addComponent(bloquear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminar)
                    .addComponent(desbloquear))
                .addGap(18, 18, 18)
                .addComponent(estatus)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_buscar_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_buscar_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_buscar_pacActionPerformed

    private void ID_pk_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_pk_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_pk_pacActionPerformed

    private void fn_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fn_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fn_pacActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // BUSCAR
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement(
                    "select * from pacient where RUT_PAC = ?");
            pst.setString(1, ID_buscar_pac.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                   
                ID_pk_pac.setText(rs.getString("ID_PAC"));
                ID_fk_pac.setText(rs.getString("ID_M"));
                rut_pac.setText(rs.getString("RUT_PAC"));
                dv_pac.setText(rs.getString("DV_PAC"));
                nombre_pac.setText(rs.getString("NAME_PAC"));
                ape_p_pac.setText(rs.getString("FATHER_NAME_PAC"));
                ape_m_pac.setText(rs.getString("MOTHER_NAME_PAC"));
                genero_pac.setText(rs.getString("GENDER_PAC"));
                fn_pac.setText(rs.getString("DATE_BIRTH_PAC"));
                observacion_pac.setText(rs.getString("OBSERVATION_PAC"));
                
                estatus.setText("BUSQUEDA exitosa");

            } else {
                estatus.setText("Paciente no encontrado");
            }
        } catch (Exception e){
            estatus.setText("Error al BUSCAR");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // ELIMINAR
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from pacient where ID_PAC = ?");
            
            pst.setString(1,ID_buscar_pac.getText().trim());
            
            pst.executeUpdate();
            
            ID_pk_pac.setText("");
            ID_fk_pac.setText("");
            rut_pac.setText("");
            dv_pac.setText("");
            nombre_pac.setText("");
            ape_p_pac.setText("");
            ape_m_pac.setText("");
            genero_pac.setText("");
            fn_pac.setText("");
            observacion_pac.setText("");
            ID_buscar_pac.setText("");

            estatus.setText("Paciente ELIMINADO.");

        } catch (Exception e) {
            estatus.setText("Error al ELIMINAR los datos");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void bloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloquearActionPerformed
        // BLOQUEAR
        try {
            String ID = ID_buscar_pac.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("update pacient set DELETE_ALL_PAC = 0  where RUT_PAC = "+ ID);
            
            pst.executeUpdate();
            
            ID_pk_pac.setText("");
            ID_fk_pac.setText("");
            rut_pac.setText("");
            dv_pac.setText("");
            nombre_pac.setText("");
            ape_p_pac.setText("");
            ape_m_pac.setText("");
            genero_pac.setText("");
            fn_pac.setText("");
            observacion_pac.setText("");
            ID_buscar_pac.setText("");

            estatus.setText("Paciente BLOQUEADO.");

        } catch (Exception e) {
            estatus.setText("Error al BLOQUEAR al paciente");
        }
    }//GEN-LAST:event_bloquearActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        ID_pk_pac.setText("");
        ID_fk_pac.setText("");
        rut_pac.setText("");
        dv_pac.setText("");
        nombre_pac.setText("");
        ape_p_pac.setText("");
        ape_m_pac.setText("");
        genero_pac.setText("");
        fn_pac.setText("");
        observacion_pac.setText("");
        ID_buscar_pac.setText("");
        estatus.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // REGISTRAR
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into pacient values(?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, ID_pk_pac.getText().trim());
            pst.setString(2, ID_fk_pac.getText().trim());
            pst.setString(3, rut_pac.getText().trim());
            pst.setString(4, dv_pac.getText().trim());
            pst.setString(5, nombre_pac.getText().trim());
            pst.setString(6, ape_p_pac.getText().trim());
            pst.setString(7, ape_m_pac.getText().trim());
            pst.setString(8, genero_pac.getText().trim());
            pst.setString(9, fn_pac.getText().trim());
            pst.setString(10, observacion_pac.getText().trim());
            pst.setString(11, "1");
            
            pst.executeUpdate();

            ID_pk_pac.setText("");
            ID_fk_pac.setText("");
            rut_pac.setText("");
            dv_pac.setText("");
            nombre_pac.setText("");
            ape_p_pac.setText("");
            ape_m_pac.setText("");
            genero_pac.setText("");
            fn_pac.setText("");
            observacion_pac.setText("");

            estatus.setText("INGRESO exitoso");

        } catch (Exception e) {
            estatus.setText("Error al INGRESAR los datos");
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // ACTUALIZAR
        try {
            String ID = ID_buscar_pac.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement(
                    "update pacient set ID_M=?,RUT_PAC=?,DV_PAC=?,NAME_PAC=?,FATHER_NAME_PAC=?,"
                    + "MOTHER_NAME_PAC=?,GENDER_PAC=?,DATE_BIRTH_PAC=?,OBSERVATION_PAC=? where RUT_PAC = "+ ID);
            
            pst.setString(1, ID_fk_pac.getText().trim());
            pst.setString(2, rut_pac.getText().trim());
            pst.setString(3, dv_pac.getText().trim());
            pst.setString(4, nombre_pac.getText().trim());
            pst.setString(5, ape_p_pac.getText().trim());
            pst.setString(6, ape_m_pac.getText().trim());
            pst.setString(7, genero_pac.getText().trim());
            pst.setString(8, fn_pac.getText().trim());
            pst.setString(9, observacion_pac.getText().trim());
            
            pst.executeUpdate();
            
            estatus.setText("ACTUALIZACION exitosa");

        } catch (Exception e) {
            estatus.setText("Error al ACTUALIZAR los datos");
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void desbloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desbloquearActionPerformed
        // DESBLOQUEAR
        try {
            String ID = ID_buscar_pac.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("update pacient set DELETE_ALL_PAC = 1  where ID_PAC = "+ ID);
            
            pst.executeUpdate();
            
            ID_pk_pac.setText("");
            ID_fk_pac.setText("");
            rut_pac.setText("");
            dv_pac.setText("");
            nombre_pac.setText("");
            ape_p_pac.setText("");
            ape_m_pac.setText("");
            genero_pac.setText("");
            fn_pac.setText("");
            observacion_pac.setText("");
            ID_buscar_pac.setText("");

            
            estatus.setText("Paciente DESBLOQUEADO.");

        } catch (Exception e) {
            estatus.setText("Error al DESBLOQUEAR al paciente");
        }
    }//GEN-LAST:event_desbloquearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_buscar_pac;
    private javax.swing.JTextField ID_fk_pac;
    private javax.swing.JTextField ID_pk_pac;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField ape_m_pac;
    private javax.swing.JTextField ape_p_pac;
    private javax.swing.JButton bloquear;
    private javax.swing.JButton buscar;
    private javax.swing.JButton clear;
    private javax.swing.JButton desbloquear;
    private javax.swing.JTextField dv_pac;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel estatus;
    private javax.swing.JTextField fn_pac;
    private javax.swing.JTextField genero_pac;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_pac;
    private javax.swing.JTextArea observacion_pac;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField rut_pac;
    // End of variables declaration//GEN-END:variables
}
