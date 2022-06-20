import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Demo_API 
	{

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().get("/booking/438").then().log().all();
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	 .when().log().all().delete("/booking/1").then().log().all().assertThat().statusCode(405);
		
		
		}
	public static String getFileContent(String filepath) throws FileNotFoundException
	{
		File file = new File(filePath);
		Scanner sc= new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
}  