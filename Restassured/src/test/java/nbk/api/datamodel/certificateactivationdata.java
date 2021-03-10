package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.certificateactivation;

public class certificateactivationdata {

	@Test
	public certificateactivation certificateactiv(String certificateauuth) {
	
	
		//Customer ccustomer = new Customer();
		certificateactivation certificateact = new certificateactivation();
		certificateact.setCertificateSigningRequestB64("certificatenumberaiidhfiw2093i4932");
		//ccustomer.setName("morpheus");
		//ccustomer.setJob("leader");
		return certificateact;
	}

}



/*"{\r\n" + 
"    \"name\": \"morpheus\",\r\n" + 
"    \"job\": \"leader\"\r\n" + 
"}" */