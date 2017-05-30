package rosieOLeary;

import static org.junit.Assert.*;

import org.junit.Test;

public class VisaInformationTest {

	VisaInformation testvisa = new VisaInformation("inputcode");
	@Test
	public void testgetVisacode() {
		assertEquals(testvisa.getVisacode(),"inputcode");
	}
	@Test
	public void testsetVisacode(){
		testvisa.setVisacode("newinputcode");
		assertEquals(testvisa.getVisacode(),"newinputcode");
	}

}