package com.fdsdev90.footballalbum.config;

import com.fdsdev90.footballalbum.dao.FootballPlayerDAOInt;
import com.fdsdev90.footballalbum.model.FootballPlayerModel;

import java.util.Date;
import java.util.List;

public class DatabaseUser implements FootballPlayerDAOInt
{
    @Override
    public List<FootballPlayerModel> getPlayersByBirthDate(Date birthDate) {
        return null;
    }

    @Override
    public List<FootballPlayerModel> getPlayersByTeam(String team) {
        return null;
    }

    @Override
    public FootballPlayerModel getPlayerInfoGoals(int id) {
        return null;
    }

    @Override
    public FootballPlayerModel getAverageGoals(int id) {
        return null;
    }
}
