CREATE TABLE  if not exists "promotion" (
    id_promotion  varchar(10) primary key,
    name varchar(32),
    enter_date timestamp,
    exit_date timestamp
);