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
public class ContrIngresarClave implements ActionListener {

    IngresarClave vistaIngresarClave;
    SQLiteJDBCDriverConnection modeloConexion;
    TarjetaDebito modeloTarjetaDeb;
    CajeroAutomatico modeloCajeroAuto;
    Cliente modeloCliente;
    Cuenta modeloCuenta;
    ElegirOperacion vistaElegirOperacion = new ElegirOperacion();
    VistaInicial vistaInicial = new VistaInicial();
    int opcion = 0;

    public ContrIngresarClave(IngresarClave vistaIngresarClave, SQLiteJDBCDriverConnection modeloConexion, TarjetaDebito modeloTarjetaDeb, CajeroAutomatico modeloCajeroAuto, Cliente modeloCliente, Cuenta modeloCuenta) {
        this.vistaIngresarClave = vistaIngresarClave;
        this.modeloConexion = modeloConexion;
        this.modeloTarjetaDeb = modeloTarjetaDeb;
        this.modeloCajeroAuto = modeloCajeroAuto;
        this.modeloCliente = modeloCliente;
        this.modeloCuenta = modeloCuenta;

    }

    void iniciarVista() {
        vistaIngresarClave.getAceptar().addActionListener(this);
        vistaIngresarClave.getCancelar().addActionListener(this);
        vistaIngresarClave.getClear().addActionListener(this);
        vistaIngresarClave.getBtnDer().addActionListener(this);
        vistaIngresarClave.getBtnIzq().addActionListener(this);
        vistaIngresarClave.setTitle("Ingresar Clave");
        vistaIngresarClave.pack();
        vistaIngresarClave.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistaIngresarClave.setSize(750, 680);
        vistaIngresarClave.setLocationRelativeTo(null);
        vistaIngresarClave.setVisible(true);

    }

