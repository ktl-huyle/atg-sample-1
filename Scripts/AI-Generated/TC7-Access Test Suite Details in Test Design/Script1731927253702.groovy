import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

TrueTestScripts.navigate("organization/*/home")

"Step 4: Click on link testExecutionOptions (SmokeTestSuite681) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionOptions', ['link_testExecutionOptions_class': link_testExecutionOptions_class, 'link_testExecutionOptions_nthChild': link_testExecutionOptions_nthChild, 'link_testExecutionOptions_internalRoleLinkName': link_testExecutionOptions_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id, 'executions_id': executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on link testExecutionOptions SmokeTestSuite681 - Navigate to page teamprojectexecutions.png')

"Step 5: Click on link testDetails (Tests) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testDetails', ['team_id': team_id_1, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on link testDetails Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on div testCaseDetails (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on div testCaseDetails UploadedData.png')

"Step 7: Click on link TestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 8: Click on div testSuiteDetails (KatalonCloud)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails', ['div_testSuiteDetails_internalText': div_testSuiteDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on div testSuiteDetails KatalonCloud.png')

"Step 9: Click on div testSuiteDetails (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails', ['div_testSuiteDetails_internalText': div_testSuiteDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on div testSuiteDetails UploadedData.png')

"Step 10: Click on div testSuiteDetails (TestSuites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteDetails', ['div_testSuiteDetails_internalText': div_testSuiteDetails_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on div testSuiteDetails TestSuites.png')

"Step 11: Click on link testSuiteOptions (SmokeTestSuite) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteOptions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteOptions_1', ['link_testSuiteOptions_internalRoleLinkName': link_testSuiteOptions_internalRoleLinkName, 'test_suites_id': test_suites_id, 'team_id': team_id_2, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on link testSuiteOptions SmokeTestSuite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Access Test Suite Details in Test Design_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}