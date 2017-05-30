package rosieOLeary;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class MarinaTest {
	
	Marina testmarina = new Marina("testname","testaddress",0);
	Boat testboat = new Boat("testname", "testcoo",0);
	Boat testboat2 = new Boat("testname2","testcoo",0);
	Person testperson = new Person("testfirstname","testsirname","testdob","testnationality");
	
	@Test
	public void testGetName(){
		
		assertEquals(testmarina.getName(),"testname");	
	}
	@Test
	public void testSetName(){
		testmarina.setName("newtestname");
		assertEquals(testmarina.getName(),"newtestname");
	}
	
	@Test
	public void testGetAddress(){
		assertEquals(testmarina.getAddress(),"testaddress");
	}
	@Test
	public void testSetAddress(){
		testmarina.setAddress("newaddress");
		assertEquals(testmarina.getAddress(),"newaddress");
	}

	@Test
	public void testGetBoatCapacity() {
		assertEquals(testmarina.getBoatCapacity(),0f,0);
	}
	@Test
	public void testSetBoatCapacity1(){
		testmarina.setBoatCapacity(20);
		testmarina.setBoatCapacity(-10);
		assertEquals(testmarina.getBoatCapacity(),20f,20);
	}
	@Test
	public void testSetBoatCapacity2(){
		testmarina.setBoatCapacity((10));
		assertEquals(testmarina.getBoatCapacity(),10f,10);
	}
	@Test
	public void testGetBoatList(){
		testperson.setBoatrole("Crew");
		testboat.addtoBoatPersonList(testperson);
		testmarina.addToMarinaBoatList(testboat);
		
		assertEquals("Error cannot find boats",testmarina.getMarinaBoatList().get(0).getName(), "testname");
	}
	@Test
	public void testAddToBoatList(){
		testmarina.addToMarinaBoatList(testboat);
		assertEquals(testmarina.getMarinaBoatList().size(),0);
	}
	@Test
	public void testAddToBoatList2(){
		testperson.setBoatrole("Captain");
		testboat.addtoBoatPersonList(testperson);
		testboat.setSize(10);
		testmarina.setBoatCapacity(5);
		testmarina.addToMarinaBoatList(testboat);
		assertEquals(testmarina.getMarinaBoatList().size(),0);
	}
	@Test
	public void testAddToBoatList3(){
		testperson.setBoatrole("Captain");
		testboat.addtoBoatPersonList(testperson);
		testboat.setSize(10);
		testmarina.setBoatCapacity(15);
		testmarina.addToMarinaBoatList(testboat);
		assertEquals(testmarina.getMarinaBoatList().size(),1);
		assertEquals(testmarina.getBoatCapacity(),5f,5);
	}
	@Test
	public void testRemoveFromMarinaBoatList(){
		testperson.setBoatrole("Captain");
		testboat.addtoBoatPersonList(testperson);
		testboat.setSize(10);
		testmarina.setBoatCapacity(15);
		testmarina.addToMarinaBoatList(testboat);
		assertEquals(testmarina.getMarinaBoatList().size(),1);
		assertEquals(testmarina.getBoatCapacity(),5f,5);
		testmarina.removeFromMarinaBoatList(testboat);
		assertEquals(testmarina.getMarinaBoatList().size(),0);
		assertEquals(testmarina.getBoatCapacity(),15f,15);
	}
	@Test
	public void testRemoveFromMarinaBoatList2(){
		testperson.setBoatrole("Captain");
		testboat.addtoBoatPersonList(testperson);
		testboat.setSize(10);
		testboat2.setSize(20);
		testmarina.setBoatCapacity(15);
		testmarina.addToMarinaBoatList(testboat);
		assertEquals(testmarina.getMarinaBoatList().size(),1);
		assertEquals(testmarina.getBoatCapacity(),5f,5);
		testmarina.removeFromMarinaBoatList(testboat2);
		assertEquals(testmarina.getMarinaBoatList().size(),1);
		assertEquals(testmarina.getBoatCapacity(),5f,5);
	}
	
	@Test
	public void findOldestPersonTest()throws IOException{
		ReadingInInformation ri = new ReadingInInformation();
		ri.createMarinaObject("stage_5_input.txt");
		ri.boatroleAssociation();
		for (int i=0;i<ri.MarinaList.size();i++){
			if (ri.MarinaList.get(i).getName().equals("Monaco Yacht Club")){
				for (int j=0; j<ri.MarinaList.get(i).getMarinaBoatList().size();j++){
					System.out.println(ri.MarinaList.get(i).getMarinaBoatList().get(j).getName());
				}
				for (int j=0; j<ri.MarinaList.get(i).getMarinaPersonList().size();j++){
					System.out.println(ri.MarinaList.get(i).getMarinaPersonList().get(j).getFirstname());
				}
				assertEquals(ri.MarinaList.get(i).findOldestPerson(),"Brian Johnson");
			}
		}
		
		
		
	}
	@Test
	public void howManyBoatsTest()throws IOException{
		ReadingInInformation ri = new ReadingInInformation();
		ri.createMarinaObject("stage_5_input.txt");
		ri.boatroleAssociation();
		for (int i=0;i<ri.MarinaList.size();i++){
			if (ri.MarinaList.get(i).getName().equals("Monaco Yacht Club")){
				
					assertEquals(ri.MarinaList.get(i).howManyBoats(),2);
				}
			}
		}
		
		
		
	}
	

