import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.common.thumbnailImageInteractionsAndCloseDialogs

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

"Step 4: Click on pre failedTestDetails (ErrorSendMessage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestDetails', ['pre_failedTestDetails_class': pre_failedTestDetails_class, 'pre_failedTestDetails_internalRoleButtonName': pre_failedTestDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 4-Click on pre failedTestDetails ErrorSendMessage.png')

"Step 5: Interact with thumbnail images and close dialogs"

thumbnailImageInteractionsAndCloseDialogs.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on div InfoSidebarCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_InfoSidebarCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 6-Click on div InfoSidebarCloseButton.png')

"Step 7: Click on div UnderTopNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_UnderTopNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 7-Click on div UnderTopNavbar.png')

"Step 8: Click on button SelectOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_SelectOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 8-Click on button SelectOrganization.png')

"Step 9: Click on div UnderTopNavbar -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_UnderTopNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 9-Click on div UnderTopNavbar - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC44-Interact with Failed Test Details and Confirm Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}