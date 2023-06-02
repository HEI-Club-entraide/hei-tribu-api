CREATE TABLE if not exists "group" (
    id uuid primary key default uuid_generate_v4(),
    promotion_id uuid references promotion(id),
    name varchar,
    group_picture varchar
);