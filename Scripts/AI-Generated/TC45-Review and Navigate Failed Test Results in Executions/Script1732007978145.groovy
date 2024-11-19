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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/*/project/*/executions/*")

"Step 4: Click on span failedTests (FailedSortAndFilter)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_failedTests', ['span_failedTests_class': span_failedTests_class, 'span_failedTests_internalRoleButtonName': span_failedTests_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 4-Click on span failedTests FailedSortAndFilter.png')

"Step 5: Click on span failedTests (FailedSortAndFilter)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_failedTests', ['span_failedTests_class': span_failedTests_class_1, 'span_failedTests_internalRoleButtonName': span_failedTests_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 5-Click on span failedTests FailedSortAndFilter.png')

"Step 6: Click on div CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 6-Click on div CloseButton.png')

"Step 7: Click on button externalLinks (ExternalLink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_externalLinks', ['button_externalLinks_class': button_externalLinks_class, 'button_externalLinks_internalRoleButtonName': button_externalLinks_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 7-Click on button externalLinks ExternalLink.png')

"Step 8: Click on link TestResults6 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults6'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 8-Click on link TestResults6 - Navigate to page teamprojectexecutionstest-result.png')

"Step 9: Click on link ReRuns -> Navigate to page 'team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_ReRuns'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 9-Click on link ReRuns - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 10: Click on link Result2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/link_Result2'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 10-Click on link Result2 - Navigate to page teamprojectexecutionstest-result.png')

"Step 11: Click on span logItems (CreatedWithSketchtool3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems', ['span_logItems_nthChild': span_logItems_nthChild, 'span_logItems_internalHasText': span_logItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 11-Click on span logItems CreatedWithSketchtool3 - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC45-Review and Navigate Failed Test Results in Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}