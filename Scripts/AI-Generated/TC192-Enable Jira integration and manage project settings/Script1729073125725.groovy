import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/{*}/home"

TrueTestScripts.navigate("organization/{*}/home")

"Step 2: Click on link projectLinks (SC Synergy Care Manager) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 2-Click on link projectLinks SC Synergy Care Manager - Navigate to page team projectteamproject.png')

"Step 3: Click on button EnableJiraIntegration -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_EnableJiraIntegration'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 3-Click on button EnableJiraIntegration - Navigate to page team projectteamproject.png')

"Step 4: Click on link JiraAddon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_JiraAddon'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 4-Click on link JiraAddon.png')

"Step 5: Click on link JiraAddon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_JiraAddon'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 5-Click on link JiraAddon.png')

"Step 6: Click on div RequiredFieldsMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RequiredFieldsMessage'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 6-Click on div RequiredFieldsMessage.png')

"Step 7: Click on div ColumnContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ColumnContainer'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 7-Click on div ColumnContainer.png')

"Step 8: Click on input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 8-Click on input ServerUrl.png')

"Step 9: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'), input_ServerUrl)

WebUI.takeScreenshot(reportLocation + '/TC192/Step 9-Enter input value in input ServerUrl.png')

"Step 10: Click on div RowContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RowContainer'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 10-Click on div RowContainer.png')

"Step 11: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'), input_ServerUrl)

WebUI.takeScreenshot(reportLocation + '/TC192/Step 11-Enter input value in input ServerUrl.png')

"Step 12: Click on div RowContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RowContainer'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 12-Click on div RowContainer.png')

"Step 13: Click on div RowContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RowContainer'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 13-Click on div RowContainer.png')

"Step 14: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 14-Click on input Username.png')

"Step 15: Click on div PasswordInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_PasswordInfo'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 15-Click on div PasswordInfo.png')

"Step 16: Click on div RowContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RowContainer'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 16-Click on div RowContainer.png')

"Step 17: Click on link Planning -> Navigate to page 'team project releases#team/{*}/project/{*}/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 17-Click on link Planning - Navigate to page team project releasesteamprojectreleases.png')

"Step 18: Click on link Dashboard -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 18-Click on link Dashboard - Navigate to page team projectteamproject.png')

"Step 19: Click on div ZeroCount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ZeroCount'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 19-Click on div ZeroCount.png')

"Step 20: Click on div NewFailuresIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailuresIcon'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 20-Click on div NewFailuresIcon.png')

"Step 21: Click on div NewFailuresIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailuresIcon'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 21-Click on div NewFailuresIcon.png')

"Step 22: Click on link Tests5 -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests5'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 22-Click on link Tests5 - Navigate to page team projectteamproject.png')

"Step 23: Click on link executions4 -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions4'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 23-Click on link executions4 - Navigate to page team projectteamproject.png')

"Step 24: Click on link Planning -> Navigate to page 'team project releases#team/{*}/project/{*}/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 24-Click on link Planning - Navigate to page team project releasesteamprojectreleases.png')

"Step 25: Click on link Tests2 -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests2'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 25-Click on link Tests2 - Navigate to page team projectteamproject.png')

"Step 26: Click on link testSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 26-Click on link testSuites.png')

"Step 27: Click on span katalonCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_katalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 27-Click on span katalonCloud.png')

"Step 28: Click on span treeSwitcher (treeSwitcher2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 28-Click on span treeSwitcher treeSwitcher2.png')

"Step 29: Click on link scriptRepository -> Navigate to page 'team project setup#team/{*}/project/{*}/{*}/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 29-Click on link scriptRepository - Navigate to page team project setupteamprojectsetup.png')

"Step 30: Click on div createGitRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_setup/div_createGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 30-Click on div createGitRepository.png')

"Step 31: Login into Application"

TrueTestScripts.login()

"Step 32: Click on link tests -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_setup/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 32-Click on link tests - Navigate to page team projectteamproject.png')

"Step 33: Click on span treeSwitcher (TreeSwitcher2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcher', ['span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 33-Click on span treeSwitcher TreeSwitcher2.png')

"Step 34: Click on span treeSwitcherIcons (treeSwitcherIcon7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 34-Click on span treeSwitcherIcons treeSwitcherIcon7.png')

"Step 35: Click on link testSuites2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 35-Click on link testSuites2.png')

"Step 36: Click on link Reports8 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports8'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 36-Click on link Reports8 - Navigate to page team project overviewteamprojectoverview.png')

"Step 37: Click on link Planning -> Navigate to page 'team project releases#team/{*}/project/{*}/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 37-Click on link Planning - Navigate to page team project releasesteamprojectreleases.png')

"Step 38: Click on link Requirements -> Navigate to page 'team project requirements#team/{*}/project/{*}/requirements'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 38-Click on link Requirements - Navigate to page team project requirementsteamprojectrequirements.png')

"Step 39: Click on button dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_requirements/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_requirements/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 39-Click on button dynamicObject object.png')

"Step 40: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 40-Click on div object.png')

"Step 41: Click on button dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_requirements/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_requirements/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 41-Click on button dynamicObject object2.png')

"Step 42: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 42-Click on div object2.png')

"Step 43: Click on div Jira Issues"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/div_Jira_Issues'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 43-Click on div Jira Issues.png')

"Step 44: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 44-Click on span Settings.png')

"Step 45: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 45-Click on div object3.png')

"Step 46: Click on link Dashboard -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 46-Click on link Dashboard - Navigate to page team projectteamproject.png')

"Step 47: Click on div ReleaseReadiness"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReleaseReadiness'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 47-Click on div ReleaseReadiness.png')

"Step 48: Click on td NoDataMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/td_NoDataMessage'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 48-Click on td NoDataMessage.png')

"Step 49: Click on div DashboardRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DashboardRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 49-Click on div DashboardRefresh.png')

"Step 50: Click on link Reports9 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports9'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 50-Click on link Reports9 - Navigate to page team project overviewteamprojectoverview.png')

"Step 51: Click on link Summary by Test Result -> Navigate to page 'test performance report#team/{*}/project/{*}/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Summary_by_Test_Result'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 51-Click on link Summary by Test Result - Navigate to page test performance reportteamprojecttest-reportstest-executiontest-performance.png')

"Step 52: Click on link testRuns -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_performance_report/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 52-Click on link testRuns - Navigate to page team project executionsteamprojectexecutions.png')

"Step 53: Click on link Run Frequency -> Navigate to page 'report page#team/{*}/project/{*}/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Run_Frequency'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 53-Click on link Run Frequency - Navigate to page report pageteamprojecttest-reportstest-executionfrequency-report.png')

"Step 54: Click on link failedTestResults -> Navigate to page 'failed test result#team/{*}/project/{*}/failed-test-result'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_page/link_failedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 54-Click on link failedTestResults - Navigate to page failed test resultteamprojectfailed-test-result.png')

"Step 55: Click on link defects -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/failed-test-result?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_failed_test_result/link_defects'))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 55-Click on link defects - Navigate to page team projectteamproject.png')

"Step 56: Click on link teamProjectTools (VisualTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_teamProjectTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_teamProjectTools', ['link_teamProjectTools_internalRoleLinkName': link_teamProjectTools_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC192/Step 56-Click on link teamProjectTools VisualTesting.png')

"Step 57: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC192-Enable Jira integration and manage project settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}