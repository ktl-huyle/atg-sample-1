import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.confirmDeleteAction
import truetest.common.openProjectAndUpdateDetails
import truetest.common.downloadAgentAndCopyLinks
import truetest.common.runTestSuiteWithAdvancedSettings

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link projectLinks (FPFirstProject2) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 2-Click on link projectLinks FPFirstProject2 - Navigate to page teamproject.png')

"Step 3: Click on link ViewAll -> Navigate to page '/team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewAll'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 3-Click on link ViewAll - Navigate to page teamprojectreleases.png')

"Step 4: Click on link Requirements3 -> Navigate to page '/team/*/project/*/requirements'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 4-Click on link Requirements3 - Navigate to page teamprojectrequirements.png')

"Step 5: Click on link Releases2 -> Navigate to page '/team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/link_Releases2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 5-Click on link Releases2 - Navigate to page teamprojectreleases.png')

"Step 6: Click on link Settings -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 6-Click on link Settings - Navigate to page teamprojectsettings.png')

"Step 7: Click on link ScriptRepositories6 -> Navigate to page '/team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_ScriptRepositories6'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 7-Click on link ScriptRepositories6 - Navigate to page teamprojecttest-project.png')

"Step 8: Click on link ConnectGitRepository -> Navigate to page '/team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_ConnectGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 8-Click on link ConnectGitRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 9: Click on div gitSetup (UseKatalonsSample)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup', ['div_gitSetup_nthChild': div_gitSetup_nthChild, 'div_gitSetup_dataTestid': div_gitSetup_dataTestid, 'div_gitSetup_internalHasText': div_gitSetup_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 9-Click on div gitSetup UseKatalonsSample.png')

"Step 10: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 10-Click on div object.png')

"Step 11: Click on div gitSetup (CreateNewGit)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup', ['div_gitSetup_nthChild': div_gitSetup_nthChild_1, 'div_gitSetup_dataTestid': div_gitSetup_dataTestid_1, 'div_gitSetup_internalHasText': div_gitSetup_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 11-Click on div gitSetup CreateNewGit.png')

"Step 12: Login into Application"

TrueTestScripts.login()

"Step 13: Click on link TestEnvironments3 -> Navigate to page '/team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_TestEnvironments3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 13-Click on link TestEnvironments3 - Navigate to page teamprojectagent.png')

"Step 14: Click on link CreateLocalTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_CreateLocalTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 14-Click on link CreateLocalTestEnvironment.png')

"Step 15: Download the agent and copy relevant setup links"

downloadAgentAndCopyLinks.execute()

"Step 16: Click on link AgentSetup3 -> Navigate to page '/organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 16-Click on link AgentSetup3 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 17: Click on link TestEnvironments2 -> Navigate to page '/organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_TestEnvironments2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 17-Click on link TestEnvironments2 - Navigate to page organizationsettingsagent.png')

"Step 18: Click on link agentSettings (MyAgent2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentSettings'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 18-Click on link agentSettings MyAgent2.png')

"Step 19: Open a project and update its details"

openProjectAndUpdateDetails.execute()

"Step 20: Click on link AgentSetup2 -> Navigate to page '/organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSetup2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 20-Click on link AgentSetup2 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 21: Click on link ScheduleYourTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleYourTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 21-Click on link ScheduleYourTestRuns.png')

"Step 22: Run a test suite with advanced configuration options"

runTestSuiteWithAdvancedSettings.execute(data_path_0, Integer.valueOf(index_0))

"Step 23: Click on link Schedules2 -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_Schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 23-Click on link Schedules2 - Navigate to page teamprojectgrid.png')

"Step 24: Click on link testRunLinks (UntitledTestRun2) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 24-Click on link testRunLinks UntitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 25: Click on link configurationLinks (Configuration4) -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 25-Click on link configurationLinks Configuration4 - Navigate to page teamprojectgridplanjobsummary.png')

"Step 26: Click on link Sessions2 -> Navigate to page '/team/*/project/*/grid/plan/*/job/session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/link_Sessions2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 26-Click on link Sessions2 - Navigate to page teamprojectgridplanjobsession.png')

