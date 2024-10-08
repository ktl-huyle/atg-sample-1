import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.common.configureTestSuiteSettings
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration

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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on i Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 4-Click on i Unknown.png')

"Step 5: Click on header testRunHeaders (UntitledTestRun8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 5-Click on header testRunHeaders UntitledTestRun8.png')

"Step 6: Click on i testCounts (TotalTests)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/i_testCounts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/i_testCounts', ['i_testCounts_internalHasText': i_testCounts_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 6-Click on i testCounts TotalTests.png')

"Step 7: Click on i testCounts (TotalTests)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/i_testCounts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/i_testCounts', ['i_testCounts_internalHasText': i_testCounts_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 7-Click on i testCounts TotalTests.png')

"Step 8: Click on button SessionsTab2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 8-Click on button SessionsTab2.png')

"Step 9: Click on button FailedTestResults3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResults3'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 9-Click on button FailedTestResults3.png')

"Step 10: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 10-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 11: Click on link testSuiteLinks (TestSuite iOS) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteLinks', ['link_testSuiteLinks_trNthChild': link_testSuiteLinks_trNthChild, 'link_testSuiteLinks_internalRoleLinkName': link_testSuiteLinks_internalRoleLinkName, 'link_testSuiteLinks_test_suites_id': link_testSuiteLinks_test_suites_id, 'link_testSuiteLinks_project_id': link_testSuiteLinks_project_id, 'link_testSuiteLinks_team_id': link_testSuiteLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 11-Click on link testSuiteLinks TestSuite iOS - Navigate to page teamprojecttest-designtest-suites.png')

"Step 12: Click on link testSuiteLinks (TestResults) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks', ['link_testSuiteLinks_internalRoleRowName': link_testSuiteLinks_internalRoleRowName, 'link_testSuiteLinks_executions_id': link_testSuiteLinks_executions_id, 'link_testSuiteLinks_project_id': link_testSuiteLinks_project_id_1, 'link_testSuiteLinks_team_id': link_testSuiteLinks_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 12-Click on link testSuiteLinks TestResults - Navigate to page teamprojectexecutions.png')

"Step 13: Click on link TestResults8 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults8'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 13-Click on link TestResults8 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 14: Click on span PassedTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_PassedTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 14-Click on span PassedTestCase.png')

"Step 15: Click on div InfoSidebarCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_InfoSidebarCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 15-Click on div InfoSidebarCloseButton.png')

"Step 16: Click on link Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 16-Click on link Settings.png')

"Step 17: Configure settings for the test suite and save changes."

configureTestSuiteSettings.execute(data_path_0, Integer.valueOf(index_0))

"Step 18: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 18-Click on button Settings.png')

"Step 19: Click on div menuBackdrops (Backdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops', ['div_menuBackdrops_class': div_menuBackdrops_class]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 19-Click on div menuBackdrops Backdrop.png')

"Step 20: Click on link projectLinks (Integrations2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_nthChild': link_projectLinks_nthChild, 'link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 20-Click on link projectLinks Integrations2.png')

"Step 21: Click on div expandIcons (CodelessAutomationTool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons', ['div_expandIcons_class': div_expandIcons_class, 'div_expandIcons_internalRoleTreeitemName': div_expandIcons_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 21-Click on div expandIcons CodelessAutomationTool.png')

"Step 22: Click on div expandIcons (ExpandMoreIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons', ['div_expandIcons_class': div_expandIcons_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 22-Click on div expandIcons ExpandMoreIcon.png')

"Step 23: Click on div expandIcons (ALMTestManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons', ['div_expandIcons_class': div_expandIcons_class_2, 'div_expandIcons_internalRoleTreeitemName': div_expandIcons_internalRoleTreeitemName_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 23-Click on div expandIcons ALMTestManagement.png')

"Step 24: Click on div expandIcons (ExpandMoreIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons', ['div_expandIcons_class': div_expandIcons_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 24-Click on div expandIcons ExpandMoreIcon2.png')

"Step 25: Click on div expandIcons (CICDPipeline)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons', ['div_expandIcons_class': div_expandIcons_class_4, 'div_expandIcons_internalRoleTreeitemName': div_expandIcons_internalRoleTreeitemName_2]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 25-Click on div expandIcons CICDPipeline.png')

