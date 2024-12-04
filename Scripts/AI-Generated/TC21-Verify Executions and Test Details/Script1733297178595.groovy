import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

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

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions")

"Step 4: Click on div sortInfo (SortInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortInfo', ['div_sortInfo_internalText': div_sortInfo_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Click on div sortInfo SortInfo.png')

"Step 5: Click on span StartedInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_StartedInfo'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on span StartedInfo.png')

"Step 6: Click on div sortInfo (SortInfo2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortInfo', ['div_sortInfo_internalText': div_sortInfo_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 6-Click on div sortInfo SortInfo2.png')

"Step 7: Click on div Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Object'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 7-Click on div Object.png')

"Step 8: Click on div penTestIssues (Object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_penTestIssues'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 8-Click on div penTestIssues Object2.png')

"Step 9: Click on td Loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_Loading'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 9-Click on td Loading.png')

"Step 10: Click on link executionDetails (Execution20350)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'team_id': team_id, 'executions_id': executions_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 10-Click on link executionDetails Execution20350.png')

"Step 11: Click on div TestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestCase'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 11-Click on div TestCase.png')

"Step 12: Click on link executionDetails (ExecutionDetails3) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_1, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'team_id': team_id_1, 'executions_id': executions_id_1, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 12-Click on link executionDetails ExecutionDetails3 - Navigate to page teamprojectexecutions.png')

"Step 13: Click on div FailedTestResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FailedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 13-Click on div FailedTestResults.png')

"Step 14: Click on td testCase (TestCaseYGYCheckout2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCase', ['td_testCase_internalRoleCellName': td_testCase_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 14-Click on td testCase TestCaseYGYCheckout2.png')

"Step 15: Click on div TestCaseDetails -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestCaseDetails'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 15-Click on div TestCaseDetails - Navigate to page teamprojectexecutions.png')

"Step 16: Click on div AllTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_AllTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 16-Click on div AllTestRuns.png')

"Step 17: Click on div AllTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_AllTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 17-Click on div AllTestRuns.png')

"Step 18: Click on link executionDetails (Execution20350)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_2, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_2, 'team_id': team_id_2, 'executions_id': executions_id_2, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 18-Click on link executionDetails Execution20350.png')

"Step 19: Click on link executionDetails (ExecutionDetails3) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_3, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_3, 'team_id': team_id_3, 'executions_id': executions_id_3, 'project_id': project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 19-Click on link executionDetails ExecutionDetails3 - Navigate to page teamprojectexecutions.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Verify Executions and Test Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}