"Step 27: Click on link configurationLinks (TestRuns) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_session/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_session/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_1, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 27-Click on link configurationLinks TestRuns - Navigate to page teamprojectgridplanjob.png')

"Step 28: Click on link Calendar3 -> Navigate to page '/team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Calendar3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 28-Click on link Calendar3 - Navigate to page teamprojecttest-planning.png')

"Step 29: Click on link Schedules3 -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_Schedules3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 29-Click on link Schedules3 - Navigate to page teamprojectgrid.png')

"Step 30: Click on div scheduleDetails (SchedulesDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/div_scheduleDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/div_scheduleDetails', ['div_scheduleDetails_internalText': div_scheduleDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 30-Click on div scheduleDetails SchedulesDetails.png')

"Step 31: Click on link testRunLinks (UntitledTestRun2) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 31-Click on link testRunLinks UntitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 32: Click on button IncompleteUntitledTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteUntitledTest'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 32-Click on button IncompleteUntitledTest.png')

"Step 33: Click on div TestRunsTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_TestRunsTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 33-Click on div TestRunsTestSuite.png')

"Step 34: Click on div testRunDetails (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails', ['div_testRunDetails_internalText': div_testRunDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 34-Click on div testRunDetails UntitledTestRun.png')

"Step 35: Click on div CustomCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_CustomCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 35-Click on div CustomCheckbox.png')

"Step 36: Click on label Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_Object'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 36-Click on label Object.png')

"Step 37: Click on th Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/th_Name'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 37-Click on th Name.png')

"Step 38: Click on button IncompleteUntitledTest2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteUntitledTest2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 38-Click on button IncompleteUntitledTest2.png')

"Step 39: Click on div TestRunsTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_TestRunsTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 39-Click on div TestRunsTestSuite.png')

"Step 40: Click on link configurationLinks (Configuration4) -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_2, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 40-Click on link configurationLinks Configuration4 - Navigate to page teamprojectgridplanjobsummary.png')

"Step 41: Click on link Sessions2 -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/link_Sessions2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 41-Click on link Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 42: Click on link configurationLinks (Configuration4) -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_3, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 42-Click on link configurationLinks Configuration4 - Navigate to page teamprojectgridplanjobsummary.png')

"Step 43: Click on link MyAgent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/link_MyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 43-Click on link MyAgent.png')

"Step 44: Open a project and update its details"

openProjectAndUpdateDetails.execute()

"Step 45: Click on button Object -> Navigate to page '/organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Object'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 45-Click on button Object - Navigate to page organizationhome.png')

"Step 46: Click on link testExecutionLinks (FPTestRun) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionLinks', ['link_testExecutionLinks_internalRoleLinkName': link_testExecutionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 46-Click on link testExecutionLinks FPTestRun - Navigate to page teamprojectexecutions.png')

"Step 47: Click on link TestResults10 -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults10'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 47-Click on link TestResults10 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 48: Click on link Summary4 -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary4'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 48-Click on link Summary4 - Navigate to page teamprojectexecutions.png')

"Step 49: Click on div TestRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 49-Click on div TestRunDetails.png')

"Step 50: Click on link Requirements2 -> Navigate to page '/team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Requirements2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 50-Click on link Requirements2 - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 51: Click on link TestCases2 -> Navigate to page '/team/*/project/*/test-reports/test-maintenance/active'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 51-Click on link TestCases2 - Navigate to page teamprojecttest-reportstest-maintenanceactive.png')

"Step 52: Click on link VisualTesting -> Navigate to page '/team/*/project/*/katalon-eyes'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/link_VisualTesting'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 52-Click on link VisualTesting - Navigate to page teamprojectkatalon-eyes.png')

"Step 53: Click on link Requirements -> Navigate to page '/team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/katalon-eyes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_katalon_eyes/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 53-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 54: Click on link TestRuns -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 54-Click on link TestRuns - Navigate to page teamprojectoverview.png')

