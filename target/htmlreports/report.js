$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/goToFrame.feature");
formatter.feature({
  "line": 1,
  "name": "Test user can click additional exercises tab",
  "description": "",
  "id": "test-user-can-click-additional-exercises-tab",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user should be able to click additioanl exercises",
  "description": "",
  "id": "test-user-can-click-additional-exercises-tab;user-should-be-able-to-click-additioanl-exercises",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "i am on toolslist website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i enter valid username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i enter valid password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i click login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click additional exercises",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click go to frame",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "safebear page is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "safebear text is click",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be navigated to safebear Live site",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.i_am_on_toolslist_website()"
});
formatter.result({
  "duration": 4177773411,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_valid_username()"
});
formatter.result({
  "duration": 143172093,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_enter_valid_password()"
});
formatter.result({
  "duration": 89782691,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_login()"
});
formatter.result({
  "duration": 1173512096,
  "status": "passed"
});
formatter.match({
  "location": "AdditionalExercisesStepDefinition.user_click_additional_exercises()"
});
formatter.result({
  "duration": 727496174,
  "status": "passed"
});
formatter.match({
  "location": "goToFrameStepDefinition.click_go_to_frame()"
});
formatter.result({
  "duration": 30540930293,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@target\u003d\"_blank\"]//img\"}\n  (Session info: chrome\u003d74.0.3729.169)\n  (Driver info: chromedriver\u003d2.46.628411 (3324f4c8be9ff2f70a05a30ebc72ffb013e1a71e),platform\u003dMac OS X 10.13.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Yemis-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:28:2359:e9be:eede%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628411 (3324f4c8be9ff2..., userDataDir: /var/folders/4r/svs2hp7x42n...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62280}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.169, webStorageEnabled: true}\nSession ID: 4b178e9959b3a2dc6222d7f84e696483\n*** Element info: {Using\u003dxpath, value\u003d//a[@target\u003d\"_blank\"]//img}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.getWrappedElement(Unknown Source)\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\n\tat java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\n\tat java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\n\tat java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\n\tat pages.GoToFramePage.clickSafeBearImage(GoToFramePage.java:34)\n\tat stepDefinition.goToFrameStepDefinition.click_go_to_frame(goToFrameStepDefinition.java:44)\n\tat ✽.And click go to frame(Feature/goToFrame.feature:10)\n",
  "status": "failed"
});
formatter.match({
  "location": "goToFrameStepDefinition.safebear_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "goToFrameStepDefinition.safebear_text_is_click()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "goToFrameStepDefinition.user_should_be_navigated_to_safebear_Live_site()"
});
formatter.result({
  "status": "skipped"
});
});