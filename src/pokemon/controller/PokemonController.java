package pokemon.controller;

import pokemon.model.*;
import pokemon.view.PokemonFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pokemon.view.PokemonPanel;
import java.util.Map;
import java.util.HashMap;

public class PokemonController
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame pokemonFrame;
	private PokemonPanel appPanel;
	
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		pokemonFrame = new PokemonFrame(this);
	}
	public void start()
	{
		JOptionPane.showMessageDialog(pokemonFrame,  "Welcome to Pokemon Inheritance");
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Geodude("Geodude"));
		pokedex.add(new Charmander("Fire lizard?"));
		pokedex.add(new Jigglypuff("JigglyPuff"));
		pokedex.add(new Magcargo("Fire Snail"));
		pokedex.add(new Sylveon("Sylveon"));
		//pokedex.add(new Geodude("another stupid rock guy?!?!"));
	}
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames = new String[pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		return pokemonNames;
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setSpeed(speed);
		current.setHealtPoints(health);
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public PokemonFrame getBaseFrame()
	{
		return pokemonFrame;
	}
	
}
