CREATE TABLE if not exists "user" (
    id varchar primary key,
    first_name varchar(20),
    last_name varchar(20),
    username varchar(10),
    password varchar,
    email varchar,
    role role,
    gender gender,
    avatar_link varchar
);