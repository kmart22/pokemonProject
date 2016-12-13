package pokemon.controller;

import pokemon.controller.PokemonController;

public class PokemonRunner
{
	public static void main(String[] args)
	{
		PokemonController pokemonAppController = new PokemonController();
		pokemonAppController.start();
	}
}
