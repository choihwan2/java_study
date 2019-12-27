--테이블 생성문
create table users(
	user_id varchar2(20) CONSTRAINT PK_USERS PRIMARY KEY,
	user_pw varchar2(20) NOT NULL
);
--회원 등록 sql 구문
insert into users (user_id, user_pw) values ('id', 'pw');
--jdbc 환경 sql구문
--insert into users (user_id, user_pw) values (?, ?);
--로그인 sql 구문
select * from users
where user_id = 'id' and user_pw = 'pw';
--jdbc 환경 로그인 sql구문
--select * from users where user_id = ? and user_pw = ?;