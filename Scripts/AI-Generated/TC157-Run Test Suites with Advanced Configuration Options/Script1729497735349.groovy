import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.scheduleTestRunWithDetails
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.scheduleMultipleTestRuns

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

"Step 3: Navigate to /team/*/project/*/test-runs"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on div historyInfo (historyInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo', ['div_historyInfo_internalHasText': div_historyInfo_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 4-Click on div historyInfo historyInfo.png')

"Step 5: Click on div historyInfo (historyInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyInfo', ['div_historyInfo_internalHasText': div_historyInfo_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 5-Click on div historyInfo historyInfo.png')

"Step 6: Click on link showDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_showDetails'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 6-Click on link showDetails.png')

"Step 7: Click on div sessionInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_sessionInfo'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 7-Click on div sessionInfo.png')

"Step 8: Click on div sessionInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_sessionInfo'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 8-Click on div sessionInfo.png')

"Step 9: Click on div popoverBackdrop2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_popoverBackdrop2'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 9-Click on div popoverBackdrop2.png')

"Step 10: Click on link showDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_showDetails'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 10-Click on link showDetails.png')

"Step 11: Click on p sessionDetails (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails', ['p_sessionDetails_class': p_sessionDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 11-Click on p sessionDetails sessions.png')

"Step 12: Click on p sessionDetails (sessionCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails', ['p_sessionDetails_class': p_sessionDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 12-Click on p sessionDetails sessionCount.png')

"Step 13: Click on div popoverBackdrop2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_popoverBackdrop2'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 13-Click on div popoverBackdrop2.png')

"Step 14: Schedule multiple test runs with different configurations"

scheduleMultipleTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on link gitRepository -> Navigate to page '/team/*/project/*/test-project/*/git/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_gitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 15-Click on link gitRepository - Navigate to page teamprojecttest-projectgitedit.png')

"Step 16: Click on div branchInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/div_branchInfo'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 16-Click on div branchInfo.png')

"Step 17: Click on div branchReference"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/div_branchReference'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 17-Click on div branchReference.png')

"Step 18: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 18-Click on button save.png')

"Step 19: Click on button closeDialog -> Navigate to page '/team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/button_closeDialog'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 19-Click on button closeDialog - Navigate to page teamprojecttest-project.png')

"Step 20: Click on link testEnvironments -> Navigate to page '/team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 20-Click on link testEnvironments - Navigate to page teamprojectagent.png')

"Step 21: Click on link testCloud -> Navigate to page '/team/*/project/*/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_testCloud'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 21-Click on link testCloud - Navigate to page teamprojectagenttest-cloud.png')

"Step 22: Click on div MainBody"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_test_cloud/div_MainBody'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 22-Click on div MainBody.png')

"Step 23: Click on link Executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_test_cloud/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 23-Click on link Executions.png')

"Step 24: Schedule a test run with specific details and configurations"

scheduleTestRunWithDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 25: Click on link gitRepository -> Navigate to page '/team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_gitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 25-Click on link gitRepository - Navigate to page teamprojecttest-project.png')

"Step 26: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 26-Click on button RefreshScriptRepository.png')

"Step 27: Click on button AlertButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_AlertButton'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 27-Click on button AlertButton.png')

"Step 28: Click on button Edit -> Navigate to page '/team/*/project/*/test-project/*/git/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 28-Click on button Edit - Navigate to page teamprojecttest-projectgitedit.png')

"Step 29: Click on link Integrations -> Navigate to page '/team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/link_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 29-Click on link Integrations - Navigate to page teamprojectintegrations.png')

"Step 30: Click on div integrationDetails (CodelessAutomationTool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationDetails_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationDetails_2', ['div_integrationDetails_class': div_integrationDetails_class, 'div_integrationDetails_internalRoleTreeitemName': div_integrationDetails_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 30-Click on div integrationDetails CodelessAutomationTool.png')

"Step 31: Click on div integrationDetails (CodelessAutomationTool2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationDetails_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationDetails_4', ['div_integrationDetails_class': div_integrationDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 31-Click on div integrationDetails CodelessAutomationTool2.png')

"Step 32: Click on div integrationDetails (CICDPipeline)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationDetails_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationDetails_4', ['div_integrationDetails_class': div_integrationDetails_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 32-Click on div integrationDetails CICDPipeline.png')

"Step 33: Click on div integrationDetails (AzureDevOpsPipelines)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationDetails', ['div_integrationDetails_nthChild': div_integrationDetails_nthChild, 'div_integrationDetails_nth': div_integrationDetails_nth, 'div_integrationDetails_internalHasText': div_integrationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 33-Click on div integrationDetails AzureDevOpsPipelines.png')

"Step 34: Click on input ReportFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/input_ReportFolder'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 34-Click on input ReportFolder.png')

"Step 35: Click on div RowContainer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_RowContainer2'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 35-Click on div RowContainer2.png')

"Step 36: Click on div ApiKeyControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_ApiKeyControl'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 36-Click on div ApiKeyControl.png')

"Step 37: Click on div CollapseWrapper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_CollapseWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 37-Click on div CollapseWrapper.png')

"Step 38: Click on div Docker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_Docker'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 38-Click on div Docker.png')

"Step 39: Click on pre CodeBlock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/pre_CodeBlock'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 39-Click on pre CodeBlock.png')

"Step 40: Click on link TestEnvironments -> Navigate to page '/team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 40-Click on link TestEnvironments - Navigate to page teamprojectagent.png')

"Step 41: Click on link TestCloudTunnels -> Navigate to page '/team/*/project/*/testCloudTunnel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_TestCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 41-Click on link TestCloudTunnels - Navigate to page teamprojecttestCloudTunnel.png')

"Step 42: Click on link CustomFields2 -> Navigate to page '/team/*/project/*/custom-fields'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/testCloudTunnel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_CustomFields2'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 42-Click on link CustomFields2 - Navigate to page teamprojectcustom-fields.png')

"Step 43: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 43-Click on button Settings.png')

"Step 44: Click on link OrganizationManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/link_OrganizationManagement'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 44-Click on link OrganizationManagement - Navigate to page .png')

"Step 45: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC157-Run Test Suites with Advanced Configuration Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}