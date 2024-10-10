import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on link Planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 4-Click on link Planning - Navigate to page teamprojectreleases.png')

"Step 5: Click on link SPRINT -> Navigate to page 'team/*/project/*/releases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_SPRINT'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 5-Click on link SPRINT - Navigate to page teamprojectreleases.png')

"Step 6: Click on link TestRuns -> Navigate to page 'team/*/project/*/releases/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 6-Click on link TestRuns - Navigate to page teamprojectreleasesexecutions.png')

"Step 7: Click on link 4077 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_executions/link_4077'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 7-Click on link 4077 - Navigate to page teamprojectexecutions.png')

"Step 8: Click on link TestResults3 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults3_1'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 8-Click on link TestResults3 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 9: Click on div PassedTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_PassedTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 9-Click on div PassedTestCase.png')

"Step 10: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 10-Click on div ThumbnailImage.png')

"Step 11: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 11-Click on button Close.png')

"Step 12: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 12-Click on div ThumbnailImage2.png')

"Step 13: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 13-Click on button Close.png')

"Step 14: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 14-Click on div ThumbnailImage3.png')

"Step 15: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 15-Click on button Close.png')

"Step 16: Click on link Planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC312/Step 16-Click on link Planning - Navigate to page teamprojectreleases.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC312-Verify Test Results Navigation in Team Project Releases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}