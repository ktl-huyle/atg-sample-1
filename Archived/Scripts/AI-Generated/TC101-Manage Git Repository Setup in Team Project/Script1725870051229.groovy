import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.common.openAndUpdateFirstProject
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.configureTestSettingsAndRunSuites
import katalon.common.deleteItemsFromProject
import katalon.common.downloadAgentAndManageTestLinks

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link ojOracleJde -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ojOracleJde'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 2-Click on link ojOracleJde - Navigate to page teamproject.png')

"Step 3: Click on link viewAll -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_viewAll'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 3-Click on link viewAll - Navigate to page teamprojectreleases.png')

"Step 4: Click on link requirements2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_requirements_1'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 4-Click on link requirements2 - Navigate to page teamproject.png')

"Step 5: Click on link testRuns -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 5-Click on link testRuns - Navigate to page teamprojectreleases.png')

"Step 6: Click on link settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 6-Click on link settings - Navigate to page teamproject.png')

"Step 7: Click on link scriptRepositories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 7-Click on link scriptRepositories.png')

"Step 8: Click on link connectGitRepository -> Navigate to page 'team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_connectGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 8-Click on link connectGitRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 9: Click on div useKatalonsSample"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_useKatalonsSample'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 9-Click on div useKatalonsSample.png')

"Step 10: Click on div gitSetUpUseSample"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_gitSetUpUseSample'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 10-Click on div gitSetUpUseSample.png')

"Step 11: Click on div createAnewGit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_createAnewGit'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 11-Click on div createAnewGit.png')

"Step 12: Login into Application"

TrueTestScripts.login()

"Step 13: Click on link testEnvironments -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 13-Click on link testEnvironments - Navigate to page teamproject.png')

"Step 14: Click on link uploadReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_uploadReports'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 14-Click on link uploadReports.png')

"Step 15: Download agent and manage test environment links"

downloadAgentAndManageTestLinks.execute()

"Step 16: Click on link agentSetup -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_agentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 16-Click on link agentSetup - Navigate to page organizationsettingstest-environment-installation.png')

"Step 17: Click on link testEnvironments2 -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_testEnvironments2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 17-Click on link testEnvironments2 - Navigate to page organizationsettingsagent.png')

"Step 18: Click on link myAgent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_myAgent'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 18-Click on link myAgent.png')

"Step 19: Open and update first project in agent"

openAndUpdateFirstProject.execute()

"Step 20: Click on link agentSetup -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_agentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 20-Click on link agentSetup - Navigate to page organizationsettingstest-environment-installation.png')

"Step 21: Click on link scheduleYourTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_scheduleYourTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 21-Click on link scheduleYourTestRuns.png')

"Step 22: Configure test settings and run test suites"

configureTestSettingsAndRunSuites.execute(data_path_0, Integer.valueOf(index_0))

"Step 23: Click on link schedules"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_schedules'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 23-Click on link schedules.png')

"Step 24: Click on link tokenManager -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tokenManager'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 24-Click on link tokenManager - Navigate to page teamprojectgridplanjob.png')

"Step 25: Click on link configuration -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 25-Click on link configuration - Navigate to page teamprojectgridplanjob.png')

"Step 26: Click on link sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 26-Click on link sessions.png')

"Step 27: Click on link testRuns -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 27-Click on link testRuns - Navigate to page teamprojectgridplanjob.png')

"Step 28: Click on link calendar -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 28-Click on link calendar - Navigate to page teamproject.png')

"Step 29: Click on link testEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 29-Click on link testEnvironments.png')

"Step 30: Click on div object62"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object62'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 30-Click on div object62.png')

"Step 31: Click on link tokenManager -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tokenManager'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 31-Click on link tokenManager - Navigate to page teamprojectgridplanjob.png')

"Step 32: Click on button incompleteUntitledTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_incompleteUntitledTest'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 32-Click on button incompleteUntitledTest.png')

