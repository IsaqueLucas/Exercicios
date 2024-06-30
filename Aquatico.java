package Exercício2;

public class Aquatico extends Transporte {
    String tipo;
    String getTipo() {
        return tipo;
    }

    public Aquatico(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void acelerar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acelerar'");
    }

    @Override
    public void frear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frear'");
    }
}
