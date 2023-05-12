CREATE TABLE if not exists "group" (
    id_group varchar primary key,
    promotion_id varchar references promotion(id_promotion),
    name varchar
);