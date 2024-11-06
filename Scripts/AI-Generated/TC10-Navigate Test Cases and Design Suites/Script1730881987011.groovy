import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to team/*/project/*/test-design/test-cases/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-design/test-cases/${GlobalVariable.test_cases_id}")

"Step 2: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Dashboard'))

WebUI.takeScreenshot()

"Step 3: Click on link Planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning'))

WebUI.takeScreenshot()

"Step 4: Click on link Requirements -> Navigate to page 'team/*/project/*/requirements'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements'))

WebUI.takeScreenshot()

"Step 5: Click on link Releases -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/link_Releases'))

WebUI.takeScreenshot()

"Step 6: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests'))

WebUI.takeScreenshot()

"Step 7: Click on span testCaseLabel (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseLabel'))

WebUI.takeScreenshot()

"Step 8: Click on div testCaseDetails (TestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails'))

WebUI.takeScreenshot()

"Step 9: Click on span testCaseLabel (TestCasesLabel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseLabel'))

WebUI.takeScreenshot()

"Step 10: Click on div testCaseDetails (AgendarInventario)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText]))

WebUI.takeScreenshot()

"Step 11: Click on span ResizableHandle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_ResizableHandle'))

WebUI.takeScreenshot()

"Step 12: Click on div testCaseDetails (MantenimientoSalas)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText_1]))

WebUI.takeScreenshot()

"Step 13: Click on div testCaseDetails (AgendarInventario)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText_2]))

WebUI.takeScreenshot()

"Step 14: Click on div testCaseDetails (KatalonCloud)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText_3]))

WebUI.takeScreenshot()

"Step 15: Click on link TestSuites3 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites3'))

WebUI.takeScreenshot()

"Step 16: Click on link Executions2 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Executions2'))

WebUI.takeScreenshot()

"Step 17: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests2'))

WebUI.takeScreenshot()

"Step 18: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions'))

WebUI.takeScreenshot()

"Step 19: Click on body MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/body_MainContent'))

WebUI.takeScreenshot()

"Step 20: Click on div dynamicObject (Backdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot()

"Step 21: Click on input rowSelectionCheckbox (SelectRowCheckbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class, 'input_rowSelectionCheckbox_internalRoleRowName': input_rowSelectionCheckbox_internalRoleRowName]))

WebUI.takeScreenshot()

"Step 22: Click on button OpenDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_OpenDropdown'))

WebUI.takeScreenshot()

"Step 23: Click on div UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_UserEmail'))

WebUI.takeScreenshot()

"Step 24: Click on input SelectAllRowsCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_SelectAllRowsCheckbox'))

WebUI.takeScreenshot()

"Step 25: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests2'))

WebUI.takeScreenshot()

"Step 26: Click on span TreeSwitcher2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_TreeSwitcher2'))

WebUI.takeScreenshot()

"Step 27: Click on div testCaseDetails (AgendarInventario)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText_4]))

WebUI.takeScreenshot()

"Step 28: Click on link AgendarInventario -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_AgendarInventario'))

WebUI.takeScreenshot()

"Step 29: Click on link TestSuites3 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites3'))

WebUI.takeScreenshot()

"Step 30: Click on span treeSwitcherIcon (TreeSwitcherIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcon', ['span_treeSwitcherIcon_class': span_treeSwitcherIcon_class]))

WebUI.takeScreenshot()

"Step 31: Click on span treeSwitcherIcon (Icon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcon', ['span_treeSwitcherIcon_class': span_treeSwitcherIcon_class_1]))

WebUI.takeScreenshot()

"Step 32: Click on span TreeSwitcher"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_TreeSwitcher'))

WebUI.takeScreenshot()

"Step 33: Click on div testSuiteDetails (TestSuiteValidation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails', ['div_testSuiteDetails_internalText': div_testSuiteDetails_internalText]))

WebUI.takeScreenshot()

"Step 34: Click on div testSuiteDetails (TestSuiteValidation2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails', ['div_testSuiteDetails_internalText': div_testSuiteDetails_internalText_1]))

WebUI.takeScreenshot()

"Step 35: Click on link testSuite (TestSuiteValidation) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuite"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuite', ['link_testSuite_internalRoleLinkName': link_testSuite_internalRoleLinkName, 'link_testSuite_test_suites_id': link_testSuite_test_suites_id, 'link_testSuite_project_id': link_testSuite_project_id, 'link_testSuite_team_id': link_testSuite_team_id]))

WebUI.takeScreenshot()

"Step 36: Click on link testSuiteDetails (TestSuiteDetails) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteDetails', ['link_testSuiteDetails_team_id': link_testSuiteDetails_team_id, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id, 'link_testSuiteDetails_executions_id': link_testSuiteDetails_executions_id]))

WebUI.takeScreenshot()

"Step 37: Click on link TestResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults'))

WebUI.takeScreenshot()

"Step 38: Click on link TestResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_TestResults'))

WebUI.takeScreenshot()

"Step 39: Click on link Files -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Files'))

WebUI.takeScreenshot()

"Step 40: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_Dashboard'))

WebUI.takeScreenshot()

"Step 41: Click on link Planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning'))

WebUI.takeScreenshot()

"Step 42: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests'))

WebUI.takeScreenshot()

"Step 43: Click on div testCaseDetails (MantenimientoSalas)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText_5]))

WebUI.takeScreenshot()

"Step 44: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions'))

WebUI.takeScreenshot()

"Step 45: Click on input rowSelectionCheckbox (SelectRowCheckbox2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class_1, 'input_rowSelectionCheckbox_internalRoleRowName': input_rowSelectionCheckbox_internalRoleRowName_1]))

WebUI.takeScreenshot()

"Step 46: Click on input rowSelectionCheckbox (UnselectRowCheckbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class_2]))

WebUI.takeScreenshot()

"Step 47: Click on div testRunDetails (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot()

"Step 48: Click on input rowSelectionCheckbox (SelectRowCheckbox3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class_3, 'input_rowSelectionCheckbox_internalRoleRowName': input_rowSelectionCheckbox_internalRoleRowName_2]))

WebUI.takeScreenshot()

"Step 49: Click on input rowSelectionCheckbox (UnselectRowCheckbox2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class_4]))

WebUI.takeScreenshot()

"Step 50: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Navigate Test Cases and Design Suites_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}