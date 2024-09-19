import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class SearchAirpods {
    WebDriver webDriver;

    public void launchBrowser(){
        System.setProperty("webDriver.chrome.driver","C:/Users/karth/Downloads/chromedriver-win64");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com");
    }

    public void searchProducts(){
        WebElement webElement = webDriver.findElement(By.id("APjFqb"));
        webElement.sendKeys("flipkart.com");
        webElement.sendKeys(Keys.RETURN);
        webElement = webDriver.findElement(By.cssSelector("h3"));
        webElement.click();
    }

    public void searchAirpods(){
        WebElement webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("Apple Airpods");
        webElement.sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) throws InterruptedException {
        SearchAirpods searchAirpods =new SearchAirpods();
        searchAirpods.launchBrowser();
        Thread.sleep(2000);
        searchAirpods.searchProducts();
        Thread.sleep(2000);
        searchAirpods.searchAirpods();
    }

}
