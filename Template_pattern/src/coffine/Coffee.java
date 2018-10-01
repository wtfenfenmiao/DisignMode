package coffine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends coffineDrink{


	public void brewing() {
		System.out.println("mix the water with coffee...");
		
	}


	public void addMaterial() {
		System.out.println("add milk and sugar...");
	}
	
	public Boolean needAdd()
	{
		String str=customerInput();
		//System.out.println(str);
		if(str.toLowerCase().startsWith("y"))
		{
			return true;
		}
		else
		{
			//System.out.println("there?");
			return false;
		}		
	}
	
	public String customerInput()
	{
		String ans=null;
		System.out.println("Do you want to add milk and sugar(y/n)?");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try{
			ans=in.readLine();
		}catch(IOException ioe)
		{
			System.out.println("error trying catch your answer!");
		}
		if(ans==null)
			return "no";
		return ans;
	}

}
