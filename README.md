# **Sistema de Orçamento para Paisagismo**

Este é um sistema simples desenvolvido em Java para gerenciar orçamentos de uma empresa de paisagismo. O sistema permite cadastrar clientes, adicionar produtos comprados, calcular o orçamento total e exibir os dados de forma organizada.

---

## **Funcionalidades**

- **Cadastro de Clientes**:
  - Registra informações como nome, endereço e telefone do cliente.
  
- **Cadastro de Produtos**:
  - Permite adicionar produtos com nome e preço.
  - Suporta múltiplos produtos por cliente.

- **Cálculo de Orçamento**:
  - Calcula o subtotal de cada produto com base na quantidade comprada.
  - Calcula o total do orçamento somando os subtotais.

- **Exibição de Dados**:
  - Exibe os dados do cliente.
  - Lista os produtos comprados, com preço unitário, quantidade e subtotal.
  - Mostra o valor total do orçamento.

---

## **Tecnologias Utilizadas**

- **Java**: Linguagem principal do projeto.
- **Eclipse IDE / VSCode**: Ambiente de desenvolvimento.
- **Git**: Controle de versão.
- **GitHub**: Repositório remoto.

---

## **Estrutura do Projeto**

```
projetoPaisagismo/
├── src/
│   ├── application/
│   │   └── Program.java          # Ponto de entrada do programa
│   ├── entities/
│   │   ├── Cliente.java          # Representa os dados do cliente
│   │   └── Product.java          # Representa os dados do produto
│   ├── services/
│   │   └── OrcamentoService.java # Lógica de cálculo do orçamento
│   └── utils/
│       └── InputValidator.java   # Validação de entradas do usuário
├── .gitignore                    # Arquivos e diretórios ignorados pelo Git
└── README.md                     # Documentação do projeto
```

---

## **Como Executar o Projeto**

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/SEU_USUARIO/projetoPaisagismo.git
   cd projetoPaisagismo
   ```

2. **Compile o Código**:
   Navegue até o diretório `src` e compile os arquivos:
   ```bash
   javac application/Program.java
   ```

3. **Execute o Programa**:
   ```bash
   java application.Program
   ```

---

## **Exemplo de Execução**

```plaintext
**** PAISAGISMO ALTOS DO TATUAPÉ ****

*** CADASTRO DE CLIENTES ***

Nome: João Silva
Endereço: Rua das Flores, 123
Telefone: (11) 98765-4321

*** CADASTRO DE PRODUTO ***
Nome do Produto: Grama Esmeralda
Digite o preço do produto (apenas números positivos): 25.50
Quantidade: 10

Deseja adicionar outro produto? (s/n): s

*** CADASTRO DE PRODUTO ***
Nome do Produto: Pedra Decorativa
Digite o preço do produto (apenas números positivos): 15.00
Quantidade: 5

Deseja adicionar outro produto? (s/n): n

*** DADOS DO CLIENTE ***
Nome: João Silva
Endereço: Rua das Flores, 123
Telefone: (11) 98765-4321

*** PRODUTOS COMPRADOS ***
Produto: Grama Esmeralda | Preço Unitário: R$ 25.50 | Quantidade: 10 | Subtotal: R$ 255.00
Produto: Pedra Decorativa | Preço Unitário: R$ 15.00 | Quantidade: 5 | Subtotal: R$ 75.00

*** TOTAL DO ORÇAMENTO: R$ 330.00 ***
```

---

## **Contribuição**

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

---

