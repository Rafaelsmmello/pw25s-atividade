package br.edu.utfpr.pb.atividade.service;

import br.edu.utfpr.pb.atividade.model.Cidade;

import java.util.List;

public interface CidadeService extends CrudService<Cidade, Long>{

    List<Cidade> findByNomeLike(String nome);
}
