/* Agora é com você! Pratique os conceitos que foram ensinados ao longo
dessa aula com o seguinte desafio:

Crie um programa que simula um jogo de adivinhação, que deve gerar um
número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar
o número, em até 5 tentativas. A cada tentativa, o programa deve informar se
o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop. */

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(10);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 10: ");
            numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número gerado é maior.");
            } else {
                System.out.println("O número gerado é menor.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroAleatorio) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);

        }

    }
}