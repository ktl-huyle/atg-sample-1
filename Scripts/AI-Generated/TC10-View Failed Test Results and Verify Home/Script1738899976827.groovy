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

"Step 1: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 2: Click on div failedTestResults (FailedTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestResults', ['div_failedTestResults_class': div_failedTestResults_class, 'div_failedTestResults_internalRoleButtonName': div_failedTestResults_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on div failedTestResults FailedTest.png')

"Step 3: Click on link TestResult -> Navigate to page 'test result#team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResult'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on link TestResult - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 4: Click on item TestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/item_TestResult'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on item TestResult.png')

"Step 5: Click on item TestResult2 -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/item_TestResult2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on item TestResult2 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 6: Click on link PageNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_PageNumber'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on link PageNumber.png')

"Step 7: Click on link TestRuns2 -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on link TestRuns2 - Navigate to page team project overviewteamprojectoverview.png')

"Step 8: Click on link TestRuns -> Navigate to page 'team project executions#team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on link TestRuns - Navigate to page team project executionsteamprojectexecutions.png')

"Step 9: Click on link executionDetails (TestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'executions_id': executions_id, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on link executionDetails TestRunDetails.png')

"Step 10: Click on link executionDetails (TestRunDetails2) -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_1, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'executions_id': executions_id_1, 'team_id': team_id_1, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on link executionDetails TestRunDetails2 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 11: Click on td TestCaseDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_TestCaseDetails'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on td TestCaseDetails.png')

"Step 12: Click on div SessionStatus -> Navigate to page 'team project executions#team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SessionStatus'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on div SessionStatus - Navigate to page team project executionsteamprojectexecutions.png')

"Step 13: Click on link executionDetails (TestRunDetails3) -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_2, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_2, 'executions_id': executions_id_2, 'team_id': team_id_2, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on link executionDetails TestRunDetails3 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 14: Click on pre failedTestInfo (FailedTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestInfo', ['pre_failedTestInfo_class': pre_failedTestInfo_class, 'pre_failedTestInfo_internalRoleButtonName': pre_failedTestInfo_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on pre failedTestInfo FailedTest.png')

"Step 15: Click on link TestResult2 -> Navigate to page 'test result#team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResult2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on link TestResult2 - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 16: Click on item TestResult2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/item_TestResult2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on item TestResult2.png')

"Step 17: Click on pre TestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/pre_TestStep'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on pre TestStep.png')

"Step 18: Click on pre TestStep -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/pre_TestStep'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on pre TestStep - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-View Failed Test Results and Verify Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}