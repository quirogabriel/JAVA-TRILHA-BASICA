package Lista_de_Exercicios_1.Exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nome;
    private LocalDate data;
    private double altura;
    private int idade;

    public Pessoa(String nome, LocalDate data, double altura) {
        this.nome = nome;
        this.data = data;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void idade(LocalDate data) {
        int idade = LocalDate.now().getYear() - data.getYear();
        this.idade = idade;
    }

    public void imprimir() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("Nome: %s | Data de Nascimento: %s | Altura: %.2f | Idade: %d" , this.nome, this.data.format(formatador), this.altura, this.idade);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                ", altura=" + altura +
                ", idade=" + idade +
                '}';
    }
}
