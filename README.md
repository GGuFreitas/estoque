# Estoque-Spring
# Controle de Estoque com Spring Boot

Descrição curta do projeto:  
Aplicação simples para gerenciar estoque de produtos com CRUD usando Spring Boot, JPA, MySQL e Swagger UI para documentação da API.

---

## Funcionalidades

- Cadastro, edição, listagem e exclusão de produtos
- Validação básica de dados
- Documentação da API com Swagger UI
- Banco de dados MySQL (pode ser PostgreSQL em deploy)

---

## Tecnologias

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate
- MySQL
- Swagger UI
- Maven (ou Gradle)

---

## Como rodar o projeto localmente

### Pré-requisitos

- Java 17 instalado
- MySQL rodando e configurado
- Maven ou Gradle instalado

### Passos

1. Clone o repositório:
```bash
git clone https://github.com/seuusuario/controle-estoque-springboot.git
```

Configure o banco de dados no arquivo application.properties:
```bash
properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/estoque
spring.datasource.username=root
spring.datasource.password=suasenha
spring.jpa.hibernate.ddl-auto=update
```

Rode a aplicação:

```bash
Copiar
Editar
./mvnw spring-boot:run
```

Acesse a API pelo Swagger UI:

```bash
Copiar
Editar
http://localhost:8080/swagger-ui/index.html
```

API Endpoints
Método	Endpoint	Descrição
GET	/produtos	Lista todos os produtos
POST	/produtos	Cria um novo produto
GET	/produtos/{id}	Busca produto por id
PUT	/produtos/{id}	Atualiza produto
DELETE	/produtos/{id}	Remove produto

Como contribuir
Faça um fork do projeto

Crie uma branch (git checkout -b feature/nova-funcionalidade)

Commit suas alterações (git commit -m 'Adiciona nova funcionalidade')

Faça push para a branch (git push origin feature/nova-funcionalidade)

Abra um Pull Request

Licença
Este projeto está licenciado sob a MIT License.

Contato
Seu Nome - ggFreitasaDev@gmail.com
LinkedIn | GitHub
