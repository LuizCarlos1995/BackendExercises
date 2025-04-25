import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        double media;
        double soma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota do aluno: ");
            nota = scanner.nextDouble();
            soma += nota;
        }

        media = soma / 3;
        if (media >= 7) {
            System.out.println(String.format("O estudante teve média %.2f e foi aprovado.", media));
        } else if (media >= 5 && media < 6.9) {
            System.out.println(String.format("O estudante teve média %.2f e está de recuperação.", media));
        } else {
            System.out.println(String.format("O estudante teve média %.2f e foi reprovado.", media));
        }
    }
}