"Step 55: Click on link Requirements -> Navigate to page '/team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 55-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 56: Click on item TestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/item_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 56-Click on item TestCases.png')

"Step 57: Click on link TestCases2 -> Navigate to page '/team/*/project/*/test-reports/test-maintenance/active'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 57-Click on link TestCases2 - Navigate to page teamprojecttest-reportstest-maintenanceactive.png')

"Step 58: Click on link Defects2 -> Navigate to page '/team/*/project/*/defects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/link_Defects2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 58-Click on link Defects2 - Navigate to page teamprojectdefects.png')

"Step 59: Click on link VisualTesting2 -> Navigate to page '/team/*/project/*/katalon-eyes'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/defects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_defects/link_VisualTesting2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 59-Click on link VisualTesting2 - Navigate to page teamprojectkatalon-eyes.png')

"Step 60: Click on link FPFirstProject -> Navigate to page '/team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/katalon-eyes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_katalon_eyes/link_FPFirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 60-Click on link FPFirstProject - Navigate to page teamprojectreleases.png')

"Step 61: Click on link Tests6 -> Navigate to page '/team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests6'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 61-Click on link Tests6 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 62: Click on span Object3 -> Navigate to page '/team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 62-Click on span Object3 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 63: Click on link Settings -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 63-Click on link Settings - Navigate to page teamprojectsettings.png')

"Step 64: Click on link TestCloudTunnels -> Navigate to page '/team/*/project/*/testCloudTunnel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_TestCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 64-Click on link TestCloudTunnels - Navigate to page teamprojecttestCloudTunnel.png')

"Step 65: Click on link Integrations2 -> Navigate to page '/team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/testCloudTunnel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_Integrations2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 65-Click on link Integrations2 - Navigate to page teamprojectintegrations.png')

"Step 66: Click on link TestEnvironments2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_TestEnvironments2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 66-Click on link TestEnvironments2.png')

"Step 67: Click on link Reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 67-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 68: Click on link Dashboard2 -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 68-Click on link Dashboard2 - Navigate to page teamproject.png')

"Step 69: Click on link Planning4 -> Navigate to page '/team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning4'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 69-Click on link Planning4 - Navigate to page teamprojectreleases.png')

"Step 70: Click on link Requirements3 -> Navigate to page '/team/*/project/*/requirements'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 70-Click on link Requirements3 - Navigate to page teamprojectrequirements.png')

"Step 71: Click on link Settings -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 71-Click on link Settings - Navigate to page teamprojectsettings.png')

"Step 72: Click on link Reports2 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 72-Click on link Reports2 - Navigate to page teamprojectoverview.png')

"Step 73: Click on link Requirements -> Navigate to page '/team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 73-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 74: Click on link TestCases2 -> Navigate to page '/team/*/project/*/test-reports/test-maintenance/active'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 74-Click on link TestCases2 - Navigate to page teamprojecttest-reportstest-maintenanceactive.png')

"Step 75: Click on link Defects2 -> Navigate to page '/team/*/project/*/defects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/link_Defects2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 75-Click on link Defects2 - Navigate to page teamprojectdefects.png')

"Step 76: Click on link VisualTesting2 -> Navigate to page '/team/*/project/*/katalon-eyes'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/defects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_defects/link_VisualTesting2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 76-Click on link VisualTesting2 - Navigate to page teamprojectkatalon-eyes.png')

"Step 77: Click on button FirstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/katalon-eyes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_katalon_eyes/button_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 77-Click on button FirstProject.png')

"Step 78: Click on link MyOrganization -> Navigate to page '/organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/katalon-eyes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_katalon_eyes/link_MyOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 78-Click on link MyOrganization - Navigate to page organizationhome.png')

"Step 79: Click on link testExecutionLinks (FPTestRun2) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionLinks', ['link_testExecutionLinks_internalRoleLinkName': link_testExecutionLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 79-Click on link testExecutionLinks FPTestRun2 - Navigate to page teamprojectexecutions.png')

"Step 80: Click on div TestRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 80-Click on div TestRunDetails.png')

