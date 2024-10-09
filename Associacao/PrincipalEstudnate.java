package RelacoesClasses.Associacao;

public class PrincipalEstudnate {

	public static void main(String[] args) {

		Universidade universidade = new Universidade("USP");

		Estudante estudante = new Estudante("Tainá", universidade);

		System.out.println("Estudante: " + estudante.getNome() + "\nUniversidade: " + universidade.getNome());

	}
}
