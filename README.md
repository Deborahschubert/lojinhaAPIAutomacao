## Lojinha API Automação
Esse é um repositório que contém a automação de alguns testes de API Rest de um software denominado Lojinha. Os sub-tópicosabaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas

- Java
- JUnit
- RestAssured
- Maven

## Testes Automatizados
Testes para validar as partições de equivalência relacionadas ao valor do produto na Lojinha, que estão vinculados diretamente a regra de negócio que diz que o valor do produto deve estar entre R$0,01 e R$7.000,00.

## Notas Gerais

- Sempre utilizamos a anotação Before Each para capturar o token que será utilizado posteriormente nos métodos de teste
- Armazenamos os dados que são enviados para a API através do uso de classes POJO
- Criamos dados iniciais através do uso de classe Data Factory, para facilitar a criação e controle dos mesmos
- Nesse projeto fazemos uso do JUnit 5, o que nos dá a possibilidade de usar a anotação DisplayName para dar descrições em português para os nossos testes.