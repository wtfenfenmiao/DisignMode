import command.command;
import command.fanDownCommand;
import command.fanUpCommand;
import command.gramophoneOffCommand;
import command.gramophoneOnCommand;
import command.lightOffCommand;
import command.lightOnCommand;
import command.partyCommand;
import furniture.fan;
import furniture.gramophone;
import furniture.light;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remoteControl wtControl=new remoteControl();
		
		light roomlight=new light("room");
		fan livingRoomFan=new fan("living room");
		gramophone showerRoomGram=new gramophone("shower room");
		
		lightOnCommand lightOn=new lightOnCommand(roomlight);
		lightOffCommand lightOff=new lightOffCommand(roomlight);
		fanUpCommand fanUp=new fanUpCommand(livingRoomFan);
		fanDownCommand fanDown=new fanDownCommand(livingRoomFan);
		gramophoneOnCommand gramOn=new gramophoneOnCommand(showerRoomGram);
		gramophoneOffCommand gramOff=new gramophoneOffCommand(showerRoomGram);
		command[] partyOnlist={lightOn,fanUp,gramOn};     //这两句折磨了一会。把party当成一个“灯”就好了
		partyCommand partyOn=new partyCommand(partyOnlist);
		command[] partyOfflist={lightOff,fanDown,gramOff};
		partyCommand partyOff=new partyCommand(partyOfflist);
		
		wtControl.setCommand(0, lightOn, lightOff);
		wtControl.setCommand(1, fanUp, fanDown);
		wtControl.setCommand(2, gramOn, gramOff);
		wtControl.setCommand(3,partyOn,partyOff);
		
		System.out.println(wtControl);
		
		wtControl.slotOn(0);
		wtControl.slotOn(1);
		wtControl.undoPress();
		wtControl.slotOn(2);
		wtControl.slotOff(0);
		wtControl.undoPress();
		wtControl.slotOff(1);
		wtControl.slotOff(2);
		wtControl.slotOn(3);
		wtControl.slotOff(3);
		wtControl.undoPress();
		wtControl.undoPress();
		wtControl.undoPress();
		wtControl.undoPress();
		wtControl.slotOn(1);
		wtControl.slotOn(1);
		wtControl.slotOn(1);
		wtControl.slotOn(1);
		wtControl.slotOn(1);
		wtControl.slotOff(1);
		wtControl.slotOff(1);
		wtControl.slotOff(1);
		wtControl.undoPress();
		wtControl.slotOff(1);
		wtControl.slotOff(1);
		
		
	}

}
