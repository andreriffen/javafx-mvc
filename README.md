# JavaFX CRUD MVC

![a](https://raw.githubusercontent.com/andreriffen/javafx-mvc/main/screenshot.fw.png)

Este projeto é um exemplo de aplicação JavaFX que segue o padrão MVC (Model-View-Controller) para a implementação de um CRUD (Create, Read, Update, Delete). 
 
Está sendo desenvolvido como parte de uma lição de casa para a disciplina Programação Orientada a Objetos do Curso Técnico de Desenvolvimento de Sistemas - IFSC; após a greve dos professores e servidores (de 06/05/2024 a 03/07/2024)


## Estrutura do Projeto

```plaintext
src/main/java/andreriffen/javafxcrudmvc
│
├── controller
├── model
│   ├── dao
│   │   ├── CategoriaDAO.java
│   │   ├── ClienteDAO.java
│   │   ├── ItemDeVendaDAO.java
│   │   ├── ProdutoDAO.java
│   │   └── VendaDAO.java
│   ├── database
│   │   ├── Database.java
│   │   ├── DatabaseFactory.java
│   │   ├── DatabaseMySQL.java
│   │   └── DatabasePostgreSQL.java
│   └── domain
│       ├── Categoria.java
│       ├── Cliente.java
│       ├── ItemDeVenda.java
│       ├── Produto.java
│       └── Venda.java
├── view
│   ├── FXMLAnchorPaneCadastrosClientes.fxml
│   ├── FXMLAnchorPaneCadastrosClientes.java
│   ├── FXMLVBoxMain.fxml
│   └── FXMLVBoxMain.java
├── HelloApplication.java
└── HelloController.java
```

### Playlist no YouTube

Estou seguindo uma playlist do canal Rafael Mesquita para auxiliar no desenvolvimento do projeto. A playlist cobre a implementação de um CRUD de cadastro de clientes usando JavaFX e o padrão MVC.

[Tutorial Completo](https://www.youtube.com/playlist?list=PL-mvLy2ws8ILNrs8jtEAwaZMxDZvlMj48) | [Boilerplate](https://drive.google.com/open?id=0B3q56TwNCeXoN25UWW4xMGd5QTg) |  [Script Banco de Dados](https://drive.google.com/open?id=0B3q56TwNCeXoOFZUMDdlaVB6MU0)

## Configuração do Ambiente

Para configurar o ambiente e executar este projeto, você precisará de:

- Java Development Kit (JDK) 17 ou superior
- JavaFX SDK
- IDE de sua escolha (IntelliJ IDEA, Eclipse, etc.)

## Executando o Projeto

- Clone este repositório: <code> git clone <URL_DO_REPOSITORIO> </code>
- Abra o projeto na sua IDE.
- Configure as dependências do JavaFX.</code>
- Execute a classe HelloApplication.java para iniciar a aplicação.

## Sobre o Projeto

Este projeto foi desenvolvido como parte de uma lição de casa para o curso técnico em Desenvolvimento de Sistemas no IFSC durante as férias de 15 dias dos professores e servidores. É um exercício prático para aplicar conceitos de Java, JavaFX e o padrão de design MVC.

## Licença
Este projeto está licenciado sob a MIT License.

Andre GB Farias © 2024
