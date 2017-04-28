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
formatter.result({
  "duration": 12311552384,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot get automation extension\nfrom unknown error: page could not be found: chrome-extension://aapnijgdinlhnhlmodcfapnahmbfebeb/_generated_background_page.html\n  (Session info: chrome\u003d57.0.2987.133)\n  (Driver info: chromedriver\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9),platform\u003dWindows NT 6.1.7600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.08 seconds\nBuild info: version: \u00273.1.0\u0027, revision: \u0027b94c902\u0027, time: \u00272017-02-16 12:21:31 -0800\u0027\nSystem info: host: \u0027PIYUSHNAUTIYAL-\u0027, ip: \u0027192.168.10.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_45\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9), userDataDir\u003dC:\\Windows\\TEMP\\scoped_dir8064_24809}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d57.0.2987.133, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 8d223e91a87924b2fd5ed0931a02e9d5\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:658)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:882)\r\n\tat Stepdef.Logindem.url(Logindem.java:17)\r\n\tat ✽.Given URL(src/main/resources/Excelupload.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Takefee.logindetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Takefee.logintoerp()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Excelupload.insertdatainexcel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Excelupload.uploadexcel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Excelupload.assertdateformat()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    },
    {
      "val": "2",
      "offset": 43
    },
    {
      "val": "3",
      "offset": 69
    }
  ],
  "location": "Excelupload.selectallfilter_feetype_and_adjusttype_and_selectinstallment(String,String,String)"
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