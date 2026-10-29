
# CRUD de Usuários com Java, JDBC e MySQL

Aplicação Java desenvolvida para demonstrar as quatro operações fundamentais de um CRUD (Create, Read, Update e Delete), utilizando JDBC puro para comunicação com um banco de dados MySQL.

## Tecnologias utilizadas

- Java
- JDBC (Java Database Connectivity)
- MySQL
- MySQL Connector/J
- Maven
- IntelliJ IDEA

## Funcionalidades

- Cadastrar novos usuários
- Consultar todos os usuários cadastrados
- Atualizar o e-mail de um usuário pelo nome
- Excluir um usuário pelo nome
- Exibir os registros no console
- Tratar exceções SQL
- Gerenciar recursos com try-with-resources

## Estrutura do projeto

src/main/java/br/com/crudusuarios/

- Main.java - Executa as operações CRUD
- Conexao.java - Gerencia a conexão com o MySQL
- Usuario.java - Representa a entidade usuário
- UsuarioDAO.java - Implementa as operações SQL

## Banco de dados

Execute o seguinte script no MySQL:

```sql
CREATE DATABASE IF NOT EXISTS crud_usuarios;

USE crud_usuarios;

CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL
);
```

## Configuração

1. Instale o Java, o Maven e o MySQL.
2. Execute o script SQL para criar o banco de dados.
3. Abra o projeto no IntelliJ IDEA.
4. Aguarde o Maven baixar as dependências.
5. Configure a variável de ambiente DB_PASSWORD com a senha do MySQL.
6. Verifique as configurações de conexão em Conexao.java.
7. Execute a classe Main.java.

A aplicação utiliza o usuário root e a porta 3306 por padrão.

## Exemplo de saída

```text
=== CADASTRO ===
Usuario cadastrado!
Usuario cadastrado!

=== LISTAGEM ===
ID: 1 - Nome: Joao Silva - Email: joao@email.com
ID: 2 - Nome: Maria Souza - Email: maria@email.com

=== ATUALIZACAO ===
1 usuario(s) atualizado(s).

=== EXCLUSAO ===
1 usuario(s) excluido(s).

=== LISTAGEM FINAL ===
ID: 1 - Nome: Joao Silva - Email: joao.novo@email.com
```

Os IDs e os registros podem variar conforme os dados existentes no banco.

## Segurança e boas práticas

- PreparedStatement para parametrização de comandos SQL
- Proteção contra SQL Injection nos valores informados
- Tratamento de SQLException
- Fechamento automático de recursos com try-with-resources
- Senha do banco obtida por variável de ambiente

## Objetivo

Projeto desenvolvido como exercício prático de persistência de dados em Java, com foco no funcionamento do JDBC e na manipulação direta de bancos de dados relacionais, sem utilização de ORM.
