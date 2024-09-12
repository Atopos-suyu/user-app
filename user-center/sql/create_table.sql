# 数据库初始化
# @author <a href="https://github.com/Atopos-suyu">天一</a>
# @from <a href="https://apps.youkeda.com/">高校课程管理</a>

-- 创建库
create database if not exists yupi;

-- 切换库
use yupi;

# 用户表
create table user
(
    username     varchar(256)                       null comment '用户昵称',
    id           bigint auto_increment comment 'id'
        primary key,
    userAccount  varchar(256)                       null comment '账号',
    avatarUrl    varchar(1024)                      null comment '用户头像',
    gender       varchar(256)                             null comment '性别',
    userPassword varchar(512)                       not null comment '密码',
    phone        varchar(128)                       null comment '电话',
    email        varchar(512)                       null comment '邮箱',
    userStatus   int      default 0                 not null comment '状态 0 - 正常',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete     tinyint  default 0                 not null comment '是否删除',
    userRole     int      default 0                 not null comment '用户角色 0 - 普通用户 1 - 管理员',
    planetCode   varchar(512)                       null comment '星球编号'
)
    comment '用户';

# 课程表
create table course
(

    id           bigint auto_increment comment 'id'
        primary key,
    courseID        varchar(256)                       null comment '课程号',
    courseName      varchar(256)                       null comment '课程名称',
    credits         int                                not null comment '学分 ',
    courseType      varchar(128)                       null comment '课程类型',
    location      varchar(128)                       null comment '上课地点',
    courseStatus    int      default 0                 not null comment '活跃-0 已取消-1',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete     tinyint  default 0                 not null comment '是否删除',
    userRole     int      default 0                 not null comment '用户角色 0 - 普通用户 1 - 管理员',
    planetCode   varchar(512)                       null comment '星球编号'
)
    comment '课程表';

# 教师管理表
create table teacher
(

    id           bigint auto_increment comment 'id'    primary key,
    teacherID        varchar(256)                       null comment '教师编号',
    name      varchar(256)                       null comment '教师名称',
    gender         varchar(128)                                not null comment '性别',
    title      varchar(128)                       null comment '职称',
    phoneNumber      varchar(128)                       null comment '电话号码',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete     tinyint  default 0                 not null comment '是否删除',
    userRole     int      default 0                 not null comment '用户角色 0 - 普通用户 1 - 管理员'
)
    comment '教师 管理表';

# 学生管理表
create table student
(

    id           bigint auto_increment comment 'id'    primary key,
    studentID        varchar(256)                       null comment '学号',
    studentName      varchar(256)                       null comment '姓名',
    gender          varchar(128)                              not null comment '性别 ',
    department      varchar(128)                       null comment '院系',
    grade      varchar(128)                       null comment '年级',
    major     varchar(128)                     not null comment '专业',
    studentClass     varchar(128)                     not null comment '班级',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete     tinyint  default 0                 not null comment '是否删除'
)
    comment '学生管理表';

# 成绩单表
create table collect
(

    id           bigint auto_increment comment 'id'
        primary key,
    studentID        varchar(256)                       null comment '学号',
    courseID      varchar(256)                       null comment '课程编号',
    semester         varchar(128)                     not null comment '学期 ',
    score         varchar(128)                       null comment '成绩',
    teacherID      varchar(128)                       null comment '任课教师编号',
    department      varchar(128)      default 0                 not null comment '开课学院',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete     tinyint  default 0                 not null comment '是否删除'
)
    comment '成绩单表';