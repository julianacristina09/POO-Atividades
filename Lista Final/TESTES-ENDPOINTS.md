# Testes manuais da API

Base URL: `http://localhost:8080`

## 1. Produto

### Criar produto

**POST** `/produtos`

```json
{
  "nome": "Teclado mecânico",
  "preco": 250.00
}
```

### Listar produtos

**GET** `/produtos`

### Buscar produto por id

**GET** `/produtos/1`

### Atualizar produto

**PUT** `/produtos/1`

```json
{
  "nome": "Teclado mecânico RGB",
  "preco": 299.90
}
```

### Deletar produto

**DELETE** `/produtos/1`

## 2. Cliente

### Criar cliente

**POST** `/clientes`

```json
{
  "nome": "Ana Silva",
  "email": "ana@email.com",
  "telefone": "(11) 99999-9999"
}
```

### Listar clientes

**GET** `/clientes`

### Buscar cliente por id

**GET** `/clientes/1`

### Buscar cliente por email

**GET** `/clientes/email/ana@email.com`

### Atualizar cliente

**PUT** `/clientes/1`

```json
{
  "nome": "Ana Souza",
  "email": "ana.souza@email.com",
  "telefone": "(11) 98888-7777"
}
```

### Deletar cliente

**DELETE** `/clientes/1`

## 3. Orçamento

### Criar orçamento

**POST** `/orcamento`

```json
{
  "descricao": "Computador para estudo",
  "cliente": {
    "id": 1
  },
  "produtos": [
    { "id": 1 },
    { "id": 2 }
  ]
}
```
### Listar orçamentos

**GET** `/orcamento`

### Buscar orçamento por id

**GET** `/orcamento/1`

### Atualizar orçamento

**PUT** `/orcamento/1`

```json
{
  "descricao": "Computador para estudo e trabalho",
  "cliente": {
    "id": 1
  },
  "produtos": [
    { "id": 1 }
  ]
}
```

### Aprovar orçamento

**PUT** `/orcamento/1/aprovar`

### Rejeitar orçamento

**PUT** `/orcamento/1/rejeitar`

### Buscar por status

**GET** `/orcamento/status/PENDENTE`

### Deletar orçamento

**DELETE** `/orcamento/1`

## 4. Teste de validação

### Produto com preço inválido

**POST** `/produtos`

```json
{
  "nome": "Produto inválido",
  "preco": 0
}
```

### Cliente sem email

**POST** `/clientes`

```json
{
  "nome": "Cliente sem email",
  "email": "",
  "telefone": ""
}
```