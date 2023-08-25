# DIO - Trilha Java Básico

Website: [www.dio.me](https://www.dio.me)

## Autores

- Gleyson Sampaio

## Controle de Fluxo - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário:

### Requisitos

O sistema deverá:

1. Receber dois parâmetros via terminal que representarão dois números inteiros.
2. Com estes dois números, você deverá obter a quantidade de interações (`for`) e realizar a impressão no console (`System.out.print`) dos números incrementados.

#### Exemplo

Se você passar os números 12 e 30, logo teremos uma interação (`for`) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

### Exceções

- Se o primeiro parâmetro for **MAIOR** que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro".

### Estrutura do Projeto

- Crie o projeto `DesafioControleFluxo`.
- Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
- Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema.
