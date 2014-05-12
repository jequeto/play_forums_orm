# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table connection (
  id                        bigint auto_increment not null,
  init_date_time            datetime,
  close_date_time           datetime,
  user_id                   bigint,
  constraint pk_connection primary key (id))
;

create table forum (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  description               varchar(255),
  creation_date             datetime,
  creator_user_id           bigint,
  constraint uq_forum_name unique (name),
  constraint pk_forum primary key (id))
;

create table message (
  id                        bigint auto_increment not null,
  text                      varchar(255) not null,
  creation_date             datetime,
  theme_id                  bigint,
  user_id                   bigint,
  constraint pk_message primary key (id))
;

create table permission (
  id                        bigint auto_increment not null,
  name                      varchar(255) not null,
  constraint uq_permission_name unique (name),
  constraint pk_permission primary key (id))
;

create table role (
  id                        bigint auto_increment not null,
  name                      varchar(255) not null,
  constraint uq_role_name unique (name),
  constraint pk_role primary key (id))
;

create table theme (
  id                        bigint auto_increment not null,
  name                      varchar(255) not null,
  creation_date             datetime,
  forum_id                  bigint,
  user_id                   bigint,
  constraint uq_theme_name unique (name),
  constraint pk_theme primary key (id))
;

create table user (
  id                        bigint auto_increment not null,
  name                      varchar(255) not null,
  password                  varchar(255),
  email                     varchar(255) not null,
  creation_date             datetime,
  constraint uq_user_name unique (name),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id))
;


create table forum_user (
  forum_id                       bigint not null,
  user_id                        bigint not null,
  constraint pk_forum_user primary key (forum_id, user_id))
;

create table role_permission (
  role_id                        bigint not null,
  permission_id                  bigint not null,
  constraint pk_role_permission primary key (role_id, permission_id))
;
alter table connection add constraint fk_connection_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_connection_user_1 on connection (user_id);
alter table forum add constraint fk_forum_creatorUser_2 foreign key (creator_user_id) references user (id) on delete restrict on update restrict;
create index ix_forum_creatorUser_2 on forum (creator_user_id);
alter table message add constraint fk_message_theme_3 foreign key (theme_id) references theme (id) on delete restrict on update restrict;
create index ix_message_theme_3 on message (theme_id);
alter table message add constraint fk_message_user_4 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_message_user_4 on message (user_id);
alter table theme add constraint fk_theme_forum_5 foreign key (forum_id) references forum (id) on delete restrict on update restrict;
create index ix_theme_forum_5 on theme (forum_id);
alter table theme add constraint fk_theme_user_6 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_theme_user_6 on theme (user_id);



alter table forum_user add constraint fk_forum_user_forum_01 foreign key (forum_id) references forum (id) on delete restrict on update restrict;

alter table forum_user add constraint fk_forum_user_user_02 foreign key (user_id) references user (id) on delete restrict on update restrict;

alter table role_permission add constraint fk_role_permission_role_01 foreign key (role_id) references role (id) on delete restrict on update restrict;

alter table role_permission add constraint fk_role_permission_permission_02 foreign key (permission_id) references permission (id) on delete restrict on update restrict;

# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table connection;

drop table forum;

drop table forum_user;

drop table message;

drop table permission;

drop table role;

drop table role_permission;

drop table theme;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

