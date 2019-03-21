/*
	完成 省市的一对多关系实战
*/

USE day03;
SELECT DATABASE();
-- 创建省份表 主表
CREATE TABLE province(
   pid VARCHAR(6) PRIMARY KEY,
   pname VARCHAR(32),
   pdesc VARCHAR(200) 
);
-- 创建城市表 从表
CREATE TABLE city(
   cid VARCHAR(6) PRIMARY KEY,
   cname VARCHAR(32),
   cdesc VARCHAR(200),
   pid VARCHAR(6) NOT NULL # 声明出外键字段
);
##建立 主外键关系
ALTER TABLE city ADD FOREIGN KEY city(pid) REFERENCES province(pid);
