import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.navigateAndCloseThumbnailImages
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on button SortIDAscending"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_SortIDAscending'))

WebUI.takeScreenshot(reportLocation + '/TC443/Step 4-Click on button SortIDAscending.png')

"Step 5: Click on span StartedAscending"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_StartedAscending'))

WebUI.takeScreenshot(reportLocation + '/TC443/Step 5-Click on span StartedAscending.png')

"Step 6: Click on div failedED (FailedED)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedED"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedED', ['div_failedED_class': div_failedED_class, 'div_failedED_internalRoleButtonName': div_failedED_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC443/Step 6-Click on div failedED FailedED.png')

"Step 7: Click on div FailedED2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FailedED2'))

WebUI.takeScreenshot(reportLocation + '/TC443/Step 7-Click on div FailedED2.png')

"Step 8: Navigate through thumbnail images and close them repeatedly."

navigateAndCloseThumbnailImages.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on link Page2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Page2'))

WebUI.takeScreenshot(reportLocation + '/TC443/Step 9-Click on link Page2 - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC443-Sort and Navigate Through Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}