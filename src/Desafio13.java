import java.util.Scanner;

public class Desafio13 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        /* Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo", caso contrário,
        exiba "Número negativo".
         */

        System.out.println("Digite um numero: ");
        int numero1 = leitura.nextInt();

        if (numero1 > 0) {
            System.out.println("Numero positivo: " + numero1);
        } else {
            System.out.println("Numero negativo: " + numero1);
        }

        /*Peça ao usuário para inserir dois números inteiros. Compare
        os números e imprima uma mensagem indicando se são iguais, diferentes,
        o primeiro é maior ou o segundo é maior.
         */

        System.out.println("Digite um mais numero: ");
        int numero2 = leitura.nextInt();

        if (numero2 == numero1) {
            System.out.println("O numeros sao iguais ");
        }  else {
            System.out.println("O numeros sao diferentes ");
        }

        if (numero1 > numero2) {
            System.out.println("O numero " + numero1 + " é maior " + numero2);
        }  else {
            System.out.println("O numero " + numero1 + " é menor " + numero2);
        }
        /*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2.
        Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com
        base na opção selecionada.
         */

        /*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/

        /*Crie um programa que solicite ao usuário a entrada de um número inteiro.
        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
         */

/* Crie um programa que solicite ao usuário um número e calcule o fatorial desse número. */

    }
}
