import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        char sair = 'n';
        int numero = 0;
        String agencia = "";
        String nomeCompleto = "";
        float saldo = 0.0f;

        Scanner scanner = new Scanner(System.in);

        while (Character.toLowerCase(sair) != 's') {
            System.out.println("\nOlá! Vamos para a criação da conta!\n");

            // Solicitando dados
            System.out.print("Informe o número da conta: ");
            scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            System.out.print("Informe a agência: ");
            agencia = scanner.nextLine();

            System.out.print("Informe o seu nome completo: ");
            nomeCompleto = scanner.nextLine();

            System.out.print("Informe o valor do depósito: ");
            saldo = scanner.nextFloat();
            scanner.nextLine(); // Consumir quebra de linha deixada pelo nextFloat()

            // Exibindo os dados
            System.out.printf("Titular: %s%n", nomeCompleto);
            System.out.printf("\nConta criada com sucesso!\n");
            System.out.printf("Número da conta: %d%n", numero);
            System.out.printf("Agência: %s%n", agencia);
            System.out.printf("Saldo disponível: R$ %.2f%n", saldo);

            // Confirmação do usuário
            System.out.print("\nOs dados estão corretos? Confirme digitando 's' para sair ou 'n' para refazer: ");
            sair = scanner.next().charAt(0);
        }

        scanner.close(); // Fechando o scanner

        // Mensagem final
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco!%n", nomeCompleto);
        System.out.printf("Sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.%n", agencia,
                numero, saldo);
    }
}
