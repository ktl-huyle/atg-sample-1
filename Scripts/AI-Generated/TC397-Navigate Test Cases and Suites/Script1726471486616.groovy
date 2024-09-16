import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link testRuns9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns9'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 4-Click on link testRuns9.png')

"Step 5: Click on link testCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 5-Click on link testCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 6: Click on link testReports (firstTestCase) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testReports', ['link_testReports_internalRoleLinkName': link_testReports_internalRoleLinkName, 'link_testReports_project_id': link_testReports_project_id, 'link_testReports_team_id': link_testReports_team_id, 'link_testReports_test_cases_id': link_testReports_test_cases_id]))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 6-Click on link testReports firstTestCase - Navigate to page teamprojecttest-designtest-cases.png')

"Step 7: Click on div userflowjsModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_userflowjsModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 7-Click on div userflowjsModalBackdrop.png')

"Step 8: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/td_object'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 8-Click on td object.png')

"Step 9: Click on div firstTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_firstTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 9-Click on div firstTestCase.png')

"Step 10: Click on div infoSidebarHeaderCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_infoSidebarHeaderCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 10-Click on div infoSidebarHeaderCloseButton.png')

"Step 11: Click on link testSuites3 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites3'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 11-Click on link testSuites3 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 12: Click on link testCases2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_testCases2'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 12-Click on link testCases2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 13: Click on span objectDetails (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1'))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 13-Click on span objectDetails object11.png')

"Step 14: Click on span objectDetails (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1', ['span_objectDetails_nthChild': span_objectDetails_nthChild, 'span_objectDetails_class': span_objectDetails_class, 'span_objectDetails_divNthChild': span_objectDetails_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 14-Click on span objectDetails object12.png')

"Step 15: Click on div testCaseDetails (uploadedData) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseDetails', ['div_testCaseDetails_internalText': div_testCaseDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC397/Step 15-Click on div testCaseDetails uploadedData - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC397-Navigate Test Cases and Suites_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}