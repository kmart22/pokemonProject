package pokemon.controller;

import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;
import pokemon.view.PokemonPanel;

public class PokemonController
{
	private Pokemon pokemon;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokemon = new Pokemon();
		appFrame = new PokemonFrame(this);
	}
	public void start()
	{
		
	}
}
