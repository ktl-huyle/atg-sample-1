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

"Step 3: Navigate to team/*/project/*/test-project"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-project")

"Step 4: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 4-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on header testRuns (EPPsAutomationTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 5-Click on header testRuns EPPsAutomationTest.png')

"Step 6: Click on button sessions (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessions', ['button_sessions_class': button_sessions_class, 'button_sessions_internalRoleTabName': button_sessions_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 6-Click on button sessions Sessions.png')

"Step 7: Click on div historySchedule (HistorySchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 7-Click on div historySchedule HistorySchedule.png')

"Step 8: Click on header testRuns (EPPsAutomationTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 8-Click on header testRuns EPPsAutomationTest.png')

"Step 9: Click on header testRuns (EPPsAutomationTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 9-Click on header testRuns EPPsAutomationTest.png')

"Step 10: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 10-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 11: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 11-Click on button object.png')

"Step 12: Click on button dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 12-Click on button dynamicObject object2.png')

"Step 13: Click on button dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_1, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 13-Click on button dynamicObject object2.png')

"Step 14: Click on button dynamicObject (object3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_2, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC182/Step 14-Click on button dynamicObject object3 - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC182-View Test Run History and Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}