package br.com.emerlopes.itemmanagement.domain.usecase;


import br.com.emerlopes.itemmanagement.domain.entity.ProdutoDomainEntity;
import br.com.emerlopes.itemmanagement.domain.shared.IExecuteArgs;

public interface BuscarProdutoPorIdUseCase extends IExecuteArgs<ProdutoDomainEntity, ProdutoDomainEntity> {
}
