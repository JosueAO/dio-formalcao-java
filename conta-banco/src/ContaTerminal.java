import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        scanner.nextLine(); // Limpa o buffer do teclado
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        scanner.close();

        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(Integer.toString(numero))
                .concat(" e seu saldo ")
                .concat(Double.toString(saldo))
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);
    }
}
