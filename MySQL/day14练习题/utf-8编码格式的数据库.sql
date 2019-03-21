##用utf-8编码格式创建数据库
CREATE DATABASE utf8 CHARACTER  SET utf8;

##显示当前数据库具体信息
SHOW CREATE DATABASE utf8;

CREATE TABLE category(
	id VARCHAR(10),
	price INT,
	savemoney DOUBLE,
	product DATE,
	get TIMESTAMP
	
);

ALTER PRIMARY KEY(id);

SHOW TABLES;

##显示表结构
DESC category;

##修改表结构
ALTER TABLE category ADD address VARCHAR(100);

##使用MODify修改某个字段
ALTER TABLE category MODIFY  address VARCHAR(50);

##使用change修改某个字段

ALTER TABLE category CHANGE address addr VARCHAR(10);

SHOW TABLES;

##向表中添加数据
INSERT INTO category  VALUE(1000,10,1000.0,'2018-01-15','2018-11-7 24:23:20','中国');

INSERT INTO category  VALUE(9999,10,1000.0,'2018-01-15','2018-0-0 24:23:60','中国');

