import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.configureTestSuiteSettings
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.custom.TrueTestScripts

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

"Step 4: Click on link projectItems (OJOracleJDE) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectItems', ['link_projectItems_internalRoleLinkName': link_projectItems_internalRoleLinkName, 'link_projectItems_team_id': link_projectItems_team_id, 'link_projectItems_project_id': link_projectItems_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 4-Click on link projectItems OJOracleJDE - Navigate to page teamproject.png')

"Step 5: Click on link Settings2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 5-Click on link Settings2 - Navigate to page teamproject.png')

"Step 6: Click on link TrueTest -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 6-Click on link TrueTest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 7: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 7-Click on link Reports - Navigate to page teamproject.png')

"Step 8: Click on link Executions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions2_1'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 8-Click on link Executions2.png')

"Step 9: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 9-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 10: Click on span treeSwitchers (Icon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 10-Click on span treeSwitchers Icon.png')

"Step 11: Click on div TestDesignContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_TestDesignContainer'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 11-Click on div TestDesignContainer.png')

"Step 12: Click on div TestCaseUploadedData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_TestCaseUploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 12-Click on div TestCaseUploadedData.png')

"Step 13: Click on span treeSwitchers (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 13-Click on span treeSwitchers TreeSwitcher.png')

"Step 14: Click on span treeSwitchers (KatalonStudioTestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 14-Click on span treeSwitchers KatalonStudioTestCases.png')

"Step 15: Click on div testCasesSection (TestCasesSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 15-Click on div testCasesSection TestCasesSection.png')

"Step 16: Click on link testCDC (TestCDC002) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCDC"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCDC', ['link_testCDC_internalRoleLinkName': link_testCDC_internalRoleLinkName, 'link_testCDC_project_id': link_testCDC_project_id, 'link_testCDC_team_id': link_testCDC_team_id, 'link_testCDC_test_cases_id': link_testCDC_test_cases_id]))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 16-Click on link testCDC TestCDC002 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on button AddToTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_AddToTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 17-Click on button AddToTestSuite.png')

"Step 18: Click on div TreeSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_TreeSelect'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 18-Click on div TreeSelect.png')

"Step 19: Click on span TreeSwitcher2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_TreeSwitcher2_1'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 19-Click on span TreeSwitcher2.png')

"Step 20: Click on span TestCDC2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_TestCDC2'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 20-Click on span TestCDC2.png')

"Step 21: Click on button Add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 21-Click on button Add.png')

"Step 22: Click on button testCaseActions (TestCaseAction) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_testCaseActions'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 22-Click on button testCaseActions TestCaseAction - Navigate to page teamprojecttest-designtest-cases.png')

"Step 23: Click on link testCDC (TestCDC002) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCDC"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testCDC', ['link_testCDC_internalRoleLinkName': link_testCDC_internalRoleLinkName_1, 'link_testCDC_project_id': link_testCDC_project_id_1, 'link_testCDC_team_id': link_testCDC_team_id_1, 'link_testCDC_test_cases_id': link_testCDC_test_cases_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 23-Click on link testCDC TestCDC002 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 24: Click on link TestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites_1'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 24-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 25: Click on div OracleJDEImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/div_OracleJDEImage'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 25-Click on div OracleJDEImage.png')

"Step 26: Click on div testSuitesSection (TestSuitesSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 26-Click on div testSuitesSection TestSuitesSection.png')

"Step 27: Click on div testSuitesSection (TestOps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuitesSection'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 27-Click on div testSuitesSection TestOps.png')

"Step 28: Click on link TestCDC2Link -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestCDC2Link'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 28-Click on link TestCDC2Link - Navigate to page teamprojecttest-designtest-suites.png')

"Step 29: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC325/Step 29-Click on button ScheduleTestRun.png')

"Step 30: Configure test suite settings and save changes"

configureTestSuiteSettings.execute(data_path_0, Integer.valueOf(index_0))

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC325-Navigate to Organization Home and Manage Project Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}