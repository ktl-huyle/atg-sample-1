import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.scheduleMultipleTestRuns
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

"Step 3: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on div historyInfo (historyInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo', ['div_historyInfo_internalHasText': div_historyInfo_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 4-Click on div historyInfo historyInfo.png')

"Step 5: Click on div historyInfo (historyInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo', ['div_historyInfo_internalHasText': div_historyInfo_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 5-Click on div historyInfo historyInfo.png')

"Step 6: Click on link showDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_showDetails'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 6-Click on link showDetails.png')

"Step 7: Click on div sessionInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_sessionInfo'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 7-Click on div sessionInfo.png')

"Step 8: Click on div sessionInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_sessionInfo'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 8-Click on div sessionInfo.png')

"Step 9: Click on div dynamicObject (popoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 9-Click on div dynamicObject popoverBackdrop.png')

"Step 10: Click on link showDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_showDetails'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 10-Click on link showDetails.png')

"Step 11: Click on p sessionInfo (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionInfo', ['p_sessionInfo_class': p_sessionInfo_class]))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 11-Click on p sessionInfo sessions.png')

"Step 12: Click on p sessionInfo (sessionCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionInfo', ['p_sessionInfo_class': p_sessionInfo_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 12-Click on p sessionInfo sessionCount.png')

"Step 13: Click on div dynamicObject (popoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 13-Click on div dynamicObject popoverBackdrop.png')

"Step 14: Schedule multiple test runs with various configurations."

scheduleMultipleTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on link gitRepository -> Navigate to page 'team/*/project/*/test-project/*/git/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_gitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 15-Click on link gitRepository - Navigate to page teamprojecttest-projectgitedit.png')

"Step 16: Click on div branchInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/div_branchInfo'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 16-Click on div branchInfo.png')

"Step 17: Click on div branchReference"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/div_branchReference'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 17-Click on div branchReference.png')

"Step 18: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 18-Click on button save.png')

"Step 19: Click on button closeDialog -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/button_closeDialog'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 19-Click on button closeDialog - Navigate to page teamprojecttest-project.png')

"Step 20: Click on link testEnvironments -> Navigate to page 'team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 20-Click on link testEnvironments - Navigate to page teamprojectagent.png')

"Step 21: Click on link testCloud -> Navigate to page '/team/1515252/project/1534644/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_testCloud_1'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 21-Click on link testCloud - Navigate to page team1515252project1534644agenttest-cloud.png')

"Step 22: Click on div mainBody"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/1515252/project/1534644/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojectagent_test_cloud/div_mainBody'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 22-Click on div mainBody.png')

"Step 23: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/1515252/project/1534644/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojectagent_test_cloud/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 23-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 24: Click on link schedules -> Navigate to page 'team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_schedules'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 24-Click on link schedules - Navigate to page teamprojectgrid.png')

"Step 25: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 25-Click on button scheduleTestRun.png')

"Step 26: Click on div nameLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_nameLabel'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 26-Click on div nameLabel.png')

"Step 27: Enter input value in input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/input_name'), input_name)

WebUI.takeScreenshot(reportLocation + '/TC197/Step 27-Enter input value in input name.png')

"Step 28: Click on div testSuiteInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteInfo'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 28-Click on div testSuiteInfo.png')

"Step 29: Click on div testSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 29-Click on div testSuiteIcon.png')

"Step 30: Click on div testSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 30-Click on div testSuiteIcon.png')

"Step 31: Click on button closeDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_closeDialog'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 31-Click on button closeDialog.png')

"Step 32: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 32-Click on button scheduleTestRun.png')

"Step 33: Click on link refreshDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_refreshDetails'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 33-Click on link refreshDetails.png')

"Step 34: Click on link refreshDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_refreshDetails'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 34-Click on link refreshDetails.png')

"Step 35: Click on div selectIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_selectIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 35-Click on div selectIndicator.png')

"Step 36: Click on div testSuiteInfo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteInfo2'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 36-Click on div testSuiteInfo2.png')

"Step 37: Click on link refreshDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_refreshDetails'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 37-Click on link refreshDetails.png')

