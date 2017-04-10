Feature: Logindemoerp

  Scenario Outline: Login
    Given URL
    When logingdetails "<username>" and "<password>"
    Then Loginbutton

    Examples: 
      |username|password|
      |admin|Admin@987|
