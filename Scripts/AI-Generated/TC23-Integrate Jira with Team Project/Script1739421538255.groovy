import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link projectDetails (SC SynergyCareManager) -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails', ['link_projectDetails_internalRoleLinkName': link_projectDetails_internalRoleLinkName, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 2-Click on link projectDetails SC SynergyCareManager - Navigate to page team projectteamproject.png')

"Step 3: Click on button EnableJiraIntegration -> Navigate to page 'team project integrations#team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_EnableJiraIntegration'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Click on button EnableJiraIntegration - Navigate to page team project integrationsteamprojectintegrations.png')

"Step 4: Click on link JiraAddon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_JiraAddon'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on link JiraAddon.png')

"Step 5: Click on link JiraAddon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_JiraAddon'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on link JiraAddon.png')

"Step 6: Click on div FillInAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_FillInAll'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on div FillInAll.png')

"Step 7: Click on div Column12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_Column12'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on div Column12.png')

"Step 8: Click on input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/input_ServerUrl'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on input ServerUrl.png')

"Step 9: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_integrations/input_ServerUrl'), input_ServerUrl)

WebUI.takeScreenshot(reportLocation + '/TC23/Step 9-Enter input value in input ServerUrl.png')

"Step 10: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 10-Click on div Row.png')

"Step 11: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_integrations/input_ServerUrl'), input_ServerUrl_1)

WebUI.takeScreenshot(reportLocation + '/TC23/Step 11-Enter input value in input ServerUrl.png')

"Step 12: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 12-Click on div Row.png')

"Step 13: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 13-Click on div Row.png')

"Step 14: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 14-Click on input Username.png')

"Step 15: Click on div PasswordJiraAPIKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_PasswordJiraAPIKey'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 15-Click on div PasswordJiraAPIKey.png')

"Step 16: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 16-Click on div Row.png')

"Step 17: Click on link Planning -> Navigate to page 'team project releases#team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 17-Click on link Planning - Navigate to page team project releasesteamprojectreleases.png')

"Step 18: Click on link Dashboard -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 18-Click on link Dashboard - Navigate to page team projectteamproject.png')

"Step 19: Click on div Zero"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Zero'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 19-Click on div Zero.png')

"Step 20: Click on div NewFailures"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 20-Click on div NewFailures.png')

"Step 21: Click on div NewFailures"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 21-Click on div NewFailures.png')

"Step 22: Click on link tests (Tests2) -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_tests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_tests', ['link_tests_nthChild': link_tests_nthChild, 'path_param_5': path_param_5, 'path_param_6': path_param_6, 'project_id': project_id_1, 'team_id': team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 22-Click on link tests Tests2 - Navigate to page team project detailsteamproject.png')

"Step 23: Click on link Executions2 -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 23-Click on link Executions2 - Navigate to page team project detailteamproject.png')

"Step 24: Click on link Planning -> Navigate to page 'team project releases#team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 24-Click on link Planning - Navigate to page team project releasesteamprojectreleases.png')

"Step 25: Click on link Tests -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 25-Click on link Tests - Navigate to page team project detailsteamproject.png')

"Step 26: Click on link testSuites (TestSuites2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuites', ['link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName, 'path_param_5': path_param_5_1, 'path_param_6': path_param_6_1, 'project_id': project_id_2, 'team_id': team_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 26-Click on link testSuites TestSuites2.png')

"Step 27: Click on span KatalonCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/span_KatalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 27-Click on span KatalonCloud.png')

"Step 28: Click on span objectTree (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_objectTree'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 28-Click on span objectTree TreeSwitcher.png')

"Step 29: Click on link SettingUpScriptRepository -> Navigate to page 'team project setup#team/*/project/*/*/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_SettingUpScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 29-Click on link SettingUpScriptRepository - Navigate to page team project setupteamprojectsetup.png')

"Step 30: Click on div CreateNewGitRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_setup/div_CreateNewGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 30-Click on div CreateNewGitRepository.png')

"Step 31: Login into Application"

TrueTestScripts.login()

