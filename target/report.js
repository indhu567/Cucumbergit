$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/fb.feature");
formatter.feature({
  "name": "Validate the Facebook Login Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating Login With Correct Username and Correct Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on facebook page on chrome browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should verify homepage is displayed or not",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});