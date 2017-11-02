-- ## user, user_group, user_by_user_group, menu, menu_by_user_group ##
-- user

create table user(
		userId varchar(20) not null,
		userName varchar(40) not null,
		password varchar(100) not null,
		role varchar(20),
);

alter table user add constraint idx_user_pk primary key (userId);

-- user_group

create table user_group(
		userGroupSeq numeric(2) not null,
		userGroupName varchar(30) not null,
		Description varchar(50)
);

alter table user_group add constraint idx_user_group_pk primary key (userGroupSeq);

-- user_by_user_group

create table user_by_user_group(
		userGroupSeq numeric(2) not null,
		userId varchar(10) not null
);

alter table user_by_user_group add constraint idx_user_by_user_group_pk primary key (userGroupSeq, userId);
alter table user_by_user_group add constraint idx_user_by_user_group_fk0 foreign key (userId) references user (userId);
alter table user_by_user_group add constraint idx_user_by_user_group_fk1 foreign key (userGroupSeq) references user_group (userGroupSeq);

-- menu
        
create table menu(
		menuSeq numeric(3) not null,
		menuName varchar(50) not null,
		menuLevel numeric(1) not null,
		sortOrder numeric(2) not null,
		upperMenuSeq numeric(3) not null,
		url varchar(100)
);

alter table menu add constraint idx_menu_pk primary key (menuSeq);

-- menu_by_user_group

create table menu_by_user_group(
		userGroupSeq numeric(2) not null,
		menuSeq numeric(3) not null
);

alter table menu_by_user_group add constraint idx_menu_by_user_group_pk primary key (menuSeq, userGroupSeq);
alter table menu_by_user_group add constraint idx_menu_by_user_group_fk0 foreign key (menuSeq) references menu (menuSeq);
alter table menu_by_user_group add constraint idx_menu_by_user_group_fk1 foreign key (userGroupSeq) references user_group (userGroupSeq);
