package command;

import furniture.light;

public class lightOffCommand implements command{
	light thislight;
	public lightOffCommand(light Light)
	{
		this.thislight=Light;
	}
	public void excute()
	{
		thislight.off();
	}
	public void undo()
	{
		thislight.on();
	}
}
