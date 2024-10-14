import truetest.common.markFailedTestResultsAsPassed
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Change the status of failed test results to passed"

markFailedTestResultsAsPassed.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 5-Click on button MarkAsPassed.png')

"Step 6: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 6-Click on label ChangeTestResultStatus.png')

"Step 7: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 7-Click on button Submit.png')

"Step 8: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 8-Click on button MarkAsPassed.png')

"Step 9: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 9-Click on label ChangeTestResultStatus.png')

"Step 10: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 10-Click on button Submit.png')

"Step 11: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 11-Click on button MarkAsPassed.png')

"Step 12: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 12-Click on label ChangeTestResultStatus.png')

"Step 13: Click on button Submit -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 13-Click on button Submit - Navigate to page teamprojectexecutions.png')

"Step 14: Click on button testResultActions (TestResultDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class, 'button_testResultActions_internalRoleButtonName': button_testResultActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 14-Click on button testResultActions TestResultDetails.png')

"Step 15: Click on button testResultActions (TestResultDetails2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class_1, 'button_testResultActions_internalRoleButtonName': button_testResultActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 15-Click on button testResultActions TestResultDetails2.png')

"Step 16: Click on button testResultActions (TestResultDetails3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class_2, 'button_testResultActions_internalRoleButtonName': button_testResultActions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 16-Click on button testResultActions TestResultDetails3.png')

"Step 17: Click on button testResultActions (TestResultDetails4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class_3, 'button_testResultActions_internalRoleButtonName': button_testResultActions_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 17-Click on button testResultActions TestResultDetails4.png')

"Step 18: Change the status of failed test results to passed"

markFailedTestResultsAsPassed.execute(data_path_1, Integer.valueOf(index_1))

"Step 19: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 19-Click on button MarkAsPassed.png')

"Step 20: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 20-Click on label ChangeTestResultStatus.png')

"Step 21: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 21-Click on button Submit.png')

"Step 22: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 22-Click on button MarkAsPassed.png')

"Step 23: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 23-Click on label ChangeTestResultStatus.png')

"Step 24: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 24-Click on button Submit.png')

"Step 25: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 25-Click on button MarkAsPassed.png')

"Step 26: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 26-Click on label ChangeTestResultStatus.png')

"Step 27: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 27-Click on button Submit.png')

"Step 28: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 28-Click on button MarkAsPassed.png')

"Step 29: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 29-Click on label ChangeTestResultStatus.png')

"Step 30: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 30-Click on button Submit.png')

"Step 31: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 31-Click on button MarkAsPassed.png')

"Step 32: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 32-Click on label ChangeTestResultStatus.png')

"Step 33: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 33-Click on button Submit.png')

"Step 34: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 34-Click on button MarkAsPassed.png')

"Step 35: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 35-Click on label ChangeTestResultStatus.png')

"Step 36: Click on button Submit -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 36-Click on button Submit - Navigate to page teamprojectexecutions.png')

"Step 37: Click on button testResultActions (TestResultDetails5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class_4]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 37-Click on button testResultActions TestResultDetails5.png')

"Step 38: Click on button testResultActions (TestResultDetails6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 38-Click on button testResultActions TestResultDetails6.png')

"Step 39: Click on button organizationSelection (InsightlyAutomation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_organizationSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_organizationSelection', ['button_organizationSelection_internalRoleButtonName': button_organizationSelection_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 39-Click on button organizationSelection InsightlyAutomation.png')

"Step 40: Click on link Insightly -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Insightly'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 40-Click on link Insightly - Navigate to page teamprojectexecutionstest-result.png')

"Step 41: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 41-Click on button MarkAsPassed.png')

"Step 42: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 42-Click on label ChangeTestResultStatus.png')

"Step 43: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 43-Click on button Submit.png')

"Step 44: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 44-Click on button MarkAsPassed.png')

"Step 45: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 45-Click on label ChangeTestResultStatus.png')

"Step 46: Click on button Submit -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 46-Click on button Submit - Navigate to page organizationhome.png')

"Step 47: Click on link executionDetails (ExecutionDetails1879IE56Failed)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails', ['link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_executions_id': link_executionDetails_executions_id, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_project_id': link_executionDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 47-Click on link executionDetails ExecutionDetails1879IE56Failed.png')

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC89-Mark Failed Test Results as Passed_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}