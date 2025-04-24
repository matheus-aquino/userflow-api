# Testes Manuais - UserFlow API (Postman)

Este documento descreve os testes manuais realizados para o endpoint POST `/usuarios` da API UserFlow, utilizando o Postman.

## Pré-requisitos
- API rodando localmente em `http://localhost:8080`.
- Postman instalado.
- Banco de dados PostgreSQL configurado (conforme README).

## Teste 1: Cadastro de Usuário com Sucesso
**Descrição**: Cadastrar um usuário com todos os campos válidos.  
**Método**: POST  
**URL**: `http://localhost:8080/usuarios`  
**Headers**: 
```
Content-Type: application/json
```
**Body (JSON)**:
```json
{
    "nome": "João Silva",
    "email": "joao.silva@email.com",
    "senha": "123456",
    "dataNascimento": "1990-01-01"
}
```
**Resultado Esperado**:  
- **Status**: 201 Created  
- **Response Body**: 
```json
{
    "id": 1,
    "nome": "João Silva",
    "email": "joao.silva@email.com",
    "senha": "123456",
    "dataNascimento": "1990-01-01"
}
```
**Resultado Obtido**: Status 201, usuário retornado com ID gerado.

## Teste 2: Cadastro com Email Inválido
**Descrição**: Tentar cadastrar um usuário com email inválido.  
**Método**: POST  
**URL**: `http://localhost:8080/usuarios`  
**Headers**: 
```
Content-Type: application/json
```
**Body (JSON)**:
```json
{
    "nome": "Maria Souza",
    "email": "maria.souza",
    "senha": "123456",
    "dataNascimento": "1995-05-10"
}
```
**Resultado Esperado**:  
- **Status**: 400 Bad Request  
- **Response Body**: Mensagem de erro indicando que o email é inválido (ex.: "Email deve ser válido").  
**Resultado Obtido**: Status 400, mensagem de erro retornada.

## Teste 3: Cadastro com Senha Curta
**Descrição**: Tentar cadastrar um usuário com senha menor que 6 caracteres.  
**Método**: POST  
**URL**: `http://localhost:8080/usuarios`  
**Headers**: 
```
Content-Type: application/json
```
**Body (JSON)**:
```json
{
    "nome": "Carlos Lima",
    "email": "carlos.lima@email.com",
    "senha": "123",
    "dataNascimento": "1988-12-12"
}
```
**Resultado Esperado**:  
- **Status**: 400 Bad Request  
- **Response Body**: Mensagem de erro indicando que a senha deve ter no mínimo 6 caracteres.  
**Resultado Obtido**: Status 400, mensagem de erro retornada.

## Teste 4: Cadastro com Data de Nascimento Futura
**Descrição**: Tentar cadastrar um usuário com data de nascimento futura.  
**Método**: POST  
**URL**: `http://localhost:8080/usuarios`  
**Headers**: 
```
Content-Type: application/json
```
**Body (JSON)**:
```json
{
    "nome": "Ana Pereira",
    "email": "ana.pereira@email.com",
    "senha": "123456",
    "dataNascimento": "2026-01-01"
}
```
**Resultado Esperado**:  
- **Status**: 400 Bad Request  
- **Response Body**: Mensagem de erro indicando que a data de nascimento não pode ser futura.  
**Resultado Obtido**: Status 400, mensagem de erro retornada.

## Observações
- Os testes foram realizados com o Postman, enviando requisições diretamente à API local.
- As mensagens de erro foram validadas para garantir que são claras e úteis, conforme os critérios de aceite.
- Capturas de tela dos testes podem ser incluídas no repositório, na pasta `/screenshots`.