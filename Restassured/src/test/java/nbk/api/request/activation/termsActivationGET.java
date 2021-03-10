package nbk.api.request.activation;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import nbk.api.utilobjects.PropertiesReader;

public class termsActivationGET extends PropertiesReader {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	PropertiesReader Global = new PropertiesReader();

	@Test
	void termsGET() throws IOException {
				res = given().log().all().spec(requestSpecification());
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = res.when().get(Global.getGlobalvalue("termsactivation")).then().log().all().spec(resspec).extract()
				.response();

		

	}

}
