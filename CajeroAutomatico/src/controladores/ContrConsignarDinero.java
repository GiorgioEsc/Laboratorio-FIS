package controladores;

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
public class ContrConsignarDinero implements ActionListener {

    OpConsignarDinero vistaConsignarDinero;
    SQLiteJDBCDriverConnection modeloConexion;
    TarjetaDebito modeloTarjetaDeb;
    CajeroAutomatico modeloCajeroAuto;
    Cliente modeloCliente;
    Cuenta modeloCuenta;
    IngresarClave vistaIngresarClave = new IngresarClave();

    public ContrConsignarDinero(OpConsignarDinero vistaConsignarDinero, SQLiteJDBCDriverConnection modeloConexion, TarjetaDebito modeloTarjetaDeb, CajeroAutomatico modeloCajeroAuto, Cliente modeloCliente, Cuenta modeloCuenta) {
        this.vistaConsignarDinero = vistaConsignarDinero;
        this.modeloConexion = modeloConexion;
        this.modeloTarjetaDeb = modeloTarjetaDeb;
        this.modeloCajeroAuto = modeloCajeroAuto;
        this.modeloCliente = modeloCliente;
        this.modeloCuenta = modeloCuenta;
    }

    void iniciarVista() {
        vistaConsignarDinero.getCincuenta().addActionListener(this);
        vistaConsignarDinero.getCien().addActionListener(this);
        vistaConsignarDinero.getDoscientos().addActionListener(this);
        vistaConsignarDinero.getQuinientos().addActionListener(this);
        vistaConsignarDinero.getConsignar().addActionListener(this);
        vistaConsignarDinero.setTitle("Consignacion en Efectivo");
        vistaConsignarDinero.pack();
        vistaConsignarDinero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistaConsignarDinero.setSize(750, 850);
        vistaConsignarDinero.setLocationRelativeTo(null);
        vistaConsignarDinero.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        int dineroEnCuenta = modeloCuenta.getSaldoActual();
        

        if (vistaConsignarDinero.getCincuenta() == evento.getSource()) {
            
                modeloCuenta.setSaldoActual(dineroEnCuenta + 50000);
                vistaConsignarDinero.setVisible(false);

                ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrIngresarClave.iniciarVista();
            
        } else if (vistaConsignarDinero.getCien() == evento.getSource()) {
            
                modeloCuenta.setSaldoActual(dineroEnCuenta + 100000);
                vistaConsignarDinero.setVisible(false);

                ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrIngresarClave.iniciarVista();
            
        } else if (vistaConsignarDinero.getDoscientos() == evento.getSource()) {
           
                modeloCuenta.setSaldoActual(dineroEnCuenta + 200000);
                vistaConsignarDinero.setVisible(false);

                ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrIngresarClave.iniciarVista();
           
        } else if (vistaConsignarDinero.getQuinientos() == evento.getSource()) {
           
                modeloCuenta.setSaldoActual(dineroEnCuenta + 500000);
                vistaConsignarDinero.setVisible(false);
                ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrIngresarClave.iniciarVista();
           
        } else if (vistaConsignarDinero.getConsignar() == evento.getSource()) {
            try {
                int introMonto = Integer.parseInt(vistaConsignarDinero.getMontoManual().getText());
               
                    modeloCuenta.setSaldoActual(dineroEnCuenta + introMonto);
                    vistaConsignarDinero.setVisible(false);

                    ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                    contrIngresarClave.iniciarVista();
               
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada Inválida. Solo Números", "DENEGADO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
