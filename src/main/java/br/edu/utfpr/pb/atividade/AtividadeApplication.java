package br.edu.utfpr.pb.atividade;

import br.edu.utfpr.pb.atividade.model.*;
import br.edu.utfpr.pb.atividade.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeApplication{
	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private LivroRepository livroRepository;

	@Autowired
	private AutorRepository autorRepository;

	@Autowired
	private EditoraRepository editoraRepository;

	@Autowired
	private GeneroRepository generoRepository;

	public static void main(String[] args) {
		SpringApplication.run(AtividadeApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Editora editora = new Editora();
		editora.setNome("editora1");
		salvarEditora(editora);

		Autor autor = new Autor();
		autor.setNome("autor1");
		salvarAutor(autor);

		Autor autor2 = new Autor();
		autor2.setNome("autor2");
		salvarAutor(autor2);

		Cidade cidade = new Cidade();
		cidade.setNome("Pato Branco");
		salvarCidade(cidade);

		Genero genero = new Genero();
		genero.setNome("historia");
		salvarGenero(genero);

		Livro livro = new Livro();
		livro.setAutor(autor);
		livro.setAno(1988);
		livro.setCidade(cidade);
		livro.setEditora(editora);
		livro.setGenero(genero);
		livro.setIsbn(1231231);
		livro.setTitulo("titulo do livro");
		livro.setValor(10.00);
		salvarLivro(livro);

		findByAutorNomeContainsOrderByAno("autor");
		findByAno(1988);
		findByGeneroNomeContainsOrderByAno("historia");
		//findByIsbnContainsOrTituloContainsOrderByAno("aaa","segundo");
		findByValorGreaterThanEqual(30.00);
		findByValorBetweenOrderByAno(1.0,12.0);

	}

	private void salvarLivro(Livro livro) {
		this.livroRepository.save(livro);
		System.out.println("livro salvo com sucesso! \n " + livro);
	}
	private void salvarAutor(Autor a) {
		this.autorRepository.save(a);
		System.out.println("autor salvo com sucesso! \n " + a);
	}
	private void salvarGenero(Genero a) {
		this.generoRepository.save(a);
		System.out.println("genero salvo com sucesso! \n " + a);
	}
	private void salvarCidade(Cidade a) {
		this.cidadeRepository.save(a);
		System.out.println("cidade salva com sucesso! \n " + a);
	}
	private void salvarEditora(Editora a) {
		this.editoraRepository.save(a);
		System.out.println("editora salva com sucesso! \n " + a);
	}

	private void findByAutorNomeContainsOrderByAno(String autor) {
		System.out.println("\n *********** LISTA DE livros autor CONTAINS ***********");
		livroRepository.findByAutorNomeContainsOrderByAno(autor)
				.forEach(p -> System.out.println(p));
		System.out.println("\n *********** LISTA DE livros autor CONTAINS ***********");
	}

	private void findByAno(int ano) {
		System.out.println("\n *********** LISTA DE livros ano CONTAINS ***********");
		livroRepository.findByAno(ano)
				.forEach(p -> System.out.println(p));
		System.out.println("\n *********** LISTA DE livros ano CONTAINS ***********");
	}

	private void findByGeneroNomeContainsOrderByAno(String nome) {
		System.out.println("\n *********** LISTA DE livros nome CONTAINS ***********");
		livroRepository.findByGeneroNomeContainsOrderByAno(nome)
				.forEach(p -> System.out.println(p));
		System.out.println("\n *********** LISTA DE livros nome CONTAINS ***********");
	}

	private void findByIsbnContainsOrTituloContainsOrderByAno(String isbn, String titulo) {
		System.out.println("\n *********** LISTA DE livros Isbn ou Titulo CONTAINS ***********");
		livroRepository.findByIsbnContainsOrTituloContainsOrderByAno(isbn,titulo)
				.forEach(p -> System.out.println(p));
		System.out.println("\n *********** LISTA DE livros Isbn ou Titulo CONTAINS ***********");
	}

	private void findByValorGreaterThanEqual(Double valor) {
		System.out.println("\n *********** LISTA DE livros valor greater ***********");
		livroRepository.findByValorGreaterThanEqual(valor)
				.forEach(p -> System.out.println(p));
		System.out.println("\n *********** LISTA DE livros valor greater ***********");
	}

	private void findByValorBetweenOrderByAno(Double a, Double b) {
		System.out.println("\n *********** LISTA DE livros Valor between ***********");
		livroRepository.findByValorBetweenOrderByAno(a,b)
				.forEach(p -> System.out.println(p));
		System.out.println("\n *********** LISTA DE livros Valor between ***********");
	}

}

