package rosieOLeary;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException{
		ReadingInInformation ri = new ReadingInInformation();
		
		ri.createMarinaObject("stage_5_input.txt");//creates objects from input file, but must have same format as stage_5_input.txt.There is an error where the compiling stops at Adele because she has no sirname.
		ri.boatroleAssociation();//adds association between people, boats and marinas.A boat can only be associated with one Marina and a captain cannot be a crewmember or vice versa.
		
		for (int i =0; i<ri.PersonList.size();i++){
			System.out.println(ri.PersonList.get(i).getFirstname());
		}
	}
}
	

