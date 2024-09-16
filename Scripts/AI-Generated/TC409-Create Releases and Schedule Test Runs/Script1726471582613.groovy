import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import katalon.common.createReleaseWithTimeframe
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.scheduleTestRunWithActiveTunnels

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

"Step 4: Click on link tests10 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests10'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 4-Click on link tests10 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 5: Click on link testSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites_1'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 5-Click on link testSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 6: Click on link reports2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_reports2'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 6-Click on link reports2 - Navigate to page teamproject.png')

"Step 7: Click on link testRuns13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns13'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 7-Click on link testRuns13.png')

"Step 8: Click on link planning5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning5'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 8-Click on link planning5.png')

"Step 9: Create a release with specified start and end time."

createReleaseWithTimeframe.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Create a release with specified start and end time."

createReleaseWithTimeframe.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Click on link projectSettings (reports) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases/link_projectSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases/link_projectSettings', ['link_projectSettings_nthChild': link_projectSettings_nthChild, 'link_projectSettings_internalRoleLinkName': link_projectSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 11-Click on link projectSettings reports - Navigate to page teamproject.png')

"Step 12: Click on link testCases2 -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCases2'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 12-Click on link testCases2 - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 13: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 13-Click on link executions - Navigate to page teamproject.png')

"Step 14: Click on header projectObjects (object13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 14-Click on header projectObjects object13.png')

"Step 15: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 15-Click on button object4.png')

"Step 16: Click on link reports12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports12'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 16-Click on link reports12.png')

"Step 17: Click on link testRuns13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns13'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 17-Click on link testRuns13.png')

"Step 18: Click on link executionObjects (object3) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects', ['link_executionObjects_trNthChild': link_executionObjects_trNthChild, 'link_executionObjects_internalRoleLinkName': link_executionObjects_internalRoleLinkName, 'link_executionObjects_executions_id': link_executionObjects_executions_id, 'link_executionObjects_project_id': link_executionObjects_project_id, 'link_executionObjects_team_id': link_executionObjects_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 18-Click on link executionObjects object3 - Navigate to page teamprojectexecutions.png')

"Step 19: Click on button linkToArelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_linkToArelease'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 19-Click on button linkToArelease.png')

"Step 20: Click on span testVersions (testKatalonV4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testVersions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testVersions', ['span_testVersions_class': span_testVersions_class, 'span_testVersions_internalRoleButtonName': span_testVersions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 20-Click on span testVersions testKatalonV4.png')

"Step 21: Click on div linkToArelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_linkToArelease'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 21-Click on div linkToArelease.png')

"Step 22: Click on div object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object9'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 22-Click on div object9.png')

"Step 23: Click on link testRuns5 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 23-Click on link testRuns5 - Navigate to page teamproject.png')

"Step 24: Click on link testRuns13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns13'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 24-Click on link testRuns13.png')

"Step 25: Click on link executionObjects (object4) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects', ['link_executionObjects_trNthChild': link_executionObjects_trNthChild_1, 'link_executionObjects_internalRoleLinkName': link_executionObjects_internalRoleLinkName_1, 'link_executionObjects_executions_id': link_executionObjects_executions_id_1, 'link_executionObjects_project_id': link_executionObjects_project_id_1, 'link_executionObjects_team_id': link_executionObjects_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 25-Click on link executionObjects object4 - Navigate to page teamprojectexecutions.png')

"Step 26: Click on button linkToArelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_linkToArelease'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 26-Click on button linkToArelease.png')

"Step 27: Click on span testVersions (testKatalonV5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testVersions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testVersions', ['span_testVersions_class': span_testVersions_class_1, 'span_testVersions_internalRoleButtonName': span_testVersions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 27-Click on span testVersions testKatalonV5.png')

"Step 28: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 28-Click on button object2.png')

"Step 29: Click on div object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object9'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 29-Click on div object9.png')

"Step 30: Click on button projectActions (firstProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 30-Click on button projectActions firstProject.png')

"Step 31: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_dashboard_1'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 31-Click on link dashboard - Navigate to page teamproject.png')

"Step 32: Click on link executions18 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions18'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 32-Click on link executions18 - Navigate to page teamproject.png')

"Step 33: Click on link tests11 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests11'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 33-Click on link tests11 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 34: Click on link executions6 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions6'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 34-Click on link executions6 - Navigate to page teamproject.png')

"Step 35: Click on button scheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_scheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC409/Step 35-Click on button scheduleTestRun2.png')

"Step 36: Schedule a test run with selected active tunnels and environments."

scheduleTestRunWithActiveTunnels.execute(data_path_2, Integer.valueOf(index_2))

"Step 37: Schedule a test run with selected active tunnels and environments."

scheduleTestRunWithActiveTunnels.execute(data_path_3, Integer.valueOf(index_3))

"Step 38: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC409-Create Releases and Schedule Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}