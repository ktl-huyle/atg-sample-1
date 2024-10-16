import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.viewAndCloseAdditionalThumbnailImages

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

"Step 3: Navigate to team/{*}/project/{*}/executions/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/executions/{*}")

"Step 4: Click on link Planning -> Navigate to page 'team project releases#team/{*}/project/{*}/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link Planning - Navigate to page team project releasesteamprojectreleases.png')

"Step 5: Click on link SPRINT -> Navigate to page 'team project releases#team/{*}/project/{*}/releases/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_SPRINT'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on link SPRINT - Navigate to page team project releasesteamprojectreleases.png')

"Step 6: Click on link TestRuns -> Navigate to page 'team project releases executions#team/{*}/project/{*}/releases/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/releases/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on link TestRuns - Navigate to page team project releases executionsteamprojectreleasesexecutions.png')

"Step 7: Click on link 4077 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/releases/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_executions/link_4077'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on link 4077 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 8: Click on link TestResults -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on link TestResults - Navigate to page team project executionsteamprojectexecutions.png')

"Step 9: Click on div TestCasePassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestCasePassed'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on div TestCasePassed.png')

"Step 10: View and close additional thumbnail images in the application."

viewAndCloseAdditionalThumbnailImages.execute()

"Step 11: Click on link Planning -> Navigate to page 'team project releases#team/{*}/project/{*}/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on link Planning - Navigate to page team project releasesteamprojectreleases.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify Test Execution Results in Releases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}