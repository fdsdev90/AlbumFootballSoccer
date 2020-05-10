package com.fdsdev90.footballalbum.dao;

import com.fdsdev90.footballalbum.model.FootballPlayerModel;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface FootballPlayerDAOInt
{

    List<FootballPlayerModel> getPlayersByBirthDate(Date birthDate);
    List<FootballPlayerModel> getPlayersByTeam(String team);

    FootballPlayerModel getPlayerInfoGoals(int id);
    FootballPlayerModel getAverageGoals(int id);

    FootballPlayerModel getPlayerByName(String name) throws SQLException;

}
