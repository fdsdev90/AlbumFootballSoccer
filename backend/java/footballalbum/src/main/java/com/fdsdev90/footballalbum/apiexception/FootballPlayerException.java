package com.fdsdev90.footballalbum.apiexception;

public class FootballPlayerException extends Exception
{
   private final String message;
   private final String error;

    public FootballPlayerException(String message, String error)
    {
        this.message = message;
        this.error = error;
    }


    @Override
    public String getMessage()
    {
        return message;
    }

    public String getError()
    {
        return error;
    }

}
