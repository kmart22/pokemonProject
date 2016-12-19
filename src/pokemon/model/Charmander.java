package pokemon.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander()
	{
		super("Charmander", 4);
		this.setAttackPoints(52);
		this.setHealtPoints(39);
		this.setSpeed(65.0);
	}
	
	public Charmander(String name)
	{
		super("Charmander", 4);
		this.setAttackPoints(52);
		this.setHealtPoints(39);
		this.setSpeed(65.0);
	}
	
	public int fireBreath()
	{
		return 10;
	}
	
	public int blazeKick()
	{
		return 20;
	}
}
