package com.fdsdev90.footballalbum.service;

import com.fdsdev90.footballalbum.config.DatabaseUser;
import com.fdsdev90.footballalbum.model.FootballPlayerModel;

public class FootballPlayerService
{

    public FootballPlayerModel getPlayerInfo(String name)
    {
        DatabaseUser databaseUser = new DatabaseUser();
        databaseUser.getPlayerByName(name);
        return null;
    }

}
