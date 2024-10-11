import truetest.custom.TrueTestScripts
import truetest.common.scheduleAndRunMultipleTestExecutions
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 4-Click on link Executions2.png')

"Step 5: Schedule and run multiple test executions with various settings"

scheduleAndRunMultipleTestExecutions.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on div RowGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_RowGroup'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 6-Click on div RowGroup.png')

"Step 7: Click on div testRunDetails (PrivateLocalTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 7-Click on div testRunDetails PrivateLocalTesting.png')

"Step 8: Click on div testRunDetails (ApiMediaFiles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 8-Click on div testRunDetails ApiMediaFiles.png')

"Step 9: Click on div testRunDetails (PrivateLocalTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 9-Click on div testRunDetails PrivateLocalTesting.png')

"Step 10: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 10-Click on button Delete2.png')

"Step 11: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 11-Click on link Reports - Navigate to page teamproject.png')

"Step 12: Click on link TestRuns8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 12-Click on link TestRuns8.png')

"Step 13: Click on div AllTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_AllTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 13-Click on div AllTestRuns.png')

"Step 14: Click on label testCount (FailedCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testCount"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testCount', ['label_testCount_for': label_testCount_for, 'label_testCount_internalRoleRowName': label_testCount_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 14-Click on label testCount FailedCount.png')

"Step 15: Click on label testCount (PassedCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testCount"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testCount', ['label_testCount_for': label_testCount_for_1, 'label_testCount_internalRoleRowName': label_testCount_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 15-Click on label testCount PassedCount.png')

"Step 16: Click on label testCount (FailedApiMediaFiles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testCount"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testCount', ['label_testCount_for': label_testCount_for_2, 'label_testCount_internalRoleRowName': label_testCount_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 16-Click on label testCount FailedApiMediaFiles.png')

"Step 17: Click on label testCount (FailedPrivateLocal)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testCount"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testCount', ['label_testCount_for': label_testCount_for_3, 'label_testCount_internalRoleRowName': label_testCount_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 17-Click on label testCount FailedPrivateLocal.png')

"Step 18: Click on button delete (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_delete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_delete', ['button_delete_internalRoleButtonName': button_delete_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 18-Click on button delete Delete.png')

"Step 19: Click on button DeleteDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_DeleteDialog'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 19-Click on button DeleteDialog.png')

"Step 20: Click on link Executions15 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions15'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 20-Click on link Executions15 - Navigate to page teamprojecttest-runs.png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC108-Schedule and Verify Test Runs in Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}