package br.edu.utfpr.pb.atividade.repository;

import br.edu.utfpr.pb.atividade.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
