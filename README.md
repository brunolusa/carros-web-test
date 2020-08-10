# Carros Web Test

Este projeto têm como objetivo testar a página Carros, que por sua vez, consome a API-Carros para buscar os dados.

# Validações

* Funcional - Valida a Atualização de um carro pré-existente;
* Funcional - Valida a Deleção de um carro pré-existente;
* Funcional - Valida a Criação de um novo carro.

# Execução

Neste projeto não foi elaborado nenhuma suíte de execução, particularmente, quando tenho um projeto pequeno, gosto de executar as utilizando o parâmetro test do Maven, entendo que facilita a não existência de um arquivo XML, e possibilita o mesmo resultado, segue abaixo: Para as execuções dos níveis de testes:

``mvn clean test``

# Linguagens e Frameworks

* TestNG
* Java 11
* Maven
* Selenium Web Driver
* Web Driver Manager
* Extent Report

# Reporte

Configurado neste projeto a biblioteca Extent Report 4, onde após cada execução, fica disponível em ``target\relatorio\execucao.html`` o reporte extraído da execução do teste. 

# Pré-requisitos

Para executar este projeto é necessário que você tenha inicializado a aplicação ``api-carros`` e o front ``react_api_carros``;

* mvn spring-boot:run [Carros API](https://github.com/brunolusa/api-carros)
* npm start [React Api Carros](https://github.com/brunolusa/react_api_carros)