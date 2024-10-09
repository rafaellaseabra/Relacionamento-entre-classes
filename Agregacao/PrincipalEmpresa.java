package RelacoesClasses.Agregacao;

public class PrincipalEmpresa {
	public static void main(String[] args) {
		
		Departamento departamento = new Departamento ("RH");
		AtividadeEmpresa empresa = new AtividadeEmpresa("Senai", departamento);
		
		System.out.println("Empresa é: " + empresa.getNome() + "\nTrabalha no departamento: " + departamento.getNome());
	}

}
