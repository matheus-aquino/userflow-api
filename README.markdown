# UserFlow API

API RESTful para cadastro e listagem de usuários, desenvolvida com Spring Boot e PostgreSQL.

## Pré-requisitos
- Java 17
- Maven
- PostgreSQL (pode ser executado via Docker)
- Docker (opcional, para rodar o banco)

## Configuração do Banco de Dados
1. Instale o PostgreSQL ou rode via Docker:
   ```bash
   docker run -d --name userflow-db -p 5433:5432 -e POSTGRES_DB=userflow -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres postgres
   ```
2. Configure as credenciais no arquivo `src/main/resources/application.properties`.

## Como Rodar a Aplicação
1. Clone o repositório:
   ```bash
   git clone <link-do-repositorio>
   ```
2. Entre no diretório do projeto:
   ```bash
   cd userflow-api
   ```
3. Compile e rode a aplicação com Maven:
   ```bash
   mvn spring-boot:run
   ```
4. A API estará disponível em `http://localhost:8080`.

## Endpoints Disponíveis
- **POST /usuarios**: Cadastra um novo usuário.
  - Exemplo de corpo da requisição:
    ```json
    {
        "nome": "João Silva",
        "email": "joao.silva@email.com",
        "senha": "123456",
        "dataNascimento": "1990-01-01"
    }
    ```

## Testes
- Use ferramentas como Postman ou Insomnia para testar os endpoints.
- Exemplo de teste manual:
  1. Envie uma requisição POST para `http://localhost:8080/usuarios` com o JSON acima.
  2. Verifique se o status retornado é `201 Created` e se o usuário foi salvo.

## Estrutura do Projeto
```
src/main/java/com/inovaboard/userflow/
├── controller/
│   └── UsuarioController.java
├── model/
│   └── Usuario.java
├── repository/
│   └── UsuarioRepository.java
├── service/
│   └── UsuarioService.java
```

## Próximos Passos
- Implementar o endpoint GET `/usuarios`.
- Adicionar mais validações e tratamento de erros.
- Configurar testes unitários.

---

Commit inicial: `feat: cadastro e listagem de usuários`