package br.edu.utfpr.pb.atividade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.atividade.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long>{

    List<Genero> findByNomeLike(String nome);
}
