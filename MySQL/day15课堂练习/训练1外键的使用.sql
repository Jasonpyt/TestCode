USE mydb;
SELECT DATABASE ();
CREATE TABLE emp(
empno INT PRIMARY KEY AUTO_INCREMENT,	##empno int 主键 自动自增长
ename VARCHAR(10),	##ename 字符类型
salary DOUBLE,		##salary 数值类型 
bonus DOUBLE,		##bonus 奖金数值型
deptno INT 		##员工在的部门 (外键)
);

CREATE TABLE dept(
deptno INT PRIMARY KEY AUTO_INCREMENT,	##deptno int 主键 自动增长 
dname VARCHAR(10),	## dnaME 部门名称 字符类型		
dlocation VARCHAR(20)	##dlocation 地理位置 字符类型		
);
ALTER TABLE emp ADD  FOREIGN KEY (deptno) REFERENCES dept(deptno);


##1:完成emp和dept  1:n设计
##2:录入初始化数据

INSERT INTO dept VALUES(110,'武装部','西蜀');
INSERT INTO dept VALUES(120,'爆破部','西蜀');
INSERT INTO dept VALUES(119,'消防部','西蜀');

INSERT INTO emp VALUES(110,'关羽',100,1000,110);
INSERT INTO emp VALUES(111,'张飞',10,100,120);
INSERT INTO emp VALUES(112,'马超',1000,1000,110);
			