import truetest.common.createNewReleaseWithTimes
import truetest.common.scheduleAndRunTestDemo
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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Tests9 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests9'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 4-Click on link Tests9 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 5: Click on link TestSuites6 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 5-Click on link TestSuites6 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 6: Click on link Reports2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 6-Click on link Reports2 - Navigate to page teamproject.png')

"Step 7: Click on link TestRuns5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 7-Click on link TestRuns5.png')

"Step 8: Click on link Planning5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning5'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 8-Click on link Planning5.png')

"Step 9: Create a new release with specified start and end times"

createNewReleaseWithTimes.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Create a new release with specified start and end times"

createNewReleaseWithTimes.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Click on link settings (Reports) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases/link_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases/link_settings', ['link_settings_nthChild': link_settings_nthChild, 'link_settings_internalRoleLinkName': link_settings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 11-Click on link settings Reports - Navigate to page teamproject.png')

"Step 12: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestCases_1'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 12-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 13: Click on link Executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 13-Click on link Executions - Navigate to page teamproject.png')

"Step 14: Click on header testRun (UntitledTestRun7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 14-Click on header testRun UntitledTestRun7.png')

"Step 15: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 15-Click on button Close.png')

"Step 16: Click on link Reports6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports6'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 16-Click on link Reports6.png')

"Step 17: Click on link TestRuns5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 17-Click on link TestRuns5.png')

"Step 18: Click on link executionNavigation (Executions12) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation', ['link_executionNavigation_trNthChild': link_executionNavigation_trNthChild, 'link_executionNavigation_internalRoleLinkName': link_executionNavigation_internalRoleLinkName, 'link_executionNavigation_executions_id': link_executionNavigation_executions_id, 'link_executionNavigation_team_id': link_executionNavigation_team_id, 'link_executionNavigation_project_id': link_executionNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 18-Click on link executionNavigation Executions12 - Navigate to page teamprojectexecutions.png')

"Step 19: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 19-Click on button LinkToRelease.png')

"Step 20: Click on span testStatus (TestKatalonV4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testStatus', ['span_testStatus_class': span_testStatus_class, 'span_testStatus_internalRoleButtonName': span_testStatus_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 20-Click on span testStatus TestKatalonV4.png')

"Step 21: Click on div LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 21-Click on div LinkToRelease.png')

"Step 22: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 22-Click on div Backdrop.png')

"Step 23: Click on link TestRuns4 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 23-Click on link TestRuns4 - Navigate to page teamproject.png')

"Step 24: Click on link TestRuns5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 24-Click on link TestRuns5.png')

"Step 25: Click on link executionNavigation (Executions13) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation', ['link_executionNavigation_trNthChild': link_executionNavigation_trNthChild_1, 'link_executionNavigation_internalRoleLinkName': link_executionNavigation_internalRoleLinkName_1, 'link_executionNavigation_executions_id': link_executionNavigation_executions_id_1, 'link_executionNavigation_team_id': link_executionNavigation_team_id_1, 'link_executionNavigation_project_id': link_executionNavigation_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 25-Click on link executionNavigation Executions13 - Navigate to page teamprojectexecutions.png')

"Step 26: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 26-Click on button LinkToRelease.png')

"Step 27: Click on span testStatus (TestKatalonV5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testStatus', ['span_testStatus_class': span_testStatus_class_1, 'span_testStatus_internalRoleButtonName': span_testStatus_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 27-Click on span testStatus TestKatalonV5.png')

"Step 28: Click on button LinkToRelease2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 28-Click on button LinkToRelease2.png')

"Step 29: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 29-Click on div Backdrop.png')

"Step 30: Click on button organizationSelection (FirstProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_organizationSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_organizationSelection', ['button_organizationSelection_internalRoleButtonName': button_organizationSelection_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 30-Click on button organizationSelection FirstProject.png')

"Step 31: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 31-Click on link Dashboard - Navigate to page teamproject.png')

"Step 32: Click on link Executions14 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 32-Click on link Executions14 - Navigate to page teamproject.png')

"Step 33: Click on link Tests10 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 33-Click on link Tests10 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 34: Click on link Executions6 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions6'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 34-Click on link Executions6 - Navigate to page teamproject.png')

"Step 35: Click on button ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 35-Click on button ScheduleTestRun2.png')

"Step 36: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_2, Integer.valueOf(index_2))

"Step 37: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_3, Integer.valueOf(index_3))

"Step 38: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC83-Create and Schedule New Test Releases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}