##DDL之  定义表的语言

##创建student表

##选择数据库mydb
USER mydb;
##显示正在运行的数据库
SELECT DATABASE();

##创建student表
CREATE TABLE student(
	sid INT PRIMARY KEY AUTO_INCREMENT ,##学号 sid INT 数据类型整型 primary key 约束当前字段唯一非空
	sname VARCHAR(20),
	sage INT
);

CREATE TABLE student1(
	id VARCHAR(10),
	sname VARCHAR(5),
	gender VARCHAR(2)
);

##添加一个列
ALTER TABLE student ADD adress VARCHAR(100);
##修改一个已有的列
ALTER TABLE student MODIFY adress VARCHAR(50);	
##用新列替换久列
ALTER TABLE student CHANGE adress addr VARCHAR(70);

##添加数据
INSERT INTO student VALUE(10010,'张三',18,'地球') ;
INSERT INTO student VALUE(10011,'李四',19,'火星');
INSERT INTO student (sname,sage,addr)VALUE('王五',20,'水星');

##数据修改
UPDATE student SET sname ='超人' WHERE addr= '火星';

##删除数据
DELETE FROM student WHERE sid= '0'; 

##主键的创建
CREATE TABLE person(
	idcard VARCHAR(18),
	id_p VARCHAR(5),
	age_p INT
	
);

ALTER TABLE person ADD PRIMARY KEY(idcard);

SELECT DATABASE();
CREATE TABLE student2(
	ssid INT PRIMARY KEY AUTO_INCREMENT,
	age INT ,
	school VARCHAR(10)
);
INSERT INTO student2 VALUE(100,18,'清华大学');
INSERT INTO student2 VALUE(NULL,18,'北京大学');




	