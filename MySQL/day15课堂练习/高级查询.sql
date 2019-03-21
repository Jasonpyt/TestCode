USE mydb;
SELECT DATABASE ();

##创建分类表
CREATE TABLE category(
cid VARCHAR(32) PRIMARY KEY,
cname VARCHAR(100)
);

#商品表
CREATE TABLE products(
pid VARCHAR(32)PRIMARY KEY,
cname VARCHAR(40),
price DOUBLE

);

##添加外键字段
ALTER TABLE products ADD COLUMN category_id VARCHAR(30);

##添加约束
ALTER TABLE products ADD CONSTRAINT product_fk FOREIGN KEY (category_id)REFERENCES category(cid);