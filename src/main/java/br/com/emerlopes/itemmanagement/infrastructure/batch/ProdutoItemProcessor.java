package br.com.emerlopes.itemmanagement.infrastructure.batch;

import br.com.emerlopes.itemmanagement.infrastructure.database.entity.ProdutoEntity;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProdutoItemProcessor implements ItemProcessor<ProdutoEntity, ProdutoEntity> {

    @Override
    public ProdutoEntity process(ProdutoEntity produtoEntity) throws Exception {
        return produtoEntity;
    }
}