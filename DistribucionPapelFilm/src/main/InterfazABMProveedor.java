
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
public class InterfazABMProveedor extends javax.swing.JFrame {
    DefaultTableModel modeloTabla;
    private ControladorDistribucionPapelFilm controlador;
    private List<String> listCombox;
    InterfazPrincipal pantallaPrincipal;
    
    public InterfazABMProveedor() {
        initComponents();
    }

    public InterfazABMProveedor(ControladorDistribucionPapelFilm controlador, InterfazPrincipal interfaz) {
        initComponents();
        modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Habilitado");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Direccion");
        modeloTabla.addColumn("Telefono");
        this.TablaProveedor.setModel(modeloTabla);
        this.controlador = controlador;
        this.pantallaPrincipal = interfaz;
    }
    private DefaultListModel modelList(List<String> listaString)
        {
            DefaultListModel<String> model = new DefaultListModel<>();
        
            for(String string : listaString)
                {
                model.addElement(string);
                //modelList();
                }
            return model;
        }
    private void actualizarProveedor()
        {
            String a = TextoNombre.getText();
            Boolean b = CheckHabilitado.isSelected();
            String []Datos = new String[6];
            List<DTOProveedor> dtoList = controlador.BuscarProveedor(a,b);
            for (int i = 0; i < TablaProveedor.getRowCount(); i++) 
            {
                modeloTabla.removeRow(i);
                i-=1;
            }
            for(DTOProveedor dtotipo : dtoList)
            {
                Datos[0]= String.valueOf(dtotipo.getCodigoDTOProveedor());
                Datos[1]=dtotipo.getNombreDTOProveedor();
                Datos[2]=dtotipo.getFechaDTOProveedor();
                Datos[3]=dtotipo.getCorreoDTOProveedor();
                Datos[4]=dtotipo.getDireccionDTOProveedor();
                Datos[5]= String.valueOf(dtotipo.getTelefonoDTOProveedor());
                modeloTabla.addRow(Datos);
            }
        }
    
    private boolean findInString(String word, String text)
    {
        return text.indexOf(word) > -1;
    }    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ABMProveedor = new javax.swing.JInternalFrame();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CheckHabilitado = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaProveedor = new javax.swing.JTable();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ABMProveedor.setResizable(true);
        ABMProveedor.setTitle("ABMProveedor");
        ABMProveedor.setVisible(true);

        BotonModificar.setText("Modificar");
        BotonModificar.setToolTipText("");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Filtro");

        CheckHabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckHabilitadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Por Nombre:");

        jLabel3.setText("Habilitado:");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        TablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaProveedor);

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ABMProveedorLayout = new javax.swing.GroupLayout(ABMProveedor.getContentPane());
        ABMProveedor.getContentPane().setLayout(ABMProveedorLayout);
        ABMProveedorLayout.setHorizontalGroup(
            ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABMProveedorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Volver)
                    .addGroup(ABMProveedorLayout.createSequentialGroup()
                        .addGroup(ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ABMProveedorLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)
                                .addGroup(ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addGroup(ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckHabilitado)
                                    .addGroup(ABMProveedorLayout.createSequentialGroup()
                                        .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(BotonBuscar))))
                            .addGroup(ABMProveedorLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        ABMProveedorLayout.setVerticalGroup(
            ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABMProveedorLayout.createSequentialGroup()
                .addGroup(ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ABMProveedorLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ABMProveedorLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(BotonBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABMProveedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckHabilitado)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(ABMProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ABMProveedorLayout.createSequentialGroup()
                        .addComponent(BotonModificar)
                        .addGap(47, 47, 47)
                        .addComponent(BotonEliminar)
                        .addGap(51, 51, 51)
                        .addComponent(BotonAgregar))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(Volver)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ABMProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ABMProveedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        int fila = TablaProveedor.getSelectedRow();
        if (fila>0)
        {DTOProveedor dtoP = new DTOProveedor(); //Proveedor Seleccionado 
        dtoP.setCodigoDTOProveedor(Integer.parseInt(modeloTabla.getValueAt(fila, 0).toString()));
        dtoP.setNombreDTOProveedor(modeloTabla.getValueAt(fila, 1).toString());
        dtoP.setCorreoDTOProveedor(modeloTabla.getValueAt(fila, 2).toString());
        dtoP.setDireccionDTOProveedor(modeloTabla.getValueAt(fila, 3).toString());
        dtoP.setTelefonoDTOProveedor(Integer.parseInt(modeloTabla.getValueAt(fila, 4).toString()));
        InterfazProveedor newInterfaz = new InterfazProveedor(controlador, this, dtoP);
        newInterfaz.setVisible(true);
        }
        else { JOptionPane.showMessageDialog(null, "No ha seleccionado ningun Proveedor para modificar.");}
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        int filaSeleccionada= TablaProveedor.getSelectedRow();
        if(filaSeleccionada>=0 && TablaProveedor.getValueAt(filaSeleccionada, 2).toString() == "SI"){
            String []Dato = new String[3];
            DTOProveedor DTOEliminado = new DTOProveedor();
            DTOEliminado.setCodigoDTOProveedor(Integer.parseInt(modeloTabla.getValueAt(filaSeleccionada, 0).toString()));
            DTOEliminado.setNombreDTOProveedor(modeloTabla.getValueAt(filaSeleccionada, 1).toString());
            modeloTabla.removeRow(filaSeleccionada);
            this.controlador.EliminarProveedor(DTOEliminado);
            String a = TextoNombre.getText();
            Boolean b = CheckHabilitado.isSelected();
            String []Datos = new String[3];

            List<DTOProveedor> dtoList = controlador.BuscarProveedor(a,b);

            for (int i = 0; i < TablaProveedor.getRowCount(); i++) {
                modeloTabla.removeRow(i);
                i-=1;
            }

            for(DTOProveedor dtoP : dtoList)
                {
                Datos[0]=String.valueOf(dtoP.getCodigoDTOProveedor());
                Datos[1]=dtoP.getNombreDTOProveedor();
                Datos[2]=dtoP.getFechaDTOProveedor();
                Datos[3]=dtoP.getCorreoDTOProveedor();
                Datos[4]=dtoP.getDireccionDTOProveedor();
                Datos[5]=String.valueOf(dtoP.getTelefonoDTOProveedor());
                modeloTabla.addRow(Datos);
            }
        }
        else{ JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun Proveedor o el seleccionado esta ya Inhabilitado.");
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        InterfazProveedor nuevaProveedor = new InterfazProveedor(controlador, this);
        nuevaProveedor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void CheckHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckHabilitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckHabilitadoActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        actualizarProveedor();
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        pantallaPrincipal.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazABMProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazABMProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazABMProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazABMProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazABMProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame ABMProveedor;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JCheckBox CheckHabilitado;
    private javax.swing.JTable TablaProveedor;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
