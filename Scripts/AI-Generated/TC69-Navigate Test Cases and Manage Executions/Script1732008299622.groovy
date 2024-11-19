import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

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

TrueTestScripts.navigate("team/*/project/*/test-design/test-cases/*")

"Step 4: Click on link Dashboard2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 4-Click on link Dashboard2 - Navigate to page teamproject.png')

"Step 5: Click on link Planning5 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning5'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 5-Click on link Planning5 - Navigate to page teamprojectreleases.png')

"Step 6: Click on link Requirements2 -> Navigate to page 'team/*/project/*/requirements'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements2'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 6-Click on link Requirements2 - Navigate to page teamprojectrequirements.png')

"Step 7: Click on link Releases -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/link_Releases'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 7-Click on link Releases - Navigate to page teamprojectreleases.png')

"Step 8: Click on link Tests4 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests4'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 8-Click on link Tests4 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 9: Click on span treeSwitchers (TreeSwitcher9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_class': span_treeSwitchers_class, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 9-Click on span treeSwitchers TreeSwitcher9.png')

"Step 10: Click on div testCases (TestCases2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 10-Click on div testCases TestCases2.png')

"Step 11: Click on span treeSwitchers (TestCases2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_class': span_treeSwitchers_class_1, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_1, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 11-Click on span treeSwitchers TestCases2.png')

"Step 12: Click on div testCases (AgendarInventario)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 12-Click on div testCases AgendarInventario.png')

"Step 13: Click on span ResizableHandle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_ResizableHandle'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 13-Click on span ResizableHandle.png')

"Step 14: Click on div testCases (MantenimientoSalas)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 14-Click on div testCases MantenimientoSalas.png')

"Step 15: Click on div testCases (AgendarInventario)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 15-Click on div testCases AgendarInventario.png')

"Step 16: Click on div testCases (KatalonCloud)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 16-Click on div testCases KatalonCloud.png')

"Step 17: Click on link TestSuites8 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites8'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 17-Click on link TestSuites8 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 18: Click on link Executions2 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 18-Click on link Executions2 - Navigate to page teamprojecttest-runs.png')

"Step 19: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests2'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 19-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link Executions4 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 20-Click on link Executions4 - Navigate to page teamprojecttest-runs.png')

"Step 21: Click on body TestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/body_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 21-Click on body TestRuns.png')

"Step 22: Click on div menuOptions (Backdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_menuOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_menuOptions', ['div_menuOptions_class': div_menuOptions_class]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 22-Click on div menuOptions Backdrop.png')

"Step 23: Click on input selectRowCheckbox (SelectRowCheckbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_selectRowCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_selectRowCheckbox', ['input_selectRowCheckbox_class': input_selectRowCheckbox_class, 'input_selectRowCheckbox_internalRoleRowName': input_selectRowCheckbox_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 23-Click on input selectRowCheckbox SelectRowCheckbox.png')

"Step 24: Click on button Open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Open'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 24-Click on button Open.png')

"Step 25: Click on div UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_UserEmail'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 25-Click on div UserEmail.png')

"Step 26: Click on input SelectAllRowsCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_SelectAllRowsCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 26-Click on input SelectAllRowsCheckbox.png')

"Step 27: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests2'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 27-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 28: Click on span treeSwitchers (TreeSwitcher10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2', ['span_treeSwitchers_class': span_treeSwitchers_class_2, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 28-Click on span treeSwitchers TreeSwitcher10.png')

"Step 29: Click on div testCases (AgendarInventario)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 29-Click on div testCases AgendarInventario.png')

"Step 30: Click on link testCases (Agendamiento) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCases', ['link_testCases_nthChild': link_testCases_nthChild, 'link_testCases_internalRoleLinkName': link_testCases_internalRoleLinkName, 'team_id': team_id, 'test_cases_id': test_cases_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 30-Click on link testCases Agendamiento - Navigate to page teamprojecttest-designtest-cases.png')

