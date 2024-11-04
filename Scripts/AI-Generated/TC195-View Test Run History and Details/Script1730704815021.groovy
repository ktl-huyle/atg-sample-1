import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to team/*/project/*/test-project"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-project")

"Step 4: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 4-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on header testRuns (EPPsAutomationTestCaseRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 5-Click on header testRuns EPPsAutomationTestCaseRun.png')

"Step 6: Click on button sessionControls (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionControls', ['button_sessionControls_class': button_sessionControls_class, 'button_sessionControls_internalRoleTabName': button_sessionControls_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 6-Click on button sessionControls Sessions2.png')

"Step 7: Click on div historyInfo (HistorySchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 7-Click on div historyInfo HistorySchedule.png')

"Step 8: Click on header testRuns (EPPsAutomationTestCaseRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 8-Click on header testRuns EPPsAutomationTestCaseRun.png')

"Step 9: Click on header testRuns (EPPsAutomationTestCaseRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 9-Click on header testRuns EPPsAutomationTestCaseRun.png')

"Step 10: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 10-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 11: Click on button Action1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Action1'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 11-Click on button Action1.png')

"Step 12: Click on button dynamicActions (Action2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicActions_1', ['button_dynamicActions_nthChild': button_dynamicActions_nthChild, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 12-Click on button dynamicActions Action2.png')

"Step 13: Click on button dynamicActions (Action2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicActions_1', ['button_dynamicActions_nthChild': button_dynamicActions_nthChild_1, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 13-Click on button dynamicActions Action2.png')

"Step 14: Click on button dynamicActions (Action3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicActions_1', ['button_dynamicActions_nthChild': button_dynamicActions_nthChild_2, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 14-Click on button dynamicActions Action3 - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC195-View Test Run History and Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}