package Lista_de_Exercicios_1.Exercicio5;

public class Pluviometros {
    private TipoPluviometro tipo;

    public void setTipo(TipoPluviometro tipo){
        this.tipo = tipo;
    }

    public int getTamanho() {
        return this.tipo.getTamanho();
    }

    @Override
    public String toString() {
        return "" + tipo.getTamanho();
    }
}
