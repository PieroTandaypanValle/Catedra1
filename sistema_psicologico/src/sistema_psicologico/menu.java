
package sistema_psicologico;

import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class menu extends javax.swing.JFrame {

    pantalla_add_pacientes pap;
    pantalla_add_medico pam;
    ver_paciente vpc;
    pantalla_add_test pat;
    pantalla_add_preguntas papr;
    pantalla_add_respuestas par;
    pantalla_add_resultados pare;
    ver_medico vm;
    consulta_cuestionario cc;
    cuestionario cus;
    ver_resultado vr;
    public menu() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        pap = new pantalla_add_pacientes();
        pam = new pantalla_add_medico();
        vpc = new ver_paciente();
        pat = new pantalla_add_test();
        papr = new pantalla_add_preguntas();
        par = new pantalla_add_respuestas();
        pare = new pantalla_add_resultados();
        vm = new ver_medico();
        cc = new consulta_cuestionario();
        vr = new ver_resultado();
        cus = new cuestionario();
        add(pap);
        add(pam);
        add(vpc);
        add(pat);
        add(papr);
        add(par);
        add(pare);
        add(vm);
        add(cc);
        add(cus);
        add(vr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        limpiar = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jScrollPane1.setToolTipText("");
        jScrollPane1.setViewportView(jTree1);

        jMenu4.setText("jMenu4");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenu6.setText("jMenu6");

        jMenuItem13.setText("jMenuItem13");

        jMenuItem14.setText("jMenuItem14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabla CRUD");
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(600, 700));

        limpiar.setText("Archivos");

        jMenuItem3.setText("Limpiar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        limpiar.add(jMenuItem3);
        limpiar.add(jSeparator2);

        jMenuBar1.add(limpiar);

        jMenu3.setText("Psicologo");

        jMenuItem4.setText("Registrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Ver Medico");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator1);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Paciente");

        jMenuItem1.setText("Registrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem7.setText("Ver Paciente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem15.setText("Ver Resultado");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Formulario");

        jMenuItem6.setText("Registrar Test");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem8.setText("Registrar Preguntas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Registrar Respuesta");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Registrar Resultado");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Cuestionario");

        jMenuItem11.setText("Disponibles");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuItem12.setText("Responder Test");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // AGREGAR PACIENTE
        pap.setVisible(true);
        pam.setVisible(false);
        vpc.setVisible(false);
        pat.setVisible(false);
        papr.setVisible(false);
        par.setVisible(false);
        pare.setVisible(false);
        vm.setVisible(false);
        cc.setVisible(false);
        //cus.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // LIMPIAR
        pap.setVisible(false);
        pam.setVisible(false);
        vpc.setVisible(false);
        pat.setVisible(false);
        papr.setVisible(false);
        par.setVisible(false);
        pare.setVisible(false);
        vm.setVisible(false);
        cc.setVisible(false);
        cus.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // AGREGAR MEDICO
        pap.setVisible(false);
        pam.setVisible(true);
        vpc.setVisible(false);
        pat.setVisible(false);
        papr.setVisible(false);
        par.setVisible(false);
        pare.setVisible(false);
        vm.setVisible(false);
        cc.setVisible(false);
        //cus.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // VER MEDICO H
        vm.setVisible(true);
        pap.setVisible(false);
        pam.setVisible(false);
        vpc.setVisible(false);
        pat.setVisible(false);
        papr.setVisible(false);
        par.setVisible(false);
        pare.setVisible(false);
        cc.setVisible(false);
        //cus.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // VER PACIENTE H
        vpc.setVisible(true);
        pap.setVisible(false);
        pam.setVisible(false);
        pat.setVisible(false);
        papr.setVisible(false);
        par.setVisible(false);
        pare.setVisible(false);
        vm.setVisible(false);
        cc.setVisible(false);
        //cus.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // AGREGAR TEST
        pat.setVisible(true);
        vpc.setVisible(false);
        pap.setVisible(false);
        pam.setVisible(false);
        papr.setVisible(false);
        par.setVisible(false);
        pare.setVisible(false);
        vm.setVisible(false);
        cc.setVisible(false);
        //cus.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // AGREGAR PREGUNTAS
        papr.setVisible(true);
        pat.setVisible(false);
        vpc.setVisible(false);
        pap.setVisible(false);
        pam.setVisible(false);
        par.setVisible(false);
        pare.setVisible(false);
        vm.setVisible(false);
        cc.setVisible(false);
        //cus.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed
       
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // AGREGAR RESPUESTA
        par.setVisible(true);
        papr.setVisible(false);
        pat.setVisible(false);
        vpc.setVisible(false);
        pap.setVisible(false);
        pam.setVisible(false);
        pare.setVisible(false);
        vm.setVisible(false);
        cc.setVisible(false);
        //cus.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // AGREGAR RESULTADO
        pare.setVisible(true);
        par.setVisible(false);
        papr.setVisible(false);
        pat.setVisible(false);
        vpc.setVisible(false);
        pap.setVisible(false);
        pam.setVisible(false);
        vm.setVisible(false);
        cc.setVisible(false);
        //cus.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // CONSULTA 
        cc.setVisible(true);
        pare.setVisible(false);
        par.setVisible(false);
        papr.setVisible(false);
        pat.setVisible(false);
        vpc.setVisible(false);
        pap.setVisible(false);
        pam.setVisible(false);
        vm.setVisible(false);
        //cus.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // RESPONDER TEST
        cus.setVisible(true);
        cc.setVisible(false);
        pare.setVisible(false);
        par.setVisible(false);
        papr.setVisible(false);
        pat.setVisible(false);
        vpc.setVisible(false);
        pap.setVisible(false);
        pam.setVisible(false);
        vm.setVisible(false);
        vr.setVisible(false);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        vr.setVisible(true);
        cc.setVisible(false);
        pare.setVisible(false);
        par.setVisible(false);
        papr.setVisible(false);
        pat.setVisible(false);
        vpc.setVisible(false);
        pap.setVisible(false);
        pam.setVisible(false);
        vm.setVisible(false);
        //cus.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenu limpiar;
    // End of variables declaration//GEN-END:variables
}
