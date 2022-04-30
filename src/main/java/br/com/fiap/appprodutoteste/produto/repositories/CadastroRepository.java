package br.com.fiap.appprodutoteste.produto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.appprodutoteste.produto.model.CadastroLogin;

@Repository
public interface CadastroLoginRepository extends JpaRepository<CadastroLogin, Long> {

}
