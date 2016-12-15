package pokemon.model;


public class Geodude extends Pokemon implements Rock
{
	public Geodude()
	{
		super("Geodude", 74);
		this.setAttackPoints(80);
		this.setHealtPoints(40);
		this.setSpeed(20.0);
	}
	
	public Geodude(String name)
	{
		super(name, 74);
		this.setAttackPoints(80);
		this.setHealtPoints(40);
		this.setSpeed(20.0);
	}
	
	public int smash()
	{
		return 10;
	}
	
	public int mudSlide()
	{
		return 10;
	}
}
