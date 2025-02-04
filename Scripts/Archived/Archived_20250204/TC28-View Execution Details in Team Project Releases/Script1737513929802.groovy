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

"Step 1: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 2: Click on link Planning -> Navigate to page 'team project releases#team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 2-Click on link Planning - Navigate to page team project releasesteamprojectreleases.png')

"Step 3: Click on link SPRINT -> Navigate to page 'project release#team/*/project/*/releases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_releases/link_SPRINT'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 3-Click on link SPRINT - Navigate to page project releaseteamprojectreleases.png')

"Step 4: Click on link TestRuns -> Navigate to page 'project executions#team/*/project/*/releases/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/releases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_project_release/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 4-Click on link TestRuns - Navigate to page project executionsteamprojectreleasesexecutions.png')

"Step 5: Click on link Execution4077 -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/releases/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_project_executions/link_Execution4077'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 5-Click on link Execution4077 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 6: Click on link TestResults -> Navigate to page 'team project executions#team/*/project/*/executions/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_TestResults'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 6-Click on link TestResults - Navigate to page team project executionsteamprojectexecutions.png')

"Step 7: Click on div ExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_ExecutionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 7-Click on div ExecutionDetails.png')

"Step 8: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 8-Click on div ThumbnailImage.png')

"Step 9: Click on button close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_close2'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 9-Click on button close2.png')

"Step 10: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 10-Click on div ThumbnailImage2.png')

"Step 11: Click on button close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_close2'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 11-Click on button close2.png')

"Step 12: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 12-Click on div ThumbnailImage3.png')

"Step 13: Click on button close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_close2'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 13-Click on button close2.png')

"Step 14: Click on link Planning2 -> Navigate to page 'team project releases#team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_Planning2'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 14-Click on link Planning2 - Navigate to page team project releasesteamprojectreleases.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC28-View Execution Details in Team Project Releases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}