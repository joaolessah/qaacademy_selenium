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

    @Test
    public void testeSeleniumEnviarTextosParaTela() throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://qaacademy.com.br/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button[1]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Nome']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Nome']")).sendKeys("João Lessa");

        driver.findElement(By.xpath("//input[@placeholder='Email']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("joaovictor@gmail.com");

        driver.findElement(By.xpath("//span[contains(text(),'Enviar')]")).click();
        
    }
}