"Step 81: Click on link MyAgent -> Navigate to page '/organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_MyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 81-Click on link MyAgent - Navigate to page organizationsettingsagent.png')

"Step 82: Click on link AgentSetup3 -> Navigate to page '/organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 82-Click on link AgentSetup3 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 83: Click on link ScheduleYourTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleYourTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 83-Click on link ScheduleYourTestRuns.png')

"Step 84: Run a test suite with advanced configuration options"

runTestSuiteWithAdvancedSettings.execute(data_path_1, Integer.valueOf(index_1))

"Step 85: Click on link Schedules2 -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_Schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 85-Click on link Schedules2 - Navigate to page teamprojectgrid.png')

"Step 86: Click on link testRunLinks (UntitledTestRun3) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 86-Click on link testRunLinks UntitledTestRun3 - Navigate to page teamprojectgridplanjob.png')

"Step 87: Click on div testRunDetails (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails', ['div_testRunDetails_internalText': div_testRunDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 87-Click on div testRunDetails UntitledTestRun.png')

"Step 88: Click on button IncompleteUntitledTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteUntitledTest'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 88-Click on button IncompleteUntitledTest.png')

"Step 89: Click on link configurationLinks (Configuration4) -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_4, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 89-Click on link configurationLinks Configuration4 - Navigate to page teamprojectgridplanjobsummary.png')

"Step 90: Click on link Sessions2 -> Navigate to page '/team/*/project/*/grid/plan/*/job/session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/link_Sessions2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 90-Click on link Sessions2 - Navigate to page teamprojectgridplanjobsession.png')

"Step 91: Click on link configurationLinks (Configuration2) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_session/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_session/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_5, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 91-Click on link configurationLinks Configuration2 - Navigate to page teamprojectgridplanjob.png')

"Step 92: Click on link Sessions -> Navigate to page '/team/*/project/*/grid/plan/*/job/session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 92-Click on link Sessions - Navigate to page teamprojectgridplanjobsession.png')

"Step 93: Click on link configurationLinks (Configuration2) -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_session/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_session/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_6, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 93-Click on link configurationLinks Configuration2 - Navigate to page teamprojectgridplanjobsummary.png')

"Step 94: Click on link testRunLinks (TestRuns2) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_summary/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_summary/link_testRunLinks', ['link_testRunLinks_nthChild': link_testRunLinks_nthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 94-Click on link testRunLinks TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 95: Click on link Sessions -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 95-Click on link Sessions - Navigate to page teamprojectgridplanjobsummary.png')

"Step 96: Click on link Schedules2 -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/link_Schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 96-Click on link Schedules2 - Navigate to page teamprojectgrid.png')

"Step 97: Click on link Calendar -> Navigate to page '/team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Calendar'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 97-Click on link Calendar - Navigate to page teamprojecttest-planning.png')

"Step 98: Click on button Month"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_Month'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 98-Click on button Month.png')

"Step 99: Click on div testRunDetails (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class, 'div_testRunDetails_internalText': div_testRunDetails_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 99-Click on div testRunDetails UntitledTestRun.png')

"Step 100: Click on div testRunDetails (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 100-Click on div testRunDetails UntitledTestRun2.png')

"Step 101: Click on link Details2 -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 101-Click on link Details2 - Navigate to page teamprojectexecutions.png')

"Step 102: Click on link TestResults10 -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults10'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 102-Click on link TestResults10 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 103: Click on link Summary4 -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary4'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 103-Click on link Summary4 - Navigate to page teamprojectexecutions.png')

"Step 104: Click on link TestCases2 -> Navigate to page '/team/*/project/*/test-reports/test-maintenance/active'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 104-Click on link TestCases2 - Navigate to page teamprojecttest-reportstest-maintenanceactive.png')

"Step 105: Click on link Requirements -> Navigate to page '/team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 105-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 106: Click on link TestRuns -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 106-Click on link TestRuns - Navigate to page teamprojectoverview.png')

