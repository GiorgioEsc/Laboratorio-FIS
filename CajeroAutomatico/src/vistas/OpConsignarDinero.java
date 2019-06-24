package vistas;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Antonio
 */
public class OpConsignarDinero extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicial1
     */
    public OpConsignarDinero() {
        initComponents();
    }

    public JButton getCien() {
        return cien;
    }

    public JButton getCincuenta() {
        return cincuenta;
    }

    public JButton getDoscientos() {
        return doscientos;
    }

    public JTextField getMontoManual() {
        return montoManual;
    }

    public JButton getQuinientos() {
        return quinientos;
    }

    public JButton getConsignar() {
        return consignar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cincuenta = new javax.swing.JButton();
        doscientos = new javax.swing.JButton();
        cien = new javax.swing.JButton();
        quinientos = new javax.swing.JButton();
        consignar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        montoManual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cincuenta.setBorder(null);
        cincuenta.setContentAreaFilled(false);
        getContentPane().add(cincuenta);
        cincuenta.setBounds(30, 140, 60, 40);

        doscientos.setBorder(null);
        doscientos.setContentAreaFilled(false);
        getContentPane().add(doscientos);
        doscientos.setBounds(30, 190, 60, 40);

        cien.setBorder(null);
        cien.setContentAreaFilled(false);
        getContentPane().add(cien);
        cien.setBounds(640, 140, 60, 40);

        quinientos.setBorder(null);
        quinientos.setContentAreaFilled(false);
        getContentPane().add(quinientos);
        quinientos.setBounds(640, 190, 60, 40);

        consignar.setBorder(null);
        consignar.setContentAreaFilled(false);
        getContentPane().add(consignar);
        consignar.setBounds(640, 240, 60, 40);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("$50.000");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 150, 90, 20);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("$200.000");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 200, 100, 20);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("$100.000");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 150, 100, 20);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("$500.000");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(510, 200, 91, 14);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OTRA CANTIDAD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 251, 180, 30);

        montoManual.setBackground(new java.awt.Color(204, 204, 204));
        montoManual.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        montoManual.setForeground(new java.awt.Color(255, 255, 255));
        montoManual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(montoManual);
        montoManual.setBounds(420, 250, 190, 30);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SELECCIONE UNA OPCION");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 70, 380, 40);

        jfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cajerofondo.jpg"))); // NOI18N
        jfondo.setText("Ingrese el numero de su tarjeta");
        getContentPane().add(jfondo);
        jfondo.setBounds(0, 0, 740, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cien;
    private javax.swing.JButton cincuenta;
    private javax.swing.JButton consignar;
    private javax.swing.JButton doscientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jfondo;
    private javax.swing.JTextField montoManual;
    private javax.swing.JButton quinientos;
    // End of variables declaration//GEN-END:variables
}
