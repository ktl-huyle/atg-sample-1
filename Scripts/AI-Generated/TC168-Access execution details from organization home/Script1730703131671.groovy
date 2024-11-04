import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on div CCCareContinuityPortals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_CCCareContinuityPortals'))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 4-Click on div CCCareContinuityPortals.png')

"Step 5: Click on link executionDetails (Execution3826) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails_1', ['link_executionDetails_nthChild': link_executionDetails_nthChild, 'link_executionDetails_class': link_executionDetails_class, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id, 'link_executionDetails_team_id': link_executionDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 5-Click on link executionDetails Execution3826 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link CoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_CoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 6-Click on link CoordinatorCore.png')

"Step 7: Click on pre failedTestDetails (FailedVerifyFaxReceived) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestDetails', ['pre_failedTestDetails_class': pre_failedTestDetails_class, 'pre_failedTestDetails_internalRoleButtonName': pre_failedTestDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC168/Step 7-Click on pre failedTestDetails FailedVerifyFaxReceived - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC168-Access execution details from organization home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}