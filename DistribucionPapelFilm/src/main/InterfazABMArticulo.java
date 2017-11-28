
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
public class InterfazABMArticulo extends javax.swing.JFrame {
    DefaultTableModel modeloTabla;
    private ControladorDistribucionPapelFilm controlador;
    InterfazPrincipal pantallaPrincipal;
    /**
     * Creates new form InterfazABMArticulo
     */
    public InterfazABMArticulo() {
        initComponents();
    }
    public InterfazABMArticulo(ControladorDistribucionPapelFilm controlador, InterfazPrincipal interfaz) {
        initComponents();
        modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripcion");
        modeloTabla.addColumn("Habilitado");
        this.Tabla.setModel(modeloTabla);
        this.controlador = controlador;
        this.pantallaPrincipal = interfaz;
        List<DTOArticulo> dtoList = controlador.BuscarArticulo("",false);
            for (int i = 0; i < Tabla.getRowCount(); i++) 
            {
                modeloTabla.removeRow(i);
                i-=1;
            }
            String []Dat = new String[4];
            for(DTOArticulo dtotipo : dtoList)
            {
                Dat[0]= String.valueOf(dtotipo.getCodigoDTOArticulo());
                Dat[1]=dtotipo.getNombreDTOArticulo();
                Dat[2]=dtotipo.getDescripcionDTOArticulo();
                Dat[3]=dtotipo.getFechaDTOArticulo();
                modeloTabla.addRow(Dat);
            }
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
    private void actualizar()
        {
            String a = TextoNombre.getText();
            Boolean b = CheckHabilitado.isSelected();
            String []Datos = new String[4];
            List<DTOArticulo> dtoList = controlador.BuscarArticulo(a,b);
            for (int i = 0; i < Tabla.getRowCount(); i++) 
            {
                modeloTabla.removeRow(i);
                i-=1;
            }
            for(DTOArticulo dtotipo : dtoList)
            {
                Datos[0]=String.valueOf(dtotipo.getCodigoDTOArticulo());
                Datos[1]=dtotipo.getNombreDTOArticulo();
                Datos[2]=dtotipo.getDescripcionDTOArticulo();
                Datos[3]=dtotipo.getFechaDTOArticulo();
                modeloTabla.addRow(Datos);
            }
        }
    
    public void GuardarArticulo(DTOArticulo dto, boolean Agregar)
    {
        controlador.GuardarArticulo(dto, Agregar);
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ABMArticulo = new javax.swing.JInternalFrame();
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
        Tabla = new javax.swing.JTable();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ABMArticulo.setResizable(true);
        ABMArticulo.setTitle("ABMArticulo");
        ABMArticulo.setVisible(true);

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

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(Tabla);

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ABMArticuloLayout = new javax.swing.GroupLayout(ABMArticulo.getContentPane());
        ABMArticulo.getContentPane().setLayout(ABMArticuloLayout);
        ABMArticuloLayout.setHorizontalGroup(
            ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABMArticuloLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ABMArticuloLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addGroup(ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckHabilitado)
                            .addGroup(ABMArticuloLayout.createSequentialGroup()
                                .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(BotonBuscar))))
                    .addGroup(ABMArticuloLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABMArticuloLayout.createSequentialGroup()
                                .addComponent(Volver)
                                .addGap(27, 27, 27)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        ABMArticuloLayout.setVerticalGroup(
            ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABMArticuloLayout.createSequentialGroup()
                .addGroup(ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ABMArticuloLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ABMArticuloLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(BotonBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABMArticuloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckHabilitado)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(ABMArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ABMArticuloLayout.createSequentialGroup()
                        .addComponent(BotonModificar)
                        .addGap(47, 47, 47)
                        .addComponent(BotonEliminar)
                        .addGap(51, 51, 51)
                        .addComponent(BotonAgregar))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Volver)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ABMArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ABMArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        int fila = Tabla.getSelectedRow();
        if (fila>=0)
        {DTOArticulo dto = new DTOArticulo(); //Articulo Seleccionado
            dto.setCodigoDTOArticulo(Integer.parseInt(modeloTabla.getValueAt(fila, 0).toString()));
            dto.setNombreDTOArticulo(modeloTabla.getValueAt(fila, 1).toString());
            dto.setDescripcionDTOArticulo(modeloTabla.getValueAt(fila, 2).toString());
            InterfazArticulo newInterfaz = new InterfazArticulo(controlador, this, dto);
            newInterfaz.setVisible(true);
            this.dispose();
        }
        else { JOptionPane.showMessageDialog(null, "No ha seleccionado ningun Articulo para modificar.");}
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        int filaSeleccionada= Tabla.getSelectedRow();
        if(filaSeleccionada>=0 && Tabla.getValueAt(filaSeleccionada, 3).toString() == "SI"){
            System.out.println("el valor es "+Tabla.getValueAt(filaSeleccionada, 3));
            DTOArticulo DTOEliminado = new DTOArticulo();
            DTOEliminado.setCodigoDTOArticulo(Integer.parseInt(modeloTabla.getValueAt(filaSeleccionada, 0).toString()));
            modeloTabla.removeRow(filaSeleccionada);
            this.controlador.EliminarArticulo(DTOEliminado);
            String a = TextoNombre.getText();
            Boolean b = CheckHabilitado.isSelected();
            String []Datos = new String[4];
            List<DTOArticulo> dtoList = controlador.BuscarArticulo(a,b);
            for (int i = 0; i < Tabla.getRowCount(); i++) {
                modeloTabla.removeRow(i);
                i-=1;
            }
            for(DTOArticulo dto : dtoList)
            {
                Datos[0]=String.valueOf(dto.getCodigoDTOArticulo());
                Datos[1]=dto.getNombreDTOArticulo();
                Datos[2]=dto.getDescripcionDTOArticulo();
                Datos[3]=dto.getFechaDTOArticulo();
                modeloTabla.addRow(Datos);
            }
        }
        else{ JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun Articulo o el seleccionado esta ya Inhabilitado.");
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        InterfazArticulo nuevaArticulo = new InterfazArticulo(controlador, this);
        nuevaArticulo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void CheckHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckHabilitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckHabilitadoActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        actualizar();
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
            java.util.logging.Logger.getLogger(InterfazABMArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazABMArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazABMArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazABMArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazABMArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame ABMArticulo;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JCheckBox CheckHabilitado;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}