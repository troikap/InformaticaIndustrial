
package main;
import dto.*;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TroikaP
 */
public class InterfazPrincipal extends javax.swing.JFrame {
    private ControladorDistribucionPapelFilm controlador;
    /**
     * Creates new form InterfazPricipal
     */
    public InterfazPrincipal(ControladorDistribucionPapelFilm controlador) {
        initComponents();
        this.controlador = controlador;
    }
    
    public InterfazPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        Proveedor = new javax.swing.JButton();
        TipoArticulo = new javax.swing.JButton();
        Articulo = new javax.swing.JButton();
        SubArticulo = new javax.swing.JButton();
        ProductoTerminado = new javax.swing.JButton();
        RutaFabricacion = new javax.swing.JButton();
        CentroTrabajo = new javax.swing.JButton();
        MaquinaHerramienta = new javax.swing.JButton();
        EstadoOrdenProduccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        Proveedor.setText("ABM Proveedor");
        Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorActionPerformed(evt);
            }
        });

        TipoArticulo.setText("ABM TipoArticulo");
        TipoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoArticuloActionPerformed(evt);
            }
        });

        Articulo.setText("ABM Articulo");
        Articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArticuloActionPerformed(evt);
            }
        });

        SubArticulo.setText("ABM SubArticulo");
        SubArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubArticuloActionPerformed(evt);
            }
        });

        ProductoTerminado.setText("ABM ProductoTerminado");
        ProductoTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoTerminadoActionPerformed(evt);
            }
        });

        RutaFabricacion.setText("ABM RutaFabricacion");
        RutaFabricacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutaFabricacionActionPerformed(evt);
            }
        });

        CentroTrabajo.setText("ABM CentroTrabajo");
        CentroTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CentroTrabajoActionPerformed(evt);
            }
        });

        MaquinaHerramienta.setText("ABM MaquinaHerramienta");
        MaquinaHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaquinaHerramientaActionPerformed(evt);
            }
        });

        EstadoOrdenProduccion.setText("ABM EstadoOrdenProduccion");
        EstadoOrdenProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoOrdenProduccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EstadoOrdenProduccion)
                    .addComponent(MaquinaHerramienta)
                    .addComponent(CentroTrabajo)
                    .addComponent(RutaFabricacion)
                    .addComponent(ProductoTerminado)
                    .addComponent(SubArticulo)
                    .addComponent(Articulo)
                    .addComponent(TipoArticulo)
                    .addComponent(Proveedor))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Proveedor)
                .addGap(18, 18, 18)
                .addComponent(TipoArticulo)
                .addGap(18, 18, 18)
                .addComponent(Articulo)
                .addGap(18, 18, 18)
                .addComponent(SubArticulo)
                .addGap(18, 18, 18)
                .addComponent(ProductoTerminado)
                .addGap(18, 18, 18)
                .addComponent(RutaFabricacion)
                .addGap(18, 18, 18)
                .addComponent(CentroTrabajo)
                .addGap(18, 18, 18)
                .addComponent(MaquinaHerramienta)
                .addGap(18, 18, 18)
                .addComponent(EstadoOrdenProduccion)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorActionPerformed
        // TODO add your handling code here:
        InterfazABMProveedor interfazProveedor1 = new InterfazABMProveedor(controlador, this);
        interfazProveedor1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProveedorActionPerformed

    private void TipoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoArticuloActionPerformed

    private void ArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArticuloActionPerformed

    private void SubArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubArticuloActionPerformed

    private void ProductoTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoTerminadoActionPerformed
        // TODO add your handling code here:
        InterfazABMProductoTerminado interfazABMPT = new InterfazABMProductoTerminado(controlador, this);
        interfazABMPT.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProductoTerminadoActionPerformed

    private void RutaFabricacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutaFabricacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RutaFabricacionActionPerformed

    private void CentroTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CentroTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CentroTrabajoActionPerformed

    private void MaquinaHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaquinaHerramientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaquinaHerramientaActionPerformed

    private void EstadoOrdenProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoOrdenProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoOrdenProduccionActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Articulo;
    private javax.swing.JButton CentroTrabajo;
    private javax.swing.JButton EstadoOrdenProduccion;
    private javax.swing.JButton MaquinaHerramienta;
    private javax.swing.JButton ProductoTerminado;
    private javax.swing.JButton Proveedor;
    private javax.swing.JButton RutaFabricacion;
    private javax.swing.JButton SubArticulo;
    private javax.swing.JButton TipoArticulo;
    private javax.swing.JInternalFrame jInternalFrame1;
    // End of variables declaration//GEN-END:variables
public ControladorDistribucionPapelFilm getControladorDistribucionPapelFilm() {
        return controlador;
    }

    public void setControladorDistribucionPapelFilm(ControladorDistribucionPapelFilm controlador) {
        this.controlador = controlador;
    }

}