"Step 33: Click on div allTestRunsTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_allTestRunsTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 33-Click on div allTestRunsTestSuite.png')

"Step 34: Click on div untitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_edgeOpen1040Sstest'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 34-Click on div untitledTestRun.png')

"Step 35: Click on div customCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_customCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 35-Click on div customCheckbox.png')

"Step 36: Click on label customControlLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_customControlLabel'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 36-Click on label customControlLabel.png')

"Step 37: Click on th name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/th_name'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 37-Click on th name.png')

"Step 38: Click on button incompleteUntitledTest2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_incompleteUntitledTest2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 38-Click on button incompleteUntitledTest2.png')

"Step 39: Click on div allTestRunsTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_allTestRunsTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 39-Click on div allTestRunsTestSuite.png')

"Step 40: Click on link configuration -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 40-Click on link configuration - Navigate to page teamprojectgridplanjob.png')

"Step 41: Click on link sessions -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 41-Click on link sessions - Navigate to page teamprojectgridplanjob.png')

"Step 42: Click on link configuration -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 42-Click on link configuration - Navigate to page teamprojectgridplanjob.png')

"Step 43: Click on link myAgent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_myAgent'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 43-Click on link myAgent.png')

"Step 44: Open and update first project in agent"

openAndUpdateFirstProject.execute()

"Step 45: Click on button leftNavbarRoleButton -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_leftNavbarRoleButton'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 45-Click on button leftNavbarRoleButton - Navigate to page organizationhome.png')

"Step 46: Click on link 3827Cc -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_3827Cc'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 46-Click on link 3827Cc - Navigate to page teamprojectexecutions.png')

"Step 47: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 47-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 48: Click on link summary -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_summary'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 48-Click on link summary - Navigate to page teamprojectexecutions.png')

"Step 49: Click on div testRun1UntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testRun1UntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 49-Click on div testRun1UntitledTestRun.png')

"Step 50: Click on link requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_requirements'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 50-Click on link requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 51: Click on link testCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 51-Click on link testCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 52: Click on link visualTesting -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_visualTesting'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 52-Click on link visualTesting - Navigate to page teamproject.png')

"Step 53: Click on link scriptRepositories -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 53-Click on link scriptRepositories - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 54: Click on link testRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 54-Click on link testRuns - Navigate to page teamproject.png')

"Step 55: Click on link scriptRepositories -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 55-Click on link scriptRepositories - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 56: Click on item testCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/item_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 56-Click on item testCases.png')

"Step 57: Click on link testCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 57-Click on link testCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 58: Click on link defects -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_defects'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 58-Click on link defects - Navigate to page teamproject.png')

"Step 59: Click on link testCloudTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 59-Click on link testCloudTunnels.png')

"Step 60: Click on link fpFirstProject -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_fpFirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 60-Click on link fpFirstProject - Navigate to page teamprojectreleases.png')

"Step 61: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 61-Click on link tests - Navigate to page teamprojecttest-designtest-suites.png')

"Step 62: Click on span object4 -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 62-Click on span object4 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 63: Click on link settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 63-Click on link settings - Navigate to page teamproject.png')

"Step 64: Click on link testCloudTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 64-Click on link testCloudTunnels.png')

"Step 65: Click on link integrations"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_integrations'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 65-Click on link integrations.png')

"Step 66: Click on link testEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 66-Click on link testEnvironments.png')

"Step 67: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 67-Click on link reports.png')

"Step 68: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 68-Click on link dashboard - Navigate to page teamproject.png')

"Step 69: Click on link planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 69-Click on link planning - Navigate to page teamprojectreleases.png')

"Step 70: Click on link requirements2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_requirements_1'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 70-Click on link requirements2 - Navigate to page teamproject.png')

"Step 71: Click on link settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 71-Click on link settings.png')

"Step 72: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 72-Click on link reports.png')

"Step 73: Click on link scriptRepositories -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 73-Click on link scriptRepositories - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 74: Click on link testCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 74-Click on link testCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 75: Click on link defects -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_defects'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 75-Click on link defects - Navigate to page teamproject.png')

