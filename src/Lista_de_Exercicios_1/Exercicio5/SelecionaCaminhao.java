package Lista_de_Exercicios_1.Exercicio5;

import java.util.*;

public class SelecionaCaminhao extends Controle {

    public static void selecionaCaminhao() {
        List<Caminhao> caminhoes = new ArrayList();

        adicionaCaminhoesNaLista(caminhoes);

        Collections.sort(caminhoes, (a, b) -> a.getSoma() - b.getSoma());

        imprimeDadosMaisApto(caminhoes);

    }

    private static void adicionaCaminhoesNaLista(List<Caminhao> caminhoes) {
        do {
            TipoCaminhao tipoCaminhao = setTipoCaminhao();
            int tamanho = setTamanhoListaPluviometros();
            List<Pluviometros> pluviometros = setValorPluviometros(tamanho);

            Caminhao caminhao = new Caminhao(pluviometros, tipoCaminhao, tamanho);
            caminhoes.add(caminhao);

            imprimir("Deseja parar de executar o programa?\nSe sim, digite 'Fim'...\n");
        }
        while (!leString().equalsIgnoreCase("Fim"));
    }

    private static void imprimeDadosMaisApto(List<Caminhao> caminhoes) {
        imprimir("\nDados do caminhão mais apto\n\n");
        imprimir("Tipo do caminhão: " + caminhoes.get(caminhoes.size() - 1).getTipo().getDescricao() + "\n");
        imprimir("Lista de pluviômetros transportados no caminhão: " + caminhoes.get(caminhoes.size() - 1).getPluviomentros().toString());
    }

    private static List<Pluviometros> setValorPluviometros(int tamanho) {
        List<Pluviometros> pluviometros = new ArrayList<>(tamanho);
        imprimir("Digite o tipo de cada pluviometro da lista (P/M/G): " + "\n");

        for (int i = 0; i < tamanho; i++) {
            imprimir((i+1) + "º pluviometro: ");
            String x = leString();

            Pluviometros pluviomentro = new Pluviometros();
            TipoPluviometro tipo = null;

            tipo = verificaTipoPluviometro(x, tipo);
            pluviomentro.setTipo(tipo);
            pluviometros.add(pluviomentro);
        }
        return pluviometros;
    }

    private static int setTamanhoListaPluviometros() {
        imprimir("Digite o numero de pluviometros a serem transportados: ");
        int tamanho = leInteiro();
        return tamanho;
    }

    private static TipoCaminhao setTipoCaminhao() {
        imprimir("Digite o tipo do caminhao (Alfa/Beta): ");
        String tipo = leString();
        TipoCaminhao tipoCaminhao = null;

        tipoCaminhao = verificaTipoCaminhao(tipo, tipoCaminhao);
        return tipoCaminhao;
    }

    private static TipoCaminhao verificaTipoCaminhao(String tipo, TipoCaminhao tipoCaminhao) {
        while(!tipo.equalsIgnoreCase("Alfa") && !tipo.equalsIgnoreCase("Beta")) {
            imprimir("Tipo inválido, digite um tipo válido (Alfa/Beta): ");
            tipo = leString();
        }
        if (tipo.equalsIgnoreCase("Alfa"))
            tipoCaminhao = TipoCaminhao.ALFA;
        if (tipo.equalsIgnoreCase("Beta"))
            tipoCaminhao = TipoCaminhao.BETA;
        return tipoCaminhao;
    }

    private static TipoPluviometro verificaTipoPluviometro(String x, TipoPluviometro tipo) {
        while (!x.equalsIgnoreCase("P") && !x.equalsIgnoreCase("M") && !x.equalsIgnoreCase("G")) {
            imprimir("Tipo inválido, digite um tipo válido (P/M/G): ");
            x = leString();
        }
        if (x.equalsIgnoreCase("P"))
            tipo = TipoPluviometro.P;
        if (x.equalsIgnoreCase("M"))
            tipo = TipoPluviometro.M;
        if (x.equalsIgnoreCase("G"))
            tipo = TipoPluviometro.G;
        return tipo;
    }

    private static void imprimir(String s) {
        System.out.print(s);
    }

}

