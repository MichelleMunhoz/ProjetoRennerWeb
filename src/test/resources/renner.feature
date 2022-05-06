#Author: michelle_5m@hotmail.com	

@teste
Feature: Compras no site
  Eu como usuario quero fazer uma compra no site


  Scenario: Efetuando a compra no site
    When eu incluir as pecas no carrinho
    Then finalizo a minha compra
   
    Scenario: Cadastrando um novo usuario
    Given que eu esteja finalizando uma compra e nao tenha cadastro no site
    When eu preencher os meus dados 
    Then eu finalizo o cadastro
    


