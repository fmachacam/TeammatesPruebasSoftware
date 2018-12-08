import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverDemo {

	public static void main(String[] args) {

		// if you didn't update the Path system variable to add the full directory path
		// to the executable as above mentioned then doing this directly through code
		System.setProperty("webdriver.chrome.driver",
				"D:\\U\\SEMESTRE VIII\\Pruebas de Software\\Laboratorio\\ChromeDirver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://teammatesv4.appspot.com/");

		// Click  Button
		driver.findElement(By.xpath("//*[@id=\"btnInstructorLogin\"]")).click();

		// Enter username
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("fccahuana@unsa.edu.pe");

		// Click Button
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();

		// Enter password
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("temporal97");
		
		// Click Button
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		
		// Click Button permitir
		driver.findElement(By.xpath("//*[@id=\"approve_button\"]")).click();
		
		// Click Button Add Course
		driver.findElement(By.xpath("//*[@id=\"addNewCourse\"]")).click();
		
		// Enter course ID
		driver.findElement(By.xpath("//*[@id=\"courseid\"]")).sendKeys("001TEST");
		
		// Enter course Name
		driver.findElement(By.xpath("//*[@id=\"coursename\"]")).sendKeys("SOFTWARE TESTS");
				
		// Click Button Add Course
		driver.findElement(By.xpath("//*[@id=\"btnAddCourse\"]")).click();
	}
}
