package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.username;

public class Activationusernamedata {

	@Test
	public username userdata(String username) {
	
	
		//Customer ccustomer = new Customer();
		username usernam = new username();
		usernam.setActivationusername("Test");
		//ccustomer.setName("morpheus");
		//ccustomer.setJob("leader");
		return usernam;
	}

}



/*"{\r\n" + 
"    \"name\": \"morpheus\",\r\n" + 
"    \"job\": \"leader\"\r\n" + 
"}" */