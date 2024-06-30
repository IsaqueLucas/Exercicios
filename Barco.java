package Exercício2;

public class Barco extends Aquatico {

    boolean comercial;
    
    boolean isComercial() {
        return comercial;
    };

    
    public Barco(String tipo, boolean comercial) {
        super(tipo);
        this.comercial = comercial;
    }
    
}
