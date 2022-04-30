package br.com.fiap.provinha.prova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.provinha.prova.model.CadastroLogin;

@Repository
public interface CadastroLoginRepository extends JpaRepository<CadastroLogin, Long> {

}
