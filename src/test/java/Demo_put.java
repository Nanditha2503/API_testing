import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Demo_put {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getFileContent("C:\\capgemini\\java\\newspace\\API_testing\\src\\test\\resources\\Createbooking.txt"))
		.header("Accept","application/json").header("content-type","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM")
		.when().log().all().put("/booking/1660")
		.then().log().all().assertThat().statusCode(200);
		}
	private static String getFileContent(String filePath) throws FileNotFoundException
	{
	 File file = new File(filePath);
	Scanner sc =new Scanner(file);
	sc.useDelimiter("\\z");

	return sc.next();


	}

}
