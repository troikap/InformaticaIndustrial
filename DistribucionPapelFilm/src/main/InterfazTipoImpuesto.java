
package main;

import dto.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mari
 */

    public class InterfazTipoImpuesto extends javax.swing.JFrame {
    DefaultTableModel modeloTabla;
    private Controlador controlador;
    private List<String> listCombox;
    InterfazABM pantallaPrincipal;
    private boolean Agregar;
    DefaultTableModel modeloAguardar = new DefaultTableModel();
    
    public InterfazTipoImpuesto(){}
        
    public InterfazTipoImpuesto(Controlador controlador, InterfazABM interfaz) {
        initComponents();
        modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Atributo");
        modeloTabla.addColumn("Orden");
        this.Agregar = true;
        this.TablaOrdenAtributo.setModel(modeloTabla);
        this.controlador = controlador;
        this.pantallaPrincipal = interfaz;
    }
    
    public InterfazTipoImpuesto(Controlador controlador, InterfazABM interfaz, DTOImpuestoSeleccionado dtoIS) {
        initComponents();
        modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Atributo");
        modeloTabla.addColumn("Orden");
        this.Agregar = false;
        this.TablaOrdenAtributo.setModel(modeloTabla);
        this.controlador = controlador;
        this.pantallaPrincipal = interfaz;
        this.TextoCodigo.disable();
        DTOEstructuraTipoImpuesto dtoEstructTI = controlador.TraerEstructuraTI(dtoIS);
        
        TextoCodigo.setText(dtoEstructTI.getCodigoDTOTipoImpuesto());
        TextoNombre.setText(dtoEstructTI.getNombreDTOTipoImpuesto());
        String []Datos = new String[2];
        for (DTOAtributoAdicional dtoAA : dtoEstructTI.getDTOAtributoAdicionalList())
        {
            Datos[0]=dtoAA.getCodigoAtributoAdicional();
            String a = String.valueOf(dtoAA.getOrden());
            Datos[1]=a;
            modeloTabla.addRow(Datos);
        }
        this.TablaOrdenAtributo.setModel(modeloTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextoCodigo = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaOrdenAtributo = new javax.swing.JTable();
        BotonAgregarAtributoAdicional = new javax.swing.JButton();
        BotonAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BotonEliminarAtributo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("TipoImpuesto");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        TextoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCodigoActionPerformed(evt);
            }
        });

        TablaOrdenAtributo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaOrdenAtributo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaOrdenAtributo.setUpdateSelectionOnSort(false);
        TablaOrdenAtributo.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(TablaOrdenAtributo);

        BotonAgregarAtributoAdicional.setText("AgregarAtributo");
        BotonAgregarAtributoAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarAtributoAdicionalActionPerformed(evt);
            }
        });

        BotonAceptar.setText("Aceptar");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        jLabel3.setText("Modifique datos correspondientes.");

        BotonEliminarAtributo.setText("EliminarAtributo");
        BotonEliminarAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarAtributoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonEliminarAtributo)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAgregarAtributoAdicional))
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(26, 26, 26)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(TextoCodigo)))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addComponent(BotonAceptar))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregarAtributoAdicional)
                    .addComponent(BotonEliminarAtributo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(BotonAceptar)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCodigoActionPerformed

    DefaultTableModel TablaGuardada = new DefaultTableModel();
    private void BotonAgregarAtributoAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarAtributoAdicionalActionPerformed
       
        InterfazAtributoAdicional nuevaInterfaz2 = new InterfazAtributoAdicional(controlador, this);
        nuevaInterfaz2.setVisible(true);
        
    }//GEN-LAST:event_BotonAgregarAtributoAdicionalActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        DTOEstructuraTipoImpuesto dtoEstructura= new DTOEstructuraTipoImpuesto();
        if (TextoCodigo.getText()!=null && !TextoCodigo.getText().trim().isEmpty() && TextoNombre.getText()!=null && !TextoNombre.getText().trim().isEmpty())
            {
            dtoEstructura.setCodigoDTOTipoImpuesto(TextoCodigo.getText());
            dtoEstructura.setNombreDTOTipoImpuesto(TextoNombre.getText());
            List<DTOAtributoAdicional> dtoAAList = new ArrayList<>();
            for (int fila = 0; fila < TablaOrdenAtributo.getRowCount(); fila++)             //cambio modeloAguardar por TablaOrdenAtributo
                {
                    DTOAtributoAdicional dtoAA = new DTOAtributoAdicional();
                    String h = TablaOrdenAtributo.getValueAt(fila, 0).toString();
                    dtoAA.setCodigoAtributoAdicional(h);
                    Object r = TablaOrdenAtributo.getValueAt(fila, 1);
                    dtoAA.setOrden( Integer.parseInt(String.valueOf(r)));
                    dtoAAList.add(dtoAA);
                }
                dtoEstructura.setDTOAtributoAdicionalList(dtoAAList);
                pantallaPrincipal.GuardarTipoImpuestoAA(dtoEstructura, Agregar);
                this.setVisible(false);
            }
            else{ JOptionPane.showMessageDialog(null, "Esta vacio campos Nombre o Codigo.");
        }         
    }//GEN-LAST:event_BotonAceptarActionPerformed

    private void BotonEliminarAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarAtributoActionPerformed
        
        int fila = TablaOrdenAtributo.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel)TablaOrdenAtributo.getModel(); 
        modelo.removeRow(fila); 
        
    }//GEN-LAST:event_BotonEliminarAtributoActionPerformed

    public void ConfirmarAtributoAdicional(DTOAA dtoAA, int a)
    {
        String []Datos = new String[10];
        Datos[0] = dtoAA.getCodigo();
        Datos[1] = String.valueOf(dtoAA.getOrden());
        modeloTabla.addRow(Datos);  
        this.modeloAguardar = modeloTabla;
    }
      
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
            java.util.logging.Logger.getLogger(InterfazTipoImpuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazTipoImpuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazTipoImpuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazTipoImpuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazTipoImpuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonAgregarAtributoAdicional;
    private javax.swing.JButton BotonEliminarAtributo;
    private javax.swing.JTable TablaOrdenAtributo;
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
