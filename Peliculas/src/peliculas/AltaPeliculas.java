/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author f-er9
 */
public class AltaPeliculas extends javax.swing.JFrame {

    DefaultListModel modeloLista = new DefaultListModel();
    String nombre,apellid,dir,tel,id;
   
  
    int[] num = new int[5];
    private static Connection conn=null;
    private static String user ="hr4";
    private static String pass ="ferdo953";
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection(url,user,pass);
            conn.setAutoCommit(false);
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Conexion erronea E");
        }
        return conn;
    }
    public AltaPeliculas() {
        initComponents();
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtcal = new javax.swing.JTextField();
        txtest = new javax.swing.JTextField();
        txtgen = new javax.swing.JTextField();
        txtpro = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        txtpel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\EasyQuery\\Imagenes\\armario.png")); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 140, 40));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\EasyQuery\\Imagenes\\NuevoRegistro.png")); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 130, 40));

        jButton3.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/EasyQuery/Imagenes/generatetables_ok_home_out_edit_generar_1491 (1).png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, 40));
        jPanel1.add(txtcal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 90, -1));
        jPanel1.add(txtest, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 90, -1));
        jPanel1.add(txtgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, -1));
        jPanel1.add(txtpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 90, -1));
        jPanel1.add(txtdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 90, -1));
        jPanel1.add(txtpel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 120, -1));

        jLabel1.setText("Nombre Pelicula");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setText("Director");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel4.setText("Productora");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setText("Genero ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel5.setText("Estreno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel6.setText("Caliicacion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jTabbedPane1.addTab("ALTA PRODUCTOS", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Connection con = getConection();
        try{
            System.out.println("hola");
                ps = (PreparedStatement) con.prepareStatement("INSERT INTO peliculas(ID,NOMBRE,DIRECTOR,PRODUCTORA,GENERO,ESTRENO,CALIFICACION)"
                    + "VALUES(index1.nextval,?,?,?,?,?,?)");
            System.out.println("hola");
                ps.setString(1, txtpel.getText());
                ps.setString(1, txtdir.getText());
                ps.setString(1, txtpro.getText());
                ps.setString(1, txtgen.getText());
                ps.setInt(6, Integer.parseInt(txtest.getText()));
                ps.setString(1, txtcal.getText());
                System.out.println("hola");
                int res = ps.executeUpdate();
            System.out.println("hola");
                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Producto Guardado exitosamente");
                    AltaPeliculas f=new AltaPeliculas();
                    dispose();
                    f.show();

                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar al Producto:(");

                }

                con.close();

            } catch (Exception e) {
            } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AltaPeliculas f=new AltaPeliculas();
          dispose();
          f.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
          Formulariopeliculas f=new Formulariopeliculas();
        dispose();
        f.show();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AltaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtcal;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtest;
    private javax.swing.JTextField txtgen;
    private javax.swing.JTextField txtpel;
    private javax.swing.JTextField txtpro;
    // End of variables declaration//GEN-END:variables
}
