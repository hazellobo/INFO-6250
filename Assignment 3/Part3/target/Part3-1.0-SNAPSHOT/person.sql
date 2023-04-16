/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  hazel
 * Created: Oct 19, 2022
 */
CREATE DATABASE IF NOT EXISTS MYDB;
USE MYDB;
CREATE TABLE IF NOT EXISTS person (
  ssn VARCHAR(10),  
  firstname VARCHAR(30),
  lastname VARCHAR(30),
  age int     
); 
INSERT INTO person (ssn, firstname, lastname, age)
     values('Z345T','Cheryl','Johnson','25');
INSERT INTO person (ssn, firstname, lastname, age)
     values('Z446T','John','Smith','35');
INSERT INTO person (ssn, firstname, lastname, age)
     values('Z335T','Justin','Claire','50');
INSERT INTO person (ssn, firstname, lastname, age)
     values('Z389T','Clark','Rick','35');