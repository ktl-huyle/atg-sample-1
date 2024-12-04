import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

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

"Step 4: Click on link dynamicObject (CPACDECPreapprovalBind2) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_dynamicObject', ['link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id, 'test_suites_id': test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on link dynamicObject CPACDECPreapprovalBind2 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 5: Click on link dynamicObject (FailedTestSuite2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_dynamicObject', ['link_dynamicObject_internalRoleRowName': link_dynamicObject_internalRoleRowName, 'team_id': team_id_1, 'executions_id': executions_id, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on link dynamicObject FailedTestSuite2 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link TestResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on link TestResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 7: Click on div FailedCPACDECPreapproval"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_FailedCPACDECPreapproval'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on div FailedCPACDECPreapproval.png')

"Step 8: Click on button GoToTestResult -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_GoToTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on button GoToTestResult - Navigate to page teamprojectexecutions.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Verify Test Results for Cpac Preapproval_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}