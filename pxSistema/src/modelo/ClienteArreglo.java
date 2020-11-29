package modelo;


public class ClienteArreglo {
    private int indice;
    private Cliente [] clientes;
    private String[] cabecera = {"DNI","NOMBRE","PATERNO","MATERNO","EMAIL","TELEFONO", "TIPO"};

    public ClienteArreglo(int tamaño ) {
        this.clientes = new Cliente[tamaño];
        this.indice =0;
    }
    
    public boolean add(Cliente c){
        boolean result = false;
        if(this.indice< this.clientes.length){
            this.clientes[this.indice] = c;
            this.indice++;
            result = true;
        }
        return result; 
    }

    @Override
    public String toString() {
        String result ="";
        for(int i=0;i< this.indice ;i++){
            result += this.clientes[i]+ "\n";
        }
        return result;
    }
    
    public Cliente find(String nombre){
        Cliente result=null;
        
        return result;
    }
    
    private boolean delete(){
        boolean result = false;
        
        return result;
    }
    
    public void ordenar( char tipo ){
        
    }
    
    private void redimensionar(){
        
    }
    private boolean isLleno(){
        boolean result = false;
        
        return result;
    }
    
    private boolean isVacio(){
        boolean result = false;
        
        return result;
    }
    
    public String[] getCabecera(){
        return cabecera;
    }
    public String[][] getDatosTabla( ){
        String[][] result = new String[this.indice][7];
        for(int i =0; i< this.indice;i++){
            
            result[i][0] = this.clientes[i].getDni();
            result[i][1] = this.clientes[i].getNombre();
            result[i][2] = this.clientes[i].getPaterno();
            result[i][3] = this.clientes[i].getMaterno();
            result[i][4] = this.clientes[i].getEmail();
            result[i][5] = this.clientes[i].getTelefono();
            result[i][6] = this.clientes[i].getTipo().toString();
        }
        
        return result;
    }
    
    public String[][] getDatosTabla(TipoCliente tipo ){
        String[][] result = new String[getTamanoPorTipo(tipo)][6];
        int j =0;
        for(int i =0; i< this.indice;i++){
            if(this.clientes[i].getTipo().equals(tipo)){
                result[j][0] = this.clientes[i].getDni();
                result[j][1] = this.clientes[i].getNombre();
                result[j][2] = this.clientes[i].getPaterno();
                result[j][3] = this.clientes[i].getMaterno();
                result[j][4] = this.clientes[i].getEmail();
                result[j][5] = this.clientes[i].getTelefono();
                j++;
            }
            
        }
        
        
        return result;
    }

    private int getTamanoPorTipo(TipoCliente tipo) {
        int result =0;
        for(int i =0; i< this.indice;i++){
            if(this.clientes[i].getTipo().equals(tipo)){
                result++;
            }
        }
        return result;
    }
    
    
    
}
