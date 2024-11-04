import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 4: Click on div HistorySchedule"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_HistorySchedule'))

WebUI.takeScreenshot(reportLocation + '/TC119/Step 4-Click on div HistorySchedule.png')

"Step 5: Click on header EPPsAutomationTestCaseRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/header_EPPsAutomationTestCaseRun'))

WebUI.takeScreenshot(reportLocation + '/TC119/Step 5-Click on header EPPsAutomationTestCaseRun.png')

"Step 6: Click on header EPPsAutomationTestCaseRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/header_EPPsAutomationTestCaseRun'))

WebUI.takeScreenshot(reportLocation + '/TC119/Step 6-Click on header EPPsAutomationTestCaseRun.png')

"Step 7: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC119/Step 7-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 8: Click on button Action1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Action1'))

WebUI.takeScreenshot(reportLocation + '/TC119/Step 8-Click on button Action1.png')

"Step 9: Click on button actionOptions (Action2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions', ['button_actionOptions_nthChild': button_actionOptions_nthChild, 'button_actionOptions_divNthChild': button_actionOptions_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC119/Step 9-Click on button actionOptions Action2.png')

"Step 10: Click on button actionOptions (Action2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions', ['button_actionOptions_nthChild': button_actionOptions_nthChild_1, 'button_actionOptions_divNthChild': button_actionOptions_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC119/Step 10-Click on button actionOptions Action2.png')

"Step 11: Click on button actionOptions (Action3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_actionOptions', ['button_actionOptions_nthChild': button_actionOptions_nthChild_2, 'button_actionOptions_divNthChild': button_actionOptions_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC119/Step 11-Click on button actionOptions Action3 - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC119-View and Verify Execution Details of Automated Test Cases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}