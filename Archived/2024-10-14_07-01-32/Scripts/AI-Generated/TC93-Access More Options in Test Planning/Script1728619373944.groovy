import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 3: Navigate to team/*/project/*/test-planning"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-planning")

"Step 4: Click on link MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 4-Click on link MoreOptions.png')

"Step 5: Click on div CreatedWithSketchtool -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_CreatedWithSketchtool'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 5-Click on div CreatedWithSketchtool - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC93-Access More Options in Test Planning_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}