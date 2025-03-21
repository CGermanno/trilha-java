import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        char sair = 'n';
        Scanner scanner = new Scanner(System.in);
        while (sair != 's') {
            
        System.out.println("Olá Germano! Vamos para a criação da conta!");

        // Criando o scanner

        // Solicitando dados
        System.out.print("Informe o numero: ");
        int numero = scanner.nextInt(); // 'numero' é uma String
        scanner.nextLine();

        System.out.print("Informe a agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Informe o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Informe o valor do deposito: ");
        float saldo = scanner.nextFloat(); // 'saldo' é um float

        // Exibindo os dados
        System.out.printf("O número é: %s%n", numero); // Para String
        System.out.printf("A agência é: %s%n", agencia); // Para String
        System.out.printf("Nome completo: %s%n", nomeCompleto); // Para String
        System.out.printf("O saldo disponível é de: %.2f%n", saldo); // Para float com 2 casas decimais



        System.out.print("Está correto? Confirme e ESCREVA 's/n'");
        sair = scanner.next().charAt(0);

        
    }
    scanner.close(); // Fechando o scanner
}
}
