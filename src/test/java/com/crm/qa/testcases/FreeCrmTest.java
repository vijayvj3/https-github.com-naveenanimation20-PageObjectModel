
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestChrome {
 
public static void main(String[] args) {
 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vi20090299\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open facebook
driver.get("http://ww.facebook.com");\\chromedriver.exe
 
// Maximize browser
 
driver.manage().window().maximize();
 
}
 
}
 
