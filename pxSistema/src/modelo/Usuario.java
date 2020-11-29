package modelo;

public class Usuario {
    private String login;
    private String contraseña;
    private Boolean conectado;

    public String getLogin() {
        return login;
    }

    public Usuario(String login, String contraseña) {
        this.login = login;
        this.contraseña = contraseña;
        this.conectado = Boolean.FALSE;
    }
    
    public boolean isConectado (){
        return this.conectado;
    } 
    
    public boolean ingresar(String login, String contraseña){
        boolean result = false;
        if( this.login.equalsIgnoreCase(login) && 
                this.contraseña.equals(contraseña) &&
                !isConectado()
                ){
            result = true;
            this.conectado = Boolean.TRUE;
        }        
        return result;
    }
    public boolean salir(){
        boolean result = false;
        if(isConectado()){
            result = true;
            this.conectado = Boolean.FALSE;
        }
        return result;
    }
    
}
