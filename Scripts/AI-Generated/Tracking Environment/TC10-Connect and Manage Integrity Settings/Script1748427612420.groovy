import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /team/*/project/*/executions/*"

TrueTestScripts.navigate("/team/${team_id}/project/${project_id}/executions/${executions_id}")

"Step 2: Click on button integrityConnect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_team_project_executions/button_integrityConnect'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on button integrityConnect.png')

"Step 3: Click on div imIntegrityMarketingGroup (imIntegrityMarketingGroup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_team_project_executions/div_imIntegrityMarketingGroup"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_team_project_executions/div_imIntegrityMarketingGroup', ['div_imIntegrityMarketingGroup_internalText': div_imIntegrityMarketingGroup_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on div imIntegrityMarketingGroup imIntegrityMarketingGroup.png')

"Step 4: Click on span settings -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_team_project_executions/span_settings'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on span settings - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Connect and Manage Integrity Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}