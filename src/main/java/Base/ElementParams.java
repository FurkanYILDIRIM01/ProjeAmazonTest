package Base;

public class ElementParams {
    public static String BilgisayarButonCSS = "#anonCarousel1 > ol > li:nth-child(5) > a > span.GridPresets-module__gridPresetImageSection_2p68sRHExZZwCJorBe2_N3";

    public static String RegisterAdSoyadNameID = "ap_customer_name";
    public static String RegisterTelnoID = "ap_email";
    public static String RegisterPasswordID = "ap_password";
    public static String RegisterPasswordCheckID = "ap_password_check";
    public static String RegisterCheckBoxCss = "#ap_register_form > div > div > div.a-row.a-spacing-large > div > label > input[type=checkbox]";

    public static String RegisterDevamEtButtonCss = "#auth-continue > span";
    public static String cokSatanlarCSS = "#nav-xshop > a:nth-child(4)";
    public static String cokSatanlarTextCheckCSS = "#zg_banner_text";

    public String paramsRead(String fieldName) {
        String param = "";
        if (fieldName.equals("Çok Satanlar")) param = cokSatanlarCSS;
        else if (fieldName.equals("Çok satanlar Text kontrol")) param = cokSatanlarTextCheckCSS;

        return param;
    }

    public static String ButtonYeniCikanCSS = "#nav-xshop > a:nth-child(6)";
    public static String yeniCikanTextCheckCSS = "#zg_banner_text";
    public static String ButtonPrimeCSS = "#nav-link-amazonprime";
    public static String PrimeTextCheckXpath = "//*[@id=\"prime-benefit-module-content-delivery-headline\"]";
    public static String ButtonTumKategoriCSS = "#nav-search-dropdown-card";
    public static String ButtonTumKategoriBahceCSS = "#searchDropdownBox > option:nth-child(2)";
    public static String ButtonTumKategoriBebekCSS = "#searchDropdownBox > option:nth-child(3)";

    public String elementAddParams(String fieldName) {
        String elementsParam = "";
        if (fieldName.equals("Tüm Kategoriler")) elementsParam = ButtonTumKategoriCSS;
        else if (fieldName.equals("Bahçe")) elementsParam = ButtonTumKategoriBahceCSS;
        else if (fieldName.equals("Bebek")) elementsParam = ButtonTumKategoriBebekCSS;

        return elementsParam;
    }

    public static String ButtonTumuCSS = "#nav-hamburger-menu";
    public static String ButtonTumuTextCSS = "#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(1)";

    public static String ButtonHesabimCSS = "#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(15)";
    public static String ButtonHesabimSayfaTextCSS = "#a-page > div.a-container > div > div.a-row.a-spacing-base > h1";
    public static String HesabimSiparislerimButtonCSS = "#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1)";
    public static String GirisyapTextCSS = "#authportal-main-section > div:nth-child(2) > div.a-section.a-spacing-base > div.a-section > form > div > div > div > h1";
    public static String SearchTextCSS = "#twotabsearchtextbox";
    public static String SearchButtonCSS = "#nav-search-submit-button";
    public static String ProductClick = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[1]/span/a/div/img";
    public static String ProductTextCSS = "#productTitle";
    public static String ProductSepetClick = "//*[@id=\"add-to-cart-button\"]";
    public static String ProductSepetText = "//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span";



}
