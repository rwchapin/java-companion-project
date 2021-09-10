package com.organization.mvcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.mvcproject.api.repository.MockGameDAO;
import com.organization.mvcproject.api.service.GameService;
import com.organization.mvcproject.api.model.Game;
import com.organization.mvcproject.model.GameImpl;

@Service("GameService")
public class GameServiceImpl implements GameService {

	@Autowired
	private MockGameDAO mockGameDAO;

	@Override
	public List<Game> retrieveAllGames() {
		return mockGameDAO.getAllGames();
	}

	@Override
	public Game saveGame(Game game) {  
		return mockGameDAO.saveGame(game);
	}
	
	
	@Override
	public Boolean deleteGame(Long gameId) {
		return mockGameDAO.deleteGame(gameId);
	}
	
	@Override
	public Game findGameById(Long gameId) {
		return mockGameDAO.findGameById(gameId);
	}



}