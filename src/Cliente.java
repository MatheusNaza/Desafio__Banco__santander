public class Cliente {

	private String nome;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSenha(String senha) {
        this.senha = senha;
    }

	public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

}