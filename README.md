# Spring Boot List

Projeto desenvolvido durante as aulas, a partir de um código disponibilizado pelo professor, com o objetivo de estudar e praticar o desenvolvimento de aplicações web utilizando Java e Spring Boot.

## Identificação

- **Aluno:** Arthur Silva de Freitas
- **RA:** 1630482511026

## Sobre o projeto

A aplicação permite realizar operações de cadastro, consulta, edição e exclusão de produtos (CRUD), utilizando Spring Boot, e Thymeleaf.

O código inicial e as orientações para o desenvolvimento foram fornecidos pelo professor. A partir dessa estrutura, foram realizadas implementações e melhorias adicionais para aprofundar os conhecimentos adquiridos durante as aulas.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Security
- Thymeleaf
- MySQL
- Postman
- Bootstrap

## Funcionalidades e melhorias implementadas

Além das funcionalidades presentes no código-base, foram implementadas as seguintes melhorias:

- Tela de login com controle de perfís de usuário
- Paginação e ordenação dos resultados.
- Filtro de pesquisa de produtos por nome e marca.

## Autenticação e segurança
- Implementação do Spring Security.
- Cadastro de usuários com persistência no MySQL.
- Autenticação utilizando usuários cadastrados no banco de dados.
- Criptografia de senhas utilizando BCrypt.
- Verificação de nomes de usuário duplicados.

## Objetivo acadêmico

O objetivo deste projeto é praticar os conceitos de desenvolvimento web com Java e Spring Boot, compreender a integração entre as diferentes camadas de uma aplicação e explorar recursos de persistência de dados, autenticação e segurança.

O projeto também serve como oportunidade para aplicar conhecimentos além do código inicialmente disponibilizado pelo professor.

## Usuários para teste

| Perfil | Usuário | Senha |
|---|---|---|
| Administrador (ADMIN) | `administrador` | `senha12345` |
| Usuário comum (USER) | `usuario_comum` | `senha12345` |

### Permissões

- **ADMIN:** pode visualizar, cadastrar, editar e excluir produtos.
- **USER:** pode apenas visualizar os produtos.

> **Observação:** os usuários precisam estar cadastrados no banco de dados para que as credenciais funcionem.