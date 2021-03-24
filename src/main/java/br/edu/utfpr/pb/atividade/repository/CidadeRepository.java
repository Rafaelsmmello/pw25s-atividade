package br.edu.utfpr.pb.atividade.repository;

import br.edu.utfpr.pb.atividade.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    List<Cidade> findByNomeLike(String nome);

}
