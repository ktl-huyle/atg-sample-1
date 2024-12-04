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

"Step 4: Click on link execution (Execution7857) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_execution_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_execution_1', ['link_execution_internalRoleLinkName': link_execution_internalRoleLinkName, 'team_id': team_id, 'executions_id': executions_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 4-Click on link execution Execution7857 - Navigate to page teamprojectexecutions.png')

"Step 5: Click on div failedTests (FailedTC001NTSPerform)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests', ['div_failedTests_class': div_failedTests_class, 'div_failedTests_internalRoleButtonName': div_failedTests_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 5-Click on div failedTests FailedTC001NTSPerform.png')

"Step 6: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage_1'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 6-Click on div ThumbnailImage.png')

"Step 7: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 7-Click on button Close.png')

"Step 8: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 8-Click on div ThumbnailImage2.png')

"Step 9: Click on button Close2 -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close2_2'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 9-Click on button Close2 - Navigate to page teamprojectgridplanjob.png')

"Step 10: Click on div TestRunsConfigurationSessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_TestRunsConfigurationSessions'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 10-Click on div TestRunsConfigurationSessions.png')

"Step 11: Click on link execution (Execution7857) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_execution_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_execution_1', ['link_execution_internalRoleLinkName': link_execution_internalRoleLinkName_1, 'team_id': team_id_1, 'executions_id': executions_id_1, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 11-Click on link execution Execution7857 - Navigate to page teamprojectexecutions.png')

"Step 12: Click on div failedItems (FailedPreRequisiteBranch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedItems', ['div_failedItems_class': div_failedItems_class, 'div_failedItems_internalRoleButtonName': div_failedItems_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 12-Click on div failedItems FailedPreRequisiteBranch.png')

"Step 13: Click on div failedItems (FailedPreRequisiteBranch2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedItems', ['div_failedItems_class': div_failedItems_class_1, 'div_failedItems_internalRoleButtonName': div_failedItems_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 13-Click on div failedItems FailedPreRequisiteBranch2.png')

"Step 14: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 14-Click on div ThumbnailImage3.png')

"Step 15: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 15-Click on button Close.png')

"Step 16: Click on div failedTests (FailedPreRequisiteBranch3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests', ['div_failedTests_class': div_failedTests_class_1, 'div_failedTests_internalRoleButtonName': div_failedTests_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 16-Click on div failedTests FailedPreRequisiteBranch3.png')

"Step 17: Click on div failedItems (FailedPreRequisiteBranch4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedItems', ['div_failedItems_class': div_failedItems_class_2, 'div_failedItems_internalRoleButtonName': div_failedItems_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 17-Click on div failedItems FailedPreRequisiteBranch4.png')

"Step 18: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage_1'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 18-Click on div ThumbnailImage.png')

"Step 19: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 19-Click on button Close.png')

"Step 20: Click on div failedTests (FailedPreRequisiteBranch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests', ['div_failedTests_class': div_failedTests_class_2, 'div_failedTests_internalRoleButtonName': div_failedTests_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 20-Click on div failedTests FailedPreRequisiteBranch.png')

"Step 21: Click on div failedTestRuns (FailedPreRequisiteBranch5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRuns', ['div_failedTestRuns_class': div_failedTestRuns_class, 'div_failedTestRuns_internalRoleButtonName': div_failedTestRuns_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 21-Click on div failedTestRuns FailedPreRequisiteBranch5.png')

"Step 22: Click on div failedTestRuns (FailedPreRequisiteBranch6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestRuns', ['div_failedTestRuns_class': div_failedTestRuns_class_1, 'div_failedTestRuns_internalRoleButtonName': div_failedTestRuns_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 22-Click on div failedTestRuns FailedPreRequisiteBranch6.png')

"Step 23: Click on div failedTests (FailedPreRequisiteBranch2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests', ['div_failedTests_class': div_failedTests_class_3, 'div_failedTests_internalRoleButtonName': div_failedTests_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 23-Click on div failedTests FailedPreRequisiteBranch2.png')

"Step 24: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 24-Click on div ThumbnailImage3.png')

"Step 25: Click on button Close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC127/Step 25-Click on button Close - Navigate to page .png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC127-Manage Failed Test Runs and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}