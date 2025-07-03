package seleniumPractice;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class ExtractJsonValues {
	
	public static void main(String[] args) {
        Response response = given()
                                .baseUri("https://api.example.com")
                            .when()
                                .get("/user/101");

        // Convert response to JsonPath
        JsonPath jsonPath = response.jsonPath();

        // Extract values
        int id = jsonPath.getInt("id");
        String name = jsonPath.getString("name");
        String city = jsonPath.getString("address.city");

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        
        
        //2. Using Inline .extract().path()
        
        String name = given()
                .when().get("/user/101")
            .then()
                .extract().path("name");

System.out.println("Name: " + name);

        
  
        /*
         * {
  "users": [
    { "id": 1, "name": "A" },
    { "id": 2, "name": "B" }
  ]
}

      
         */
        
        List<String> names = response.jsonPath().getList("users.name");
        System.out.println("Names: " + names);

    }

}