"Step 76: Click on link testCloudTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 76-Click on link testCloudTunnels.png')

"Step 77: Click on button oracleJde"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_oracleJde'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 77-Click on button oracleJde.png')

"Step 78: Click on link myOrganization01 -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_myOrganization01'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 78-Click on link myOrganization01 - Navigate to page organizationhome.png')

"Step 79: Click on link 3827Cc -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_3827Cc'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 79-Click on link 3827Cc - Navigate to page teamprojectexecutions.png')

"Step 80: Click on div testRun1UntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testRun1UntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 80-Click on div testRun1UntitledTestRun.png')

"Step 81: Click on link myAgent -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_myAgent'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 81-Click on link myAgent - Navigate to page organizationsettingsagent.png')

"Step 82: Click on link agentSetup -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_agentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 82-Click on link agentSetup - Navigate to page organizationsettingstest-environment-installation.png')

"Step 83: Click on link scheduleYourTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_scheduleYourTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 83-Click on link scheduleYourTestRuns.png')

"Step 84: Configure test settings and run test suites"

configureTestSettingsAndRunSuites.execute(data_path_1, Integer.valueOf(index_1))

"Step 85: Click on link schedules"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_schedules'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 85-Click on link schedules.png')

"Step 86: Click on link untitledTestRun -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_untitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 86-Click on link untitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 87: Click on div untitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_edgeOpen1040Sstest'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 87-Click on div untitledTestRun.png')

"Step 88: Click on button incompleteUntitledTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_incompleteUntitledTest'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 88-Click on button incompleteUntitledTest.png')

"Step 89: Click on link configuration -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 89-Click on link configuration - Navigate to page teamprojectgridplanjob.png')

"Step 90: Click on link sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 90-Click on link sessions.png')

"Step 91: Click on link configuration -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 91-Click on link configuration - Navigate to page teamprojectgridplanjob.png')

"Step 92: Click on link sessions -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 92-Click on link sessions - Navigate to page teamprojectgridplanjob.png')

"Step 93: Click on link configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 93-Click on link configuration.png')

"Step 94: Click on link testRuns -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 94-Click on link testRuns - Navigate to page teamprojectgridplanjob.png')

"Step 95: Click on link sessions -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 95-Click on link sessions - Navigate to page teamprojectgridplanjob.png')

"Step 96: Click on link schedules -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_schedules'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 96-Click on link schedules - Navigate to page teamproject.png')

"Step 97: Click on link scriptRepositories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 97-Click on link scriptRepositories.png')

"Step 98: Click on button month"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_month'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 98-Click on button month.png')

"Step 99: Click on div untitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_untitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 99-Click on div untitledTestRun.png')

"Step 100: Click on div untitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_untitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 100-Click on div untitledTestRun.png')

"Step 101: Click on link details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_details2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 101-Click on link details2 - Navigate to page teamprojectexecutions.png')

"Step 102: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 102-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 103: Click on link summary -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_summary'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 103-Click on link summary - Navigate to page teamprojectexecutions.png')

"Step 104: Click on link testCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 104-Click on link testCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 105: Click on link requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_requirements'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 105-Click on link requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 106: Click on link testRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 106-Click on link testRuns - Navigate to page teamproject.png')

"Step 107: Click on link settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 107-Click on link settings.png')

"Step 108: Click on link scriptRepositories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 108-Click on link scriptRepositories.png')

"Step 109: Click on link testEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 109-Click on link testEnvironments.png')

"Step 110: Click on link runFrequency -> Navigate to page 'team/*/project/*/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_runFrequency'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 110-Click on link runFrequency - Navigate to page teamprojectagenttest-cloud.png')

"Step 111: Click on link local -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_test_cloud/link_local'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 111-Click on link local - Navigate to page teamproject.png')

