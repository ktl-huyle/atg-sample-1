import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/*/project/*/executions"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions")

"Step 4: Click on div sortingInfo (sortingInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo', ['div_sortingInfo_internalText': div_sortingInfo_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 4-Click on div sortingInfo sortingInfo.png')

"Step 5: Click on span started"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_started'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 5-Click on span started.png')

"Step 6: Click on div sortingInfo (sortingInfo2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo', ['div_sortingInfo_internalText': div_sortingInfo_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 6-Click on div sortingInfo sortingInfo2.png')

"Step 7: Click on div cardBody"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_cardBody'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 7-Click on div cardBody.png')

"Step 8: Click on div dynamicObject (cellSP3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 8-Click on div dynamicObject cellSP3.png')

"Step 9: Click on td loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_loading'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 9-Click on td loading.png')

"Step 10: Click on link executionDetails (execution)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 10-Click on link executionDetails execution.png')

"Step 11: Click on div testCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testCase'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 11-Click on div testCase.png')

"Step 12: Click on link executionDetails (execution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_1, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'link_executionDetails_team_id': link_executionDetails_team_id_1, 'link_executionDetails_project_id': link_executionDetails_project_id_1, 'link_executionDetails_executions_id': link_executionDetails_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 12-Click on link executionDetails execution - Navigate to page teamprojectexecutions.png')

"Step 13: Click on div failedTestResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_failedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 13-Click on div failedTestResults.png')

"Step 14: Click on td testCase (testCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCase"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCase', ['td_testCase_internalRoleCellName': td_testCase_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 14-Click on td testCase testCase.png')

"Step 15: Click on div testCaseDetails -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testCaseDetails'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 15-Click on div testCaseDetails - Navigate to page teamprojectexecutions.png')

"Step 16: Click on div allTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_allTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 16-Click on div allTestRuns.png')

"Step 17: Click on div allTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_allTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 17-Click on div allTestRuns.png')

"Step 18: Click on link executionDetails (execution)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_2, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_2, 'link_executionDetails_team_id': link_executionDetails_team_id_2, 'link_executionDetails_project_id': link_executionDetails_project_id_2, 'link_executionDetails_executions_id': link_executionDetails_executions_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 18-Click on link executionDetails execution.png')

"Step 19: Click on link executionDetails (execution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_3, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_3, 'link_executionDetails_team_id': link_executionDetails_team_id_3, 'link_executionDetails_project_id': link_executionDetails_project_id_3, 'link_executionDetails_executions_id': link_executionDetails_executions_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 19-Click on link executionDetails execution - Navigate to page teamprojectexecutions.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC97-View Execution Details and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}