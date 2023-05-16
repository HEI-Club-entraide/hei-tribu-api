CREATE TABLE if not exists "user" (
    id_user uuid primary key default uuid_generate_v4(),
    group_id uuid references "group"(id_group),
    first_name varchar(50),
    last_name varchar(50),
    username varchar(30),
    password varchar,
    email varchar,
    role role,
    gender gender,
    user_photo varchar
);