# Relatório do Projeto: Sistema Bancário com Herança, Polimorfismo e Interfaces
- Heloísa Real - 554535 - 2ESR - Java

## 1. Introdução
O presente relatório tem como objetivo descrever o desenvolvimento de um sistema bancário utilizando Java, com a aplicação dos conceitos de **herança**, **polimorfismo** e **interfaces**. O sistema permite a criação de diferentes tipos de contas bancárias e a realização de operações como depósitos, saques, rendimentos e impostos. A implementação desses conceitos visa demonstrar como aplicar os pilares da Programação Orientada a Objetos (POO) para garantir um sistema organizado, reutilizável e de fácil manutenção.

## 2. Objetivo do Projeto
O objetivo deste projeto foi criar um sistema bancário capaz de manipular diferentes tipos de contas, com operações específicas para cada tipo de conta. As funcionalidades do sistema incluem:
- Criar contas bancárias com número e saldo inicial.
- Realizar operações de depósito e saque.
- Aplicar impostos sobre o saldo das contas correntes.
- Calcular e aplicar rendimentos sobre o saldo das contas poupança.
- Demonstrar o uso de **polimorfismo** ao manipular objetos de tipos diferentes, mas com referência genérica.
- Aplicar **interfaces** para definir comportamentos específicos para cada tipo de conta.

## 3. Implementação
O sistema foi desenvolvido em **Java** e dividido em várias classes, cada uma com um papel específico no sistema bancário.

### 3.1. Classe `Conta`
A classe `Conta` é a classe base que contém os atributos e métodos comuns a todas as contas bancárias. Ela tem dois atributos principais: o **número da conta** e o **saldo**. Esta classe fornece métodos para realizar operações básicas, como **depósitos** e **saques**, e um método para consultar o saldo da conta. A classe `Conta` serve de base para outras classes de tipos específicos de conta, como contas correntes e poupanças.

### 3.2. Classe `ContaCorrente`
A classe `ContaCorrente` herda da classe `Conta` e implementa a interface `Imposto`. O principal objetivo dessa classe é representar as contas correntes, que possuem a necessidade de calcular impostos sobre o saldo. A classe implementa o método `calcularImposto()`, que calcula o imposto a ser pago com base no saldo da conta corrente.

### 3.3. Classe `ContaPoupanca`
A classe `ContaPoupanca` também herda da classe `Conta`, mas implementa a interface `Rentavel`. O foco dessa classe é representar contas poupança, que geram rendimentos sobre o saldo. A classe `ContaPoupanca` implementa o método `calcularRendimento()`, que calcula o rendimento mensal da conta, baseado em uma porcentagem do saldo.

### 3.4. Interfaces `Imposto` e `Rentavel`
As interfaces foram criadas para definir comportamentos específicos de determinados tipos de contas. A interface `Imposto` declara o método `calcularImposto()`, que é implementado pela classe `ContaCorrente`. Já a interface `Rentavel` define o método `calcularRendimento()`, que é implementado pela classe `ContaPoupanca`. O uso dessas interfaces garante que cada tipo de conta tenha suas características e comportamentos específicos.

### 3.5. Classe `Banco`
A classe `Banco` é responsável por gerenciar uma lista de contas e executar operações como a aplicação de impostos e rendimentos. A classe permite aplicar essas operações de maneira **polimórfica**, ou seja, de forma genérica, sem precisar conhecer especificamente o tipo de conta que está sendo manipulada. A classe pode tratar tanto contas correntes quanto contas poupança de forma unificada, mas chamando os métodos específicos de cada tipo de conta, graças ao uso de interfaces.

### 3.6. Classe `Main`
A classe `Main` é responsável por instanciar as diferentes contas e realizar os testes do sistema. Ela cria contas bancárias, realiza depósitos e saques, e também aplica os impostos e rendimentos, exibindo o saldo final de cada conta. Essa classe serve como ponto de entrada para o programa, demonstrando o comportamento do sistema na prática.

## 4. Polimorfismo Aplicado
O **polimorfismo** foi utilizado para manipular objetos de diferentes tipos de contas (como `ContaCorrente` e `ContaPoupanca`) de forma genérica. Ao usar uma referência do tipo `Conta`, foi possível chamar métodos específicos de cada tipo de conta, como o cálculo de imposto ou rendimento, sem precisar fazer verificações complexas sobre o tipo de cada conta. Esse comportamento foi possível graças à herança e à implementação das interfaces, que garantem que os métodos certos sejam chamados para cada tipo de conta.

## 5. Conclusão
O projeto demonstrou a aplicação dos conceitos de **herança**, **polimorfismo** e **interfaces** em um sistema bancário desenvolvido em Java. A **herança** permitiu a reutilização de código entre as classes de conta, enquanto o **polimorfismo** garantiu que o sistema fosse flexível e capaz de tratar diferentes tipos de contas de maneira uniforme. As **interfaces** ajudaram a definir comportamentos específicos para as contas correntes e poupanças, mantendo o código modular e de fácil manutenção.

Esse exercício reforçou a importância da Programação Orientada a Objetos (POO) para a construção de sistemas mais estruturados, reutilizáveis e de fácil manutenção. O uso de herança, polimorfismo e interfaces garantiu que o sistema fosse extensível e pudesse facilmente ser adaptado para incluir novos tipos de contas ou comportamentos.
