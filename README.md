# Simulador de Contas Bancárias

**Objetivo:**

Este projeto tem como objetivo criar uma aplicação Java simples para simular operações bancárias básicas. Ele ajuda a entender conceitos de programação orientada a objetos, modelando contas bancárias e implementando funcionalidades para depósitos, saques e transferências. O exercício inclui a aplicação de regras específicas para cada operação, proporcionando experiência prática na implementação de lógica de negócios dentro de uma aplicação de software.

## Visão Geral

A aplicação consiste em duas classes principais:

1. **Classe Conta:**
   - **Atributos:**
     - `saldo` (double): Representa o saldo da conta.
     - `tipo` (String): Indica o tipo da conta ("Corrente" ou "Poupança").
   - **Métodos:**
     - `depositar(double valor)`: Adiciona um valor ao saldo da conta. Depósitos em contas "Corrente" estão limitados a R$ 1.000,00 por operação. Retorna `true` se for bem-sucedido, caso contrário, retorna `false`.
     - `sacar(double valor)`: Retira um valor do saldo da conta. Saques não podem exceder o saldo atual. Retorna `true` se for bem-sucedido, caso contrário, retorna `false`.
     - `transferir(double valor, Conta contaDestino)`: Transfere um valor da conta atual para a conta destino. Apenas contas "Corrente" podem realizar transferências. As transferências não devem resultar em saldo negativo. Retorna `true` se for bem-sucedido, caso contrário, retorna `false`.
     - `getSaldo()`: Retorna o saldo atual da conta.
     - `getTipo()`: Retorna o tipo da conta.

2. **Classe TesteConta:**
   - **Operações:**
     - Crie uma conta "Corrente" e uma conta "Poupança" com saldos iniciais.
     - Teste várias operações, incluindo depósitos, saques e transferências.
     - Exiba mensagens indicando o sucesso ou falha de cada operação, junto com os saldos atualizados das contas.

## Como Usar

1. **Configuração:**
   - Crie um novo projeto Java usando sua IDE ou ferramentas preferidas.

2. **Compilar e Executar:**
   - Compile os arquivos Java: `Conta.java` e `TesteConta.java`.
   - Execute a classe `TesteConta` para rodar os testes e observar os resultados no console.

3. **Saída Esperada:**
   - O console exibirá mensagens mostrando o resultado de cada operação (sucesso ou falha) e os saldos atualizados de cada conta.

## Por Que Isso É Útil

Este projeto fornece experiência prática em:
- Modelagem de entidades e comportamentos do mundo real em software.
- Implementação e aplicação de regras e restrições de negócios.
- Aplicação de conceitos de programação orientada a objetos para resolver problemas práticos.

Ao trabalhar neste projeto, você obterá insights valiosos sobre como projetar e gerenciar transações financeiras dentro de uma aplicação de software, o que é crucial para o desenvolvimento de sistemas robustos e confiáveis.

## Créditos

Desenvolvido por Mateus S.  
GitHub: [Matz-Turing](https://github.com/Matz-Turing)
