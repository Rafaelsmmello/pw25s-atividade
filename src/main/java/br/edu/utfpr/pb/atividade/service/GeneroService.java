package br.edu.utfpr.pb.atividade.service;

import br.edu.utfpr.pb.atividade.model.Genero;

import java.util.List;

public interface GeneroService extends CrudService<Genero, Long>{

	List<Genero> findByNomeLike(String nome);
}
