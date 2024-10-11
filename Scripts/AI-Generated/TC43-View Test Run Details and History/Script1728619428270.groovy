import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

WebUI.takeScreenshot(reportLocation + '/TC43/Step 4-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on header testRunDetails (EPPsAutomationTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 5-Click on header testRunDetails EPPsAutomationTest.png')

"Step 6: Click on button sessionTab (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionTab"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionTab', ['button_sessionTab_class': button_sessionTab_class, 'button_sessionTab_internalRoleTabName': button_sessionTab_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 6-Click on button sessionTab Sessions.png')

"Step 7: Click on div historyInfo (HistorySchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 7-Click on div historyInfo HistorySchedule.png')

"Step 8: Click on header testRunDetails (EPPsAutomationTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 8-Click on header testRunDetails EPPsAutomationTest.png')

"Step 9: Click on header testRunDetails (EPPsAutomationTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 9-Click on header testRunDetails EPPsAutomationTest.png')

"Step 10: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 10-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 11: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 11-Click on button object.png')

"Step 12: Click on button dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 12-Click on button dynamicObject object2.png')

"Step 13: Click on button dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_1, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 13-Click on button dynamicObject object2.png')

"Step 14: Click on button dynamicObject (object3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_2, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 14-Click on button dynamicObject object3 - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC43-View Test Run Details and History_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}