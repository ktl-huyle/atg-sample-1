import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 4: Click on link testExecutionLinks (TestExecutionDetails) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionLinks', ['link_testExecutionLinks_class': link_testExecutionLinks_class, 'link_testExecutionLinks_nthChild': link_testExecutionLinks_nthChild, 'link_testExecutionLinks_internalRoleLinkName': link_testExecutionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 4-Click on link testExecutionLinks TestExecutionDetails - Navigate to page teamprojectexecutions.png')

"Step 5: Click on link testLinks (Tests) -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 5-Click on link testLinks Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on div testCases (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 6-Click on div testCases UploadedData.png')

"Step 7: Click on link testSuites -> Navigate to page '/team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 7-Click on link testSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 8: Click on div testSuites (katalonCloud)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 8-Click on div testSuites katalonCloud.png')

"Step 9: Click on div testSuites (uploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 9-Click on div testSuites uploadedData.png')

"Step 10: Click on div testSuites (testSuites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 10-Click on div testSuites testSuites.png')

"Step 11: Click on link testSuiteLinks (SmokeTestSuite) -> Navigate to page '/team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks', ['link_testSuiteLinks_internalRoleLinkName': link_testSuiteLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 11-Click on link testSuiteLinks SmokeTestSuite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC112-Navigate to Test Execution Links and Verify Test Suites_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}