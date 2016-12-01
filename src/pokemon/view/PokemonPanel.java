package pokemon.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{	
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon("images/pokeball.png");
		this.updateButton = new JButton("Update the stats!");
		this.pokedexSelector = new JComboBox(new String [] {"Sylveon", "Jigglypuff", "Charmander", "Magcargo", "GeoDude"});
		this.pokemonLabel = new JLabel("pokemonLabel");
		this.healthLabel = new JLabel("Health");
		this.combatLabel = new JLabel("combat");
		this.speedLabel = new JLabel("speed");
		this.nameLabel = new JLabel("name");
		this.numberLabel = new JLabel("number");
		this.advancedLabel = new JLabel("advanced");
		this.healthField = new JTextField("healthField");
		this.combatField = new JTextField("combatField");	
		this.speedField = new JTextField("speedField");		
		this.nameField = new JTextField("nameField");		
		this.numberField = new JTextField("numberField");		
		this.advancedArea = new JTextArea("advancedArea");

		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		this.setBackground(Color.DARK_GRAY);
		this.add(pokedexSelector);
		this.add(healthField);
		this.add(healthLabel);
		this.add(combatField);
		this.add(combatLabel);
		this.add(speedField);
		this.add(speedLabel);
		this.add(nameField);
		this.add(nameLabel);
		this.add(numberField);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(advancedArea);
		//this.add();
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 31, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, combatLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 31, SpringLayout.SOUTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.EAST, speedLabel, 0, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 122, SpringLayout.EAST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 95, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -31, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 45, SpringLayout.SOUTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.EAST, advancedLabel, 0, SpringLayout.EAST, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 13, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 6, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, -6, SpringLayout.NORTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 2, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 6, SpringLayout.EAST, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 89, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameField, -19, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 23, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 0, SpringLayout.NORTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, healthField);
		
	}
	
	private void setupListeners()
	{
		
	}
}
