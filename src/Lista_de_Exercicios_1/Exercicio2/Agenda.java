package Lista_de_Exercicios_1.Exercicio2;

import Lista_de_Exercicios_1.Exercicio1.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Pessoa> lista = new ArrayList<Pessoa>(10);

    public void armazenaPessoa(Pessoa pessoa) {
        lista.add(pessoa);
    }

    public void removePessoa(Pessoa pessoa) {
        lista.remove(pessoa);
    }

    public void buscaPessoa(Pessoa pessoa) {
        System.out.println(lista.indexOf(pessoa));
    }

    public void imprimeAgenda() {
        System.out.println(lista.toString());
    }

    public void imprimePessoa(int index) {
        System.out.println(lista.get(index));
    }

    @Override
    public String toString() {
        return "Agenda " + lista.toString();
    }
}