"Step 107: Click on link Settings2 -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 107-Click on link Settings2 - Navigate to page teamprojectsettings.png')

"Step 108: Click on link ScriptRepositories6 -> Navigate to page '/team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_ScriptRepositories6'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 108-Click on link ScriptRepositories6 - Navigate to page teamprojecttest-project.png')

"Step 109: Click on link TestEnvironments3 -> Navigate to page '/team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_TestEnvironments3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 109-Click on link TestEnvironments3 - Navigate to page teamprojectagent.png')

"Step 110: Click on link TestCloud -> Navigate to page '/team/*/project/*/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_TestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 110-Click on link TestCloud - Navigate to page teamprojectagenttest-cloud.png')

"Step 111: Click on link Local -> Navigate to page '/team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_test_cloud/link_Local'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 111-Click on link Local - Navigate to page teamprojectagent.png')

"Step 112: Click on link agentLinks (MyAgent) -> Navigate to page '/organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent/link_agentLinks'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 112-Click on link agentLinks MyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 113: Click on link AgentSetup2 -> Navigate to page '/organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSetup2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 113-Click on link AgentSetup2 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 114: Click on link ScheduleYourTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleYourTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 114-Click on link ScheduleYourTestRuns.png')

"Step 115: Run a test suite with advanced configuration options"

runTestSuiteWithAdvancedSettings.execute(data_path_2, Integer.valueOf(index_2))

"Step 116: Click on div testRunDetails (TestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_2, 'div_testRunDetails_internalText': div_testRunDetails_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 116-Click on div testRunDetails TestRun2.png')

"Step 117: Click on div testRunDetails (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_3, 'div_testRunDetails_internalText': div_testRunDetails_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 117-Click on div testRunDetails UntitledTestRun3.png')

"Step 118: Click on div testRunDetails (TestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_4, 'div_testRunDetails_internalText': div_testRunDetails_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 118-Click on div testRunDetails TestRun2.png')

"Step 119: Click on div testRunDetails (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_5, 'div_testRunDetails_internalText': div_testRunDetails_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 119-Click on div testRunDetails UntitledTestRun3.png')

"Step 120: Click on div testRunDetails (UntitledTestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_6]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 120-Click on div testRunDetails UntitledTestRun4.png')

"Step 121: Click on link Schedules3 -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_Schedules3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 121-Click on link Schedules3 - Navigate to page teamprojectgrid.png')

"Step 122: Click on button testRunActions (TestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/button_testRunActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/button_testRunActions', ['button_testRunActions_trNthChild': button_testRunActions_trNthChild, 'button_testRunActions_internalRoleRowName': button_testRunActions_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 122-Click on button testRunActions TestRun.png')

"Step 123: Click on link testRunLinks (UntitledTestRun4) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild_1, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 123-Click on link testRunLinks UntitledTestRun4 - Navigate to page teamprojectgridplanjob.png')

"Step 124: Click on label Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_Object'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 124-Click on label Object.png')

"Step 125: Click on button gridActions (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions', ['button_gridActions_internalRoleButtonName': button_gridActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 125-Click on button gridActions Delete.png')

"Step 126: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 126-Click on button Delete2.png')

"Step 127: Click on link Schedules2 -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 127-Click on link Schedules2 - Navigate to page teamprojectgrid.png')

"Step 128: Click on link UntitledTestRun5 -> Navigate to page '/team/*/project/*/grid/plan/*/job/session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_UntitledTestRun5'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 128-Click on link UntitledTestRun5 - Navigate to page teamprojectgridplanjobsession.png')

"Step 129: Click on link configurationLinks (Configuration2) -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_session/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_session/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_7, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 129-Click on link configurationLinks Configuration2 - Navigate to page teamprojectgridplanjobsummary.png')

"Step 130: Click on link Sessions2 -> Navigate to page '/team/*/project/*/grid/plan/*/job/session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_summary/link_Sessions2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 130-Click on link Sessions2 - Navigate to page teamprojectgridplanjobsession.png')

