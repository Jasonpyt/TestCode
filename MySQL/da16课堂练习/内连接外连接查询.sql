##隐式查询

# 交叉查询  可以将两张表 合到一起 错误的
SELECT * FROM category,products;##会发现所有信息都显示了但是会出先归错类的轻狂

# 使用显示内连接查询 两张表相关数据
SELECT * FROM category c INNER JOIN products p ON c.cid = p.category_id;##显示内连接查询

#只查看家电 的商品信息
# 隐式内连接
SELECT * FROM category c , products p WHERE c.cid = p.category_id AND c.cname = '家电';

# 显示内连接
SELECT * FROM category c INNER JOIN products p ON c.cid = p.category_id WHERE c.cname = '服饰';


# 使用左外连接查询 两张表
SELECT * FROM category c LEFT OUTER JOIN products p ON c.cid=p.category_id;
SELECT * FROM category c RIGHT OUTER JOIN products p ON c.cid = p.category_id;

# 查询一下 商品价格最高的 商品信息
SELECT MAX(price) FROM products;

# 如果一条sql语句的结果是一个单值  我们就可以将这个单值当做条件看待
SELECT*FROM products WHERE price=(SELECT MAX(price)FROM products);



# 查询 分类名为 服饰的 所有商品信息
# 外连接完成

SELECT p.* FROM category c INNER JOIN products p ON c.cid = p.category_id WHERE c.cname = '服饰';


# 查询 分类名为 服饰的 所有商品信息
# 内连接完成

SELECT p.* FROM category c ,products p WHERE c.cid = p.category_id AND c.cname = '家电';



# 子查询怎么做？

SELECT * FROM products WHERE category_id=(SELECT cid FROM category WHERE cname='服饰');


