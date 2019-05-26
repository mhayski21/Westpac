# Westpac
 A java automation testing framework to test the features and functionalities of KiwiSaver Retirement Calculator

# Project Title
Answered automation testing for Westpac assessment.
It is a Cucumber BDD Testing and TestNG framework.

## Getting Started
--

### Prerequisites
1 Eclipse IDE (preferably newer version)
2 Java 1.8 prefered (or higher)
3 Maven

### Installing
- Add the ff in the environment variable
	- maven/bin
	- java/bin

Extracting Project Step
1. Import project from the repository to Eclipse IDE.
2. Right Click on project name > hover to Mave > Click Update Project
3. Tick "Force Update of Snapshots/Releases"
4. Click on IDE Help menu > select Eclipse Marketplace > Search Cucumber then Install
5. Click on IDE Help menu > select Install New Software : install the following
  - Click Add Type on testNG on name, then paste in the Location field: http://beust.com/eclipse/6.9.11 or check compatible testNG version of your IDE
  - Repeat the following:
    name: cucumber, location: https://cucumber.io/cucumber-eclipse/update-site ()

## Running the tests
To run each scenario
- go to src>test>resources>features, then click on "KiwiSaverRetirementCalculator.feature".
- Right click on desired scenario to run, click Run As > Cucumber Feature.

To run all scenarios
- Right click on the upper part of the file ('Feature' line), click Run As > Cucumber Feature.
- To run based on the tags, go to src>test>java>testRunner>TestRunnerKiwiSaverCalculator.java. Change the 'tags' based on the desired test tag.
Right click on the classfile > click Run As > TestNG Test.
- Report is generated here: target\cucumber-html-report

### Project Structure/Details

KiwiSaverRetirementCalculator.feature - Test Scenarios are added here.
KiwiSaverRetirementCalculator.java - Step Definitions of the test scenarios
TestRunnerKiwiSaverCalculator.java - class where tags, features and plugins are added
CommonMethods.java - methods that is reusable.
BaseUtil.java - some of the public variables are added here.
target\cucumber-html-report - HTML file where test report is generated and can be retrieved.
browser-config.properties = xpath collections of westpac website

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management
