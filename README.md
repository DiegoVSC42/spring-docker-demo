# Spring Docker Demo

Este repositório contém um exemplo simples de como containerizar uma aplicação Spring Boot usando Docker. O projeto é uma aplicação básica que expõe um endpoint REST para demonstrar o funcionamento do Spring Boot em um container Docker.

## Pré-requisitos

Antes de começar, certifique-se de ter instalado:

- [Java 17](https://openjdk.org/projects/jdk/17/) (ou superior)
- [Maven](https://maven.apache.org/) (para build do projeto)
- [Docker](https://www.docker.com/) (para criar e executar containers)

## Como usar

### 1. Clone o repositório

```bash
git clone https://github.com/diegoVSC42/spring-docker-demo.git
cd spring-docker-demo
```

### 2. Construa o projeto

Para gerar o arquivo `.jar`, execute o seguinte comando na raiz do projeto:

```bash
./mvnw clean package
```

Isso criará o arquivo `spring-docker-demo-0.0.1-SNAPSHOT.jar` na pasta `target` que também foi criada.


### 3. Construa a imagem Docker

No diretório raiz do projeto, execute o comando abaixo para construir a imagem Docker:

```bash
docker build -t spring-docker-demo:1.0 .
```
- **`-t `**: Flag para nomear a imagem.
- **`spring-docker-demo:1.0`**: Nomeia a imagem como `spring-docker-demo` e define a tag `1.0`.
- **`.`**: Indica que o `Dockerfile` e os arquivos necessários estão na pasta raiz.

Isso criará a imagem Docker pronta para ser usada em containers.

### 4. Execute o container

Após construir a imagem, execute o container com o seguinte comando:

```bash
docker run -p 9090:8080 spring-docker-demo:1.0
```

- **`docker run`**: Comando para executar um container a partir de uma imagem.
- **`-p 9090:8080`**: Mapeia a porta `8080` do container para a porta `9090` do seu host.
- **`spring-docker-demo:1.0`**: Nome da imagem e tag que será usada para criar o container.

Isso iniciará o container e permitirá que você acesse a aplicação Spring Boot no endereço `http://localhost:9090`.

Aqui está a seção atualizada do seu `README.md` com as instruções para acessar a aplicação via navegador e também utilizando ferramentas como Postman ou Insomnia:

---

### 5. Acesse a aplicação

#### Via Navegador
Abra seu navegador e acesse a página `html` da aplicação:

```bash
http://localhost:9090/hello-page
```

Você verá uma página `html` estilizada com a seguinte mensagem:

```
Olá, você está acessando uma aplicação Spring através de um container Docker!
```

#### Via Ferramentas como Postman ou Insomnia
Se você preferir testar a aplicação utilizando ferramentas como **Postman** ou **Insomnia**, siga os passos abaixo:

1. **URL da Requisição**:
   ```
   GET http://localhost:9090/hello
   ```

2. **Envie a Requisição**:
  - Configure a requisição como `GET`.
  - Envie para o endpoint `http://localhost:9090/hello`.

3. **Resposta Esperada**:
   Você receberá a seguinte resposta:

   ```plaintext
   Olá, você está acessando uma aplicação Spring através de um container Docker!
   ```
Aqui está a finalização para o seu `README.md`:

---

## Conclusão

Este projeto demonstra como containerizar uma aplicação Spring Boot usando Docker, desde a construção do projeto até a execução do container. Com isso, você pode facilmente distribuir e executar sua aplicação em qualquer ambiente que suporte Docker.
