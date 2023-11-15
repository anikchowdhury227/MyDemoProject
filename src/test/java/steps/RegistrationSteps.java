package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.BasePage;
import pages.MyAccountPage;

import java.util.concurrent.TimeUnit;

public class RegistrationSteps  {
    MyAccountPage mp;
    public RegistrationSteps(){
         mp=new MyAccountPage();

    }

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        mp.open_chrome_browser();

        }

    @When("I enter a valid Username {string}")
    public void i_enter_a_valid_username(String userName) throws InterruptedException {
       mp.i_enter_valid_username(userName);
    }
    @When("I enter a valid Email address {string}")
    public void i_enter_a_valid_email_address(String email) {
        mp.i_enter_valid_emai(email);

    }
    @When("I enter a valid Password {string}")
    public void i_enter_a_valid_password(String password) {
        mp.i_enter_valid_password(password);

    }
    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
      mp.i_click_registration_button();
    }
    @Then("I should be automatically redirected to the customer login page")
    public void i_should_be_automatically_redirected_to_the_customer_login_page() {

//
//
//        WebElement dashboardText = driver.findElement(By.linkText("Dashboard"));
//        String dashboardTextValue = dashboardText.getText();
//
//        if (dashboardTextValue.equals("Dashboard")) {
//            System.out.println("Verification Passed: Dashboard text is displayed.");
//        } else {
//            System.out.println("Verification Failed: Dashboard text is not displayed.");
//        }
 }

    }


