package com.organization.mvcproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.mvcproject.api.service.GameService;
import com.organization.mvcproject.model.GameImpl;
import com.organization.mvcproject.api.model.Game;

@RequestMapping(value ="/game")
@RestController
public class GameController {

	
	@Autowired
	private GameService gameService;

	/**
	 * TODO 2.0 (Separation of concerns) consider moving all controller endpoints that return a ResponseEntity into a @RestController.
	 */
	

	@GetMapping(value = "/getAll")
	public ResponseEntity<List<Game>> fetchAllGames() {
		return new ResponseEntity<List<Game>>(gameService.retrieveAllGames(), HttpStatus.OK);
	}


	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createGame(@RequestBody GameImpl game) {
		gameService.saveGame(game);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateGame(@RequestBody Game game) {
		gameService.saveGame(game);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping(value ="/")
	public ResponseEntity<?> deleteGame(@PathVariable(value = "id") Long id){
		
		return new ResponseEntity<>(gameService.deleteGame(id), HttpStatus.OK);
	}
}