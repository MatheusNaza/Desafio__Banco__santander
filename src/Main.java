import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        // Criando e adicionando cliente ao banco
        Cliente cliente = new Cliente();
        cliente.setNome("matheus");
        cliente.setSenha("123");
        banco.adicionarCliente(cliente);

        // Autenticação do cliente
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        Cliente clienteAutenticado = banco.autenticarCliente(nome, senha);
        if (clienteAutenticado != null) {
            System.out.println("Autenticação bem-sucedida. Bem-vindo, " + clienteAutenticado.getNome() + "!");
            
            // Criando contas para o cliente autenticado
            Conta cc = new ContaCorrente(clienteAutenticado);
            Conta poupanca = new ContaPoupanca(clienteAutenticado);

            // Realizando operações nas contas
            cc.depositar(100);
            cc.transferir(100, poupanca);

            // Imprimindo extratos das contas
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        } else {
            System.out.println("Nome ou senha incorretos.");
        }

        scanner.close();
    }
}
