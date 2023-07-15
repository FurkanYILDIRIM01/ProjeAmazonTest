package Pages;

import Base.BaseLib;
import Base.ElementParams;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Base.ElementParams.*;


public class HomePage extends BaseLib {

    private static WebDriver webDriver;
    ElementParams elementParams = new ElementParams();
    public static void setDriver (WebDriver driver) {webDriver =  driver;}
    @When("Login butonuna tiklanir")
    public HomePage LoginClick(){
        webDriver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        //throw new io.cucumber.java.PendingException();
        return this;
    }
    @When("email alani doldur: {string}")
    public HomePage emailDoldur(String text){
        webDriver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(text);
        return this;
    }
    @When("Devam et butonuna tiklanir")
    public HomePage DevamEtClick(){
        webDriver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        return this;
    }
    @When("Error text kontrolu: {string}")
    public HomePage errorTextKontrolu(String text){
        String value = webDriver.findElement(By.cssSelector("#auth-error-message-box > div > div > ul > li > span")).getText();
        Assert.assertEquals(text, value);
        Allure.addAttachment(text+ "error mesajı geldiği görülmüştür", "");
        attachScreenshot(webDriver);
        return this;
    }
    @When("{string} butonuna tiklanir: {string}")
    public HomePage cssSelectorClick(String fieldName, String cssSelector){
        webDriver.findElement(By.cssSelector(cssSelector)).click();
        return this;
    }
    @When("gunun firsatlari text kontrol: {string}")
    public HomePage FirsatlarTextKontrol(String text) {
        String value= webDriver.findElement(By.cssSelector("#slot-2 > div > h1")).getText();
        Assert.assertEquals(value,text);
        Allure.addAttachment(text+ "mesaj geldiği görülmüştür", "");
        attachScreenshot(webDriver);
        return this;
    }
    @When("{string} butonuna tiklanir")
    public HomePage cssSelectorClick(String fieldName){
        webDriver.findElement(By.cssSelector(BilgisayarButonCSS)).click();
        return this;
    }
    @When("{string} butonuna tiklanir paramElement")
    public HomePage cssFillElement(String fieldName){
        webDriver.findElement(By.cssSelector(elementParams.paramsRead(fieldName))).click();
        return this;
    }
    @When("Text Kontrolu paramElement: {string}")
    public HomePage cokSatanlartextKontrolu(String fieldName){
        String value =  webDriver.findElement(By.cssSelector(elementParams.paramsRead(fieldName))).getText();
        Assert.assertEquals(fieldName, value);
        Allure.addAttachment(   fieldName + ": mesaj geldiği görüntülenmiştir.","");
        attachScreenshot(webDriver);
        return this;
    }

