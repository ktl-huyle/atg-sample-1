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

"Step 3: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on div historySubscriptions (HistorySubscribed2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historySubscriptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historySubscriptions', ['div_historySubscriptions_internalHasText': div_historySubscriptions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on div historySubscriptions HistorySubscribed2.png')

"Step 5: Click on div historySubscriptions (HistorySubscribed2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historySubscriptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historySubscriptions', ['div_historySubscriptions_internalHasText': div_historySubscriptions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on div historySubscriptions HistorySubscribed2.png')

"Step 6: Click on link ShowDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ShowDetails'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link ShowDetails.png')

"Step 7: Click on div DesktopBrowserSessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_DesktopBrowserSessions'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on div DesktopBrowserSessions.png')

"Step 8: Click on div DesktopBrowserSessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_DesktopBrowserSessions'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on div DesktopBrowserSessions.png')

"Step 9: Click on div dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on div dynamicObject object.png')

"Step 10: Click on link ShowDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ShowDetails'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on link ShowDetails.png')

"Step 11: Click on p sessionInfo (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionInfo', ['p_sessionInfo_class': p_sessionInfo_class]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on p sessionInfo Sessions2.png')

"Step 12: Click on p sessionInfo (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionInfo', ['p_sessionInfo_class': p_sessionInfo_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on p sessionInfo Sessions.png')

"Step 13: Click on div dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on div dynamicObject object.png')

"Step 14: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on button ScheduleTestRun.png')

"Step 15: Click on div WindowsChrome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_WindowsChrome'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on div WindowsChrome.png')

"Step 16: Click on div CustomSelectValue2 -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CustomSelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on div CustomSelectValue2 - Navigate to page teamprojecttest-project.png')

"Step 17: Click on link EHSAutomation -> Navigate to page 'team/*/project/*/test-project/*/git/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_EHSAutomation'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on link EHSAutomation - Navigate to page teamprojecttest-projectgitedit.png')

"Step 18: Click on div refsBranches"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/div_refsBranches'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on div refsBranches.png')

"Step 19: Click on div refsHeads"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/div_refsHeads'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on div refsHeads.png')

"Step 20: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Click on button Save.png')

"Step 21: Click on button AlertClose -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/button_AlertClose'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Click on button AlertClose - Navigate to page teamprojecttest-project.png')

"Step 22: Click on link TestEnvironments -> Navigate to page 'team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Click on link TestEnvironments - Navigate to page teamprojectagent.png')

"Step 23: Click on link TestCloud -> Navigate to page '/team/1515252/project/1534644/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_TestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Click on link TestCloud - Navigate to page team1515252project1534644agenttest-cloud.png')

"Step 24: Click on div MainBody"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/1515252/project/1534644/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojectagent_test_cloud/div_MainBody'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Click on div MainBody.png')

"Step 25: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/1515252/project/1534644/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojectagent_test_cloud/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 26: Click on link Schedules -> Navigate to page 'team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Schedules_1'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Click on link Schedules - Navigate to page teamprojectgrid.png')

"Step 27: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Click on button ScheduleTestRun.png')

"Step 28: Click on div Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_Name'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Click on div Name.png')

"Step 29: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_Name'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 29-Enter input value in input Name.png')

"Step 30: Click on div TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 30-Click on div TestSuites.png')

"Step 31: Click on div TestSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_TestSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 31-Click on div TestSuiteIcon.png')

"Step 32: Click on div TestSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_TestSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 32-Click on div TestSuiteIcon.png')

"Step 33: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 33-Click on button CloseDialog.png')

"Step 34: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 34-Click on button ScheduleTestRun.png')

"Step 35: Click on link Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 35-Click on link Refresh.png')

"Step 36: Click on link Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 36-Click on link Refresh.png')

"Step 37: Click on div SelectIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_SelectIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 37-Click on div SelectIndicator.png')

"Step 38: Click on div TestSuites2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_TestSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 38-Click on div TestSuites2.png')

"Step 39: Click on link Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 39-Click on link Refresh.png')

