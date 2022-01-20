import org.testng.annotations.AfterClass;

import static jdk.nashorn.internal.runtime.Debug.id;

public class answer7 {
    private static ChromeDriver driver;
    private static ByClassName chromeDriver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/webcalculator/");
        System.out.println(chromeDriver.findElement(By.id("2")).getRect().getHeight());
        System.out.println(chromeDriver.findElement(By.id("6")).getRect().getWidth());
    }

    @AfterClass
    public void afterAll() {
        driver.quit();

    }

    private static class ByClassName {
    }

    private static class SearchContext {
    }
}
