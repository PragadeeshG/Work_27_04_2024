create table if not exists documents(
doc_id integer not null,
author varchar(255) null,
date varchar(255) null,
constraint documents_pk primary key(doc_id));