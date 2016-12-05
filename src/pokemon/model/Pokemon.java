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
		
	}
	
	public String getPokemonTypes()
	{
		String pokemontypes = "This Pokemon has the following types:\n";
		Class<?> [] types = getClass().getInterface();
		String [] pokeTypes = new String[types.length];
		for(int index = 0; index < types.length; index++)
		{
			String temp = types[index].getCanonicalName();
			
			pokeTypes[index] = temp;
		}
		
		for(String current : pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + ".", "");
			pokemonTypes += temp + "\n";
		}
		
		return pokemonTypes;
	}
	
	public String toString()
	{
		
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokeon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
	
	public int getHealthPoints()
	{
		
	}
	
}
