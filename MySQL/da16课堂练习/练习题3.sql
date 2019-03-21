USE day03;
-- 1) 创建工程表： 工程号(主键,字符串),工程名称
CREATE TABLE project (
	id CHAR(2) PRIMARY KEY,
	NAME VARCHAR(20)
);

-- 2) 职务表:   职务编号(主键)，职务,小时工资率
CREATE TABLE job (
	id INT PRIMARY KEY,
	NAME VARCHAR(10),
	rate DOUBLE
);

-- 3) 员工表:   职工号(主键，从1001开始),姓名,职务编号(外键)
CREATE TABLE emp (
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20),
	job_id INT,
	FOREIGN KEY (job_id) REFERENCES job(id)
);

ALTER TABLE emp AUTO_INCREMENT = 1001;

-- 4) 工时表:  工程号(外键),职工号(外键),工时
CREATE TABLE work_time (
	prj_id CHAR(2),
	emp_id INT,
	hours INT,
	PRIMARY KEY(prj_id, emp_id),
	FOREIGN KEY(prj_id) REFERENCES project(id),
	FOREIGN KEY(emp_id) REFERENCES emp(id)
);

-- 插入工程数据
INSERT INTO project VALUES ('A1','花园大厦'),('A2','立交桥'),('A3','临江饭店');

SELECT * FROM project;

-- 插入职务表
INSERT INTO job VALUES (1,'工程师',65),(2,'技术员',60),(3,'律师',100),(4,'工人',55);
SELECT * FROM job;

-- 插入员工表
INSERT INTO emp (NAME,job_id) VALUES ('杨国明',1),('班建斌',2),('伍岳林',3),('鞠明亮',4);

SELECT * FROM emp;

-- 插入工时表
INSERT INTO work_time VALUES ('A1',1001,13),('A1',1002,16),('A1',1003,19),
('A2',1001,13),('A2',1004,17),('A3',1002,18),('A3',1003,14);

SELECT * FROM work_time;




