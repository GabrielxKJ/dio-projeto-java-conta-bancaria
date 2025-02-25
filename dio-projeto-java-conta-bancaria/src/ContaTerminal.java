import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu número de usuário: ");
        int numeroUsuario = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nomeDoUsuario = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String numeroDaAgencia = scanner.nextLine();

        System.out.print("Digite o saldo referente a sua conta: ");
        double saldoDoUsuario = scanner.nextDouble();


        Usuario usuario = new Usuario(numeroUsuario, numeroDaAgencia, nomeDoUsuario, saldoDoUsuario);

        System.out.println("\nOlá " + usuario.nome_cliente + 
            ", obrigado por criar uma conta em nosso banco. Sua agência é " + usuario.agencia +
            ", conta " + usuario.numero + " e seu saldo " + usuario.saldo + " já está disponível para saque.");

        scanner.close();
        
        };

    }