"Step 40: Click on link Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 40-Click on link Refresh.png')

"Step 41: Click on button TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 41-Click on button TestSuiteCollection.png')

"Step 42: Click on button TestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_TestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 42-Click on button TestSuite.png')

"Step 43: Click on div CustomSelectValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_CustomSelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 43-Click on div CustomSelectValue.png')

"Step 44: Click on div KatalonCloudOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_KatalonCloudOption'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 44-Click on div KatalonCloudOption.png')

"Step 45: Click on div SelectPrompt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_SelectPrompt'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 45-Click on div SelectPrompt.png')

"Step 46: Click on div CustomSelectValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_CustomSelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 46-Click on div CustomSelectValue.png')

"Step 47: Click on div EHSAutomation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_EHSAutomation'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 47-Click on div EHSAutomation.png')

"Step 48: Click on input TextField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_TextField'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 48-Click on input TextField.png')

"Step 49: Click on div TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 49-Click on div TestSuites.png')

"Step 50: Click on small SelectScript -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/small_SelectScript'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 50-Click on small SelectScript - Navigate to page teamprojecttest-project.png')

"Step 51: Click on link testProjects (EHSAutomation2) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects', ['link_testProjects_trNthChild': link_testProjects_trNthChild, 'link_testProjects_internalRoleLinkName': link_testProjects_internalRoleLinkName, 'team_id': team_id, 'test_project_id': test_project_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 51-Click on link testProjects EHSAutomation2 - Navigate to page teamprojecttest-project.png')

"Step 52: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 52-Click on button RefreshScriptRepository.png')

"Step 53: Click on button AlertClose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_AlertClose'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 53-Click on button AlertClose.png')

"Step 54: Click on button Edit -> Navigate to page 'team/*/project/*/test-project/*/git/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 54-Click on button Edit - Navigate to page teamprojecttest-projectgitedit.png')

"Step 55: Click on link Integrations -> Navigate to page 'team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/link_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 55-Click on link Integrations - Navigate to page teamprojectintegrations.png')

"Step 56: Click on div integrationTools (CodelessAutomationTool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools', ['div_integrationTools_internalRoleTreeitemName': div_integrationTools_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 56-Click on div integrationTools CodelessAutomationTool.png')

"Step 57: Click on div CodelessAutomationTool2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_CodelessAutomationTool2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 57-Click on div CodelessAutomationTool2.png')

"Step 58: Click on div CICDPipeline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_CICDPipeline'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 58-Click on div CICDPipeline.png')

"Step 59: Click on div AzureDevOpsPipelines"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_AzureDevOpsPipelines'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 59-Click on div AzureDevOpsPipelines.png')

"Step 60: Click on input ReportFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/input_ReportFolder'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 60-Click on input ReportFolder.png')

"Step 61: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 61-Click on div Row.png')

"Step 62: Click on div ApiKeyIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_ApiKeyIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 62-Click on div ApiKeyIndicator.png')

"Step 63: Click on div StepContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_StepContent'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 63-Click on div StepContent.png')

"Step 64: Click on div Docker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_Docker'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 64-Click on div Docker.png')

"Step 65: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/pre_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 65-Click on pre object.png')

"Step 66: Click on link TestEnvironments -> Navigate to page 'team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 66-Click on link TestEnvironments - Navigate to page teamprojectagent.png')

"Step 67: Click on link TestCloudTunnels -> Navigate to page 'team/*/project/*/testCloudTunnel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_TestCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 67-Click on link TestCloudTunnels - Navigate to page teamprojecttestCloudTunnel.png')

"Step 68: Click on link CustomFields -> Navigate to page 'team/*/project/*/custom-fields'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/testCloudTunnel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_CustomFields'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 68-Click on link CustomFields - Navigate to page teamprojectcustom-fields.png')

"Step 69: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 69-Click on button Settings.png')

"Step 70: Click on link OrganizationManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/link_OrganizationManagement'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 70-Click on link OrganizationManagement - Navigate to page .png')

"Step 71: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Comprehensive Test Run Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}