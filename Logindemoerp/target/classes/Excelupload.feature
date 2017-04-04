
Feature: Logindemoerp


@tag1
Scenario: Excelupload
Given URL
When Logindetails
Then LogintoERP
Then Insertdatainexcel
Then Uploadexcel
Then Selectallfilter feetype"2" and adjusttype "2" and selectinstallment "3"
And assertdateformat
Then clickonverify
Then clickonsubmitfee
And Verifyamountonfeeentry  
