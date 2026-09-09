# 🚗 Oficina Box 42 - Sistema de Gerenciamento de Ordens de Serviço

Sistema de console desenvolvido em Java com foco na aplicação prática de **Programação Orientada a Objetos (POO)** e manipulação de **estruturas de dados nativas (Arrays fixos)**.

---

## 🛠️ Funcionalidades

- **Cadastro de Ordens de Serviço**: Registro de cliente, veículo (placa, modelo e ano) e inclusão de múltiplos serviços por ordem.
- **Listagem de Ordens**: Exibição detalhada de todas as ordens cadastradas e seus valores totais.
- **Busca por Nome do Cliente**: Pesquisa baseada nos primeiros caracteres do nome (case-insensitive) usando `startsWith()`.
- **Busca por Placa**: Localização de ordens por correspondência exata da placa do veículo usando `equalsIgnoreCase()`.
- **Menu Interativo**: Navegação contínua no terminal via console.

---

## 🎯 Restrições Técnicas & Aprendizados

Este projeto foi construído sob restrições técnicas específicas para consolidar conceitos fundamentais:
- **Sem uso de `ArrayList` ou Coleções**: Todo o gerenciamento de memória e tamanho de listas é feito com **arrays nativos (`[]`)** e controle manual de capacidade.
- **Composição de Objetos**: Associação direta entre as entidades `OrdemServico`, `Veiculo` e `Servico`.
- **Manipulação de Strings**: Tratamento de buscas textuais sem sensibilidade a maiúsculas e minúsculas.

---

## 📐 Estrutura das Classes

- `Veiculo`: Armazena placa, modelo e ano.
- `Servico`: Define a descrição e o valor do serviço.
- `OrdemServico`: Agrupa cliente, veículo e um array de serviços associados.
- `GerenciarOrdens`: Controla a coleção fixa de ordens e implementa os algoritmos de busca.
- `Main`: Interface de usuário via console utilizando laços e estruturas de decisão.

---

## 🚀 Como Executar

1. Certifique-se de ter o **JDK 11** (ou superior) instalado.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/oficina-box42-java.git](https://github.com/SEU_USUARIO/oficina-box42-java.git)
   ```
3. Abra o projeto em sua IDE (IntelliJ IDEA, Eclipse ou VS Code).
4. Execute a classe `Main.java`.