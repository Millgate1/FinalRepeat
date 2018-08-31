# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  add_id                        bigint auto_increment not null,
  add_name                      varchar(255),
  eir_code                      varchar(255),
  constraint pk_address primary key (add_id)
);

create table cv (
  cv_id                         bigint auto_increment not null,
  cv_name                       varchar(255),
  objective                     varchar(255),
  education                     varchar(255),
  work_experience               varchar(255),
  constraint pk_cv primary key (cv_id)
);

create table client (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  address_add_id                bigint,
  cv_cv_id                      bigint,
  constraint uq_client_address_add_id unique (address_add_id),
  constraint uq_client_cv_cv_id unique (cv_cv_id),
  constraint pk_client primary key (id)
);

create table job (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  company                       varchar(255),
  agency_id                     bigint,
  location                      varchar(255),
  constraint pk_job primary key (id)
);

create table recruit_agency (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_recruit_agency primary key (id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table client add constraint fk_client_address_add_id foreign key (address_add_id) references address (add_id) on delete restrict on update restrict;

alter table client add constraint fk_client_cv_cv_id foreign key (cv_cv_id) references cv (cv_id) on delete restrict on update restrict;

alter table job add constraint fk_job_agency_id foreign key (agency_id) references recruit_agency (id) on delete restrict on update restrict;
create index ix_job_agency_id on job (agency_id);


# --- !Downs

alter table client drop constraint if exists fk_client_address_add_id;

alter table client drop constraint if exists fk_client_cv_cv_id;

alter table job drop constraint if exists fk_job_agency_id;
drop index if exists ix_job_agency_id;

drop table if exists address;

drop table if exists cv;

drop table if exists client;

drop table if exists job;

drop table if exists recruit_agency;

drop table if exists user;