"Step 131: Click on link configurationLinks (Configuration2) -> Navigate to page '/team/*/project/*/grid/plan/*/job/summary'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_session/link_configurationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_session/link_configurationLinks', ['link_configurationLinks_nthChild': link_configurationLinks_nthChild_8, 'link_configurationLinks_internalRoleLinkName': link_configurationLinks_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 131-Click on link configurationLinks Configuration2 - Navigate to page teamprojectgridplanjobsummary.png')

"Step 132: Click on link testRunLinks (TestRuns2) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/summary?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_summary/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job_summary/link_testRunLinks', ['link_testRunLinks_nthChild': link_testRunLinks_nthChild_1, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 132-Click on link testRunLinks TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 133: Click on label Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_Object'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 133-Click on label Object.png')

"Step 134: Click on button gridActions (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions', ['button_gridActions_internalRoleButtonName': button_gridActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 134-Click on button gridActions Delete.png')

"Step 135: Click on button Delete2 -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 135-Click on button Delete2 - Navigate to page teamprojectgrid.png')

"Step 136: Click on link testRunLinks (UntitledTestRun4) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild_2, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 136-Click on link testRunLinks UntitledTestRun4 - Navigate to page teamprojectgridplanjob.png')

"Step 137: Click on link Sessions2 -> Navigate to page '/team/*/project/*/grid/plan/*/job/session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Sessions2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 137-Click on link Sessions2 - Navigate to page teamprojectgridplanjobsession.png')

"Step 138: Click on link Configuration3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_session/link_Configuration3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 138-Click on link Configuration3.png')

"Step 139: Confirm deletion of an item with a specified number"

confirmDeleteAction.execute(data_path_3, Integer.valueOf(index_3))

"Step 140: Click on link testRunLinks (UntitledTestRun3) -> Navigate to page '/team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild_3, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 140-Click on link testRunLinks UntitledTestRun3 - Navigate to page teamprojectgridplanjob.png')

"Step 141: Click on link Sessions -> Navigate to page '/team/*/project/*/grid/plan/*/job/session'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 141-Click on link Sessions - Navigate to page teamprojectgridplanjobsession.png')

"Step 142: Click on span FailedImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_session/span_FailedImage'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 142-Click on span FailedImage.png')

"Step 143: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_session/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 143-Click on button Delete.png')

"Step 144: Click on input NumberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_session/input_NumberInput'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 144-Click on input NumberInput.png')

"Step 145: Click on button Delete2 -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/session?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job_session/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 145-Click on button Delete2 - Navigate to page teamprojectgrid.png')

"Step 146: Click on link Calendar -> Navigate to page '/team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_Calendar'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 146-Click on link Calendar - Navigate to page teamprojecttest-planning.png')

"Step 147: Click on div testRunDetails (TestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_7, 'div_testRunDetails_internalText': div_testRunDetails_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 147-Click on div testRunDetails TestRun3.png')

"Step 148: Click on div testRunDetails (TestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_8, 'div_testRunDetails_internalText': div_testRunDetails_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 148-Click on div testRunDetails TestRun4.png')

"Step 149: Click on div testRunDetails (TestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_9, 'div_testRunDetails_internalText': div_testRunDetails_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 149-Click on div testRunDetails TestRun3.png')

"Step 150: Click on div testRunDetails (TestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_10, 'div_testRunDetails_internalText': div_testRunDetails_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 150-Click on div testRunDetails TestRun4.png')

"Step 151: Click on div InfoSidebarCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_InfoSidebarCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 151-Click on div InfoSidebarCloseButton.png')

"Step 152: Click on link Schedules3 -> Navigate to page '/team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_Schedules3'))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 152-Click on link Schedules3 - Navigate to page teamprojectgrid.png')

"Step 153: Click on div scheduleDetails (SchedulesDetails2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/div_scheduleDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/div_scheduleDetails', ['div_scheduleDetails_internalText': div_scheduleDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC200/Step 153-Click on div scheduleDetails SchedulesDetails2 - Navigate to page .png')

"Step 154: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC200-Manage and Delete Test Runs in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}