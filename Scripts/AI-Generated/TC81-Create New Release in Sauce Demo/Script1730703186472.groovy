import truetest.common.configureTestSuiteAndRun
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.common.createNewRelease
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

"Step 4: Click on link Tests10 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests10'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 4-Click on link Tests10 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 5: Click on link TestSuites2 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites2_1'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 5-Click on link TestSuites2 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 6: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 6-Click on link reports - Navigate to page teamproject.png')

"Step 7: Click on link TestRuns4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4_1'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 7-Click on link TestRuns4.png')

"Step 8: Click on link Planning6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning6'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 8-Click on link Planning6.png')

"Step 9: Create a new release with specified start and end times."

createNewRelease.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Create a new release with specified start and end times."

createNewRelease.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Click on link settings (reports2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases/link_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases/link_settings', ['link_settings_nthChild': link_settings_nthChild, 'link_settings_internalRoleLinkName': link_settings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 11-Click on link settings reports2 - Navigate to page teamproject.png')

"Step 12: Click on link testCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 12-Click on link testCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 13: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 13-Click on link executions - Navigate to page teamproject.png')

"Step 14: Click on header testRuns (testRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 14-Click on header testRuns testRun.png')

"Step 15: Click on button Icon3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Icon3'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 15-Click on button Icon3.png')

"Step 16: Click on link reports3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports3'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 16-Click on link reports3.png')

"Step 17: Click on link TestRuns4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4_1'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 17-Click on link TestRuns4.png')

"Step 18: Click on link executionDetails (executionDetails) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 18-Click on link executionDetails executionDetails - Navigate to page teamprojectexecutions.png')

"Step 19: Click on button LinkToRelease2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 19-Click on button LinkToRelease2.png')

"Step 20: Click on span testKatalon (testKatalon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalon', ['span_testKatalon_class': span_testKatalon_class, 'span_testKatalon_internalRoleButtonName': span_testKatalon_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 20-Click on span testKatalon testKatalon.png')

"Step 21: Click on div linkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_linkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 21-Click on div linkToRelease.png')

"Step 22: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 22-Click on div backdrop.png')

"Step 23: Click on link testRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 23-Click on link testRuns - Navigate to page teamproject.png')

"Step 24: Click on link TestRuns4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4_1'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 24-Click on link TestRuns4.png')

"Step 25: Click on link executionDetails (executionDetails2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_1, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'link_executionDetails_project_id': link_executionDetails_project_id_1, 'link_executionDetails_team_id': link_executionDetails_team_id_1, 'link_executionDetails_executions_id': link_executionDetails_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 25-Click on link executionDetails executionDetails2 - Navigate to page teamprojectexecutions.png')

"Step 26: Click on button LinkToRelease2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 26-Click on button LinkToRelease2.png')

"Step 27: Click on span testKatalon (testKatalon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalon', ['span_testKatalon_class': span_testKatalon_class_1, 'span_testKatalon_internalRoleButtonName': span_testKatalon_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 27-Click on span testKatalon testKatalon2.png')

"Step 28: Click on button linkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_linkToRelease_2'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 28-Click on button linkToRelease.png')

"Step 29: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 29-Click on div backdrop.png')

"Step 30: Click on button projectActions (firstProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 30-Click on button projectActions firstProject.png')

"Step 31: Click on link dashboard2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 31-Click on link dashboard2 - Navigate to page teamproject.png')

"Step 32: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions_1'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 32-Click on link executions - Navigate to page teamproject.png')

"Step 33: Click on link Tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests3_1'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 33-Click on link Tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 34: Click on link Executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions_1'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 34-Click on link Executions - Navigate to page teamproject.png')

"Step 35: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun_1'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 35-Click on button ScheduleTestRun.png')

"Step 36: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_2, Integer.valueOf(index_2))

"Step 37: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_3, Integer.valueOf(index_3))

"Step 38: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC81-Create New Release in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}