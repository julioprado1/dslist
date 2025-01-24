# DSList

DSList é um projeto desenvolvido durante o Intensivão Java Spring da [DevSuperior](https://devsuperior.com.br). O objetivo do projeto é criar uma aplicação backend para gerenciar uma lista de jogos, permitindo a visualização e organização de títulos.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **JPA / Hibernate**
- **Maven**
- **Banco de Dados H2** (para testes)

## Modelo de Domínio

O modelo de domínio da aplicação é composto pelas seguintes entidades:

- **Game**: representa um jogo com atributos como título, ano de lançamento, gênero, entre outros.
- **GameList**: representa uma lista de jogos personalizada pelo usuário.

## Como Executar o Projeto

1. **Pré-requisitos**: Certifique-se de ter o [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) e o [Maven](https://maven.apache.org/download.cgi) instalados em sua máquina.

2. **Clonar o Repositório**:

   ```bash
   git clone https://github.com/julioprado1/dslist.git
   cd dslist
   ```

3. **Executar a Aplicação**:

   ```bash
   ./mvnw spring-boot:run
   ```

   A aplicação estará disponível em `http://localhost:8080`.

## Endpoints Principais

- **GET /games**: Retorna a lista de todos os jogos.
- **GET /games/{id}**: Retorna os detalhes de um jogo específico.
- **GET /lists**: Retorna todas as listas de jogos.
- **POST /lists**: Cria uma nova lista de jogos.
- **POST /lists/{listId}/games**: Adiciona um jogo a uma lista específica.

## Configurações Adicionais

- **CORS**: As origens permitidas para requisições estão definidas no arquivo `application.properties`. Por padrão, estão configuradas para `http://localhost:5173` e `http://localhost:3000`. Você pode ajustar conforme necessário.

- **Perfis de Aplicação**: A aplicação possui perfis para diferentes ambientes (`test` e `dev`). O perfil ativo pode ser definido no arquivo `application.properties` através da propriedade `spring.profiles.active`.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.
