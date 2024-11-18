import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/*/project/*/test-project"

TrueTestScripts.navigate("team/*/project/*/test-project")

"Step 4: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 4-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on header testRunDetails (EPPsAutomationTestCaseRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 5-Click on header testRunDetails EPPsAutomationTestCaseRun.png')

"Step 6: Click on button sessionManagement (Sessions4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement', ['button_sessionManagement_class': button_sessionManagement_class, 'button_sessionManagement_internalRoleTabName': button_sessionManagement_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 6-Click on button sessionManagement Sessions4.png')

"Step 7: Click on div historyDetails (HistorySchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyDetails', ['div_historyDetails_internalHasText': div_historyDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 7-Click on div historyDetails HistorySchedule.png')

"Step 8: Click on header testRunDetails (EPPsAutomationTestCaseRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 8-Click on header testRunDetails EPPsAutomationTestCaseRun.png')

"Step 9: Click on header testRunDetails (EPPsAutomationTestCaseRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 9-Click on header testRunDetails EPPsAutomationTestCaseRun.png')

"Step 10: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 10-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 11: Click on button action (Action1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_action'))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 11-Click on button action Action1.png')

"Step 12: Click on button actionOptions (Action2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions', ['button_actionOptions_nthChild': button_actionOptions_nthChild, 'button_actionOptions_divNthChild': button_actionOptions_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 12-Click on button actionOptions Action2.png')

"Step 13: Click on button actionOptions (Action2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions', ['button_actionOptions_nthChild': button_actionOptions_nthChild_1, 'button_actionOptions_divNthChild': button_actionOptions_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 13-Click on button actionOptions Action2.png')

"Step 14: Click on button actionOptions (Action3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions', ['button_actionOptions_nthChild': button_actionOptions_nthChild_2, 'button_actionOptions_divNthChild': button_actionOptions_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC90/Step 14-Click on button actionOptions Action3 - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC90-Verify session management in test run details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}