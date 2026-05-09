$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Account feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@secondTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.LoginSteps.user_launch_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Cart link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.LoginSteps.user_clicks_on_cart_link()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});"
});
});