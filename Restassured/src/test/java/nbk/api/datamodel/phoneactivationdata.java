package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.phoneactivation;

public class phoneactivationdata {

	@Test
	public phoneactivation phoneactiv(String phonenumber) {
	
	
		phoneactivation phoneact = new phoneactivation();
		phoneact.setPhonenumber("0001122548");
		
		return phoneact;
	}

}



/*"{\r\n" + 
"    \"name\": \"morpheus\",\r\n" + 
"    \"job\": \"leader\"\r\n" + 
"}" */	