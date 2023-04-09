import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //set up chrome browser
        driver.get("https://courses.ultimateqa.com/users/sign_in "); //open Url
        System.out.println("The title of the page is: " + driver.getTitle()); //printing title of the page
        System.out.println("The current URL is: " + driver.getCurrentUrl()); //printing the current url
        System.out.println("The page source is: " + driver.getPageSource()); //printing page source

        driver.findElement(By.id("user[email]")).sendKeys("Prime@gmail.com"); //finding email field and entering email ID
        driver.findElement(By.id("user[password]")).sendKeys("Prime123"); //finding password field and entering password

        driver.close(); //closing driver
    }
}
