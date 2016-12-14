package pokemon.model;

public class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double speed;
	private int number;
	private String name;
	
	
	public Pokemon(String name, int number)
	{
		this.name = name;
		this.number = number;
	}
	
	public String getPokemonTypes()
	{
		String pokemontypes = "This Pokemon has the following types:\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokemonTypes = new String[types.length];
		for(int index = 0; index < types.length; index++)
		{
			String temp = types[index].getCanonicalName();
			
			pokemonTypes[index] = temp;
		}
		
		for(String current: pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + ".", "");
			pokemonTypes += temp += "\n";
		}
		
		return pokemonTypes;
	}
	
//	public String toString()
//	{
//		
//	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokeon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
	
	public int getHealthPoints()
	{
		return healthPoints;
	}
	
	public void setHealtPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}

	public int getAttackPoints() 
	{
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints) 
	{
		this.attackPoints = attackPoints;
	}

	public double getSpeed()
	{
		return speed;
	}

	public void setSpeed(double speed) 
	{
		this.speed = speed;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number) 
	{
		this.number = number;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	
}
