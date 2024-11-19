import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 4: Click on div automationSpecialist (AutomationSpecialist) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_welcome/div_automationSpecialist'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 4-Click on div automationSpecialist AutomationSpecialist - Navigate to page teamproject.png')

"Step 5: Click on link TestRuns11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns11'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 5-Click on link TestRuns11.png')

"Step 6: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 6-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 7: Click on link FirstTestCase -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_FirstTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 7-Click on link FirstTestCase - Navigate to page teamprojecttest-designtest-cases.png')

"Step 8: Click on div UserFlowModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_UserFlowModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 8-Click on div UserFlowModalBackdrop.png')

"Step 9: Click on td PassedFirstTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/td_PassedFirstTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 9-Click on td PassedFirstTestCase.png')

"Step 10: Click on div firstTestCase (FirstTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_firstTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 10-Click on div firstTestCase FirstTestCase.png')

"Step 11: Click on div InfoSidebarCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_InfoSidebarCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 11-Click on div InfoSidebarCloseButton.png')

"Step 12: Click on link TestSuites9 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites9'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 12-Click on link TestSuites9 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 13: Click on link TestCases2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 13-Click on link TestCases2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on span treeSwitchers (TreeSwitcher20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2', ['span_treeSwitchers_class': span_treeSwitchers_class, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 14-Click on span treeSwitchers TreeSwitcher20.png')

"Step 15: Click on span treeSwitchers (TreeSwitcher11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2', ['span_treeSwitchers_class': span_treeSwitchers_class_1, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 15-Click on span treeSwitchers TreeSwitcher11.png')

"Step 16: Click on div testCases (UploadedData) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 16-Click on div testCases UploadedData - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC103-Verify Test Case Navigation and Home Page Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}