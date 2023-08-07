# Projeto ContaBanco - Desafio da plataforma [DIO](https://www.dio.me)

## Texto original da plataforma:

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
Revise sobre regras de declaração de variáveis.

| Atributo      | Tipo      | Exemplo       |
|---------------|-----------|---------------|
| Numero        | Inteiro   | 1021          |
| Agencia       | Texto     | 067-8         |
| Nome Cliente  | Texto     | MARIO ANDRADE |
| Saldo         | Decimal   | 237.48        |

Revise sobre terminal, main args e a classe Scanner.
Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
Programa: "Por favor, digite o número da Agência !"
Usuário: 1021 (depois ENTER para o próximo campo).
Revise sobre concatenação e classe String com método concat.
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.


# ------------------------------------------------------------------------------------

## Uma explanação rápida sobre o código:
Este código simula uma simples aplicação de conta bancária, onde os usuários podem inserir seus detalhes de conta via terminal. O projeto foi construído em Java e utiliza conceitos básicos, como entrada e saída de dados, concatenação de strings e manipulação de tipos de dados primitivos.

### O que pode ser melhorado:
- A estrutura de código pode ser dividida em várias classes e métodos para melhor organização e reutilização.
- Pode ser adicionado tratamento de erros para lidar com entradas inválidas.
- Funcionalidades adicionais, como operações de depósito e saque, podem ser incorporadas para tornar o sistema mais robusto.
