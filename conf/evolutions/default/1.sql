# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table connection (
  id                        bigint not null,
  init_date                 timestamp,
  close_date                timestamp,
  user_id                   bigint,
  constraint pk_connection primary key (id))
;

create table forum (
  id                        bigint not null,
  name                      varchar(255),
  description               varchar(255),
  creation_date             timestamp,
  user_id                   bigint,
  constraint pk_forum primary key (id))
;

create table message (
  id                        bigint not null,
  text                      varchar(255),
  creation_date             timestamp,
  theme_id                  bigint,
  user_id                   bigint,
  constraint pk_message primary key (id))
;

create table theme (
  id                        bigint not null,
  name                      varchar(255),
  creation_date             timestamp,
  forum_id                  bigint,
  user_id                   bigint,
  constraint pk_theme primary key (id))
;

create table user (
  id                        bigint not null,
  name                      varchar(255),
  password                  varchar(255),
  email                     varchar(255),
  creation_date             timestamp,
  constraint pk_user primary key (id))
;

create sequence connection_seq;

create sequence forum_seq;

create sequence message_seq;

create sequence theme_seq;

create sequence user_seq;

alter table connection add constraint fk_connection_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_connection_user_1 on connection (user_id);
alter table forum add constraint fk_forum_user_2 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_forum_user_2 on forum (user_id);
alter table message add constraint fk_message_theme_3 foreign key (theme_id) references theme (id) on delete restrict on update restrict;
create index ix_message_theme_3 on message (theme_id);
alter table message add constraint fk_message_user_4 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_message_user_4 on message (user_id);
alter table theme add constraint fk_theme_forum_5 foreign key (forum_id) references forum (id) on delete restrict on update restrict;
create index ix_theme_forum_5 on theme (forum_id);
alter table theme add constraint fk_theme_user_6 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_theme_user_6 on theme (user_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists connection;

drop table if exists forum;

drop table if exists message;

drop table if exists theme;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists connection_seq;

drop sequence if exists forum_seq;

drop sequence if exists message_seq;

drop sequence if exists theme_seq;

drop sequence if exists user_seq;

