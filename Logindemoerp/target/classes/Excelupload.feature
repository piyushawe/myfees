
Feature: Logindemoerp


@tag1
Scenario: Excelupload
Given URL
When Logindetails
Then LogintoERP
Then Insertdatainexcel
Then Uploadexcel
Then assertdateformat
Then Selectallfilter feetype"2" and adjusttype "2" and selectinstallment "3"
Then clickonverify
Then clickonsubmitfee
And Verifyamountonfeeentry  
