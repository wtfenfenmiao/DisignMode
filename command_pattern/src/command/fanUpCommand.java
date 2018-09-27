package command;

import furniture.fan;

public class fanUpCommand implements command{
	fan thisfan;
	int prev;
	public fanUpCommand(fan Fan)
	{
		this.thisfan=Fan;
	}
	public void excute()
	{
		prev=thisfan.getSpeed();
		if(prev==thisfan.HIGH)
		{
			thisfan.off();
		}
		else if(prev==thisfan.MEDIUM)
		{
			thisfan.high();
		}
		else if(prev==thisfan.LOW)
		{
			thisfan.medium();
		}
		else
		{
			thisfan.low();
		}
	}
	
	public void undo()
	{
		if(prev==thisfan.HIGH)
		{
			thisfan.high();
		}
		else if(prev==thisfan.MEDIUM)
		{
			thisfan.medium();
		}
		else if(prev==thisfan.LOW)
		{
			thisfan.low();
		}
		else
		{
			thisfan.off();
		}
	}
}
