import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import truetest.common.navigateAndCloseThumbnailImages

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

"Step 4: Click on div failedPreRequisites (failedCreateReverse)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites', ['div_failedPreRequisites_class': div_failedPreRequisites_class, 'div_failedPreRequisites_internalRoleButtonName': div_failedPreRequisites_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 4-Click on div failedPreRequisites failedCreateReverse.png')

"Step 5: Click on div failedTestMessages (failedQueryIndex)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestMessages', ['div_failedTestMessages_class': div_failedTestMessages_class, 'div_failedTestMessages_internalRoleButtonName': div_failedTestMessages_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 5-Click on div failedTestMessages failedQueryIndex.png')

"Step 6: Click on div failedTestMessages (failedFilterClaims)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestMessages', ['div_failedTestMessages_class': div_failedTestMessages_class_1, 'div_failedTestMessages_internalRoleButtonName': div_failedTestMessages_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 6-Click on div failedTestMessages failedFilterClaims.png')

"Step 7: Navigate through thumbnail images and close them repeatedly."

navigateAndCloseThumbnailImages.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button Close3 -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close3'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 8-Click on button Close3 - Navigate to page organizationhome.png')

"Step 9: Click on link TestExecution 750"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TestExecution_750'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 9-Click on link TestExecution 750.png')

"Step 10: Click on link projectExecutionDetails (TestExecution 751) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecutionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecutionDetails', ['link_projectExecutionDetails_nthChild': link_projectExecutionDetails_nthChild, 'link_projectExecutionDetails_class': link_projectExecutionDetails_class, 'link_projectExecutionDetails_internalRoleLinkName': link_projectExecutionDetails_internalRoleLinkName, 'link_projectExecutionDetails_project_id': link_projectExecutionDetails_project_id, 'link_projectExecutionDetails_team_id': link_projectExecutionDetails_team_id, 'link_projectExecutionDetails_executions_id': link_projectExecutionDetails_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 10-Click on link projectExecutionDetails TestExecution 751 - Navigate to page teamprojectexecutions.png')

"Step 11: Click on div failedTestMessages (failedCreateReverse2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestMessages', ['div_failedTestMessages_class': div_failedTestMessages_class_2, 'div_failedTestMessages_internalRoleButtonName': div_failedTestMessages_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 11-Click on div failedTestMessages failedCreateReverse2.png')

"Step 12: Navigate through thumbnail images and close them repeatedly."

navigateAndCloseThumbnailImages.execute(data_path_1, Integer.valueOf(index_1))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC442-Verify Failed Test Messages and Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}