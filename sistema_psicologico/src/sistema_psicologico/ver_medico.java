
package sistema_psicologico;

import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ver_medico extends javax.swing.JInternalFrame {

    public ver_medico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mostrar_H = new javax.swing.JButton();
        mostrar_I = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_1 = new javax.swing.JTable();
        clear = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ver Psicologo");

        mostrar_H.setText("Habilitados");
        mostrar_H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_HActionPerformed(evt);
            }
        });

        mostrar_I.setText("Inhabilitados");
        mostrar_I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_IActionPerformed(evt);
            }
        });

        estado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tabla_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT", "DV", "Nombre", "Apellido P", "Apellido M"
            }
        ));
        jScrollPane1.setViewportView(tabla_1);
        if (tabla_1.getColumnModel().getColumnCount() > 0) {
            tabla_1.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_1.getColumnModel().getColumn(2).setPreferredWidth(15);
        }

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mostrar_H, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrar_I, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(estado))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrar_H)
                    .addComponent(mostrar_I))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(clear)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrar_HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_HActionPerformed
        // MOSTRAR H
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        modelo.setRowCount(0);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select `ID_M`, `RUT_M`, `DV_M`, `NAME_M`,"
                    + "`FATHER_NAME_M`, `MOTHER_NAME_M` from medical where DELETE_ALL_M = 1");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String [] tupla = new String [6];
                tupla [0] = rs.getString("ID_M");
                tupla [1] = rs.getString("RUT_M");
                tupla [2] = rs.getString("DV_M");
                tupla [3] = rs.getString("NAME_M");
                tupla [4] = rs.getString("FATHER_NAME_M");
                tupla [5] = rs.getString("MOTHER_NAME_M");
                modelo.addRow(tupla);
            }
            tabla_1.setModel(modelo);
            estado.setText("Pscicologos HABILITADOS");
        } catch (Exception e) {
            estado.setText("Error de busqueda");
        }
    }//GEN-LAST:event_mostrar_HActionPerformed

    private void mostrar_IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_IActionPerformed
        // MOSTRAR I
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        modelo.setRowCount(0);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select `ID_M`, `RUT_M`, `DV_M`, `NAME_M`,"
                    + "`FATHER_NAME_M`, `MOTHER_NAME_M` from medical where DELETE_ALL_M = 0");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String [] tupla = new String [6];
                tupla [0] = rs.getString("ID_M");
                tupla [1] = rs.getString("RUT_M");
                tupla [2] = rs.getString("DV_M");
                tupla [3] = rs.getString("NAME_M");
                tupla [4] = rs.getString("FATHER_NAME_M");
                tupla [5] = rs.getString("MOTHER_NAME_M");
                modelo.addRow(tupla);
            }
            tabla_1.setModel(modelo);
            estado.setText("Pscicologos INHABILITADOS");
        } catch (Exception e) {
            estado.setText("Error de busqueda");
        }
    }//GEN-LAST:event_mostrar_IActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // LIMPIAR
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        estado.setText("");
        modelo.setRowCount(0);
    }//GEN-LAST:event_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrar_H;
    private javax.swing.JButton mostrar_I;
    private javax.swing.JTable tabla_1;
    // End of variables declaration//GEN-END:variables
}
