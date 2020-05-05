package com.fdsdev90.footballalbum;

import com.fdsdev90.footballalbum.model.FootballPlayerModel;
import com.fdsdev90.footballalbum.service.FootballPlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController
{

    @GetMapping("/player/{name}")
    public FootballPlayerModel getPlayerInfo(@PathVariable("name")String name)
    {
        FootballPlayerService footballPlayerService = new FootballPlayerService();
        FootballPlayerModel footballPlayerModel = footballPlayerService.getPlayerInfo(name);

        return footballPlayerModel;
    }

    @PutMapping("/player/Update")
    public FootballPlayerModel updatePlayer()
    {
        return null;
    }


}
