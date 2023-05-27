CREATE TABLE  if not exists "promotion" (
    id_promotion uuid primary key default uuid_generate_v4(),
    name varchar,
    promotion_begin timestamp with time zone not null default now(),
    promotion_end timestamp,
    promotion_picture varchar
);