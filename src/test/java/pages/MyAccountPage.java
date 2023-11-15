package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage{

    public void i_enter_valid_username(String un) throws InterruptedException {
        Thread.sleep(5);
        driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys(un);
        System.out.println("I enter a valid Username");

    }

    public void i_enter_valid_emai(String em){
        driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys(em);
    }
    public void i_enter_valid_password(String pwd){
        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys(pwd);
        System.out.println("I enter a valid Password");
    }

    public void i_click_registration_button(){
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")).click();
        System.out.println("I submit the registration form");
    }


}
