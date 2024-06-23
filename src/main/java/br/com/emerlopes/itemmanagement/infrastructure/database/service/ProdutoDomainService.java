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
    public ProdutoDomainEntity atualizarProduto(ProdutoDomainEntity produto) {
        final var irProduto = produto.getId();
        final var produtoEntity = produtoRepository.findById(irProduto);

        if (produtoEntity.isEmpty()) {
            throw new BusinessException("Produto não encontrado", "");
        }

        final var quantidadeEstoque = produtoEntity.get().getQuantity();
        final var quantidadeVendida = produto.getQuantity();
        final var quantidadeAtualizada = quantidadeEstoque - quantidadeVendida;

        produtoEntity.get().setQuantity(quantidadeAtualizada);

        final var produtoEntityAtualizado = produtoRepository.save(produtoEntity.get());

        return ProdutoDomainEntity.paraEntidadeDominio(produtoEntityAtualizado);
    }
}