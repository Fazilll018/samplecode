import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazil\\eclipse-workspace\\Sample.proj\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//*[@id=\"img\"]")).click();

	}

}
