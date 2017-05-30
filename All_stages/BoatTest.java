package rosieOLeary;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoatTest {
	Boat testboat = new Boat("testname", "testcoo", 0.8);
	Marina testmarina = new Marina("testnamemar","testaddress",10);
	Person testperson = new Person("testfirstname","testsirname","testdob","testnationality");
	Person testperson2 = new Person("testfirstname2","testsirname2","testdob2","testnationality2");
	Person testperson3 = new Person("testfirstname3","testsirname3","testdob3","testnationality3");
	Person testperson4 = new Person("testfirstname4","testsirname4","testdob4","testnationality4");
	

	@Test
	public void testgetName() {
		assertEquals(testboat.getName(), "testname");
	}
	@Test
	public void testsetName(){
		testboat.setName("newtestname");
		assertEquals(testboat.getName(), "newtestname");
	}
	@Test
	public void  testgetCoo(){
		assertEquals(testboat.getCountryoforigin(), "testcoo");
	}
	@Test
	public void testsetCoo(){
		testboat.setCountryoforigin("newtestcoo");
		assertEquals(testboat.getCountryoforigin(),"newtestcoo");
	}
	@Deprecated
	@Test
	public void testgetSize(){
		assertEquals(testboat.getSize(),0.8,0.8f);
	}
	@Deprecated
	@Test
	public void testsetSize(){
		testboat.setSize(6.8);
		assertEquals(testboat.getSize(),6.8,6.8f);
	}
	@Test
	public void testsetSpeed(){
		testboat.speed = 100;
		assertEquals(testboat.getSpeed(),100);
		
		}
	@Test
	public void testaccelerate(){
		testboat.speed=100;
		testboat.accelerate();
		
		assertEquals(testboat.getSpeed(),101);
	}
	@Test 
	public void testdecelerate(){
		testboat.speed= 100;
		testboat.deccelerate();
		
		assertEquals(testboat.getSpeed(),99);
	}
	@Test
	public void testaddtoPersonList(){
		testperson.setBoatrole("Crew");
		testboat.addtoBoatPersonList(testperson);
		assertEquals("Error :Cannot add person to boat",testboat.getBoatPersonList().get(0).getFirstname(),"testfirstname");
	}
	@Test
	public void testaddtoPersonList2(){
		testperson.setBoatrole("Captain");
		testboat.addtoBoatPersonList(testperson);
		assertEquals("Error :Cannot add person to boat",testboat.getBoatPersonList().get(0).getFirstname(),"testfirstname");
	}
	@Test
	public void testaddtoPersonList3(){
		testperson.setBoatrole("Captain");
		testboat.addtoBoatPersonList(testperson);
		assertEquals("Error :Cannot add person to boat",testboat.getBoatPersonList().get(0).getFirstname(),"testfirstname");
	}
	@Test
	public void testaddtoPersonList4(){
		testperson.setBoatrole("Captain");
		testperson2.setBoatrole("Crew");
		testboat.addtoBoatPersonList(testperson);
		testboat.addtoBoatPersonList(testperson2);
		assertEquals("Error :Cannot add person to boat",testboat.getBoatPersonList().get(0).getFirstname(),"testfirstname");
		assertEquals("Error :Cannot add person to boat",testboat.getBoatPersonList().get(1).getFirstname(),"testfirstname2");
		
	}
	@Test
	public void testaddtoPersonList5(){
		testperson.setBoatrole("Captain");
		testperson2.setBoatrole("Crew");
		testperson3.setBoatrole("Captain");
		testboat.addtoBoatPersonList(testperson);
		testboat.addtoBoatPersonList(testperson2);
		testboat.addtoBoatPersonList(testperson3);
		assertEquals("Error :Cannot add person to boat",testboat.getBoatPersonList().get(0).getFirstname(),"testfirstname");
		assertEquals("Error :Cannot add person to boat",testboat.getBoatPersonList().get(1).getFirstname(),"testfirstname2");
		assertEquals(testboat.getBoatPersonList().size(),2);
		}
	
	@Test
	public void testaddtoPersonList6(){
		testperson.setBoatrole("Crew");
		testperson2.setBoatrole("Captain");
		testperson3.setBoatrole("Captain");
		testboat.addtoBoatPersonList(testperson);
		testboat.addtoBoatPersonList(testperson2);
		testboat.addtoBoatPersonList(testperson3);
		assertEquals(testboat.getBoatPersonList().size(),2);
	}
	
	@Test
	public void testaddtoPersonList7(){
		testperson.setBoatrole("Crew");
		testperson2.setBoatrole("Captain");
		testperson3.setBoatrole("Captain");
		testperson4.setBoatrole("Owner");
		testboat.addtoBoatPersonList(testperson);
		testboat.addtoBoatPersonList(testperson2);
		testboat.addtoBoatPersonList(testperson3);
		testboat.addtoBoatPersonList(testperson4);
		assertEquals(testboat.getBoatPersonList().size(),3);
	}
	@Test
	public void testGetBoatMarina(){
		testboat.setBoatMarina(testmarina);
		assertEquals(testboat.getBoatMarina().getName(),"testnamemar");
	}

}
