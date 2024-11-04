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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to team/*/project/*/test-design/test-cases/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-design/test-cases/${GlobalVariable.test_cases_id}")

"Step 4: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 4-Click on link Dashboard - Navigate to page teamproject.png')

"Step 5: Click on link Planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning_1'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 5-Click on link Planning - Navigate to page teamprojectreleases.png')

"Step 6: Click on link Requirements -> Navigate to page 'team/*/project/*/requirements'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 6-Click on link Requirements - Navigate to page teamprojectrequirements.png')

"Step 7: Click on link Releases -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/link_Releases'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 7-Click on link Releases - Navigate to page teamprojectreleases.png')

"Step 8: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 8-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 9: Click on span treeSwitchers (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 9-Click on span treeSwitchers TreeSwitcher.png')

"Step 10: Click on div testCases (TestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 10-Click on div testCases TestCases.png')

"Step 11: Click on span treeSwitchers (TestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 11-Click on span treeSwitchers TestCases.png')

"Step 12: Click on div testCases (AgendarInventario)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 12-Click on div testCases AgendarInventario.png')

"Step 13: Click on span ResizableHandle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_ResizableHandle'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 13-Click on span ResizableHandle.png')

"Step 14: Click on div testCases (MantenimientoSalas)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 14-Click on div testCases MantenimientoSalas.png')

"Step 15: Click on div testCases (AgendarInventario)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 15-Click on div testCases AgendarInventario.png')

"Step 16: Click on div testCases (KatalonCloud)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 16-Click on div testCases KatalonCloud.png')

"Step 17: Click on link TestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites_3'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 17-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 18: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Executions_1'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 18-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 19: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 19-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions_2'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 20-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 21: Click on body MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/body_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 21-Click on body MainContent.png')

"Step 22: Click on div dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 22-Click on div dynamicObject object.png')

"Step 23: Click on input rowCheckboxes (SelectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowCheckboxes', ['input_rowCheckboxes_class': input_rowCheckboxes_class, 'input_rowCheckboxes_internalRoleRowName': input_rowCheckboxes_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 23-Click on input rowCheckboxes SelectRow.png')

"Step 24: Click on button Open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Open'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 24-Click on button Open.png')

"Step 25: Click on div UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_UserEmail'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 25-Click on div UserEmail.png')

"Step 26: Click on input SelectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_SelectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 26-Click on input SelectAllRows.png')

"Step 27: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 27-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 28: Click on span treeSwitchers (TreeSwitcher2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 28-Click on span treeSwitchers TreeSwitcher2.png')

"Step 29: Click on div testCases (AgendarInventario)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 29-Click on div testCases AgendarInventario.png')

"Step 30: Click on link testCaseDetails (TestCaseAgendamiento) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseDetails', ['link_testCaseDetails_nthChild': link_testCaseDetails_nthChild, 'link_testCaseDetails_internalRoleLinkName': link_testCaseDetails_internalRoleLinkName, 'link_testCaseDetails_team_id': link_testCaseDetails_team_id, 'link_testCaseDetails_test_cases_id': link_testCaseDetails_test_cases_id, 'link_testCaseDetails_project_id': link_testCaseDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 30-Click on link testCaseDetails TestCaseAgendamiento - Navigate to page teamprojecttest-designtest-cases.png')

"Step 31: Click on link TestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites_3'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 31-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 32: Click on span treeSwitcherIcons (TreeSwitcherIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcons', ['span_treeSwitcherIcons_class': span_treeSwitcherIcons_class]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 32-Click on span treeSwitcherIcons TreeSwitcherIcon.png')

"Step 33: Click on span treeSwitcherIcons (SvgIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcons', ['span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 33-Click on span treeSwitcherIcons SvgIcon.png')

"Step 34: Click on span treeSwitchers (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 34-Click on span treeSwitchers TreeSwitcher.png')

"Step 35: Click on div testSuites (TestSuiteValidation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 35-Click on div testSuites TestSuiteValidation.png')

"Step 36: Click on div testSuites (TestSuiteValidationMinor)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 36-Click on div testSuites TestSuiteValidationMinor.png')

"Step 37: Click on link testSuiteValidation (TestSuiteValidationMinor) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteValidation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteValidation', ['link_testSuiteValidation_internalRoleLinkName': link_testSuiteValidation_internalRoleLinkName, 'link_testSuiteValidation_test_suites_id': link_testSuiteValidation_test_suites_id, 'link_testSuiteValidation_project_id': link_testSuiteValidation_project_id, 'link_testSuiteValidation_team_id': link_testSuiteValidation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 37-Click on link testSuiteValidation TestSuiteValidationMinor - Navigate to page teamprojecttest-designtest-suites.png')

"Step 38: Click on link testSuiteDetails (TestSuiteExecution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteDetails', ['link_testSuiteDetails_executions_id': link_testSuiteDetails_executions_id, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 38-Click on link testSuiteDetails TestSuiteExecution - Navigate to page teamprojectexecutions.png')

"Step 39: Click on link TestResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults_2'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 39-Click on link TestResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 40: Click on link TestResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_TestResults'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 40-Click on link TestResults.png')

"Step 41: Click on link Files -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Files_1'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 41-Click on link Files - Navigate to page teamprojectexecutionsfiles.png')

"Step 42: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 42-Click on link Dashboard - Navigate to page teamproject.png')

"Step 43: Click on link Planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning_1'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 43-Click on link Planning - Navigate to page teamprojectreleases.png')

"Step 44: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 44-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 45: Click on div testCases (MantenimientoSalas)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 45-Click on div testCases MantenimientoSalas.png')

"Step 46: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions_2'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 46-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 47: Click on input rowCheckboxes (SelectRow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowCheckboxes', ['input_rowCheckboxes_class': input_rowCheckboxes_class_1, 'input_rowCheckboxes_internalRoleRowName': input_rowCheckboxes_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 47-Click on input rowCheckboxes SelectRow2.png')

"Step 48: Click on input rowCheckboxes (UnselectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowCheckboxes', ['input_rowCheckboxes_class': input_rowCheckboxes_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 48-Click on input rowCheckboxes UnselectRow.png')

"Step 49: Click on div testRunInfo (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 49-Click on div testRunInfo TestRunCell.png')

"Step 50: Click on input rowCheckboxes (SelectRow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowCheckboxes', ['input_rowCheckboxes_class': input_rowCheckboxes_class_3, 'input_rowCheckboxes_internalRoleRowName': input_rowCheckboxes_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 50-Click on input rowCheckboxes SelectRow3.png')

"Step 51: Click on input rowCheckboxes (UnselectRow2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowCheckboxes', ['input_rowCheckboxes_class': input_rowCheckboxes_class_4]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 51-Click on input rowCheckboxes UnselectRow2 - Navigate to page .png')

"Step 52: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC190-Navigate Test Design Cases and Suites_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}