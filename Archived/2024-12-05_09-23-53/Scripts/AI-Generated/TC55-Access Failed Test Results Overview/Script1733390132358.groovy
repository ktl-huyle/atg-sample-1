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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link reportsAndExecutions (Executions5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndExecutions', ['link_reportsAndExecutions_internalRoleLinkName': link_reportsAndExecutions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 4-Click on link reportsAndExecutions Executions5.png')

"Step 5: Click on link reportsAndExecutions (Executions5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndExecutions', ['link_reportsAndExecutions_internalRoleLinkName': link_reportsAndExecutions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 5-Click on link reportsAndExecutions Executions5.png')

"Step 6: Click on link reportsAndExecutions (Executions5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndExecutions', ['link_reportsAndExecutions_internalRoleLinkName': link_reportsAndExecutions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 6-Click on link reportsAndExecutions Executions5.png')

"Step 7: Click on link reportsAndExecutions (Executions5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndExecutions', ['link_reportsAndExecutions_internalRoleLinkName': link_reportsAndExecutions_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 7-Click on link reportsAndExecutions Executions5.png')

"Step 8: Click on div untitledTestRuns (UntitledTestRun4053)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_untitledTestRuns', ['div_untitledTestRuns_internalRoleCellName': div_untitledTestRuns_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 8-Click on div untitledTestRuns UntitledTestRun4053.png')

"Step 9: Click on div untitledTestRuns (UntitledTestRun4054)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_untitledTestRuns', ['div_untitledTestRuns_internalRoleCellName': div_untitledTestRuns_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 9-Click on div untitledTestRuns UntitledTestRun4054.png')

"Step 10: Click on header untitledTestRuns (UntitledTestRun4054)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_untitledTestRuns', ['header_untitledTestRuns_internalRoleHeadingName': header_untitledTestRuns_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 10-Click on header untitledTestRuns UntitledTestRun4054.png')

"Step 11: Click on button Details"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 11-Click on button Details.png')

"Step 12: Click on button TestRunDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestRunDetail'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 12-Click on button TestRunDetail.png')

"Step 13: Click on div backdropElements (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 13-Click on div backdropElements PopoverBackdrop.png')

"Step 14: Click on div UntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 14-Click on div UntitledTestRun.png')

"Step 15: Click on div UntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 15-Click on div UntitledTestRun.png')

"Step 16: Click on div UntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 16-Click on div UntitledTestRun.png')

"Step 17: Click on div MuiPaper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaper'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 17-Click on div MuiPaper.png')

"Step 18: Click on div MuiPaper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaper'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 18-Click on div MuiPaper.png')

"Step 19: Click on button TestRunDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestRunDetail'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 19-Click on button TestRunDetail.png')

"Step 20: Click on div backdropElements (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 20-Click on div backdropElements PopoverBackdrop.png')

"Step 21: Click on div MuiPaper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaper'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 21-Click on div MuiPaper.png')

"Step 22: Click on button failedTestResults (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_failedTestResults', ['button_failedTestResults_internalRoleTabName': button_failedTestResults_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 22-Click on button failedTestResults Sessions.png')

"Step 23: Click on button failedTestResults (FailedTestResults) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_failedTestResults', ['button_failedTestResults_internalRoleTabName': button_failedTestResults_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 23-Click on button failedTestResults FailedTestResults - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC55-Access Failed Test Results Overview_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}