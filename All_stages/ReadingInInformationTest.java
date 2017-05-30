package rosieOLeary;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ReadingInInformationTest {
	ReadingInInformation ri = new ReadingInInformation();
	@Test
	public void createArraytest1() throws IOException {
		
		assertEquals(ri.createArray("testArray.txt")[0],"This");
	}
	@Test
	public void createMarinaObjectTest1() throws IOException{
		ri.createMarinaObject("stage_5_input.txt");
		assertEquals(ri.MarinaList.get(0).getName(),"Monaco Yacht Club");
		assertEquals(ri.MarinaList.size(),2);
	}
	@Test
	public void createMarinaObjectTest2() throws IOException{
		ri.createMarinaObject("stage_5_input.txt");
		assertEquals(ri.BoatList.get(0).getName(),"Santa Maria");
	}
	
	@Test
	public void createMarinaObjectTest3() throws IOException{
		ri.createMarinaObject("stage_5_input.txt");
		assertEquals(ri.PersonList.get(6).getFirstname(),"Peter");
	}
	@Test
	public void boatroleAssociationtest1() throws IOException{
		ri.createMarinaObject("stage_5_input.txt");
		ri.boatroleAssociation();
		for (int i=0;i<ri.MarinaList.size();i++){
			if (ri.MarinaList.get(i).getName().equals("Venice Marinas")){
					assertEquals(ri.MarinaList.get(i).getMarinaBoatList().get(0).getName(),"Santa Maria");
				}
			}
	}
}
