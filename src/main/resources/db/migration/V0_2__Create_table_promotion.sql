CREATE TABLE  if not exists "promotion" (
    id_promotion uuid primary key default uuid_generate_v4(),
    name varchar,
    enter_date timestamp,
    exit_date timestamp,
    promotion_photo varchar
);