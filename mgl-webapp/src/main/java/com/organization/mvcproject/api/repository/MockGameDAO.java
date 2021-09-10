package com.organization.mvcproject.api.repository;

import java.util.ArrayList;
import java.util.List;

import com.organization.mvcproject.api.model.Game;

public interface MockGameDAO {

	List<Game> getAllGames();

	//save and update method
	Game saveGame(Game game);

	Game findGameById(Long id);

	Boolean deleteGame(Long gameId);
	
}
