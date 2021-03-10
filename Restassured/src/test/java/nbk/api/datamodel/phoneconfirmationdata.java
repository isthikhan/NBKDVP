package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.phoneconfirmation;

public class phoneconfirmationdata {

	@Test
	public phoneconfirmation phoneconfirm(String OTP) {
	
	
		phoneconfirmation phoneconf = new phoneconfirmation();
		phoneconf.setOtp("000000");
		
		return phoneconf;
	}

}



/*"{\r\n" + 
"    \"name\": \"morpheus\",\r\n" + 
"    \"job\": \"leader\"\r\n" + 
"}" */	