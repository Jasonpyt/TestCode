/*

	1:完成学员student 和 老师 teacher 表和课程表的设计
	2:多对多设计原则,引入中间表.
*/

	USE mydb;
	CREATE TABLE students(
	sname VARCHAR(10),
	discipline VARCHAR(10),
	sscore INT PRIMARY KEY
	);
	
	CREATE TABLE teacher(
	sname VARCHAR(10),
	discipline VARCHAR(10) PRIMARY KEY
	);
	
	CREATE TABLE score(
		sscore INT,
		discipline VARCHAR(10)
	);
	
	ALTER TABLE score ADD FOREIGN KEY(sscore)REFERENCES students(sscore);
	ALTER TABLE score ADD FOREIGN KEY(discipline)REFERENCES teacher(discipline);

INSERT INTO students VALUES ('张三','英语',100);
INSERT INTO students VALUES ('李四','数学',95);
INSERT INTO students VALUES ('王五','语文',90);
INSERT INTO students VALUES ('王五','语文',999);


INSERT INTO teacher VALUES ('张老师','英语');
INSERT INTO teacher VALUES ('李老师','数学');
INSERT INTO teacher VALUES ('王老师','语文');

INSERT INTO teacher VALUES ('王老师','地理');








INSERT INTO score (sscore,discipline)VALUES (100,'数学');
INSERT INTO score (sscore,discipline)VALUES (90,'语文');
INSERT INTO score (sscore,discipline)VALUES (95,'英语');
##INSERT INTO score (sscore,discipline)VALUES (999,'语文');		添加students和teacher表中不存在的数据就会出先异常

##INSERT INTO score (sscore,discipline)VALUES (1000,'英语');