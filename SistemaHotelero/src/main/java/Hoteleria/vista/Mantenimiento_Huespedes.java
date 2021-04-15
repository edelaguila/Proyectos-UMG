/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoteleria.vista;

import Hoteleria.datos.HuespedesDAO;
import Hoteleria.dominio.Huespedes;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author leelu
 */
public class Mantenimiento_Huespedes extends javax.swing.JInternalFrame {
    DefaultTableModel modelo1;
    DefaultTableCellRenderer centro= new DefaultTableCellRenderer();
    /**
     * Creates new form Mantenimiento_Huespedes
     */
    public Mantenimiento_Huespedes() {
        initComponents();
        actualizartabla();
    }
    
    private static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
    private void limpiar(){
        txt_codigo.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_nacionalidad.setText("");
        txt_direccion.setText("");
        txt_frecuencia.setText("");
        txt_telefono.setText("");
        txt_nit.setText("");
    }
    private void actualizartabla(){
        modelo1=new DefaultTableModel();   
        modelo1.addColumn("CODIGO");      
        modelo1.addColumn("NOMBRE");
        modelo1.addColumn("APELLIDO");      
        modelo1.addColumn("NACIONALIDAD");
        modelo1.addColumn("DIRECCION");
        modelo1.addColumn("FRECUENCIA");
        modelo1.addColumn("TELEFONO");
        modelo1.addColumn("NIT");
        tabla.setModel(modelo1);
        centro.setHorizontalAlignment(JLabel.CENTER);
        tabla.getColumnModel().getColumn(2).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(0).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(1).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(3).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(4).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(5).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(6).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(7).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(75);        
        tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(6).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(7).setPreferredWidth(100);
        HuespedesDAO huespedes = new HuespedesDAO();
        List<Huespedes> listarmetodos = huespedes.select();
        String datos[]= new String[8];
        for (Huespedes listar : listarmetodos) {
                datos[0]=listar.getCodigo();
               datos[1]=listar.getNombre();
               datos[2]=listar.getApellido();
               datos[3]=listar.getNacionalidad();
               datos[4]=listar.getDireccion();
               datos[5]=listar.getFrecuencia();
               datos[6]=listar.getTelefono();
               datos[7]=listar.getNit();
               modelo1.addRow(datos);
               tabla.setModel(modelo1);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_nacionalidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_frecuencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Mantenimiento Huespedes");

        jLabel1.setText("CODIGO:");

        jLabel2.setText("NOMBRE:");

        btn_guardar.setText("AGREGAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_modificar.setText("EDITAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel3.setText("APELLIDO:");

        jLabel6.setText("NACIONALIDAD:");

        jLabel7.setText("DIRECCION:");

        jLabel8.setText("FRECUENCIA:");

        jLabel9.setText("TELEFONO:");

        jLabel10.setText("NIT:");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addComponent(txt_nombre)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nacionalidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_direccion)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_frecuencia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nit, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_frecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel1.getAccessibleContext().setAccessibleName("Huespedes:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (Mantenimiento_Huespedes.isNumeric(txt_codigo.getText())) {
            if (txt_codigo.getText().length()!=0&&txt_nombre.getText().length()!=0&&txt_apellido.getText().length()!=0&&
                    txt_nacionalidad.getText().length()!=0&&txt_direccion.getText().length()!=0&&
                    txt_frecuencia.getText().length()!=0&&txt_telefono.getText().length()!=0&&
                    txt_nit.getText().length()!=0) {
            HuespedesDAO huespedesdao = new HuespedesDAO();
            Huespedes guardarmetodo = new Huespedes();
            guardarmetodo.setCodigo(txt_codigo.getText());
            guardarmetodo.setNombre(txt_nombre.getText());
            guardarmetodo.setApellido(txt_apellido.getText());
            guardarmetodo.setNacionalidad(txt_nacionalidad.getText());
            guardarmetodo.setDireccion(txt_direccion.getText());
            guardarmetodo.setFrecuencia(txt_frecuencia.getText());
            guardarmetodo.setTelefono(txt_telefono.getText());
            guardarmetodo.setNit(txt_nit.getText());
            huespedesdao.insert(guardarmetodo);
            actualizartabla();
            JOptionPane.showMessageDialog(null, "Huesped guardado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Existen campos vacios, por favor revise y llene los campos");
        }
        }else{
            JOptionPane.showMessageDialog(null, "El No. de identificacion del huesped, unicamente pueden ser números");
        }
        limpiar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (Mantenimiento_Huespedes.isNumeric(txt_codigo.getText())) {
            if (txt_codigo.getText().length()!=0&&txt_nombre.getText().length()!=0&&txt_apellido.getText().length()!=0&&
                    txt_nacionalidad.getText().length()!=0&&txt_direccion.getText().length()!=0&&
                    txt_frecuencia.getText().length()!=0&&txt_telefono.getText().length()!=0&&
                    txt_nit.getText().length()!=0) {
            HuespedesDAO huespedesdao = new HuespedesDAO();
            Huespedes modificarmetodo = new Huespedes();
            modificarmetodo.setCodigo(txt_codigo.getText());
            modificarmetodo.setNombre(txt_nombre.getText());
            modificarmetodo.setApellido(txt_apellido.getText());
            modificarmetodo.setNacionalidad(txt_nacionalidad.getText());
            modificarmetodo.setDireccion(txt_direccion.getText());
            modificarmetodo.setFrecuencia(txt_frecuencia.getText());
            modificarmetodo.setTelefono(txt_telefono.getText());
            modificarmetodo.setNit(txt_nit.getText());
            huespedesdao.update(modificarmetodo);
            actualizartabla();
            JOptionPane.showMessageDialog(null, "Huesped actualizado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Existen campos vacios, por favor revise y llene los campos");
        }
        }else{
            JOptionPane.showMessageDialog(null, "El No. de indentificacion del huesped, unicamente pueden ser números");
        }
        limpiar();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if (Mantenimiento_Huespedes.isNumeric(txt_codigo.getText())) {

            HuespedesDAO huespedesdao = new HuespedesDAO();
            Huespedes buscarmetodo = new Huespedes();

            buscarmetodo.setCodigo(txt_codigo.getText());
            buscarmetodo = huespedesdao.query(buscarmetodo);

            txt_nombre.setText(buscarmetodo.getNombre());
            txt_apellido.setText(buscarmetodo.getApellido());
            txt_nacionalidad.setText(buscarmetodo.getNacionalidad());
            txt_direccion.setText(buscarmetodo.getDireccion());
            txt_frecuencia.setText(buscarmetodo.getFrecuencia());
            txt_telefono.setText(buscarmetodo.getTelefono());
            txt_nit.setText(buscarmetodo.getNit());
        }else{
            JOptionPane.showMessageDialog(null,"El No. de indentificacion esta vacio y/o el codigo debe de ser solo números");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_frecuencia;
    private javax.swing.JTextField txt_nacionalidad;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}