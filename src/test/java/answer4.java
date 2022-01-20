public class answer4 {
    private static ChromeDriver;
    private static Object chromeOptions;

    @BeforeClass
    public static void beforeAll() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        chromeDriver.ChromeOptions options = new chromeDriver.ChromeOptions();
        options.addArguments("-disable extensions");
        chromeDriver chromeDriver = new chromeDriver(chromeOptions);


    }

    @Test
    public void test4_extensions() {

    }

    private static class chromeDriver {
        public chromeDriver(Object chromeOptions) {

        }

        private static class ChromeOptions {
            public void addArguments(String s) {
            }
        }
    }
}
