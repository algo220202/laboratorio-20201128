package controlador;

import Util.Email;
import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.SumarNumeros;
import modelo.Usuario;
import modelo.UsuarioArreglo;
import vista.frmCliente;
import vista.frmIniciar;
import vista.frmSumar;

public class ControladorInicio {
    private UsuarioArreglo modelo;
    private frmIniciar vista;
    

    public ControladorInicio(UsuarioArreglo modelo, frmIniciar vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnSalir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    
        this.vista.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Sistema.usuarioConectado = modelo.ingresar(vista.txtUsuario.getText() , vista.txtContraseña.getText());
                 if ( Sistema.usuarioConectado != null ){
                    String menesaje = "<b>Notificacion de inicio de sesión</b><br>";
                    menesaje += "<font color=red>usuario:"+Sistema.usuarioConectado.getLogin() +"</font>";
                    Email email =  new Email(Sistema.usuarioConectado.getEmail(), "Mensaje de App -Java ", menesaje);
                    Thread enviar = new Thread(email);
                    enviar.start();
                    vista.dispose();
                    frmCliente fcliente = new frmCliente();
                    ControladorCliente controlador = new ControladorCliente(Sistema.clientes, fcliente);
                    controlador.iniciar();
                 }else {
                     JOptionPane.showMessageDialog(vista, "Error de credenciales");
                     
                 }
            }
        });
    }
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
