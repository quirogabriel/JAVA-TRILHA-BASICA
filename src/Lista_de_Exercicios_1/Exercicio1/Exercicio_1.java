package Lista_de_Exercicios_1.Exercicio1;

import java.time.LocalDate;
import java.time.Month;

public class ExercicioUm {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Gabriel", LocalDate.of(1997, Month.OCTOBER, 16), 1.80);
        pessoa.setNome("Gabriel");
        pessoa.setAltura(1.80);
        pessoa.setData(LocalDate.of(1997, Month.OCTOBER, 16));

        pessoa.idade(pessoa.getData());
        pessoa.imprimir();

    }
}
