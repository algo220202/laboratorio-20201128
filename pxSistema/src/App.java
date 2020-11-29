import controlador.ControladorCliente;
import general.Sistema;
import controlador.ControladorInicio;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.TipoCliente;
import modelo.Usuario;
import vista.frmCliente;
import vista.frmIniciar;

public class App {
    
    public static void main(String[] args){
        
        Sistema.usuarios.add( new Usuario("jzavaleta", "secreto"));
        Sistema.usuarios.add( new Usuario("jperez", "123456"));
        Sistema.usuarios.add( new Usuario("abartra", "secreto"));
        Sistema.usuarios.add( new Usuario("fisi", "secreto"));
        
        Sistema.tipoclientes.add(new TipoCliente("Empresarial"));
        Sistema.tipoclientes.add(new TipoCliente("Persona Natural"));
        Sistema.tipoclientes.add(new TipoCliente("Cliente Preferencial"));
        Sistema.tipoclientes.add(new TipoCliente("PYMES"));
        /*
        Cliente c = new Cliente("58741269", "Juan", "Perez", "Diaz", 
                        "974856321", "jperez@gmail.com", 
                        Sistema.tipoclientes.find("Persona Natural") );
        System.out.println(c);
        JOptionPane.showMessageDialog(null, c);
        */
        frmIniciar fInicio = new frmIniciar();
        ControladorInicio controlador = new ControladorInicio(Sistema.usuarios, fInicio);
        controlador.iniciar();
        
        
    }  
}
