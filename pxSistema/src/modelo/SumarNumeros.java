package modelo;

public class SumarNumeros {
    private int operador1;
    private int operador2;
    private int suma;

    public SumarNumeros(int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public SumarNumeros() {
        this(0,0);
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }
    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
    public int getSuma() {
        return suma;
    }   
    public void sumar(){
        this.suma = this.operador1 + this.operador2;
    }  
}
