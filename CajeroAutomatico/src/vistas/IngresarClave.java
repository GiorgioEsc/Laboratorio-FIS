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
public class IngresarClave extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicial1
     */
    public IngresarClave() {
        initComponents();
    }

    public JButton getAceptar() {
        return aceptar;
    }

    public JTextField getCampoClave() {
        return campoClave;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        aceptar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        aceptar.setText("OK");
        aceptar.setBorder(null);
        aceptar.setContentAreaFilled(false);
        getContentPane().add(aceptar);
        aceptar.setBounds(260, 500, 80, 30);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESE SU CONTRASEÑA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 120, 360, 50);

        campoClave.setBackground(new java.awt.Color(204, 204, 204));
        campoClave.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        getContentPane().add(campoClave);
        campoClave.setBounds(140, 190, 450, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cajerofondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField campoClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
