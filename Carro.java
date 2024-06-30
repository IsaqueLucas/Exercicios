package Exercício2;

public class Carro extends Terrestre implements Licenciado {

    String cor;
    String placa;
    int marcha;

    public Carro(String cor, String placa, int marcha) {
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
        return null;
    }
    
}
