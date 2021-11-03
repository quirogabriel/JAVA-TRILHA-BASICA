package Lista_de_Exercicios_1.Exercicio4;

import java.util.Scanner;

public class ControleRemoto implements ControleRemotoFuncoes {

    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
        ligar();
    }

    //Diminui o volume de 1 em 1
    @Override
    public void diminuirVolume() {
        try {
            if (this.televisao.getVolume() > 0) {
                    this.televisao.setVolume(this.televisao.getVolume() - 1);
                    imprimir("Volume diminuido");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            imprimir("Volume mínimo alcançado");
        }

    }

    //Aumenta o volume de 1 em 1
    @Override
    public void aumentarVolume() {
        try {
            if (this.televisao.getVolume() < 10) {
                this.televisao.setVolume(this.televisao.getVolume() + 1);
                imprimir("Volume aumentado");
            } else
                throw new Exception();
        } catch (Exception e) {
            imprimir("Volume máximo alcançado");
        }

    }

    //Aumenta os canais de 1 em 1
    @Override
    public void aumentarCanal() {
        try {
            //Verificar se há canais na televisão
            if (this.televisao.getCanais().size() >= 0) {
                try {
                    //Verificar se já está no ultimo canal
                    if (this.televisao.getNumeroCanal() < 10) {
                        this.televisao.setNumeroCanal(this.televisao.getNumeroCanal() + 1);
                        imprimir("Canal aumentado");
                    } else
                        throw new Exception();
                } catch (Exception e) {
                    imprimir("Não há mais canais acima");
                }
            } else
                throw new Exception();
        } catch (Exception e) {
            imprimir("Televisão fora do ar");
        }
    }

    //Diminui a quantidade de canais de 1 em 1
    @Override
    public void diminuirCanal() {
        //Verificar se há canais na televisão
        try {
            if (this.televisao.getCanais().size() >= 0) {
                //Verificar se já está no ultimo canal
                try {
                    if (this.televisao.getNumeroCanal() > 0) {
                        this.televisao.setNumeroCanal(this.televisao.getNumeroCanal() - 1);
                        imprimir("Canal diminuido");
                    } else
                        throw new Exception();
                } catch (Exception e) {
                    imprimir("Não há mais canais abaixo");
                }
            } else
                throw new Exception();
        } catch (Exception e) {
            imprimir("Televisão fora do ar");
        }
    }

    //Seleciona um canal específico
    @Override
    public void selecionarCanal(int numeroDoCanal) {
        try {
            this.televisao.setNumeroCanal(numeroDoCanal);
            imprimir("Canal mudado, você está assitindo agora " + televisao.getCanais().get(numeroDoCanal));
        } catch (IndexOutOfBoundsException e) {
            imprimir("Canal inexistente");
        }
    }

    //Consulta todas as informações da TV
    @Override
    public void consultarInformaçõesDaTelevisão() {
        imprimir(this.televisao.toString());
    }

    public void imprimir(String frase) {
        System.out.println("\n" + frase + "\n");
    }

    public void ligar() {
        Scanner sc = new Scanner(System.in);
        int  opcao = 0;

        do {
            System.out.print(String.format("%38s\n\n%-30s%s\n%-30s%s\n%-30s%s\n%-30s\n\n%s", "Menu do Controle Remoto", "1 - Aumentar volume", "2 - Diminuir volume",
                    "3 - Aumentar canal", "4 - Diminuir canal", "5 - Selecionar canal", "6 - Consultar informações da TV",
                    "7 - Encerrar", "Selecionar opção: "));

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                   aumentarVolume();
                    break;
                case 2:
                    diminuirVolume();
                    break;
                case 3:
                    aumentarCanal();
                    break;
                case 4:
                    diminuirCanal();
                    break;
                case 5:
                    imprimir("Digite o numero do canal: ");
                    int canal = sc.nextInt();
                    selecionarCanal(canal);
                    break;
                case 6:
                    consultarInformaçõesDaTelevisão();
                    break;
                case 7:
                    imprimir("Desligando controle");
                    break;

                default:
                    imprimir("Opcão inválida");


            }
        } while (opcao != 7);
    }
}