"Step 31: Click on link TestSuites8 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites8'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 31-Click on link TestSuites8 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 32: Click on span treeSwitcherIcons (TreeSwitcherIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcons', ['span_treeSwitcherIcons_class': span_treeSwitcherIcons_class]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 32-Click on span treeSwitcherIcons TreeSwitcherIcon.png')

"Step 33: Click on span treeSwitcherIcons (SvgIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcons', ['span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 33-Click on span treeSwitcherIcons SvgIcon.png')

"Step 34: Click on span treeSwitchers (TreeSwitcher2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 34-Click on span treeSwitchers TreeSwitcher2.png')

"Step 35: Click on div testSuites (TestSuiteValidation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 35-Click on div testSuites TestSuiteValidation.png')

"Step 36: Click on div testSuites (TestSuiteValidation2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 36-Click on div testSuites TestSuiteValidation2.png')

"Step 37: Click on link testSuiteValidation (TestSuiteValidation) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteValidation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteValidation', ['link_testSuiteValidation_internalRoleLinkName': link_testSuiteValidation_internalRoleLinkName, 'team_id': team_id_1, 'project_id': project_id_1, 'test_suites_id': test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 37-Click on link testSuiteValidation TestSuiteValidation - Navigate to page teamprojecttest-designtest-suites.png')

"Step 38: Click on link testSuites (TestSuiteValidation2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites', ['link_testSuites_internalRoleRowName': link_testSuites_internalRoleRowName, 'team_id': team_id_2, 'executions_id': executions_id, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 38-Click on link testSuites TestSuiteValidation2 - Navigate to page teamprojectexecutions.png')

"Step 39: Click on link TestResults8 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults8'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 39-Click on link TestResults8 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 40: Click on link TestResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_TestResults'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 40-Click on link TestResults.png')

"Step 41: Click on link Files3 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Files3'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 41-Click on link Files3 - Navigate to page teamprojectexecutionsfiles.png')

"Step 42: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 42-Click on link Dashboard - Navigate to page teamproject.png')

"Step 43: Click on link Planning5 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning5'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 43-Click on link Planning5 - Navigate to page teamprojectreleases.png')

"Step 44: Click on link Tests4 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests4'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 44-Click on link Tests4 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 45: Click on div testCases (MantenimientoSalas)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 45-Click on div testCases MantenimientoSalas.png')

"Step 46: Click on link Executions4 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 46-Click on link Executions4 - Navigate to page teamprojecttest-runs.png')

"Step 47: Click on input selectRowCheckbox (SelectRowCheckbox2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_selectRowCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_selectRowCheckbox', ['input_selectRowCheckbox_class': input_selectRowCheckbox_class_1, 'input_selectRowCheckbox_internalRoleRowName': input_selectRowCheckbox_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 47-Click on input selectRowCheckbox SelectRowCheckbox2.png')

"Step 48: Click on input selectRowCheckbox (UnselectRowCheckbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_selectRowCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_selectRowCheckbox', ['input_selectRowCheckbox_class': input_selectRowCheckbox_class_2, 'input_selectRowCheckbox_internalRoleRowName': input_selectRowCheckbox_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 48-Click on input selectRowCheckbox UnselectRowCheckbox.png')

"Step 49: Click on div testRunCells (TestRunCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 49-Click on div testRunCells TestRunCell2.png')

"Step 50: Click on input selectRowCheckbox (SelectRowCheckbox3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_selectRowCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_selectRowCheckbox', ['input_selectRowCheckbox_class': input_selectRowCheckbox_class_3, 'input_selectRowCheckbox_internalRoleRowName': input_selectRowCheckbox_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 50-Click on input selectRowCheckbox SelectRowCheckbox3.png')

"Step 51: Click on input selectRowCheckbox (UnselectRowCheckbox2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_selectRowCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_selectRowCheckbox', ['input_selectRowCheckbox_class': input_selectRowCheckbox_class_4, 'input_selectRowCheckbox_internalRoleRowName': input_selectRowCheckbox_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 51-Click on input selectRowCheckbox UnselectRowCheckbox2 - Navigate to page .png')

"Step 52: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC69-Navigate Test Cases and Manage Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}