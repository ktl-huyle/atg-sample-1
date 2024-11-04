import truetest.common.configureTestSuiteAndRun
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

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

"Step 3: Navigate to team/*/project/*/test-reports/test-execution/test-performance"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-reports/test-execution/test-performance")

"Step 4: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on link TestRuns - Navigate to page teamproject.png')

"Step 5: Click on link TestRuns4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on link TestRuns4.png')

"Step 6: Click on link executionDetails (TestExecution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_executions_id': link_executionDetails_executions_id, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_team_id': link_executionDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on link executionDetails TestExecution - Navigate to page teamprojectexecutions.png')

"Step 7: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease_1'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Click on button LinkToRelease.png')

"Step 8: Click on div TestKatalon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestKatalon'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 8-Click on div TestKatalon.png')

"Step 9: Click on link Planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Planning_1'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 9-Click on link Planning - Navigate to page teamprojectreleases.png')

"Step 10: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests2_1'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 10-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 11: Click on link Executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 11-Click on link Executions - Navigate to page teamproject.png')

"Step 12: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun_1'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 12-Click on button ScheduleTestRun.png')

"Step 13: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Click on link Tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests3_1'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 14-Click on link Tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 15: Click on link Executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 15-Click on link Executions - Navigate to page teamproject.png')

"Step 16: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun_1'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 16-Click on button ScheduleTestRun.png')

"Step 17: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_1, Integer.valueOf(index_1))

"Step 18: Click on header testRuns (ScheduleTestRunAgent)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 18-Click on header testRuns ScheduleTestRunAgent.png')

"Step 19: Click on header testRuns (ScheduleTestRunAgent2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 19-Click on header testRuns ScheduleTestRunAgent2.png')

"Step 20: Click on header testRuns (ScheduleTestRunAgent)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 20-Click on header testRuns ScheduleTestRunAgent.png')

"Step 21: Click on button SessionsTab3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab3'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 21-Click on button SessionsTab3.png')

"Step 22: Click on button FailedTestResultsTab2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResultsTab2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 22-Click on button FailedTestResultsTab2.png')

"Step 23: Click on button SessionsTab3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab3'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 23-Click on button SessionsTab3.png')

"Step 24: Click on header testRuns (ScheduleTestRunAgent)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_3]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 24-Click on header testRuns ScheduleTestRunAgent.png')

"Step 25: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 25-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 26: Click on link TestResults2 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 26-Click on link TestResults2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 27: Click on link Files -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Files'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 27-Click on link Files - Navigate to page teamprojectexecutionsfiles.png')

"Step 28: Click on link reportFiles (TestCaseFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_reportFiles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_reportFiles', ['link_reportFiles_trNthChild': link_reportFiles_trNthChild, 'link_reportFiles_internalRoleLinkName': link_reportFiles_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 28-Click on link reportFiles TestCaseFile.png')

"Step 29: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 29-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 30: Click on link testCases (TC7) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testCases', ['link_testCases_internalRoleLinkName': link_testCases_internalRoleLinkName, 'link_testCases_test_cases_id': link_testCases_test_cases_id, 'link_testCases_project_id': link_testCases_project_id, 'link_testCases_team_id': link_testCases_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 30-Click on link testCases TC7 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 31: Click on link WebServices -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_WebServices'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 31-Click on link WebServices - Navigate to page teamproject.png')

"Step 32: Click on link TestObjects -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 32-Click on link TestObjects - Navigate to page teamprojecttest-designtest-objects.png')

"Step 33: Click on link TestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 33-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 34: Click on link TestCases -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 34-Click on link TestCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 35: Click on link Executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 35-Click on link Executions - Navigate to page teamproject.png')

"Step 36: Click on button selectRows (SelectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_selectRows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_selectRows', ['button_selectRows_internalRoleRowName': button_selectRows_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 36-Click on button selectRows SelectRow.png')

"Step 37: Click on div dynamicObject (PopoverBackdrop) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 37-Click on div dynamicObject PopoverBackdrop - Navigate to page .png')

"Step 38: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Analyze Test Performance Reports in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}