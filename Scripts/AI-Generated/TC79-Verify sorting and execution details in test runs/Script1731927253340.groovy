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

"Step 3: Navigate to team/*/project/*/executions"

TrueTestScripts.navigate("team/*/project/*/executions")

"Step 4: Click on div sortOptions (SortIdDescending)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortOptions', ['div_sortOptions_internalText': div_sortOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 4-Click on div sortOptions SortIdDescending.png')

"Step 5: Click on span Started"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_Started'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 5-Click on span Started.png')

"Step 6: Click on div sortOptions (SortIdDescending2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortOptions', ['div_sortOptions_internalText': div_sortOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 6-Click on div sortOptions SortIdDescending2.png')

"Step 7: Click on div FlexGrow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FlexGrow'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 7-Click on div FlexGrow.png')

"Step 8: Click on div regressionDetails (SP3TORRegression)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_regressionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 8-Click on div regressionDetails SP3TORRegression.png')

"Step 9: Click on td Loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_Loading'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 9-Click on td Loading.png')

"Step 10: Click on link executionDetails (Execution3791)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id, 'executions_id': executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 10-Click on link executionDetails Execution3791.png')

"Step 11: Click on div TestCase2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestCase2'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 11-Click on div TestCase2.png')

"Step 12: Click on link executionDetails (Execution3791) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_1, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'team_id': team_id_1, 'project_id': project_id_1, 'executions_id': executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 12-Click on link executionDetails Execution3791 - Navigate to page teamprojectexecutions.png')

"Step 13: Click on div failedTestResults (FailedTestResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 13-Click on div failedTestResults FailedTestResults.png')

"Step 14: Click on td testCases (TestCasesSP3TOR)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCases', ['td_testCases_internalRoleCellName': td_testCases_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 14-Click on td testCases TestCasesSP3TOR.png')

"Step 15: Click on div TestCasesSP3TOR -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestCasesSP3TOR'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 15-Click on div TestCasesSP3TOR - Navigate to page teamprojectexecutions.png')

"Step 16: Click on div allTestRuns (AllTestRuns)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_allTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 16-Click on div allTestRuns AllTestRuns.png')

"Step 17: Click on div allTestRuns (AllTestRuns)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_allTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 17-Click on div allTestRuns AllTestRuns.png')

"Step 18: Click on link executionDetails (Execution3791)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_2, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_2, 'team_id': team_id_2, 'project_id': project_id_2, 'executions_id': executions_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 18-Click on link executionDetails Execution3791.png')

"Step 19: Click on link executionDetails (Execution3791) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_3, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_3, 'team_id': team_id_3, 'project_id': project_id_3, 'executions_id': executions_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 19-Click on link executionDetails Execution3791 - Navigate to page teamprojectexecutions.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC79-Verify sorting and execution details in test runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}