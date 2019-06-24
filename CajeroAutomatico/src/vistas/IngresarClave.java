/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
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
        this.lblDer.setVisible(false);
        this.lblIzq.setVisible(false);
        this.lblRespuesta.setVisible(false);
        
        
    }

    public JTextArea getLblRespuesta() {
        return lblRespuesta;
    }

    public JLabel getLblDer() {
        return lblDer;
    }

    public JLabel getLblIzq() {
        return lblIzq;
    }

    public JButton getBtnDer() {
        return btnDer;
    }

    public JButton getBtnIzq() {
        return btnIzq;
    }

    public JButton getAceptar() {
        return aceptar;
    }

    public JTextField getCampoClave() {
        return campoClave;
    }

    public JButton getCancelar() {
        return cancelar;
    }

    public JButton getClear() {
        return clear;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        btnIzq = new javax.swing.JButton();
        btnDer = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoClave = new javax.swing.JPasswordField();
        lblIzq = new javax.swing.JLabel();
        lblDer = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JTextArea();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cancelar.setBorderPainted(false);
        cancelar.setContentAreaFilled(false);
        getContentPane().add(cancelar);
        cancelar.setBounds(240, 370, 120, 40);

        aceptar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        aceptar.setBorder(null);
        aceptar.setContentAreaFilled(false);
        getContentPane().add(aceptar);
        aceptar.setBounds(250, 500, 100, 30);

        btnIzq.setBorderPainted(false);
        btnIzq.setContentAreaFilled(false);
        getContentPane().add(btnIzq);
        btnIzq.setBounds(20, 240, 120, 40);

        btnDer.setBorderPainted(false);
        btnDer.setContentAreaFilled(false);
        getContentPane().add(btnDer);
        btnDer.setBounds(580, 240, 120, 40);

        clear.setBorderPainted(false);
        clear.setContentAreaFilled(false);
        getContentPane().add(clear);
        clear.setBounds(240, 430, 120, 40);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESE SU CONTRASEÑA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 120, 360, 50);

        campoClave.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        campoClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoClave.setEchoChar('\u2022');
        getContentPane().add(campoClave);
        campoClave.setBounds(250, 190, 230, 40);

        lblIzq.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblIzq.setForeground(new java.awt.Color(255, 255, 255));
        lblIzq.setText("NO");
        getContentPane().add(lblIzq);
        lblIzq.setBounds(100, 240, 100, 30);

        lblDer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDer.setForeground(new java.awt.Color(255, 255, 255));
        lblDer.setText("SI");
        getContentPane().add(lblDer);
        lblDer.setBounds(570, 240, 40, 30);

        lblRespuesta.setBackground(new java.awt.Color(0, 0, 0));
        lblRespuesta.setColumns(50);
        lblRespuesta.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        lblRespuesta.setForeground(new java.awt.Color(0, 255, 204));
        lblRespuesta.setLineWrap(true);
        lblRespuesta.setRows(9);
        lblRespuesta.setWrapStyleWord(true);
        lblRespuesta.setDisabledTextColor(new java.awt.Color(153, 255, 255));
        lblRespuesta.setFocusable(false);
        getContentPane().add(lblRespuesta);
        lblRespuesta.setBounds(110, 30, 510, 300);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cajerofondo.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 740, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton btnDer;
    private javax.swing.JButton btnIzq;
    private javax.swing.JPasswordField campoClave;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton clear;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDer;
    private javax.swing.JLabel lblIzq;
    private javax.swing.JTextArea lblRespuesta;
    // End of variables declaration//GEN-END:variables
}
