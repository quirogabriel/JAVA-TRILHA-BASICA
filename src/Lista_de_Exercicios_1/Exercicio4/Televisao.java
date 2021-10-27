package Lista_de_Exercicios_1.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Televisao {

    private List<String> canais = new ArrayList<>();
    private int volume = 10;
    private int numeroCanal;

    public List<String> getCanais() {
        return canais;
    }

    public void setCanais(String... canal) {
        for (String canais : canal)
            this.canais.add(canais);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumeroCanal() {
        return numeroCanal;
    }

    public void setNumeroCanal(int numeroCanal) {
        this.numeroCanal = numeroCanal;
    }

    @Override
    public String toString() {
        return "\nCanais: " + canais +
                "\nVolume: " + volume +
                "\nCanal atual: " + canais.get(numeroCanal);
    }
}
