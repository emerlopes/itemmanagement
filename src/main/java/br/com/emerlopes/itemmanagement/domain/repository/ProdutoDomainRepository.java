package br.com.emerlopes.itemmanagement.domain.repository;


import br.com.emerlopes.itemmanagement.domain.entity.ProdutoDomainEntity;

import java.util.List;

public interface ProdutoDomainRepository {

    List<ProdutoDomainEntity> buscarProdutos();

    ProdutoDomainEntity buscarProdutoPorId(ProdutoDomainEntity produto);

    ProdutoDomainEntity atualizarProduto(ProdutoDomainEntity produto);
}
