package controladores;

import modelo.*;
import vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Antonio
 */
public class ContrElegirOp implements ActionListener {

    ElegirOperacion vistaElegirOperacion;
    SQLiteJDBCDriverConnection modeloConexion;
    TarjetaDebito modeloTarjetaDeb;
    CajeroAutomatico modeloCajeroAuto;
    Cliente modeloCliente;
    Cuenta modeloCuenta;
    OpCambiarClave vistaCambiarClave = new OpCambiarClave();
    IngresarClave vistaIngresarClave = new IngresarClave();
    OpRetirarDinero vistaRetirarDinero = new OpRetirarDinero();
    OpConsignarDinero vistaConsignarDinero = new OpConsignarDinero();
    OpTransferirDinero vistaTransferirDinero = new OpTransferirDinero();
    private VistaInicial vistaInicial = new VistaInicial();

    public ContrElegirOp(ElegirOperacion vistaElegirOperacion, SQLiteJDBCDriverConnection modeloConexion, TarjetaDebito modeloTarjetaDeb, CajeroAutomatico modeloCajeroAuto, Cliente modeloCliente, Cuenta modeloCuenta) {
        this.vistaElegirOperacion = vistaElegirOperacion;
        this.modeloConexion = modeloConexion;
        this.modeloTarjetaDeb = modeloTarjetaDeb;
        this.modeloCajeroAuto = modeloCajeroAuto;
        this.modeloCliente = modeloCliente;
        this.modeloCuenta = modeloCuenta;
    }

    public void iniciarVista() {
        vistaElegirOperacion.getCambiarClave().addActionListener(this);
        vistaElegirOperacion.getConsignarDinero().addActionListener(this);
        vistaElegirOperacion.getConsultarSaldo().addActionListener(this);
        vistaElegirOperacion.getRetirarDinero().addActionListener(this);
        vistaElegirOperacion.getBtnCancelar().addActionListener(this);
        vistaElegirOperacion.getBtnTransferir().addActionListener(this);
        vistaElegirOperacion.setTitle("Selección de Opciones");
        vistaElegirOperacion.pack();
        vistaElegirOperacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistaElegirOperacion.setSize(750, 680);
        vistaElegirOperacion.setLocationRelativeTo(null);
        vistaElegirOperacion.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (vistaElegirOperacion.getCambiarClave() == evento.getSource()) {
            ContrCambiarClave contrCambiarClave = new ContrCambiarClave(vistaCambiarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
            contrCambiarClave.iniciarVista();

            vistaElegirOperacion.setVisible(false);
        } else if (vistaElegirOperacion.getConsultarSaldo() == evento.getSource()) {
            ContrIngresarClave contrIngresarClave = new ContrIngresarClave(vistaIngresarClave, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
            contrIngresarClave.iniciarVista();

            vistaElegirOperacion.setVisible(false);
        } else if (vistaElegirOperacion.getConsignarDinero() == evento.getSource()) {
            System.out.println("consigar");
            ContrConsignarDinero contConsignarDinero = new ContrConsignarDinero(vistaConsignarDinero, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
            contConsignarDinero.iniciarVista();
            vistaElegirOperacion.setVisible(false);  
        } else if (vistaElegirOperacion.getTransferirDinero() == evento.getSource()) {
            System.out.println("transferir");
            ContrTransferirDinero contrTransferirDinero = new ContrTransferirDinero(vistaTransferirDinero, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
            contrTransferirDinero.iniciarVista();
            vistaElegirOperacion.setVisible(false);  
        } else if (vistaElegirOperacion.getRetirarDinero() == evento.getSource()) {
            ContrRetirarDinero contrRetirarDinero = new ContrRetirarDinero(vistaRetirarDinero, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
            contrRetirarDinero.iniciarVista();
            vistaElegirOperacion.setVisible(false);
        }else if (vistaElegirOperacion.getBtnCancelar() == evento.getSource()) {
            ContrVistaInicial contrVistaInicial = new ContrVistaInicial(vistaInicial, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
            contrVistaInicial.iniciarVista();
        }else if (vistaElegirOperacion.getBtnTransferir() == evento.getSource()){
            
        }
    }
}
