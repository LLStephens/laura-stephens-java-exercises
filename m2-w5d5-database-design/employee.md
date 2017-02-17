BEGIN transaction;

create table department
(
	id serial,
	name varchar(32) NOT NULL,
	CONSTRAINT pk_department_id PRIMARY KEY (id)
	
);

create table project
(
	id serial,
	name varchar(32) NOT NULL,
	start_date date NOT NULL,
	CONSTRAINT pk_project_id PRIMARY KEY (id)
	
);

create table job_title
(
	id serial,
	title varchar (32),
	CONSTRAINT pk_job_title_id PRIMARY KEY (id)
);

create table employee
(
	id serial,
	job_title_id integer NOT NULL,
	last_name varchar (32) NOT NULL,
	first_name varchar(32)NOT NULL,
	gender varchar (2),
	dob date NOT NULL,
	hiredate date NOT NULL,
	department_id integer NOT NULL,
	project_id integer NOT NULL,
	CONSTRAINT pk_employee_id PRIMARY KEY (id),
	CONSTRAINT fk_employee_project_id FOREIGN KEY (project_id) REFERENCES project(id),
	CONSTRAINT fk_employee_dept_id FOREIGN KEY (department_id) REFERENCES department(id),
	CONSTRAINT fk_employee_job_title_id FOREIGN KEY (job_title_id) REFERENCES job_title (id)
	
);


--Populate the tables with data for at least four projects, three departments, and eight employees.
--Make sure each project has at least one employee assigned to it, and each department has at least two employees in it.

insert into project (id, name, start_date) values (1, 'orbit','2016-04-12');
insert into project (id, name, start_date) values (2, 'moon landing', '2015-02-12');
insert into project (id, name, start_date) values (3, 'venus shuttle', '2012-12-28');
insert into project (id, name, start_date) values (4, 'y2k', '2000-01-01');
	
SELECT setval(pg_get_serial_sequence('project', 'id'), 5);
	
insert into department (id, name) values (1, 'mission control');
insert into department (id, name) values (2, 'human resources');
insert into department (id, name) values (3, 'engineering');
	
SELECT setval(pg_get_serial_sequence('department', 'id'), 4);

insert into job_title (id, title) values (1, 'astronaut');
insert into job_title (id, title) values (2, 'engineer');
insert into job_title (id, title) values (3, 'recruiter');
insert into job_title (id, title) values (4, 'pilot');	
	
SELECT setval(pg_get_serial_sequence('job_title', 'id'), 5);

insert into employee (id, job_title_id, last_name, first_name, dob, hiredate, department_id, project_id) values 
	(1, 1, 'Man', 'Space', '1969-12-24', '1990-10-08', 1, 1);
insert into employee (id, job_title_id, last_name, first_name, dob, hiredate, department_id, project_id) values 
	(2, 1, 'Lady', 'Skye', '1979-12-04', '1991-11-08', 1, 1);
insert into employee (id, job_title_id, last_name, first_name, dob, hiredate, department_id, project_id) values 
	(3, 1, 'Glenn', 'John', '1954-02-04', '1981-01-03', 1, 2);
insert into employee (id, job_title_id, last_name, first_name, dob, hiredate, department_id, project_id) values 
	(4, 1, 'Hanks', 'Tom', '1967-07-04', '1979-03-03', 1, 2);
insert into employee (id, job_title_id, last_name, first_name, dob, hiredate, department_id, project_id) values 
	(5, 2, 'Griffith', 'Sally', '1922-05-14', '2012-03-23', 3, 4);
insert into employee (id, job_title_id, last_name, first_name, dob, hiredate, department_id, project_id) values 
	(6, 3, 'Jones', 'Mark', '1982-04-20', '2015-07-23', 2, 4);
insert into employee (id, job_title_id, last_name, first_name, dob, hiredate, department_id, project_id) values 
	(7, 4, 'Ride', 'Sally', '1967-05-04', '2016-11-23', 1, 1);
insert into employee (id, job_title_id, last_name, first_name, dob, hiredate, department_id, project_id) values 
	(8, 2, 'Gomez', 'Maria', '1957-10-11', '2000-09-20', 3, 3);

SELECT setval(pg_get_serial_sequence('employee', 'id'), 9);


commit transaction;
	