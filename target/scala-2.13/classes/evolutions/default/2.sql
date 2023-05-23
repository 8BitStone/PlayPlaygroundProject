# --- Sample dataset

# --- !Ups

insert into address (id, description, due_date) values (1, 'Some Taske', '2020-12-12 00:00:01');
insert into address (id, description, due_date) values (2, 'Some other Taske', '2020-12-12 00:00:01');

insert into attachment (name, task_id) values ('Some Att', 1);
insert into attachment (name, task_id) values ('Some other Att', 2);

# --- !Downs

delete from attachment;
delete from address;