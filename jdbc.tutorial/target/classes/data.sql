create table employee (
    id integer not null,
    name varchar(250) not null,
    location varchar(250),
    department varchar(100),
    date_of_birth timestamp,
    primary key(id)
);

insert into employee(id, name, location, department, date_of_birth)
  values(100, 'Habil', 'Bangalore', 'OneTru', current_timestamp);
 insert into employee(id, name, location, department, date_of_birth)
  values(101, 'Tom', 'Costa Rica', 'OneTru', current_timestamp);
 insert into employee(id, name, location, department, date_of_birth)
  values(102, 'Jose', 'US', 'OneDev', current_timestamp);