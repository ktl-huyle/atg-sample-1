import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 3: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on div ExecutionProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfile'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 4-Click on div ExecutionProfile.png')

"Step 5: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 5-Click on button Save.png')

"Step 6: Click on div ExecutionProfileList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileList'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 6-Click on div ExecutionProfileList.png')

"Step 7: Click on div ScheduleTestRunStaging"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRunStaging'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 7-Click on div ScheduleTestRunStaging.png')

"Step 8: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 8-Click on input Name.png')

"Step 9: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC124/Step 9-Enter input value in input Name.png')

"Step 10: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 10-Click on button Run.png')

"Step 11: Click on div RowGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_RowGroup'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 11-Click on div RowGroup.png')

"Step 12: Click on div testingOptions (PrivateLocalTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingOptions', ['div_testingOptions_internalRoleCellName': div_testingOptions_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 12-Click on div testingOptions PrivateLocalTesting.png')

"Step 13: Click on div testingOptions (ApiMediaFiles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingOptions', ['div_testingOptions_internalRoleCellName': div_testingOptions_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 13-Click on div testingOptions ApiMediaFiles.png')

"Step 14: Click on div testingOptions (PrivateLocalTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingOptions', ['div_testingOptions_internalRoleCellName': div_testingOptions_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 14-Click on div testingOptions PrivateLocalTesting.png')

"Step 15: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 15-Click on button Delete.png')

"Step 16: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 16-Click on link Reports - Navigate to page teamproject.png')

"Step 17: Click on link TestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 17-Click on link TestRuns.png')

"Step 18: Click on div AllTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_AllTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 18-Click on div AllTestRuns.png')

"Step 19: Click on label testResultsSummary (FailedCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResultsSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResultsSummary', ['label_testResultsSummary_for': label_testResultsSummary_for, 'label_testResultsSummary_internalRoleRowName': label_testResultsSummary_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 19-Click on label testResultsSummary FailedCount.png')

"Step 20: Click on label testResultsSummary (PassedCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResultsSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResultsSummary', ['label_testResultsSummary_for': label_testResultsSummary_for_1, 'label_testResultsSummary_internalRoleRowName': label_testResultsSummary_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 20-Click on label testResultsSummary PassedCount.png')

"Step 21: Click on label testResultsSummary (FailedApiMediaFiles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResultsSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResultsSummary', ['label_testResultsSummary_for': label_testResultsSummary_for_2, 'label_testResultsSummary_internalRoleRowName': label_testResultsSummary_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 21-Click on label testResultsSummary FailedApiMediaFiles.png')

"Step 22: Click on label testResultsSummary (FailedPrivateLocal)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResultsSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResultsSummary', ['label_testResultsSummary_for': label_testResultsSummary_for_3, 'label_testResultsSummary_internalRoleRowName': label_testResultsSummary_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 22-Click on label testResultsSummary FailedPrivateLocal.png')

"Step 23: Click on button deleteAction (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction', ['button_deleteAction_internalRoleButtonName': button_deleteAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 23-Click on button deleteAction Delete.png')

"Step 24: Click on button DeleteDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_DeleteDialog'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 24-Click on button DeleteDialog.png')

"Step 25: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions_1'))

WebUI.takeScreenshot(reportLocation + '/TC124/Step 25-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC124-Execute and Manage Test Runs in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}