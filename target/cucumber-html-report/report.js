$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/KiwiSaverRetirementCalculator.feature");
formatter.feature({
  "name": "Westpac KiwiSaver Scheme Risk Profiler and Retirement Calculator",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UATTest"
    }
  ]
});
formatter.scenario({
  "name": "Verify Information Icon on KiwiSaver Calculator",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UATTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user open a browser, enters to Westpac New Zealand Limited website",
  "keyword": "Given "
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.the_user_open_a_browser_enters_to_Westpac_New_Zealand_Limited_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigates to KiwiSaver \u003e KiwiSaver calculators \u003e Click here to get started button",
  "keyword": "And "
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.navigates_to_KiwiSaver_KiwiSaver_calculators_Click_here_to_get_started_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on information icon besides the \"Employment Status\" field",
  "keyword": "When "
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.the_user_clicks_on_information_icon_besides_the_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message \"If you are earning a salary or wage, select ‘Employed’. Your employer contributions will be automatically calculated at a rate of 3% of your before-tax salary or wages. You can also select ‘Self-employed’ or ‘Not employed’ and then enter below (in the Voluntary contributions field), the amount and frequency of any contributions that you wish to make.\" is displayed below the \"Employment Status\" field",
  "keyword": "Then "
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.message_is_displayed_below_the_field(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Retirement Projected Balance",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UATTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user open a browser, enters to Westpac New Zealand Limited website",
  "keyword": "Given "
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.the_user_open_a_browser_enters_to_Westpac_New_Zealand_Limited_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigates to KiwiSaver \u003e KiwiSaver calculators \u003e Click here to get started button",
  "keyword": "And "
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.navigates_to_KiwiSaver_KiwiSaver_calculators_Click_here_to_get_started_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user put on values on fields",
  "keyword": "When "
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.the_user_put_on_values_on_fields()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[text()\u003d\u0027295,655\u0027]\"}\n  (Session info: chrome\u003d74.0.3729.169)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-KCU6GMJ\u0027, ip: \u0027192.168.178.24\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\mehol\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53229}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.169, webStorageEnabled: true}\nSession ID: d7a38746aae77d88a93b8f72cbbac11e\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003d\u0027295,655\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat stepDefinition.KiwiSaverRetirementCalculator.the_user_put_on_values_on_fields(KiwiSaverRetirementCalculator.java:343)\r\n\tat ✽.The user put on values on fields(src/test/resources/feature/KiwiSaverRetirementCalculator.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "it will calculate their KiwiSaver projected balance at retirement",
  "keyword": "Then "
});
formatter.match({
  "location": "KiwiSaverRetirementCalculator.it_will_calculate_their_KiwiSaver_projected_balance_at_retirement()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://www.westpac.co.nz/kiwisaver/calculators/kiwisaver-calculator/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});