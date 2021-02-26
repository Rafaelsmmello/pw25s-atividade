package br.edu.utfpr.pb.atividade.service;

import br.edu.utfpr.pb.atividade.model.Livro;

import java.util.List;

public interface LivroService extends CrudService<Livro, Long>{

    List<Livro> findByNomeLike(String nome);
}
