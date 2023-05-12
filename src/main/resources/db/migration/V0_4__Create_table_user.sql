CREATE TABLE if not exists "user" (
    id varchar primary key,
    first_name varchar(50),
    last_name varchar(50),
    username varchar(20),
    password varchar(20),
    email varchar(30),
    role role,
    gender gender,
    avatar_link varchar(30)
);