package Lista_de_Exercicios_1.Exercicio4;

import org.w3c.dom.CDATASection;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) throws Exception{
        Televisao tv = new Televisao();

        tv.setCanais("Globo", "SBT", "BAND", "Record");
        System.out.println(tv.getCanais());

        ControleRemoto controle = new ControleRemoto(tv);

        Scanner sc = new Scanner(System.in);
        int  opcao = 0;

        do {
            System.out.print(String.format("%38s\n\n%-30s%s\n%-30s%s\n%-30s%s\n%-30s\n\n%s", "Menu do Controle Remoto", "1 - Aumentar volume", "2 - Diminuir volume",
                    "3 - Aumentar canal", "4 - Diminuir canal", "5 - Selecionar canal", "6 - Consultar informações da TV",
                    "7 - Encerrar", "Selecionar opção: "));

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    controle.aumentarVolume();
                    break;
                case 2:
                    controle.diminuirVolume();
                    break;
                case 3:
                    controle.aumentarCanal();
                    break;
                case 4:
                    controle.diminuirCanal();
                    break;
                case 5:
                    System.out.print("Digite o numero do canal: ");
                    int canal = sc.nextInt();
                    controle.selecionarCanal(canal);
                    break;
                case 6:
                    controle.consultarInformaçõesDaTelevisão();
                    break;
                case 7:
                    System.out.println("\nDesligando controle");
                    break;

                default:
                    System.out.println("Opcão inválida");


            }
        } while (opcao != 7);
    }
}