"Step 112: Click on link offlineMyAgent -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_offlineMyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 112-Click on link offlineMyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 113: Click on link agentSetup -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_agentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 113-Click on link agentSetup - Navigate to page organizationsettingstest-environment-installation.png')

"Step 114: Click on link scheduleYourTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_scheduleYourTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 114-Click on link scheduleYourTestRuns.png')

"Step 115: Configure test settings and run test suites"

configureTestSettingsAndRunSuites.execute(data_path_2, Integer.valueOf(index_2))

"Step 116: Click on div testRun1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testRun1'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 116-Click on div testRun1.png')

"Step 117: Click on div untitledTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_untitledTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 117-Click on div untitledTestRun2.png')

"Step 118: Click on div testRun1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testRun1'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 118-Click on div testRun1.png')

"Step 119: Click on div untitledTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_untitledTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 119-Click on div untitledTestRun2.png')

"Step 120: Click on div untitledTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_untitledTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 120-Click on div untitledTestRun2.png')

"Step 121: Click on link testEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 121-Click on link testEnvironments.png')

"Step 122: Click on button testRun1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_testRun1'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 122-Click on button testRun1.png')

"Step 123: Click on link tokenManager -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tokenManager'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 123-Click on link tokenManager - Navigate to page teamprojectgridplanjob.png')

"Step 124: Click on label customControlLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_customControlLabel'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 124-Click on label customControlLabel.png')

"Step 125: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 125-Click on button delete.png')

"Step 126: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_delete2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 126-Click on button delete2.png')

"Step 127: Click on link schedules -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_schedules'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 127-Click on link schedules - Navigate to page teamproject.png')

"Step 128: Click on link untitledTestRun2 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_untitledTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 128-Click on link untitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 129: Click on link configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 129-Click on link configuration.png')

"Step 130: Click on link sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 130-Click on link sessions.png')

"Step 131: Click on link configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 131-Click on link configuration.png')

"Step 132: Click on link testRuns -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 132-Click on link testRuns - Navigate to page teamprojectgridplanjob.png')

"Step 133: Click on label customControlLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_customControlLabel'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 133-Click on label customControlLabel.png')

"Step 134: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 134-Click on button delete.png')

"Step 135: Click on button delete2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_delete2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 135-Click on button delete2 - Navigate to page teamproject.png')

"Step 136: Click on link tokenManager -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tokenManager'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 136-Click on link tokenManager - Navigate to page teamprojectgridplanjob.png')

"Step 137: Click on link sessions -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 137-Click on link sessions - Navigate to page teamprojectgridplanjob.png')

"Step 138: Click on link configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_configuration'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 138-Click on link configuration.png')

"Step 139: Delete selected items from the project"

deleteItemsFromProject.execute(data_path_3, Integer.valueOf(index_3))

"Step 140: Click on link untitledTestRun -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_untitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 140-Click on link untitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 141: Click on link sessions -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 141-Click on link sessions - Navigate to page teamprojectgridplanjob.png')

"Step 142: Click on span failed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/span_failed'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 142-Click on span failed.png')

"Step 143: Delete selected items from the project"

deleteItemsFromProject.execute(data_path_4, Integer.valueOf(index_4))

"Step 144: Click on link scriptRepositories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 144-Click on link scriptRepositories.png')

"Step 145: Click on div untitledTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_untitledTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 145-Click on div untitledTestRun2.png')

"Step 146: Click on div untitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_untitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 146-Click on div untitledTestRun.png')

"Step 147: Click on div untitledTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_untitledTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 147-Click on div untitledTestRun2.png')

"Step 148: Click on div untitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_untitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 148-Click on div untitledTestRun.png')

"Step 149: Click on div infoSidebarHeaderCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_infoSidebarHeaderCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 149-Click on div infoSidebarHeaderCloseButton.png')

"Step 150: Click on link testEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 150-Click on link testEnvironments.png')

"Step 151: Click on div object62 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object62'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 151-Click on div object62 - Navigate to page .png')

"Step 152: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC101-Manage Git Repository Setup in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}