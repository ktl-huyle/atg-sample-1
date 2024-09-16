import katalon.common.markTestResultAsPassed
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
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

"Step 4: Mark a test result as passed based on manual test results."

markTestResultAsPassed.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 5-Click on button markAsPassed.png')

"Step 6: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 6-Click on label basedOnManualTestResult.png')

"Step 7: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 7-Click on button submit.png')

"Step 8: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 8-Click on button markAsPassed.png')

"Step 9: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 9-Click on label basedOnManualTestResult.png')

"Step 10: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 10-Click on button submit.png')

"Step 11: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 11-Click on button markAsPassed.png')

"Step 12: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 12-Click on label basedOnManualTestResult.png')

"Step 13: Click on button submit -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 13-Click on button submit - Navigate to page teamprojectexecutions.png')

"Step 14: Click on button testExecutionActions (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions', ['button_testExecutionActions_class': button_testExecutionActions_class, 'button_testExecutionActions_internalRoleButtonName': button_testExecutionActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 14-Click on button testExecutionActions object.png')

"Step 15: Click on button testExecutionActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions', ['button_testExecutionActions_class': button_testExecutionActions_class_1, 'button_testExecutionActions_internalRoleButtonName': button_testExecutionActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 15-Click on button testExecutionActions object2.png')

"Step 16: Click on button testExecutionActions (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions', ['button_testExecutionActions_class': button_testExecutionActions_class_2, 'button_testExecutionActions_internalRoleButtonName': button_testExecutionActions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 16-Click on button testExecutionActions object3.png')

"Step 17: Click on button testExecutionActions (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions', ['button_testExecutionActions_class': button_testExecutionActions_class_3, 'button_testExecutionActions_internalRoleButtonName': button_testExecutionActions_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 17-Click on button testExecutionActions object4.png')

"Step 18: Mark a test result as passed based on manual test results."

markTestResultAsPassed.execute(data_path_1, Integer.valueOf(index_1))

"Step 19: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 19-Click on button markAsPassed.png')

"Step 20: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 20-Click on label basedOnManualTestResult.png')

"Step 21: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 21-Click on button submit.png')

"Step 22: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 22-Click on button markAsPassed.png')

"Step 23: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 23-Click on label basedOnManualTestResult.png')

"Step 24: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 24-Click on button submit.png')

"Step 25: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 25-Click on button markAsPassed.png')

"Step 26: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 26-Click on label basedOnManualTestResult.png')

"Step 27: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 27-Click on button submit.png')

"Step 28: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 28-Click on button markAsPassed.png')

"Step 29: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 29-Click on label basedOnManualTestResult.png')

"Step 30: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 30-Click on button submit.png')

"Step 31: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 31-Click on button markAsPassed.png')

"Step 32: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 32-Click on label basedOnManualTestResult.png')

"Step 33: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 33-Click on button submit.png')

"Step 34: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 34-Click on button markAsPassed.png')

"Step 35: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 35-Click on label basedOnManualTestResult.png')

"Step 36: Click on button submit -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 36-Click on button submit - Navigate to page teamprojectexecutions.png')

"Step 37: Click on button testExecutionActions (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions', ['button_testExecutionActions_class': button_testExecutionActions_class_4]))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 37-Click on button testExecutionActions object5.png')

"Step 38: Click on button testExecutionActions (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testExecutionActions', ['button_testExecutionActions_class': button_testExecutionActions_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 38-Click on button testExecutionActions object6.png')

"Step 39: Click on button insightlyAutomation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_insightlyAutomation'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 39-Click on button insightlyAutomation.png')

"Step 40: Click on link insightly -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_insightly'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 40-Click on link insightly - Navigate to page teamprojectexecutionstest-result.png')

"Step 41: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 41-Click on button markAsPassed.png')

"Step 42: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 42-Click on label basedOnManualTestResult.png')

"Step 43: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 43-Click on button submit.png')

"Step 44: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 44-Click on button markAsPassed.png')

"Step 45: Click on label basedOnManualTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_basedOnManualTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 45-Click on label basedOnManualTestResult.png')

"Step 46: Click on button submit -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 46-Click on button submit - Navigate to page organizationhome.png')

"Step 47: Click on link executions1879 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_executions1879'))

WebUI.takeScreenshot(reportLocation + '/TC344/Step 47-Click on link executions1879 - Navigate to page .png')

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC344-Mark Test Results as Passed for Multiple Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}