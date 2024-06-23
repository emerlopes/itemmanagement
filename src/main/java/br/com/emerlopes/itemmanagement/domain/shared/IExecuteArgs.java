package br.com.emerlopes.itemmanagement.domain.shared;

public interface IExecuteArgs<T, J> {
    T execute(J domainObject);
}
