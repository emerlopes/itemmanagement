package br.com.emerlopes.itemmanagement.infrastructure.batch;


import br.com.emerlopes.itemmanagement.infrastructure.database.entity.ProdutoEntity;
import br.com.emerlopes.itemmanagement.infrastructure.database.repository.ProdutoRepository;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdutoItemWriter implements ItemWriter<ProdutoEntity> {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void write(Chunk<? extends ProdutoEntity> chunk) {
        produtoRepository.saveAll(chunk.getItems());
    }
}
