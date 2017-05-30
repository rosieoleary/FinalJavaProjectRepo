package rosieOLeary;
import static org.junit.Assert.*;

import org.junit.Test;


public class PersonTest {

	Person testing = new Person("inputFirstName", "inputSurname", "inputDob","inputNationality");
	VisaInformation testvisa = new VisaInformation("inputcode") ;
	
	
	// = testvisa;
	
	@Test
	public void testGetFirstname(){	
		assertEquals(testing.getFirstname(),"inputFirstName");	
	}
	@Test
	public void testSetFirstname(){
		testing.setFirstname("newInputFirstName");
		assertEquals(testing.getFirstname(),"newInputFirstName");
	}	
	@Test
	public void testGetSurname(){
		assertEquals(testing.getSurname(),"inputSurname");
	}
	@Test
	public void testSetSurname(){
		
		testing.setSurname("newInputSurname");
		assertEquals(testing.getSurname(),"newInputSurname");
	}
	@Test
	public void testGetDob(){
		assertEquals(testing.getDob(),"inputDob");
	}
	@Test
	public void testSetDob(){
		testing.setDob("newInputDob");
		assertEquals(testing.getDob(),"newInputDob");
	}

	@Test
	public void testGetNationality(){
		assertEquals(testing.getNationality(),"inputNationality");
	}
	@Test
	public void testSetNationality(){
		testing.setNationality("newInputNationality");
		assertEquals(testing.getNationality(),"newInputNationality");
	}
	@Test 
	public void  testGetVisaInfo(){
		assertNull(testing.getVisainfo());
		
	}
	@Test 
	public void testSetVisaInfo(){
		testing.setVisainfo(new VisaInformation("newInputCode"));
		assertEquals(testing.getVisainfo().getVisacode(), "newInputCode");
	}
	@Test
	public void testGetBoatRole(){
		testing.setBoatrole("testboatrole");
		assertEquals(testing.getBoatrole(),"testboatrole");
	}
	@Test
	public void testSetBoatRole(){
		testing.setBoatrole("newinputboatrole");
		assertEquals(testing.getBoatrole(),"newinputboatrole");
	}
	@Test
	public void testSetAnotherBoatRole1(){
		testing.setBoatrole("Captain");
		testing.setAnotherBoatRole("Crew");
		assertEquals(testing.getBoatrole(),"Captain");
	}
	@Test
	public void testSetAnotherBoatRole2(){
		testing.setBoatrole("Captain");
		testing.setAnotherBoatRole("Owner");
		assertEquals(testing.getBoatrole(),"Captain and Owner");
	}
	@Test
	public void testSetAnotherBoatRole3(){
		testing.setBoatrole("Captain");
		testing.setAnotherBoatRole("Captain");
		assertEquals(testing.getBoatrole(),"Captain");
	}
	@Test
	public void testSetAnotherBoatRole4(){
		testing.setBoatrole("Captain and Owner");
		testing.setAnotherBoatRole("Crew");
		assertEquals(testing.getBoatrole(),"Captain and Owner");
	}
	@Test
	public void testSetAnotherBoatRole5(){
		testing.setBoatrole("Owner");
		testing.setAnotherBoatRole("Crew");
		assertEquals(testing.getBoatrole(),"Owner and Crew");
	}
	@Test
	public void testSetAnotherBoatRole6(){
		testing.setBoatrole("Owner");
		testing.setAnotherBoatRole("Captain");
		assertEquals(testing.getBoatrole(),"Owner and Captain");
	} 
	@Test
	public void testSetAnotherBoatRole7(){
		testing.setBoatrole("Owner");
		testing.setAnotherBoatRole("Owner");
		assertEquals(testing.getBoatrole(),"Owner");
	} 
	@Test
	public void testSetAnotherBoatRole8(){
		testing.setBoatrole("Owner and Crew");
		testing.setAnotherBoatRole("Captain");
		assertEquals(testing.getBoatrole(),"Owner and Crew");
	}
	@Test 
	public void testSetAnotherBoatRole9(){
		testing.setBoatrole("Crew");
		testing.setAnotherBoatRole("Owner");
		assertEquals(testing.getBoatrole(),"Crew and Owner");
	}
	@Test
	public void testSetAnotherBoatRole10(){
		testing.setBoatrole("Crew");
		testing.setAnotherBoatRole("Captain");
		assertEquals(testing.getBoatrole(),"Crew");
	}
	@Test
	public void testSetAnotherBoatRole11(){
		testing.setBoatrole("Crew");
		testing.setAnotherBoatRole("Crew");
		assertEquals(testing.getBoatrole(),"Crew");
	}
	@Test
	public void testSetAnotherBoatRole12(){
		testing.setBoatrole("Crew and Owner");
		testing.setAnotherBoatRole("Captain");
		assertEquals(testing.getBoatrole(),"Crew and Owner");
	}
	

}