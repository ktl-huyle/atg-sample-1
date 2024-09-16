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

"Step 3: Navigate to team/*/project/*/executions"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions")

"Step 4: Click on div sortingOptions (sortIddescending)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingOptions', ['div_sortingOptions_internalText': div_sortingOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 4-Click on div sortingOptions sortIddescending.png')

"Step 5: Click on span started2MinsAgo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_started2MinsAgo'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 5-Click on span started2MinsAgo.png')

"Step 6: Click on div sortingOptions (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_sortingOptions', ['div_sortingOptions_internalText': div_sortingOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 6-Click on div sortingOptions object6.png')

"Step 7: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 7-Click on div object7.png')

"Step 8: Click on div failedTests (failedSp3Torregression)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 8-Click on div failedTests failedSp3Torregression.png')

"Step 9: Click on td loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_loading'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 9-Click on td loading.png')

"Step 10: Click on link testLinks (3791)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks', ['link_testLinks_trNthChild': link_testLinks_trNthChild, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName, 'link_testLinks_project_id': link_testLinks_project_id, 'link_testLinks_team_id': link_testLinks_team_id, 'link_testLinks_executions_id': link_testLinks_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 10-Click on link testLinks 3791.png')

"Step 11: Click on div testCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testCase'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 11-Click on div testCase.png')

"Step 12: Click on link testLinks (3791) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks', ['link_testLinks_trNthChild': link_testLinks_trNthChild_1, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_1, 'link_testLinks_project_id': link_testLinks_project_id_1, 'link_testLinks_team_id': link_testLinks_team_id_1, 'link_testLinks_executions_id': link_testLinks_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 12-Click on link testLinks 3791 - Navigate to page teamprojectexecutions.png')

"Step 13: Click on div failedTestResultsNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_failedTestResultsNth0'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 13-Click on div failedTestResultsNth0.png')

"Step 14: Click on td testCaseDetails (testCasesSp3TortestCasesNgs5114Nth1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/td_testCaseDetails', ['td_testCaseDetails_internalRoleCellName': td_testCaseDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 14-Click on td testCaseDetails testCasesSp3TortestCasesNgs5114Nth1.png')

"Step 15: Click on div testCasesSp3TortestCasesNgs4600 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testCasesSp3TortestCasesNgs4600'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 15-Click on div testCasesSp3TortestCasesNgs4600 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on div allTestRunsNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_allTestRunsNth0'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 16-Click on div allTestRunsNth0.png')

"Step 17: Click on div allTestRunsNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_allTestRunsNth0'))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 17-Click on div allTestRunsNth0.png')

"Step 18: Click on link testLinks (3791)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks', ['link_testLinks_trNthChild': link_testLinks_trNthChild_2, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_2, 'link_testLinks_project_id': link_testLinks_project_id_2, 'link_testLinks_team_id': link_testLinks_team_id_2, 'link_testLinks_executions_id': link_testLinks_executions_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 18-Click on link testLinks 3791.png')

"Step 19: Click on link testLinks (3791) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testLinks', ['link_testLinks_trNthChild': link_testLinks_trNthChild_3, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_3, 'link_testLinks_project_id': link_testLinks_project_id_3, 'link_testLinks_team_id': link_testLinks_team_id_3, 'link_testLinks_executions_id': link_testLinks_executions_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC398/Step 19-Click on link testLinks 3791 - Navigate to page teamprojectexecutions.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC398-Sort and View Failed Tests in Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}