# subscriber


БД:

CREATE DATABASE mydb

CREATE TABLE subscripton (
  id int NOT NULL AUTO_INCREMENT,
  msisdn int,
  timest timestamp not null,
  PRIMARY KEY (id)
) ;


CREATE TABLE purchase (
  id int NOT NULL AUTO_INCREMENT,
  msisdn int,
  timest timestamp not null,
  PRIMARY KEY (id)
) ;

Запускть subscriber с помощью tomcat
