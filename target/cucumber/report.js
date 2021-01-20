$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featurefile/NewContactPageFeature.feature");
formatter.feature({
  "name": "New ContactPage Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Contact Button feature",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is in Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewContactPageSteps.user_is_in_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click The Contact link",
  "keyword": "When "
});
formatter.match({
  "location": "NewContactPageSteps.user_Click_The_Contact_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to Land On Contact Page",
  "keyword": "Then "
});
formatter.match({
  "location": "NewContactPageSteps.user_should_be_able_to_Land_On_Contact_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/featurefile/freeCRM.feature");
formatter.feature({
  "name": "FreeCRM Application Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is Able To Login HomePage",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is in login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter user_name and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enter_user_name_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_should_be_able_to_land_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
});