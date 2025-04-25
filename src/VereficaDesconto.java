import java.util.Scanner;

public class VereficaDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        double novoValor = 0;

        if (valorCompra >= 100){
            novoValor = valorCompra - (valorCompra * .10);
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo Valor: R$ " + novoValor);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$ " + valorCompra);
        }
        scanner.close();
    }
}
