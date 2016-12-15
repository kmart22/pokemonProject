package pokemon.model;

public class Sylveon extends Pokemon implements Fairy
{
	public Sylveon()
	{
		super("Sylveon", 700);
		this.setAttackPoints(65);
		this.setHealtPoints(95);
		this.setSpeed(60);
	}
	
	public Sylveon(String name)
	{
		super("Sylveon", 700);
		this.setAttackPoints(65);
		this.setHealtPoints(95);
		this.setSpeed(60);
	}
	
	public int charm()
	{
		return 20;
	}
	
	public int heal()
	{
		return 10;
	}
}
