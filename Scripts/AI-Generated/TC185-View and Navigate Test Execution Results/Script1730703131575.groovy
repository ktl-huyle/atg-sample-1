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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on div failedTestDetails (FailedTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestDetails', ['div_failedTestDetails_class': div_failedTestDetails_class, 'div_failedTestDetails_internalRoleButtonName': div_failedTestDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 4-Click on div failedTestDetails FailedTest.png')

"Step 5: Click on link TestResult -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResult'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 5-Click on link TestResult - Navigate to page teamprojectexecutionstest-result.png')

"Step 6: Click on item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 6-Click on item object.png')

"Step 7: Click on item object2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 7-Click on item object2 - Navigate to page teamprojectexecutions.png')

"Step 8: Click on link Page2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Page2'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 8-Click on link Page2.png')

"Step 9: Click on link TestRuns5 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 9-Click on link TestRuns5 - Navigate to page teamproject.png')

"Step 10: Click on link TestRuns4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 10-Click on link TestRuns4.png')

"Step 11: Click on link executionLinks (TestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName, 'link_executionLinks_team_id': link_executionLinks_team_id, 'link_executionLinks_executions_id': link_executionLinks_executions_id, 'link_executionLinks_project_id': link_executionLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 11-Click on link executionLinks TestRun.png')

"Step 12: Click on link testRunLinks (TestRun2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName, 'link_testRunLinks_executions_id': link_testRunLinks_executions_id, 'link_testRunLinks_team_id': link_testRunLinks_team_id, 'link_testRunLinks_project_id': link_testRunLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 12-Click on link testRunLinks TestRun2 - Navigate to page teamprojectexecutions.png')

"Step 13: Click on td testCases (TestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCases', ['td_testCases_internalRoleCellName': td_testCases_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 13-Click on td testCases TestCases.png')

"Step 14: Click on div object -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 14-Click on div object - Navigate to page teamproject.png')

"Step 15: Click on link testRunLinks (TestRun3) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild_1, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_1, 'link_testRunLinks_executions_id': link_testRunLinks_executions_id_1, 'link_testRunLinks_team_id': link_testRunLinks_team_id_1, 'link_testRunLinks_project_id': link_testRunLinks_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 15-Click on link testRunLinks TestRun3 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on pre failedTestDetails (FailedTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestDetails', ['pre_failedTestDetails_class': pre_failedTestDetails_class, 'pre_failedTestDetails_internalRoleButtonName': pre_failedTestDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 16-Click on pre failedTestDetails FailedTest.png')

"Step 17: Click on link object -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 17-Click on link object - Navigate to page teamprojectexecutionstest-result.png')

"Step 18: Click on item object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/item_object2'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 18-Click on item object2.png')

"Step 19: Click on pre TestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_TestStep'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 19-Click on pre TestStep.png')

"Step 20: Click on pre TestStep -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/pre_TestStep'))

WebUI.takeScreenshot(reportLocation + '/TC185/Step 20-Click on pre TestStep - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC185-View and Navigate Test Execution Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}