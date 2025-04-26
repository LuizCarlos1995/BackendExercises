package src;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VerificacaoCodigoAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoAcesso = 2023;
        List<String> nivelAcesso = Arrays.asList ("1 ", "2 ","3");

        System.out.println("Digite o codigo de acesso: ");
        int codigoUsuario = sc.nextInt();
        System.out.println("Digite o nivel de permissão: ");
        String nivelUsuario = sc.next();

        if (codigoUsuario == codigoAcesso && nivelAcesso.contains(nivelUsuario)) {
            System.out.println("Acesso permitido. Bem vindo ao sistema!");
        } else  {
            System.out.println("Acesso negado!");
            if (codigoAcesso != codigoUsuario) {
                System.out.println("Motivo(s): Codigo Acesso incorreto!");
            }
            if (!nivelAcesso.contains(nivelUsuario)) {
                System.out.println("Motivo(s): Nivel Acesso incorreto!");
            }
        }
    }
}
