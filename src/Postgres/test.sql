

CREATE TABLE example
(
    example_id serial primary key,
    first_name varchar(30),
    last_name  varchar(30)
)
select* from example;
--modifying tables and add columns.
ALTER  TABLE  example
add column email varchar(30) unique,
add column nationality varchar(20) not null,
add column  age int not null ;

--modifying data type.
ALTER TABLE  example
ALTER COLUMN nationality type char(3);
