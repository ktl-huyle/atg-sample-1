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

"Step 3: Navigate to team/*/project/*/grid/plan/*/job"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid/plan/${GlobalVariable.plan_id}/job")

"Step 4: Click on link testRunLinks (TestRunId) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName, 'link_testRunLinks_executions_id': link_testRunLinks_executions_id, 'link_testRunLinks_team_id': link_testRunLinks_team_id, 'link_testRunLinks_project_id': link_testRunLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 4-Click on link testRunLinks TestRunId - Navigate to page teamprojectexecutions.png')

"Step 5: Click on pre failedTestDetails (FailedTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestDetails', ['pre_failedTestDetails_class': pre_failedTestDetails_class, 'pre_failedTestDetails_internalRoleButtonName': pre_failedTestDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 5-Click on pre failedTestDetails FailedTestCase.png')

"Step 6: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 6-Click on div ThumbnailImage.png')

"Step 7: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 7-Click on button Close.png')

"Step 8: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 8-Click on div ThumbnailImage.png')

"Step 9: Click on button Close -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 9-Click on button Close - Navigate to page teamprojectgridplanjob.png')

"Step 10: Click on div TestRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_TestRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 10-Click on div TestRunDetails.png')

"Step 11: Click on link testRunLinks (TestRunId) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild_1, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_1, 'link_testRunLinks_executions_id': link_testRunLinks_executions_id_1, 'link_testRunLinks_team_id': link_testRunLinks_team_id_1, 'link_testRunLinks_project_id': link_testRunLinks_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 11-Click on link testRunLinks TestRunId - Navigate to page teamprojectexecutions.png')

"Step 12: Click on div failedPreRequisites (FailedPreRequisite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites', ['div_failedPreRequisites_class': div_failedPreRequisites_class, 'div_failedPreRequisites_internalRoleButtonName': div_failedPreRequisites_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 12-Click on div failedPreRequisites FailedPreRequisite.png')

"Step 13: Click on div failedPreRequisites (FailedPreRequisite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites', ['div_failedPreRequisites_class': div_failedPreRequisites_class_1, 'div_failedPreRequisites_internalRoleButtonName': div_failedPreRequisites_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 13-Click on div failedPreRequisites FailedPreRequisite2.png')

"Step 14: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 14-Click on div ThumbnailImage.png')

"Step 15: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 15-Click on button Close.png')

"Step 16: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 16-Click on div ThumbnailImage.png')

"Step 17: Click on button Close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 17-Click on button Close - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC151-View Failed Test Details and Close Thumbnails_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}