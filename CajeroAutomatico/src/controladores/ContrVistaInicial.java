package controladores;

import java.awt.Color;
import modelo.*;
import vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class ContrVistaInicial implements ActionListener {

    VistaInicial vistaInicial;
    SQLiteJDBCDriverConnection modeloConexion;
    TarjetaDebito modeloTarjetaDeb;
    CajeroAutomatico modeloCajeroAuto;
    Cliente modeloCliente;
    Cuenta modeloCuenta;
    ElegirOperacion vistaElegirOperacion = new ElegirOperacion();
    ConfigAdministrador vistaConfAdmin = new ConfigAdministrador();

    public ContrVistaInicial(VistaInicial vistaInicial, SQLiteJDBCDriverConnection modeloConexion, TarjetaDebito modeloTarjetaDeb, CajeroAutomatico modeloCajeroAuto, Cliente modeloCliente, Cuenta modeloCuenta) {
        this.vistaInicial = vistaInicial;
        this.modeloConexion = modeloConexion;
        this.modeloTarjetaDeb = modeloTarjetaDeb;
        this.modeloCajeroAuto = modeloCajeroAuto;
        this.modeloCliente = modeloCliente;
        this.modeloCuenta = modeloCuenta;
    }

    public void iniciarVista() {

        vistaInicial.getIngresarTarjeta().addActionListener(this);
        vistaInicial.getIngresarClaveAdmin().addActionListener(this);
        vistaInicial.getClear().addActionListener(this);
        vistaInicial.getNum0().addActionListener(this);
        vistaInicial.getNum1().addActionListener(this);
        vistaInicial.getNum2().addActionListener(this);
        vistaInicial.getNum3().addActionListener(this);
        vistaInicial.getNum4().addActionListener(this);
        vistaInicial.getNum5().addActionListener(this);
        vistaInicial.getNum6().addActionListener(this);
        vistaInicial.getNum8().addActionListener(this);
        vistaInicial.getNum9().addActionListener(this);
        vistaInicial.setTitle("Interfaz Inicial");
        vistaInicial.pack();
        vistaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistaInicial.setSize(750, 680);
        vistaInicial.setLocationRelativeTo(null);
        vistaInicial.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (vistaInicial.getIngresarTarjeta() == evento.getSource()) {
            try {
                int idTarjeta = Integer.parseInt(vistaInicial.getIdTarjetaCliente().getText());
                modeloConexion.obtenerDatosTarDebCuenta(modeloTarjetaDeb, idTarjeta, modeloCuenta);

                if ((modeloTarjetaDeb.getIdTarjeta() == idTarjeta) && modeloTarjetaDeb.isEstado()) {
                    this.vistaInicial.setRespuesta("ACEPTADA, PROCESANDO...");
                    this.vistaInicial.getRespuesta2().setVisible(false);
                    this.vistaInicial.getRespuesta().setVisible(true);
                    
                    this.vistaInicial.repaint();
                   this.vistaInicial.getRespuesta().paintImmediately(this.vistaInicial.getRespuesta().getVisibleRect());
                    modeloConexion.obtenerDatosCliente(modeloCliente, modeloCliente.getIdUsuario());
                    Thread.sleep(2000);
                    vistaInicial.setVisible(false);

                    ContrElegirOp contrElegirOp = new ContrElegirOp(vistaElegirOperacion, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                    contrElegirOp.iniciarVista();
                } else if (modeloTarjetaDeb.getIdTarjeta() != idTarjeta) {
                     vistaInicial.getRespuesta2().setText("TARJETA INVALIDA");
                     vistaInicial.getRespuesta2().setBackground(Color.red);
                    vistaInicial.getRespuesta2().setVisible(true);
                    
                    vistaInicial.repaint();
                   vistaInicial.getRespuesta2().paintImmediately(this.vistaInicial.getRespuesta2().getVisibleRect());
                } else {
                    vistaInicial.getRespuesta2().setText("TARJETA INVALIDA");
                     vistaInicial.getRespuesta2().setBackground(Color.red);
                    vistaInicial.getRespuesta2().setVisible(true);
                    
                    vistaInicial.repaint();
                   vistaInicial.getRespuesta2().paintImmediately(this.vistaInicial.getRespuesta2().getVisibleRect());
                }
            } catch (NumberFormatException e) {
                
                vistaInicial.getRespuesta2().setText("Entrada Inválida. Solo números");
                     vistaInicial.getRespuesta2().setBackground(Color.red);
                    vistaInicial.getRespuesta2().setVisible(true);
                    
                    vistaInicial.repaint();
                   vistaInicial.getRespuesta2().paintImmediately(this.vistaInicial.getRespuesta2().getVisibleRect());
            } catch (InterruptedException ex) {
                Logger.getLogger(ContrVistaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (vistaInicial.getIngresarClaveAdmin() == evento.getSource()) {
            try {
                if (modeloCajeroAuto.getClaveCajero() == Integer.parseInt(vistaInicial.getClaveAdmin().getText())) {
                    JOptionPane.showMessageDialog(null, "Clave Aceptada. Bienvenido", "CONTINUAR", JOptionPane.INFORMATION_MESSAGE);

                    ContrConfigAdmin contrConfAdmin = new ContrConfigAdmin(vistaConfAdmin, modeloCajeroAuto);
                    contrConfAdmin.iniciarVista();
                } else {
                    JOptionPane.showMessageDialog(null, "Clave Inválida.", "DENEGADO", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada Inválida. Solo Números", "DENEGADO", JOptionPane.ERROR_MESSAGE);
            }
        } else if (vistaInicial.getNum0() == evento.getSource()) {
            String s = vistaInicial.getIdTarjetaCliente().getText();
            this.vistaInicial.getIdTarjetaCliente().setText(s + "0");
            System.out.println("num0");
            vistaInicial.repaint();
        } else if (vistaInicial.getNum1() == evento.getSource()) {
            String s = vistaInicial.getIdTarjetaCliente().getText();
            this.vistaInicial.getIdTarjetaCliente().setText(s + "1");
            System.out.println("num1");
        } else if (vistaInicial.getNum2() == evento.getSource()) {
            String s = vistaInicial.getIdTarjetaCliente().getText();
            vistaInicial.getIdTarjetaCliente().setText(s + "2");
        } else if (vistaInicial.getNum3() == evento.getSource()) {
            String s = vistaInicial.getIdTarjetaCliente().getText();
            vistaInicial.getIdTarjetaCliente().setText(s + "3");
        } else if (vistaInicial.getNum4() == evento.getSource()) {
            String s = vistaInicial.getIdTarjetaCliente().getText();
            vistaInicial.getIdTarjetaCliente().setText(s + "4");
        } else if (vistaInicial.getNum5() == evento.getSource()) {
            String s = vistaInicial.getIdTarjetaCliente().getText();
            vistaInicial.getIdTarjetaCliente().setText(s + "5");
        } else if (vistaInicial.getNum6() == evento.getSource()) {
            String s = vistaInicial.getIdTarjetaCliente().getText();
            vistaInicial.getIdTarjetaCliente().setText(s + "6");
        } else if (vistaInicial.getNum7() == evento.getSource()) {
            String s = vistaInicial.getIdTarjetaCliente().getText();
            vistaInicial.getIdTarjetaCliente().setText(s + "7");
        } else if (vistaInicial.getNum8() == evento.getSource()) {
            String s = vistaInicial.getIdTarjetaCliente().getText();
            vistaInicial.getIdTarjetaCliente().setText(s + "8");
        } else if (vistaInicial.getNum9() == evento.getSource()) {
            String s = vistaInicial.getIdTarjetaCliente().getText();
            vistaInicial.getIdTarjetaCliente().setText(s + "9");
            
            
        } else if (vistaInicial.getClear() == evento.getSource()) {
            vistaInicial.getRespuesta().setVisible(false);
            vistaInicial.getRespuesta2().setVisible(false);
            vistaInicial.getIdTarjetaCliente().setText("");
            vistaInicial.getRespuesta2().paintImmediately(this.vistaInicial.getRespuesta2().getVisibleRect());
        }
    }

}
