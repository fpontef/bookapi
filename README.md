# Projeto bookapi
```json
{ 
  "project" : ["Maven", "Java", "Spring Boot @ 2.6.1"],
  "group": "com.nandotech",
  "artifact": "bookapi",
  "description": "Books API project to help filter and TAG books",
  "package name": "com.nandotech.bookapi",
  "other":"JAR @ Java 11"
}
```

Share: https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.1&packaging=jar&jvmVersion=11&groupId=com.nandotech&artifactId=bookapi&name=bookapi&description=Books%20API%20project%20to%20help%20filter%20and%20TAG%20books&packageName=com.nandotech.bookapi&dependencies=devtools,lombok,web,data-jpa,actuator,h2

# Database
> Many to many between books and tags
```
[book]
id
title
author
edition
tags

[tag]
id
name
books
```

# Dependencies

* Spring Boot DevTools  - Dinamiza e atualiza as alterações do projeto
* Lombok - Evitar Escrever getters & setters & constructors através de annotations
* Spring Web
* Sprint Data JPA - JPA
* Spring Boot Actuator - Monitora endpoints, métricas, desempenho, sessions
* H2 - DB de memória que pode ser persistido para arquivo tipo sqlite

# Alterações do original:
- Ao invés de usar Pesoas e telefones, usei Livros e Tags
- Adaptei a configuração do H2 em memória para valor fixo no application.properties

# Post example
Using POST@URL/api/v1/book
```json
{
  "title": "Javascript Programming Beginner To Professional Basic Advance Learn Javascript In N Days",
  "author": "João das Neves",
  "edition": "2a",
  "genre": "TECH",
  "notes": "pseudo fast learning",
  "tags": [
    {"name": "OUTRO"},
    {"name": "JS"},
    {"name": "JS"}
  ]
}
```

The Tag entity have Set to avoid repeated insertions.