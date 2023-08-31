import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner keyboardReading = new Scanner(System.in);
        int solution = new Random().nextInt(100);

        System.out.println("JOGO DA ADIVINHAÇÃO");


        for (int i = 0; i < 5; i++) {

            System.out.println("Tente descobrir o número de 1 à 100. Para sair, digite '0'.");
            int response = keyboardReading.nextInt();

            if (response < 0 || response > 100) {
                System.out.println("Digite um número válido entre 1 e 100.");
                i--;
            }

            if(response < solution && response != 0) {
                System.out.println("A solução é maior que " + response + ". ");

                if (i < 4){
                    System.out.println("Você tem " + (4 - i) + " tentativas");
                } else {
                    System.out.println("Suas chances acabaram. A solução é: " + solution);
                }

            } else if (response > solution) {
                System.out.println("A solução é menor que " + response + ". ");

                if (i < 4){
                    System.out.println("Você tem " + (4 - i) + " tentativas");
                } else {
                    System.out.println("Suas chances acabaram. A solução é: " + solution);
                }

            } else if (response == solution) {
                System.out.println("Parabéns. " + response + " é o número correto.");
                break;
            } else {
                System.out.println("Que pena. Você desistiu.");
                break;
            }
        }
    }
}
