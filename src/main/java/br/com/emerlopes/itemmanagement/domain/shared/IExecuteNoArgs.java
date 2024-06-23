package br.com.emerlopes.itemmanagement.domain.shared;

import java.util.List;

public interface IExecuteNoArgs<T> {
    List<T> execute();
}
