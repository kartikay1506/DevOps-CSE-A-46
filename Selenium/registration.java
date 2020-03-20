import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/Facebook-Project/");
		driver.findElement(By.id("firstname")).sendKeys("Kartikay");
		driver.findElement(By.id("surname")).sendKeys("Sawhney");
		driver.findElement(By.id("phone_email")).sendKeys("kartikaysawhney15061999@gmail.com");
		driver.findElement(By.id("newpassword")).sendKeys("kartikay1506");
		driver.findElement(By.id("birthday")).sendKeys("15");
		driver.findElement(By.id("birthmonth")).sendKeys("Jun");
		driver.findElement(By.id("birthyear")).sendKeys("1999");
		driver.findElement(By.id("gender_male")).click();
		driver.findElement(By.id("signup")).click();
	}

}
