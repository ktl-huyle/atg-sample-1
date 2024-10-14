import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on link testSuiteNavigation (TestSuitesCPACDECPreapprovalBind) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteNavigation', ['link_testSuiteNavigation_internalRoleLinkName': link_testSuiteNavigation_internalRoleLinkName, 'link_testSuiteNavigation_team_id': link_testSuiteNavigation_team_id, 'link_testSuiteNavigation_project_id': link_testSuiteNavigation_project_id, 'link_testSuiteNavigation_test_suites_id': link_testSuiteNavigation_test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 4-Click on link testSuiteNavigation TestSuitesCPACDECPreapprovalBind - Navigate to page teamprojecttest-designtest-suites.png')

"Step 5: Click on link testResults (testSuiteDetails) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testResults', ['link_testResults_internalRoleRowName': link_testResults_internalRoleRowName, 'link_testResults_project_id': link_testResults_project_id, 'link_testResults_executions_id': link_testResults_executions_id, 'link_testResults_team_id': link_testResults_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 5-Click on link testResults testSuiteDetails - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 6-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 7: Click on div failedTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_failedTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 7-Click on div failedTestSuite.png')

"Step 8: Click on button GoToTestResultDetails -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_GoToTestResultDetails'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 8-Click on button GoToTestResultDetails - Navigate to page teamprojectexecutions.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC38-View Test Results from Executions in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}