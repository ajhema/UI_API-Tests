package APITest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class HerokuAPIChecks {
	
	public static void main(String[] args) {
		RestAssured.baseURI = "https://supervillain.herokuapp.com";
		//get user list
		given().log().all()
		.when().get("v1/user")
		.then().assertThat().log().all().statusCode(200);
		
		//post - add user
		given().log().all()
		.body("{\r\n"
				+ "  \"username\": \"TestUser\",\r\n"
				+ "  \"score\": 100\r\n"
				+ "}")
		.when().post("v1/user")
		.then().assertThat().statusCode(201).body("message", equalTo("User added."));
		
		//put - update user
		given().log().all()
		.body("{\r\n"
				+ "  \"username\": \"TestUser\",\r\n"
				+ "  \"score\": 400\r\n"
				+ "}")
		.when().put("v1/user")
		.then().assertThat().statusCode(204).body("message", equalTo("Updated"));	
	}
}
