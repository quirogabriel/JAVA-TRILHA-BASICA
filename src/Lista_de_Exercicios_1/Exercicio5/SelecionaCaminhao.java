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
            List<Integer> pluviometros = setValorPluviometros(tamanho);

            Caminhao caminhao = new Caminhao(pluviometros, tipoCaminhao, tamanho);
            caminhoes.add(caminhao);

            imprimir("Deseja parar de executar o programa?\nSe sim, digite 'Fim'.");
        }
        while (leString(new Scanner(System.in)).compareTo("Fim") != 0);
    }

    private static void imprimeDadosMaisApto(List<Caminhao> caminhoes) {
        imprimir("\nDados do caminhão mais apto\n");
        imprimir("Tipo do caminhão: " + caminhoes.get(caminhoes.size() - 1).getTipo().getDescricao());
        imprimir("Lista de pluviômetroos transportados no caminhão: " + caminhoes.get(caminhoes.size() - 1).getPluviomentros());
    }

    private static List<Integer> setValorPluviometros(int tamanho) {
        List<Integer> pluviometros = new ArrayList<>(tamanho);

        imprimir("Digite o tamanho de cada pluviomentro da lista: ");
        for (int i = 0; i < tamanho; i++) {
            int x = leInteiro(new Scanner(System.in));
            pluviometros.add(x);
        }
        return pluviometros;
    }

    private static int setTamanhoListaPluviometros() {
        imprimir("Digite o numero de pluviometros a serem transportados: ");
        int tamanho = leInteiro(new Scanner(System.in));
        return tamanho;
    }

    private static TipoCaminhao setTipoCaminhao() {
        imprimir("Digite o tipo do caminhao(Alfa/Beta): ");
        String tipo = leString(new Scanner(System.in));
        TipoCaminhao tipoCaminhao = null;

        if (tipo.equalsIgnoreCase("Alfa"))
            tipoCaminhao = TipoCaminhao.ALFA;
        if (tipo.equalsIgnoreCase("Beta"))
            tipoCaminhao = TipoCaminhao.BETA;
        return tipoCaminhao;
    }

    private static void imprimir(String s) {
        System.out.println(s);
    }

}
