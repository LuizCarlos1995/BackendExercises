import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sair = "";

        while (!sair.equals("sair")) {
            System.out.println("Digite um valor: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " par");
            } else {
                System.out.println("O número " + numero + " impar");
            }
            System.out.println("Digite sair se não deseja continua: ");
            sair = scanner.next();
        }
        scanner.close();
        System.out.println("Programa finalizado");
    }
}
