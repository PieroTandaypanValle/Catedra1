
package sistema_psicologico;

import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class consulta_cuestionario extends javax.swing.JInternalFrame {

    public consulta_cuestionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_buscar = new javax.swing.JTextField();
        busca = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        buscar_id = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Cuestionario disponibles ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Buscar por ID:");

        busca.setText("Buscar");
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        tabla_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Test", "Puntos Min", "Puntos Max"
            }
        ));
        jScrollPane1.setViewportView(tabla_1);
        if (tabla_1.getColumnModel().getColumnCount() > 0) {
            tabla_1.getColumnModel().getColumn(0).setMinWidth(50);
            tabla_1.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla_1.getColumnModel().getColumn(0).setMaxWidth(100);
            tabla_1.getColumnModel().getColumn(2).setMinWidth(100);
            tabla_1.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_1.getColumnModel().getColumn(2).setMaxWidth(150);
            tabla_1.getColumnModel().getColumn(3).setMinWidth(100);
            tabla_1.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabla_1.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Estado de busqueda:");

        estado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buscar_id.setText("Buscar ID");
        buscar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_idActionPerformed(evt);
            }
        });

        jButton1.setText("Habilitados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Inhabilitados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(estado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(id_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(buscar_id, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busca)
                    .addComponent(limpiar)
                    .addComponent(buscar_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed
        // BUSCAR
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        estado.setText("");
        modelo.setRowCount(0);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select `ID_TEST`, `NAME_TEST`, `PTS_MIN_TEST`,"
                    + "`PTS_MAX_TEST` from test ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String [] tupla = new String [4];
                tupla [0] = rs.getString("ID_TEST");
                tupla [1] = rs.getString("NAME_TEST");
                tupla [2] = rs.getString("PTS_MIN_TEST");
                tupla [3] = rs.getString("PTS_MAX_TEST");
                modelo.addRow(tupla);
            }
            tabla_1.setModel(modelo);
            estado.setText("EXITOSA");
        } catch (Exception e) {
            estado.setText("ERROR");
        }
        
    }//GEN-LAST:event_buscaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // LIMPIAR
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        estado.setText("");
        modelo.setRowCount(0);
        id_buscar.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void buscar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_idActionPerformed
        // BUSCAR ID
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        estado.setText("");
        modelo.setRowCount(0);
        String valor = id_buscar.getText().trim();
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select `ID_TEST`, `NAME_TEST`, `PTS_MIN_TEST`,"
                    + "`PTS_MAX_TEST` from test where ID_TEST = " + valor);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String [] tupla = new String [4];
                tupla [0] = rs.getString("ID_TEST");
                tupla [1] = rs.getString("NAME_TEST");
                tupla [2] = rs.getString("PTS_MIN_TEST");
                tupla [3] = rs.getString("PTS_MAX_TEST");
                modelo.addRow(tupla);
            }
            tabla_1.setModel(modelo);
            estado.setText("EXITOSA");
        } catch (Exception e) {
            estado.setText("ERROR");
        }
    }//GEN-LAST:event_buscar_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BUSCAR H
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        estado.setText("");
        modelo.setRowCount(0);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select `ID_TEST`, `NAME_TEST`, `PTS_MIN_TEST`,"
                    + "`PTS_MAX_TEST` from test where DELETE_ALL_TEST = 1");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String [] tupla = new String [4];
                tupla [0] = rs.getString("ID_TEST");
                tupla [1] = rs.getString("NAME_TEST");
                tupla [2] = rs.getString("PTS_MIN_TEST");
                tupla [3] = rs.getString("PTS_MAX_TEST");
                modelo.addRow(tupla);
            }
            tabla_1.setModel(modelo);
            estado.setText("EXITOSA");
        } catch (Exception e) {
            estado.setText("ERROR");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BUSCAR I
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        estado.setText("");
        modelo.setRowCount(0);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select `ID_TEST`, `NAME_TEST`, `PTS_MIN_TEST`,"
                    + "`PTS_MAX_TEST` from test where DELETE_ALL_TEST = 0");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String [] tupla = new String [4];
                tupla [0] = rs.getString("ID_TEST");
                tupla [1] = rs.getString("NAME_TEST");
                tupla [2] = rs.getString("PTS_MIN_TEST");
                tupla [3] = rs.getString("PTS_MAX_TEST");
                modelo.addRow(tupla);
            }
            tabla_1.setModel(modelo);
            estado.setText("EXITOSA");
        } catch (Exception e) {
            estado.setText("ERROR");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton busca;
    private javax.swing.JButton buscar_id;
    private javax.swing.JLabel estado;
    private javax.swing.JTextField id_buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTable tabla_1;
    // End of variables declaration//GEN-END:variables

}
