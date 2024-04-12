# springboot-postgres-webapp
Developing Spring Web Application using Postgres Database and JPA

Create Employee table in Postgres Database and insert data refer below create table query.
Use spring initializr to create a new Spring boot project with the name: springwebjpa-master
Add postgres, JPA, web, Thymeleaf as dependency
Check Maven Dependencies - pom.xml file
Configure PostgreSQL Database in application.properties file 
Create JPA Entity - Employee.java
Create Spring Data Repository - EmployeeRepository.java
Create Spring Rest Controller - MainController.java
Create ConsoleApplication – to run project as Spring Boot App
Running Application 
http://localhost:8080/getEmployeeData
-- Table: public.employee

-- DROP TABLE IF EXISTS public.employee;

CREATE TABLE IF NOT EXISTS public.employee
(
    empid integer NOT NULL,
    name text COLLATE pg_catalog."default" NOT NULL,
    dob date NOT NULL,
    gender text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT employee_pkey PRIMARY KEY (empid)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.employee
    OWNER to postgres;

SELECT empid, name, dob, gender
	FROM public.employee;


![image](https://github.com/sathees-saty/springboot-postgres-webapp/assets/65384711/be23c6ac-3ca3-4316-8145-1f7fc961c307)

