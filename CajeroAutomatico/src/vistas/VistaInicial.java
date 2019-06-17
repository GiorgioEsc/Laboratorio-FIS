/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Antonio
 */
public class VistaInicial extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicial1
     */
    public VistaInicial() {
        initComponents();
    }

    public JTextField getClaveAdmin() {
        return claveAdmin;
    }

    public void setClaveAdmin(JTextField claveAdmin) {
        this.claveAdmin = claveAdmin;
    }

    public JTextField getIdTarjetaCliente() {
        return idTarjetaCliente;
    }

    public void setIdTarjetaCliente(JTextField idTarjetaCliente) {
        this.idTarjetaCliente = idTarjetaCliente;
    }

    public JButton getIngresarClaveAdmin() {
        return ingresarClaveAdmin;
    }

    public void setIngresarClaveAdmin(JButton ingresarClaveAdmin) {
        this.ingresarClaveAdmin = ingresarClaveAdmin;
    }

    public JButton getIngresarTarjeta() {
        return ingresarTarjeta;
    }

    public void setIngresarTarjeta(JButton ingresarTarjeta) {
        this.ingresarTarjeta = ingresarTarjeta;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idTarjetaCliente = new javax.swing.JTextField();
        claveAdmin = new javax.swing.JTextField();
        ingresarTarjeta = new javax.swing.JButton();
        ingresarClaveAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        idTarjetaCliente.setBackground(new java.awt.Color(204, 204, 204));
        idTarjetaCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        idTarjetaCliente.setForeground(new java.awt.Color(255, 255, 255));
        idTarjetaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idTarjetaCliente.setBorder(null);
        getContentPane().add(idTarjetaCliente);
        idTarjetaCliente.setBounds(120, 180, 470, 40);

        claveAdmin.setBackground(new java.awt.Color(102, 102, 102));
        claveAdmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        claveAdmin.setForeground(new java.awt.Color(204, 204, 204));
        claveAdmin.setText("Ingrese la clave de administrativos");
        claveAdmin.setBorder(null);
        getContentPane().add(claveAdmin);
        claveAdmin.setBounds(380, 580, 310, 17);

        ingresarTarjeta.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        ingresarTarjeta.setText("OK");
        ingresarTarjeta.setBorder(null);
        ingresarTarjeta.setContentAreaFilled(false);
        getContentPane().add(ingresarTarjeta);
        ingresarTarjeta.setBounds(260, 500, 80, 30);

        ingresarClaveAdmin.setBackground(new java.awt.Color(204, 204, 204));
        ingresarClaveAdmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        ingresarClaveAdmin.setText("Ingresar Clave Administrativo");
        ingresarClaveAdmin.setBorder(null);
        getContentPane().add(ingresarClaveAdmin);
        ingresarClaveAdmin.setBounds(380, 540, 220, 20);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESE EL NUMERO DE SU TARJETA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 130, 500, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cajerofondo.jpg"))); // NOI18N
        jLabel2.setText("Ingrese el numero de su tarjeta");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField claveAdmin;
    private javax.swing.JTextField idTarjetaCliente;
    private javax.swing.JButton ingresarClaveAdmin;
    private javax.swing.JButton ingresarTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
