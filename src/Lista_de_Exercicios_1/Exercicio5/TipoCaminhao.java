package Lista_de_Exercicios_1.Exercicio5;

public enum TipoCaminhao {

    ALFA("Alfa"),
    BETA("Beta");

    private String descricao;

    TipoCaminhao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
