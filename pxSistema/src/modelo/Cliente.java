package modelo;

public class Cliente {
    private String dni;
    private String nombre;
    private String paterno;
    private String materno;
    private String telefono;
    private String email;
    private TipoCliente tipo;

    public Cliente(String dni, String nombre, String paterno, String materno, 
                    String telefono, String email,TipoCliente tipo ) {
        this.dni = dni;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.telefono = telefono;
        this.email = email;
        this.tipo =  tipo;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    @Override
    public String toString() {
        return  dni + " \t " + nombre + " \t " + paterno + " \t " + materno + 
                " \t " + telefono + " \t " + email + " \t " + tipo;
    }
	
    
}
