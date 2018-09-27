package command;

import furniture.light;

public class lightOnCommand implements command{
	light thislight;
	public lightOnCommand(light Light)
	{
		this.thislight=Light;
	}
	public void excute()
	{
		thislight.on();
	}
	public void undo()
	{
		thislight.off();
	}
}
