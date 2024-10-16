import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/{*}/project/{*}/executions/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/executions/{*}")

"Step 4: Click on div failedDetails (FailedC17094)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedDetails', ['div_failedDetails_class': div_failedDetails_class, 'div_failedDetails_internalRoleButtonName': div_failedDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on div failedDetails FailedC17094.png')

"Step 5: Click on link object -> Navigate to page 'test result#team/{*}/project/{*}/executions/{*}/test-result/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on link object - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 6: Click on item DeleteCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/item_DeleteCart'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on item DeleteCart.png')

"Step 7: Click on item SetAddress -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/item_SetAddress'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on item SetAddress - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Delete Test Result Items and Confirm Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}