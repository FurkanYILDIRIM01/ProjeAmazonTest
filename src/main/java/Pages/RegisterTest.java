package Pages;

import Base.BaseLib;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Base.ElementParams.*;

public class RegisterTest extends BaseLib{
    private static WebDriver webDriver;
    public static void setDriver (WebDriver driver){
        webDriver =  driver;
    }

    @When("Amazon hesabı oluşturun butonuna tiklanir")
    public RegisterTest HesapClick(){
        webDriver.findElement(By.xpath("//*[@id=\"auth-create-account-link\"]/span")).click();
        return this;
    }

    @When("{string} alanına metin girisi yapılır: {string}")
    public RegisterTest idFillElementName(String fieldName, String text){
        webDriver.findElement(By.id(RegisterAdSoyadNameID)).sendKeys(text);
        return this;
    }
    @When("{string} alanına telno girisi yapılır: {string}")
    public RegisterTest idFillElementTelno(String fieldName, String text){
        webDriver.findElement(By.id(RegisterTelnoID)).sendKeys(text);
        return this;
    }
    @When("Parola alanını doldur: {string}")
    public RegisterTest passwordDoldur(String pass){
        webDriver.findElement(By.id(RegisterPasswordID)).sendKeys(pass);
        return this;
    }
    @When("Parola kontrol alanını doldur: {string}")
    public RegisterTest passwordCheckDoldur(String pass){
        webDriver.findElement(By.id(RegisterPasswordCheckID)).sendKeys(pass);
        return this;
    }
    @When("Check-Box butonuna tiklanir")
    public RegisterTest checkBoxClick(){
        webDriver.findElement(By.cssSelector(RegisterCheckBoxCss)).click();
        return this;
    }
    @Then("Register Devam Et butonuna tiklanir")
    public RegisterTest registerDevamEtClick(){
        webDriver.findElement(By.cssSelector(RegisterDevamEtButtonCss)).click();
        return this;
    }



}
