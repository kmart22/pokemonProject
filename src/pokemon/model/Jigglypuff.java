package pokemon.model;

public class Jigglypuff extends Pokemon implements Fairy
{
	public Jigglypuff()
	{
		super("Jigglypuff", 39);
		this.setAttackPoints(45);
		this.setHealtPoints(115);
		this.setSpeed(20);
	}
	
	public Jigglypuff(String name)
	{
		super("Jigglypuff", 39);
		this.setAttackPoints(45);
		this.setHealtPoints(115);
		this.setSpeed(20);
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
