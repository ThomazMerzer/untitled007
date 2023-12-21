import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

class OpenITL {
    void doSomething() {
        System.setProperty("webdriver.edge.driver", "C:\\usr\\bin\\edgedriver\\msedgedriver.exe");
        EdgeOptions opt = new EdgeOptions();
        opt.addArguments("--headless");
        opt.addArguments("--allow-ips=");

        EdgeDriver driver = new EdgeDriver(opt);
        try {
            driver.navigate().to("https://bing.com");

            WebElement element = driver.findElement(By.id("sb_form_q"));
            element.sendKeys("WebDriver");
            element.submit();

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
