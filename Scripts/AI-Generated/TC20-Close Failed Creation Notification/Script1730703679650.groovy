import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 2: Click on div failedCreation (FailedSyncCheck)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedCreation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedCreation', ['div_failedCreation_class': div_failedCreation_class, 'div_failedCreation_internalRoleButtonName': div_failedCreation_internalRoleButtonName]))

WebUI.takeScreenshot()

"Step 3: Click on div CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_CloseButton'))

WebUI.takeScreenshot()

"Step 4: Click on div failedCreation (FailedClientCreation) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedCreation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedCreation', ['div_failedCreation_class': div_failedCreation_class_1, 'div_failedCreation_internalRoleButtonName': div_failedCreation_internalRoleButtonName_1]))

WebUI.takeScreenshot()

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Close Failed Creation Notification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}