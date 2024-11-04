import truetest.common.configureTestSuiteAndRun
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 4: Click on link projectLinks (OJOracleJDE) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'link_projectLinks_team_id': link_projectLinks_team_id, 'link_projectLinks_project_id': link_projectLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 4-Click on link projectLinks OJOracleJDE - Navigate to page teamproject.png')

"Step 5: Click on link Settings2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 5-Click on link Settings2 - Navigate to page teamproject.png')

"Step 6: Click on link navigationLinks (ScriptRepositories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks', ['link_navigationLinks_nthChild': link_navigationLinks_nthChild, 'link_navigationLinks_internalRoleLinkName': link_navigationLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 6-Click on link navigationLinks ScriptRepositories.png')

"Step 7: Click on link oracleJDE (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_oracleJDE"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_oracleJDE', ['link_oracleJDE_trNthChild': link_oracleJDE_trNthChild, 'link_oracleJDE_internalRoleLinkName': link_oracleJDE_internalRoleLinkName, 'link_oracleJDE_project_id': link_oracleJDE_project_id, 'link_oracleJDE_team_id': link_oracleJDE_team_id, 'link_oracleJDE_test_project_id': link_oracleJDE_test_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 7-Click on link oracleJDE OracleJDE - Navigate to page teamprojecttest-project.png')

"Step 8: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 8-Click on button ScheduleTestRun.png')

"Step 9: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests2_1'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 10-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 11: Click on span treeSwitchers (TreeSwitcher3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 11-Click on span treeSwitchers TreeSwitcher3.png')

"Step 12: Click on span treeSwitchers (TestCases2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 12-Click on span treeSwitchers TestCases2.png')

"Step 13: Click on div testCases (TestCases2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 13-Click on div testCases TestCases2.png')

"Step 14: Click on input TestCaseCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/input_TestCaseCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 14-Click on input TestCaseCheckbox.png')

"Step 15: Click on link Settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Settings_2'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 15-Click on link Settings - Navigate to page teamproject.png')

"Step 16: Click on link navigationLinks (ScriptRepositories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks', ['link_navigationLinks_nthChild': link_navigationLinks_nthChild_1, 'link_navigationLinks_internalRoleLinkName': link_navigationLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 16-Click on link navigationLinks ScriptRepositories.png')

"Step 17: Click on link oracleJDE (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_oracleJDE"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_oracleJDE', ['link_oracleJDE_trNthChild': link_oracleJDE_trNthChild_1, 'link_oracleJDE_internalRoleLinkName': link_oracleJDE_internalRoleLinkName_1, 'link_oracleJDE_project_id': link_oracleJDE_project_id_1, 'link_oracleJDE_team_id': link_oracleJDE_team_id_1, 'link_oracleJDE_test_project_id': link_oracleJDE_test_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 17-Click on link oracleJDE OracleJDE - Navigate to page teamprojecttest-project.png')

"Step 18: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 18-Click on button ScheduleTestRun.png')

"Step 19: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_1, Integer.valueOf(index_1))

"Step 20: Click on div successMessage (SuccessMessage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_successMessages'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 20-Click on div successMessage SuccessMessage.png')

"Step 21: Click on div Navbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Navbar'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 21-Click on div Navbar.png')

"Step 22: Click on link viewTestRun (ViewTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRun', ['link_viewTestRun_internalRoleLinkName': link_viewTestRun_internalRoleLinkName, 'link_viewTestRun_team_id': link_viewTestRun_team_id, 'link_viewTestRun_project_id': link_viewTestRun_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 22-Click on link viewTestRun ViewTestRun.png')

"Step 23: Click on div testRunCells (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 23-Click on div testRunCells TestRunCell.png')

"Step 24: Click on div testRunCells (TestRunCell) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_1, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 24-Click on div testRunCells TestRunCell - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC153-Schedule Test Runs with Various Configurations_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}