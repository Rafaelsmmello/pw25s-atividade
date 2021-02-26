package br.edu.utfpr.pb.atividade.service.impl;

import br.edu.utfpr.pb.atividade.model.Cidade;
import br.edu.utfpr.pb.atividade.repository.CidadeRepository;
import br.edu.utfpr.pb.atividade.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CidadeServiceImpl extends CrudServiceImpl<Cidade, Long>
        implements CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    protected JpaRepository<Cidade, Long> getRepository() {
        return cidadeRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cidade> findByNomeLike(String nome) {
        return cidadeRepository.findByNomeLike(nome);
    }

}
