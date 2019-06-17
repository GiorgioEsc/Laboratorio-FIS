/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JButton;


/**
 *
 * @author Antonio
 */
public class ElegirOperacion extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicial1
     */
    public ElegirOperacion() {
        initComponents();
    }

    public JButton getCambiarClave() {
        return cambiarClave;
    }

    public JButton getConsignarDinero() {
        return consignarDinero;
    }

    public JButton getConsultarSaldo() {
        return consultarSaldo;
    }

    public JButton getRetirarDinero() {
        return retirarDinero;
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cambiarClave = new javax.swing.JButton();
        consultarSaldo = new javax.swing.JButton();
        retirarDinero = new javax.swing.JButton();
        consignarDinero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cambiarClave.setBorder(null);
        cambiarClave.setContentAreaFilled(false);
        getContentPane().add(cambiarClave);
        cambiarClave.setBounds(20, 140, 70, 40);

        consultarSaldo.setBorder(null);
        consultarSaldo.setContentAreaFilled(false);
        getContentPane().add(consultarSaldo);
        consultarSaldo.setBounds(630, 140, 80, 40);

        retirarDinero.setBorder(null);
        retirarDinero.setContentAreaFilled(false);
        getContentPane().add(retirarDinero);
        retirarDinero.setBounds(630, 190, 80, 40);

        consignarDinero.setBorder(null);
        consignarDinero.setContentAreaFilled(false);
        getContentPane().add(consignarDinero);
        consignarDinero.setBounds(20, 190, 70, 40);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CAMBIAR CONTRASEÑA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 160, 180, 15);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONSULTAR SALDO DISPONIBLE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 160, 230, 15);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONSIGNAR DINERO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 200, 160, 20);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RETIRAR DINERO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 200, 130, 15);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SELECCIONE UNA OPCION ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 60, 351, 50);

        jfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cajerofondo.jpg"))); // NOI18N
        jfondo.setText("elija una opcion d");
        getContentPane().add(jfondo);
        jfondo.setBounds(0, 0, 740, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarClave;
    private javax.swing.JButton consignarDinero;
    private javax.swing.JButton consultarSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jfondo;
    private javax.swing.JButton retirarDinero;
    // End of variables declaration//GEN-END:variables
}
