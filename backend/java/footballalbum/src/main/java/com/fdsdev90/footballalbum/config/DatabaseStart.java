package com.fdsdev90.footballalbum.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseStart
{

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

        }

    }


}
