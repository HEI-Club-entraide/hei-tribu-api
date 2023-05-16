CREATE TABLE if not exists "user" (
    id uuid primary key default uuid_generate_v4(),
    group_id uuid references "group"(id),
    first_name varchar,
    last_name varchar,
    username varchar,
    password varchar,
    email varchar,
    role role,
    gender gender,
    user_profile_picture varchar,
    birthdate timestamp
);