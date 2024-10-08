import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.accessProjectSettings
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Navigate to project settings and schedule a test run."

accessProjectSettings.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Configure settings for the test suite and save changes."

configureTestSuiteSettings.execute(data_path_1, Integer.valueOf(index_1))

"Step 6: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests9'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 7: Click on span treeSwitchers (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on span treeSwitchers TreeSwitcher.png')

"Step 8: Click on span treeSwitchers (KatalonStudioTestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on span treeSwitchers KatalonStudioTestCases.png')

"Step 9: Click on div testCaseSections (TestCasesSection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseSections'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on div testCaseSections TestCasesSection.png')

"Step 10: Click on input TestCaseCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/input_TestCaseCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on input TestCaseCheckbox.png')

"Step 11: Click on link Settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Settings_1'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on link Settings - Navigate to page teamproject.png')

"Step 12: Click on link projectLinks (ScriptRepositories2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_nthChild': link_projectLinks_nthChild, 'link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on link projectLinks ScriptRepositories2.png')

"Step 13: Click on link externalLinks (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_externalLinks', ['link_externalLinks_trNthChild': link_externalLinks_trNthChild, 'link_externalLinks_internalRoleLinkName': link_externalLinks_internalRoleLinkName, 'link_externalLinks_project_id': link_externalLinks_project_id, 'link_externalLinks_team_id': link_externalLinks_team_id, 'link_externalLinks_test_project_id': link_externalLinks_test_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on link externalLinks OracleJDE - Navigate to page teamprojecttest-project.png')

"Step 14: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on button ScheduleTestRun.png')

"Step 15: Configure settings for the test suite and save changes."

configureTestSuiteSettings.execute(data_path_2, Integer.valueOf(index_2))

"Step 16: Click on div appSuccessMessages (SuccessMessage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_appSuccessMessages'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on div appSuccessMessages SuccessMessage.png')

"Step 17: Click on div UnderTopNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnderTopNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on div UnderTopNavbar.png')

"Step 18: Click on link viewTestRun (ViewTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRun', ['link_viewTestRun_internalRoleLinkName': link_viewTestRun_internalRoleLinkName, 'link_viewTestRun_team_id': link_viewTestRun_team_id, 'link_viewTestRun_project_id': link_viewTestRun_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on link viewTestRun ViewTestRun.png')

"Step 19: Click on div teamProjectCells (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on div teamProjectCells TestRunCell.png')

"Step 20: Click on div teamProjectCells (TestRunCell) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_1, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on div teamProjectCells TestRunCell - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify Test Suite Scheduling and Configuration in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}