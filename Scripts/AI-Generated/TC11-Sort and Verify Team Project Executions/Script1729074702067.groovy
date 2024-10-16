import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 3: Navigate to team/{*}/project/{*}/executions"

TrueTestScripts.navigate("team/{*}/project/{*}/executions")

"Step 4: Click on div sortingInfo (sortingInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo', ['div_sortingInfo_internalText': div_sortingInfo_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on div sortingInfo sortingInfo.png')

"Step 5: Click on span started"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_started'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on span started.png')

"Step 6: Click on div sortingInfo (sortingInfo2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingInfo', ['div_sortingInfo_internalText': div_sortingInfo_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on div sortingInfo sortingInfo2.png')

"Step 7: Click on div cardBody"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_cardBody'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on div cardBody.png')

"Step 8: Click on div testDetails (cellSP3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testDetails'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on div testDetails cellSP3.png')

"Step 9: Click on td loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_loading'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on td loading.png')

"Step 10: Click on link projectExecutions (Executions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions', ['link_projectExecutions_trNthChild': link_projectExecutions_trNthChild, 'link_projectExecutions_internalRoleLinkName': link_projectExecutions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on link projectExecutions Executions.png')

"Step 11: Click on div testCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testCase'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on div testCase.png')

"Step 12: Click on link projectExecutions (Executions) -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions', ['link_projectExecutions_trNthChild': link_projectExecutions_trNthChild_1, 'link_projectExecutions_internalRoleLinkName': link_projectExecutions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on link projectExecutions Executions - Navigate to page team project executionsteamprojectexecutions.png')

"Step 13: Click on div failedTestResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_failedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on div failedTestResults.png')

"Step 14: Click on td testCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_testCase'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Click on td testCase.png')

"Step 15: Click on div testCaseDetails -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testCaseDetails'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on div testCaseDetails - Navigate to page team project executionsteamprojectexecutions.png')

"Step 16: Click on div allTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_allTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Click on div allTestRuns.png')

"Step 17: Click on div allTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_allTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Click on div allTestRuns.png')

"Step 18: Click on link projectExecutions (Executions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions', ['link_projectExecutions_trNthChild': link_projectExecutions_trNthChild_2, 'link_projectExecutions_internalRoleLinkName': link_projectExecutions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 18-Click on link projectExecutions Executions.png')

"Step 19: Click on link projectExecutions (Executions) -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions', ['link_projectExecutions_trNthChild': link_projectExecutions_trNthChild_3, 'link_projectExecutions_internalRoleLinkName': link_projectExecutions_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 19-Click on link projectExecutions Executions - Navigate to page team project executionsteamprojectexecutions.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Sort and Verify Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}