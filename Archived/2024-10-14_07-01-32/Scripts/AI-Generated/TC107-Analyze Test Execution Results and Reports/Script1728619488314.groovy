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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on i Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 4-Click on i Unknown.png')

"Step 5: Click on header testRun (UntitledTestRun8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 5-Click on header testRun UntitledTestRun8.png')

"Step 6: Click on i dynamicObject (TotalTests)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject', ['i_dynamicObject_internalHasText': i_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 6-Click on i dynamicObject TotalTests.png')

"Step 7: Click on i dynamicObject (TotalTests)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject', ['i_dynamicObject_internalHasText': i_dynamicObject_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 7-Click on i dynamicObject TotalTests.png')

"Step 8: Click on button SessionsTab2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab2'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 8-Click on button SessionsTab2.png')

"Step 9: Click on button FailedTestResults2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResults2'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 9-Click on button FailedTestResults2.png')

"Step 10: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 10-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 11: Click on link testSuiteNavigation (TestSuite iOS) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteNavigation', ['link_testSuiteNavigation_trNthChild': link_testSuiteNavigation_trNthChild, 'link_testSuiteNavigation_internalRoleLinkName': link_testSuiteNavigation_internalRoleLinkName, 'link_testSuiteNavigation_team_id': link_testSuiteNavigation_team_id, 'link_testSuiteNavigation_test_suites_id': link_testSuiteNavigation_test_suites_id, 'link_testSuiteNavigation_project_id': link_testSuiteNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 11-Click on link testSuiteNavigation TestSuite iOS - Navigate to page teamprojecttest-designtest-suites.png')

"Step 12: Click on link testResults (TestResults) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testResults', ['link_testResults_internalRoleRowName': link_testResults_internalRoleRowName, 'link_testResults_project_id': link_testResults_project_id, 'link_testResults_executions_id': link_testResults_executions_id, 'link_testResults_team_id': link_testResults_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 12-Click on link testResults TestResults - Navigate to page teamprojectexecutions.png')

"Step 13: Click on link TestResults9 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults9'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 13-Click on link TestResults9 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 14: Click on span PassedTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_PassedTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 14-Click on span PassedTestCase.png')

"Step 15: Click on div InfoSidebarCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_InfoSidebarCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 15-Click on div InfoSidebarCloseButton.png')

"Step 16: Click on link Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 16-Click on link Settings.png')

"Step 17: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_0, Integer.valueOf(index_0))

"Step 18: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 18-Click on button Settings.png')

"Step 19: Click on div menu (Backdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 19-Click on div menu Backdrop.png')

"Step 20: Click on link projectNavigation (Integrations2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 20-Click on link projectNavigation Integrations2.png')

"Step 21: Click on div dynamicObject (CodelessAutomationTool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class, 'div_dynamicObject_internalRoleTreeitemName': div_dynamicObject_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 21-Click on div dynamicObject CodelessAutomationTool.png')

"Step 22: Click on div dynamicObject (ExpandMoreIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 22-Click on div dynamicObject ExpandMoreIcon.png')

"Step 23: Click on div dynamicObject (ALMTestManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class_2, 'div_dynamicObject_internalRoleTreeitemName': div_dynamicObject_internalRoleTreeitemName_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 23-Click on div dynamicObject ALMTestManagement.png')

"Step 24: Click on div dynamicObject (ExpandMoreIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 24-Click on div dynamicObject ExpandMoreIcon2.png')

"Step 25: Click on div dynamicObject (CICDPipeline)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class_4, 'div_dynamicObject_internalRoleTreeitemName': div_dynamicObject_internalRoleTreeitemName_2]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 25-Click on div dynamicObject CICDPipeline.png')

"Step 26: Click on div dynamicObject (ExpandMoreIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 26-Click on div dynamicObject ExpandMoreIcon3.png')

"Step 27: Click on link projectNavigation (CustomFields)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 27-Click on link projectNavigation CustomFields.png')

"Step 28: Click on link projectNavigation (TestCloudTunnels3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_1, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 28-Click on link projectNavigation TestCloudTunnels3.png')

"Step 29: Click on link projectNavigation (CustomFields)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 29-Click on link projectNavigation CustomFields.png')

"Step 30: Click on link projectNavigation (Integrations2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_2, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 30-Click on link projectNavigation Integrations2.png')

"Step 31: Click on div menu (GPTManualTestGenerator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 31-Click on div menu GPTManualTestGenerator.png')

"Step 32: Click on div Integrations"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 32-Click on div Integrations.png')

"Step 33: Click on link projectNavigation (TestEnvironments3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_3, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 33-Click on link projectNavigation TestEnvironments3.png')

"Step 34: Click on link projectNavigation (ScriptRepositories4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_4, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 34-Click on link projectNavigation ScriptRepositories4.png')

"Step 35: Click on link projectNavigation (General2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_5, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 35-Click on link projectNavigation General2.png')

"Step 36: Click on link Tests11 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests11'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 36-Click on link Tests11 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 37: Click on link Executions7 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions7'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 37-Click on link Executions7 - Navigate to page teamproject.png')

"Step 38: Click on button rowSelection (SelectRow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection', ['button_rowSelection_internalRoleRowName': button_rowSelection_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 38-Click on button rowSelection SelectRow2.png')

"Step 39: Click on div menu (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 39-Click on div menu PopoverBackdrop.png')

"Step 40: Click on link Reports8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports8'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 40-Click on link Reports8.png')

"Step 41: Click on link UploadReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_UploadReports_1'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 41-Click on link UploadReports.png')

"Step 42: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_1, Integer.valueOf(index_1))

"Step 43: Click on link Reports9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports9'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 43-Click on link Reports9.png')

