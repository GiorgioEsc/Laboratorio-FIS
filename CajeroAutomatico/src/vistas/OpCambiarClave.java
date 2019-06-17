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
public class OpCambiarClave extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicial1
     */
    public OpCambiarClave() {
        initComponents();
    }

    public JButton getCambiarClave() {
        return cambiarClave;
    }

    public JTextField getPrimeraContra() {
        return primeraContra;
    }

    public JTextField getSegundaContra() {
        return segundaContra;
    }
    
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cambiarClave = new javax.swing.JButton();
        primeraContra = new javax.swing.JTextField();
        segundaContra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cambiarClave.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        cambiarClave.setText("OK");
        cambiarClave.setBorder(null);
        cambiarClave.setContentAreaFilled(false);
        getContentPane().add(cambiarClave);
        cambiarClave.setBounds(260, 500, 80, 30);

        primeraContra.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        primeraContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(primeraContra);
        primeraContra.setBounds(440, 190, 160, 30);

        segundaContra.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        segundaContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(segundaContra);
        segundaContra.setBounds(440, 230, 160, 30);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CAMBIAR LA CONTRASEÑA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 70, 360, 40);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ESCRIBA LA NUEVA CONTRASEÑA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 190, 280, 30);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ESCRIBA DE NUEVO LA CONTRASEÑA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 240, 300, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cajerofondo.jpg"))); // NOI18N
        jLabel2.setText("Ingrese el numero de su tarjeta");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField primeraContra;
    private javax.swing.JTextField segundaContra;
    // End of variables declaration//GEN-END:variables
}
