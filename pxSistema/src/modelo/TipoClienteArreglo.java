
package modelo;


public class TipoClienteArreglo {

    private TipoCliente[] tipoclientes;
    private int indice;

    public TipoClienteArreglo(int tamaño) {
        this.tipoclientes = new TipoCliente[tamaño];
        this.indice = 0;
    }
    
    public boolean add( TipoCliente tc){
        boolean result = false;
        if(this.indice< this.tipoclientes.length){
            this.tipoclientes[this.indice] = tc;
            this.indice++;
            result = true;
        }
        return result;       
    }
    
    public TipoCliente find( String buscar){
        TipoCliente result = null;
        for(int i=0;i< this.indice ;i++){
            if ( this.tipoclientes[i].getDescripcion().equals(buscar)  ){
                result = this.tipoclientes[i];
                break;
            }
        }
        return result;
    }
    
    public TipoCliente[] getDatosCombo(){
        TipoCliente[] result = new TipoCliente[this.indice];
        for(int i=0;i<this.indice ;i++){
            result[i] = this.tipoclientes[i];
        }
        return result;
    }
    
    
}
