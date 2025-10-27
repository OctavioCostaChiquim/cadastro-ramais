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

## 📸 Exemplos Visuais

> **Nota:** Esta seção está reservada para capturas de tela e GIFs demonstrativos da aplicação.
> 
> **Sugestões de conteúdo visual:**
> - Screenshot da interface Swagger UI mostrando os endpoints disponíveis
> - GIF demonstrando o fluxo de criação de um novo ramal
> - Imagem da resposta JSON de exemplo dos endpoints
> - Screenshot do banco H2 Console (se aplicável)

*Em breve serão adicionados exemplos visuais para facilitar o entendimento do projeto.*

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

## 🎯 Metas de Aprendizado Futuras

Objetivos para evolução contínua do projeto e aprimoramento das habilidades em desenvolvimento:

- 📝 **Testes Automatizados**
  - Implementar testes unitários com JUnit
  - Criar testes de integração
  - Adicionar cobertura de testes com JaCoCo

- 🔐 **Segurança de APIs**
  - Implementar autenticação JWT
  - Adicionar Spring Security
  - Aplicar boas práticas de segurança (HTTPS, CORS)

- 🚀 **CI/CD Básico**
  - Configurar GitHub Actions para build automático
  - Implementar pipeline de testes automatizados
  - Criar deploy automatizado (Heroku, Railway ou similar)

- 🗄️ **Melhorias de Banco de Dados**
  - Migrar para PostgreSQL em produção
  - Implementar migrations com Flyway ou Liquibase
  - Otimizar queries e índices

- 📊 **Observabilidade**
  - Adicionar logs estruturados
  - Implementar métricas com Spring Actuator
  - Configurar monitoramento básico

## 🤝 Contribuições

Sugestões e feedbacks são bem-vindos! Este é um projeto de aprendizado e qualquer orientação é muito apreciada.

## 👨‍💻 Sobre o Desenvolvedor

Sou um desenvolvedor em constante aprendizado, buscando ativamente interagir em projetos open source e participar de comunidades de tecnologia. Acredito na colaboração e no compartilhamento de conhecimento como pilares fundamentais para o crescimento profissional.

Estou sempre aberto a novas oportunidades de aprendizado, mentoria e contribuição em projetos que possam agregar valor e expandir minhas habilidades técnicas.

## 📝 Direitos Autorais e Uso

**Copyright © 2025 Octavio Costa Chiquim. All Rights Reserved.**

Este projeto é de uso exclusivo, não pode ser distribuído, modificado ou utilizado por terceiros sem meu consentimento explícito.

Todos os direitos autorais são reservados. Nenhuma parte deste projeto pode ser reproduzida, distribuída ou transmitida de qualquer forma ou por qualquer meio sem a permissão prévia por escrito do autor.

---

**Desenvolvido com 💙 por Octavio Costa Chiquim**
