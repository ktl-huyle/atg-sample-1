import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

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

"Step 4: Click on pre failedVerifications (errorSendMessage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedVerifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedVerifications', ['pre_failedVerifications_class': pre_failedVerifications_class, 'pre_failedVerifications_internalRoleButtonName': pre_failedVerifications_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC403/Step 4-Click on pre failedVerifications errorSendMessage.png')

"Step 5: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC403/Step 5-Click on div thumbnailImage.png')

"Step 6: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC403/Step 6-Click on button close.png')

"Step 7: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_thumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC403/Step 7-Click on div thumbnailImage.png')

"Step 8: Click on div infoSidebarHeaderCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_infoSidebarHeaderCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC403/Step 8-Click on div infoSidebarHeaderCloseButton.png')

"Step 9: Click on div testRunsRequirementsTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testRunsRequirementsTest'))

WebUI.takeScreenshot(reportLocation + '/TC403/Step 9-Click on div testRunsRequirementsTest.png')

"Step 10: Click on button projectActions (careContinuityPortalsDev)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC403/Step 10-Click on button projectActions careContinuityPortalsDev.png')

"Step 11: Click on div testRunsRequirementsTest -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testRunsRequirementsTest'))

WebUI.takeScreenshot(reportLocation + '/TC403/Step 11-Click on div testRunsRequirementsTest - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC403-Handle Failed Verifications in Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}