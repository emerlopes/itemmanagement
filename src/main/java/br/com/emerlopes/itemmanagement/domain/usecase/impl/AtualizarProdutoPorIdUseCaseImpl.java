package br.com.emerlopes.itemmanagement.domain.usecase.impl;

import br.com.emerlopes.itemmanagement.domain.entity.ProdutoDomainEntity;
import br.com.emerlopes.itemmanagement.domain.repository.ProdutoDomainRepository;
import br.com.emerlopes.itemmanagement.domain.usecase.AtualizarProdutoPorIdUseCase;
import org.springframework.stereotype.Service;

@Service
public class AtualizarProdutoPorIdUseCaseImpl implements AtualizarProdutoPorIdUseCase {

    private final ProdutoDomainRepository produtoDomainRepository;

    public AtualizarProdutoPorIdUseCaseImpl(
            final ProdutoDomainRepository produtoDomainRepository
    ) {
        this.produtoDomainRepository = produtoDomainRepository;
    }

    @Override
    public ProdutoDomainEntity execute(ProdutoDomainEntity produto) {
        return produtoDomainRepository.atualizarProduto(produto);
    }
}
