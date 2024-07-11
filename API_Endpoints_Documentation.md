# Documentação da API - Produtos

## Endpoints

| Método HTTP | URL                          | Descrição                                 | Parâmetros de Entrada                  | 
|-------------|------------------------------|-------------------------------------------|----------------------------------------|
| POST        | /produtos/cadastrar-produtos | Realiza o cadastro dos produtos via batch | Nenhum                                 |
| POST        | /produtos/atualizar/{id}     | Realiza a atualizaçaão do produto         | ID do produto e um objeto com os dados |
| GET         | /produtos/{id}               | Retorna o produto por ID                  | ID do produto                          |
| GET         | /produtos/listar-produtos    | Retorna todos os produtos cadastrados     | Nenhum                                 |

## Exemplos de Estruturas de Parâmetros

### /produtos/atualizar/1 (POST)

```json
{
  "name": "Laptop",
  "description": "A high-end gaming laptop",
  "price": 1500.00,
  "quantity": 10
}
```

### /produtos/atualizar/1 (POST)

```json
{
  "name": "Laptop",
  "description": "A high-end gaming laptop",
  "price": 1500.00,
  "quantity": 10
}
```

### /produtos/1 (GET)
