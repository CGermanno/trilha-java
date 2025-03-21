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
        int numero = scanner.nextInt(); 
        scanner.nextLine();

        System.out.print("Informe a agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Informe o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Informe o valor do deposito: ");
        float saldo = scanner.nextFloat();

        // Exibindo os dados
        System.out.printf("O número é: %s%n", numero); 
        System.out.printf("A agência é: %s%n", agencia); 
        System.out.printf("Nome completo: %s%n", nomeCompleto); 
        System.out.printf("O saldo disponível é de: %.2f%n", saldo); 



        System.out.print("Está correto? Confirme e ESCREVA 's/n'");
        sair = scanner.next().charAt(0);

        
    }
    scanner.close(); // Fechando o scanner
}
}
