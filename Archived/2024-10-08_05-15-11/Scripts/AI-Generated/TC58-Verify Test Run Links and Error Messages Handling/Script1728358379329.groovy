import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on div executionTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_executionTime'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 4-Click on div executionTime.png')

"Step 5: Click on link testRunLinks (executionDetails) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRunLinks', ['link_testRunLinks_class': link_testRunLinks_class, 'link_testRunLinks_nthChild': link_testRunLinks_nthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName, 'link_testRunLinks_team_id': link_testRunLinks_team_id, 'link_testRunLinks_executions_id': link_testRunLinks_executions_id, 'link_testRunLinks_project_id': link_testRunLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 5-Click on link testRunLinks executionDetails - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 6-Click on link testSuites.png')

"Step 7: Click on pre errorMessages (failedVerify) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_errorMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_errorMessages', ['pre_errorMessages_class': pre_errorMessages_class, 'pre_errorMessages_internalRoleButtonName': pre_errorMessages_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 7-Click on pre errorMessages failedVerify - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC58-Verify Test Run Links and Error Messages Handling_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}