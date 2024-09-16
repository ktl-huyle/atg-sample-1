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

"Step 4: Click on header projectObjects (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 4-Click on header projectObjects object2.png')

"Step 5: Click on button details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 5-Click on button details2 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link testResults2 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults2_1'))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 6-Click on link testResults2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 7: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/td_object'))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 7-Click on td object.png')

"Step 8: Click on div infoSidebarHeaderCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_infoSidebarHeaderCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 8-Click on div infoSidebarHeaderCloseButton.png')

"Step 9: Click on button testRunActions (object) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testRunActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testRunActions', ['button_testRunActions_class': button_testRunActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 9-Click on button testRunActions object - Navigate to page teamprojectexecutionstest-result.png')

"Step 10: Click on span testResultSummary (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testResultSummary', ['span_testResultSummary_nthChild': span_testResultSummary_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 10-Click on span testResultSummary object.png')

"Step 11: Click on span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 11-Click on span object2.png')

"Step 12: Click on span testResultSummary (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testResultSummary', ['span_testResultSummary_nthChild': span_testResultSummary_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 12-Click on span testResultSummary object3.png')

"Step 13: Click on span testResultSummary (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testResultSummary', ['span_testResultSummary_nthChild': span_testResultSummary_nthChild_2, 'span_testResultSummary_internalHasText': span_testResultSummary_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 13-Click on span testResultSummary object4.png')

"Step 14: Click on span testResultSummary (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testResultSummary_1'))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 14-Click on span testResultSummary object5.png')

"Step 15: Click on span testResultSummary (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testResultSummary_1'))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 15-Click on span testResultSummary object6.png')

"Step 16: Click on span testResultSummary (object5) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testResultSummary_1'))

WebUI.takeScreenshot(reportLocation + '/TC378/Step 16-Click on span testResultSummary object5 - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC378-Verify Test Run Actions and Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}