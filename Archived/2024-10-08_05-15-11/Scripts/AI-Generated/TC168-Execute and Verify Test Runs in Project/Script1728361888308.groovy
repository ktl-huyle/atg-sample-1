import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import truetest.common.scheduleAndRunTestSuite
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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions7'))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 4-Click on link Executions2.png')

"Step 5: Schedule a test run and execute the selected test suite."

scheduleAndRunTestSuite.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on div RowGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_RowGroup'))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 6-Click on div RowGroup.png')

"Step 7: Click on div dynamicObject (PrivateLocalTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject', ['div_dynamicObject_internalRoleCellName': div_dynamicObject_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 7-Click on div dynamicObject PrivateLocalTesting.png')

"Step 8: Click on div dynamicObject (ApiMediaFiles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject', ['div_dynamicObject_internalRoleCellName': div_dynamicObject_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 8-Click on div dynamicObject ApiMediaFiles.png')

"Step 9: Click on div dynamicObject (PrivateLocalTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject', ['div_dynamicObject_internalRoleCellName': div_dynamicObject_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 9-Click on div dynamicObject PrivateLocalTesting.png')

"Step 10: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 10-Click on button Delete.png')

"Step 11: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 11-Click on link Reports - Navigate to page teamproject.png')

"Step 12: Click on link TestRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns2_1'))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 12-Click on link TestRuns2.png')

"Step 13: Click on div AllTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_AllTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 13-Click on div AllTestRuns.png')

"Step 14: Click on label testSuiteResults (FailedCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults', ['label_testSuiteResults_for': label_testSuiteResults_for, 'label_testSuiteResults_internalRoleRowName': label_testSuiteResults_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 14-Click on label testSuiteResults FailedCount.png')

"Step 15: Click on label testSuiteResults (PassedCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults', ['label_testSuiteResults_for': label_testSuiteResults_for_1, 'label_testSuiteResults_internalRoleRowName': label_testSuiteResults_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 15-Click on label testSuiteResults PassedCount.png')

"Step 16: Click on label testSuiteResults (FailedApiMediaFiles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults', ['label_testSuiteResults_for': label_testSuiteResults_for_2, 'label_testSuiteResults_internalRoleRowName': label_testSuiteResults_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 16-Click on label testSuiteResults FailedApiMediaFiles.png')

"Step 17: Click on label testSuiteResults (FailedPrivateLocal)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults', ['label_testSuiteResults_for': label_testSuiteResults_for_3, 'label_testSuiteResults_internalRoleRowName': label_testSuiteResults_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 17-Click on label testSuiteResults FailedPrivateLocal.png')

"Step 18: Click on button deleteAction (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction', ['button_deleteAction_internalRoleButtonName': button_deleteAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 18-Click on button deleteAction Delete.png')

"Step 19: Click on button DeleteDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_DeleteDialog'))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 19-Click on button DeleteDialog.png')

"Step 20: Click on link Executions3 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions3'))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 20-Click on link Executions3 - Navigate to page teamprojecttest-runs.png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC168-Execute and Verify Test Runs in Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}