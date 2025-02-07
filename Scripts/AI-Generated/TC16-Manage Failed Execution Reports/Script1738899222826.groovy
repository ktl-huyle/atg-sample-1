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

"Step 1: Navigate to team/*/project/*/grid/plan/*/job"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid/plan/${GlobalVariable.plan_id}/job")

"Step 2: Click on link TestRunLink -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/link_TestRunLink'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 2-Click on link TestRunLink - Navigate to page team project executionsteamprojectexecutions.png')

"Step 3: Click on pre failedTestReports (FailedTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestReports', ['pre_failedTestReports_class': pre_failedTestReports_class, 'pre_failedTestReports_internalRoleButtonName': pre_failedTestReports_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on pre failedTestReports FailedTestCase.png')

"Step 4: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Click on div ThumbnailImage.png')

"Step 5: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on button close.png')

"Step 6: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on div ThumbnailImage3.png')

"Step 7: Click on button close3 -> Navigate to page 'project management#team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Click on button close3 - Navigate to page project managementteamprojectgridplanjob.png')

"Step 8: Click on div TestRunsConfiguration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/div_TestRunsConfiguration'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Click on div TestRunsConfiguration.png')

"Step 9: Click on link TestRunLink -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/link_TestRunLink'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Click on link TestRunLink - Navigate to page team project executionsteamprojectexecutions.png')

"Step 10: Click on div failedExecutionReports (FailedTestCaseInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionReports_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionReports_1', ['div_failedExecutionReports_class': div_failedExecutionReports_class, 'div_failedExecutionReports_internalRoleButtonName': div_failedExecutionReports_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 10-Click on div failedExecutionReports FailedTestCaseInfo.png')

"Step 11: Click on div failedExecutionReports (FailedPreRequisiteBranchOpen)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionReports_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionReports_1', ['div_failedExecutionReports_class': div_failedExecutionReports_class_1, 'div_failedExecutionReports_internalRoleButtonName': div_failedExecutionReports_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Click on div failedExecutionReports FailedPreRequisiteBranchOpen.png')

"Step 12: Click on div ThumbnailImage4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage4'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 12-Click on div ThumbnailImage4.png')

"Step 13: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 13-Click on button close.png')

"Step 14: Click on div failedExecutionReports (FailedPreRequisiteBranchOpen2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionReports', ['div_failedExecutionReports_class': div_failedExecutionReports_class_2, 'div_failedExecutionReports_internalRoleButtonName': div_failedExecutionReports_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 14-Click on div failedExecutionReports FailedPreRequisiteBranchOpen2.png')

"Step 15: Click on div failedExecutionReports (FailedPreRequisiteBranchOpen3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionReports_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionReports_1', ['div_failedExecutionReports_class': div_failedExecutionReports_class_3, 'div_failedExecutionReports_internalRoleButtonName': div_failedExecutionReports_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 15-Click on div failedExecutionReports FailedPreRequisiteBranchOpen3.png')

"Step 16: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 16-Click on div ThumbnailImage.png')

"Step 17: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 17-Click on button close.png')

"Step 18: Click on pre failedTestReports (FailedPreRequisiteBranchOpen)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestReports', ['pre_failedTestReports_class': pre_failedTestReports_class_1, 'pre_failedTestReports_internalRoleButtonName': pre_failedTestReports_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 18-Click on pre failedTestReports FailedPreRequisiteBranchOpen.png')

"Step 19: Click on div failedExecutionDetails (FailedPreRequisiteBranchOpen4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionDetails', ['div_failedExecutionDetails_class': div_failedExecutionDetails_class, 'div_failedExecutionDetails_internalRoleButtonName': div_failedExecutionDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 19-Click on div failedExecutionDetails FailedPreRequisiteBranchOpen4.png')

"Step 20: Click on div failedExecutionDetails (FailedPreRequisiteBranchOpen5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionDetails', ['div_failedExecutionDetails_class': div_failedExecutionDetails_class_1, 'div_failedExecutionDetails_internalRoleButtonName': div_failedExecutionDetails_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 20-Click on div failedExecutionDetails FailedPreRequisiteBranchOpen5.png')

"Step 21: Click on pre failedTestReports (FailedPreRequisiteBranchOpen2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestReports', ['pre_failedTestReports_class': pre_failedTestReports_class_2, 'pre_failedTestReports_internalRoleButtonName': pre_failedTestReports_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 21-Click on pre failedTestReports FailedPreRequisiteBranchOpen2.png')

"Step 22: Click on div ThumbnailImage4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage4'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 22-Click on div ThumbnailImage4.png')

"Step 23: Click on button close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 23-Click on button close - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Manage Failed Execution Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}