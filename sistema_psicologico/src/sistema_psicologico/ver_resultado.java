package sistema_psicologico;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ver_resultado extends javax.swing.JInternalFrame {

    public ver_resultado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buscar_rut = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ver Resultado");

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar con RUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Buscar por RUT:");

        tabla_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID R", "RUT", "DV", "PTS", "Observacion"
            }
        ));
        jScrollPane1.setViewportView(tabla_1);
        if (tabla_1.getColumnModel().getColumnCount() > 0) {
            tabla_1.getColumnModel().getColumn(0).setMinWidth(50);
            tabla_1.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla_1.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla_1.getColumnModel().getColumn(1).setMinWidth(75);
            tabla_1.getColumnModel().getColumn(1).setPreferredWidth(75);
            tabla_1.getColumnModel().getColumn(1).setMaxWidth(75);
            tabla_1.getColumnModel().getColumn(2).setMinWidth(30);
            tabla_1.getColumnModel().getColumn(2).setPreferredWidth(30);
            tabla_1.getColumnModel().getColumn(2).setMaxWidth(30);
            tabla_1.getColumnModel().getColumn(3).setMinWidth(60);
            tabla_1.getColumnModel().getColumn(3).setPreferredWidth(60);
            tabla_1.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Estado:");

        estado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estado.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(estado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buscar_rut)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscar_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estado))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BUSCAR
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        modelo.setRowCount(0);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst_1 = cn.prepareStatement("select * from result");
            PreparedStatement pst_2 = cn.prepareStatement("select * from pacient");
            ResultSet rs_1 = pst_1.executeQuery();
            ResultSet rs_2 = pst_2.executeQuery();
            while (rs_1.next() && rs_2.next()){
                String [] tupla = new String [5];
                tupla [0] = rs_1.getString("ID_RESULT");
                tupla [1] = rs_2.getString("RUT_PAC");
                tupla [2] = rs_2.getString("DV_PAC");
                tupla [3] = rs_1.getString("PTS_RESULT");
                tupla [4] = rs_1.getString("OBSERVATION_RESULT");
                modelo.addRow(tupla);
            }
            tabla_1.setModel(modelo);
            estado.setText("Busqueda exitosa");
        } catch (Exception e) {
            estado.setText("Error de busqueda");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // LIMPIAR
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        modelo.setRowCount(0);
        estado.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BUSCAR RUT
        DefaultTableModel modelo = (DefaultTableModel)tabla_1.getModel();
        modelo.setRowCount(0);
        String id_pac;
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst_1 = cn.prepareStatement("select * from pacient where RUT_PAC = ?");
            pst_1.setString(1, buscar_rut.getText().trim());
            ResultSet rs_1 = pst_1.executeQuery();
            id_pac = rs_1.getString("ID_PAC");
            PreparedStatement pst_2 = cn.prepareStatement("select * from result where ID_PAC = "+id_pac);
            ResultSet rs_2 = pst_2.executeQuery();
            String [] tupla;
            while (rs_1.next() && rs_2.next()){
                tupla = new String [5];
                tupla [0] = rs_2.getString("ID_RESULT");
                tupla [1] = rs_1.getString("RUT_PAC");
                tupla [2] = rs_1.getString("DV_PAC");
                tupla [3] = rs_2.getString("PTS_RESULT");
                tupla [4] = rs_2.getString("OBSERVATION_RESULT");
                modelo.addRow(tupla);
            }
            tabla_1.setModel(modelo);
            estado.setText("Busqueda exitosa");
        } catch (Exception e) {
            estado.setText("Error de busqueda");
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar_rut;
    private javax.swing.JLabel estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_1;
    // End of variables declaration//GEN-END:variables

}
