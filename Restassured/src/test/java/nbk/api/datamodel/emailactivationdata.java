package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.emailactivation;

public class emailactivationdata {

	@Test
	public emailactivation emailactiv(String email) {
	
	
		emailactivation emailact = new emailactivation();
		emailact.setEmail("testemail");
		//ccustomer.setJob("leader");
		return emailact;
	}

}