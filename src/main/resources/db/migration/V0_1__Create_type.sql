do
$$
    begin
        if not exists(select from pg_type where typname = 'role') then
            create type "role" as enum ('STUDENT', 'TEACHER');
        end if;
    end
$$;

do
$$
    begin
        if not exists(select from pg_type where typname = 'gender') then
            create type "gender" as enum ('F', 'M');
        end if;
    end
$$;

