package RelacoesClasses.Associacao;

public class Estudante {

	private String nome;
	private Universidade universidade;

	public Estudante(String nome, Universidade universidade) {
		this.nome = nome;
		this.universidade = universidade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public Universidade getUniversidade() {
		return universidade;
	}
	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}

}
