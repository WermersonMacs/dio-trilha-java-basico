import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importa a classe scanner
        Scanner leitor = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuario.
        System.out.println("Por favor, Digite seu nome e sobre nome!");
        //Obter pelo scanner os valores digitados no terminal.
        String nomeCliente = leitor.nextLine();

        //Exibir as mensagens para o nosso usuario.
        System.out.println("Por favor, digite o numero da sua agencia");
        //Obter pelo scanner os valores digitados no terminal.
        String agencia = leitor.nextLine();

        //Exibir as mensagens para o nosso usuario.
        System.out.println("Por favor, Digite seu numero de cadastro!");
        //Obter pelo scanner os valores digitados no terminal.
        int numero = leitor.nextInt();

        //Exibir as mensagens para o nosso usuario.
        System.out.println("Por favor, Digite seu saldo:");
        //Obter pelo scanner os valores digitados no terminal.
        double saldo = leitor.nextDouble();

        leitor.close();

        //Exibir a mensagem conta criada.
        System.out.println("Olá "+nomeCliente+", Obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
