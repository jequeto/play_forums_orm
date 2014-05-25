# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table connection (
  id                        bigint not null,
  init_date_time            timestamp,
  close_date_time           timestamp,
  user_id                   bigint,
  constraint pk_connection primary key (id))
;

create table forum (
  id                        bigint not null,
  name                      varchar(255),
  description               varchar(255),
  creation_date             timestamp,
  creator_user_id           bigint,
  version                   bigint not null,
  constraint uq_forum_name unique (name),
  constraint pk_forum primary key (id))
;

create table message (
  id                        bigint not null,
  text                      varchar(255) not null,
  creation_date             timestamp,
  theme_id                  bigint,
  creator_user_id           bigint,
  version                   bigint not null,
  constraint pk_message primary key (id))
;

create table permission (
  id                        bigint not null,
  name                      varchar(255) not null,
  version                   bigint not null,
  constraint uq_permission_name unique (name),
  constraint pk_permission primary key (id))
;

create table role (
  id                        bigint not null,
  name                      varchar(255) not null,
  version                   bigint not null,
  constraint uq_role_name unique (name),
  constraint pk_role primary key (id))
;

create table theme (
  id                        bigint not null,
  name                      varchar(255) not null,
  creation_date             timestamp,
  forum_id                  bigint,
  creator_user_id           bigint,
  version                   bigint not null,
  constraint uq_theme_name unique (name),
  constraint pk_theme primary key (id))
;

create table user (
  id                        bigint not null,
  name                      varchar(255) not null,
  password                  varchar(255),
  email                     varchar(255) not null,
  creation_date             timestamp,
  version                   bigint not null,
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

create table user_role (
  user_id                        bigint not null,
  role_id                        bigint not null,
  constraint pk_user_role primary key (user_id, role_id))
;
create sequence connection_seq;

create sequence forum_seq;

create sequence message_seq;

create sequence permission_seq;

create sequence role_seq;

create sequence theme_seq;

create sequence user_seq;

alter table connection add constraint fk_connection_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_connection_user_1 on connection (user_id);
alter table forum add constraint fk_forum_creatorUser_2 foreign key (creator_user_id) references user (id) on delete restrict on update restrict;
create index ix_forum_creatorUser_2 on forum (creator_user_id);
alter table message add constraint fk_message_theme_3 foreign key (theme_id) references theme (id) on delete restrict on update restrict;
create index ix_message_theme_3 on message (theme_id);
alter table message add constraint fk_message_creatorUser_4 foreign key (creator_user_id) references user (id) on delete restrict on update restrict;
create index ix_message_creatorUser_4 on message (creator_user_id);
alter table theme add constraint fk_theme_forum_5 foreign key (forum_id) references forum (id) on delete restrict on update restrict;
create index ix_theme_forum_5 on theme (forum_id);
alter table theme add constraint fk_theme_creatorUser_6 foreign key (creator_user_id) references user (id) on delete restrict on update restrict;
create index ix_theme_creatorUser_6 on theme (creator_user_id);



alter table forum_user add constraint fk_forum_user_forum_01 foreign key (forum_id) references forum (id) on delete restrict on update restrict;

alter table forum_user add constraint fk_forum_user_user_02 foreign key (user_id) references user (id) on delete restrict on update restrict;

alter table role_permission add constraint fk_role_permission_role_01 foreign key (role_id) references role (id) on delete restrict on update restrict;

alter table role_permission add constraint fk_role_permission_permission_02 foreign key (permission_id) references permission (id) on delete restrict on update restrict;

alter table user_role add constraint fk_user_role_user_01 foreign key (user_id) references user (id) on delete restrict on update restrict;

alter table user_role add constraint fk_user_role_role_02 foreign key (role_id) references role (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists connection;

drop table if exists forum;

drop table if exists forum_user;

drop table if exists message;

drop table if exists permission;

drop table if exists role;

drop table if exists role_permission;

drop table if exists theme;

drop table if exists user;

drop table if exists user_role;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists connection_seq;

drop sequence if exists forum_seq;

drop sequence if exists message_seq;

drop sequence if exists permission_seq;

drop sequence if exists role_seq;

drop sequence if exists theme_seq;

drop sequence if exists user_seq;

