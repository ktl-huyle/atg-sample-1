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

"Step 4: Click on div historyItems (HistorySubscribed)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyItems', ['div_historyItems_internalHasText': div_historyItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on div historyItems HistorySubscribed.png')

"Step 5: Click on div historyItems (HistorySubscribed)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyItems', ['div_historyItems_internalHasText': div_historyItems_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on div historyItems HistorySubscribed.png')

"Step 6: Click on link ShowDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ShowDetails'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on link ShowDetails.png')

"Step 7: Click on div DesktopBrowserSessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_DesktopBrowserSessions'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on div DesktopBrowserSessions.png')

"Step 8: Click on div DesktopBrowserSessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_DesktopBrowserSessions'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8-Click on div DesktopBrowserSessions.png')

"Step 9: Click on div menuItems (MuiPopover)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_menuItems'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 9-Click on div menuItems MuiPopover.png')

"Step 10: Click on link ShowDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ShowDetails'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on link ShowDetails.png')

"Step 11: Click on p sessionDetails (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails', ['p_sessionDetails_class': p_sessionDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11-Click on p sessionDetails Sessions2.png')

"Step 12: Click on p sessionDetails (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails', ['p_sessionDetails_class': p_sessionDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 12-Click on p sessionDetails Sessions.png')

"Step 13: Click on div menuItems (MuiPopover)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_menuItems'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13-Click on div menuItems MuiPopover.png')

"Step 14: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 14-Click on button ScheduleTestRun.png')

"Step 15: Click on div WindowsChrome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_WindowsChrome'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 15-Click on div WindowsChrome.png')

"Step 16: Click on div SelectTestSuite2 -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectTestSuite2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16-Click on div SelectTestSuite2 - Navigate to page teamprojecttest-project.png')

"Step 17: Click on link TestEnvironments -> Navigate to page 'team/*/project/*/test-project/*/git/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 17-Click on link TestEnvironments - Navigate to page teamprojecttest-projectgitedit.png')

"Step 18: Click on div RefsHeads"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/div_RefsHeads'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 18-Click on div RefsHeads.png')

"Step 19: Click on div RefsHeadsMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/div_RefsHeadsMain'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 19-Click on div RefsHeadsMain.png')

"Step 20: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 20-Click on button Save.png')

"Step 21: Click on button CloseAlert -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/button_CloseAlert'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 21-Click on button CloseAlert - Navigate to page teamprojecttest-project.png')

"Step 22: Click on link TestCloud -> Navigate to page 'team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_TestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 22-Click on link TestCloud - Navigate to page teamprojectagent.png')

"Step 23: Click on link Executions -> Navigate to page '/team/1515252/project/1534644/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 23-Click on link Executions - Navigate to page team1515252project1534644agenttest-cloud.png')

"Step 24: Click on div MainBody"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/1515252/project/1534644/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojectagent_test_cloud/div_MainBody'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 24-Click on div MainBody.png')

"Step 25: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/1515252/project/1534644/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojectagent_test_cloud/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 25-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 26: Click on link Schedules -> Navigate to page 'team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Schedules'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 26-Click on link Schedules - Navigate to page teamprojectgrid.png')

"Step 27: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 27-Click on button ScheduleTestRun.png')

"Step 28: Click on div NameLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_NameLabel'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 28-Click on div NameLabel.png')

"Step 29: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_Name'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 29-Enter input value in input Name.png')

"Step 30: Click on div TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 30-Click on div TestSuites.png')

"Step 31: Click on div TestSuiteIdIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_TestSuiteIdIcon'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 31-Click on div TestSuiteIdIcon.png')

"Step 32: Click on div TestSuiteIdIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_TestSuiteIdIcon'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 32-Click on div TestSuiteIdIcon.png')

"Step 33: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 33-Click on button CloseDialog.png')

"Step 34: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 34-Click on button ScheduleTestRun.png')

"Step 35: Click on link Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 35-Click on link Refresh.png')

"Step 36: Click on link Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 36-Click on link Refresh.png')

"Step 37: Click on div ReactSelectIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_ReactSelectIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 37-Click on div ReactSelectIndicator.png')

