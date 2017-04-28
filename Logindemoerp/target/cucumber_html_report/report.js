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
  "name": "assertdateformat",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Selectallfilter feetype\"2\" and adjusttype \"2\" and selectinstallment \"3\"",
  "keyword": "Then "
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
