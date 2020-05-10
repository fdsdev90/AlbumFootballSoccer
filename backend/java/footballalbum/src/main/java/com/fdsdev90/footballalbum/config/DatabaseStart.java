package com.fdsdev90.footballalbum.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseStart
{
    private Connection connection;

    static
    {
        DatabaseConfig databaseConfig = new DatabaseConfig();
        Connection connection = null;

        try
        {
            connection = DriverManager.getConnection(databaseConfig.getJdbcURL(),databaseConfig.getUserName(),databaseConfig.getPassword());
        }
        catch(Exception e)
        {
            System.out.println("[ERROR] Can not connect to the db");
        }

    }

    public void setConnection(Connection connection)
    {
        this.connection = connection;
    }

    public Connection getConnection()
    {
        return connection;
    }

}
