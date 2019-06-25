package controladores;

import java.awt.Color;
import modelo.*;
import vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class ContrRetirarDinero implements ActionListener {

    OpRetirarDinero vistaRetirarDinero;
    SQLiteJDBCDriverConnection modeloConexion;
    TarjetaDebito modeloTarjetaDeb;
    CajeroAutomatico modeloCajeroAuto;
    Cliente modeloCliente;
    Cuenta modeloCuenta;
    IngresarClave vistaIngresarClave = new IngresarClave();

    public ContrRetirarDinero(OpRetirarDinero vistaRetirarDinero, SQLiteJDBCDriverConnection modeloConexion, TarjetaDebito modeloTarjetaDeb, CajeroAutomatico modeloCajeroAuto, Cliente modeloCliente, Cuenta modeloCuenta) {
        this.vistaRetirarDinero = vistaRetirarDinero;
        this.modeloConexion = modeloConexion;
        this.modeloTarjetaDeb = modeloTarjetaDeb;
        this.modeloCajeroAuto = modeloCajeroAuto;
        this.modeloCliente = modeloCliente;
        this.modeloCuenta = modeloCuenta;
    }

    void iniciarVista() {
        vistaRetirarDinero.getCincuenta().addActionListener(this);
        vistaRetirarDinero.getCien().addActionListener(this);
        vistaRetirarDinero.getDoscientos().addActionListener(this);
        vistaRetirarDinero.getQuinientos().addActionListener(this);
        vistaRetirarDinero.getRetirar().addActionListener(this);
        vistaRetirarDinero.getBtnOK().addActionListener(this);
        vistaRetirarDinero.getCancelar().addActionListener(this);
        vistaRetirarDinero.getLimpiar().addActionListener(this);
        vistaRetirarDinero.getNum0().addActionListener(this);
        vistaRetirarDinero.getNum1().addActionListener(this);
        vistaRetirarDinero.getNum2().addActionListener(this);
        vistaRetirarDinero.getNum3().addActionListener(this);
        vistaRetirarDinero.getNum4().addActionListener(this);
        vistaRetirarDinero.getNum5().addActionListener(this);
        vistaRetirarDinero.getNum6().addActionListener(this);
        vistaRetirarDinero.getNum7().addActionListener(this);
        vistaRetirarDinero.getNum8().addActionListener(this);
        vistaRetirarDinero.getNum9().addActionListener(this);

        vistaRetirarDinero.setTitle("Retiro en Efectivo");
        vistaRetirarDinero.pack();
        vistaRetirarDinero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistaRetirarDinero.setSize(750, 680);
        vistaRetirarDinero.setLocationRelativeTo(null);
        vistaRetirarDinero.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        int dineroEnCuenta = modeloCuenta.getSaldoActual();
        int dineroEnCajero = modeloCajeroAuto.getDineroDisponibleActual();

        if (vistaRetirarDinero.getCincuenta() == evento.getSource()) {
            if ((dineroEnCuenta >= 50000) && (dineroEnCajero >= 50000)) {
                modeloCuenta.setSaldoActual(dineroEnCuenta - 50000);
                vistaRetirarDinero.setVisible(false);

                ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrIngresarClave.iniciarVista();
            } else if (dineroEnCuenta < 50000) {

                vistaRetirarDinero.getLblRespuesta().setText("SALDO INSUFICIENTE");
                vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

            } else if (dineroEnCajero < 50000) {
                vistaRetirarDinero.getLblRespuesta().setText("CAJERO SIN RESERVAS");
                vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

            }
        } else if (vistaRetirarDinero.getCien() == evento.getSource()) {
            if ((dineroEnCuenta >= 100000) && (dineroEnCajero >= 100000)) {
                modeloCuenta.setSaldoActual(dineroEnCuenta - 100000);
                vistaRetirarDinero.setVisible(false);

                ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrIngresarClave.iniciarVista();
            } else if (dineroEnCuenta < 100000) {
                vistaRetirarDinero.getLblRespuesta().setText("SALDO INSUFICIENTE");
                vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

            } else if (dineroEnCajero < 100000) {
                vistaRetirarDinero.getLblRespuesta().setText("CAJERO SIN RESERVAS");
                vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

            }
        } else if (vistaRetirarDinero.getDoscientos() == evento.getSource()) {
            if ((dineroEnCuenta >= 200000) && (dineroEnCajero >= 200000)) {
                modeloCuenta.setSaldoActual(dineroEnCuenta - 200000);
                vistaRetirarDinero.setVisible(false);

                ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrIngresarClave.iniciarVista();
            } else if (dineroEnCuenta < 200000) {
                vistaRetirarDinero.getLblRespuesta().setText("SALDO INSUFICIENTE");
                vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

            } else if (dineroEnCajero < 200000) {
                vistaRetirarDinero.getLblRespuesta().setText("CAJERO SIN RESERVAS");
                vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

            }
        } else if (vistaRetirarDinero.getQuinientos() == evento.getSource()) {
            if ((dineroEnCuenta >= 500000) && (dineroEnCajero >= 500000)) {
                modeloCuenta.setSaldoActual(dineroEnCuenta - 500000);
                vistaRetirarDinero.setVisible(false);
                ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrIngresarClave.iniciarVista();
            } else if (dineroEnCuenta < 500000) {
                vistaRetirarDinero.getLblRespuesta().setText("SALDO INSUFICIENTE");
                vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

            } else if (dineroEnCajero < 500000) {
                vistaRetirarDinero.getLblRespuesta().setText("CAJERO SIN RESERVAS");
                vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

            }
        } else if (vistaRetirarDinero.getRetirar() == evento.getSource()) {
            try {

                int introMonto = Integer.parseInt(vistaRetirarDinero.getMontoManual().getText());
                if ((dineroEnCuenta >= introMonto) && (dineroEnCajero >= introMonto)) {
                    modeloCuenta.setSaldoActual(dineroEnCuenta - introMonto);
                    vistaRetirarDinero.setVisible(false);

                    ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                    contrIngresarClave.iniciarVista();
                } else if (dineroEnCuenta < introMonto) {
                    vistaRetirarDinero.getLblRespuesta().setText("SALDO INSUFICIENTE");
                    vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                    vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

                } else if (dineroEnCajero < introMonto) {
                    vistaRetirarDinero.getLblRespuesta().setText("CAJERO SIN RESERVAS");
                    vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                    vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

                }
                
            } catch (NumberFormatException e) {
                vistaRetirarDinero.getLblRespuesta().setText("SOLO NUMEROS PORFAVOR");
                vistaRetirarDinero.getLblRespuesta().setForeground(Color.red);
                vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());

            }
        }else if (vistaRetirarDinero.getNum0() == evento.getSource()) {
                    String s = vistaRetirarDinero.getMontoManual().getText();
                    this.vistaRetirarDinero.getMontoManual().setText(s + "0");
                    System.out.println("num0");
                    vistaRetirarDinero.repaint();
                } else if (vistaRetirarDinero.getNum1() == evento.getSource()) {
                    String s = vistaRetirarDinero.getMontoManual().getText();
                    this.vistaRetirarDinero.getMontoManual().setText(s + "1");
                    System.out.println("num1");
                } else if (vistaRetirarDinero.getNum2() == evento.getSource()) {
                    String s = vistaRetirarDinero.getMontoManual().getText();
                    vistaRetirarDinero.getMontoManual().setText(s + "2");
                } else if (vistaRetirarDinero.getNum3() == evento.getSource()) {
                    String s = vistaRetirarDinero.getMontoManual().getText();
                    vistaRetirarDinero.getMontoManual().setText(s + "3");
                } else if (vistaRetirarDinero.getNum4() == evento.getSource()) {
                    String s = vistaRetirarDinero.getMontoManual().getText();
                    vistaRetirarDinero.getMontoManual().setText(s + "4");
                } else if (vistaRetirarDinero.getNum5() == evento.getSource()) {
                    String s = vistaRetirarDinero.getMontoManual().getText();
                    vistaRetirarDinero.getMontoManual().setText(s + "5");
                } else if (vistaRetirarDinero.getNum6() == evento.getSource()) {
                    String s = vistaRetirarDinero.getMontoManual().getText();
                    vistaRetirarDinero.getMontoManual().setText(s + "6");
                } else if (vistaRetirarDinero.getNum7() == evento.getSource()) {
                    String s = vistaRetirarDinero.getMontoManual().getText();
                    vistaRetirarDinero.getMontoManual().setText(s + "7");
                } else if (vistaRetirarDinero.getNum8() == evento.getSource()) {
                    String s = vistaRetirarDinero.getMontoManual().getText();
                    vistaRetirarDinero.getMontoManual().setText(s + "8");
                } else if (vistaRetirarDinero.getNum9() == evento.getSource()) {
                    String s = vistaRetirarDinero.getMontoManual().getText();
                    vistaRetirarDinero.getMontoManual().setText(s + "9");
                }
        //this.vistaRetirarDinero.repaint();
        //this.vistaRetirarDinero.getMontoManual().paintImmediately(this.vistaRetirarDinero.getMontoManual().getVisibleRect());
    }
}
