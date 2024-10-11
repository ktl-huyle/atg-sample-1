import internal.GlobalVariable
import truetest.custom.TrueTestScripts
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

"Step 4: Click on div failedTestExecution (FailedC17094)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestExecution', ['div_failedTestExecution_class': div_failedTestExecution_class, 'div_failedTestExecution_internalRoleButtonName': div_failedTestExecution_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 4-Click on div failedTestExecution FailedC17094.png')

"Step 5: Click on link object -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 5-Click on link object - Navigate to page teamprojectexecutionstest-result.png')

"Step 6: Click on item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 6-Click on item object.png')

"Step 7: Click on item object2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 7-Click on item object2 - Navigate to page teamprojectexecutions.png')

"Step 8: Click on link Page2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Page2'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 8-Click on link Page2.png')

"Step 9: Click on link TestRuns7 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 9-Click on link TestRuns7 - Navigate to page teamproject.png')

"Step 10: Click on link TestRuns9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 10-Click on link TestRuns9.png')

"Step 11: Click on link testRunNavigation (7040)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation', ['link_testRunNavigation_trNthChild': link_testRunNavigation_trNthChild, 'link_testRunNavigation_internalRoleLinkName': link_testRunNavigation_internalRoleLinkName, 'link_testRunNavigation_team_id': link_testRunNavigation_team_id, 'link_testRunNavigation_project_id': link_testRunNavigation_project_id, 'link_testRunNavigation_executions_id': link_testRunNavigation_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 11-Click on link testRunNavigation 7040.png')

"Step 12: Click on link executionNavigation (7036) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation', ['link_executionNavigation_trNthChild': link_executionNavigation_trNthChild, 'link_executionNavigation_internalRoleLinkName': link_executionNavigation_internalRoleLinkName, 'link_executionNavigation_executions_id': link_executionNavigation_executions_id, 'link_executionNavigation_team_id': link_executionNavigation_team_id, 'link_executionNavigation_project_id': link_executionNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 12-Click on link executionNavigation 7036 - Navigate to page teamprojectexecutions.png')

"Step 13: Click on td testCase (TestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCase', ['td_testCase_internalRoleCellName': td_testCase_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 13-Click on td testCase TestCases.png')

"Step 14: Click on div SessionsStatus -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SessionsStatus'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 14-Click on div SessionsStatus - Navigate to page teamproject.png')

"Step 15: Click on link executionNavigation (7041) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation', ['link_executionNavigation_trNthChild': link_executionNavigation_trNthChild_1, 'link_executionNavigation_internalRoleLinkName': link_executionNavigation_internalRoleLinkName_1, 'link_executionNavigation_executions_id': link_executionNavigation_executions_id_1, 'link_executionNavigation_team_id': link_executionNavigation_team_id_1, 'link_executionNavigation_project_id': link_executionNavigation_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 15-Click on link executionNavigation 7041 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on pre failedTestCase (FailedC17094)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCase', ['pre_failedTestCase_class': pre_failedTestCase_class, 'pre_failedTestCase_internalRoleButtonName': pre_failedTestCase_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 16-Click on pre failedTestCase FailedC17094.png')

"Step 17: Click on link object2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object2'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 17-Click on link object2 - Navigate to page teamprojectexecutionstest-result.png')

"Step 18: Click on item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 18-Click on item object2.png')

"Step 19: Click on pre TestStepFailed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_TestStepFailed'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 19-Click on pre TestStepFailed.png')

"Step 20: Click on pre TestStepFailed -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_TestStepFailed'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 20-Click on pre TestStepFailed - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC109-Handle Failed Test Steps and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}