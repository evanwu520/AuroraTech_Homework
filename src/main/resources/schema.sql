
CREATE TABLE  IF NOT EXISTS `shoes`(
`sequence` int(11) not null AUTO_INCREMENT,
`id` varchar(20) primary key,
`status` int(1) not null default 0,
`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp()
);


CREATE TABLE  IF NOT EXISTS `box`(
`sequence` int(11) not null AUTO_INCREMENT,
`id` varchar(20) primary key,
`status` int(1) not null default 0,
`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp()
);


CREATE TABLE  IF NOT EXISTS `product`(
`sequence` int(11) not null AUTO_INCREMENT,
`id` varchar(20) primary key,
`shoes_id` varchar(20),
`box_id` varchar(20),
`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp()
);
