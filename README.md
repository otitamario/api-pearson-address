# Detalhes

## Pacotes

Foi utilizado o Spring Initializr para cirar o projeto inicial utilizando:

<ul>
<li>Spring Web </li>
<li>Spring Data JPA </li>
<li>Spring Boot DevTools </li>
<li>Lombok </li>
<li>H2 Database </li>
<li>Rest Repositories </li>
</ul>

## Configuração

A configuração no arquivo `application.properties` configura a porta para rodar, coloquei a 8000, e também configura o H2.
Para injetar dados iniciais foi criado o script SQL `data-h2.sql` que preenche dados iniciais no H2.

## Resolução do Problema

Foram criadas duas entidades: <b>Person</b> e <b>Endereco</b>, com os relaciomentos `@OneToMany` e `@ManyToOne`.
Para garantir um único endereço principal foi criada a variável `isMain` do tipo `Boolean`. Assim o endereço principal é marcado com `true` e os demais com `null`, e para garantir a unicidade foi criada uma Restrição de Unicidade ( `@UniqueConstraint`) com as colunas `isMain` e `person_id`.

## Rotas da API

As rotas foram criadas com o Spring Data Rest, onde por exemplo podemos ver os endereços da pessoa de id=1 através da rota http://localhost:8000/persons/1/enderecos
