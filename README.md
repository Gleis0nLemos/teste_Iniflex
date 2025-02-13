# Teste Prático - Iniflex

Projeto com objetivo de realizar diversas operações de gerenciamento de funcionários, incluindo adição, remoção, aumento salarial, agrupamento por função, ordenação e cálculo de salários mínimos equivalentes.

## 📌 Funcionalidades

- Cadastro de funcionários com nome, data de nascimento, salário e função.
- Remoção de funcionários.
- Impressão de lista de funcionários formatada.
- Aumento salarial percentual.
- Agrupamento de funcionários por função.
- Filtragem por aniversariantes de outubro e dezembro.
- Identificação do funcionário mais velho.
- Ordenação de funcionários por nome.
- Cálculo do total de salários pagos.
- Cálculo de quantos salários mínimos cada funcionário recebe.

## 🛠️ Tecnologias Utilizadas

- **Java 23**
- **BigDecimal** para cálculo preciso de valores monetários
- **Streams API** para manipulação de listas
- **Map e Collectors** para agrupar dados

## 🚀 Como Executar

1. Clone o repositório:

   ```sh
   git clone https://github.com/Gleis0nLemos/teste_Iniflex.git
   ```

2. Acesse o diretório do projeto:

   ```sh
   cd teste_Iniflex
   ```

3. Compile os arquivos Java:

   ```sh
   javac *.java
   ```

4. Execute a classe principal:

   ```sh
   java Principal
   ```

## 📁 Estrutura do Projeto

```
/
├── Pessoa.java        # Classe base para representar uma pessoa
├── Funcionario.java   # Classe que representa um funcionário
├── Principal.java     # Classe principal que executa a lógica do programa
├── README.md          # Documentação do projeto
```

## 📌 Exemplo de Saída

```
Maria - 18/10/2000 - 2.210,38 - Operador
Caio - 02/05/1961 - 10.819,75 - Coordenador
...
Total dos salários: 56.712,43
Maria ganha 1,82 salários mínimos.
...
```

## 📜 Licença

Este projeto está sob a licença MIT.

---

Desenvolvido com ❤️ por [Gleison](https://github.com/Gleis0nLemos).

