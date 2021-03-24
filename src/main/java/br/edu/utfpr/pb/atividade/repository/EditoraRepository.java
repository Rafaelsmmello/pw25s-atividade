package br.edu.utfpr.pb.atividade.repository;

import br.edu.utfpr.pb.atividade.model.Cidade;
import br.edu.utfpr.pb.atividade.model.Editora;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EditoraRepository extends JpaRepository<Editora, Long> {
    List<Editora> findByNomeLike(String nome);

}
