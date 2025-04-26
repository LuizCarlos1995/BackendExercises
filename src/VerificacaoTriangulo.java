package src;

import java.util.Scanner;

public class VerificacaoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int lado1 = sc.nextInt();
        System.out.println("Digite o segundo lado: ");
        int lado2 = sc.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int lado3 = sc.nextInt();

        int soma = lado1 + lado2;
        if (soma > lado3) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não forma um triângulo.");
        }
    }
}
