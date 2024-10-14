import internal.GlobalVariable
import truetest.custom.TrueTestScripts
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

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link projectNavigation (SCSynergyCareManager) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName, 'link_projectNavigation_project_id': link_projectNavigation_project_id, 'link_projectNavigation_team_id': link_projectNavigation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 2-Click on link projectNavigation SCSynergyCareManager - Navigate to page teamproject.png')

"Step 3: Click on button EnableJiraIntegration -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_EnableJiraIntegration'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 3-Click on button EnableJiraIntegration - Navigate to page teamproject.png')

"Step 4: Click on link JiraAddon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_JiraAddon'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 4-Click on link JiraAddon.png')

"Step 5: Click on link JiraAddon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_JiraAddon'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 5-Click on link JiraAddon.png')

"Step 6: Click on div RequiredFieldsMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RequiredFieldsMessage'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 6-Click on div RequiredFieldsMessage.png')

"Step 7: Click on div ColumnContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ColumnContainer'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 7-Click on div ColumnContainer.png')

"Step 8: Click on input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 8-Click on input ServerUrl.png')

"Step 9: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'), input_ServerUrl)

WebUI.takeScreenshot(reportLocation + '/TC77/Step 9-Enter input value in input ServerUrl.png')

"Step 10: Click on div RowContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RowContainer'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 10-Click on div RowContainer.png')

"Step 11: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'), input_ServerUrl)

WebUI.takeScreenshot(reportLocation + '/TC77/Step 11-Enter input value in input ServerUrl.png')

"Step 12: Click on div RowContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RowContainer'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 12-Click on div RowContainer.png')

"Step 13: Click on div RowContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RowContainer'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 13-Click on div RowContainer.png')

"Step 14: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 14-Click on input Username.png')

"Step 15: Click on div PasswordInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_PasswordInfo'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 15-Click on div PasswordInfo.png')

"Step 16: Click on div RowContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_RowContainer'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 16-Click on div RowContainer.png')

"Step 17: Click on link Planning3 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning3'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 17-Click on link Planning3 - Navigate to page teamprojectreleases.png')

"Step 18: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 18-Click on link Dashboard - Navigate to page teamproject.png')

"Step 19: Click on div ZeroCount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ZeroCount'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 19-Click on div ZeroCount.png')

"Step 20: Click on div NewFailuresIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailuresIcon'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 20-Click on div NewFailuresIcon.png')

"Step 21: Click on div NewFailuresIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailuresIcon'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 21-Click on div NewFailuresIcon.png')

"Step 22: Click on link Tests6 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests6'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 22-Click on link Tests6 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 23: Click on link Executions4 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 23-Click on link Executions4 - Navigate to page teamproject.png')

"Step 24: Click on link Planning3 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning3'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 24-Click on link Planning3 - Navigate to page teamprojectreleases.png')

"Step 25: Click on link Tests4 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests4'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 25-Click on link Tests4 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 26: Click on link TestSuites3 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites3_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 26-Click on link TestSuites3 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 27: Click on span KatalonCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_KatalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 27-Click on span KatalonCloud.png')

"Step 28: Click on span treeSwitcher (TreeSwitcher2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcher_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 28-Click on span treeSwitcher TreeSwitcher2.png')

"Step 29: Click on link SettingUpScriptRepository -> Navigate to page 'team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_SettingUpScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 29-Click on link SettingUpScriptRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 30: Click on div CreateGitRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_CreateGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 30-Click on div CreateGitRepository.png')

"Step 31: Login into Application"

TrueTestScripts.login()

"Step 32: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 32-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 33: Click on span treeSwitcher (TreeSwitcher7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1', ['span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 33-Click on span treeSwitcher TreeSwitcher7.png')

"Step 34: Click on span treeSwitcher (TreeSwitcher8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 34-Click on span treeSwitcher TreeSwitcher8.png')

"Step 35: Click on link TestSuites4 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites4'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 35-Click on link TestSuites4 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 36: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 36-Click on link Reports - Navigate to page teamproject.png')

"Step 37: Click on link Planning4 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning4'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 37-Click on link Planning4 - Navigate to page teamprojectreleases.png')

"Step 38: Click on link Requirements2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements2'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 38-Click on link Requirements2 - Navigate to page teamproject.png')

"Step 39: Click on button alertClose (CloseButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_alertClose_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose_1', ['button_alertClose_class': button_alertClose_class, 'button_alertClose_nth': button_alertClose_nth]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 39-Click on button alertClose CloseButton2.png')

"Step 40: Click on div TopNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TopNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 40-Click on div TopNavbar.png')

"Step 41: Click on button alertClose (AlertClose2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_alertClose_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose_1', ['button_alertClose_class': button_alertClose_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 41-Click on button alertClose AlertClose2.png')

"Step 42: Click on div JiraIssuesSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_JiraIssuesSummary'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 42-Click on div JiraIssuesSummary.png')

"Step 43: Click on div JiraIssues"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_JiraIssues'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 43-Click on div JiraIssues.png')

"Step 44: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 44-Click on span SettingsButton.png')

"Step 45: Click on div menu (Backdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 45-Click on div menu Backdrop.png')

"Step 46: Click on link Dashboard3 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard3'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 46-Click on link Dashboard3 - Navigate to page teamproject.png')

"Step 47: Click on div ReleaseReadiness"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReleaseReadiness'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 47-Click on div ReleaseReadiness.png')

"Step 48: Click on td NoDataMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/td_NoDataMessage'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 48-Click on td NoDataMessage.png')

"Step 49: Click on div DashboardRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DashboardRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 49-Click on div DashboardRefresh.png')

"Step 50: Click on link Reports4 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 50-Click on link Reports4 - Navigate to page teamproject.png')

"Step 51: Click on link SummaryByTestResult -> Navigate to page 'team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_SummaryByTestResult_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 51-Click on link SummaryByTestResult - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 52: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_TestRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 52-Click on link TestRuns - Navigate to page teamproject.png')

"Step 53: Click on link RunFrequency -> Navigate to page 'team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_RunFrequency_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 53-Click on link RunFrequency - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 54: Click on link FailedTestResults -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_FailedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 54-Click on link FailedTestResults - Navigate to page teamproject.png')

"Step 55: Click on link projectNavigation (Defects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 55-Click on link projectNavigation Defects.png')

"Step 56: Click on link projectNavigation (VisualTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 56-Click on link projectNavigation VisualTesting.png')

"Step 57: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC77-Integrate Jira with Project Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}