"Step 26: Click on div expandIcons (ExpandMoreIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_expandIcons', ['div_expandIcons_class': div_expandIcons_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 26-Click on div expandIcons ExpandMoreIcon3.png')

"Step 27: Click on link projectLinks (CustomFields2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 27-Click on link projectLinks CustomFields2.png')

"Step 28: Click on link projectLinks (TestCloudTunnels4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_nthChild': link_projectLinks_nthChild_1, 'link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 28-Click on link projectLinks TestCloudTunnels4.png')

"Step 29: Click on link projectLinks (CustomFields2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 29-Click on link projectLinks CustomFields2.png')

"Step 30: Click on link projectLinks (Integrations2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_nthChild': link_projectLinks_nthChild_2, 'link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 30-Click on link projectLinks Integrations2.png')

"Step 31: Click on div menuBackdrops (GPTManualTestGenerator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops', ['div_menuBackdrops_class': div_menuBackdrops_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 31-Click on div menuBackdrops GPTManualTestGenerator.png')

"Step 32: Click on div Integrations"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 32-Click on div Integrations.png')

"Step 33: Click on link projectLinks (TestEnvironments4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_nthChild': link_projectLinks_nthChild_3, 'link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 33-Click on link projectLinks TestEnvironments4.png')

"Step 34: Click on link projectLinks (ScriptRepositories5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_nthChild': link_projectLinks_nthChild_4, 'link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 34-Click on link projectLinks ScriptRepositories5.png')

"Step 35: Click on link projectLinks (General2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_nthChild': link_projectLinks_nthChild_5, 'link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 35-Click on link projectLinks General2.png')

"Step 36: Click on link Tests11 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests11'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 36-Click on link Tests11 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 37: Click on link Executions6 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions6'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 37-Click on link Executions6 - Navigate to page teamproject.png')

"Step 38: Click on button rowSelection (SelectRow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection', ['button_rowSelection_internalRoleRowName': button_rowSelection_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 38-Click on button rowSelection SelectRow3.png')

"Step 39: Click on div menuBackdrops (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops', ['div_menuBackdrops_class': div_menuBackdrops_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 39-Click on div menuBackdrops PopoverBackdrop.png')

"Step 40: Click on link Reports13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports13'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 40-Click on link Reports13.png')

"Step 41: Click on link UploadReports2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_UploadReports2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 41-Click on link UploadReports2.png')

"Step 42: Configure settings for the test suite and save changes."

configureTestSuiteSettings.execute(data_path_1, Integer.valueOf(index_1))

"Step 43: Click on link Reports14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports14'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 43-Click on link Reports14.png')

"Step 44: Click on link projectLinks (TestRuns13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 44-Click on link projectLinks TestRuns13.png')

"Step 45: Click on link TestRuns14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns14'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 45-Click on link TestRuns14.png')

"Step 46: Click on link executionLinks (TestRunDetail) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName, 'link_executionLinks_team_id': link_executionLinks_team_id, 'link_executionLinks_project_id': link_executionLinks_project_id, 'link_executionLinks_executions_id': link_executionLinks_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 46-Click on link executionLinks TestRunDetail - Navigate to page teamprojectexecutions.png')

"Step 47: Click on link TestResults8 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults8'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 47-Click on link TestResults8 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 48: Click on label TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 48-Click on label TestRun.png')

"Step 49: Click on label TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 49-Click on label TestRun.png')

"Step 50: Click on button testResultActions (TestResultDetails) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class, 'button_testResultActions_nth': button_testResultActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 50-Click on button testResultActions TestResultDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 51: Click on span logItemIcons (LogItemImage3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItemIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItemIcons', ['span_logItemIcons_nthChild': span_logItemIcons_nthChild, 'span_logItemIcons_internalHasText': span_logItemIcons_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 51-Click on span logItemIcons LogItemImage3.png')

"Step 52: Click on span logItemIcons (StartListenerAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItemIcons'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 52-Click on span logItemIcons StartListenerAction.png')

"Step 53: Click on span logItemIcons (CreatedWithSketchtool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItemIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItemIcons', ['span_logItemIcons_nthChild': span_logItemIcons_nthChild_1, 'span_logItemIcons_internalHasText': span_logItemIcons_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 53-Click on span logItemIcons CreatedWithSketchtool.png')

