package br.com.emerlopes.itemmanagement.infrastructure.database.repository;

import br.com.emerlopes.itemmanagement.infrastructure.database.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}