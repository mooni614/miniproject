# CREATE DATABASE if not exists towncafe;


use towncafe;


delete
from towncafe.reviewboard;

delete
from towncafe.bookmark;

delete
from towncafe.category;

delete
from towncafe.userInfo;

delete
from towncafe.reply;


alter table towncafe.userInfo
    auto_increment = 1;

alter table towncafe.reviewboard
    auto_increment = 1;

alter table towncafe.bookmark
    auto_increment = 1;

alter table towncafe.category
    auto_increment = 1;

alter table towncafe.reply
    auto_increment = 1;


CREATE TABLE if not exists `userInfo`
(
    `user_id`       int NOT NULL primary key auto_increment,
    `id`   varchar(255) NOT NULL,
    `user_name`     varchar(255) NOT NULL,
    `user_password` varchar(255) NOT NULL,
    `user_gender`    varchar(255) NOT NULL,
    `user_phone`   varchar(255)  NOT NULL,
    `user_email`     varchar(255)    NOT NULL


    );




CREATE TABLE if not exists `reviewboard`
(
    `review_id`       int NOT NULL primary key auto_increment,
    `review_title`   varchar(255) NOT NULL,
    `review_content`     varchar(1000) NOT NULL,
    `review_picture` varchar(255) NOT NULL,
    `review_date`    date NULL,
    `review_count`   int  NOT NULL,
    `user_id`     int        NOT NULL,
    `review_grade`     int  NULL,
    `review_hashtag`      varchar(255) NULL

    );



CREATE TABLE if not exists `bookmark`
(
    `bm_id`       int NOT NULL primary key auto_increment,
    `bm_storename`   varchar(255) NOT NULL,
    `bm_memo`     varchar(1000) NOT NULL,
    `user_id` int NOT NULL,
    `bm_address`    varchar(255) NOT NULL,
    `bmx`   int NOT NULL,
    `bmy`     int        NOT NULL,
    `cate_id`     int NOT NULL


    );


CREATE TABLE if not exists `category`
(
    `cate_id`       int NOT NULL primary key auto_increment,
    `cate_name`   varchar(255) NOT NULL,
    `user_id` int NOT NULL

    );




CREATE TABLE if not exists `reply`
(
    `reply_id` int NOT NULL primary key auto_increment,
    `reply_content`   varchar(1000) NOT NULL,
    `reply_date` date NOT NULL,
    `user_id` int NOT NULL,
    `review_id` int NOT NULL

    );


