package com.fdsdev90.footballalbum.config;

import com.fdsdev90.footballalbum.dao.FootballPlayerDAOInt;
import com.fdsdev90.footballalbum.model.FootballPlayerModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

//WARNING: IN THIS EXAMPLE ALL THE QUERIES ARE VULNERABLE TO SQL INJECTION!!
public class DatabaseUser implements FootballPlayerDAOInt
{
    @Override
    public List<FootballPlayerModel> getPlayersByBirthDate(Date birthDate) {
        return null;
    }

    @Override
    public List<FootballPlayerModel> getPlayersByTeam(String team) {
        DatabaseStart databaseStart = new DatabaseStart();

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

    @Override
    public FootballPlayerModel getPlayerByName(String name) throws SQLException
    {
        DatabaseStart databaseStart = new DatabaseStart();
        Connection connection = databaseStart.getConnection();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select name,surname from footballplayers where name='"+name+"';");

        FootballPlayerModel footballPlayerModel = new FootballPlayerModel();

        footballPlayerModel.setName(resultSet.getString("name"));
        footballPlayerModel.setSurname(resultSet.getString("surname"));

        resultSet.close();
        statement.close();
        connection.close();

        return footballPlayerModel;
    }
}
