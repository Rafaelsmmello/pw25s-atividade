package br.edu.utfpr.pb.atividade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.atividade.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{

    List<Autor> findByNomeLike(String nome);
}
