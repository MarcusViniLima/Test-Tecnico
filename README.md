# Teste-Tecnico
## Sobre o desafio
Usando Spring boot, crie uma API simples para gerenciar Pessoas.
## Tecnologias, Stacks e Ferramentas
- Java
- Maven
- H2 database
- Spring Framework (Spring Boot, Spring Data JPA, Spring Web, Spring DevTools)
## Como executar a aplicação
  Antes de iniciar a aplicação, é necessário criar um banco de dados no H2 database chamado **testetdb**. Configure seus usuário e senha no arquivo `src\main\resources\application.properties`, e execute os Scripts <a href="https://github.com/MarcusViniLima/Test-Tecnico/blob/main/curl-postPessoa.sh">curl-postPessoa</a> e <a href="https://github.com/MarcusViniLima/Test-Tecnico/blob/main/curl-postEndereco.sh">curl-postEndereco</a> para população das tabelas. A seguir, torne os scripts shell executáveis com o comando `chmod +x` e execute a aplicação com o comando `./start.sh`
Alguns teste e documentação você pode encontrar no <a href="https://app.getpostman.com/join-team?invite_code=48d4206928f6cb90cabceaabddf882c3&target_code=92d15e53ddea2c9fa88e8c2c952a576f">Postman</a> da aplicação.
