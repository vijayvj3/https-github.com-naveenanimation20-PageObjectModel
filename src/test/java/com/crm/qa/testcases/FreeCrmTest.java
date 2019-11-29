
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestChrome {
 
public static void main(String[] args) {
 
System.setProperty("webdriver.chrome.driver", "C:\Users\vi20090299\Downloads\IEDriverServer_Win32_3.150.1");
 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open facebook
driver.get("http://www.facebook.com");
 
// Maximize browser
 
driver.manage().window().maximize();
 
}
 
}
 
