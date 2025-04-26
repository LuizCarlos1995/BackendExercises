package src;

import java.util.Scanner;

public class ValidacaoDoador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do doador: ");
        int idade = sc.nextInt();
        System.out.println("Digite o peso do doador (em Kg): ");
        double peso = sc.nextDouble();

        if (idade >= 18 && idade <= 65 && peso > 50) {
            System.out.println("O doador é compatível para doação de sangue.");
        } else {
            System.out.println("O doador não é compatível.");
            if (idade < 18 || idade > 65) {
                System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
            }
            if (peso < 50) {
                System.out.println("Motivo: Deve pesar mais de 50 kg.");
            }
        }
        sc.close();
    }
}
