CREATE TABLE if not exists "group" (
    id_group char(2) primary key,
    id_promotion varchar(10) references promotion(id_promotion),
    id_user varchar(8) references user(id_user),
    name varchar
);