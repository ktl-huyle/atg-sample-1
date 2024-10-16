import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to team/{*}/project/{*}/overview"

TrueTestScripts.navigate("team/{*}/project/{*}/overview")

"Step 4: Click on link TestRuns3 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on link TestRuns3 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 5: Click on div testDetails (PenTestIssuesSprintA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testDetails'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 5-Click on div testDetails PenTestIssuesSprintA.png')

"Step 6: Click on link PenTestIssuesSprintA -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_PenTestIssuesSprintA'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on link PenTestIssuesSprintA - Navigate to page team project executionsteamprojectexecutions.png')

"Step 7: Click on link TestRuns3 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on link TestRuns3 - Navigate to page team project overviewteamprojectoverview.png')

"Step 8: Click on link TestRuns3 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 8-Click on link TestRuns3 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 9: Click on div testDetails (PenTestIssuesSprintA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testDetails'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 9-Click on div testDetails PenTestIssuesSprintA.png')

"Step 10: Click on link PenTestIssuesSprintA -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_PenTestIssuesSprintA'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 10-Click on link PenTestIssuesSprintA - Navigate to page team project executionsteamprojectexecutions.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Access and Verify Test Runs in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}