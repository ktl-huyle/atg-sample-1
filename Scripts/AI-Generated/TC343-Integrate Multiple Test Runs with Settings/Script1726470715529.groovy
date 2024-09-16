import katalon.common.scheduleMultipleTestRuns
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on div historySubscribed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_historySubscribed'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 4-Click on div historySubscribed.png')

"Step 5: Click on div historySubscribed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_historySubscribed'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 5-Click on div historySubscribed.png')

"Step 6: Click on link showDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_showDetails'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 6-Click on link showDetails.png')

"Step 7: Click on div desktopBrowser0Sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_desktopBrowser0Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 7-Click on div desktopBrowser0Sessions.png')

"Step 8: Click on div desktopBrowser0Sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_desktopBrowser0Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 8-Click on div desktopBrowser0Sessions.png')

"Step 9: Click on div objectDetails (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_objectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_objectDetails', ['div_objectDetails_class': div_objectDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 9-Click on div objectDetails object3.png')

"Step 10: Click on link showDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_showDetails'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 10-Click on link showDetails.png')

"Step 11: Click on p sessionDetails (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails', ['p_sessionDetails_class': p_sessionDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 11-Click on p sessionDetails sessions.png')

"Step 12: Click on p sessionDetails (2Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/p_sessionDetails', ['p_sessionDetails_class': p_sessionDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 12-Click on p sessionDetails 2Sessions.png')

"Step 13: Click on div objectDetails (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_objectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_objectDetails', ['div_objectDetails_class': div_objectDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 13-Click on div objectDetails object3.png')

"Step 14: Schedule multiple test runs with server URL and environment settings."

scheduleMultipleTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on link ehsTestAutomationGit -> Navigate to page 'team/*/project/*/test-project/*/git/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_ehsTestAutomationGit'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 15-Click on link ehsTestAutomationGit - Navigate to page teamprojecttest-projectgitedit.png')

"Step 16: Click on link ehsTestAutomationGit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/link_ehsTestAutomationGit'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 16-Click on link ehsTestAutomationGit.png')

"Step 17: Click on div refsHeadsDevelopSri"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/div_refsHeadsDevelopSri'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 17-Click on div refsHeadsDevelopSri.png')

"Step 18: Click on div refsHeadsMainS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/div_refsHeadsMainS'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 18-Click on div refsHeadsMainS.png')

"Step 19: Click on button object -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 19-Click on button object - Navigate to page teamprojecttest-project.png')

"Step 20: Click on link testEnvironments -> Navigate to page 'team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 20-Click on link testEnvironments - Navigate to page teamprojectagent.png')

"Step 21: Click on link testCloud -> Navigate to page '/team/1515252/project/1534644/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_testCloud'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 21-Click on link testCloud - Navigate to page team1515252project1534644agenttest-cloud.png')

"Step 22: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/1515252/project/1534644/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojectagent_test_cloud/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 22-Click on div object.png')

"Step 23: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/1515252/project/1534644/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojectagent_test_cloud/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 23-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 24: Click on link schedules -> Navigate to page 'team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_schedules'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 24-Click on link schedules - Navigate to page teamprojectgrid.png')

"Step 25: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 25-Click on button scheduleTestRun.png')

"Step 26: Click on link executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 26-Click on link executions.png')

"Step 27: Enter input value in link schedules"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/link_schedules'), link_schedules)

WebUI.takeScreenshot(reportLocation + '/TC343/Step 27-Enter input value in link schedules.png')

"Step 28: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 28-Click on button scheduleTestRun.png')

"Step 29: Click on div name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_name'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 29-Click on div name.png')

"Step 30: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 30-Click on input name.png')

"Step 31: Click on div testSuitesAllFeaturesTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuitesAllFeaturesTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 31-Click on div testSuitesAllFeaturesTestSuite.png')

"Step 32: Click on div testSuiteId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteId'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 32-Click on div testSuiteId.png')

"Step 33: Click on div testSuiteId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteId'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 33-Click on div testSuiteId.png')

"Step 34: Click on button closeDialogButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_closeDialogButton'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 34-Click on button closeDialogButton.png')

"Step 35: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 35-Click on button scheduleTestRun.png')

"Step 36: Click on link clickHereToRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_clickHereToRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 36-Click on link clickHereToRefresh.png')

"Step 37: Click on link clickHereToRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_clickHereToRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 37-Click on link clickHereToRefresh.png')

"Step 38: Click on div testSuiteId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteId2'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 38-Click on div testSuiteId2.png')

