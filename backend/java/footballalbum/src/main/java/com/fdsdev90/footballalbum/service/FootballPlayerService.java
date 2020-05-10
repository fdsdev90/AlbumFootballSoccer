package com.fdsdev90.footballalbum.service;

import com.fdsdev90.footballalbum.config.DatabaseUser;
import com.fdsdev90.footballalbum.model.FootballPlayerModel;

import java.sql.SQLException;

public class FootballPlayerService
{

    public FootballPlayerModel getPlayerInfo(String name) throws SQLException
    {
        DatabaseUser databaseUser = new DatabaseUser();
        FootballPlayerModel footballPlayerModel = databaseUser.getPlayerByName(name);

        return footballPlayerModel;
    }

}
