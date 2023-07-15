Feature: Amazon Web Register Test Cases
  Scenario: TC0001 Register Failure Test Case
    Given Browser da url aç
    When Login butonuna tiklanir
    And Amazon hesabı oluşturun butonuna tiklanir
    And "AdSoyadName" alanına metin girisi yapılır: "furkan"
    And "Telno" alanına telno girisi yapılır: "05000000000"
    And Parola alanını doldur: "abcdef12"
    And Parola kontrol alanını doldur: "abcdef12"
    And Check-Box butonuna tiklanir
    Then Register Devam Et butonuna tiklanir



