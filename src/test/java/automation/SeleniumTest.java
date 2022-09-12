package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        // Creating new project change to Maven, add dependencies from mvnrepository.com in pom.xml file
        // Selenium Java and WebDriverManager (by bonigarcia)
        // Add .gitignore to Selenium project folder with all these files:
        //    /.idea/
        //    /target/
        //    /.iml/

        // Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        // Create instance of chrome driver
        WebDriver driver = new ChromeDriver();

        // Set up directions
        driver.get("https://www.google.com");


    }
}
