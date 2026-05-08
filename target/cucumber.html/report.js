$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Account feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "cart",
  "description": "",
  "keyw  "k: "Scenario",
  "ta,
  "tags": [
    {"name": "@secondTest"
    }
  ]
});
formatter.before({
  "err  "error_mess"org.oporg.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: Expected browser binary location, but unable to find binary in default locatio\u0027moz:fimoz:firefoxOptions.\u0027 capability provided, and no binary flag set on the command line \nHost info: host: \u0027DESKTOP-KDTVFIM\u0027, ip: \u0027192.168.29.86\u0027\nBuild info: version: \u00274.43.0\u0027, revision: \u0027dd0f534\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.11\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCommand: [null, newSession {capabilities\u003d[Capabilities {acceptInsecureCerts: true, browserName: firefox, moz:firefoxOptions: {prefs: {remote.active-protocols: 1}}}]}]\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:114)\r\n\tat o\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java\n\tat orgat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.ja\r\n\tat orgat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.jav\r\n\tat orgat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.jav\r\n\tat orgat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:\n\tat o\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:\n\tat o\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:\n\tat o\tat org.openqa.selenium.remote.RemoteWebDriver.\u00\uinit\u003e(RemoteWebDriver.java:\n\tat o\tat org.openqa.selenium.firefox.FirefoxDriver.\u00\uinit\u003e(FirefoxDriver.java:13\tat\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u00\uinit\u003e(FirefoxDriver.java:\n\tat o\tat org.openqa.selenium.firefox.FirefoxD\u003cinit\u003e(Firef(FirefoxDriver.ja\r\n\tat orgat org.openqa.selenium.firefox.FirefoxD\u003cinit\u003e\u003e(FirefoxDriver.java\n\tat o\tat org.openqa.selenium.firefox.FirefoxDriver.\u00\uinit\u003e(FirefoxDriver.java\n\tat u\tat utils.Hooks.setUp(Hooks.java\n",
  "status": "failed"
});
formatformstep({
  "na
  "name": "User launch UR"k,
  "keyword": "Given "
});
formatter.matc"l{
  "location": "Steps.LoginSteps.user_launch_url()fo});
formatter.result({
  "status": "skippedformatter.step({
  "name": "User clicks Cart link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.LoginSteps.user_clicks_on_cart_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.quit()\" because the return value of \"utils.BrowserUtils.getDriver()\" is null\r\n\tat utils.Hooks.tearDown(Hooks.java:43)\r\n",
  "status": "failed"
});
});"
});
});