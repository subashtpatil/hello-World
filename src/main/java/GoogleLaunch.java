
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//bluestone.com  enter ring 
public class GoogleLaunch {

	static {

		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);

		String title = driver.getTitle();
		System.out.println("The title of the displayed site is =   " + title);
		}
		

	}
