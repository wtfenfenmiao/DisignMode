package furniture;

public class gramophone {
	String location;
	public gramophone(String location)
	{
		this.location=location;
	}
	public void putCD()
	{
		System.out.println("the gramophone in "+location+" put a CD!");
	}
	public void play()
	{
		System.out.println("the gramophone in "+location+" play!");
	}
	public void off()
	{
		System.out.println("the gramophone in "+location+" off!");
	}
}
