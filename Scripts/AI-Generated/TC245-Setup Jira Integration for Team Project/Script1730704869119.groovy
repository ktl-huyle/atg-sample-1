import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 2: Click on link projectLinks (SC SynergyCareManager) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'link_projectLinks_project_id': link_projectLinks_project_id, 'link_projectLinks_team_id': link_projectLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 2-Click on link projectLinks SC SynergyCareManager - Navigate to page teamproject.png')

"Step 3: Click on button EnableJiraIntegration -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_EnableJiraIntegration'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 3-Click on button EnableJiraIntegration - Navigate to page teamproject.png')

"Step 4: Click on link JiraAddOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_JiraAddOn'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 4-Click on link JiraAddOn.png')

"Step 5: Click on link JiraAddOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_JiraAddOn'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 5-Click on link JiraAddOn.png')

"Step 6: Click on div YouNeedToFillInAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_YouNeedToFillInAll'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 6-Click on div YouNeedToFillInAll.png')

"Step 7: Click on div Column12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Column12'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 7-Click on div Column12.png')

"Step 8: Click on input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 8-Click on input ServerUrl.png')

"Step 9: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'), input_ServerUrl)

WebUI.takeScreenshot(reportLocation + '/TC245/Step 9-Enter input value in input ServerUrl.png')

"Step 10: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 10-Click on div Row.png')

"Step 11: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'), input_ServerUrl_1)

WebUI.takeScreenshot(reportLocation + '/TC245/Step 11-Enter input value in input ServerUrl.png')

"Step 12: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 12-Click on div Row.png')

"Step 13: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 13-Click on div Row.png')

"Step 14: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 14-Click on input Username.png')

"Step 15: Click on div PasswordJiraServer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_PasswordJiraServer'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 15-Click on div PasswordJiraServer.png')

"Step 16: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 16-Click on div Row.png')

"Step 17: Click on link Planning2 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning2'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 17-Click on link Planning2 - Navigate to page teamprojectreleases.png')

"Step 18: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 18-Click on link Dashboard - Navigate to page teamproject.png')

"Step 19: Click on div Zero"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Zero'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 19-Click on div Zero.png')

"Step 20: Click on div NewFailures"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 20-Click on div NewFailures.png')

"Step 21: Click on div NewFailures"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 21-Click on div NewFailures.png')

"Step 22: Click on link Tests4 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests4'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 22-Click on link Tests4 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 23: Click on link Executions4 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 23-Click on link Executions4 - Navigate to page teamproject.png')

"Step 24: Click on link Planning2 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning2'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 24-Click on link Planning2 - Navigate to page teamprojectreleases.png')

"Step 25: Click on link Tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests3'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 25-Click on link Tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 26: Click on link TestSuites2 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites2_2'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 26-Click on link TestSuites2 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 27: Click on span KatalonCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_KatalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 27-Click on span KatalonCloud.png')

"Step 28: Click on span treeSwitchers (TreeSwitcher2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 28-Click on span treeSwitchers TreeSwitcher2.png')

"Step 29: Click on link SettingUpScriptRepository -> Navigate to page 'team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_SettingUpScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 29-Click on link SettingUpScriptRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 30: Click on div CreateNewGitRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_CreateNewGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 30-Click on div CreateNewGitRepository.png')

"Step 31: Login into Application"

TrueTestScripts.login()

"Step 32: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 32-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 33: Click on span treeSwitchers (TreeSwitcher16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 33-Click on span treeSwitchers TreeSwitcher16.png')

"Step 34: Click on span treeSwitchers (TreeSwitcher17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 34-Click on span treeSwitchers TreeSwitcher17.png')

"Step 35: Click on link TestSuites3 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites3_1'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 35-Click on link TestSuites3 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 36: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 36-Click on link Reports - Navigate to page teamproject.png')

"Step 37: Click on link Planning3 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning3'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 37-Click on link Planning3 - Navigate to page teamprojectreleases.png')

"Step 38: Click on link Requirements2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements2'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 38-Click on link Requirements2 - Navigate to page teamproject.png')

"Step 39: Click on button closeAlerts (CloseButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeAlerts', ['button_closeAlerts_class': button_closeAlerts_class, 'button_closeAlerts_nth': button_closeAlerts_nth]))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 39-Click on button closeAlerts CloseButton.png')

"Step 40: Click on div UnderTopNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnderTopNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 40-Click on div UnderTopNavbar.png')

"Step 41: Click on button closeAlerts (CloseButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeAlerts', ['button_closeAlerts_class': button_closeAlerts_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 41-Click on button closeAlerts CloseButton2.png')

"Step 42: Click on div JiraIssues"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_JiraIssues'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 42-Click on div JiraIssues.png')

"Step 43: Click on div JiraIssues2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_JiraIssues2'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 43-Click on div JiraIssues2.png')

"Step 44: Click on span settings (Settings2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_settings', ['span_settings_nthChild': span_settings_nthChild, 'span_settings_internalRoleButtonName': span_settings_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 44-Click on span settings Settings2.png')

"Step 45: Click on div dynamicObject (MuiBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 45-Click on div dynamicObject MuiBackdrop.png')

"Step 46: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard_1'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 46-Click on link Dashboard - Navigate to page teamproject.png')

"Step 47: Click on div ReleaseReadiness"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReleaseReadiness'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 47-Click on div ReleaseReadiness.png')

"Step 48: Click on td NoDataToDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/td_NoDataToDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 48-Click on td NoDataToDisplay.png')

"Step 49: Click on div DashboardRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DashboardRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 49-Click on div DashboardRefresh.png')

"Step 50: Click on link Reports5 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports5'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 50-Click on link Reports5 - Navigate to page teamproject.png')

"Step 51: Click on link SummaryByTestResult -> Navigate to page 'team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_SummaryByTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 51-Click on link SummaryByTestResult - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 52: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_TestRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 52-Click on link TestRuns - Navigate to page teamproject.png')

"Step 53: Click on link RunFrequency2 -> Navigate to page 'team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_RunFrequency2'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 53-Click on link RunFrequency2 - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 54: Click on link FailedTestResultsBeta -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_FailedTestResultsBeta'))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 54-Click on link FailedTestResultsBeta - Navigate to page teamproject.png')

"Step 55: Click on link dynamicLinks (Defects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1', ['link_dynamicLinks_nthChild': link_dynamicLinks_nthChild, 'link_dynamicLinks_internalRoleLinkName': link_dynamicLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 55-Click on link dynamicLinks Defects.png')

"Step 56: Click on link dynamicLinks (VisualTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1', ['link_dynamicLinks_internalRoleLinkName': link_dynamicLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC245/Step 56-Click on link dynamicLinks VisualTesting.png')

"Step 57: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC245-Setup Jira Integration for Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}