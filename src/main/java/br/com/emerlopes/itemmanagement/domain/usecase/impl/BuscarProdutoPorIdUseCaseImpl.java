package br.com.emerlopes.itemmanagement.domain.usecase.impl;

import br.com.emerlopes.itemmanagement.domain.entity.ProdutoDomainEntity;
import br.com.emerlopes.itemmanagement.domain.repository.ProdutoDomainRepository;
import br.com.emerlopes.itemmanagement.domain.usecase.BuscarProdutoPorIdUseCase;
import org.springframework.stereotype.Service;

@Service
public class BuscarProdutoPorIdUseCaseImpl implements BuscarProdutoPorIdUseCase {

    private final ProdutoDomainRepository produtoDomainRepository;

    public BuscarProdutoPorIdUseCaseImpl(
            final ProdutoDomainRepository produtoDomainRepository
    ) {
        this.produtoDomainRepository = produtoDomainRepository;
    }

    @Override
    public ProdutoDomainEntity execute(ProdutoDomainEntity domainObject) {
        return produtoDomainRepository.buscarProdutoPorId(domainObject);
    }
}
