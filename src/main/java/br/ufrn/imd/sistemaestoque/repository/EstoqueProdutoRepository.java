package br.ufrn.imd.sistemaestoque.repository;

import br.ufrn.imd.sistemaestoque.domain.EstoqueProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueProdutoRepository extends JpaRepository<EstoqueProduto, Long> {
}
