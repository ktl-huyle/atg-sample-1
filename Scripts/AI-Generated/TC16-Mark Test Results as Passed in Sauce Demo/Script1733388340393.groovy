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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on button externalLinks (externalLinks2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Click on button externalLinks externalLinks2.png')

"Step 5: Click on button externalLinks (externalLinks3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_1, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on button externalLinks externalLinks3.png')

"Step 6: Click on button testResultActions (testResultActions) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class, 'button_testResultActions_internalRoleButtonName': button_testResultActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on button testResultActions testResultActions - Navigate to page teamprojectexecutionstest-result.png')

"Step 7: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Click on button MarkAsPassed.png')

"Step 8: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Click on label ChangeTestResultStatus.png')

"Step 9: Click on button Submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Click on button Submit3.png')

"Step 10: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 10-Click on button MarkAsPassed.png')

"Step 11: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Click on label ChangeTestResultStatus.png')

"Step 12: Click on button Submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 12-Click on button Submit3.png')

"Step 13: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 13-Click on button MarkAsPassed.png')

"Step 14: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 14-Click on label ChangeTestResultStatus.png')

"Step 15: Click on button Submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 15-Click on button Submit3.png')

"Step 16: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 16-Click on button MarkAsPassed.png')

"Step 17: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 17-Click on label ChangeTestResultStatus.png')

"Step 18: Click on button Submit32 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 18-Click on button Submit32 - Navigate to page teamprojectexecutions.png')

"Step 19: Click on button externalLinks (externalLinks4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_2, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 19-Click on button externalLinks externalLinks4.png')

"Step 20: Click on button externalLinks (externalLinks5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_3, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 20-Click on button externalLinks externalLinks5.png')

"Step 21: Click on button externalLinks (externalLinks6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_4, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 21-Click on button externalLinks externalLinks6.png')

"Step 22: Click on button externalLinks (externalLinks7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_5, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 22-Click on button externalLinks externalLinks7.png')

"Step 23: Click on button externalLinks (externalLinks8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_6, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 23-Click on button externalLinks externalLinks8.png')

"Step 24: Click on button externalLinks (externalLinks9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_7, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName_7]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 24-Click on button externalLinks externalLinks9.png')

"Step 25: Click on button testResultActions (testResultActions2) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class_1, 'button_testResultActions_internalRoleButtonName': button_testResultActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 25-Click on button testResultActions testResultActions2 - Navigate to page teamprojectexecutionstest-result.png')

"Step 26: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 26-Click on button MarkAsPassed.png')

"Step 27: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 27-Click on label ChangeTestResultStatus.png')

"Step 28: Click on button Submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 28-Click on button Submit3.png')

"Step 29: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 29-Click on button MarkAsPassed.png')

"Step 30: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 30-Click on label ChangeTestResultStatus.png')

"Step 31: Click on button Submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 31-Click on button Submit3.png')

"Step 32: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 32-Click on button MarkAsPassed.png')

"Step 33: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 33-Click on label ChangeTestResultStatus.png')

"Step 34: Click on button Submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 34-Click on button Submit3.png')

"Step 35: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 35-Click on button MarkAsPassed.png')

"Step 36: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 36-Click on label ChangeTestResultStatus.png')

"Step 37: Click on button Submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 37-Click on button Submit3.png')

"Step 38: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 38-Click on button MarkAsPassed.png')

"Step 39: Click on div ExpectedResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ExpectedResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 39-Click on div ExpectedResult.png')

"Step 40: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 40-Click on label ChangeTestResultStatus.png')

"Step 41: Click on button Submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 41-Click on button Submit3.png')

"Step 42: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 42-Click on button MarkAsPassed.png')

"Step 43: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 43-Click on label ChangeTestResultStatus.png')

"Step 44: Click on button Submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 44-Click on button Submit3.png')

"Step 45: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 45-Click on button MarkAsPassed.png')

"Step 46: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 46-Click on label ChangeTestResultStatus.png')

"Step 47: Click on button Submit32 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 47-Click on button Submit32 - Navigate to page teamprojectexecutions.png')

"Step 48: Click on button externalLinks (externalLinks10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_8]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 48-Click on button externalLinks externalLinks10.png')

"Step 49: Click on button externalLinks (externalLinks11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class_9]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 49-Click on button externalLinks externalLinks11.png')

"Step 50: Click on button InsightlyAutomation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_InsightlyAutomation'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 50-Click on button InsightlyAutomation.png')

"Step 51: Click on link Insightly -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Insightly'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 51-Click on link Insightly - Navigate to page teamprojectexecutionstest-result.png')

"Step 52: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 52-Click on button MarkAsPassed.png')

"Step 53: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 53-Click on label ChangeTestResultStatus.png')

"Step 54: Click on button Submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 54-Click on button Submit3.png')

"Step 55: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 55-Click on button MarkAsPassed.png')

"Step 56: Click on label ChangeTestResultStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_ChangeTestResultStatus'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 56-Click on label ChangeTestResultStatus.png')

"Step 57: Click on button Submit33 -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_Submit3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 57-Click on button Submit33 - Navigate to page organizationhome.png')

"Step 58: Click on link ExecutionDetails1879"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ExecutionDetails1879'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 58-Click on link ExecutionDetails1879.png')

"Step 59: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Mark Test Results as Passed in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}