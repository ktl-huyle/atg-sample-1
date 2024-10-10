import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
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

"Step 3: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on div ExecutionProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfile'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 4-Click on div ExecutionProfile.png')

"Step 5: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save_1'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 5-Click on button Save.png')

"Step 6: Click on div ExecutionProfileList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileList'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 6-Click on div ExecutionProfileList.png')

"Step 7: Click on div ScheduleTestRunStaging"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRunStaging'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 7-Click on div ScheduleTestRunStaging.png')

"Step 8: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 8-Click on input Name.png')

"Step 9: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC398/Step 9-Enter input value in input Name.png')

"Step 10: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 10-Click on button Run.png')

"Step 11: Click on div RowGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_RowGroup'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 11-Click on div RowGroup.png')

"Step 12: Click on div testingEnvironment (PrivateLocalTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingEnvironment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingEnvironment', ['div_testingEnvironment_internalRoleCellName': div_testingEnvironment_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 12-Click on div testingEnvironment PrivateLocalTesting.png')

"Step 13: Click on div testingEnvironment (ApiMediaFiles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingEnvironment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingEnvironment', ['div_testingEnvironment_internalRoleCellName': div_testingEnvironment_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 13-Click on div testingEnvironment ApiMediaFiles.png')

"Step 14: Click on div testingEnvironment (PrivateLocalTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingEnvironment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testingEnvironment', ['div_testingEnvironment_internalRoleCellName': div_testingEnvironment_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 14-Click on div testingEnvironment PrivateLocalTesting.png')

"Step 15: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 15-Click on button Delete.png')

"Step 16: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 16-Click on link Reports - Navigate to page teamproject.png')

"Step 17: Click on link TestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 17-Click on link TestRuns.png')

"Step 18: Click on div AllTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_AllTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 18-Click on div AllTestRuns.png')

"Step 19: Click on label testResults (FailedCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 19-Click on label testResults FailedCount.png')

"Step 20: Click on label testResults (PassedCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_1, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 20-Click on label testResults PassedCount.png')

"Step 21: Click on label testResults (FailedApiMediaFiles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_2, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 21-Click on label testResults FailedApiMediaFiles.png')

"Step 22: Click on label testResults (FailedPrivateLocal)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_3, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 22-Click on label testResults FailedPrivateLocal.png')

"Step 23: Click on button deleteAction (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction', ['button_deleteAction_internalRoleButtonName': button_deleteAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 23-Click on button deleteAction Delete.png')

"Step 24: Click on button DeleteDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_DeleteDialog'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 24-Click on button DeleteDialog.png')

"Step 25: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions_1'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 25-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC398-Manage and Delete Test Runs in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}