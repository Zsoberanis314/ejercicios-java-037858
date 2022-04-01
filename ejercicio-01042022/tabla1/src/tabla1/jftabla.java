
package tabla1;

import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class jftabla extends javax.swing.JFrame {
Cpersona persona=new Cpersona();
   DefaultTableModel tabla;
    Object[] objetotabla =new Object[5];
    int fila =-1;
    
    public jftabla() {
        initComponents();
        setTitle("Tabla");
        setLocationRelativeTo(null);
        
        //definicioon de tabla con titulos
        tabla=(DefaultTableModel) tbldatos.getModel();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbldatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        pntitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpndatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        pnpbotones = new javax.swing.JPanel();
        btnañadir = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbldatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Direccion", "Edad", "Correo Electronico"
            }
        ));
        jScrollPane1.setViewportView(tbldatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 482, 125));

        jLabel1.setText("FORMULARIO DE DATOS");

        javax.swing.GroupLayout pntituloLayout = new javax.swing.GroupLayout(pntitulo);
        pntitulo.setLayout(pntituloLayout);
        pntituloLayout.setHorizontalGroup(
            pntituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pntituloLayout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        pntituloLayout.setVerticalGroup(
            pntituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pntituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Direccion");

        jLabel5.setText("Edad");

        jLabel6.setText("Correo Electronico");

        javax.swing.GroupLayout jpndatosLayout = new javax.swing.GroupLayout(jpndatos);
        jpndatos.setLayout(jpndatosLayout);
        jpndatosLayout.setHorizontalGroup(
            jpndatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpndatosLayout.createSequentialGroup()
                .addGroup(jpndatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpndatosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jpndatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)))
                    .addGroup(jpndatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(78, 78, 78)
                .addGroup(jpndatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnombre)
                    .addComponent(txtapellido)
                    .addComponent(txtdireccion)
                    .addComponent(txtedad, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(txtcorreo))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jpndatosLayout.setVerticalGroup(
            jpndatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpndatosLayout.createSequentialGroup()
                .addGroup(jpndatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpndatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jpndatosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpndatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpndatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpndatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpndatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pntitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jpndatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pntitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpndatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 471, -1));

        btnañadir.setText("añadir");
        btnañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadirActionPerformed(evt);
            }
        });

        btnmodificar.setText("modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnbuscar.setText("buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnpbotonesLayout = new javax.swing.GroupLayout(pnpbotones);
        pnpbotones.setLayout(pnpbotonesLayout);
        pnpbotonesLayout.setHorizontalGroup(
            pnpbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpbotonesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnpbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnañadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        pnpbotonesLayout.setVerticalGroup(
            pnpbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpbotonesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnañadir)
                .addGap(18, 18, 18)
                .addComponent(btnmodificar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addGap(18, 18, 18)
                .addComponent(btnbuscar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(pnpbotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 190, 200));

        jButton1.setText("enviar a ventana 2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiar(){
    txtnombre.setText("");
    txtapellido.setText("");
    txtdireccion.setText("");
    txtedad.setText("");
    txtcorreo.setText("");
    
}
    
    private void btnañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadirActionPerformed
       persona.setNombre(txtnombre.getText());
       persona.setApellido(txtapellido.getText());
       persona.setDireccion(txtdireccion.getText());
       persona.setEdad(txtedad.getText());
       persona.setCorreo(txtcorreo.getText());
        
        objetotabla[0]=persona.getNombre();
       objetotabla[1]=persona.getApellido();
       objetotabla[2]=persona.getDireccion();
       objetotabla[3]=persona.getEdad();
       objetotabla[4]=persona.getCorreo();
       
       tabla.addRow(objetotabla);
       limpiar();
    }//GEN-LAST:event_btnañadirActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

        if(fila != -1){
            
            persona.setNombre(txtnombre.getText());
            persona.setApellido(txtapellido.getText());
            persona.setDireccion(txtdireccion.getText());
            persona.setEdad(txtedad.getText());
            persona.setCorreo(txtcorreo.getText());
            tbldatos.setValueAt(txtnombre.getText(),fila,0);
            tbldatos.setValueAt(txtapellido.getText(),fila,1);
            tbldatos.setValueAt(txtdireccion.getText(),fila,2);
            tbldatos.setValueAt(txtedad.getText(),fila,3);
            tbldatos.setValueAt(txtcorreo.getText(),fila,4);
            fila=-1;
            limpiar();
            
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        if(tbldatos.getSelectedRow()!=-1){
                tabla.removeRow(tbldatos.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Se elimino correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        fila=tbldatos.getSelectedRow();
        if(tbldatos.getSelectedRow()!=-1)
        {
            persona.setNombre(tbldatos.getValueAt(fila,0).toString());
            persona.setApellido(tbldatos.getValueAt(fila,1).toString());
            persona.setDireccion(tbldatos.getValueAt(fila,2).toString());
            persona.setEdad(tbldatos.getValueAt(fila,3).toString());
            persona.setCorreo(tbldatos.getValueAt(fila,4).toString());
            txtnombre.setText(tbldatos.getValueAt(fila,0).toString());
            txtapellido.setText(tbldatos.getValueAt(fila,1).toString());
            txtdireccion.setText(tbldatos.getValueAt(fila,2).toString());
            txtedad.setText(tbldatos.getValueAt(fila,3).toString());
            txtcorreo.setText(tbldatos.getValueAt(fila,4).toString());
            btnañadir.setEnabled(false);
            btneliminar.setEnabled(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "no se ha seleccionado ");
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmverdatos ventanad =new frmverdatos();
        ventanad.setVisible(true);
        this.setVisible(false);
        ventanad.atxtdatos.setText(persona.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jftabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnañadir;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpndatos;
    private javax.swing.JPanel pnpbotones;
    private javax.swing.JPanel pntitulo;
    private javax.swing.JTable tbldatos;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