"Step 32: Click on link Tests -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_setup/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 32-Click on link Tests - Navigate to page team project detailsteamproject.png')

"Step 33: Click on span objectTree (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_objectTree'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 33-Click on span objectTree object.png')

"Step 34: Click on span treeSwitcher (TreeSwitcherIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 34-Click on span treeSwitcher TreeSwitcherIcon.png')

"Step 35: Click on link testSuites (TestSuites3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuites', ['link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName_1, 'path_param_5': path_param_5_2, 'path_param_6': path_param_6_2, 'project_id': project_id_3, 'team_id': team_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 35-Click on link testSuites TestSuites3.png')

"Step 36: Click on link Reports -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 36-Click on link Reports - Navigate to page team project overviewteamprojectoverview.png')

"Step 37: Click on link Planning -> Navigate to page 'team project releases#team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 37-Click on link Planning - Navigate to page team project releasesteamprojectreleases.png')

"Step 38: Click on link Requirements -> Navigate to page 'team project requirements#team/*/project/*/requirements'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 38-Click on link Requirements - Navigate to page team project requirementsteamprojectrequirements.png')

"Step 39: Click on button alertActions (Close)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_requirements/button_alertActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_requirements/button_alertActions', ['button_alertActions_class': button_alertActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 39-Click on button alertActions Close.png')

"Step 40: Click on div UnderTopNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/div_UnderTopNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 40-Click on div UnderTopNavbar.png')

"Step 41: Click on button alertActions (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_requirements/button_alertActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_requirements/button_alertActions', ['button_alertActions_class': button_alertActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 41-Click on button alertActions AlertClose.png')

"Step 42: Click on div TotalJiraIssues"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/div_TotalJiraIssues'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 42-Click on div TotalJiraIssues.png')

"Step 43: Click on div JiraIssues"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/div_JiraIssues'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 43-Click on div JiraIssues.png')

"Step 44: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 44-Click on span Settings.png')

"Step 45: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 45-Click on div Backdrop.png')

"Step 46: Click on link Dashboard -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 46-Click on link Dashboard - Navigate to page team projectteamproject.png')

"Step 47: Click on div ReleaseReadiness"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReleaseReadiness'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 47-Click on div ReleaseReadiness.png')

"Step 48: Click on td NoDataDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/td_NoDataDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 48-Click on td NoDataDisplay.png')

"Step 49: Click on div DashboardRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DashboardRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 49-Click on div DashboardRefresh.png')

"Step 50: Click on link Reports3 -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 50-Click on link Reports3 - Navigate to page team project overviewteamprojectoverview.png')

"Step 51: Click on link SummaryByTestResult -> Navigate to page 'test performance report#team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_SummaryByTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 51-Click on link SummaryByTestResult - Navigate to page test performance reportteamprojecttest-reportstest-executiontest-performance.png')

"Step 52: Click on link TestRuns -> Navigate to page 'team project executions#team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_performance_report/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 52-Click on link TestRuns - Navigate to page team project executionsteamprojectexecutions.png')

"Step 53: Click on link RunFrequency -> Navigate to page 'report#team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_RunFrequency'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 53-Click on link RunFrequency - Navigate to page reportteamprojecttest-reportstest-executionfrequency-report.png')

"Step 54: Click on link FailedTestResults -> Navigate to page 'team project#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report/link_FailedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 54-Click on link FailedTestResults - Navigate to page team projectteamproject.png')

"Step 55: Click on link Defects -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Defects'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 55-Click on link Defects - Navigate to page team project detailteamproject.png')

"Step 56: Click on link calendarActions (VisualTesting) -> Navigate to page 'team project#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/link_calendarActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/link_calendarActions', ['link_calendarActions_internalRoleLinkName': link_calendarActions_internalRoleLinkName, 'path_param_5': path_param_5_3, 'project_id': project_id_4, 'team_id': team_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 56-Click on link calendarActions VisualTesting - Navigate to page team projectteamproject.png')

"Step 57: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Integrate Jira with Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}