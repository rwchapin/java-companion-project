
package com.organization.mvcproject.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.organization.mvcproject.api.model.Game;

public class Company {

	private Long id;
	private String name;
	//TODO 1.0 this List doesn't need to be initialized at declaration. 
	private List<Game> gamesMade = new ArrayList<Game>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Game> getGamesMade() {
		return gamesMade;
	}

	public void setGamesMade(List<Game> gamesMade) {
		this.gamesMade = gamesMade;
	}
}