"Step 39: Click on div testSuitesAllFeaturesTestSuite2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuitesAllFeaturesTestSuite2'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 39-Click on div testSuitesAllFeaturesTestSuite2.png')

"Step 40: Click on link clickHereToRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_clickHereToRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 40-Click on link clickHereToRefresh.png')

"Step 41: Click on link clickHereToRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_clickHereToRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 41-Click on link clickHereToRefresh.png')

"Step 42: Click on button testSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_testSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 42-Click on button testSuiteCollection.png')

"Step 43: Click on button testSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_testSuite'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 43-Click on button testSuite.png')

"Step 44: Click on div customSelectValueNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_customSelectValueNth0'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 44-Click on div customSelectValueNth0.png')

"Step 45: Click on div refsHeadsMainS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_refsHeadsMainS'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 45-Click on div refsHeadsMainS.png')

"Step 46: Click on div testSuiteId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuiteId3'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 46-Click on div testSuiteId3.png')

"Step 47: Click on div customSelectValueNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_customSelectValueNth0'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 47-Click on div customSelectValueNth0.png')

"Step 48: Click on div ehsTestAutomationGit -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_ehsTestAutomationGit'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 48-Click on div ehsTestAutomationGit - Navigate to page teamprojecttest-project.png')

"Step 49: Click on link ehsTestAutomationGit -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_ehsTestAutomationGit'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 49-Click on link ehsTestAutomationGit - Navigate to page teamprojecttest-project.png')

"Step 50: Click on button refreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_refreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 50-Click on button refreshScriptRepository.png')

"Step 51: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 51-Click on button object.png')

"Step 52: Click on button edit -> Navigate to page 'team/*/project/*/test-project/*/git/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_edit'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 52-Click on button edit - Navigate to page teamprojecttest-projectgitedit.png')

"Step 53: Click on link integrations -> Navigate to page 'team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/git/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/link_integrations'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 53-Click on link integrations - Navigate to page teamprojectintegrations.png')

"Step 54: Click on div integrationTools (codelessAutomationTool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools', ['div_integrationTools_internalRoleTreeitemName': div_integrationTools_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 54-Click on div integrationTools codelessAutomationTool.png')

"Step 55: Click on div integrationTools (codelessAutomationToolNth0)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools_1', ['div_integrationTools_class': div_integrationTools_class]))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 55-Click on div integrationTools codelessAutomationToolNth0.png')

"Step 56: Click on div integrationTools (ciCdPipeline)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationTools_1', ['div_integrationTools_class': div_integrationTools_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 56-Click on div integrationTools ciCdPipeline.png')

"Step 57: Click on div azureDevOpsPipelinesNth3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_azureDevOpsPipelinesNth3'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 57-Click on div azureDevOpsPipelinesNth3.png')

"Step 58: Click on link clickHereToRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_clickHereToRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 58-Click on link clickHereToRefresh.png')

"Step 59: Click on link clickHereToRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_clickHereToRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 59-Click on link clickHereToRefresh.png')

"Step 60: Click on div testSuiteId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_testSuiteId'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 60-Click on div testSuiteId.png')

"Step 61: Click on div testSuitesAllFeaturesTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/div_testSuitesAllFeaturesTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 61-Click on div testSuitesAllFeaturesTestSuite.png')

"Step 62: Click on link clickHereToRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_clickHereToRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 62-Click on link clickHereToRefresh.png')

"Step 63: Click on link clickHereToRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_clickHereToRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 63-Click on link clickHereToRefresh.png')

"Step 64: Click on link testEnvironments -> Navigate to page 'team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 64-Click on link testEnvironments - Navigate to page teamprojectagent.png')

"Step 65: Click on link testCloudTunnels -> Navigate to page 'team/*/project/*/testCloudTunnel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_testCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 65-Click on link testCloudTunnels - Navigate to page teamprojecttestCloudTunnel.png')

"Step 66: Click on link customFields -> Navigate to page 'team/*/project/*/custom-fields'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/testCloudTunnel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_customFields'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 66-Click on link customFields - Navigate to page teamprojectcustom-fields.png')

"Step 67: Click on button settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/button_settings'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 67-Click on button settings.png')

"Step 68: Click on link organizationManagementEditOrganizationAnd -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/link_organizationManagementEditOrganizationAnd'))

WebUI.takeScreenshot(reportLocation + '/TC343/Step 68-Click on link organizationManagementEditOrganizationAnd - Navigate to page .png')

"Step 69: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC343-Integrate Multiple Test Runs with Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}