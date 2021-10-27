package Lista_de_Exercicios_1.Exercicio3;

import Lista_de_Exercicios_1.Exercicio1.Pessoa;

import java.time.LocalDate;
import java.util.Collections;

public class Exercicio_3 {
    public static void main(String[] args) throws Exception {
        Elevador elevador = new Elevador();

        Pessoa gabriel = new Pessoa("Gabriel", LocalDate.of(1997, 10, 16), 1.80);
        Pessoa ana = new Pessoa("Ana", LocalDate.of(1950, 12, 01), 1.68);
        Pessoa patricia = new Pessoa("Patricia", LocalDate.of(1978, 04, 14), 1.72);

        elevador.inicializa(2, 20);

        //Testanto total de pessoas no elevador
        elevador.entra(gabriel);
        elevador.entra(patricia);
        elevador.entra(ana);

        elevador.sai(gabriel);
        elevador.sai(patricia);
        elevador.sai(ana);

        elevador.sobe(20);
        elevador.desce(19);


    }
}
