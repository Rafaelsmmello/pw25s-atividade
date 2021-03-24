package br.edu.utfpr.pb.atividade.service.impl;

import br.edu.utfpr.pb.atividade.model.Livro;
import br.edu.utfpr.pb.atividade.repository.LivroRepository;
import br.edu.utfpr.pb.atividade.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LivroServiceImpl extends CrudServiceImpl<Livro, Long>
        implements LivroService{

    @Autowired
    private LivroRepository LivroRepository;

    @Override
    protected JpaRepository<Livro, Long> getRepository() {
        return LivroRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Livro> findByNomeLike(String nome) {
        return LivroRepository.findByTituloLike(nome);
    }

}
