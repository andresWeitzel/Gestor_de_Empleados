/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.gui.menuInicial;

import mypackage.connector.LocalConnector;
import mypackage.gui.empleados.JFrameIngresoEmpleado;
import mypackage.gui.utils.JFrameValidacionIngreso;
import mypackage.gui.otros.JFrameAcercaDe;
import mypackage.gui.otros.JFrameAyuda;
import mypackage.repositories.interfaces.I_EmpleadoRepository;
import mypackage.repositories.jdbc.EmpleadoRepository;

/**
 *
 * @author andre
 */
public class JFrameGestorEmpleados_app extends javax.swing.JFrame {
    
    
      I_EmpleadoRepository empleadoRepository = new EmpleadoRepository(LocalConnector.getLocalConnection());


    /** Creates new form JFrameGestorEmpleados_app */
    public JFrameGestorEmpleados_app() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneFondo = new javax.swing.JDesktopPane();
        jButtonEmpleados = new javax.swing.JButton();
        jButtonDesarrolladores = new javax.swing.JButton();
        jButtonSoporteTecnico = new javax.swing.JButton();
        jButtonAdministracion = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonAnalytics = new javax.swing.JButton();
        jToggleButtonAyuda = new javax.swing.JToggleButton();
        jToggleButtonAcerca = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPaneFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEmpleados.setBackground(new java.awt.Color(1, 45, 151));
        jButtonEmpleados.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButtonEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmpleados.setText("EMPLEADOS");
        jButtonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadosActionPerformed(evt);
            }
        });
        jDesktopPaneFondo.add(jButtonEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 162, 57));

        jButtonDesarrolladores.setBackground(new java.awt.Color(0, 24, 82));
        jButtonDesarrolladores.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButtonDesarrolladores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDesarrolladores.setText("DESARROLLADORES");
        jDesktopPaneFondo.add(jButtonDesarrolladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 260, 57));

        jButtonSoporteTecnico.setBackground(new java.awt.Color(0, 37, 126));
        jButtonSoporteTecnico.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButtonSoporteTecnico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSoporteTecnico.setText("SOPORTE TECNICO");
        jButtonSoporteTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSoporteTecnicoActionPerformed(evt);
            }
        });
        jDesktopPaneFondo.add(jButtonSoporteTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 210, 57));

        jButtonAdministracion.setBackground(new java.awt.Color(0, 30, 101));
        jButtonAdministracion.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButtonAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdministracion.setText("ADMINISTRACION");
        jButtonAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministracionActionPerformed(evt);
            }
        });
        jDesktopPaneFondo.add(jButtonAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 240, 57));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("MENÚ PRINCIPAL");
        jDesktopPaneFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 330, -1));

        jButtonAnalytics.setBackground(new java.awt.Color(0, 16, 56));
        jButtonAnalytics.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonAnalytics.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnalytics.setText("ANALYTICS");
        jDesktopPaneFondo.add(jButtonAnalytics, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 320, 80));

        jToggleButtonAyuda.setBackground(new java.awt.Color(0, 79, 237));
        jToggleButtonAyuda.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jToggleButtonAyuda.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonAyuda.setText("Ayuda");
        jToggleButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAyudaActionPerformed(evt);
            }
        });
        jDesktopPaneFondo.add(jToggleButtonAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 70, -1));

        jToggleButtonAcerca.setBackground(new java.awt.Color(0, 79, 237));
        jToggleButtonAcerca.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jToggleButtonAcerca.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonAcerca.setText("Acerca de");
        jToggleButtonAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAcercaActionPerformed(evt);
            }
        });
        jDesktopPaneFondo.add(jToggleButtonAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 90, -1));

        getContentPane().add(jDesktopPaneFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdministracionActionPerformed

    private void jButtonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadosActionPerformed
       new JFrameValidacionIngreso().setVisible(true);
    }//GEN-LAST:event_jButtonEmpleadosActionPerformed

    private void jToggleButtonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAyudaActionPerformed
        new JFrameAyuda().setVisible(true);
    }//GEN-LAST:event_jToggleButtonAyudaActionPerformed

    private void jToggleButtonAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAcercaActionPerformed
       new JFrameAcercaDe().setVisible(true);
    }//GEN-LAST:event_jToggleButtonAcercaActionPerformed

    private void jButtonSoporteTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSoporteTecnicoActionPerformed
         new JFrameValidacionIngreso().setVisible(true);
    }//GEN-LAST:event_jButtonSoporteTecnicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorEmpleados_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorEmpleados_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorEmpleados_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestorEmpleados_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestorEmpleados_app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdministracion;
    private javax.swing.JButton jButtonAnalytics;
    private javax.swing.JButton jButtonDesarrolladores;
    private javax.swing.JButton jButtonEmpleados;
    private javax.swing.JButton jButtonSoporteTecnico;
    private javax.swing.JDesktopPane jDesktopPaneFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JToggleButton jToggleButtonAcerca;
    private javax.swing.JToggleButton jToggleButtonAyuda;
    // End of variables declaration//GEN-END:variables
}
