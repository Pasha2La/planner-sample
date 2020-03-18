drop table if exists roles
create table roles (
    id serial,
    role_name varchar(50) not null,
    primary key (id)
);

drop table if exists users
create table users (
    id serial,
    role_id serial,
    login varchar(50) not null,
    password varchar(50) not null,
    primary key (id),
    foreign key (role_id) references roles(id)
);

drop table if exists works
create table works (
    id serial,
    work_name varchar(50) not null,
    status varchar(50) not null,
    start_date date,
    expire_date date,
    primary key (id)
);

drop table if exists tasks
create table tasks (
    id serial,
    task_name varchar(50) not null,
    work_id serial,
    primary key (id),
    foreign key (work_id) references tasks(id) on delete cascade
);

drop table if exists time_costs
create table time_costs (
    id serial,
    user_id serial references users(id),
    task_id serial references tasks(id),
    day date not null,
    time_spent integer not null,
    primary key (id)
);

insert into roles (role_name) values ('test_role');
insert into roles (role_name) values ('admin');
insert into roles (role_name) values ('boss');
insert into roles (role_name) values ('worker');
insert into roles (role_name) values ('student');

insert into users (role_id, login, password) values (1, 'test_login', 'test_password');
insert into users (role_id, login, password) values (2, 'admin', '12345');
insert into users (role_id, login, password) values (3, 'barinov-av', '12345');
insert into users (role_id, login, password) values (4, 'ivanov-ii', '12345');
insert into users (role_id, login, password) values (5, 'ognyanovich-pa', '12345');

insert into works (work_name, status, start_date, expire_date) values ('backend_dev', 'in_progress', '01-Mar-2020', '01-Mar-2021');

insert into tasks (task_name, work_id) values ('create_api', 1);
insert into tasks (task_name, work_id) values ('setup_db_connection', 1);
insert into tasks (task_name, work_id) values ('create_db', 1);
insert into tasks (task_name, work_id) values ('create_services', 1);
insert into tasks (task_name, work_id) values ('create_controllers', 1);
insert into tasks (task_name, work_id) values ('create_repos', 1);
insert into tasks (task_name, work_id) values ('add_git', 1);

insert into time_costs (user_id, task_id, "day", time_spent) values (5, 2, '01-Mar-2020', 180);
insert into time_costs (user_id, task_id, "day", time_spent) values (5, 4, '01-Mar-2020', 60);
insert into time_costs (user_id, task_id, "day", time_spent) values (5, 5, '01-Mar-2020', 60);
insert into time_costs (user_id, task_id, "day", time_spent) values (5, 6, '01-Mar-2020', 30);
insert into time_costs (user_id, task_id, "day", time_spent) values (5, 3, '03-Mar-2020', 180);
