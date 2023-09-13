package qaacademy;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioAutomationTesting1 {
    static WebDriver driver;
    @Test 
    public void preencherFormulario() throws InterruptedException{

        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).sendKeys("João Victor");
        driver.findElement(By.xpath("//*[@placeholder=\"Last Name\"]")).sendKeys("Lessa");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("Rua Nilza Brito 51");
        driver.findElement(By.xpath("//*[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("joaoteste@teste.com");
        driver.findElement(By.xpath("//*[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("(31)8915-8365");



    }

    @AfterClass
    public static void after ()throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }
}
