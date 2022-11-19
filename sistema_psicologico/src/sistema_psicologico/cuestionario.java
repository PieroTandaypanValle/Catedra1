
package sistema_psicologico;

import java.sql.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class cuestionario extends javax.swing.JInternalFrame {

    public cuestionario() {
        initComponents();
        panel_pregunta.setEnabled(false);
    }

    int posicion = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_test = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        panel_pregunta = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        avanzar = new javax.swing.JButton();
        terminar = new javax.swing.JButton();
        opc_1 = new javax.swing.JRadioButton();
        opc_2 = new javax.swing.JRadioButton();
        opc_3 = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("¿Qué test desea realizar?");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese el nombre del test:");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Estado:");

        estado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estado.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_test, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(93, 93, 93))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(125, 125, 125))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar)
                .addGap(193, 193, 193))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(estado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estado))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        panel_pregunta.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Preguntas");

        question.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        question.setText("jLabel5");

        regresar.setText("<< Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        avanzar.setText("Avanzar >>");
        avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarActionPerformed(evt);
            }
        });

        terminar.setText("Terminar");
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc_1);

        buttonGroup1.add(opc_2);

        buttonGroup1.add(opc_3);

        javax.swing.GroupLayout panel_preguntaLayout = new javax.swing.GroupLayout(panel_pregunta);
        panel_pregunta.setLayout(panel_preguntaLayout);
        panel_preguntaLayout.setHorizontalGroup(
            panel_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_preguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panel_preguntaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(question)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_preguntaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(terminar)
                .addGap(195, 195, 195))
            .addGroup(panel_preguntaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_preguntaLayout.createSequentialGroup()
                        .addComponent(opc_1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_preguntaLayout.createSequentialGroup()
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(panel_preguntaLayout.createSequentialGroup()
                        .addGroup(panel_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opc_3)
                            .addComponent(opc_2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel_preguntaLayout.setVerticalGroup(
            panel_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_preguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question)
                .addGap(18, 18, 18)
                .addComponent(opc_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opc_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opc_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panel_preguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(avanzar))
                .addGap(18, 18, 18)
                .addComponent(terminar)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(panel_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String id_test = "";
    int cantidad_preguntas = 0;
    
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // BUSCAR
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select ID_TEST from test where NAME_TEST = ?");
            pst.setString(1, name_test.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                id_test = rs.getString("ID_TEST");
                panel_pregunta.setEnabled(true);
            } else {
                estado.setText("Error");
            }
            
            PreparedStatement pst_1 = cn.prepareStatement("select * from question where ID_TEST = "+id_test);
            ResultSet rs_1 = pst_1.executeQuery();
            
            while (rs_1.next()){
                cantidad_preguntas ++;
            }
            
            id_test = buscar.getText().trim();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\t" + e);
        }
    }//GEN-LAST:event_buscarActionPerformed

    String [] pregunta = new String [cantidad_preguntas];
    String [] resp_c = new String [cantidad_preguntas];
    String [] conjunto_resp = new String [cantidad_preguntas];
    
    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed
        // AVANZAR
        
        sacar_pregunta();
        
        if(posicion == cantidad_preguntas - 2){
            avanzar.setEnabled(false);
            terminar.setEnabled(true);
        }
        
        if(posicion < cantidad_preguntas){ //length
            regresar.setEnabled(true);
            posicion++;
            question.setText(pregunta[posicion]);
            //String[] a = r.setRespuestas(posicion);
            /*buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
            opc_1.setText(a[0]);
            opc_2.setText(a[1]);
            opc_3.setText(a[2]);*/
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_avanzarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // REGRESAR
        /*if(posicion == 0){
            regresar.setEnabled(false);
        }
        
        if(posicion > -1){
            posicion--;
            avanzar.setEnabled(true);
            /*question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);//
        }else{
            Toolkit.getDefaultToolkit().beep();
        }*/
    }//GEN-LAST:event_regresarActionPerformed

    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed
        // TERMINAR
    }//GEN-LAST:event_terminarActionPerformed
    
    private void sacar_pregunta(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_depresion", "root", "");
            PreparedStatement pst_1 = cn.prepareStatement("select * from question where ID_TEST = "+id_test);
            ResultSet rs_1 = pst_1.executeQuery();
            for  (int i = 0; i < cantidad_preguntas; i++){
                pregunta[i] = rs_1.getString("TEXT_QUESTION");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "\tError\t" + e);
        }
    }
    
   private void sacar_respuesta(){
        
        
    }
    private void sacar_puntos(){
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzar;
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name_test;
    private javax.swing.JRadioButton opc_1;
    private javax.swing.JRadioButton opc_2;
    private javax.swing.JRadioButton opc_3;
    private javax.swing.JPanel panel_pregunta;
    private javax.swing.JLabel question;
    private javax.swing.JButton regresar;
    private javax.swing.JButton terminar;
    // End of variables declaration//GEN-END:variables
}
