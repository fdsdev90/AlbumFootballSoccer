package com.fdsdev90.footballalbum.model;

import java.util.Date;

public class FootballPlayerModel
{

    private String name;
    private String surname;

    private Date birthDate;
    private boolean stillPlaying;
    private int goals;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public boolean isStillPlaying()
    {
        return stillPlaying;
    }

    public void setStillPlaying(boolean stillPlaying)
    {
        this.stillPlaying = stillPlaying;
    }

    public int getGoals()
    {
        return goals;
    }

    public void setGoals(int goals)
    {
        this.goals = goals;
    }

}
