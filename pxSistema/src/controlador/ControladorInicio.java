package controlador;

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