"Step 54: Click on span testCaseExecution (CreatedWithSketchtool2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution', ['span_testCaseExecution_class': span_testCaseExecution_class, 'span_testCaseExecution_internalHasText': span_testCaseExecution_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 54-Click on span testCaseExecution CreatedWithSketchtool2.png')

"Step 55: Click on span testCaseExecution (ExecutingTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 55-Click on span testCaseExecution ExecutingTestCase.png')

"Step 56: Click on span testCaseExecution (ExecutingTestCase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution', ['span_testCaseExecution_class': span_testCaseExecution_class_1, 'span_testCaseExecution_internalHasText': span_testCaseExecution_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 56-Click on span testCaseExecution ExecutingTestCase2.png')

"Step 57: Click on span testCaseExecution (ElseIfiOS)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 57-Click on span testCaseExecution ElseIfiOS.png')

"Step 58: Click on span ElseIfiOS2 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_ElseIfiOS2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 58-Click on span ElseIfiOS2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 59: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 59-Click on link Reports.png')

"Step 60: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 60-Click on link Reports.png')

"Step 61: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 61-Click on link Reports.png')

"Step 62: Click on link Summary3 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary3_1'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 62-Click on link Summary3 - Navigate to page teamprojectexecutions.png')

"Step 63: Click on link Reports2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 63-Click on link Reports2.png')

"Step 64: Click on link executionSettings (Executions2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionSettings', ['link_executionSettings_internalRoleLinkName': link_executionSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 64-Click on link executionSettings Executions2 - Navigate to page teamproject.png')

"Step 65: Click on header testRunHeaders (UntitledTestRun8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 65-Click on header testRunHeaders UntitledTestRun8.png')

"Step 66: Click on button IconButton2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_IconButton2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 66-Click on button IconButton2.png')

"Step 67: Click on div menuBackdrops (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops', ['div_menuBackdrops_class': div_menuBackdrops_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 67-Click on div menuBackdrops PopoverBackdrop.png')

"Step 68: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 68-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 69: Click on link testSuiteLinks (AndroidTestSuite) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteLinks', ['link_testSuiteLinks_trNthChild': link_testSuiteLinks_trNthChild_1, 'link_testSuiteLinks_internalRoleLinkName': link_testSuiteLinks_internalRoleLinkName_1, 'link_testSuiteLinks_test_suites_id': link_testSuiteLinks_test_suites_id_1, 'link_testSuiteLinks_project_id': link_testSuiteLinks_project_id_2, 'link_testSuiteLinks_team_id': link_testSuiteLinks_team_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 69-Click on link testSuiteLinks AndroidTestSuite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 70: Click on link testSuiteLinks (AndroidTestSuite) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks', ['link_testSuiteLinks_internalRoleRowName': link_testSuiteLinks_internalRoleRowName_1, 'link_testSuiteLinks_executions_id': link_testSuiteLinks_executions_id_1, 'link_testSuiteLinks_project_id': link_testSuiteLinks_project_id_3, 'link_testSuiteLinks_team_id': link_testSuiteLinks_team_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 70-Click on link testSuiteLinks AndroidTestSuite - Navigate to page teamprojectexecutions.png')

"Step 71: Click on link TestResults8 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults8'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 71-Click on link TestResults8 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 72: Click on button testResultActions (TestResultDetails) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class_1, 'button_testResultActions_nth': button_testResultActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 72-Click on button testResultActions TestResultDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 73: Click on div CreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_CreatedWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 73-Click on div CreatedWithSketch.png')

"Step 74: Click on link Requests2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Requests2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 74-Click on link Requests2 - Navigate to page teamprojectexecutionstest-resultrequests.png')

"Step 75: Click on link TestObjects2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_requests/link_TestObjects2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 75-Click on link TestObjects2 - Navigate to page teamprojectexecutionstest-resulttest-objects.png')

"Step 76: Click on link Comments -> Navigate to page 'team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_test_objects/link_Comments'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 76-Click on link Comments - Navigate to page teamprojectexecutionstest-resultcomments.png')

"Step 77: Click on link ReRuns2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_comments/link_ReRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 77-Click on link ReRuns2 - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 78: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC73-Review Test Results and Execution Settings in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}