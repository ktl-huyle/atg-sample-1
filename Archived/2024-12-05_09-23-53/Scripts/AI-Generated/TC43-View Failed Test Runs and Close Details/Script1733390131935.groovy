import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

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

"Step 3: Navigate to team/*/project/*/grid/plan/*/job"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid/plan/${GlobalVariable.plan_id}/job")

"Step 4: Click on link executionDetails (TestRunExecution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails', ['link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'executions_id': executions_id, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 4-Click on link executionDetails TestRunExecution - Navigate to page teamprojectexecutions.png')

"Step 5: Click on pre failedTestRuns (FailedTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestRuns', ['pre_failedTestRuns_class': pre_failedTestRuns_class, 'pre_failedTestRuns_internalRoleButtonName': pre_failedTestRuns_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 5-Click on pre failedTestRuns FailedTestCase.png')

"Step 6: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 6-Click on div ThumbnailImage3.png')

"Step 7: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 7-Click on button Close.png')

"Step 8: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 8-Click on div ThumbnailImage2.png')

"Step 9: Click on button Close3 -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close3'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 9-Click on button Close3 - Navigate to page teamprojectgridplanjob.png')

"Step 10: Click on div TestRunsConfiguration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_TestRunsConfiguration'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 10-Click on div TestRunsConfiguration.png')

"Step 11: Click on link executionDetails (TestRunExecution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionDetails', ['link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'executions_id': executions_id_1, 'team_id': team_id_1, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 11-Click on link executionDetails TestRunExecution - Navigate to page teamprojectexecutions.png')

"Step 12: Click on div failedTestRunPreRequisites (FailedPreRequisiteBranch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunPreRequisites', ['div_failedTestRunPreRequisites_class': div_failedTestRunPreRequisites_class, 'div_failedTestRunPreRequisites_internalRoleButtonName': div_failedTestRunPreRequisites_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 12-Click on div failedTestRunPreRequisites FailedPreRequisiteBranch.png')

"Step 13: Click on div failedTestRunPreRequisites (FailedPreRequisiteBranch2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunPreRequisites', ['div_failedTestRunPreRequisites_class': div_failedTestRunPreRequisites_class_1, 'div_failedTestRunPreRequisites_internalRoleButtonName': div_failedTestRunPreRequisites_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 13-Click on div failedTestRunPreRequisites FailedPreRequisiteBranch2.png')

"Step 14: Click on div ThumbnailImage4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage4'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 14-Click on div ThumbnailImage4.png')

"Step 15: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 15-Click on button Close.png')

"Step 16: Click on div failedTestRunClaims (FailedPreRequisiteBranch3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunClaims"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunClaims', ['div_failedTestRunClaims_class': div_failedTestRunClaims_class, 'div_failedTestRunClaims_internalRoleButtonName': div_failedTestRunClaims_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 16-Click on div failedTestRunClaims FailedPreRequisiteBranch3.png')

"Step 17: Click on div failedTestRunPreRequisites (FailedPreRequisiteBranch4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunPreRequisites', ['div_failedTestRunPreRequisites_class': div_failedTestRunPreRequisites_class_2, 'div_failedTestRunPreRequisites_internalRoleButtonName': div_failedTestRunPreRequisites_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 17-Click on div failedTestRunPreRequisites FailedPreRequisiteBranch4.png')

"Step 18: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 18-Click on div ThumbnailImage3.png')

"Step 19: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 19-Click on button Close.png')

"Step 20: Click on pre failedTestRuns (FailedPreRequisiteBranch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestRuns', ['pre_failedTestRuns_class': pre_failedTestRuns_class_1, 'pre_failedTestRuns_internalRoleButtonName': pre_failedTestRuns_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 20-Click on pre failedTestRuns FailedPreRequisiteBranch.png')

"Step 21: Click on div failedTestRunPreRequisites (FailedPreRequisiteBranch5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunPreRequisites', ['div_failedTestRunPreRequisites_class': div_failedTestRunPreRequisites_class_3, 'div_failedTestRunPreRequisites_internalRoleButtonName': div_failedTestRunPreRequisites_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 21-Click on div failedTestRunPreRequisites FailedPreRequisiteBranch5.png')

"Step 22: Click on div failedTestRunPreRequisites (FailedPreRequisiteBranch6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRunPreRequisites', ['div_failedTestRunPreRequisites_class': div_failedTestRunPreRequisites_class_4, 'div_failedTestRunPreRequisites_internalRoleButtonName': div_failedTestRunPreRequisites_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 22-Click on div failedTestRunPreRequisites FailedPreRequisiteBranch6.png')

"Step 23: Click on pre failedTestRuns (FailedPreRequisiteBranch2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestRuns', ['pre_failedTestRuns_class': pre_failedTestRuns_class_2, 'pre_failedTestRuns_internalRoleButtonName': pre_failedTestRuns_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 23-Click on pre failedTestRuns FailedPreRequisiteBranch2.png')

"Step 24: Click on div ThumbnailImage4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage4'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 24-Click on div ThumbnailImage4.png')

"Step 25: Click on button Close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC43/Step 25-Click on button Close - Navigate to page .png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC43-View Failed Test Runs and Close Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}