"Step 38: Click on link refreshDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_refreshDetails'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 38-Click on link refreshDetails.png')

"Step 39: Click on button testSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_testSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 39-Click on button testSuiteCollection.png')

"Step 40: Click on button testSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_testSuite'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 40-Click on button testSuite.png')

"Step 41: Click on div customSelectValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_customSelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 41-Click on div customSelectValue.png')

"Step 42: Click on div KatalonCloudOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_KatalonCloudOption'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 42-Click on div KatalonCloudOption.png')

"Step 43: Click on div SelectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_SelectOption'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 43-Click on div SelectOption.png')

"Step 44: Click on div customSelectValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_customSelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 44-Click on div customSelectValue.png')

"Step 45: Click on div EHSTestAutomation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_EHSTestAutomation'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 45-Click on div EHSTestAutomation.png')

"Step 46: Click on input TextInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_TextInput'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 46-Click on input TextInput.png')

"Step 47: Click on div testSuiteInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteInfo'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 47-Click on div testSuiteInfo.png')

"Step 48: Click on small SelectExistingScript -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/small_SelectExistingScript'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 48-Click on small SelectExistingScript - Navigate to page teamprojecttest-project.png')

"Step 49: Click on link gitRepository -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_gitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 49-Click on link gitRepository - Navigate to page teamprojecttest-project.png')

"Step 50: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 50-Click on button RefreshScriptRepository.png')

"Step 51: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 51-Click on button Close.png')

"Step 52: Click on button Edit -> Navigate to page 'team/*/project/*/test-project/*/git/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 52-Click on button Edit - Navigate to page teamprojecttest-projectgitedit.png')

"Step 53: Click on link Integrations -> Navigate to page 'team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/link_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 53-Click on link Integrations - Navigate to page teamprojectintegrations.png')

"Step 54: Click on div automationTools (CodelessAutomationTool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_automationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_automationTools', ['div_automationTools_internalRoleTreeitemName': div_automationTools_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 54-Click on div automationTools CodelessAutomationTool.png')

"Step 55: Click on div integrationTools (CodelessAutomationTool2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools_1', ['div_integrationTools_class': div_integrationTools_class]))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 55-Click on div integrationTools CodelessAutomationTool2.png')

"Step 56: Click on div integrationTools (CICDPipeline)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools_1', ['div_integrationTools_class': div_integrationTools_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 56-Click on div integrationTools CICDPipeline.png')

"Step 57: Click on div AzureDevOpsPipelines"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_AzureDevOpsPipelines'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 57-Click on div AzureDevOpsPipelines.png')

"Step 58: Click on input ReportFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/input_ReportFolder'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 58-Click on input ReportFolder.png')

"Step 59: Click on div RowContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_RowContainer'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 59-Click on div RowContainer.png')

"Step 60: Click on div ApiKeyControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_ApiKeyControl'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 60-Click on div ApiKeyControl.png')

"Step 61: Click on div CollapseWrapper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_CollapseWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 61-Click on div CollapseWrapper.png')

"Step 62: Click on div Docker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_Docker'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 62-Click on div Docker.png')

"Step 63: Click on pre CodeBlock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/pre_CodeBlock'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 63-Click on pre CodeBlock.png')

"Step 64: Click on link TestEnvironments -> Navigate to page 'team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 64-Click on link TestEnvironments - Navigate to page teamprojectagent.png')

"Step 65: Click on link TestCloudTunnels -> Navigate to page 'team/*/project/*/testCloudTunnel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_TestCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 65-Click on link TestCloudTunnels - Navigate to page teamprojecttestCloudTunnel.png')

"Step 66: Click on link CustomFields -> Navigate to page 'team/*/project/*/custom-fields'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/testCloudTunnel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_CustomFields'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 66-Click on link CustomFields - Navigate to page teamprojectcustom-fields.png')

"Step 67: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 67-Click on button Settings.png')

"Step 68: Click on link OrganizationManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/link_OrganizationManagement'))

WebUI.takeScreenshot(reportLocation + '/TC197/Step 68-Click on link OrganizationManagement - Navigate to page .png')

"Step 69: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC197-Schedule Test Runs with Various Configurations_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}