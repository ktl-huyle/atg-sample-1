import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.scheduleTestRunWithDetails
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.createNewRelease
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

"Step 3: Navigate to /team/*/project/*"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Tests7 -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests7'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 4-Click on link Tests7 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 5: Click on link TestSuites4 -> Navigate to page '/team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites4'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 5-Click on link TestSuites4 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 6: Click on link Reports3 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 6-Click on link Reports3 - Navigate to page teamprojectoverview.png')

"Step 7: Click on link TestRuns15 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns15'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 7-Click on link TestRuns15 - Navigate to page teamprojectexecutions.png')

"Step 8: Click on link Planning2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Planning2'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 8-Click on link Planning2.png')

"Step 9: Create a new release with specified start and end times"

createNewRelease.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Create a new release with specified start and end times"

createNewRelease.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Click on link Reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 11-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 12: Click on link TestCases -> Navigate to page '/team/*/project/*/test-reports/test-maintenance/active'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 12-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenanceactive.png')

"Step 13: Click on link Executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 13-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 14: Click on header testRunTitles (UntitledTestRun34)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 14-Click on header testRunTitles UntitledTestRun34.png')

"Step 15: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 15-Click on button Delete.png')

"Step 16: Click on link Reports10 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports10'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 16-Click on link Reports10 - Navigate to page teamprojectoverview.png')

"Step 17: Click on link TestRuns15 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns15'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 17-Click on link TestRuns15 - Navigate to page teamprojectexecutions.png')

"Step 18: Click on link executionLinks (TestExecution2) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 18-Click on link executionLinks TestExecution2 - Navigate to page teamprojectexecutions.png')

"Step 19: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 19-Click on button LinkToRelease.png')

"Step 20: Click on span testKatalonVersions (TestKatalonV4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonVersions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonVersions', ['span_testKatalonVersions_class': span_testKatalonVersions_class, 'span_testKatalonVersions_internalRoleButtonName': span_testKatalonVersions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 20-Click on span testKatalonVersions TestKatalonV4.png')

"Step 21: Click on div LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 21-Click on div LinkToRelease.png')

"Step 22: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 22-Click on div Backdrop.png')

"Step 23: Click on link TestRuns9 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns9'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 23-Click on link TestRuns9 - Navigate to page teamprojectoverview.png')

"Step 24: Click on link TestRuns15 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns15'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 24-Click on link TestRuns15 - Navigate to page teamprojectexecutions.png')

"Step 25: Click on link executionLinks (TestExecution3) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild_1, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 25-Click on link executionLinks TestExecution3 - Navigate to page teamprojectexecutions.png')

"Step 26: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 26-Click on button LinkToRelease.png')

"Step 27: Click on span testKatalonVersions (TestKatalonV5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonVersions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonVersions', ['span_testKatalonVersions_class': span_testKatalonVersions_class_1, 'span_testKatalonVersions_internalRoleButtonName': span_testKatalonVersions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 27-Click on span testKatalonVersions TestKatalonV5.png')

"Step 28: Click on button LinkToRelease2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease2'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 28-Click on button LinkToRelease2.png')

"Step 29: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 29-Click on div Backdrop.png')

"Step 30: Click on button organizationSelection (FirstProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_organizationSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_organizationSelection', ['button_organizationSelection_internalRoleButtonName': button_organizationSelection_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 30-Click on button organizationSelection FirstProject.png')

"Step 31: Click on link Dashboard2 -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 31-Click on link Dashboard2 - Navigate to page teamproject.png')

"Step 32: Click on link Executions7 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions7'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 32-Click on link Executions7 - Navigate to page teamprojecttest-runs.png')

"Step 33: Click on link Tests7 -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests7'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 33-Click on link Tests7 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 34: Click on link Executions8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions8'))

WebUI.takeScreenshot(reportLocation + '/TC205/Step 34-Click on link Executions8.png')

"Step 35: Schedule multiple test runs with different configurations"

scheduleMultipleTestRuns.execute(data_path_2, Integer.valueOf(index_2))

"Step 36: Schedule a test run with specific details and configurations"

scheduleTestRunWithDetails.execute(data_path_3, Integer.valueOf(index_3))

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC205-Link Test Runs to Releases in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}