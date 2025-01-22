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

"Step 1: Navigate to team/*/project/*/releases"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/releases")

"Step 2: Click on link tests -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 2-Click on link tests - Navigate to page team project detailsteamproject.png')

"Step 3: Click on link reports -> Navigate to page 'team project releases#team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Click on link reports - Navigate to page team project releasesteamprojectreleases.png')

"Step 4: Click on link tests -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on link tests - Navigate to page team project detailsteamproject.png')

"Step 5: Click on link reports -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on link reports - Navigate to page team project overviewteamprojectoverview.png')

"Step 6: Click on link testRuns2 -> Navigate to page 'team project executions#team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on link testRuns2 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Access Test Reports in Team Project Releases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}