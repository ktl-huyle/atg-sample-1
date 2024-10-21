import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.runTestSuiteWithAdvancedSettings
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

"Step 3: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectLinks (OracleJDE) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 4-Click on link projectLinks OracleJDE - Navigate to page teamproject.png')

"Step 5: Click on link Settings -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 5-Click on link Settings - Navigate to page teamprojectsettings.png')

"Step 6: Click on link TrueTest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 6-Click on link TrueTest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 7: Click on link Reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 7-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 8: Click on link Executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 8-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 9: Click on link Tests -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 9-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 10: Click on span treeSwitcherIcons (Icon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 10-Click on span treeSwitcherIcons Icon.png')

"Step 11: Click on div TestDesignContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_TestDesignContainer'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 11-Click on div TestDesignContainer.png')

"Step 12: Click on div TestCaseUploadedData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_TestCaseUploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 12-Click on div TestCaseUploadedData.png')

"Step 13: Click on span treeSwitcherIcons (TreeSwitcher3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons', ['span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 13-Click on span treeSwitcherIcons TreeSwitcher3.png')

"Step 14: Click on span treeSwitcherIcons (KatalonStudioTestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcherIcons'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 14-Click on span treeSwitcherIcons KatalonStudioTestCases.png')

"Step 15: Click on div testCases (TestCasesSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 15-Click on div testCases TestCasesSection.png')

"Step 16: Click on link testCaseLinks (TestCDC002) -> Navigate to page '/team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseLinks', ['link_testCaseLinks_nthChild': link_testCaseLinks_nthChild, 'link_testCaseLinks_internalRoleLinkName': link_testCaseLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 16-Click on link testCaseLinks TestCDC002 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on button AddToTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_AddToTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 17-Click on button AddToTestSuite.png')

"Step 18: Click on div TreeSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_TreeSelect'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 18-Click on div TreeSelect.png')

"Step 19: Click on span TreeSwitcher4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_TreeSwitcher4'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 19-Click on span TreeSwitcher4.png')

"Step 20: Click on span TestCDC2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_TestCDC2'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 20-Click on span TestCDC2.png')

"Step 21: Click on button Add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 21-Click on button Add.png')

"Step 22: Click on button uploadedDataActions (TestCaseAction) -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedDataActions'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 22-Click on button uploadedDataActions TestCaseAction - Navigate to page teamprojecttest-designtest-cases.png')

"Step 23: Click on link testCaseLinks (TestCDC002) -> Navigate to page '/team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCaseLinks', ['link_testCaseLinks_nthChild': link_testCaseLinks_nthChild_1, 'link_testCaseLinks_internalRoleLinkName': link_testCaseLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 23-Click on link testCaseLinks TestCDC002 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 24: Click on link TestSuites3 -> Navigate to page '/team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites3'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 24-Click on link TestSuites3 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 25: Click on div OracleJDEImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/div_OracleJDEImage'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 25-Click on div OracleJDEImage.png')

"Step 26: Click on div testSuites (TestSuitesSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 26-Click on div testSuites TestSuitesSection.png')

"Step 27: Click on div testSuites (TestOps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 27-Click on div testSuites TestOps.png')

"Step 28: Click on link testSuiteLinks (TestCDC2Link) -> Navigate to page '/team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks', ['link_testSuiteLinks_internalRoleLinkName': link_testSuiteLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 28-Click on link testSuiteLinks TestCDC2Link - Navigate to page teamprojecttest-designtest-suites.png')

"Step 29: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 29-Click on button ScheduleTestRun.png')

"Step 30: Run a test suite with advanced configuration options"

runTestSuiteWithAdvancedSettings.execute(data_path_0, Integer.valueOf(index_0))

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC113-Schedule Test Run with Advanced Configuration_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}