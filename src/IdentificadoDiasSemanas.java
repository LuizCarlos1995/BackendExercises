package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IdentificadoDiasSemanas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String diaDaSemana = scanner.nextLine().toLowerCase();
        List<String> diasUteis = Arrays.asList("segunda", "terça",
                "quarta", "quinta", "sexta");

        if (diasUteis.contains(diaDaSemana)) {
            System.out.println(diaDaSemana + " não é um dia útil.");
        } else {
            System.out.println(diaDaSemana + " é um dia útil.");
        }
    }
}
