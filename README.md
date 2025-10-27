# Cadastro de Ramais

## 📋 Descrição do Projeto

Sistema de cadastro e gerenciamento de ramais telefônicos desenvolvido como projeto de aprendizado em Java e Spring Boot. O projeto implementa um CRUD completo com validações, documentação de API e arquitetura em camadas.

## 🚀 Tecnologias Utilizadas

- **Java 25** - Linguagem de programação
- **Spring Boot** - Framework para desenvolvimento de aplicações Java
- **Spring Data JPA** - Persistência de dados
- **Spring Validation** - Validação de dados
- **Swagger/OpenAPI** - Documentação da API
- **H2 Database** - Banco de dados em memória (desenvolvimento)
- **Maven** - Gerenciamento de dependências

## ✨ Principais Funcionalidades

- **CRUD Completo de Ramais**
  - Criar novos ramais
  - Listar todos os ramais cadastrados
  - Buscar ramal específico por ID
  - Atualizar informações de ramais
  - Excluir ramais

- **Validação de Dados**
  - Validação de campos obrigatórios
  - Validação de formato de dados
  - Tratamento de erros personalizado

- **Documentação Swagger**
  - Interface interativa para testar a API
  - Documentação automática dos endpoints
  - Modelos de requisição e resposta

- **Arquitetura em Camadas**
  - Controller - Camada de apresentação
  - Service - Camada de negócios
  - Repository - Camada de acesso a dados
  - Model/Entity - Camada de domínio

## 🔧 Instalação e Execução

### Pré-requisitos

- Java 25 ou superior instalado
- Maven instalado
- Git instalado

### Passos para executar

1. Clone o repositório:
```bash
git clone https://github.com/OctavioCostaChiquim/cadastro-ramais.git
```

2. Entre no diretório do projeto:
```bash
cd cadastro-ramais
```

3. Execute o projeto com Maven:
```bash
mvn spring-boot:run
```

4. Acesse a aplicação:
- API: http://localhost:8080
- Swagger UI: http://localhost:8080/swagger-ui.html

## 📚 Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|----------|
| GET | /ramais | Lista todos os ramais |
| GET | /ramais/{id} | Busca ramal por ID |
| POST | /ramais | Cria novo ramal |
| PUT | /ramais/{id} | Atualiza ramal existente |
| DELETE | /ramais/{id} | Remove ramal |

## 📖 Status de Aprendizado

⚠️ **Projeto em Desenvolvimento - Nível Iniciante**

Este é um projeto de estudo desenvolvido por um programador iniciante em Java e Spring Boot. O código pode conter implementações básicas e está em constante evolução conforme novos conceitos são aprendidos.

### Objetivos de Aprendizado:
- ✅ Entender os conceitos de Spring Boot
- ✅ Implementar padrão MVC e arquitetura em camadas
- ✅ Trabalhar com JPA e persistência de dados
- ✅ Aplicar validações e tratamento de erros
- ✅ Documentar APIs com Swagger
- 🔄 Implementar testes unitários (em andamento)
- 🔄 Adicionar autenticação e autorização (planejado)

## 🤝 Contribuições

Sugestões e feedbacks são bem-vindos! Este é um projeto de aprendizado e qualquer orientação é muito apreciada.

## 📝 Licença

Este projeto está sob licença MIT.

---

**Desenvolvido com 💙 por Octavio Costa Chiquim**
