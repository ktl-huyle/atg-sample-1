import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

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

"Step 4: Click on div sortingInfo (SortIdDescending)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo', ['div_sortingInfo_internalText': div_sortingInfo_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 4-Click on div sortingInfo SortIdDescending.png')

"Step 5: Click on span Started"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_Started'))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 5-Click on span Started.png')

"Step 6: Click on div sortingInfo (SortIdDescending2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo', ['div_sortingInfo_internalText': div_sortingInfo_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 6-Click on div sortingInfo SortIdDescending2.png')

"Step 7: Click on div FlexGrow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FlexGrow'))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 7-Click on div FlexGrow.png')

"Step 8: Click on div testIssues (SP3TORRegression)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testIssues'))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 8-Click on div testIssues SP3TORRegression.png')

"Step 9: Click on td Loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_Loading'))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 9-Click on td Loading.png')

"Step 10: Click on link executionLinks (Execution3791)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName, 'link_executionLinks_executions_id': link_executionLinks_executions_id, 'link_executionLinks_team_id': link_executionLinks_team_id, 'link_executionLinks_project_id': link_executionLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 10-Click on link executionLinks Execution3791.png')

"Step 11: Click on div TestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestCase'))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 11-Click on div TestCase.png')

"Step 12: Click on link executionLinks (Execution3791) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild_1, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_1, 'link_executionLinks_executions_id': link_executionLinks_executions_id_1, 'link_executionLinks_team_id': link_executionLinks_team_id_1, 'link_executionLinks_project_id': link_executionLinks_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 12-Click on link executionLinks Execution3791 - Navigate to page teamprojectexecutions.png')

"Step 13: Click on div FailedTestResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FailedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 13-Click on div FailedTestResults.png')

"Step 14: Click on td testCases (TestCasesSP3TOR)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCases', ['td_testCases_internalRoleCellName': td_testCases_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 14-Click on td testCases TestCasesSP3TOR.png')

"Step 15: Click on div TestCasesSP3TOR -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestCasesSP3TOR'))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 15-Click on div TestCasesSP3TOR - Navigate to page teamprojectexecutions.png')

"Step 16: Click on div AllTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_AllTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 16-Click on div AllTestRuns.png')

"Step 17: Click on div AllTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_AllTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 17-Click on div AllTestRuns.png')

"Step 18: Click on link executionLinks (Execution3791)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild_2, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_2, 'link_executionLinks_executions_id': link_executionLinks_executions_id_2, 'link_executionLinks_team_id': link_executionLinks_team_id_2, 'link_executionLinks_project_id': link_executionLinks_project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 18-Click on link executionLinks Execution3791.png')

"Step 19: Click on link executionLinks (Execution3791) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild_3, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_3, 'link_executionLinks_executions_id': link_executionLinks_executions_id_3, 'link_executionLinks_team_id': link_executionLinks_team_id_3, 'link_executionLinks_project_id': link_executionLinks_project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC231/Step 19-Click on link executionLinks Execution3791 - Navigate to page teamprojectexecutions.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC231-Verify Test Executions in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}