CREATE DATABASE day03;

USE day03;

/*
   完成 省市的 一对多 关系实战
*/
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
# 建立 主外键关系
ALTER TABLE city ADD FOREIGN KEY (pid) REFERENCES province(pid);

/*
  多对多实战 
    演员 角色 多对多 
*/
-- 创建一个演员表
CREATE TABLE actor(
   aid INT PRIMARY KEY,
   aname VARCHAR(10)
);
-- 创建角色表 
CREATE TABLE role(
   rid INT PRIMARY KEY,
   rname VARCHAR(10)
);
-- 创建中间表
CREATE TABLE act_rol(
   aid INT,
   rid INT
);
-- 添加外键约束  
-- 让中间表主动与主表进行关联 也就是添加外键约束
ALTER TABLE act_rol ADD FOREIGN KEY (aid) REFERENCES actor(aid);

ALTER TABLE act_rol ADD FOREIGN KEY (rid) REFERENCES role(rid);

/*
   角色与 行为  多对多关系
*/
-- 创建一个行为表 
CREATE TABLE actions(
   aid INT PRIMARY KEY,
   aname VARCHAR(32)
);
-- 创建一个中间表  角色与行为
CREATE TABLE rol_act(
   aid INT,# 行为外键字段
   rid INT # 角色外键字段
);
-- 让中间表主动与主表进行关联 也就是添加外键约束
ALTER TABLE rol_act ADD FOREIGN KEY (aid) REFERENCES actions(aid);

ALTER TABLE rol_act ADD FOREIGN KEY (rid) REFERENCES role(rid);










