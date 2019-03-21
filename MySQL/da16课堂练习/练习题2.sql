USE day03;

#1)、用户信息表：
  CREATE TABLE USER (
    id INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(10),
    pwd VARCHAR(32)
  );

  # 添加三个员工，Jack是员工，Rose是经理，NewBoy是总经理
  INSERT INTO USER (NAME,pwd) VALUES ('Jack', '111');
  INSERT INTO USER (NAME,pwd) VALUES ('Rose', '222');
  INSERT INTO USER (NAME,pwd) VALUES ('NewBoy', '333');

  #2)、角色表：
  CREATE TABLE role (
    id INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(10)
  );
  # 添加三种角色
  INSERT INTO role(NAME) VALUES('总经理'),('经理'),('员工');

  #3)、权限表　
  CREATE TABLE Privilege (
    id INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(10)
  );

  # 添加三种权限
  # 员工：请假
  # 部门经理：请假，审批请假
  # 总经理：请假，审批请假，辞退员工
  INSERT INTO Privilege (NAME) VALUES ('请假'),('审批请假'),('辞退员工');
  
 # 4)、用户与角色关系表
  CREATE TABLE user_role (
    user_id INT ,
    role_id INT,
    PRIMARY KEY(user_id, role_id),   -- 联合主键
    FOREIGN KEY (user_id) REFERENCES USER(id),
    FOREIGN KEY (role_id) REFERENCES role(id)
  );

  # 用户分配角色：1号员工是3号角色，2号员工是2，3号角色，3号员工是1，2号角色
  INSERT INTO user_role VALUES(1,3),(2,3),(2,2),(3,1),(3,2); 

  #5)、角色与权限关系表
  CREATE TABLE role_Privilege (
    role_id INT ,
    Privilege_id INT,
    PRIMARY KEY(role_id, Privilege_id),   -- 联合主键
    
    FOREIGN KEY (role_id) REFERENCES role(id),
    FOREIGN KEY (Privilege_id) REFERENCES Privilege(id)
  );

  #权限与角色的关系，1号角色有3种权限，2号角色有2种权限，3号角色有1种权限
  INSERT INTO role_Privilege VALUES (1,1),(1,2),(1,3),(2,1),(2,2),(3,1);

 # 6)、查询指定用户有哪些权限　　
    # 分别查询Jack、Rose、NewBoy登录以后有哪些权限
    # 去掉重复的
    SELECT
      DISTINCT(Privilege.name) 权限
    FROM role_Privilege 
       INNER JOIN role       
       INNER JOIN Privilege      
       INNER JOIN user_role
       INNER JOIN USER 
        ON (user_role.user_id = user.id) 
        AND (user_role.role_id = role.id) 
        AND (role_Privilege.role_id = role.id) 
        AND (role_Privilege.Privilege_id = Privilege.id)
    WHERE user.name = 'NewBoy';

