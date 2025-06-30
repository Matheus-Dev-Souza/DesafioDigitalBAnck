# Banco Digital - Projeto Java Modularizado e Robusto

## 📋 Visão Geral

Este projeto implementa um sistema bancário digital completo com:
- Gestão de clientes e contas bancárias
- Operações financeiras (depósito, saque, transferência)
- Geração de extratos
- Sistema de transações e histórico

## 🚀 Tecnologias Utilizadas

- **Java 17+** - Linguagem principal
- **Lombok** - Redução de boilerplate code
- **Maven** - Gerenciamento de dependências
- **JUnit 5** - Testes unitários
- **Log4j2** - Logging estruturado

## 🏗️ Estrutura do Projeto

```
banco-digital/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── model/          # Classes de domínio
│   │   │   ├── repository/     # Camada de persistência
│   │   │   ├── service/        # Lógica de negócio
│   │   │   ├── util/           # Utilitários
│   │   │   └── Main.java        # Classe principal
│   │   └── resources/          # Configurações
│   └── test/                   # Testes
├── target/
├── pom.xml
└── README.md
```

## 💡 Principais Funcionalidades

### 🧑 Clientes
- Cadastro completo com dados pessoais
- Vinculação a múltiplas contas
- Validação de CPF

### 💰 Contas Bancárias
- Tipos de conta:
  - Corrente (com cheque especial)
  - Poupança (com rendimento)
  - Investimento
- Operações:
  - Depósito
  - Saque
  - Transferência
  - Consulta de saldo
  - Extrato

### 📊 Transações
- Histórico completo de operações
- Filtros por período/tipo
- Exportação para CSV

## 🛠️ Como Executar

### Pré-requisitos
- JDK 17+
- Maven 3.8+

### Instalação
```bash
git clone https://github.com/seu-usuario/banco-digital.git
cd banco-digital
mvn install
```

### Execução
```bash
mvn compile exec:java -Dexec.mainClass="com.banco.App"
```

## 🧪 Testes
Execute todos os testes:
```bash
mvn test
```

## 📝 Licença
Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para detalhes.

## ✍️ Autores
- [Matheus Souza](https://github.com/matheus-dev-souza)

## 🔗 Links Úteis
- [Documentação Java](https://docs.oracle.com/en/java/)
- [Site do Lombok](https://projectlombok.org/)
- [Documentação Maven](https://maven.apache.org/guides/)

## 🌟 Melhorias Futuras
- [ ] Implementar API REST
- [ ] Adicionar autenticação
- [ ] Criar interface gráfica
- [ ] Integração com bancos de dados



