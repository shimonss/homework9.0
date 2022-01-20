import com.sun.tools.attach.VirtualMachineDescriptor;
import jdk.jshell.Snippet;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static jdk.internal.jimage.decompressor.CompressedResourceHeader.getSize;


public class answer1 {

   private static final String SEVEN = null;
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator/");

    } @Test
      void aboveTest(){
        Object Constants = null;
        VirtualMachineDescriptor By = null;
        System.out.println(driver.findElement(By.id(Constants.7)).getSize();
        System.out.println(driver.findElement(By.id("6")).isDisplayed());
        WebCalculatorPage.PressSIX();
        WebCalculatorPage.PressPlus();
        WebCalculatorPage.Pressfour();
        WebCalculatorPage.PressEquals();
        String expectedResult = "10";
    }





        public static void PressFIVE() {
        }

        public static void Pressfour() {
        }

        public static void PressSIX() {
        }

        public static void PressPlus() {
        }

        public static void PressEquals() {
        }

    private static class WebCalculatorPage {
        public static void PressSIX() {
        }

        public static void PressPlus() {
        }

        public static void Pressfour() {
        }

        public static void PressEquals() {
        }
    }
}
}
}



    }
}
