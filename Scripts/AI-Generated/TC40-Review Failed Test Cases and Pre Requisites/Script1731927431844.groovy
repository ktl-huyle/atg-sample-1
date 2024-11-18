import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

TrueTestScripts.navigate("team/*/project/*/grid/plan/*/job")

"Step 4: Click on link executionLinks (TestRunId) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName, 'project_id': project_id, 'executions_id': executions_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 4-Click on link executionLinks TestRunId - Navigate to page teamprojectexecutions.png')

"Step 5: Click on pre failedTestCases (FailedTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCases', ['pre_failedTestCases_class': pre_failedTestCases_class, 'pre_failedTestCases_internalRoleButtonName': pre_failedTestCases_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 5-Click on pre failedTestCases FailedTestCase.png')

"Step 6: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 6-Click on div ThumbnailImage2.png')

"Step 7: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 7-Click on button Close.png')

"Step 8: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 8-Click on div ThumbnailImage3.png')

"Step 9: Click on button Close -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 9-Click on button Close - Navigate to page teamprojectgridplanjob.png')

"Step 10: Click on div testRunDetails (TestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails_1'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 10-Click on div testRunDetails TestRunDetails.png')

"Step 11: Click on link executionLinks (TestRunId) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_executionLinks', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_1, 'project_id': project_id_1, 'executions_id': executions_id_1, 'team_id': team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 11-Click on link executionLinks TestRunId - Navigate to page teamprojectexecutions.png')

"Step 12: Click on div failedPreRequisites (FailedPreRequisite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites', ['div_failedPreRequisites_class': div_failedPreRequisites_class, 'div_failedPreRequisites_internalRoleButtonName': div_failedPreRequisites_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 12-Click on div failedPreRequisites FailedPreRequisite.png')

"Step 13: Click on div failedPreRequisites (FailedPreRequisite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites', ['div_failedPreRequisites_class': div_failedPreRequisites_class_1, 'div_failedPreRequisites_internalRoleButtonName': div_failedPreRequisites_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 13-Click on div failedPreRequisites FailedPreRequisite2.png')

"Step 14: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_thumbnailImage_1'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 14-Click on div thumbnailImage.png')

"Step 15: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 15-Click on button Close.png')

"Step 16: Click on div failedTestDetails (failedPreRequisiteBranch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestDetails', ['div_failedTestDetails_class': div_failedTestDetails_class, 'div_failedTestDetails_internalRoleButtonName': div_failedTestDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 16-Click on div failedTestDetails failedPreRequisiteBranch.png')

"Step 17: Click on div failedPreRequisites (failedPreRequisiteBranch2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites', ['div_failedPreRequisites_class': div_failedPreRequisites_class_2, 'div_failedPreRequisites_internalRoleButtonName': div_failedPreRequisites_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 17-Click on div failedPreRequisites failedPreRequisiteBranch2.png')

"Step 18: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 18-Click on div ThumbnailImage2.png')

"Step 19: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 19-Click on button Close.png')

"Step 20: Click on pre failedTestCases (failedPreRequisiteBranch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCases', ['pre_failedTestCases_class': pre_failedTestCases_class_1, 'pre_failedTestCases_internalRoleButtonName': pre_failedTestCases_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 20-Click on pre failedTestCases failedPreRequisiteBranch.png')

"Step 21: Click on div failedPreRequisites (failedPreRequisiteBranch3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites', ['div_failedPreRequisites_class': div_failedPreRequisites_class_3, 'div_failedPreRequisites_internalRoleButtonName': div_failedPreRequisites_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 21-Click on div failedPreRequisites failedPreRequisiteBranch3.png')

"Step 22: Click on div failedPreRequisites (failedPreRequisiteBranch4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites', ['div_failedPreRequisites_class': div_failedPreRequisites_class_4, 'div_failedPreRequisites_internalRoleButtonName': div_failedPreRequisites_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 22-Click on div failedPreRequisites failedPreRequisiteBranch4.png')

"Step 23: Click on pre failedTestCases (failedPreRequisiteBranch2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCases', ['pre_failedTestCases_class': pre_failedTestCases_class_2, 'pre_failedTestCases_internalRoleButtonName': pre_failedTestCases_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 23-Click on pre failedTestCases failedPreRequisiteBranch2.png')

"Step 24: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_thumbnailImage_1'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 24-Click on div thumbnailImage.png')

"Step 25: Click on button Close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 25-Click on button Close - Navigate to page .png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC40-Review Failed Test Cases and Pre Requisites_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}