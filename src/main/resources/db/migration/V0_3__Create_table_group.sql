CREATE TABLE if not exists "group" (
    id_group uuid primary key default uuid_generate_v4(),
    promotion_id uuid references promotion(id_promotion),
    name varchar,
    group_picture varchar
);