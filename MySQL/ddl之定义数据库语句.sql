##DDL之创建数据库
CREATE DATABASE mydb;

##查看所有数据
SHOW DATABASES;

##查看某个数据库定义信息
SHOW CREATE DATABASE mydb;

##创建一个使用指定编码集的数据库
CREATE DATABASE mydb2 CHARSET gbk;

##显示mydb2的数据库信息
SHOW CREATE DATABASE mydb2;

##删除数据库
DROP DATABASE mydb2;

##查看正在使用的数据库
SELECT DATABASE();

##切换数据库
USER mysql;
SHOW CREATE DATABASE mysql;

