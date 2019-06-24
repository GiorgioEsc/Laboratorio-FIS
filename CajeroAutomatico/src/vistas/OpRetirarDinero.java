package vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Antonio
 */
public class OpRetirarDinero extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicial1
     */
    public OpRetirarDinero() {
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

    public JButton getRetirar() {
        return retirar;
    }

    public JButton getBtnOK() {
        return btnOK;
    }

    public JButton getCancelar() {
        return cancelar;
    }

    public JButton getLimpiar() {
        return limpiar;
    }

    public JLabel getLblRespuesta() {
        return lblRespuesta;
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

        cincuenta = new javax.swing.JButton();
        doscientos = new javax.swing.JButton();
        cien = new javax.swing.JButton();
        quinientos = new javax.swing.JButton();
        retirar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        montoManual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        lblRespuesta = new javax.swing.JLabel();
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

        retirar.setBorder(null);
        retirar.setContentAreaFilled(false);
        getContentPane().add(retirar);
        retirar.setBounds(640, 240, 60, 40);

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

        btnOK.setBorderPainted(false);
        btnOK.setContentAreaFilled(false);
        getContentPane().add(btnOK);
        btnOK.setBounds(250, 500, 100, 40);

        num1.setBorderPainted(false);
        num1.setContentAreaFilled(false);
        getContentPane().add(num1);
        num1.setBounds(30, 370, 50, 40);

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
        num6.setBounds(180, 430, 50, 40);

        num7.setBorderPainted(false);
        num7.setContentAreaFilled(false);
        getContentPane().add(num7);
        num7.setBounds(30, 500, 50, 40);

        num8.setBorderPainted(false);
        num8.setContentAreaFilled(false);
        getContentPane().add(num8);
        num8.setBounds(100, 500, 50, 40);

        num9.setBorderPainted(false);
        num9.setContentAreaFilled(false);
        getContentPane().add(num9);
        num9.setBounds(170, 500, 50, 40);

        num0.setBorderPainted(false);
        num0.setContentAreaFilled(false);
        getContentPane().add(num0);
        num0.setBounds(100, 560, 50, 40);

        cancelar.setBorderPainted(false);
        cancelar.setContentAreaFilled(false);
        getContentPane().add(cancelar);
        cancelar.setBounds(250, 370, 110, 40);

        num2.setBorderPainted(false);
        num2.setContentAreaFilled(false);
        getContentPane().add(num2);
        num2.setBounds(100, 370, 50, 40);

        num3.setBorderPainted(false);
        num3.setContentAreaFilled(false);
        getContentPane().add(num3);
        num3.setBounds(180, 370, 50, 40);

        limpiar.setBorderPainted(false);
        limpiar.setContentAreaFilled(false);
        getContentPane().add(limpiar);
        limpiar.setBounds(240, 430, 120, 40);

        lblRespuesta.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        lblRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblRespuesta);
        lblRespuesta.setBounds(110, 284, 490, 40);

        jfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cajerofondo.jpg"))); // NOI18N
        jfondo.setText("Ingrese el numero de su tarjeta");
        getContentPane().add(jfondo);
        jfondo.setBounds(0, 0, 740, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cien;
    private javax.swing.JButton cincuenta;
    private javax.swing.JButton doscientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jfondo;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField montoManual;
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
    private javax.swing.JButton quinientos;
    private javax.swing.JButton retirar;
    // End of variables declaration//GEN-END:variables
}
