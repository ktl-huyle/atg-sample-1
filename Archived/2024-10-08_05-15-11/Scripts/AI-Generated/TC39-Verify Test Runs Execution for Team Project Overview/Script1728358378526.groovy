import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/*/project/*/overview"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/overview")

"Step 4: Click on link TestRuns3 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 4-Click on link TestRuns3 - Navigate to page teamprojectexecutions.png')

"Step 5: Click on div dynamicObject (PenTestIssuesSprintA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_dynamicObject_1'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 5-Click on div dynamicObject PenTestIssuesSprintA.png')

"Step 6: Click on link PenTestIssuesSprintA -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_PenTestIssuesSprintA'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 6-Click on link PenTestIssuesSprintA - Navigate to page teamprojectexecutions.png')

"Step 7: Click on link TestRuns4 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 7-Click on link TestRuns4 - Navigate to page teamprojectoverview.png')

"Step 8: Click on link TestRuns3 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 8-Click on link TestRuns3 - Navigate to page teamprojectexecutions.png')

"Step 9: Click on div dynamicObject (PenTestIssuesSprintA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_dynamicObject_1'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 9-Click on div dynamicObject PenTestIssuesSprintA.png')

"Step 10: Click on link PenTestIssuesSprintA -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_PenTestIssuesSprintA'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 10-Click on link PenTestIssuesSprintA - Navigate to page teamprojectexecutions.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC39-Verify Test Runs Execution for Team Project Overview_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}