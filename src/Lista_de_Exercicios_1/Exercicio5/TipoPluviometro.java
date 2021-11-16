package Lista_de_Exercicios_1.Exercicio5;

public enum TipoPluviometro {
    P(10),
    M(20),
    G(30);

    private int tamanho;

    TipoPluviometro(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }
}
