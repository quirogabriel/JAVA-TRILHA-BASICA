package Lista_de_Exercicios_1.Exercicio3;

import Lista_de_Exercicios_1.Exercicio1.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Elevador {

    private int andar = 0;
    private int totalAndares = 0;
    private int capacidade = 0;
    private int totalDePessoasDentro = 0;

    private List<Pessoa> elevador;

    public List<Pessoa> getElevador() {
        return elevador;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getTotalDePessoasDentro() {
        return totalDePessoasDentro;
    }

    public void setTotalDePessoasDentro(int totalDePessoasDentro) {
        this.totalDePessoasDentro = totalDePessoasDentro;
    }

    public void inicializa(int capacidade, int totalAndares) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.elevador = new ArrayList<>(capacidade);

    }

    public void entra(Pessoa pessoa) throws Exception{
        try {
            if (this.elevador.size() < this.capacidade) {
                this.elevador.add(pessoa);
                this.totalDePessoasDentro++;
                System.out.println("Entrando pessoa: " + pessoa.getNome() + " | Total: " + totalDePessoasDentro + "/" + capacidade );
            } else {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("Total de pessoas excedido! " + pessoa.getNome() + " não pode entrar.");
        }
    }

    public void sai(Pessoa pessoa) throws Exception{
        try {
            if (this.totalDePessoasDentro != 0) {
                this.elevador.remove(pessoa);
                this.totalDePessoasDentro--;
                System.out.println("Saindo pessoa: " + pessoa.getNome() + " | Total: " + totalDePessoasDentro + "/" + capacidade);
            } else {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("Elevador vazio!");
        }
    }

    public void sobe(int andar){
        int total = this.andar + andar;

        try {
            if (total <= totalAndares) {
                this.andar += total;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Impossível subir mais, ultimo andar já alcançado.");
        }
    }

    public void desce(int andar){
        try {
            if (andar >= 0) {
                this.andar -= andar;
                System.out.println("Andar atual: " + this.andar);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Impossivel descer mais, térreo já alcançado.");
        }
    }
}
