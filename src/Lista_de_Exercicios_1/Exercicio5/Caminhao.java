package Lista_de_Exercicios_1.Exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Caminhao {

    private List<Integer> pluviomentros;
    private TipoCaminhao tipo;
    private int soma = 0;
    private int tamanho;

    public Caminhao(List<Integer> lista, TipoCaminhao tipo, int tamanho) {
        this.pluviomentros = lista;
        this.tipo = tipo;
        this.tamanho = tamanho;
        somaPluviometros(this.pluviomentros);
    }

    public List<Integer> getPluviomentros() {
        return pluviomentros;
    }

    public void setPluviomentros(List<Integer> pluviomentros) {
        this.pluviomentros = pluviomentros;
    }

    public TipoCaminhao getTipo() {
        return tipo;
    }

    public void setTipo(TipoCaminhao tipo) {
        this.tipo = tipo;
    }

    public int getSoma() {
        return this.soma;
    }

    public void somaPluviometros(List<Integer> lista) {
        this.pluviomentros.forEach(a -> soma += a);
    }
}
