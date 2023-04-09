import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in"; //storing url in baseUrl
    static String browser = "Edge"; //Creating a static variable that will determine which browser the needs to open
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){ //setting up chrome browser
            driver = new ChromeDriver(); //open link in chrome browser
        } else if (browser.equalsIgnoreCase("Firefox")) { //setting up firefox browser
            driver= new FirefoxDriver(); //open link in firefox browser
        } else if (browser.equalsIgnoreCase("Edge")){  //setting up edge browser
            driver = new EdgeDriver(); //open link in edge browser.
        } else {
            System.out.println("Invalid browser"); //if neither then print this statement
        }
        driver.get(baseUrl); //opening browser
        System.out.println("The title of the page is: " + driver.getTitle()); //printing title of the page
        System.out.println("The current URL is: " + driver.getCurrentUrl()); //printing the current url
        System.out.println("The page source is: " + driver.getPageSource()); //printing page source

        driver.findElement(By.id("user[email]")).sendKeys("Prime@gmail.com"); //finding email field and entering email ID
        driver.findElement(By.id("user[password]")).sendKeys("Prime123"); //finding password field and entering password

        driver.close(); //closing driver


    }
}
