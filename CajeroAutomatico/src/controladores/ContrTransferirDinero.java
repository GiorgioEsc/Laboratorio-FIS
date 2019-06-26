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
public class ContrTransferirDinero implements ActionListener {

    OpTransferirDinero vistaTransferirDinero;
    SQLiteJDBCDriverConnection modeloConexion;
    TarjetaDebito modeloTarjetaDeb;
    CajeroAutomatico modeloCajeroAuto;
    Cliente modeloCliente;
    Cuenta modeloCuenta;
    IngresarClave vistaIngresarClave = new IngresarClave();

    public ContrTransferirDinero(OpTransferirDinero vistaTransferirDinero, SQLiteJDBCDriverConnection modeloConexion, TarjetaDebito modeloTarjetaDeb, CajeroAutomatico modeloCajeroAuto, Cliente modeloCliente, Cuenta modeloCuenta) {
        this.vistaTransferirDinero = vistaTransferirDinero;
        this.modeloConexion = modeloConexion;
        this.modeloTarjetaDeb = modeloTarjetaDeb;
        this.modeloCajeroAuto = modeloCajeroAuto;
        this.modeloCliente = modeloCliente;
        this.modeloCuenta = modeloCuenta;
    }

    void iniciarVista() {
        vistaTransferirDinero.getTransferir().addActionListener(this);
        vistaTransferirDinero.setTitle("Transferencia en Efectivo");
        vistaTransferirDinero.pack();
        vistaTransferirDinero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistaTransferirDinero.setSize(750, 850);
        vistaTransferirDinero.setLocationRelativeTo(null);
        vistaTransferirDinero.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        int dineroEnCuenta = modeloCuenta.getSaldoActual();
        int nroCuenta = 0;
        int montoTrans = 0;

        if (vistaTransferirDinero.getTransferir()== evento.getSource()) {
            
                montoTrans = Integer.parseInt(vistaTransferirDinero.getMontoManual().getText());
                nroCuenta = Integer.parseInt(vistaTransferirDinero.getNroCuenta().getText());
                System.out.println(montoTrans+"        "+nroCuenta);
                
//                modeloCuenta.setSaldoActual(dineroEnCuenta - 50000);
//                vistaTransferirDinero.setVisible(false);
//
//                ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
//                contrIngresarClave.iniciarVista();
            
        }  else if (vistaTransferirDinero.getTransferir()== evento.getSource()) {
            try {
                int introMonto = Integer.parseInt(vistaTransferirDinero.getMontoManual().getText());
               
                    modeloCuenta.setSaldoActual(dineroEnCuenta + introMonto);
                    vistaTransferirDinero.setVisible(false);

                    ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                    contrIngresarClave.iniciarVista();
               
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada Inválida. Solo Números", "DENEGADO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
