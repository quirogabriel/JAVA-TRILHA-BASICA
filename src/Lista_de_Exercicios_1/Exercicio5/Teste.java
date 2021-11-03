package Lista_de_Exercicios_1.Exercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {
    public static void main(String[] args) {
        List<Integer> pluvi = new ArrayList<>();
        pluvi.add(10);
        pluvi.add(11);
        pluvi.add(9);

        Caminhao caminhao = new Caminhao(pluvi, TipoCaminhao.ALFA);
        Caminhao caminhao2 = new Caminhao(pluvi, TipoCaminhao.BETA);

        System.out.println(caminhao.getSoma());
        System.out.println(caminhao2.getSoma());

        Collections.sort(pluvi);

        System.out.println(pluvi);
    }
}
