package command;

import furniture.gramophone;

public class gramophoneOffCommand implements command{
	gramophone thisgramphone;
	public gramophoneOffCommand(gramophone Gramophone)
	{
		this.thisgramphone=Gramophone;
	}
	public void excute()
	{
		thisgramphone.off();
	}
	public void undo()
	{
		thisgramphone.putCD();
		thisgramphone.play();
	}
}