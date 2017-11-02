CREATE TABLE BOARD (
	SEQ INTEGER PRIMARY KEY AUTO_INCREMENT,
	ID INTEGER,
	TITLE VARCHAR(20) NOT NULL,
	AUTHOR VARCHAR(20) NOT NULL,
	CONTENT VARCHAR(300)
); 

insert into board (seq, id, title, author, content) values (1, 1,'test', 'JayG', 'just test1');
insert into board (seq, id, title, author, content) values (2, 2,'test', 'JayG', 'just test2');
insert into board (seq, id, title, author, content) values (3, 3,'test', 'JayG', 'just test3');
insert into board (seq, id, title, author, content) values (4, 4,'test', 'JayG', 'just test4');
insert into board (seq, id, title, author, content) values (5, 5,'test', 'JayG', 'just test5');

select * from board;