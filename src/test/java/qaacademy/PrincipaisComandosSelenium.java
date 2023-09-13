package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrincipaisComandosSelenium {

    @Test
    public void testeSeleniumClick() throws InterruptedException{

         WebDriver driver = new ChromeDriver();
         driver.get("https://qaacademy.com.br/");

         Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button[1]")).click();

         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\'dataItem-k3hb7c5j-comp-k0wqferu\']/a")).click();
        
    }
}
