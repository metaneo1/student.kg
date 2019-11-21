-- 1 mandatory
CREATE DATABASE student
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;


-- 2 optional
CREATE TABLE public.users
(
    id bigint,
    first_name text,
    last_name text,
    email text,
    password text,
    PRIMARY KEY (id)
);

-- 3 optional
CREATE TABLE public.roles
(
    id integer,
    name text,
    PRIMARY KEY (id)
);
-- 4 optional
CREATE TABLE public.users_roles
(
    user_id bigint,
    role_id integer,
    CONSTRAINT many_to_many_user_id_fk FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT many_to_many_role_id_fk FOREIGN KEY (role_id)
        REFERENCES public.roles (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);


-- 5 mandatory
CREATE SEQUENCE public.user_id_seq;
CREATE SEQUENCE public.role_id_seq;
alter table users alter column id set default nextval('user_id_seq');
alter table roles alter column id set default nextval('role_id_seq');
