
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import java.util.HashSet;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Manuel Antonio
 */
public class frmprincip extends javax.swing.JFrame {

                classdatos datos = new classdatos();
                String moto,car,bike;
                DefaultTableModel tablaa;
                Object[] objetotabla =new Object[6];
                int fila =-1;
                
                
               
        
    public frmprincip() {
        initComponents();
        setTitle("Registro Parking");
        tablaa=(DefaultTableModel) tbldatos.getModel();
        DateTimeFormatter  fecha = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter  timee = DateTimeFormatter.ofPattern("HH:mm:ss");
       System.out.println(fecha.format(LocalDateTime.now()));
       lbldate.setText(fecha.format(LocalDateTime.now()));
       lbltime.setText(timee.format(LocalDateTime.now()));
      
               }

    public void capturadedatos(){
    datos.setPlaca(txtplaca.getText());
    
     if(rbtmoro.isSelected()){
            moto="Motocicleta";
            datos.setTipoveh(moto);
        }
        else if(rbtcar.isSelected())
        {
            car="Carro"; 
            datos.setTipoveh(car);
        }
      else if(rbtbike.isSelected())
        {
            bike="Bicicleta"; 
            datos.setTipoveh(bike);
        }
     //hora de entrada
     datos.setSalida(lbltime.getText());
     //Fecha de ingreso
     datos.setEntrada(lbldate.getText());
     
     datos.setEstado(cmbstate.getSelectedItem().toString());
    
         datos.setNumreg("1");
    
            
        
          
     
     
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrupo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        rbtmoro = new javax.swing.JRadioButton();
        rbtcar = new javax.swing.JRadioButton();
        rbtbike = new javax.swing.JRadioButton();
        btnactualizar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        cmbstate = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldatos = new javax.swing.JTable();
        lbldate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bikee.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/car.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Bike-icon_30351.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, -1, 130));

        jLabel3.setText("Placa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 40, 20));
        getContentPane().add(txtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 70, -1));

        jLabel5.setText("Fecha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));
        getContentPane().add(lbltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 80, 30));

        btngrupo.add(rbtmoro);
        rbtmoro.setText("Motocicleta");
        getContentPane().add(rbtmoro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btngrupo.add(rbtcar);
        rbtcar.setText("Automovil");
        getContentPane().add(rbtcar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        btngrupo.add(rbtbike);
        rbtbike.setText("bicicleta");
        getContentPane().add(rbtbike, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        btnactualizar.setText("actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 180, 30));

        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/registro-en-linea.png"))); // NOI18N
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 150, 130));

        cmbstate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "abierto", "cerrado" }));
        cmbstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstateActionPerformed(evt);
            }
        });
        getContentPane().add(cmbstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 110, 40));

        tbldatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLACA", "TIPO VEHICULO", "HORAINGRESO", "FECHA INGRESO", "ESTADO", "NUM REGISTRO"
            }
        ));
        jScrollPane1.setViewportView(tbldatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 700, 120));
        getContentPane().add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 90, 30));

        jLabel6.setText("Hora");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        btnbuscar.setText("buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstateActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
        ///datos.setPlaca(txtplaca.getText());
       capturadedatos();
        
         DateTimeFormatter  fecha = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter  timee = DateTimeFormatter.ofPattern("HH:mm:ss");
       System.out.println(fecha.format(LocalDateTime.now()));
       lbldate.setText(fecha.format(LocalDateTime.now()));
       lbltime.setText(timee.format(LocalDateTime.now()));
       
       
        objetotabla[0]=datos.getPlaca();
       objetotabla[1]=datos.getTipoveh();
       objetotabla[2]=datos.getSalida();
       objetotabla[3]=datos.getEntrada();
       objetotabla[4]=datos.getEstado();
       objetotabla[5]=datos.getNumreg();
       tablaa.addRow(objetotabla);
       txtplaca.setText("");
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        
        if(fila != -1){
           
           
            datos.setEstado(cmbstate.getSelectedItem().toString());
           objetotabla[4]=datos.getEstado();
            fila=-1;
            
            
        }
        
        
        
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
         fila=tbldatos.getSelectedRow();
        if(tbldatos.getSelectedRow()!=-1)
        {
            datos.setPlaca(tbldatos.getValueAt(fila,0).toString());
            txtplaca.setText(tbldatos.getValueAt(fila,0).toString());
            datos.setEstado(tbldatos.getValueAt(fila,4).toString());
    
        }
        else
        {
            JOptionPane.showMessageDialog(null, "no se ha seleccionado ");
        }
    }//GEN-LAST:event_btnbuscarActionPerformed


    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmprincip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup btngrupo;
    private javax.swing.JComboBox<String> cmbstate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbltime;
    private javax.swing.JRadioButton rbtbike;
    private javax.swing.JRadioButton rbtcar;
    private javax.swing.JRadioButton rbtmoro;
    private javax.swing.JTable tbldatos;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables
}
