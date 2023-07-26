drop table if exists `chapter`;
create table `chapter`
(
    `id`        char(8) not null comment 'ID',
    `course_id` char(8) comment 'course ID',
    `name`      varchar(50) comment 'course name',
    primary key (`id`)
) engine = innodb
  default charset = utf8mb4 comment ='chapter';

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