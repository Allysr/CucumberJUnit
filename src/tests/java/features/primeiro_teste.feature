#language: pt

Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar criterios de aceitacao

  Cenario: Validar incrementação do contador
    Dado que o contador esteja em 15
    Quando eu incrementar em 3
    Entao deve ser 18 o valor do contador

  Cenario: Validar incrementação do contador
    Dado que o contador esteja em 10
    Quando eu incrementar em 5
    Entao deve ser 15 o valor do contador

  Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é "AF345"
    E que o valor da passagem é R$ 230,45
    E que o nome do passageiro é "Fulano da Silva"
    E que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Então o teste vai funcionar

  Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é "AB167"
    E que o ticket especial é "AB167"
    E que o valor da passagem é R$ 1120,23
    E que o nome do passageiro é "Cicrano de Oliveira"
    E que o telefone do passageiro é 9888-8888

