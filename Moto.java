package Exercício2;

public class Moto extends Terrestre implements Licenciado {

    String cor;
    String placa;
    int marcha;

    public Moto(String cor, String placa, int marcha) {
        this.cor = cor;
        this.placa = placa;
        this.marcha = marcha;
    }

    String getCor() {
        return cor;
    }
    String getPlaca() {
        return placa;
    }
    int getMarcha() {
        return marcha;
    }
    int trocarMarcha(int troca) {
        return marcha += troca;
    }

    @Override
    public String emplacar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emplacar'");
    }
    
}
