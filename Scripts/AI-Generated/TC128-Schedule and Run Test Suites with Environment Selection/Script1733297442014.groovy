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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions_2'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 4-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 5-Click on button ScheduleTestRun.png')

"Step 6: Click on link ClickHereToRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ClickHereToRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 6-Click on link ClickHereToRefresh.png')

"Step 7: Click on div TestSuitesAPI"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesAPI'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 7-Click on div TestSuitesAPI.png')

"Step 8: Enter input value in input ReactSelectInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_ReactSelectInput'), input_ReactSelectInput)

WebUI.takeScreenshot(reportLocation + '/TC128/Step 8-Enter input value in input ReactSelectInput.png')

"Step 9: Click on div TestSuitesAPI2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesAPI2'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 9-Click on div TestSuitesAPI2.png')

"Step 10: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 10-Click on input Name.png')

"Step 11: Enter input value in input Name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), input_Name2)

WebUI.takeScreenshot(reportLocation + '/TC128/Step 11-Enter input value in input Name2.png')

"Step 12: Click on div SimpleTabPanel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SimpleTabPanel'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 12-Click on div SimpleTabPanel.png')

"Step 13: Click on div SelectEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment_1'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 13-Click on div SelectEnvironment.png')

"Step 14: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 14-Click on item MoreOptions.png')

"Step 15: Click on span ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 15-Click on span ChromeHeadless.png')

"Step 16: Click on div DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 16-Click on div DesktopBrowsers.png')

"Step 17: Click on div TestSuitesAPI3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesAPI3'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 17-Click on div TestSuitesAPI3.png')

"Step 18: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 18-Click on button Save.png')

"Step 19: Click on div ExecutionProfileList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ExecutionProfileList'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 19-Click on div ExecutionProfileList.png')

"Step 20: Click on div ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 20-Click on div ScheduleTestRun.png')

"Step 21: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 21-Click on button Run.png')

"Step 22: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 22-Click on button ScheduleTestRun.png')

"Step 23: Click on div TestSuitesAPI"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesAPI'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 23-Click on div TestSuitesAPI.png')

"Step 24: Enter input value in input ReactSelectInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_ReactSelectInput2'), input_ReactSelectInput2)

WebUI.takeScreenshot(reportLocation + '/TC128/Step 24-Enter input value in input ReactSelectInput2.png')

"Step 25: Click on div TestSuitesAPI4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesAPI4'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 25-Click on div TestSuitesAPI4.png')

"Step 26: Click on div SelectEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 26-Click on div SelectEnvironment2.png')

"Step 27: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 27-Click on item MoreOptions.png')

"Step 28: Click on span ChromeHeadless"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_ChromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 28-Click on span ChromeHeadless.png')

"Step 29: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 29-Click on label DesktopBrowsers.png')

"Step 30: Click on div TestSuitesAPI3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesAPI3'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 30-Click on div TestSuitesAPI3.png')

"Step 31: Click on input IncludeAPICalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_IncludeAPICalls'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 31-Click on input IncludeAPICalls.png')

"Step 32: Click on div selectActiveTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_selectActiveTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 32-Click on div selectActiveTunnels.png')

"Step 33: Click on div reactSelectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_reactSelectOption'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 33-Click on div reactSelectOption.png')

"Step 34: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 34-Click on button Save.png')

"Step 35: Click on div executionProfileContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_executionProfileContainer'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 35-Click on div executionProfileContainer.png')

"Step 36: Click on div reactSelectOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_reactSelectOption2'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 36-Click on div reactSelectOption2.png')

"Step 37: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 37-Click on input Name.png')

"Step 38: Enter input value in input Name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_Name'), input_Name2_1)

WebUI.takeScreenshot(reportLocation + '/TC128/Step 38-Enter input value in input Name2.png')

"Step 39: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 39-Click on button Run.png')

"Step 40: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 40-Click on button ScheduleTestRun.png')

"Step 41: Click on div TestSuitesAPI"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesAPI'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 41-Click on div TestSuitesAPI.png')

"Step 42: Enter input value in input reactSelectInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_reactSelectInput_1'), input_reactSelectInput)

WebUI.takeScreenshot(reportLocation + '/TC128/Step 42-Enter input value in input reactSelectInput.png')

"Step 43: Click on div testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 43-Click on div testSuites.png')

"Step 44: Click on div SelectEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment_1'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 44-Click on div SelectEnvironment.png')

"Step 45: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 45-Click on item MoreOptions.png')

"Step 46: Click on div chromeHeadless -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_chromeHeadless'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 46-Click on div chromeHeadless - Navigate to page .png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC128-Schedule and Run Test Suites with Environment Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}