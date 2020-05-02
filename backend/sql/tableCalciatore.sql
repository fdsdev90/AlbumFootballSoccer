create table player
(
	id_player varchar(4),
	name_player varchar(50) not null,
	surname_player varchar(50) not null,
	birth varchar(50) not null,
	story text,
	
	immagine bytea,
	primary key(id_player)

);



