# Atividade inicial Spring Boot — Sistemas Corporativos

Este repositório contém a atividade inicial da matéria de Sistemas Corporativos, implementada em Java com Spring Boot.

O objetivo da aplicação é servir como base para introdução a desenvolvimento de APIs REST com Spring, com a exposição de dois endpoints HTTP.

## Tecnologias e estrutura

- Linguagem: Java
- Framework: Spring Boot
- Build: Maven

## Como executar localmente

Pré‑requisitos:
- Java (JDK) compatível com o projeto (Java 21)

Passos:
1. Clone o repositório
   ```
   git clone https://github.com/GustavoeDev/atividade-inicial-spring.git
   cd atividade-inicial-spring
   ```
2. Execute a aplicação usando o Maven Wrapper:
   ```
   ./mvnw spring-boot:run
   ```
   No Windows:
   ```
   mvnw.cmd spring-boot:run
   ```
   A aplicação, por padrão, sobe em:
   - http://localhost:8080

## Endpoints

| Método | Rota                        | Descrição                         | Corpo de requisição                                                | Resposta                                             | Status |
|--------|-----------------------------|-----------------------------------|--------------------------------------------------------------------|------------------------------------------------------|--------|
| GET    | `/hello`                    | Retorna "Bem-Vindo" a aplicação   | —                                                                  | `{"message":"Bem-vindo!"}`                           | 200    |
| POST   | `/name`                     | Mensagem com o nome do aluno      | `{"name":"Gustavo"}`                                               | `{"message":"Olá, Gustavo"}`                         | 200    |
