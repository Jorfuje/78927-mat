create database if not exists saludos;
use saludos;
create user if not exists 'yo'@'%'identified by '3141';
grant all privileges on saludos.* to 'yo'@'%';
flush privileges;
