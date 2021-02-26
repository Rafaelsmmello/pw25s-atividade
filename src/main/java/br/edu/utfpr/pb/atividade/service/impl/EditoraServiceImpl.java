package br.edu.utfpr.pb.atividade.service.impl;

import br.edu.utfpr.pb.atividade.model.Editora;
import br.edu.utfpr.pb.atividade.repository.EditoraRepository;
import br.edu.utfpr.pb.atividade.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EditoraServiceImpl extends CrudServiceImpl<Editora, Long>
        implements EditoraService {

    @Autowired
    private EditoraRepository EditoraRepository;

    @Override
    protected JpaRepository<Editora, Long> getRepository() {
        return EditoraRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Editora> findByNomeLike(String nome) {
        return EditoraRepository.findByNomeLike(nome);
    }

}