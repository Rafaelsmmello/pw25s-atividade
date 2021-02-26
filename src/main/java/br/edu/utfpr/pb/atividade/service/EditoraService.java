package br.edu.utfpr.pb.atividade.service;

import br.edu.utfpr.pb.atividade.model.Editora;

import java.util.List;

public interface EditoraService extends CrudService<Editora, Long>{

    List<Editora> findByNomeLike(String nome);
}