    @When("Çerez butonuna tiklanir")
    public HomePage cerezClick(){
        webDriver.findElement(By.cssSelector("#sp-cc-rejectall-link")).click();
        return this;
    }
    @When("Günün Fırsatları butonuna tiklanir")
    public HomePage gununFirsatlariClick(){
        webDriver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).click();
        return this;
    }

    @When("Yeni Çıkan butonuna tiklanir")
    public HomePage cssSelectorClickYeniCikan(){
        webDriver.findElement(By.cssSelector(ButtonYeniCikanCSS)).click();
        return this;
    }
    @When("Yeni Çıkan text kontrolu: {string}")
    public HomePage yeniCikanTextKontrol(String text){
        String value = webDriver.findElement(By.cssSelector(yeniCikanTextCheckCSS)).getText();
        Assert.assertEquals(text, value);
        Allure.addAttachment(text+ "mesaj geldiği görülmüştür", "");
        attachScreenshot(webDriver);
        return this;
    }
    @When("Prime butonuna tiklanir")
    public HomePage cssSelectorClickPrime(){
        webDriver.findElement(By.cssSelector(ButtonPrimeCSS)).click();
        return this;
    }
    @When("Prime text kontrolu: {string}")
    public HomePage PrimeTextKontrol(String text){
        String value = webDriver.findElement(By.xpath(PrimeTextCheckXpath)).getText();
        Assert.assertEquals(text, value);
        Allure.addAttachment(text+ "mesaj geldiği görülmüştür", "");
        attachScreenshot(webDriver);
        return this;
    }
    @When("Tum Kategori butonuna tiklanir")
    public HomePage cssSelectorClickTumKatagori(){
        webDriver.findElement(By.cssSelector(ButtonTumKategoriCSS)).click();
        return this;
    }
    @When("Tum Kategori-Bahce butonuna tiklanir")
    public HomePage cssSelectorClickTumKatagoriBahce(){
        webDriver.findElement(By.cssSelector(ButtonTumKategoriBahceCSS)).click();
        return this;
    }
    ////////
    @When("{string} butonuna tiklanir paramsAddElemets")
    public HomePage cssParamsAddElement(String fieldName){
        webDriver.findElement(By.cssSelector(elementParams.elementAddParams(fieldName))).click();
        return this;
    }
    @When("Tümü butonuna tıklanır")
    public HomePage cssTumuButton(){
        webDriver.findElement(By.cssSelector(ButtonTumuCSS)).click();
        return this;
    }
    @When("Menü text kontrolu: {string}")
    public HomePage menuTextKontrolu(String text){
        String value = webDriver.findElement(By.cssSelector(ButtonTumuTextCSS)).getText();
        Assert.assertEquals(text, value);
        Allure.addAttachment(text+ "mesaj geldiği görülmüştür", "");
        attachScreenshot(webDriver);
        return this;
    }

    @When("Hesabım butonuna tıklanır")
    public HomePage cssHesabimButton(){
        webDriver.findElement(By.cssSelector(ButtonHesabimCSS)).click();
        return this;
    }
    @When("Hesabım Sayfası text kontrolu")
    public HomePage HesabimSayfaTextKontrolu(){
        String value = webDriver.findElement(By.cssSelector(ButtonHesabimSayfaTextCSS)).getText();
        Assert.assertEquals("Hesabım",value);
        Allure.addAttachment("mesaj geldiği görülmüştür", "");
        attachScreenshot(webDriver);
        return this;
    }
    @When("Hesabım Siparislerim butonuna tıklanır")
    public HomePage cssHesabimSiparislerimButton(){
        webDriver.findElement(By.cssSelector(HesabimSiparislerimButtonCSS)).click();
        return this;
    }
    @When("Giriş yap Sayfası text kontrolu")
    public HomePage GirisYapSayfaTextKontrolu(){
        String value = webDriver.findElement(By.cssSelector(GirisyapTextCSS)).getText();
        Assert.assertEquals("Giriş yap",value);
        Allure.addAttachment("mesaj geldiği görülmüştür", "");
        attachScreenshot(webDriver);
        return this;
    }
    @When("Arama alani metin girişi yapılır: {string}")
    public HomePage SearchTextDoldur(String text){
        webDriver.findElement(By.cssSelector(SearchTextCSS)).sendKeys(text);
        return this;
    }
    @When("Arama butonuna tıklanır")
    public HomePage cssAramaButton(){
        webDriver.findElement(By.cssSelector(SearchButtonCSS)).click();
        return this;
    }
    @When("İlk gelen ürüne tıklanır")
    public HomePage cssProductClick(){
        webDriver.findElement(By.xpath(ProductClick)).click();
        return this;
    }
    @When("Gelen ürün text kontrolu: {string}")
    public HomePage productTextKontrolu(String text){
        String value = webDriver.findElement(By.cssSelector(ProductTextCSS)).getText();
        Assert.assertEquals(text, value);
        Allure.addAttachment(text+ "mesaj geldiği görülmüştür", "");
        attachScreenshot(webDriver);
        return this;
    }
    @When("Ürün sepete eklenir")
    public HomePage cssProductSepetClick(){
        webDriver.findElement(By.xpath(ProductSepetClick)).click();
        return this;
    }
    @When("Sepetteki ürün text kontrolu: {string}")
    public HomePage productSepetTextKontrolu(String text){
        String value = webDriver.findElement(By.xpath(ProductSepetText)).getText();
        Assert.assertEquals(text, value);
        Allure.addAttachment(text+ "mesaj geldiği görülmüştür", "");
        attachScreenshot(webDriver);
        return this;
    }


}
