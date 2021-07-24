#Author: monica_8617@hotmail.com

@tag
Feature: Acessar login
  Eu como usuario quero fazer login para acessar os dados

  Scenario: CT01 - Login com dados validos
    Given que esteja na tela de login
    When informar dados validos
    Then login realizado com sucesso
    

 
