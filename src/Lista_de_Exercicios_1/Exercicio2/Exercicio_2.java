package Lista_de_Exercicios_1.Exercicio2;

import Lista_de_Exercicios_1.Exercicio1.Pessoa;

import java.time.LocalDate;

public class Exercicio_2 {
    public static void main(String[] args) {

        Pessoa gabriel = new Pessoa("Gabriel", LocalDate.of(1997, 10, 16), 1.80);
        Pessoa ana = new Pessoa("Ana", LocalDate.of(1950, 12, 01), 1.68);
        Pessoa patricia = new Pessoa("Patricia", LocalDate.of(1978, 04, 14), 1.72);

        Agenda agenda = new Agenda();

        agenda.armazenaPessoa(gabriel);
        agenda.armazenaPessoa(ana);
        agenda.armazenaPessoa(patricia);

        // Printando a lista de pessoas na agenda
        System.out.println(agenda.toString());

        agenda.removePessoa(ana);

        //Lista de pessoas após a remoção
        System.out.println(agenda.toString());

        agenda.buscaPessoa(gabriel);

        agenda.imprimeAgenda();

        agenda.imprimePessoa(0);

    }
}
