package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.emailconfirmation;

public class emailconfirmationdata {

	@Test
	public emailconfirmation emailconfirm(String OTP) {
	
	
		emailconfirmation emailconf = new emailconfirmation();
		emailconf.setOtp("000000");
		
		return emailconf;
	}

}



/*"{\r\n" + 
"    \"name\": \"morpheus\",\r\n" + 
"    \"job\": \"leader\"\r\n" + 
"}" */	