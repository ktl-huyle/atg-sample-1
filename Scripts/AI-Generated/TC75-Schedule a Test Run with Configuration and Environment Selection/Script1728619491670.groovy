import truetest.common.scheduleAndRunTestDemo
import truetest.custom.TrueTestScripts
import truetest.common.navigateToProjectSettingsAndScheduleTestRun
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Navigate to project settings and schedule a test run"

navigateToProjectSettingsAndScheduleTestRun.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Click on link Tests5 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests5'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 6-Click on link Tests5 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 7: Click on span treeSwitcher (TreeSwitcher6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher', ['span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 7-Click on span treeSwitcher TreeSwitcher6.png')

"Step 8: Click on span treeSwitcher (KatalonStudioTestCases2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 8-Click on span treeSwitcher KatalonStudioTestCases2.png')

"Step 9: Click on div testCasesSection (TestCasesSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 9-Click on div testCasesSection TestCasesSection.png')

"Step 10: Click on input TestCaseCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/input_TestCaseCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 10-Click on input TestCaseCheckbox.png')

"Step 11: Click on link Settings2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 11-Click on link Settings2 - Navigate to page teamproject.png')

"Step 12: Click on link projectNavigation (ScriptRepositories2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 12-Click on link projectNavigation ScriptRepositories2.png')

"Step 13: Click on link dynamicObject (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'link_dynamicObject_test_project_id': link_dynamicObject_test_project_id, 'link_dynamicObject_project_id': link_dynamicObject_project_id, 'link_dynamicObject_team_id': link_dynamicObject_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 13-Click on link dynamicObject OracleJDE - Navigate to page teamprojecttest-project.png')

"Step 14: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 14-Click on button ScheduleTestRun.png')

"Step 15: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_2, Integer.valueOf(index_2))

"Step 16: Click on div successMessage (SuccessMessage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_successMessage'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 16-Click on div successMessage SuccessMessage.png')

"Step 17: Click on div UnderTopNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnderTopNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 17-Click on div UnderTopNavbar.png')

"Step 18: Click on link testRunNavigation (ViewTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation_1', ['link_testRunNavigation_internalRoleLinkName': link_testRunNavigation_internalRoleLinkName, 'link_testRunNavigation_team_id': link_testRunNavigation_team_id, 'link_testRunNavigation_project_id': link_testRunNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 18-Click on link testRunNavigation ViewTestRun.png')

"Step 19: Click on div transactionHistory (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory', ['div_transactionHistory_class': div_transactionHistory_class, 'div_transactionHistory_internalRoleCellName': div_transactionHistory_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 19-Click on div transactionHistory TestRunCell.png')

"Step 20: Click on div transactionHistory (TestRunCell) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory', ['div_transactionHistory_class': div_transactionHistory_class_1, 'div_transactionHistory_internalRoleCellName': div_transactionHistory_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 20-Click on div transactionHistory TestRunCell - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC75-Schedule a Test Run with Configuration and Environment Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}