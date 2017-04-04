$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Excelupload.feature");
formatter.feature({
  "line": 2,
  "name": "Logindemoerp",
  "description": "",
  "id": "logindemoerp",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Excelupload",
  "description": "",
  "id": "logindemoerp;excelupload",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "URL",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Logindetails",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "LogintoERP",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Insertdatainexcel",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Uploadexcel",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Selectallfilter feetype\"2\" and adjusttype \"2\" and selectinstallment \"3\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "assertdateformat",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "clickonverify",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "clickonsubmitfee",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verifyamountonfeeentry",
  "keyword": "And "
});
formatter.match({
  "location": "Logindem.url()"
});
formatter.result({
  "duration": 16427213167,
  "status": "passed"
});
formatter.match({
  "location": "Takefee.logindetails()"
});
formatter.result({
  "duration": 216218356,
  "status": "passed"
});
formatter.match({
  "location": "Takefee.logintoerp()"
});
formatter.result({
  "duration": 649274985,
  "status": "passed"
});
formatter.match({
  "location": "Excelupload.insertdatainexcel()"
});
formatter.result({
  "duration": 318155933,
  "error_message": "java.lang.IllegalStateException: Cannot get a NUMERIC value from a STRING cell\r\n\tat org.apache.poi.hssf.usermodel.HSSFCell.typeMismatch(HSSFCell.java:654)\r\n\tat org.apache.poi.hssf.usermodel.HSSFCell.getNumericCellValue(HSSFCell.java:679)\r\n\tat Stepdef.Excelupload.insertdatainexcel(Excelupload.java:59)\r\n\tat ✽.Then Insertdatainexcel(src/main/resources/Excelupload.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Excelupload.uploadexcel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Excelupload.assertdateformat()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Excelupload.clickonverify()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Excelupload.clickonsubmitfee()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Excelupload.verifyamountonfeeentry()"
});
formatter.result({
  "status": "skipped"
});
});