"Step 44: Click on link projectNavigation (TestRuns6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 44-Click on link projectNavigation TestRuns6.png')

"Step 45: Click on link TestRuns7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns7'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 45-Click on link TestRuns7.png')

"Step 46: Click on link executionNavigation (TestRunDetail) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation', ['link_executionNavigation_trNthChild': link_executionNavigation_trNthChild, 'link_executionNavigation_internalRoleLinkName': link_executionNavigation_internalRoleLinkName, 'link_executionNavigation_executions_id': link_executionNavigation_executions_id, 'link_executionNavigation_team_id': link_executionNavigation_team_id, 'link_executionNavigation_project_id': link_executionNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 46-Click on link executionNavigation TestRunDetail - Navigate to page teamprojectexecutions.png')

"Step 47: Click on link TestResults9 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults9'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 47-Click on link TestResults9 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 48: Click on label TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 48-Click on label TestRun.png')

"Step 49: Click on label TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 49-Click on label TestRun.png')

"Step 50: Click on button testResultActions (TestResultDetails) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class, 'button_testResultActions_nth': button_testResultActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 50-Click on button testResultActions TestResultDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 51: Click on span logItem (LogItemImage3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItem"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItem', ['span_logItem_nthChild': span_logItem_nthChild, 'span_logItem_internalHasText': span_logItem_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 51-Click on span logItem LogItemImage3.png')

"Step 52: Click on span logItem (StartListenerAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItem'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 52-Click on span logItem StartListenerAction.png')

"Step 53: Click on span logItem (CreatedWithSketchtool2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItem"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItem', ['span_logItem_nthChild': span_logItem_nthChild_1, 'span_logItem_internalHasText': span_logItem_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 53-Click on span logItem CreatedWithSketchtool2.png')

"Step 54: Click on span dynamicObject (CreatedWithSketchtool3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject', ['span_dynamicObject_class': span_dynamicObject_class, 'span_dynamicObject_internalHasText': span_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 54-Click on span dynamicObject CreatedWithSketchtool3.png')

"Step 55: Click on span dynamicObject (ExecutingTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 55-Click on span dynamicObject ExecutingTestCase.png')

"Step 56: Click on span dynamicObject (ExecutingTestCase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject', ['span_dynamicObject_class': span_dynamicObject_class_1, 'span_dynamicObject_internalHasText': span_dynamicObject_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 56-Click on span dynamicObject ExecutingTestCase2.png')

"Step 57: Click on span dynamicObject (ElseIfiOS)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 57-Click on span dynamicObject ElseIfiOS.png')

"Step 58: Click on span ElseIfiOS2 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_ElseIfiOS2'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 58-Click on span ElseIfiOS2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 59: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 59-Click on link Reports.png')

"Step 60: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 60-Click on link Reports.png')

"Step 61: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 61-Click on link Reports.png')

"Step 62: Click on link Summary3 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary3'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 62-Click on link Summary3 - Navigate to page teamprojectexecutions.png')

"Step 63: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 63-Click on link Reports.png')

"Step 64: Click on link executionNavigation (Executions) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionNavigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionNavigation_1', ['link_executionNavigation_internalRoleLinkName': link_executionNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 64-Click on link executionNavigation Executions - Navigate to page teamproject.png')

"Step 65: Click on header testRun (UntitledTestRun8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 65-Click on header testRun UntitledTestRun8.png')

"Step 66: Click on button IconButton2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_IconButton2'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 66-Click on button IconButton2.png')

"Step 67: Click on div menu (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 67-Click on div menu PopoverBackdrop.png')

"Step 68: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 68-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 69: Click on link testSuiteNavigation (AndroidTestSuite) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteNavigation', ['link_testSuiteNavigation_trNthChild': link_testSuiteNavigation_trNthChild_1, 'link_testSuiteNavigation_internalRoleLinkName': link_testSuiteNavigation_internalRoleLinkName_1, 'link_testSuiteNavigation_team_id': link_testSuiteNavigation_team_id_1, 'link_testSuiteNavigation_test_suites_id': link_testSuiteNavigation_test_suites_id_1, 'link_testSuiteNavigation_project_id': link_testSuiteNavigation_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 69-Click on link testSuiteNavigation AndroidTestSuite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 70: Click on link testResults (AndroidTestSuite) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testResults', ['link_testResults_internalRoleRowName': link_testResults_internalRoleRowName_1, 'link_testResults_project_id': link_testResults_project_id_1, 'link_testResults_executions_id': link_testResults_executions_id_1, 'link_testResults_team_id': link_testResults_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 70-Click on link testResults AndroidTestSuite - Navigate to page teamprojectexecutions.png')

"Step 71: Click on link TestResults9 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults9'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 71-Click on link TestResults9 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 72: Click on button testResultActions (TestResultDetails) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class_1, 'button_testResultActions_nth': button_testResultActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 72-Click on button testResultActions TestResultDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 73: Click on div CreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_CreatedWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 73-Click on div CreatedWithSketch.png')

"Step 74: Click on link Requests2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Requests2'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 74-Click on link Requests2 - Navigate to page teamprojectexecutionstest-resultrequests.png')

"Step 75: Click on link TestObjects2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_requests/link_TestObjects2'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 75-Click on link TestObjects2 - Navigate to page teamprojectexecutionstest-resulttest-objects.png')

"Step 76: Click on link Comments -> Navigate to page 'team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_test_objects/link_Comments'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 76-Click on link Comments - Navigate to page teamprojectexecutionstest-resultcomments.png')

"Step 77: Click on link ReRuns2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_comments/link_ReRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 77-Click on link ReRuns2 - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 78: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC107-Analyze Test Execution Results and Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}