CREATE DATABASE brewery;
USE brewery;
CREATE TABLE user
(
    user_id int PRIMARY KEY,
    user_name varchar(30),
    phone_number varchar(30),
    email varchar(30),
    register_date date,
    login varchar(30),
    password varchar(30)
);

CREATE TABLE product
(
    product_id int PRIMARY KEY,
    product_name varchar(30),
    total_litres int,
    price_per_litre int,
    description varchar(255)
);

CREATE TABLE order_cell
(
    order_id int REFERENCES ordÂr(order_id) ON DELETE CASCADE,
    product_id int REFERENCES product(product_id),
    bottle_volume int,
    count int
);

CREATE TABLE ordÂr
(
    order_id int PRIMARY KEY,
    user_id int REFERENCES user(user_id) ON DELETE CASCADE,
    city varchar(30),
    address varchar(100),
    status varchar(30)
);

CREATE TABLE favorite
(
    user_id int REFERENCES user(user_id) ON DELETE CASCADE,
    product_id int REFERENCES product(product_id) ON DELETE CASCADE,
    city varchar(30),
    address varchar(100)
);

INSERT INTO product(product_id, product_name, total_litres, price_per_litre, description)
VALUES(1, 'GOLDEN ALE', 0, 70, '');

INSERT INTO product(product_id, product_name, total_litres, price_per_litre, description)
VALUES(2, 'PORTER', 200, 75, '');

INSERT INTO product(product_id, product_name, total_litres, price_per_litre, description)
VALUES(3, 'CRYO APA', 0, 70, '');

INSERT INTO product(product_id, product_name, total_litres, price_per_litre, description)
VALUES(4, '¡À¿Õÿ≈–', 0, 40, '');

INSERT INTO product(product_id, product_name, total_litres, price_per_litre, description)
VALUES(5, '“–≈Ã¡≤“¿', 0, 40, '');

INSERT INTO product(product_id, product_name, total_litres, price_per_litre, description)
VALUES(6, 'LIGHTNER', 0, 40, '');

INSERT INTO product(product_id, product_name, total_litres, price_per_litre, description)
VALUES(7, '¡≈–À≤Õ√≈–', 0, 40, '');

INSERT INTO product(product_id, product_name, total_litres, price_per_litre, description)
VALUES(8, 'Ã» ”À»Õ 900', 0, 40, '');

INSERT INTO product(product_id, product_name, total_litres, price_per_litre, description)
VALUES(9, 'HONEY LAGER', 0, 40, '');

INSERT INTO user VALUES(1, 'ÃËı‡ÈÎÓ', '0900767131', 'mykhaylo@nure.ua', '2022-6-28', 'mykhaylo777', '123ggg999eee');