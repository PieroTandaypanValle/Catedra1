
package sistema_psicologico;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ver_paciente extends javax.swing.JInternalFrame {

    public ver_paciente() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_1 = new javax.swing.JTable();
        mostrar_H = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        mostrar_I = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("          Ver Pacientes");

        tabla_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT", "Nombre", "Apellido", "Obseracion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_1);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mostrar_H, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(estado))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mostrar_I, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrar_H)
                    .addComponent(estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrar_I)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(clear)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrar_HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_HActionPerformed
        // BUSCAR H
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        modelo.setRowCount(0);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select `ID_PAC`, `RUT_PAC`, `NAME_PAC`, `FATHER_NAME_PAC`,"
                    + " `OBSERVATION_PAC` from pacient where DELETE_ALL_PAC = 1");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String [] tupla = new String [5];
                tupla [0] = rs.getString("ID_PAC");
                tupla [1] = rs.getString("RUT_PAC");
                tupla [2] = rs.getString("NAME_PAC");
                tupla [3] = rs.getString("FATHER_NAME_PAC");
                tupla [4] = rs.getString("OBSERVATION_PAC");
                modelo.addRow(tupla);
            }
            tabla_1.setModel(modelo);
            estado.setText("HABILITADOS");
        } catch (Exception e) {
            estado.setText("Error de busqueda");
        }
        
    }//GEN-LAST:event_mostrar_HActionPerformed

    private void mostrar_IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_IActionPerformed
        // BUSCAR I
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        modelo.setRowCount(0);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select `ID_PAC`, `RUT_PAC`, `NAME_PAC`, `FATHER_NAME_PAC`,"
                    + " `OBSERVATION_PAC` from pacient where DELETE_ALL_PAC = 0");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String [] tupla = new String [5];
                tupla [0] = rs.getString("ID_PAC");
                tupla [1] = rs.getString("RUT_PAC");
                tupla [2] = rs.getString("NAME_PAC");
                tupla [3] = rs.getString("FATHER_NAME_PAC");
                tupla [4] = rs.getString("OBSERVATION_PAC");
                modelo.addRow(tupla);
            }
            tabla_1.setModel(modelo);
            estado.setText("INHABILITADOS");
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

    private void tabla_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_1MouseClicked


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
