package Lista_de_Exercicios_1.Exercicio4;

import org.w3c.dom.CDATASection;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Televisao tv = new Televisao();

        tv.setCanais("Globo", "SBT", "BAND", "Record");

        ControleRemoto controle = new ControleRemoto(tv);
    }
}
