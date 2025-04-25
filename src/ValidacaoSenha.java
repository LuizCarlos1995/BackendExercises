import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = sc.next();
        if (senha.equals("654321")){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Senha invalida!");
        }
    }
}
