create database Pessoa;
use Pessoa;
show tables;
show databases;
describe Pessoa;

create table Pessoa(
codigo int primary key auto_increment,
nome varchar(50) not null,
telefone varchar(50) not null,
email varchar(50) not null
);

insert into Pessoa(nome, telefone, email) values 
("Pedro", "1125259898", "pedro@email.com");

insert into Pessoa values 
(codigo, "Danilo", "1125259898", "danilo@email.com");

insert into Pessoa(nome, telefone, email) values 
("Gabriela", "1125277898", "gabriela@email.com"),
("Rebeca", "1158648454", "rebeca@email.com");

select * from Pessoa;

