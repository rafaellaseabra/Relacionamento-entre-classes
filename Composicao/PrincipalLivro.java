package RelacoesClasses.Composicao;

public class PrincipalLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro ("Quincas Borbas", "Machado de Assis");
		
		System.out.println("O livro: " +livro.getTitulo()+"\nFoi escrito por: "+ livro.getAutor());

	}

}
