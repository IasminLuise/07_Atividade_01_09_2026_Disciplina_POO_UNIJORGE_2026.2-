Contexto:

Uma escola deseja desenvolver um pequeno sistema para cadastrar alunos e consultar 
suas informações acadêmicas. Atualmente, os dados são registrados manualmente, o que
dificulta a atualização e a consulta das informações.

Você foi contratado para desenvolver uma primeira versão do sistema utilizando Programação Orientada a Objetos (POO).

O sistema deverá permitir o cadastro de alunos, alteração de seus dados e apresentação das informações.

Objetivo da atividade

Desenvolver uma aplicação utilizando os conceitos fundamentais de Programação Orientada a Objetos, aplicando:

Classe
Atributos
Métodos
Getters e Setters
Objetos
Encapsulamento


Desafio

Crie uma classe chamada Aluno que represente um aluno da escola.

A classe deverá possuir os seguintes atributos privados:


Atributo                 Tipo                    Descrição
nome                     String                 Nome do aluno
matricula               String                 Número da matrícula
idade                     int                        Idade do aluno
nota1                     double                Primeira nota
nota2                     double                Segunda nota

Getters e Setters

Crie métodos get e set para permitir o acesso e a alteração dos atributos.

Métodos da classe

Além dos getters e setters, a classe deverá possuir os seguintes métodos:

calcularMedia()

Deve calcular e retornar a média das duas notas.

verificarSituacao()

Deve verificar a situação do aluno:


Média              Situação
≥ 7,0                 Aprovado
≥ 5,0 e < 7,0    Recuperação
< 5,0                Reprovado

Criar os objetos

No programa principal, crie dois objetos da classe Aluno.
