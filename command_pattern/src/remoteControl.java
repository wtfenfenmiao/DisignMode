import java.util.Stack;

import command.command;
import command.noCommand;
import command.partyCommand;

//�������ν�ģ�������
public class remoteControl {
	private command[] onCommand;
	private command[] offCommand;
	private noCommand noComm;
	private Stack<command> lastCommand=new Stack<command>();
	public remoteControl()
	{
		onCommand=new command[7];
		offCommand=new command[7];
		noComm=new noCommand();
		for(int i=0;i<7;++i)
		{
			onCommand[i]=noComm;
			offCommand[i]=noComm;
		}
	}
	public void setCommand(int slot,command onCom,command offCom)
	{
		onCommand[slot]=onCom;
		offCommand[slot]=offCom;
	}
	public void slotOn(int slot)
	{
		onCommand[slot].excute();
		lastCommand.push(onCommand[slot]);
	}
	
	public void slotOff(int slot)
	{
		offCommand[slot].excute();
		lastCommand.push(offCommand[slot]);
	}
	
	public void undoPress()   
	{
		if(!lastCommand.empty())
		{
			command temp=lastCommand.pop();
			temp.undo();
		}
	}
	
	
	public String toString()
	{
		StringBuffer re=new StringBuffer();
		re.append("--state--\n");
		for(int i=0;i<7;++i)
		{
			re.append("slot "+i+":"+onCommand[i].getClass().getName()+" "+offCommand[i].getClass().getName()+"\n");
		}
		return re.toString();
	}
	
	
}