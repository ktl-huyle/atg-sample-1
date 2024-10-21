import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.runTestSuiteWithAdvancedSettings

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

"Step 3: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 4-Click on button Settings.png')

"Step 5: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 5-Click on div Backdrop.png')

"Step 6: Click on link projectLinks (KPKMSPOC) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 6-Click on link projectLinks KPKMSPOC - Navigate to page teamproject.png')

"Step 7: Click on link Settings4 -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings4'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 7-Click on link Settings4 - Navigate to page teamprojectsettings.png')

"Step 8: Click on link ScriptRepositories7 -> Navigate to page '/team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_ScriptRepositories7'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 8-Click on link ScriptRepositories7 - Navigate to page teamprojecttest-project.png')

"Step 9: Click on link testProjects (SGDPInt) -> Navigate to page '/team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects', ['link_testProjects_trNthChild': link_testProjects_trNthChild, 'link_testProjects_internalRoleLinkName': link_testProjects_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 9-Click on link testProjects SGDPInt - Navigate to page teamprojecttest-project.png')

"Step 10: Click on button Edit2 -> Navigate to page '/team/*/project/*/test-project/*/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_Edit2'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 10-Click on button Edit2 - Navigate to page teamprojecttest-projectedit.png')

"Step 11: Click on input UploadFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_edit/input_UploadFile'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 11-Click on input UploadFile.png')

"Step 12: Click on button Save -> Navigate to page '/team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_edit/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 12-Click on button Save - Navigate to page teamprojecttest-project.png')

"Step 13: Click on button ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 13-Click on button ScheduleTestRun2.png')

"Step 14: Run a test suite with advanced configuration options"

runTestSuiteWithAdvancedSettings.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on div TodayAugust"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_TodayAugust'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 15-Click on div TodayAugust.png')

"Step 16: Click on link testRunViews (ViewSGDP) -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_testRunViews"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_testRunViews', ['link_testRunViews_internalRoleLinkName': link_testRunViews_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 16-Click on link testRunViews ViewSGDP - Navigate to page teamprojecttest-runs.png')

"Step 17: Click on header testRunTitles (TestRunHeading)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 17-Click on header testRunTitles TestRunHeading.png')

"Step 18: Click on button Sessions4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Sessions4'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 18-Click on button Sessions4.png')

"Step 19: Click on div testRunStatistics (NumberDisplay)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunStatistics'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 19-Click on div testRunStatistics NumberDisplay.png')

"Step 20: Click on i objectIcons (NumberIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/i_objectIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/i_objectIcons', ['i_objectIcons_internalHasText': i_objectIcons_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 20-Click on i objectIcons NumberIcon.png')

"Step 21: Click on div TestRunDetail2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestRunDetail2'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 21-Click on div TestRunDetail2.png')

"Step 22: Click on button GoToDetails3 -> Navigate to page '/team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_GoToDetails3'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 22-Click on button GoToDetails3 - Navigate to page teamprojectgridplanjob.png')

"Step 23: Click on link Reports2 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 23-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 24: Click on link TestRuns13 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns13'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 24-Click on link TestRuns13 - Navigate to page teamprojectexecutions.png')

"Step 25: Click on link executionLinks (Number) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 25-Click on link executionLinks Number - Navigate to page teamprojectexecutions.png')

"Step 26: Click on div testCaseDetails (TestCasesHirerJourneyAutoLoanDP152)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class, 'div_testCaseDetails_internalText': div_testCaseDetails_internalText, 'div_testCaseDetails_nth': div_testCaseDetails_nth]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 26-Click on div testCaseDetails TestCasesHirerJourneyAutoLoanDP152.png')

"Step 27: Click on div testCaseDetails (TestCasesHirerJourneyAutoLoanDP76PRTC03)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 27-Click on div testCaseDetails TestCasesHirerJourneyAutoLoanDP76PRTC03.png')

"Step 28: Click on div testCaseDetails (TestCasesHirerJourneyAutoLoanDP76PRTC05)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 28-Click on div testCaseDetails TestCasesHirerJourneyAutoLoanDP76PRTC05.png')

"Step 29: Click on div testCaseDetails (PassedTestCasesHirerJourneyAutoLoanDP152)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 29-Click on div testCaseDetails PassedTestCasesHirerJourneyAutoLoanDP152.png')

"Step 30: Click on link Page22"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Page22'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 30-Click on link Page22.png')

"Step 31: Click on div RightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 31-Click on div RightSidebar2.png')

"Step 32: Click on link testSuites (TestSuitesSprint) -> Navigate to page '/team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 32-Click on link testSuites TestSuitesSprint - Navigate to page teamprojecttest-designtest-suites.png')

"Step 33: Click on link Reports2 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 33-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 34: Click on link TestRuns13 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns13'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 34-Click on link TestRuns13 - Navigate to page teamprojectexecutions.png')

"Step 35: Click on link executionLinks (Number) -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 35-Click on link executionLinks Number - Navigate to page teamprojecttest-runs.png')

"Step 36: Click on button rowSelection (SelectRow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_rowSelection', ['button_rowSelection_internalRoleRowName': button_rowSelection_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 36-Click on button rowSelection SelectRow2.png')

"Step 37: Click on div popoverBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_popoverBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 37-Click on div popoverBackdrop.png')

"Step 38: Click on header testRunTitles (TestRunHeading)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 38-Click on header testRunTitles TestRunHeading.png')

"Step 39: Click on button Details2 -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 39-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 40: Click on link TestRuns8 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 40-Click on link TestRuns8 - Navigate to page teamprojectoverview.png')

"Step 41: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 41-Click on link Reports.png')

"Step 42: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 42-Click on link Reports.png')

"Step 43: Click on link TestRuns13 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns13'))

WebUI.takeScreenshot(reportLocation + '/TC201/Step 43-Click on link TestRuns13 - Navigate to page teamprojectexecutions.png')

"Step 44: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC201-Upload and Manage Test Project Files_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}