import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 4: Click on div failedPreRequisite (failedCreateReverse)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisite"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisite', ['div_failedPreRequisite_class': div_failedPreRequisite_class, 'div_failedPreRequisite_internalRoleButtonName': div_failedPreRequisite_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 4-Click on div failedPreRequisite failedCreateReverse.png')

"Step 5: Click on div failedTestExecution (failedQueryIndex)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestExecution', ['div_failedTestExecution_class': div_failedTestExecution_class, 'div_failedTestExecution_internalRoleButtonName': div_failedTestExecution_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 5-Click on div failedTestExecution failedQueryIndex.png')

"Step 6: Click on div failedTestExecution (failedFilterClaims)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestExecution', ['div_failedTestExecution_class': div_failedTestExecution_class_1, 'div_failedTestExecution_internalRoleButtonName': div_failedTestExecution_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 6-Click on div failedTestExecution failedFilterClaims.png')

"Step 7: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 7-Click on div ThumbnailImage.png')

"Step 8: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 8-Click on button Close.png')

"Step 9: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 9-Click on div ThumbnailImage.png')

"Step 10: Click on button Close2 -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 10-Click on button Close2 - Navigate to page organizationhome.png')

"Step 11: Click on link executionDetails (ProjectExecutionDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails', ['link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 11-Click on link executionDetails ProjectExecutionDetails.png')

"Step 12: Click on link testRunDetails (TestExecution 751) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRunDetails', ['link_testRunDetails_nthChild': link_testRunDetails_nthChild, 'link_testRunDetails_class': link_testRunDetails_class, 'link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName, 'link_testRunDetails_executions_id': link_testRunDetails_executions_id, 'link_testRunDetails_team_id': link_testRunDetails_team_id, 'link_testRunDetails_project_id': link_testRunDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 12-Click on link testRunDetails TestExecution 751 - Navigate to page teamprojectexecutions.png')

"Step 13: Click on div failedTestExecution (failedCreateReverse2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestExecution', ['div_failedTestExecution_class': div_failedTestExecution_class_2, 'div_failedTestExecution_internalRoleButtonName': div_failedTestExecution_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 13-Click on div failedTestExecution failedCreateReverse2.png')

"Step 14: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 14-Click on div ThumbnailImage.png')

"Step 15: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 15-Click on button Close.png')

"Step 16: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 16-Click on div ThumbnailImage.png')

"Step 17: Click on button Close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 17-Click on button Close - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC59-Handle Failed Test Executions and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}