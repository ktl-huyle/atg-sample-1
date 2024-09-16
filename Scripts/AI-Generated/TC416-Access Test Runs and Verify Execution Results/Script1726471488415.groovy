import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/overview"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/overview")

"Step 4: Click on link testRuns3 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC416/Step 4-Click on link testRuns3 - Navigate to page teamprojectexecutions.png')

"Step 5: Click on div failedTests (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests'))

WebUI.takeScreenshot(reportLocation + '/TC416/Step 5-Click on div failedTests object10.png')

"Step 6: Click on link penTestIssuesSprintA -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_penTestIssuesSprintA'))

WebUI.takeScreenshot(reportLocation + '/TC416/Step 6-Click on link penTestIssuesSprintA - Navigate to page teamprojectexecutions.png')

"Step 7: Click on link testRuns6 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC416/Step 7-Click on link testRuns6 - Navigate to page teamprojectoverview.png')

"Step 8: Click on link testRuns3 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC416/Step 8-Click on link testRuns3 - Navigate to page teamprojectexecutions.png')

"Step 9: Click on div failedTests (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests'))

WebUI.takeScreenshot(reportLocation + '/TC416/Step 9-Click on div failedTests object10.png')

"Step 10: Click on link penTestIssuesSprintA -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_penTestIssuesSprintA'))

WebUI.takeScreenshot(reportLocation + '/TC416/Step 10-Click on link penTestIssuesSprintA - Navigate to page teamprojectexecutions.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC416-Access Test Runs and Verify Execution Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}