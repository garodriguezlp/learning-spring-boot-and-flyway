drop table if exists user CASCADE;

drop sequence if exists hibernate_sequence;

create sequence hibernate_sequence start with 2 increment by 1;

create table user (
   id bigint not null,
   created_on timestamp,
   name varchar(255),
   primary key (id)
);
