package src;

import java.util.Scanner;

public class VerificaEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        double valoremprestimo = scanner.nextInt();

        if (valoremprestimo >= 1000 && valoremprestimo <= 5000) {
            System.out.println("O valor " + valoremprestimo + " ,está " +
                    "dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valoremprestimo + ",não está " +
                    "dentro do intervalo permitido para empréstimo.");
        }
    }
}
