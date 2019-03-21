USE day03;
SELECT DATABASE();

##分类表
CREATE TABLE category(
	cid VARCHAR(32)PRIMARY KEY,
	cname VARCHAR(50)
);

##商品表
CREATE TABLE products(
	pid VARCHAR(32)PRIMARY KEY,
	pname VARCHAR(50),
	price INT,
	flag VARCHAR(2),#标记是否上架
	category_id VARCHAR(32),
	CONSTRAINT products_fk FOREIGN KEY (category_id)REFERENCES category(cid)
);


##初始化数据
#分类
INSERT INTO category(cid,cname)VALUES('c001','家电');
INSERT INTO category(cid,cname)VALUES('c002','服饰');
INSERT INTO category(cid,cname)VALUES('c003','化妆品');


#商品
INSERT INTO products(pid, pname,price,flag,category_id) VALUES('p001','联想',5000,'1','c001');
INSERT INTO products(pid, pname,price,flag,category_id) VALUES('p002','海尔',3000,'1','c001');
INSERT INTO products(pid, pname,price,flag,category_id) VALUES('p003','雷神',5000,'1','c001');
INSERT INTO products (pid, pname,price,flag,category_id) VALUES('p004','JACK
JONES',800,'1','c002');
INSERT INTO products (pid, pname,price,flag,category_id) VALUES('p005','真维斯',200,'1','c002');
INSERT INTO products (pid, pname,price,flag,category_id) VALUES('p006','花花公
子',440,'1','c002');
INSERT INTO products (pid, pname,price,flag,category_id) VALUES('p007','劲霸',2000,'1','c002');
INSERT INTO products (pid, pname,price,flag,category_id) VALUES('p008','香奈儿',800,'1','c003');
INSERT INTO products (pid, pname,price,flag,category_id) VALUES('p009','相宜本
草',200,'1','c003');




##查询那些分类的商品已经上架
SELECT DISTINCT c.cname
FROM category c,products p
WHERE c.cid = p.category_id AND p.flag = '1'; 


SELECT DISTINCT c.cname
FROM category c INNER JOIN products p
ON c.cid = p.category_id
WHERE p.flag = '1';