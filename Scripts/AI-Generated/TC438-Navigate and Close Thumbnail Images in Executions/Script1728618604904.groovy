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

"Step 4: Click on div SidebarMainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SidebarMainContent'))

WebUI.takeScreenshot(reportLocation + '/TC438/Step 4-Click on div SidebarMainContent.png')

"Step 5: Click on div Toolbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Toolbar'))

WebUI.takeScreenshot(reportLocation + '/TC438/Step 5-Click on div Toolbar.png')

"Step 6: Click on pre errorMessages (FailedKundensonderpreise)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_errorMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_errorMessages', ['pre_errorMessages_class': pre_errorMessages_class, 'pre_errorMessages_internalRoleButtonName': pre_errorMessages_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC438/Step 6-Click on pre errorMessages FailedKundensonderpreise.png')

"Step 7: Navigate through thumbnail images and close them repeatedly."

navigateAndCloseThumbnailImages.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on span FailedRechnungSpeichern"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_FailedRechnungSpeichern'))

WebUI.takeScreenshot(reportLocation + '/TC438/Step 8-Click on span FailedRechnungSpeichern.png')

"Step 9: Navigate through thumbnail images and close them repeatedly."

navigateAndCloseThumbnailImages.execute(data_path_1, Integer.valueOf(index_1))

"Step 10: Click on button Close2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC438/Step 10-Click on button Close2 - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC438-Navigate and Close Thumbnail Images in Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}