

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {

        Scanner dado = new Scanner(System.in);

        System.out.println(
                """
                ——————————————————————————————————————————————
                
                         ※ Jogo da Advinhação! ※
                         
                ——————————————————————————————————————————————
                        """);
        System.out.println("▶ Olá, Qual é o seu nome ? ");
        String nome = dado.nextLine();
        System.out.println("▶ Maneiro, " + nome + "! Vamos jogar.");


        Random aleatorio = new Random();
        int numeroSecreto = aleatorio.nextInt(101);
        int tentativa = 5;
        int numeroDigitado;
        int numeroChutes;

        //System.out.println(numeroSecreto);

        for (numeroChutes = 0; numeroChutes < tentativa; numeroChutes++) {
            System.out.println("▶ " + nome + ", Adivinhe que número estou pensando: ");
            numeroDigitado = dado.nextInt();
            boolean ganhou = numeroDigitado == numeroSecreto;
            boolean maior = numeroDigitado > numeroSecreto;
            boolean menor = numeroDigitado < numeroSecreto;
            if (ganhou) {
                System.out.println("▶ Parabéns! " + nome + ", Você Ganhou.");
                break;
            } else if (maior) {
                System.out.println("▶ Errado! O seu chute foi maior que número secreto. Tente novamente, " + nome);
            } else if (menor) {
                System.out.println("▶ Errado! O seu chute foi menor que o número secreto.Tente novamente, "+ nome);
            }
        }
        if (numeroChutes == tentativa) {
            System.out.println(
            """
             
             ※ GAME OVER!!! ※
             
                            """);

        }
    }
}




