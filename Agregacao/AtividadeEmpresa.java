package RelacoesClasses.Agregacao;

public class AtividadeEmpresa {
	
	private String nome;
	private Departamento departamento;
	
	public AtividadeEmpresa(String nome, Departamento departamento) {
		this.nome = nome;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
    
}
