import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.markTestResultAsPassed
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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/*/project/*/executions/*")

"Step 4: Mark a test result as passed after accessing team project executions."

markTestResultAsPassed.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 5-Click on button MarkAsPassed.png')

"Step 6: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 6-Click on label ChangeTestResultStatus.png')

"Step 7: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 7-Click on button Submit.png')

"Step 8: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 8-Click on button MarkAsPassed.png')

"Step 9: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 9-Click on label ChangeTestResultStatus.png')

"Step 10: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 10-Click on button Submit.png')

"Step 11: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 11-Click on button MarkAsPassed.png')

"Step 12: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 12-Click on label ChangeTestResultStatus.png')

"Step 13: Click on button Submit -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 13-Click on button Submit - Navigate to page teamprojectexecutions.png')

"Step 14: Click on button externalLinks (ExternalLink2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 14-Click on button externalLinks ExternalLink2.png')

"Step 15: Click on button externalLinks (ExternalLink3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_1, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 15-Click on button externalLinks ExternalLink3.png')

"Step 16: Click on button externalLinks (ExternalLink4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_2, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 16-Click on button externalLinks ExternalLink4.png')

"Step 17: Click on button externalLinks (ExternalLink5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_3, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 17-Click on button externalLinks ExternalLink5.png')

"Step 18: Mark a test result as passed after accessing team project executions."

markTestResultAsPassed.execute(data_path_1, Integer.valueOf(index_1))

"Step 19: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 19-Click on button MarkAsPassed.png')

"Step 20: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 20-Click on label ChangeTestResultStatus.png')

"Step 21: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 21-Click on button Submit.png')

"Step 22: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 22-Click on button MarkAsPassed.png')

"Step 23: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 23-Click on label ChangeTestResultStatus.png')

"Step 24: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 24-Click on button Submit.png')

"Step 25: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 25-Click on button MarkAsPassed.png')

"Step 26: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 26-Click on label ChangeTestResultStatus.png')

"Step 27: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 27-Click on button Submit.png')

"Step 28: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 28-Click on button MarkAsPassed.png')

"Step 29: Click on div ExpectedResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ExpectedResult'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 29-Click on div ExpectedResult.png')

"Step 30: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 30-Click on label ChangeTestResultStatus.png')

"Step 31: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 31-Click on button Submit.png')

"Step 32: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 32-Click on button MarkAsPassed.png')

"Step 33: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 33-Click on label ChangeTestResultStatus.png')

"Step 34: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 34-Click on button Submit.png')

"Step 35: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 35-Click on button MarkAsPassed.png')

"Step 36: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 36-Click on label ChangeTestResultStatus.png')

"Step 37: Click on button Submit -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 37-Click on button Submit - Navigate to page teamprojectexecutions.png')

"Step 38: Click on button externalLinks (ExternalLink6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_4, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 38-Click on button externalLinks ExternalLink6.png')

"Step 39: Click on button externalLinks (ExternalLink7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_5, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 39-Click on button externalLinks ExternalLink7.png')

"Step 40: Click on button projectActions (InsightlyAutomation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 40-Click on button projectActions InsightlyAutomation.png')

"Step 41: Click on link insightly (Insightly) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_insightly"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_insightly', ['organization_id': organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 41-Click on link insightly Insightly - Navigate to page teamprojectexecutionstest-result.png')

"Step 42: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 42-Click on button MarkAsPassed.png')

"Step 43: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 43-Click on label ChangeTestResultStatus.png')

"Step 44: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 44-Click on button Submit.png')

"Step 45: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 45-Click on button MarkAsPassed.png')

"Step 46: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 46-Click on label ChangeTestResultStatus.png')

"Step 47: Click on button Submit -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 47-Click on button Submit - Navigate to page organizationhome.png')

"Step 48: Click on link insightlyLinks (InsightlyExecution)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_insightlyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_insightlyLinks', ['link_insightlyLinks_internalRoleLinkName': link_insightlyLinks_internalRoleLinkName, 'project_id': project_id, 'executions_id': executions_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 48-Click on link insightlyLinks InsightlyExecution.png')

"Step 49: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC47-Mark Test Results as Passed in Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}