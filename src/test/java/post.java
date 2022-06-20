import java.util.Scanner;

import io.restassured.RestAssured;



public class post {

RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
.body(getFileContent("C:\\capgemini java\\newspace\\API_testing\\src\\test\\resources\\CreatingBooking"))
.header("Accept","application/json").header("Content-Type","application/json")
.when().log().all().post("/booking").then().log().all();

}



public static String getFileContent(String filepath) throws FileNotFoundException
{
File file = new File(filepath);
Scanner sc =new Scanner(file);
sc.useDelimiter("\\z");

return sc.next();
}




}