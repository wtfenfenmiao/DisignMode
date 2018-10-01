package coffine;

public abstract class coffineDrink {
	public final void makeDrink()
	{
		boilwater();
		brewing();
		if(needAdd())
		{
			addMaterial();
		}	
		poulout();
	}
	
	public final void boilwater()	
	{
		System.out.println("boil water...");
	}
	public final void poulout()
	{
		System.out.println("poul out...");
	}
	public Boolean needAdd()    //这是个”钩子“
	{
		return true;
	}
	
	public abstract void brewing();
	public abstract void addMaterial();
}
