package general;


import modelo.ClienteArreglo;
import modelo.TipoCliente;
import modelo.TipoClienteArreglo;
import modelo.Usuario;
import modelo.UsuarioArreglo;


public class Sistema {
     public static UsuarioArreglo usuarios = new UsuarioArreglo(10);
     public static TipoClienteArreglo tipoclientes = new TipoClienteArreglo(10);
     public static Usuario usuarioConectado; 
     
     public static ClienteArreglo clientes = new ClienteArreglo(10);
     
}
