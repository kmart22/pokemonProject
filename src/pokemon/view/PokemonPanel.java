package pokemon.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
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
		updateButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				System.out.println(baseController.getPokedex().get(selected));
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation() + "\n" + baseController.getPokedex().get(selected).getPokemonTypes());			
				changeColorBasedOnType(baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
		
		this.addMouseListener(new MouseListener()
				{
						public void mouseEntered(MouseEvent entered)
						{
							//System.out.println("mouse in!")
						}
						
						public void mouseExited(MouseEvent exited)
						{
							//System.out.println("mouse out!")
						}
						
						public void mousePressed(MouseEvent pressed)
						{
							//System.out.println("mouse pressed!")
						}
						
						public void mouseClicked(MouseEvent clicked)
						{
							System.out.println("Mouse released!");
						}
						
						public void mouseReleased(MouseEvent released)
						{
							System.out.println("Mouse clicked!");
						}
				});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				System.out.println(moved.getX() + "," + moved.getY());
				if (moved.getX() <= 5 && moved.getY() <= 5)
				{
					System.out.println("You found the secret point!");
				}
			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				setRandomColor();
			}
					
		});
	}
	
	private void changeColorBasedOnType(String type)
	{
		if (type.contains("Fairy"))
		{
			this.setBackground(Color.PINK);
		}
		
		if (type.contains("Rock"))
		{
			this.setBackground(Color.GRAY);
		}
		
		if (type.contains("Fire"))
		{
			this.setBackground(Color.RED);
		}
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "pokeball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		pokemonLabel.setIcon(pokemonIcon);
		repaint();
	}
	private void setRandomColor()
	{
		int red = (int) (Math.random() *256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	private boolean isValidDouble(String input)
	{
		boolean isDouble = false;
		if (input.length() != 0)
		{
			isDouble = true;
		}
		return isDouble;
	}
	
	private boolean isValidInteger(String input)
	{
		return true;
	}
	
	private boolean isValidName(String name)
	{
		return true;
	}
}
