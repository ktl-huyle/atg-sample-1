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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on header testRunAgents (SGDPSp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunAgents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunAgents', ['header_testRunAgents_internalRoleHeadingName': header_testRunAgents_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on header testRunAgents SGDPSp2.png')

"Step 5: Click on button testResults (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_testResults', ['button_testResults_internalRoleTabName': button_testResults_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on button testResults Sessions.png')

"Step 6: Click on div 43"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_43'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on div 43.png')

"Step 7: Click on i 43"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_43'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on i 43.png')

"Step 8: Click on div 25"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_25'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on div 25.png')

"Step 9: Click on button GoToDetails -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on button GoToDetails - Navigate to page teamprojectgridplanjob.png')

"Step 10: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on link Reports - Navigate to page teamproject.png')

"Step 11: Click on link TestRuns4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on link TestRuns4.png')

"Step 12: Click on link executionLinks (143) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName, 'link_executionLinks_project_id': link_executionLinks_project_id, 'link_executionLinks_executions_id': link_executionLinks_executions_id, 'link_executionLinks_team_id': link_executionLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on link executionLinks 143 - Navigate to page teamprojectexecutions.png')

"Step 13: Click on div testCaseDetails (TestCasesHirerJourneyAutoLoanDP152)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class, 'div_testCaseDetails_internalText': div_testCaseDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on div testCaseDetails TestCasesHirerJourneyAutoLoanDP152.png')

"Step 14: Click on div testCaseDetails (TestCasesHirerJourneyAutoLoanDP76PRTC03)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_1, 'div_testCaseDetails_internalText': div_testCaseDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on div testCaseDetails TestCasesHirerJourneyAutoLoanDP76PRTC03.png')

"Step 15: Click on div testCaseDetails (TestCasesHirerJourneyAutoLoanDP76PRTC05)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_2, 'div_testCaseDetails_internalText': div_testCaseDetails_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on div testCaseDetails TestCasesHirerJourneyAutoLoanDP76PRTC05.png')

"Step 16: Click on div testCaseDetails (PassedTestCasesHirerJourneyAutoLoanDP152)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on div testCaseDetails PassedTestCasesHirerJourneyAutoLoanDP152.png')

"Step 17: Click on link Page2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Page2_1'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on link Page2.png')

"Step 18: Click on div RightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on div RightSidebar2.png')

"Step 19: Click on link TestSuitesSprint -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestSuitesSprint'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 19-Click on link TestSuitesSprint - Navigate to page teamprojecttest-designtest-suites.png')

"Step 20: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 20-Click on link Reports - Navigate to page teamproject.png')

"Step 21: Click on link TestRuns4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 21-Click on link TestRuns4.png')

"Step 22: Click on link executionLinks (143)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionLinks', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName_1, 'link_executionLinks_project_id': link_executionLinks_project_id_1, 'link_executionLinks_executions_id': link_executionLinks_executions_id_1, 'link_executionLinks_team_id': link_executionLinks_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 22-Click on link executionLinks 143.png')

"Step 23: Click on button rowSelection (SelectRowSGDPSp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection', ['button_rowSelection_internalRoleRowName': button_rowSelection_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 23-Click on button rowSelection SelectRowSGDPSp2.png')

"Step 24: Click on div menuComponents (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuComponents'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 24-Click on div menuComponents PopoverBackdrop.png')

"Step 25: Click on header testRunAgents (SGDPSp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunAgents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunAgents', ['header_testRunAgents_internalRoleHeadingName': header_testRunAgents_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 25-Click on header testRunAgents SGDPSp2.png')

"Step 26: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 26-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 27: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 27-Click on link TestRuns2 - Navigate to page teamproject.png')

"Step 28: Click on link reportLinks (Reports2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_internalRoleLinkName': link_reportLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 28-Click on link reportLinks Reports2.png')

"Step 29: Click on link reportLinks (Reports2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportLinks', ['link_reportLinks_internalRoleLinkName': link_reportLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 29-Click on link reportLinks Reports2.png')

"Step 30: Click on link TestRuns4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 30-Click on link TestRuns4.png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Access Execution Links and Review Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}