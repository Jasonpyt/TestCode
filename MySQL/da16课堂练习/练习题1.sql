USER day03;
SELECT DATABASE();

CREATE TABLE dept(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20)
);

INSERT INTO dept (NAME) VALUES ('开发部'),('市场部'),('财务部');



CREATE TABLE employee (
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(10),
	gender CHAR(1),   -- 性别
	salary DOUBLE,   -- 工资
	join_date DATE,  -- 入职日期
	dept_id INT,
	FOREIGN KEY (dept_id) REFERENCES dept(id)
);


INSERT INTO employee(NAME,gender,salary,join_date,dept_id) VALUES('孙悟空','男',7200,'2013-02-24',1);
INSERT INTO employee(NAME,gender,salary,join_date,dept_id) VALUES('猪八戒','男',3600,'2010-12-02',2);
INSERT INTO employee(NAME,gender,salary,join_date,dept_id) VALUES('唐僧','男',9000,'2008-08-08',2);
INSERT INTO employee(NAME,gender,salary,join_date,dept_id) VALUES('白骨精','女',5000,'2015-10-07',3);
INSERT INTO employee(NAME,gender,salary,join_date,dept_id) VALUES('蜘蛛精','女',4500,'2011-03-14',1);




##	查询工资最高的员工是谁？
SELECT NAME FROM employee WHERE salary = (SELECT MAX(salary)FROM employee); 

#	查询工资小于平均工资的员工有哪些？
SELECT NAME FROM employee WHERE salary < (SELECT AVG(salary) FROM employee);

##	查询大于5000的员工，来至于哪些部门，输出部门的名字

SELECT d. NAME FROM dept d INNER JOIN employee e ON e.dept_id = d.id WHERE e.salary > 5000;

##	查询开发部与财务部所有的员工信息，分别使用子查询和表连接实现
SELECT * FROM employee WHERE dept_id = 1 OR dept_id = 6;
SELECT * FROM employee e INNER JOIN dept d ON d.id = e.dept_id WHERE e.dept_id = 1 OR e.dept_id = 3 OR dept_id = 6 ;

	SELECT * FROM employee WHERE dept_id IN (SELECT d.id FROM dept d WHERE d.name='开发部' OR d.name='财务部');

##5)	查询2011年以后入职的员工信息和部门信息，分别使用子查询和表连接实现
SELECT * FROM employee WHERE join_date >= '2010-1-1';

SELECT * FROM dept d ,(SELECT * FROM employee WHERE join_date >='2011-1-1')  e WHERE d.id = e.dept_id;