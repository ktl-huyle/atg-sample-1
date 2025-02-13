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

"Step 1: Navigate to team/*/project/*/executions"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions")

"Step 2: Click on link Executions -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link Executions - Navigate to page team project detailteamproject.png')

"Step 3: Click on link Schedules -> Navigate to page 'team project grid#team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_Schedules'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link Schedules - Navigate to page team project gridteamprojectgrid.png')

"Step 4: Click on link Reports -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on link Reports - Navigate to page team project overviewteamprojectoverview.png')

"Step 5: Click on link TestRuns -> Navigate to page 'team project executions#team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on link TestRuns - Navigate to page team project executionsteamprojectexecutions.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Access Team Project Executions and Verify Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}