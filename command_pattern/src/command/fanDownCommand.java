package command;

import furniture.fan;

public class fanDownCommand implements command{
	fan thisfan;
	int prev;
	public fanDownCommand(fan Fan)
	{
		this.thisfan=Fan;
	}
	public void excute()
	{
		prev=thisfan.getSpeed();
		if(prev==thisfan.HIGH)
		{
			thisfan.medium();
		}
		else if(prev==thisfan.MEDIUM)
		{
			thisfan.low();
		}
		else if(prev==thisfan.LOW)
		{
			thisfan.off();
		}
		else
		{
			thisfan.high();
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