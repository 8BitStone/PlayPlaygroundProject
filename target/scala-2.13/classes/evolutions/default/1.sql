# --- First database schema

# --- !Ups
create table address (
  id                        int NOT NULL AUTO_INCREMENT,
  description               varchar(255),
  due_date                  datetime,
  constraint pk_task        primary key (id)
);

create table attachment (
  id                        int NOT NULL AUTO_INCREMENT,
  task_id                   int,
  name                      varchar(255),
  content                   blob,
  constraint pk_attachment  primary key (id),
  constraint fk_task        foreign key (task_id) references address (id)
);

create sequence task_seq start with 1000;
create sequence attachment_seq start with 1000;


# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists address;
drop table if exists attachment;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists task_seq;
drop sequence if exists attachment_seq;