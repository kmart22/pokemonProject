package pokemon.model;

public class Magcargo extends Pokemon implements Rock, Fire
{
	public Magcargo()
	{
		super("Magcargo", 219);
		this.setAttackPoints(50);
		this.setHealtPoints(60);
		this.setSpeed(30.0);
	}
	
	public Magcargo(String name)
	{
		super(name, 219);
		this.setAttackPoints(50);
		this.setHealtPoints(60);
		this.setSpeed(30.0);
	}
	
	public int smash()
	{
		return 2;
	}
	
	public int mudSlide()
	{
		return 4;
	}
	
	public int fireBreath()
	{
		return 2;
	}
	
	public int blazeKick()
	{
		return 5;
	}

}
