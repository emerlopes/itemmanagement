package br.com.emerlopes.itemmanagement.domain.usecase.impl;

import br.com.emerlopes.itemmanagement.domain.entity.ProdutoDomainEntity;
import br.com.emerlopes.itemmanagement.domain.repository.ProdutoDomainRepository;
import br.com.emerlopes.itemmanagement.domain.usecase.BuscarProdutosUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarProdutosUseCaseImpl implements BuscarProdutosUseCase {

    private final ProdutoDomainRepository produtoDomainRepository;

    public BuscarProdutosUseCaseImpl(ProdutoDomainRepository produtoDomainRepository) {
        this.produtoDomainRepository = produtoDomainRepository;
    }

    @Override
    public List<ProdutoDomainEntity> execute() {
        return produtoDomainRepository.buscarProdutos();
    }
}
