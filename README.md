# Projeto bookapi
Project Maven - Java - Spring Boot @ 2.6.1
Group: com.nandotech
Artifact: bookapi
Description: Books API project to help filter and TAG books
Package name: com.nandotech.bookapi
JAR @ Java 11

Share: https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.1&packaging=jar&jvmVersion=11&groupId=com.nandotech&artifactId=bookapi&name=bookapi&description=Books%20API%20project%20to%20help%20filter%20and%20TAG%20books&packageName=com.nandotech.bookapi&dependencies=devtools,lombok,web,data-jpa,actuator,h2

# Database - early
[book]
id
title
author
edition
tag_id


[tag]
id
name
---

# Dependencies

* Spring Boot DevTools  - Dinamiza e atualiza as alterações do projeto
* Lombok - Evitar Escrever getters & setters & constructors através de annotations
* Spring Web
* Sprint Data JPA - JPA
* Spring Boot Actuator - Monitora endpoints, métricas, desempenho, sessions
* H2 - DB de memória que pode ser persistido para arquivo tipo sqlite


