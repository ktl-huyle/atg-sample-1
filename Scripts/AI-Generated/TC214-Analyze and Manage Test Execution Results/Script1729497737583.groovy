import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.scheduleMultipleTestRuns

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

"Step 3: Navigate to /team/*/project/*/test-reports/test-execution/test-performance"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-reports/test-execution/test-performance")

"Step 4: Click on link TestRuns3 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 4-Click on link TestRuns3 - Navigate to page teamprojectoverview.png')

"Step 5: Click on link TestRuns15 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns15'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 5-Click on link TestRuns15 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link executionLinks (Number2) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 6-Click on link executionLinks Number2 - Navigate to page teamprojectexecutions.png')

"Step 7: Click on button LinkToRelease3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease3'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 7-Click on button LinkToRelease3.png')

"Step 8: Click on div TestKatalon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestKatalon'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 8-Click on div TestKatalon.png')

"Step 9: Click on link Planning2 -> Navigate to page '/team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Planning2'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 9-Click on link Planning2 - Navigate to page teamprojectreleases.png')

"Step 10: Click on link Tests3 -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests3'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 10-Click on link Tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 11: Click on link Executions8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions8'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 11-Click on link Executions8.png')

"Step 12: Schedule multiple test runs with different configurations"

scheduleMultipleTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 13: Click on link Tests7 -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests7'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 13-Click on link Tests7 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on link Executions8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions8'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 14-Click on link Executions8.png')

"Step 15: Schedule multiple test runs with different configurations"

scheduleMultipleTestRuns.execute(data_path_1, Integer.valueOf(index_1))

"Step 16: Click on header testRunTitles (ScheduleTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 16-Click on header testRunTitles ScheduleTestRun2.png')

"Step 17: Click on header testRunTitles (ScheduleTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 17-Click on header testRunTitles ScheduleTestRun3.png')

"Step 18: Click on header testRunTitles (ScheduleTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 18-Click on header testRunTitles ScheduleTestRun2.png')

"Step 19: Click on button Sessions5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Sessions5'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 19-Click on button Sessions5.png')

"Step 20: Click on button FailedTestResultsTab2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_FailedTestResultsTab2'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 20-Click on button FailedTestResultsTab2.png')

"Step 21: Click on button Sessions5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Sessions5'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 21-Click on button Sessions5.png')

"Step 22: Click on header testRunTitles (ScheduleTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName_3]))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 22-Click on header testRunTitles ScheduleTestRun2.png')

"Step 23: Click on button Details2 -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 23-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 24: Click on link TestResults11 -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults11'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 24-Click on link TestResults11 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 25: Click on link Files4 -> Navigate to page '/team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Files4'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 25-Click on link Files4 - Navigate to page teamprojectexecutionsfiles.png')

"Step 26: Click on link executionFiles (TestFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_executionFiles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_executionFiles', ['link_executionFiles_trNthChild': link_executionFiles_trNthChild, 'link_executionFiles_internalRoleLinkName': link_executionFiles_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 26-Click on link executionFiles TestFile.png')

"Step 27: Click on link TestCases -> Navigate to page '/team/*/project/*/test-reports/test-maintenance/active'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 27-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenanceactive.png')

"Step 28: Click on link testCaseLinks (TC7) -> Navigate to page '/team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance_active/link_testCaseLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance_active/link_testCaseLinks', ['link_testCaseLinks_internalRoleLinkName': link_testCaseLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 28-Click on link testCaseLinks TC7 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 29: Click on link WebServices2 -> Navigate to page '/team/*/project/*/web-services'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_WebServices2'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 29-Click on link WebServices2 - Navigate to page teamprojectweb-services.png')

"Step 30: Click on link TestObjects2 -> Navigate to page '/team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/web-services?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_web_services/link_TestObjects2'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 30-Click on link TestObjects2 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 31: Click on link TestSuites2 -> Navigate to page '/team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/link_TestSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 31-Click on link TestSuites2 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 32: Click on link TestCases2 -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 32-Click on link TestCases2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 33: Click on link Executions8 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions8'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 33-Click on link Executions8 - Navigate to page teamprojecttest-runs.png')

"Step 34: Click on button rowSelection (SelectRow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_rowSelection', ['button_rowSelection_internalRoleRowName': button_rowSelection_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 34-Click on button rowSelection SelectRow3.png')

"Step 35: Click on div popoverBackdrop -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_popoverBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC214/Step 35-Click on div popoverBackdrop - Navigate to page .png')

"Step 36: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC214-Analyze and Manage Test Execution Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}