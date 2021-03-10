package nbk.api.request.activation;

import static io.restassured.RestAssured.*;

import static org.junit.Assert.assertEquals;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import nbk.api.datamodel.*;
import nbk.api.headers.*;
import nbk.api.utilobjects.*;

public class UsernameActivationPOST extends PropertiesReader {

	@Test
	//@Test(groups={"userCreationPOST.CreatePOST"})
	
	
	public void CreatePOST() throws IOException {
		RequestSpecification res;
		ResponseSpecification resspec;
		Response response;
		Activationusernamedata data = new Activationusernamedata();
		PropertiesReader Global = new PropertiesReader();
		Headers head = new Headers();

		res = given().log().all().spec(requestSpecification()).headers(head.JsonHeaders())
				.body(data.userdata("username"));

		resspec = new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
		response = res.when().post(Global.getGlobalvalue("usernameactivation")).then().log().all().spec(resspec).extract()
				.response();

		

	}
}
