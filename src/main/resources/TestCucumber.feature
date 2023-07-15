Feature: Amazon Web Test Cases

  Scenario: TC0001 Login Failure Test Case
    Given Browser da url aç
    When Login butonuna tiklanir
    And email alani doldur: "abcdefg@hotmail.comm"
    And Devam et butonuna tiklanir
    And Error text kontrolu: "Bu e-posta adresiyle bir hesap bulamıyoruz"
    Then Browser Kapat

  Scenario: TC0002 Gunun Firsatlari Click
    Given Browser da url aç
    When "günün fırsatları" butonuna tiklanir: "#nav-xshop > a:nth-child(5)"
    And gunun firsatlari text kontrol: "Fırsatlar"
    Then Browser Kapat

  Scenario: TC0003 Bilgisayar butonu tıkla
    Given Browser da url aç
    When "günün fırsatları" butonuna tiklanir: "#nav-xshop > a:nth-child(5)"
    And gunun firsatlari text kontrol: "Fırsatlar"
    And "Bilgisayar" butonuna tiklanir
    Then Browser Kapat

  Scenario: TC0004 Çok Satanlar-ParamsRead ile oluşturuldu
    Given Browser da url aç
    When "Çok Satanlar" butonuna tiklanir paramElement
    And Text Kontrolu paramElement: "Çok Satanlar"
    Then Browser Kapat


  Scenario: TC0005 Günün Fırsatları
    Given Browser da url aç
    When Çerez butonuna tiklanir
    And Günün Fırsatları butonuna tiklanir
    And gunun firsatlari text kontrol: "Fırsatlar"
    Then Browser Kapat

  Scenario: TC0006 Yeni Çikan Ürünler
    Given Browser da url aç
    When Yeni Çıkan butonuna tiklanir
    And Yeni Çıkan text kontrolu: "Yeni Gelen Ürünler"
    Then Browser Kapat

  Scenario: TC0007 Prime button
    Given Browser da url aç
    When Prime butonuna tiklanir
    And Prime text kontrolu: "Bedava ve hızlı teslimat"
    Then Browser Kapat

  Scenario: TC0008 Tum kategori
    Given Browser da url aç
    When Tum Kategori butonuna tiklanir
    And Tum Kategori-Bahce butonuna tiklanir
    Then Browser Kapat

  Scenario: TC0009 Tüm Kategori elementAddParams
    Given Browser da url aç
    When "Tüm Kategoriler" butonuna tiklanir paramsAddElemets
    And "Bahçe" butonuna tiklanir paramsAddElemets
    And "Bebek" butonuna tiklanir paramsAddElemets
    Then Browser Kapat


  Scenario: TC0010 Hesabım sayfa kontrol
    Given Browser da url aç
    When Çerez butonuna tiklanir
    And Tümü butonuna tıklanır
    And Hesabım butonuna tıklanır
    And Hesabım Sayfası text kontrolu
    Then Browser Kapat

  Scenario: TC0011 Hesabım-Siparişlerim sayfa kontrol
    Given Browser da url aç
    When Çerez butonuna tiklanir
    And Tümü butonuna tıklanır
    And Hesabım butonuna tıklanır
    And Hesabım Sayfası text kontrolu
    And Hesabım Siparislerim butonuna tıklanır
    And Giriş yap Sayfası text kontrolu
    Then Browser Kapat

  Scenario: TC0012 Arama alanı metin girişi
    Given Browser da url aç
    When Çerez butonuna tiklanir
    And Arama alani metin girişi yapılır: "apple macbook pro m2"
    And Arama butonuna tıklanır
    Then Browser Kapat


  Scenario: TC0013 Ürün ismi yazılır ve ilk gelen ürüne tıklanır
    Given Browser da url aç
    When Çerez butonuna tiklanir
    And Arama alani metin girişi yapılır: "ASUS Notebook Laptop X515EA-BQ3278,FHD IPS Ekran, Intel Core i5-1135G7 İşlemci"
    And Arama butonuna tıklanır
    And İlk gelen ürüne tıklanır
    And Gelen ürün text kontrolu: "ASUS Notebook Laptop X515EA-BQ3278,FHD IPS Ekran, Intel Core i5-1135G7 İşlemci,Intel® UHD Graphics, 8GB RAM, 512GB SSD, FreeDOS"
    Then Browser Kapat

  Scenario: TC0014 Ürün ismi yazılır - ilk gelen ürüne tıklanır ve sepete eklenir
    Given Browser da url aç
    When Çerez butonuna tiklanir
    And Arama alani metin girişi yapılır: "ASUS Notebook Laptop X515EA-BQ3278,FHD IPS Ekran, Intel Core i5-1135G7 İşlemci"
    And Arama butonuna tıklanır
    And İlk gelen ürüne tıklanır
    And Ürün sepete eklenir
    And Sepetteki ürün text kontrolu: "Sepete Eklendi"
    Then Browser Kapat