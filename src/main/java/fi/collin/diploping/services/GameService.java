package fi.collin.diploping.services;

import fi.collin.diploping.Entities.Game;
import fi.collin.diploping.dao.GameDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GameService {

    @Autowired
    private GameDao gameDao;

    public Collection<Game> getGames() {
        return this.gameDao.getGames();
    }

    public Game getGameById(Integer id) {
        return this.gameDao.getGameById(id);
    }


}
