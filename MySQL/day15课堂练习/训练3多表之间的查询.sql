/*
-- 1、查询成绩大于70分的同学的名字

-- 2、查询所有同学的学号、姓名、选课数、总成绩

-- 3、查询学语文同学的姓名


*/
SELECT sname FROM students WHERE sscore > 70;

SELECT * FROM students;

SELECT sname FROM students WHERE discipline= '语文';


