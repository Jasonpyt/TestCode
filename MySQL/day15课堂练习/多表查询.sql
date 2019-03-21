CREATE TABLE student(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20),
	city VARCHAR(10),
	age INT
);


CREATE TABLE teacher(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20)
);

CREATE TABLE course(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20),
	teacher_id INT,
	FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);


CREATE TABLE student_course(
	student_id INT,
	course_id INT,
	score INT,
	FOREIGN KEY (student_id) REFERENCES student(id),
	FOREIGN KEY (course_id) REFERENCES course(id)
);


nsert INTO teacher VALUES(NULL,'关羽');
INSERT INTO teacher VALUES(NULL,'张飞');
INSERT INTO teacher VALUES(NULL,'赵云');

INSERT INTO student VALUES(NULL,'小王','北京',20);
INSERT INTO student VALUES(NULL,'小李','上海',18);
INSERT INTO student VALUES(NULL,'小周','北京',22);
INSERT INTO student VALUES(NULL,'小刘','北京',21);
INSERT INTO student VALUES(NULL,'小张','上海',22);
INSERT INTO student VALUES(NULL,'小赵','北京',17);
INSERT INTO student VALUES(NULL,'小蒋','上海',23);
INSERT INTO student VALUES(NULL,'小韩','北京',25);
INSERT INTO student VALUES(NULL,'小魏','上海',25);
INSERT INTO student VALUES(NULL,'小明','北京',20);

INSERT INTO course VALUES(NULL,'语文',1);
INSERT INTO course VALUES(NULL,'数学',1);
INSERT INTO course VALUES(NULL,'生物',2);
INSERT INTO course VALUES(NULL,'化学',2);
INSERT INTO course VALUES(NULL,'物理',2);
INSERT INTO course VALUES(NULL,'英语',3);

INSERT INTO student_course VALUES(1,1,80);
INSERT INTO student_course VALUES(1,2,90);
INSERT INTO student_course VALUES(1,3,85);
INSERT INTO student_course VALUES(1,4,78);
INSERT INTO student_course VALUES(2,2,53);
INSERT INTO student_course VALUES(2,3,77);
INSERT INTO student_course VALUES(2,5,80);
INSERT INTO student_course VALUES(3,1,71);
INSERT INTO student_course VALUES(3,2,70);
INSERT INTO student_course VALUES(3,4,80);
INSERT INTO student_course VALUES(3,5,65);
INSERT INTO student_course VALUES(3,6,75);
INSERT INTO student_course VALUES(4,2,90);
INSERT INTO student_course VALUES(4,3,80);
INSERT INTO student_course VALUES(4,4,70);
INSERT INTO student_course VALUES(4,6,95);
INSERT INTO student_course VALUES(5,1,60);
INSERT INTO student_course VALUES(5,2,70);
INSERT INTO student_course VALUES(5,5,80);
INSERT INTO student_course VALUES(5,6,69);
INSERT INTO student_course VALUES(6,1,76);
INSERT INTO student_course VALUES(6,2,88);
INSERT INTO student_course VALUES(6,3,87);
INSERT INTO student_course VALUES(7,4,80);
INSERT INTO student_course VALUES(8,2,71);
INSERT INTO student_course VALUES(8,3,58);
INSERT INTO student_course VALUES(8,5,68);
INSERT INTO student_course VALUES(9,2,88);
INSERT INTO student_course VALUES(10,1,77);
INSERT INTO student_course VALUES(10,2,76);
INSERT INTO student_course VALUES(10,3,80);
INSERT INTO student_course VALUES(10,4,85);
INSERT INTO student_course VALUES(10,5,83);

