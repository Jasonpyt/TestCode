##创建商品表

##选择数据库

USE mydb;
##新建表
CREATE TABLE product(
pid INT PRIMARY KEY,
pname VARCHAR(20),
price DOUBLE,
category_id VARCHAR(32)
);

##向表中添加数据
INSERT INTO product(pid,pname,price,category_id) VALUES (1,'联想',5000,'C001');
INSERT INTO product(pid,pname,price,category_id) VALUES (2,'海尔',3000,'c001');
INSERT INTO product(pid,pname,price,category_id) VALUES (3,'雷神',5000,'c001');
INSERT INTO product(pid,pname,price,category_id) VALUES (4,'JACK JONES',800,'c001');
INSERT INTO product(pid,pname,price,category_id) VALUES (5,'真维斯',200,'c002');
INSERT INTO product(pid,pname,price,category_id) VALUES (6,'花花公子',440,'c002');
INSERT INTO product(pid,pname,price,category_id) VALUES(7,'劲霸',2000,'c002');
INSERT INTO product(pid,pname,price,category_id) VALUES(8,'香奈儿',800,'c003');
INSERT INTO product(pid,pname,price,category_id) VALUES(9,'相宜本草',200,'c003');
INSERT INTO product(pid,pname,price,category_id) VALUES(10,'面霸',5,'c003');
INSERT INTO product(pid,pname,price,category_id) VALUES(11,'好想你枣',56,'c004');
INSERT INTO product(pid,pname,price,category_id) VALUES(12,'香飘飘奶茶',1,'c005');
INSERT INTO product(pid,pname,price,category_id) VALUES(13,'果9',1,NULL);

##查询所有商品
SELECT FROM  product; 

##查询商品名和商品价格
SELECT pname,price FROM product;

##别名查询,使用的关键字是as(as可以省略).表别名
SELECT * FROM product AS p;

##别名查询.使用的关键字是as（as可以省略的）.列别名:
SELECT pname AS pn FROM product;

##去重复查询
SELECT DISTINCT price FROM product;

###查询结果是表达式（运算查询）：将所有商品的价格+10元进行显示.
SELECT pname,price+10 FROM product;

#查询商品名称为“花花公子”的商品所有信息：
SELECT * FROM product WHERE pname = '花花公子';

#查询价格为800商品
SELECT * FROM product WHERE price = 800;

##查询价格不为800商品
SELECT * FROM product WHERE price != 800;
SELECT * FROM product WHERE price <> 800;
SELECT * FROM product WHERE  NOT(price = 800);

#查询商品价格大于60元的所有商品信息
SELECT * FROM product WHERE price > 60;

###查询商品价格在200到1000之间所有商品
SELECT * FROM product WHERE price > 200 AND price <= 1000;
SELECT * FROM product WHERE  price BETWEEN 200 AND 1000;

##查询商品价格是200或800的所有商品
SELECT * FROM product WHERE price = 200 OR price = 800;
SELECT * FROM product WHERE price IN(200,800);

#查询含有'霸'字的所有商品
SELECT * FROM product WHERE pname LIKE '%霸%';

#查询以'香'开头的所有商品
SELECT * FROM product WHERE pname LIKE '香%';

#查询第二个字为'想'的所有商品
SELECT * FROM product WHERE pname LIKE '_想%';

#商品没有分类的商品
SELECT * FROM product WHERE category_id IS NULL;

#查询有分类的商品
SELECT * FROM product  WHERE category_id IS NOT NULL;



##通过order by语句，可以将查询出的结果进行排序。暂时放置在select语句的最后
SELECT * FROM product ORDER BY price DESC;##降序
SELECT * FROM product ORDER BY price ASC ;##升序

#在价格排序(降序)的基础上，以分类排序(降序)
SELECT * FROM  product ORDER BY price DESC ,category_id DESC; 

#显示商品的价格(去重复)，并排序(降序)
SELECT DISTINCT price FROM product ORDER BY price DESC ;



##聚合查询

##查询商品的总条数
SELECT COUNT(*) FROM product;

###查询价格大于200商品的总条数
SELECT COUNT(*) FROM product WHERE price > 200;

##查询分类为'c001'的所有商品的总和
SELECT SUM(price) FROM product WHERE category_id = 'c001';

#查询分类为'c002'所有商品的平均价格
SELECT AVG(price) FROM product WHERE category_id = 'c002';

##查询商品的最大价格和最小价格
SELECT MIN(price),MAX(price) FROM product;

#统计各个分类商品的个数
SELECT category_id ,COUNT(*)FROM product GROUP BY category_id;

#统计各个分类商品的个数,且只显示个数大于1的信息
SELECT category_id ,COUNT(*) FROM product GROUP BY category_id HAVING COUNT(*) > 1;


