import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2){
            System.out.println("O maior numero é " + numero1);
        }  else if (numero1 < numero2){
            System.out.println("O maior numero " + numero2);
        } else {
            System.out.println("Os numeros "  + numero1 + " e " + numero2 + " são iguais");
        }
    }
}
