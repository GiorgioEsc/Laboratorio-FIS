/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
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
        this.respuesta.setVisible(false);
        this.respuesta2.setVisible(false);
    }

    public JLabel getRespuesta2() {
        return respuesta2;
    }

    public JTextField getClaveAdmin() {
        return claveAdmin;
    }

    public JLabel getRespuesta() {
        return respuesta;
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

    public JButton getClear() {
        return clear;
    }

    public JButton getNum0() {
        return num0;
    }

    public JButton getNum1() {
        return num1;
    }

    public JButton getNum2() {
        return num2;
    }

    public JButton getNum3() {
        return num3;
    }

    public JButton getNum4() {
        return num4;
    }

    public JButton getNum5() {
        return num5;
    }

    public JButton getNum6() {
        return num6;
    }

    public JButton getNum7() {
        return num7;
    }

    public JButton getNum8() {
        return num8;
    }

    public JButton getNum9() {
        return num9;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idTarjetaCliente = new javax.swing.JTextField();
        claveAdmin = new javax.swing.JTextField();
        ingresarTarjeta = new javax.swing.JButton();
        ingresarClaveAdmin = new javax.swing.JButton();
        respuesta = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        bienvenida = new javax.swing.JLabel();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        respuesta2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        idTarjetaCliente.setBackground(new java.awt.Color(204, 204, 204));
        idTarjetaCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
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
        ingresarTarjeta.setForeground(new java.awt.Color(204, 204, 204));
        ingresarTarjeta.setBorder(null);
        ingresarTarjeta.setContentAreaFilled(false);
        getContentPane().add(ingresarTarjeta);
        ingresarTarjeta.setBounds(250, 490, 100, 50);

        ingresarClaveAdmin.setBackground(new java.awt.Color(204, 204, 204));
        ingresarClaveAdmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        ingresarClaveAdmin.setText("Ingresar Clave Administrativo");
        ingresarClaveAdmin.setBorder(null);
        getContentPane().add(ingresarClaveAdmin);
        ingresarClaveAdmin.setBounds(380, 540, 220, 20);

        respuesta.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        respuesta.setForeground(new java.awt.Color(51, 255, 0));
        respuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        respuesta.setText("Aceptado");
        getContentPane().add(respuesta);
        respuesta.setBounds(140, 230, 450, 90);

        titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("INGRESE EL NUMERO DE SU TARJETA");
        getContentPane().add(titulo);
        titulo.setBounds(110, 130, 500, 29);

        bienvenida.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenida.setText("Bienvenido");
        getContentPane().add(bienvenida);
        bienvenida.setBounds(110, 30, 490, 100);

        num1.setBorderPainted(false);
        num1.setContentAreaFilled(false);
        getContentPane().add(num1);
        num1.setBounds(30, 370, 50, 40);

        num2.setBorderPainted(false);
        num2.setContentAreaFilled(false);
        getContentPane().add(num2);
        num2.setBounds(100, 370, 50, 40);

        num3.setBorderPainted(false);
        num3.setContentAreaFilled(false);
        getContentPane().add(num3);
        num3.setBounds(170, 370, 60, 40);

        num4.setBorderPainted(false);
        num4.setContentAreaFilled(false);
        getContentPane().add(num4);
        num4.setBounds(30, 430, 50, 40);

        num5.setBorderPainted(false);
        num5.setContentAreaFilled(false);
        getContentPane().add(num5);
        num5.setBounds(100, 430, 50, 40);

        num6.setBorderPainted(false);
        num6.setContentAreaFilled(false);
        getContentPane().add(num6);
        num6.setBounds(170, 430, 50, 40);

        num7.setBorderPainted(false);
        num7.setContentAreaFilled(false);
        getContentPane().add(num7);
        num7.setBounds(30, 490, 50, 50);

        num8.setBorderPainted(false);
        num8.setContentAreaFilled(false);
        getContentPane().add(num8);
        num8.setBounds(100, 490, 60, 50);

        num9.setBorderPainted(false);
        num9.setContentAreaFilled(false);
        getContentPane().add(num9);
        num9.setBounds(170, 490, 60, 50);

        num0.setBorderPainted(false);
        num0.setContentAreaFilled(false);
        getContentPane().add(num0);
        num0.setBounds(100, 560, 50, 40);

        clear.setBorderPainted(false);
        clear.setContentAreaFilled(false);
        getContentPane().add(clear);
        clear.setBounds(250, 430, 100, 40);

        respuesta2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        respuesta2.setForeground(new java.awt.Color(255, 0, 0));
        respuesta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        respuesta2.setText("MAL");
        getContentPane().add(respuesta2);
        respuesta2.setBounds(140, 230, 450, 90);

        fondo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cajerofondo.jpg"))); // NOI18N
        fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 740, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JTextField claveAdmin;
    private javax.swing.JButton clear;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField idTarjetaCliente;
    private javax.swing.JButton ingresarClaveAdmin;
    private javax.swing.JButton ingresarTarjeta;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JLabel respuesta;
    private javax.swing.JLabel respuesta2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    public void setRespuesta(String aceptada_seleccione_una_opcion) {
        this.respuesta.setText(aceptada_seleccione_una_opcion);
    }
}
