package Exercício2;

public class Aviao extends Aereo {
    String tipo;
    boolean comercial;

    public Aviao(String tipo, boolean comercial) {
        this.tipo = tipo;
        this.comercial = comercial;
    }

    String getTipo() {
        return tipo;
    }
    boolean getComercial() {
        return comercial;
    }
}
