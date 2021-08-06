create table company (
   id bigint not null,
    name varchar(255),
    primary key (id)
);

create table employee (
   id bigint not null,
    name varchar(255),
    surname varchar(255),
    company_id bigint,
    primary key (id)
);

alter table employee
   add constraint FK5v50ed2bjh60n1gc7ifuxmgf4
   foreign key (company_id)
   references company;