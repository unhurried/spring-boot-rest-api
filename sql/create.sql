DROP DATABASE IF EXISTS api;
CREATE DATABASE api CHARACTER SET utf8;
DROP USER IF EXISTS 'user'@'localhost';
GRANT ALL PRIVILEGES ON api.* TO 'user'@'localhost' IDENTIFIED BY 'password';
FLUSH PRIVILEGES;
DROP table IF EXISTS api.todo;
CREATE TABLE api.todo (
  `id` bigint(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `title` varchar(128) DEFAULT NULL,
  `content` text,
  `date` date DEFAULT NULL
);