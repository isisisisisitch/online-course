drop table if exists `chapter`;
create table `chapter`
(
    `id`        char(8) not null comment 'ID',
    `course_id` char(8) comment 'course ID',
    `name`      varchar(50) comment 'course name',
    primary key (`id`)
) engine = innodb
  default charset = utf8mb4 comment ='chapter';

insert into `chapter` (id, course_id, name)
values ('00000000', '00000000', 'testChapter1');
insert into `chapter` (id, course_id, name)
values ('00000001', '00000000', 'testChapter2');


-- 小节
DROP TABLE IF EXISTS `section`;
CREATE TABLE `section` (
  `id` CHAR(8) NOT NULL DEFAULT '' COMMENT 'ID',
  `title` VARCHAR(50) NOT NULL COMMENT '标题',
  `course_id` CHAR(8) COMMENT '课程|course.id',
  `chapter_id` CHAR(8) COMMENT '大章|chapter.id',
  `video` VARCHAR(200) COMMENT '视频',
  `time` INT COMMENT '时长|单位秒',
  `charge` CHAR(1) COMMENT '收费|C 收费；F 免费',
  `sort` INT COMMENT '顺序',
  `created_at` DATETIME(3) COMMENT '创建时间',
  `updated_at` DATETIME(3) COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='小节';

INSERT INTO `section` (id, title, course_id, chapter_id, video, time, charge, sort, created_at, updated_at)
VALUES ('00000001', 'testSection1', '00000001', '00000000', '', 500, 'F', 1, now(), now());

# ---------------------- 测试

drop table if exists `test`;
create table `test`
(
    `id`   char(8) not null default '' comment 'id',
    `name` varchar(50),
    primary key (`id`)
) engine = innodb
  default charset = utf8mb4 comment ='test';

insert into `test` (id, name)
values (1, 'test1');
insert into `test` (id, name)
values (2, 'test2');