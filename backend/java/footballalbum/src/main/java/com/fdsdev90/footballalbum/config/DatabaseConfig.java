package com.fdsdev90.footballalbum.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig
{

    @Value("${database.server}")
    private String databaseServer;
    @Value("${database.url}")
    private String jdbcURL;
    @Value("${database.username}")
    private String userName;
    @Value("${database.password}")
    private String password;


    public void setDatabaseServer(String databaseServer)
    {
        this.databaseServer = databaseServer;
    }

    public String getDatabaseServer()
    {
        return databaseServer;
    }

    public void setJdbcURL(String jdbcURL)
    {
        this.jdbcURL = jdbcURL;
    }

    public String getJdbcURL()
    {
        return jdbcURL;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

}
