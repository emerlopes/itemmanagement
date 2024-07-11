package br.com.emerlopes.itemmanagement.infrastructure.database.service;


import br.com.emerlopes.itemmanagement.domain.entity.ProdutoDomainEntity;
import br.com.emerlopes.itemmanagement.domain.exceptions.BusinessException;
import br.com.emerlopes.itemmanagement.domain.repository.ProdutoDomainRepository;
import br.com.emerlopes.itemmanagement.infrastructure.database.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoDomainService implements ProdutoDomainRepository {
    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<ProdutoDomainEntity> buscarProdutos() {
        final var produtoEntities = produtoRepository.findAll();

        return ProdutoDomainEntity.paraEntidadeDominio(produtoEntities);
    }

    @Override
    public ProdutoDomainEntity buscarProdutoPorId(ProdutoDomainEntity produto) {
        final var irProduto = produto.getId();
        final var produtoEntity = produtoRepository.findById(irProduto);

        if (produtoEntity.isEmpty()) {
            throw new BusinessException("Produto não encontrado", "");
        }
        return ProdutoDomainEntity.paraEntidadeDominio(produtoEntity.get());

    }

    @Override
    public ProdutoDomainEntity atualizarProduto(
            final ProdutoDomainEntity produto
    ) {
        final var irProduto = produto.getId();
        final var produtoEntity = produtoRepository.findById(irProduto);

        if (produtoEntity.isEmpty()) {
            throw new BusinessException("Produto não encontrado", "");
        }

        produtoEntity.get().setName(produto.getName() != null ? produto.getName() : produtoEntity.get().getName());
        produtoEntity.get().setDescription(produto.getDescription() != null ? produto.getDescription() : produtoEntity.get().getDescription());
        produtoEntity.get().setQuantity(produto.getQuantity() != null ? produto.getQuantity() : produtoEntity.get().getQuantity());
        produtoEntity.get().setPrice(produto.getPrice() != null ? produto.getPrice() : produtoEntity.get().getPrice());
        produtoEntity.get().setQuantity(produto.getQuantity() != null ? produto.getQuantity() : produtoEntity.get().getQuantity());

        final var produtoEntityAtualizado = produtoRepository.save(produtoEntity.get());

        return ProdutoDomainEntity.paraEntidadeDominio(produtoEntityAtualizado);
    }
}