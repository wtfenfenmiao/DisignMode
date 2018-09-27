package command;

import furniture.gramophone;

public class gramophoneOnCommand implements command{
	gramophone thisgramphone;
	public gramophoneOnCommand(gramophone Gramophone)
	{
		this.thisgramphone=Gramophone;
	}
	public void excute()
	{
		thisgramphone.putCD();
		thisgramphone.play();
	}
	public void undo()
	{
		thisgramphone.off();
	}
}
