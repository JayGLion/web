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
insert into board (seq, id, title, author, content) values (6, 6,'test', 'JayG', 'just test6');
insert into board (seq, id, title, author, content) values (7, 7,'test', 'JayG', 'just test7');
insert into board (seq, id, title, author, content) values (8, 8,'test', 'JayG', 'just test8');
insert into board (seq, id, title, author, content) values (9, 9,'test', 'JayG', 'just test9');
insert into board (seq, id, title, author, content) values (10, 10,'test', 'JayG', 'just test10');
insert into board (seq, id, title, author, content) values (11, 11,'test', 'JayG', 'just test11');
insert into board (seq, id, title, author, content) values (12, 12,'test', 'JayG', 'just test12');
insert into board (seq, id, title, author, content) values (13, 13,'test', 'JayG', 'just test13');
insert into board (seq, id, title, author, content) values (14, 14,'test', 'JayG', 'just test14');
insert into board (seq, id, title, author, content) values (15, 15,'test', 'JayG', 'just test15');
insert into board (seq, id, title, author, content) values (16, 16,'test', 'JayG', 'just test16');
insert into board (seq, id, title, author, content) values (17, 17,'test', 'JayG', 'just test17');
insert into board (seq, id, title, author, content) values (18, 18,'test', 'JayG', 'just test18');
insert into board (seq, id, title, author, content) values (19, 19,'test', 'JayG', 'just test19');
insert into board (seq, id, title, author, content) values (20, 20,'test', 'JayG', 'just test20');

select * from board;