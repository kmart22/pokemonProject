package pokemon.view;

import javax.swing.JFrame;
import pokemon.controller.PokemonController;
import java.awt.Dimension;
import pokemon.view.PokemonPanel;

public class PokemonFrame extends JFrame
{
	
	private PokemonPanel pokemonPanel;
	
	private PokemonController baseController;
	
	
	
	public PokemonFrame(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		this.pokemonPanel = new PokemonPanel(baseController);
		setupFrame();
	}
	
	
	
	private void setupFrame()
	{
		this.setContentPane(pokemonPanel);
		this.setSize(new Dimension(600, 400));
		this.setTitle("Pokedex 2016");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	
}
