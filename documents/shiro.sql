create database shiro DEFAULT CHARSET utf8;

use shiro;

/**
  md5("password")
  user1   123456
  user2   123456

  user1   654321
  user2   654321

  salt值
  user1 user1@126.com
  user2 user2@126.com


  md5("password+salt")

 */

CREATE TABLE users(
  id INT PRIMARY KEY auto_increment,
  username VARCHAR(100),
  password VARCHAR(100),
  password_salt VARCHAR(100)
);

CREATE TABLE user_roles(
  username VARCHAR(100),
  role_name VARCHAR(100)
);

CREATE TABLE roles_permissions(
  role_name VARCHAR(100),
  permission VARCHAR(200)
);