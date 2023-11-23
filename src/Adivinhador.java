import java.util.Random;
import java.util.Scanner;

public class Adivinhador {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;

        boolean acertou = false;
        System.out.println("Estou pensando em um número de 1 a 10. Que número é esse?");
        Scanner leitura = new Scanner(System.in);
        int palpite = 0;
        int tentativas = 0;

        while (!acertou) {
            palpite = leitura.nextInt();
            tentativas++;

            if (palpite >= 1 && palpite <= 10) {
                //lógica de verificar se acertou
                if (palpite == numeroAleatorio) {
                    System.out.printf("Parabéns! você acertou com %s tentativas!  O número secreto era %s", tentativas, numeroAleatorio);
                    acertou = true;
                } else if (numeroAleatorio > palpite) {
                    System.out.println("Número aleatório é maior. Tente outra vez: ");
                } else {
                    System.out.println("Número aleatório é menor. Tente outra vez: ");
                }
            } else {
                System.out.println("Digite um número de 1 a 10.");
            }
        }
    }
}