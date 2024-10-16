import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import truetest.common.viewThumbnailImagesAndClose

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

"Step 3: Navigate to team/{*}/project/{*}/grid/plan/{*}/job"

TrueTestScripts.navigate("team/{*}/project/{*}/grid/plan/{*}/job")

"Step 4: Click on link ExecutionDetails -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/grid/plan/{.*}/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_job/link_ExecutionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 4-Click on link ExecutionDetails - Navigate to page team project executionsteamprojectexecutions.png')

"Step 5: Click on pre errorMessages (FailedTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_errorMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_errorMessages', ['pre_errorMessages_class': pre_errorMessages_class, 'pre_errorMessages_internalRoleButtonName': pre_errorMessages_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 5-Click on pre errorMessages FailedTestCase.png')

"Step 6: View thumbnail images and close the image viewer multiple times"

viewThumbnailImagesAndClose.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Click on button Close -> Navigate to page 'team project job#team/{*}/project/{*}/grid/plan/{*}/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 7-Click on button Close - Navigate to page team project jobteamprojectgridplanjob.png')

"Step 8: Click on div TestRunsConfiguration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/grid/plan/{.*}/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_job/div_TestRunsConfiguration'))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 8-Click on div TestRunsConfiguration.png')

"Step 9: Click on link ExecutionDetails -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/grid/plan/{.*}/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_job/link_ExecutionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 9-Click on link ExecutionDetails - Navigate to page team project executionsteamprojectexecutions.png')

"Step 10: Click on div failedPrerequisites (FailedPreRequisite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPrerequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPrerequisites', ['div_failedPrerequisites_class': div_failedPrerequisites_class, 'div_failedPrerequisites_internalRoleButtonName': div_failedPrerequisites_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 10-Click on div failedPrerequisites FailedPreRequisite.png')

"Step 11: Click on div failedPrerequisites (FailedPreRequisite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPrerequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPrerequisites', ['div_failedPrerequisites_class': div_failedPrerequisites_class_1, 'div_failedPrerequisites_internalRoleButtonName': div_failedPrerequisites_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 11-Click on div failedPrerequisites FailedPreRequisite2.png')

"Step 12: View thumbnail images and close the image viewer multiple times"

viewThumbnailImagesAndClose.execute(data_path_1, Integer.valueOf(index_1))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC166-Verify Execution Details and Failed Prerequisites_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}