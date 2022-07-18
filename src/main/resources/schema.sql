-- author
create table author
(
    id          bigserial
        constraint author_pk
            primary key,
    first_name  varchar not null,
    second_name varchar not null,
    middle_name varchar
);

alter table author
    owner to postgres;

create unique index author_id_uindex
    on author (id);



create table book
(
    id    bigserial
        constraint book_pk
            primary key,
    name  varchar not null,
    price numeric not null
);

alter table book
    owner to postgres;

create unique index book_id_uindex
    on book (id);

create unique index book_name_uindex
    on book (name);



create table author_book_link
(
    author_id bigint not null
        constraint has_author_id_fk
            references author,
    book_id   bigint not null
        constraint has_book_id_fk
            references book
);

alter table author_book_link
    owner to postgres;

