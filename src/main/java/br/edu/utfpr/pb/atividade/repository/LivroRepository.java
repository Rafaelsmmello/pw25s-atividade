package br.edu.utfpr.pb.atividade.repository;

import br.edu.utfpr.pb.atividade.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByTituloLike(String titulo);

    List<Livro> findByAutorNomeContainsOrderByAno(String autor);

    List<Livro> findByAno(int ano);

    List<Livro> findByGeneroNomeContainsOrderByAno(String nome);

    List<Livro> findByIsbnContainsOrTituloContainsOrderByAno(String isbn, String titulo);

    List<Livro> findByValorGreaterThanEqual(Double valor);

    List<Livro> findByValorBetweenOrderByAno(Double a, Double b);

}
