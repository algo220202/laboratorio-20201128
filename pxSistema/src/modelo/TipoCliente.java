package modelo;

public class TipoCliente {
    private String descripcion;
    private boolean estado;

    public TipoCliente(String descripcion) {
        this.descripcion = descripcion;
        this.estado = true;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  descripcion ;
    }
    
    
    
}
