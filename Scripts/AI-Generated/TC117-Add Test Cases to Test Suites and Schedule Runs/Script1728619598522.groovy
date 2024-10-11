import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.scheduleAndRunTestDemo

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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectNavigation (OJOracleJDE2) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName, 'link_projectNavigation_project_id': link_projectNavigation_project_id, 'link_projectNavigation_team_id': link_projectNavigation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 4-Click on link projectNavigation OJOracleJDE2 - Navigate to page teamproject.png')

"Step 5: Click on link Settings6 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings6'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 5-Click on link Settings6 - Navigate to page teamproject.png')

"Step 6: Click on link TrueTest2 -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest2'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 6-Click on link TrueTest2 - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 7: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 7-Click on link Reports - Navigate to page teamproject.png')

"Step 8: Click on link Executions16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions16'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 8-Click on link Executions16.png')

"Step 9: Click on link Tests5 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests5'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 9-Click on link Tests5 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 10: Click on span treeSwitcher (Icon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 10-Click on span treeSwitcher Icon2.png')

"Step 11: Click on div TestDesignContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_TestDesignContainer'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 11-Click on div TestDesignContainer.png')

"Step 12: Click on div TestCaseUploadedData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_TestCaseUploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 12-Click on div TestCaseUploadedData.png')

"Step 13: Click on span treeSwitcher (TreeSwitcher6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 13-Click on span treeSwitcher TreeSwitcher6.png')

"Step 14: Click on span treeSwitcher (KatalonStudioTestCases2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 14-Click on span treeSwitcher KatalonStudioTestCases2.png')

"Step 15: Click on div testCasesSection (TestCasesSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 15-Click on div testCasesSection TestCasesSection.png')

"Step 16: Click on link testCaseNavigation (TestCDC002) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_nthChild': link_testCaseNavigation_nthChild, 'link_testCaseNavigation_internalRoleLinkName': link_testCaseNavigation_internalRoleLinkName, 'link_testCaseNavigation_test_cases_id': link_testCaseNavigation_test_cases_id, 'link_testCaseNavigation_project_id': link_testCaseNavigation_project_id, 'link_testCaseNavigation_team_id': link_testCaseNavigation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 16-Click on link testCaseNavigation TestCDC002 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on button AddToTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_AddToTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 17-Click on button AddToTestSuite.png')

"Step 18: Click on div TreeSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_TreeSelect'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 18-Click on div TreeSelect.png')

"Step 19: Click on span TreeSwitcher11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_TreeSwitcher11'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 19-Click on span TreeSwitcher11.png')

"Step 20: Click on span TestCDC2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_TestCDC2'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 20-Click on span TestCDC2.png')

"Step 21: Click on button Add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 21-Click on button Add.png')

"Step 22: Click on button dynamicObject (TestCaseAction) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 22-Click on button dynamicObject TestCaseAction - Navigate to page teamprojecttest-designtest-cases.png')

"Step 23: Click on link testCaseNavigation (TestCDC002) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_nthChild': link_testCaseNavigation_nthChild_1, 'link_testCaseNavigation_internalRoleLinkName': link_testCaseNavigation_internalRoleLinkName_1, 'link_testCaseNavigation_test_cases_id': link_testCaseNavigation_test_cases_id_1, 'link_testCaseNavigation_project_id': link_testCaseNavigation_project_id_1, 'link_testCaseNavigation_team_id': link_testCaseNavigation_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 23-Click on link testCaseNavigation TestCDC002 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 24: Click on link TestSuites7 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites7'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 24-Click on link TestSuites7 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 25: Click on div OracleJDEImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/div_OracleJDEImage'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 25-Click on div OracleJDEImage.png')

"Step 26: Click on div testSuitesSection (TestSuitesSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 26-Click on div testSuitesSection TestSuitesSection.png')

"Step 27: Click on div testSuitesSection (TestOps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection', ['div_testSuitesSection_internalText': div_testSuitesSection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 27-Click on div testSuitesSection TestOps.png')

"Step 28: Click on link testSuiteValidation (TestSuitesTestOpsTestcdc2) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteValidation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteValidation', ['link_testSuiteValidation_internalRoleLinkName': link_testSuiteValidation_internalRoleLinkName, 'link_testSuiteValidation_team_id': link_testSuiteValidation_team_id, 'link_testSuiteValidation_project_id': link_testSuiteValidation_project_id, 'link_testSuiteValidation_test_suites_id': link_testSuiteValidation_test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 28-Click on link testSuiteValidation TestSuitesTestOpsTestcdc2 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 29: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 29-Click on button ScheduleTestRun.png')

"Step 30: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_0, Integer.valueOf(index_0))

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC117-Add Test Cases to Test Suites and Schedule Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}