import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

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

TrueTestScripts.navigate("team/*/project/*")

"Step 4: Click on link Executions2 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 4-Click on link Executions2 - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 5-Click on button ScheduleTestRun.png')

"Step 6: Click on link Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 6-Click on link Refresh.png')

"Step 7: Click on div TestSuitePath"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitePath'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 7-Click on div TestSuitePath.png')

"Step 8: Enter input value in input TestSuiteInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_TestSuiteInput'), input_TestSuiteInput)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 8-Enter input value in input TestSuiteInput.png')

"Step 9: Click on div TestSuiteMediaFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuiteMediaFiles'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 9-Click on div TestSuiteMediaFiles.png')

"Step 10: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 10-Click on input Name.png')

"Step 11: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 11-Enter input value in input Name.png')

"Step 12: Click on div ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 12-Click on div ScheduleTestRun2.png')

"Step 13: Click on div SelectEnvironment3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment3'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 13-Click on div SelectEnvironment3.png')

"Step 14: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 14-Click on item MoreOptions.png')

"Step 15: Click on span ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 15-Click on span ChromeHeadless.png')

"Step 16: Click on div DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 16-Click on div DesktopBrowsers.png')

"Step 17: Click on div ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 17-Click on div ChromeHeadless.png')

"Step 18: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 18-Click on button Save3.png')

"Step 19: Click on div ExecutionProfileControl2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileControl2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 19-Click on div ExecutionProfileControl2.png')

"Step 20: Click on div ScheduleTestRunQAEnv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRunQAEnv'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 20-Click on div ScheduleTestRunQAEnv.png')

"Step 21: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 21-Click on button Run.png')

"Step 22: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 22-Click on button ScheduleTestRun.png')

"Step 23: Click on div TestSuitePath"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitePath'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 23-Click on div TestSuitePath.png')

"Step 24: Enter input value in input TestSuiteInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_TestSuiteInput2'), input_TestSuiteInput2)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 24-Enter input value in input TestSuiteInput2.png')

"Step 25: Click on div TestSuiteMediaFiles2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuiteMediaFiles2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 25-Click on div TestSuiteMediaFiles2.png')

"Step 26: Click on div SelectEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 26-Click on div SelectEnvironment2.png')

"Step 27: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 27-Click on item MoreOptions.png')

"Step 28: Click on span ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 28-Click on span ChromeHeadless.png')

"Step 29: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 29-Click on label DesktopBrowsers.png')

"Step 30: Click on div ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 30-Click on div ChromeHeadless.png')

"Step 31: Click on input IncludeAPICalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_IncludeAPICalls'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 31-Click on input IncludeAPICalls.png')

"Step 32: Click on div ActiveTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ActiveTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 32-Click on div ActiveTunnels.png')

"Step 33: Click on div ExecutionProfileOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileOption'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 33-Click on div ExecutionProfileOption.png')

"Step 34: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 34-Click on button Save3.png')

"Step 35: Click on div ExecutionProfileControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileControl'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 35-Click on div ExecutionProfileControl.png')

"Step 36: Click on div ScheduleTestRunStagingEnv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRunStagingEnv'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 36-Click on div ScheduleTestRunStagingEnv.png')

"Step 37: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 37-Click on input Name.png')

"Step 38: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), input_Name_1)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 38-Enter input value in input Name.png')

"Step 39: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 39-Click on button Run.png')

"Step 40: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 40-Click on button ScheduleTestRun.png')

"Step 41: Click on div TestSuitePath"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitePath'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 41-Click on div TestSuitePath.png')

"Step 42: Enter input value in input TestSuiteInput3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_TestSuiteInput3'), input_TestSuiteInput3)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 42-Enter input value in input TestSuiteInput3.png')

"Step 43: Click on div TestSuiteMediaFiles3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuiteMediaFiles3'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 43-Click on div TestSuiteMediaFiles3.png')

"Step 44: Click on div SelectEnvironment3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment3'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 44-Click on div SelectEnvironment3.png')

"Step 45: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 45-Click on item MoreOptions.png')

"Step 46: Click on div ChromeHeadless2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 46-Click on div ChromeHeadless2.png')

"Step 47: Click on div ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 47-Click on div ChromeHeadless.png')

"Step 48: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 48-Click on button Save3.png')

"Step 49: Click on div ExecutionProfileControl2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileControl2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 49-Click on div ExecutionProfileControl2.png')

"Step 50: Click on div ScheduleTestRunStagingEnv2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRunStagingEnv2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 50-Click on div ScheduleTestRunStagingEnv2.png')

"Step 51: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 51-Click on input Name.png')

"Step 52: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), input_Name_2)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 52-Enter input value in input Name.png')

"Step 53: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 53-Click on button Run.png')

"Step 54: Click on div RowGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_RowGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 54-Click on div RowGroup.png')

"Step 55: Click on div testRunCells (CellPrivateLocal)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 55-Click on div testRunCells CellPrivateLocal.png')

"Step 56: Click on div testRunCells (CellAPI)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 56-Click on div testRunCells CellAPI.png')

"Step 57: Click on div testRunCells (CellPrivateLocal)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 57-Click on div testRunCells CellPrivateLocal.png')

"Step 58: Click on button Close5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close5'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 58-Click on button Close5.png')

"Step 59: Click on link Reports2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 59-Click on link Reports2 - Navigate to page teamproject.png')

"Step 60: Click on link TestRuns5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 60-Click on link TestRuns5.png')

"Step 61: Click on div allTestRuns (AllTestRuns)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_allTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 61-Click on div allTestRuns AllTestRuns.png')

"Step 62: Click on label testCounts (FailedCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testCounts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testCounts', ['label_testCounts_for': label_testCounts_for, 'label_testCounts_internalRoleRowName': label_testCounts_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 62-Click on label testCounts FailedCount.png')

"Step 63: Click on label testCounts (PassedCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testCounts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testCounts', ['label_testCounts_for': label_testCounts_for_1, 'label_testCounts_internalRoleRowName': label_testCounts_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 63-Click on label testCounts PassedCount.png')

"Step 64: Click on label testCounts (FailedCount2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testCounts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testCounts', ['label_testCounts_for': label_testCounts_for_2, 'label_testCounts_internalRoleRowName': label_testCounts_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 64-Click on label testCounts FailedCount2.png')

"Step 65: Click on label testCounts (FailedCount3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testCounts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testCounts', ['label_testCounts_for': label_testCounts_for_3, 'label_testCounts_internalRoleRowName': label_testCounts_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 65-Click on label testCounts FailedCount3.png')

"Step 66: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 66-Click on button Delete.png')

"Step 67: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 67-Click on button Delete2.png')

"Step 68: Click on link Executions10 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions10'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 68-Click on link Executions10 - Navigate to page teamprojecttest-runs.png')

"Step 69: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC41-Execute and Schedule Test Runs in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}