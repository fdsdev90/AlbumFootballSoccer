create table player_team
(
	
	id_player varchar(4),
	id_team integer,
	
	foreign key(id_player) references calciatore(id_player),
	foreign key(id_team) references team(id_team)

)

