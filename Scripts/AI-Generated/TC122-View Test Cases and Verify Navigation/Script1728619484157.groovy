import internal.GlobalVariable
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 4: Click on div AutomationSpecialist -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_welcome/div_AutomationSpecialist'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 4-Click on div AutomationSpecialist - Navigate to page teamproject.png')

"Step 5: Click on link TestRuns11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns11'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 5-Click on link TestRuns11.png')

"Step 6: Click on link TestCases2 -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 6-Click on link TestCases2 - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 7: Click on link testCaseNavigation (FirstTestCase) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testCaseNavigation', ['link_testCaseNavigation_internalRoleLinkName': link_testCaseNavigation_internalRoleLinkName, 'link_testCaseNavigation_project_id': link_testCaseNavigation_project_id, 'link_testCaseNavigation_team_id': link_testCaseNavigation_team_id, 'link_testCaseNavigation_test_cases_id': link_testCaseNavigation_test_cases_id]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 7-Click on link testCaseNavigation FirstTestCase - Navigate to page teamprojecttest-designtest-cases.png')

"Step 8: Click on div UserflowModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_UserflowModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 8-Click on div UserflowModalBackdrop.png')

"Step 9: Click on td PassedFirstTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/td_PassedFirstTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 9-Click on td PassedFirstTestCase.png')

"Step 10: Click on div FirstTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_FirstTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 10-Click on div FirstTestCase.png')

"Step 11: Click on div InfoSidebarCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_InfoSidebarCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 11-Click on div InfoSidebarCloseButton.png')

"Step 12: Click on link TestSuites8 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites8'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 12-Click on link TestSuites8 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 13: Click on link TestCases2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 13-Click on link TestCases2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on span treeSwitcher (TreeSwitcher12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 14-Click on span treeSwitcher TreeSwitcher12.png')

"Step 15: Click on span treeSwitcher (TreeSwitcher9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1', ['span_treeSwitcher_nthChild': span_treeSwitcher_nthChild, 'span_treeSwitcher_class': span_treeSwitcher_class, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 15-Click on span treeSwitcher TreeSwitcher9.png')

"Step 16: Click on div testCasesSection (UploadedData) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection', ['div_testCasesSection_internalText': div_testCasesSection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 16-Click on div testCasesSection UploadedData - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC122-View Test Cases and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}