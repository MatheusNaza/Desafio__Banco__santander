import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Cliente> clientes = new HashMap<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getNome(), cliente);
    }

    public Cliente autenticarCliente(String nome, String senha) {
        Cliente cliente = clientes.get(nome);
        if (cliente != null && cliente.autenticar(senha)) {
            return cliente;
        }
        return null;
    }
}