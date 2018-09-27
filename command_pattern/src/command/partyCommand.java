package command;

public class partyCommand implements command{
	command[] commands;
	public partyCommand(command[] commands)
	{
		this.commands=commands;
	}
	public void excute()
	{
		System.out.println("\nstart party!");
		for(int i=0;i<commands.length;++i)
		{
			commands[i].excute();
		}
	}
	public void undo()
	{
		for(int i=0;i<commands.length;++i)
		{
			commands[i].undo();
		}
	}
}
