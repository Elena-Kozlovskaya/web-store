create table products
(
    id            bigserial primary key,
    title         varchar(255),
    price         int,
    created_at    timestamp default current_timestamp,
    updated_at    timestamp default current_timestamp
);

insert into products (title, price)
values ('Potato', 2),
       ('Carrot', 4),
       ('Pepper', 8),
       ('Tomato', 16),
       ('Asparagus', 75),
       ('Apple', 23),
       ('Beet', 12),
       ('Orange', 45),
       ('Cabbage', 21),
       ('Grape', 47),
       ('Celery', 38),
       ('Corn', 33),
       ('Cucumber', 145),
       ('Daikon', 97),
       ('Eggplant', 123),
       ('Garlic', 67),
       ('Kale', 77),
       ('Lettuce', 68),
       ('Onion', 25),
       ('Parsley', 27);