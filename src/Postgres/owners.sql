create table owners_table
(
    id         SERIAL primary key,
    first_name varchar(60),
    last_name  varchar(60) not null,
    city       varchar(30) not null,
    state      char(2)     not null
);

INSERT INTO owners_table(first_name, last_name, city, state, email)
values ('Sidhant', 'Sharma', 'Solan', 'HP', 'sidhantsharma1221@gmail.com'),
       ('Sahil', 'Sharma', 'Solan', 'HP', 'sahilsharma1221@gmail.com');

INSERT INTO owners_table(first_name, last_name, city, state, email)
values ('Kamlesh', 'Sharma', 'Solan', 'HP', 'kamleshsharma221@gmail.com'),
       ('Satish', 'Sharma', 'Solan', 'HP', 'satishsharma221@gmail.com');
insert into owners_table(id,first_name,last_name,city,state,email)
values (1,'Sidhant', 'Sharma', 'Solan', 'HP', 'sidsharma221@gmail.com');

update owners_table
set email ='sahilu01@gmail.com'
where id = 2;
update owners_table
set state='WB'
where id = 3;

delete from owners_table
where  first_name='Sidhant';

select *
from owners_table;


/*ALTER SEQUENCE owners_table_id_seq RESTART WITH 1;*/

create table pets_table
(
    id        SERIAL primary key,
    species   varchar(30),
    full_name varchar(30),
    age       int not null,
    owner_id  int references owners_table (id)
);
select *
from pets_table;

/*alter table owners_table
    alter column  last_name type varchar(50),
    add column email varchar(60) not null;*/

/*DROP table owners_table;
DROP TABLE pets_table;*/


