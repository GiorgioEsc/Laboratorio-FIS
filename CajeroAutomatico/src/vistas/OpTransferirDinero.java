package vistas;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Antonio
 */
public class OpTransferirDinero extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicial1
     */
    public OpTransferirDinero() {
        initComponents();
    }

    public JTextField getMontoManual() {
        return monto;
    }

    public JTextField getNroCuenta(){
        return nroCuenta;
    }

    public JButton getTransferir() {
        return transferir;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transferir = new javax.swing.JButton();
        lblTransferir = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        lblNroCuenta = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        nroCuenta = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        transferir.setBorder(null);
        transferir.setContentAreaFilled(false);
        getContentPane().add(transferir);
        transferir.setBounds(640, 240, 60, 40);

        lblTransferir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblTransferir.setForeground(new java.awt.Color(255, 255, 255));
        lblTransferir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTransferir.setText("Transferir");
        getContentPane().add(lblTransferir);
        lblTransferir.setBounds(430, 240, 180, 30);

        lblMonto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblMonto.setForeground(new java.awt.Color(255, 255, 255));
        lblMonto.setText("Ingrese el monto");
        getContentPane().add(lblMonto);
        lblMonto.setBounds(110, 190, 180, 30);

        lblNroCuenta.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblNroCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblNroCuenta.setText("No. de Cuenta");
        getContentPane().add(lblNroCuenta);
        lblNroCuenta.setBounds(110, 140, 180, 30);

        monto.setBackground(new java.awt.Color(204, 204, 204));
        monto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        monto.setForeground(new java.awt.Color(255, 255, 255));
        monto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(monto);
        monto.setBounds(330, 190, 190, 30);

        nroCuenta.setBackground(new java.awt.Color(204, 204, 204));
        nroCuenta.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        nroCuenta.setForeground(new java.awt.Color(255, 255, 255));
        nroCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(nroCuenta);
        nroCuenta.setBounds(330, 140, 190, 30);

        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("MODULO DE TRANSFERENCIA");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(170, 70, 390, 40);

        jfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/cajerofondo.jpg"))); // NOI18N
        jfondo.setText("Ingrese el saldo");
        getContentPane().add(jfondo);
        jfondo.setBounds(0, 0, 740, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jfondo;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNroCuenta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTransferir;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField nroCuenta;
    private javax.swing.JButton transferir;
    // End of variables declaration//GEN-END:variables
}