"Step 38: Click on div TestSuites2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_TestSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 38-Click on div TestSuites2.png')

"Step 39: Click on link Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 39-Click on link Refresh.png')

"Step 40: Click on link Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 40-Click on link Refresh.png')

"Step 41: Click on button TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 41-Click on button TestSuiteCollection.png')

"Step 42: Click on button TestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_TestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 42-Click on button TestSuite.png')

"Step 43: Click on div customSelectValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_customSelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 43-Click on div customSelectValue.png')

"Step 44: Click on div katalonCloudOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_katalonCloudOption'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 44-Click on div katalonCloudOption.png')

"Step 45: Click on div selectPlaceholder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_selectPlaceholder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 45-Click on div selectPlaceholder.png')

"Step 46: Click on div customSelectValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_customSelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 46-Click on div customSelectValue.png')

"Step 47: Click on div ehsTestAutomation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_ehsTestAutomation'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 47-Click on div ehsTestAutomation.png')

"Step 48: Click on input textField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_textField'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 48-Click on input textField.png')

"Step 49: Click on div TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 49-Click on div TestSuites.png')

"Step 50: Click on small selectExistingScript -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/small_selectExistingScript'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 50-Click on small selectExistingScript - Navigate to page teamprojecttest-project.png')

"Step 51: Click on link testProjects (TestProject2) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects', ['link_testProjects_trNthChild': link_testProjects_trNthChild, 'link_testProjects_internalRoleLinkName': link_testProjects_internalRoleLinkName, 'team_id': team_id, 'test_project_id': test_project_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 51-Click on link testProjects TestProject2 - Navigate to page teamprojecttest-project.png')

"Step 52: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 52-Click on button RefreshScriptRepository.png')

"Step 53: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 53-Click on button object.png')

"Step 54: Click on button Edit -> Navigate to page 'team/*/project/*/test-project/*/git/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 54-Click on button Edit - Navigate to page teamprojecttest-projectgitedit.png')

"Step 55: Click on link integrations -> Navigate to page 'team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/link_integrations'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 55-Click on link integrations - Navigate to page teamprojectintegrations.png')

"Step 56: Click on div iconElements (codelessAutomationToolIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_iconElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_iconElements', ['div_iconElements_internalRoleTreeitemName': div_iconElements_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 56-Click on div iconElements codelessAutomationToolIcon.png')

"Step 57: Click on div codelessAutomationTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_codelessAutomationTool'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 57-Click on div codelessAutomationTool.png')

"Step 58: Click on div ciCdPipeline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_ciCdPipeline'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 58-Click on div ciCdPipeline.png')

"Step 59: Click on div azureDevOpsPipelines"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_azureDevOpsPipelines'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 59-Click on div azureDevOpsPipelines.png')

"Step 60: Click on input reportFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/input_reportFolder'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 60-Click on input reportFolder.png')

"Step 61: Click on div rowContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_rowContainer'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 61-Click on div rowContainer.png')

"Step 62: Click on div apiKeyIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_apiKeyIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 62-Click on div apiKeyIndicator.png')

"Step 63: Click on div collapseWrapper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_collapseWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 63-Click on div collapseWrapper.png')

"Step 64: Click on div docker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_docker'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 64-Click on div docker.png')

"Step 65: Click on pre codeBlock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/pre_codeBlock'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 65-Click on pre codeBlock.png')

"Step 66: Click on link testEnvironments -> Navigate to page 'team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 66-Click on link testEnvironments - Navigate to page teamprojectagent.png')

"Step 67: Click on link testCloudTunnels -> Navigate to page 'team/*/project/*/testCloudTunnel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_testCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 67-Click on link testCloudTunnels - Navigate to page teamprojecttestCloudTunnel.png')

"Step 68: Click on link customFields -> Navigate to page 'team/*/project/*/custom-fields'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/testCloudTunnel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_customFields'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 68-Click on link customFields - Navigate to page teamprojectcustom-fields.png')

"Step 69: Click on button settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/button_settings'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 69-Click on button settings.png')

"Step 70: Click on link organizationManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/link_organizationManagement'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 70-Click on link organizationManagement - Navigate to page .png')

"Step 71: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Verify Test Execution and Cloud Integration Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}