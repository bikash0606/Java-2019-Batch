##Mysql Query

CREATE DATABASE BooksManagement;

CREATE TABLE Books ( 
 ID int NOT NULL,
  name varchar(50) NOT NULL,
  edition int NOT NULL, 
  price int NOT NULL, 
  UNIQUE(ID),
  PRIMARY KEY(ID)
);


