create database sellphone;
use sellphone;

create table category(
	id int primary key auto_increment,
    category nvarchar(40) not null
);

create table product(
    numberProduct int auto_increment primary key,
    name nvarchar(40) not null,
    price double,
    description nvarchar(100),
    discount double default 0,
    number_of_product int,
    category_id int not null,
    image varchar(200) default 'default.jpg',
    foreign key(category_id) references category(id)
);
alter table product add column ram varchar(6);
alter table product add column memory varchar(6);
alter table product add column chip varchar(30);
alter table product add column camera nvarchar(50);


create table listImage(
	id int primary key auto_increment,
    id_product int not null,
    image varchar(500) not null
);
INSERT INTO `sellphone`.`category` (`category`) VALUES ('HTC');
INSERT INTO `sellphone`.`category` (`category`) VALUES ('Iphone');
INSERT INTO `sellphone`.`category` (`category`) VALUES ('Nokia');
INSERT INTO `sellphone`.`category` (`category`) VALUES ('Sony');
INSERT INTO `sellphone`.`category` (`category`) VALUES ('Blackberry');
INSERT INTO `sellphone`.`category` (`category`) VALUES ('SamSung');
select * from product as p where p.name like 'n';