    @Override
    // vistaRetirarDinero.getLblRespuesta().paintImmediately(this.vistaRetirarDinero.getLblRespuesta().getVisibleRect());
    public void actionPerformed(ActionEvent evento) {
        try {
            vistaIngresarClave.getLblRespuesta().setVisible(false);
            if (vistaIngresarClave.getAceptar() == evento.getSource()) {//CLICK EN INGRESAR CLAVE
                int intentos = modeloCuenta.getIntentosAcceso();

                int claveIngresada = Integer.parseInt(vistaIngresarClave.getCampoClave().getText());

                if ((claveIngresada == modeloConexion.obtenerClaveTarDeb(modeloTarjetaDeb)) && intentos < 3) {//ACCESO CONCEDIDO
                    modeloCuenta.setIntentosAcceso(0);
                    modeloConexion.actualizarTodosDatos(modeloCliente, modeloTarjetaDeb, modeloCuenta);
                    vistaIngresarClave.getCampoClave().setVisible(false);
                    vistaIngresarClave.getjLabel1().setVisible(false);
                    vistaIngresarClave.getLblRespuesta().setForeground(Color.GREEN);
                    vistaIngresarClave.getLblRespuesta().setText("Transacción Exitosa ¿Desea ver su recibo?");
                    vistaIngresarClave.getLblRespuesta().setVisible(true);
                    vistaIngresarClave.getLblRespuesta().paintImmediately(this.vistaIngresarClave.getLblRespuesta().getVisibleRect());
                    vistaIngresarClave.getLblDer().setVisible(true);
                    vistaIngresarClave.getLblIzq().setVisible(true);

                    if (vistaIngresarClave.getBtnDer() == evento.getSource()) { //tesi1
                        System.out.println("test 1");
                        vistaIngresarClave.getLblRespuesta().setVisible(true);
                        vistaIngresarClave.getLblRespuesta().setForeground(Color.red);
                        vistaIngresarClave.getLblRespuesta().setText("TRANSACCION FALLIDA - Cuenta Bloqueada. Acudir al SC Banco");
                        vistaIngresarClave.getLblRespuesta().paintImmediately(this.vistaIngresarClave.getLblRespuesta().getVisibleRect());

                        ContrElegirOp contrElegirOp = new ContrElegirOp(vistaElegirOperacion, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                        contrElegirOp.iniciarVista();

                        modeloConexion.obtenerDatosTarDebCuenta(modeloTarjetaDeb, modeloTarjetaDeb.getIdTarjeta(), modeloCuenta);
                        modeloConexion.obtenerDatosCliente(modeloCliente, modeloCliente.getIdUsuario());
                    } else if (vistaIngresarClave.getBtnIzq() == evento.getSource()) {//TEST2
                        System.out.println("test 2");

                    }
                } else if (!(claveIngresada == modeloConexion.obtenerClaveTarDeb(modeloTarjetaDeb)) && intentos >= 3) {//TEST 3
                    System.out.println("test 3");
                    vistaIngresarClave.getLblRespuesta().setVisible(true);
                    vistaIngresarClave.getLblRespuesta().setForeground(Color.red);
                    vistaIngresarClave.getLblRespuesta().setText("TRANSACCION FALLIDA - No tiene mas Intentos - Cuenta Bloqueada. Contacte Servicio al Cliente del Banco");
                    vistaIngresarClave.getLblRespuesta().paintImmediately(this.vistaIngresarClave.getLblRespuesta().getVisibleRect());
                    Thread.sleep(3000);

                    ContrVistaInicial contrVistaInicial = new ContrVistaInicial(vistaInicial, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                    contrVistaInicial.iniciarVista();

                    modeloTarjetaDeb.setEstado(false);
                    modeloConexion.actualizarEstadoTarDeb(modeloTarjetaDeb);
                    this.vistaIngresarClave.setVisible(false);
                } else if (!(claveIngresada == modeloConexion.obtenerClaveTarDeb(modeloTarjetaDeb))) {
                    vistaIngresarClave.getLblRespuesta().setVisible(true);
                    vistaIngresarClave.getLblRespuesta().setForeground(Color.red);
                    vistaIngresarClave.getLblRespuesta().setText("Clave Erronea");
                    vistaIngresarClave.getLblRespuesta().paintImmediately(this.vistaIngresarClave.getLblRespuesta().getVisibleRect());

                    modeloCuenta.setIntentosAcceso(intentos + 1);

                }

            }
            if (vistaIngresarClave.getBtnDer() == evento.getSource() && opcion == 0) {//TEST RECIBO
                System.out.println("test RECIBO");
                modeloConexion.obtenerDatosTarDebCuenta(modeloTarjetaDeb, modeloTarjetaDeb.getIdTarjeta(), modeloCuenta);
                modeloConexion.obtenerDatosCliente(modeloCliente, modeloCliente.getIdUsuario());

                String recibo = "---Informacion Cliente---\n"
                        + "Apellido: " + modeloCliente.getApellidoUsuario() + "\n"
                        + "Nombre: " + modeloCliente.getNombreUsuario() + "\n"
                        + "---Info Tarjeta Debito---\n"
                        + "Fecha Vencimiento: " + modeloTarjetaDeb.getFechaVencimiento() + "\n"
                        + "---Info Cuenta---\n"
                        + "Saldo: " + modeloCuenta.getSaldoActual() + "\n"
                        + "---FIN RECIBO---\n"
                        + "   ¿DESEA REALIZAR OTRA OPERACION?";
                vistaIngresarClave.getLblRespuesta().setForeground(Color.CYAN);
                vistaIngresarClave.getLblRespuesta().setText(recibo);
                vistaIngresarClave.getLblRespuesta().setVisible(true);
                vistaIngresarClave.getLblRespuesta().paintImmediately(this.vistaIngresarClave.getLblRespuesta().getVisibleRect());
                opcion = 1;
            } else if (vistaIngresarClave.getBtnIzq() == evento.getSource() && opcion == 0) {
                System.out.println("TEST 6");
                vistaIngresarClave.getLblRespuesta().setVisible(true);
                vistaIngresarClave.getLblRespuesta().setText("\"Desea realizar otra accion?");
                vistaIngresarClave.getLblRespuesta().paintImmediately(this.vistaIngresarClave.getLblRespuesta().getVisibleRect());
                Thread.sleep(1000);
                opcion=1;
            } else if (vistaIngresarClave.getBtnDer()== evento.getSource() && opcion == 1) {
                System.out.println("TEST 4");
                vistaIngresarClave.setVisible(false);
                ContrElegirOp contrElegirOp = new ContrElegirOp(vistaElegirOperacion, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrElegirOp.iniciarVista();
            } else if (vistaIngresarClave.getBtnIzq() == evento.getSource() && opcion == 1) {
                System.out.println("TEST 5");
                vistaIngresarClave.getLblRespuesta().setVisible(true);
                vistaIngresarClave.getLblRespuesta().setForeground(Color.GREEN);
                vistaIngresarClave.getLblRespuesta().setText("\"Gracias por preferirnos. Vuelva pronto");
                vistaIngresarClave.getLblRespuesta().paintImmediately(this.vistaIngresarClave.getLblRespuesta().getVisibleRect());
                Thread.sleep(1000);
                this.vistaIngresarClave.setVisible(false);
                ContrVistaInicial contrVistaInicial = new ContrVistaInicial(vistaInicial, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrVistaInicial.iniciarVista();
            } else if (vistaIngresarClave.getClear()
                    == evento.getSource()) {
                vistaIngresarClave.getLblRespuesta().setVisible(false);
                vistaIngresarClave.getCampoClave().setText("");

                vistaIngresarClave.getCampoClave().paintImmediately(this.vistaIngresarClave.getCampoClave().getVisibleRect());
            } else if (vistaIngresarClave.getCancelar()
                    == evento.getSource()) {
                this.vistaIngresarClave.setVisible(false);
                ContrVistaInicial contrVistaInicial = new ContrVistaInicial(vistaInicial, modeloConexion, modeloTarjetaDeb, modeloCajeroAuto, modeloCliente, modeloCuenta);
                contrVistaInicial.iniciarVista();
            }
        } catch (NumberFormatException e) {
            int intentos = modeloCuenta.getIntentosAcceso();
            vistaIngresarClave.getLblRespuesta().setVisible(true);
            vistaIngresarClave.getLblRespuesta().setForeground(Color.red);
            vistaIngresarClave.getLblRespuesta().setText("Entrada Inválida. Solo Números");
            vistaIngresarClave.getLblRespuesta().paintImmediately(this.vistaIngresarClave.getLblRespuesta().getVisibleRect());

            modeloCuenta.setIntentosAcceso(intentos + 1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ContrIngresarClave.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
