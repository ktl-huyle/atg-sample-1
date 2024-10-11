import truetest.common.scheduleAndRunTestDemo
import truetest.custom.TrueTestScripts
import truetest.common.openAndUpdateSelectedProjects
import internal.GlobalVariable
import truetest.common.deleteItemsFromExecutionList
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link projectNavigation (FPFirstProject3) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName, 'link_projectNavigation_project_id': link_projectNavigation_project_id, 'link_projectNavigation_team_id': link_projectNavigation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 2-Click on link projectNavigation FPFirstProject3 - Navigate to page teamproject.png')

"Step 3: Click on link ViewAll -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewAll'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 3-Click on link ViewAll - Navigate to page teamprojectreleases.png')

"Step 4: Click on link Requirements3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements3'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 4-Click on link Requirements3 - Navigate to page teamproject.png')

"Step 5: Click on link Releases -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Releases'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 5-Click on link Releases - Navigate to page teamprojectreleases.png')

"Step 6: Click on link settings (Settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases/link_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases/link_settings', ['link_settings_nthChild': link_settings_nthChild, 'link_settings_internalRoleLinkName': link_settings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 6-Click on link settings Settings - Navigate to page teamproject.png')

"Step 7: Click on link projectNavigation (ScriptRepositories5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 7-Click on link projectNavigation ScriptRepositories5.png')

"Step 8: Click on link ConnectGitRepository -> Navigate to page 'team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConnectGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 8-Click on link ConnectGitRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 9: Click on div gitActions (UseKatalonsSample)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitActions', ['div_gitActions_nthChild': div_gitActions_nthChild, 'div_gitActions_internalHasText': div_gitActions_internalHasText, 'div_gitActions_dataTestid': div_gitActions_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 9-Click on div gitActions UseKatalonsSample.png')

"Step 10: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 10-Click on div object.png')

"Step 11: Click on div gitActions (CreateNewGit)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitActions', ['div_gitActions_nthChild': div_gitActions_nthChild_1, 'div_gitActions_internalHasText': div_gitActions_internalHasText_1, 'div_gitActions_dataTestid': div_gitActions_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 11-Click on div gitActions CreateNewGit.png')

"Step 12: Login into Application"

TrueTestScripts.login()

"Step 13: Click on link TestEnvironments -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 13-Click on link TestEnvironments - Navigate to page teamproject.png')

"Step 14: Click on link CreateLocalTestEnvironment -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_CreateLocalTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 14-Click on link CreateLocalTestEnvironment - Navigate to page organizationsettingstest-environment-installation.png')

"Step 15: Click on button DownloadAgent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/button_DownloadAgent'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 15-Click on button DownloadAgent.png')

"Step 16: Click on link Copy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy_1'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 16-Click on link Copy.png')

"Step 17: Click on link Copy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 17-Click on link Copy2.png')

"Step 18: Click on link Copy3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 18-Click on link Copy3.png')

"Step 19: Click on span StepConnector"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/span_StepConnector'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 19-Click on span StepConnector.png')

"Step 20: Click on link Copy3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 20-Click on link Copy3.png')

"Step 21: Click on link Copy4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy4'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 21-Click on link Copy4.png')

"Step 22: Click on link TestEnvironments -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_TestEnvironments_1'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 22-Click on link TestEnvironments - Navigate to page organizationsettingsagent.png')

"Step 23: Click on link AgentSetup2 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 23-Click on link AgentSetup2 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 24: Click on link TestEnvironments -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_TestEnvironments_1'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 24-Click on link TestEnvironments - Navigate to page organizationsettingsagent.png')

"Step 25: Click on link agentNavigation (MyAgent)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentNavigation', ['link_agentNavigation_local_id': link_agentNavigation_local_id, 'link_agentNavigation_organization_id': link_agentNavigation_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 25-Click on link agentNavigation MyAgent.png')

"Step 26: Open and update selected projects in the agent details"

openAndUpdateSelectedProjects.execute()

"Step 27: Click on link AgentSetup -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSetup_1'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 27-Click on link AgentSetup - Navigate to page organizationsettingstest-environment-installation.png')

"Step 28: Click on link ScheduleYourTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleYourTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 28-Click on link ScheduleYourTestRuns.png')

"Step 29: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_0, Integer.valueOf(index_0))

"Step 30: Click on link projectNavigation (Schedules2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_1, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 30-Click on link projectNavigation Schedules2.png')

"Step 31: Click on link dynamicObject (UntitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 31-Click on link dynamicObject UntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 32: Click on link configuration (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName, 'link_configuration_team_id': link_configuration_team_id, 'link_configuration_project_id': link_configuration_project_id, 'link_configuration_job_id': link_configuration_job_id, 'link_configuration_plan_id': link_configuration_plan_id]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 32-Click on link configuration Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 33: Click on link configuration (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_1, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_1, 'link_configuration_team_id': link_configuration_team_id_1, 'link_configuration_project_id': link_configuration_project_id_1, 'link_configuration_job_id': link_configuration_job_id_1, 'link_configuration_plan_id': link_configuration_plan_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 33-Click on link configuration Sessions2.png')

"Step 34: Click on link testRunNavigation (TestRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunNavigation', ['link_testRunNavigation_nthChild': link_testRunNavigation_nthChild, 'link_testRunNavigation_internalRoleLinkName': link_testRunNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 34-Click on link testRunNavigation TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 35: Click on link scheduleNavigation (Calendar2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleNavigation', ['link_scheduleNavigation_nthChild': link_scheduleNavigation_nthChild, 'link_scheduleNavigation_internalRoleLinkName': link_scheduleNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 35-Click on link scheduleNavigation Calendar2 - Navigate to page teamproject.png')

"Step 36: Click on link projectNavigation (Schedules3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_2, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 36-Click on link projectNavigation Schedules3.png')

"Step 37: Click on div dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1', ['div_dynamicObject_internalText': div_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 37-Click on div dynamicObject object3.png')

"Step 38: Click on link dynamicObject (UntitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 38-Click on link dynamicObject UntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 39: Click on button IncompleteUntitledTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteUntitledTest'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 39-Click on button IncompleteUntitledTest.png')

"Step 40: Click on div TestRunsTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_TestRunsTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 40-Click on div TestRunsTestSuite.png')

"Step 41: Click on div testRun (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRun', ['div_testRun_internalText': div_testRun_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 41-Click on div testRun UntitledTestRun.png')

"Step 42: Click on div CustomCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_CustomCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 42-Click on div CustomCheckbox.png')

"Step 43: Click on label Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_Object'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 43-Click on label Object.png')

"Step 44: Click on th Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/th_Name'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 44-Click on th Name.png')

"Step 45: Click on button IncompleteUntitledTest2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteUntitledTest2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 45-Click on button IncompleteUntitledTest2.png')

"Step 46: Click on div TestRunsTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_TestRunsTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 46-Click on div TestRunsTestSuite.png')

"Step 47: Click on link configuration (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_2, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_2, 'link_configuration_team_id': link_configuration_team_id_2, 'link_configuration_project_id': link_configuration_project_id_2, 'link_configuration_job_id': link_configuration_job_id_2, 'link_configuration_plan_id': link_configuration_plan_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 47-Click on link configuration Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 48: Click on link configuration (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_3, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_3, 'link_configuration_team_id': link_configuration_team_id_3, 'link_configuration_project_id': link_configuration_project_id_3, 'link_configuration_job_id': link_configuration_job_id_3, 'link_configuration_plan_id': link_configuration_plan_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 48-Click on link configuration Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 49: Click on link configuration (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_4, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_4, 'link_configuration_team_id': link_configuration_team_id_4, 'link_configuration_project_id': link_configuration_project_id_4, 'link_configuration_job_id': link_configuration_job_id_4, 'link_configuration_plan_id': link_configuration_plan_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 49-Click on link configuration Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 50: Click on link MyAgent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_MyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 50-Click on link MyAgent.png')

"Step 51: Open and update selected projects in the agent details"

openAndUpdateSelectedProjects.execute()

"Step 52: Click on button Object -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Object'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 52-Click on button Object - Navigate to page organizationhome.png')

"Step 53: Click on link testRunDetails (UntitledTestRun) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRunDetails', ['link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName, 'link_testRunDetails_executions_id': link_testRunDetails_executions_id, 'link_testRunDetails_team_id': link_testRunDetails_team_id, 'link_testRunDetails_project_id': link_testRunDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 53-Click on link testRunDetails UntitledTestRun - Navigate to page teamprojectexecutions.png')

"Step 54: Click on link TestResults10 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults10'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 54-Click on link TestResults10 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 55: Click on link Summary4 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary4'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 55-Click on link Summary4 - Navigate to page teamprojectexecutions.png')

"Step 56: Click on div TestRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 56-Click on div TestRunDetails.png')

"Step 57: Click on link Requirements2 -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Requirements2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 57-Click on link Requirements2 - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 58: Click on link TestCases2 -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 58-Click on link TestCases2 - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 59: Click on link defectNavigation (VisualTesting) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectNavigation', ['link_defectNavigation_internalRoleLinkName': link_defectNavigation_internalRoleLinkName, 'link_defectNavigation_path_param_5': link_defectNavigation_path_param_5, 'link_defectNavigation_project_id': link_defectNavigation_project_id, 'link_defectNavigation_team_id': link_defectNavigation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 59-Click on link defectNavigation VisualTesting - Navigate to page teamproject.png')

"Step 60: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 60-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 61: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 61-Click on link TestRuns - Navigate to page teamproject.png')

"Step 62: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 62-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 63: Click on item TestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/item_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 63-Click on item TestCases.png')

"Step 64: Click on link TestCases2 -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 64-Click on link TestCases2 - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 65: Click on link defectNavigation (Defects2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectNavigation', ['link_defectNavigation_internalRoleLinkName': link_defectNavigation_internalRoleLinkName_1, 'link_defectNavigation_path_param_5': link_defectNavigation_path_param_5_1, 'link_defectNavigation_project_id': link_defectNavigation_project_id_1, 'link_defectNavigation_team_id': link_defectNavigation_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 65-Click on link defectNavigation Defects2 - Navigate to page teamproject.png')

"Step 66: Click on link projectNavigation (VisualTesting3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 66-Click on link projectNavigation VisualTesting3.png')

"Step 67: Click on link FPFirstProject -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_FPFirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 67-Click on link FPFirstProject - Navigate to page teamprojectreleases.png')

"Step 68: Click on link Tests5 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests5'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 68-Click on link Tests5 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 69: Click on span Object2 -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_Object2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 69-Click on span Object2 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 70: Click on link settings (Settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_settings', ['link_settings_internalRoleLinkName': link_settings_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 70-Click on link settings Settings - Navigate to page teamproject.png')

"Step 71: Click on link projectNavigation (TestCloudTunnels4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_3, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 71-Click on link projectNavigation TestCloudTunnels4.png')

"Step 72: Click on link projectNavigation (Integrations3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_4, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 72-Click on link projectNavigation Integrations3.png')

"Step 73: Click on link projectNavigation (TestEnvironments4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_5, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 73-Click on link projectNavigation TestEnvironments4.png')

"Step 74: Click on link Reports10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports10'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 74-Click on link Reports10.png')

"Step 75: Click on link Dashboard4 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard4'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 75-Click on link Dashboard4 - Navigate to page teamproject.png')

"Step 76: Click on link Planning6 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning6'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 76-Click on link Planning6 - Navigate to page teamprojectreleases.png')

"Step 77: Click on link Requirements3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements3'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 77-Click on link Requirements3 - Navigate to page teamproject.png')

"Step 78: Click on link Settings4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings4'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 78-Click on link Settings4.png')

"Step 79: Click on link Reports10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports10'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 79-Click on link Reports10.png')

"Step 80: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 80-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 81: Click on link TestCases2 -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 81-Click on link TestCases2 - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 82: Click on link defectNavigation (Defects2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectNavigation', ['link_defectNavigation_internalRoleLinkName': link_defectNavigation_internalRoleLinkName_2, 'link_defectNavigation_path_param_5': link_defectNavigation_path_param_5_2, 'link_defectNavigation_project_id': link_defectNavigation_project_id_2, 'link_defectNavigation_team_id': link_defectNavigation_team_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 82-Click on link defectNavigation Defects2 - Navigate to page teamproject.png')

"Step 83: Click on link projectNavigation (VisualTesting3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 83-Click on link projectNavigation VisualTesting3.png')

"Step 84: Click on button projectAction (FirstProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectAction', ['button_projectAction_internalRoleButtonName': button_projectAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 84-Click on button projectAction FirstProject.png')

"Step 85: Click on link MyOrganization -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_MyOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 85-Click on link MyOrganization - Navigate to page organizationhome.png')

"Step 86: Click on link testRunDetails (UntitledTestRun2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRunDetails', ['link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName_1, 'link_testRunDetails_executions_id': link_testRunDetails_executions_id_1, 'link_testRunDetails_team_id': link_testRunDetails_team_id_1, 'link_testRunDetails_project_id': link_testRunDetails_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 86-Click on link testRunDetails UntitledTestRun2 - Navigate to page teamprojectexecutions.png')

"Step 87: Click on div TestRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 87-Click on div TestRunDetails.png')

"Step 88: Click on link MyAgent -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_MyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 88-Click on link MyAgent - Navigate to page organizationsettingsagent.png')

"Step 89: Click on link AgentSetup2 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 89-Click on link AgentSetup2 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 90: Click on link ScheduleYourTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleYourTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 90-Click on link ScheduleYourTestRuns.png')

"Step 91: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_1, Integer.valueOf(index_1))

"Step 92: Click on link projectNavigation (Schedules2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_6, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_9]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 92-Click on link projectNavigation Schedules2.png')

"Step 93: Click on link dynamicObject (UntitledTestRun2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 93-Click on link dynamicObject UntitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 94: Click on div testRun (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRun', ['div_testRun_internalText': div_testRun_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 94-Click on div testRun UntitledTestRun.png')

"Step 95: Click on button IncompleteUntitledTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteUntitledTest'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 95-Click on button IncompleteUntitledTest.png')

"Step 96: Click on link configuration (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_5, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_5, 'link_configuration_team_id': link_configuration_team_id_5, 'link_configuration_project_id': link_configuration_project_id_5, 'link_configuration_job_id': link_configuration_job_id_5, 'link_configuration_plan_id': link_configuration_plan_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 96-Click on link configuration Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 97: Click on link configuration (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_6, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_6, 'link_configuration_team_id': link_configuration_team_id_6, 'link_configuration_project_id': link_configuration_project_id_6, 'link_configuration_job_id': link_configuration_job_id_6, 'link_configuration_plan_id': link_configuration_plan_id_6]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 97-Click on link configuration Sessions2.png')

"Step 98: Click on link configuration (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_7, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_7, 'link_configuration_team_id': link_configuration_team_id_7, 'link_configuration_project_id': link_configuration_project_id_7, 'link_configuration_job_id': link_configuration_job_id_7, 'link_configuration_plan_id': link_configuration_plan_id_7]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 98-Click on link configuration Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 99: Click on link configuration (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_8, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_8, 'link_configuration_team_id': link_configuration_team_id_8, 'link_configuration_project_id': link_configuration_project_id_8, 'link_configuration_job_id': link_configuration_job_id_8, 'link_configuration_plan_id': link_configuration_plan_id_8]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 99-Click on link configuration Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 100: Click on link configuration (Configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_9, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_9, 'link_configuration_team_id': link_configuration_team_id_9, 'link_configuration_project_id': link_configuration_project_id_9, 'link_configuration_job_id': link_configuration_job_id_9, 'link_configuration_plan_id': link_configuration_plan_id_9]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 100-Click on link configuration Configuration4.png')

"Step 101: Click on link testRunNavigation (TestRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunNavigation', ['link_testRunNavigation_nthChild': link_testRunNavigation_nthChild_1, 'link_testRunNavigation_internalRoleLinkName': link_testRunNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 101-Click on link testRunNavigation TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 102: Click on link configuration (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_10, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_10, 'link_configuration_team_id': link_configuration_team_id_10, 'link_configuration_project_id': link_configuration_project_id_10, 'link_configuration_job_id': link_configuration_job_id_10, 'link_configuration_plan_id': link_configuration_plan_id_10]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 102-Click on link configuration Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 103: Click on link scheduleNavigation (Schedules2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleNavigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleNavigation_1', ['link_scheduleNavigation_internalRoleLinkName': link_scheduleNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 103-Click on link scheduleNavigation Schedules2 - Navigate to page teamproject.png')

"Step 104: Click on link projectNavigation (Calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_7, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_10]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 104-Click on link projectNavigation Calendar.png')

"Step 105: Click on button Month"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Month'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 105-Click on button Month.png')

"Step 106: Click on div testRun (UntitledTestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class, 'div_testRun_internalText': div_testRun_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 106-Click on div testRun UntitledTestRun4.png')

"Step 107: Click on div testRun (UntitledTestRun5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 107-Click on div testRun UntitledTestRun5.png')

"Step 108: Click on link Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Details'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 108-Click on link Details - Navigate to page teamprojectexecutions.png')

"Step 109: Click on link TestResults10 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults10'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 109-Click on link TestResults10 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 110: Click on link Summary4 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary4'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 110-Click on link Summary4 - Navigate to page teamprojectexecutions.png')

"Step 111: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 111-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 112: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 112-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 113: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 113-Click on link TestRuns - Navigate to page teamproject.png')

"Step 114: Click on link Settings4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings4'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 114-Click on link Settings4.png')

"Step 115: Click on link projectNavigation (ScriptRepositories5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_8, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_11]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 115-Click on link projectNavigation ScriptRepositories5.png')

"Step 116: Click on link projectNavigation (TestEnvironments4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_9, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_12]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 116-Click on link projectNavigation TestEnvironments4.png')

"Step 117: Click on link TestCloud -> Navigate to page 'team/*/project/*/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 117-Click on link TestCloud - Navigate to page teamprojectagenttest-cloud.png')

"Step 118: Click on link Local -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_test_cloud/link_Local'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 118-Click on link Local - Navigate to page teamproject.png')

"Step 119: Click on link agentNavigation (MyAgent) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_agentNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_agentNavigation', ['link_agentNavigation_local_id': link_agentNavigation_local_id_1, 'link_agentNavigation_organization_id': link_agentNavigation_organization_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 119-Click on link agentNavigation MyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 120: Click on link AgentSetup -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSetup_1'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 120-Click on link AgentSetup - Navigate to page organizationsettingstest-environment-installation.png')

"Step 121: Click on link ScheduleYourTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleYourTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 121-Click on link ScheduleYourTestRuns.png')

"Step 122: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_2, Integer.valueOf(index_2))

"Step 123: Click on div testRun (TestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class_2, 'div_testRun_internalText': div_testRun_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 123-Click on div testRun TestRun.png')

"Step 124: Click on div testRun (UntitledTestRun6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class_3, 'div_testRun_internalText': div_testRun_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 124-Click on div testRun UntitledTestRun6.png')

"Step 125: Click on div testRun (TestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class_4, 'div_testRun_internalText': div_testRun_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 125-Click on div testRun TestRun.png')

"Step 126: Click on div testRun (UntitledTestRun6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class_5, 'div_testRun_internalText': div_testRun_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 126-Click on div testRun UntitledTestRun6.png')

"Step 127: Click on div testRun (UntitledTestRun7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class_6]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 127-Click on div testRun UntitledTestRun7.png')

"Step 128: Click on link projectNavigation (Schedules3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_10, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_13]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 128-Click on link projectNavigation Schedules3.png')

"Step 129: Click on button Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Object'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 129-Click on button Object.png')

"Step 130: Click on link dynamicObject (UntitledTestRun3) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild_1, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 130-Click on link dynamicObject UntitledTestRun3 - Navigate to page teamprojectgridplanjob.png')

"Step 131: Click on label Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_Object'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 131-Click on label Object.png')

"Step 132: Click on button jobActions (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_jobActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_jobActions', ['button_jobActions_internalRoleButtonName': button_jobActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 132-Click on button jobActions Delete.png')

"Step 133: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 133-Click on button Delete2.png')

"Step 134: Click on link scheduleNavigation (Schedules2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleNavigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleNavigation_1', ['link_scheduleNavigation_internalRoleLinkName': link_scheduleNavigation_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 134-Click on link scheduleNavigation Schedules2 - Navigate to page teamproject.png')

"Step 135: Click on link UntitledTestRun4 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_UntitledTestRun4'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 135-Click on link UntitledTestRun4 - Navigate to page teamprojectgridplanjob.png')

"Step 136: Click on link configuration (Configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_11, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_11, 'link_configuration_team_id': link_configuration_team_id_11, 'link_configuration_project_id': link_configuration_project_id_11, 'link_configuration_job_id': link_configuration_job_id_11, 'link_configuration_plan_id': link_configuration_plan_id_11]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 136-Click on link configuration Configuration4.png')

"Step 137: Click on link configuration (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_12, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_12, 'link_configuration_team_id': link_configuration_team_id_12, 'link_configuration_project_id': link_configuration_project_id_12, 'link_configuration_job_id': link_configuration_job_id_12, 'link_configuration_plan_id': link_configuration_plan_id_12]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 137-Click on link configuration Sessions2.png')

"Step 138: Click on link configuration (Configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_13, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_13, 'link_configuration_team_id': link_configuration_team_id_13, 'link_configuration_project_id': link_configuration_project_id_13, 'link_configuration_job_id': link_configuration_job_id_13, 'link_configuration_plan_id': link_configuration_plan_id_13]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 138-Click on link configuration Configuration4.png')

"Step 139: Click on link testRunNavigation (TestRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunNavigation', ['link_testRunNavigation_nthChild': link_testRunNavigation_nthChild_2, 'link_testRunNavigation_internalRoleLinkName': link_testRunNavigation_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 139-Click on link testRunNavigation TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 140: Click on label Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_Object'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 140-Click on label Object.png')

"Step 141: Click on button jobActions (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_jobActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_jobActions', ['button_jobActions_internalRoleButtonName': button_jobActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 141-Click on button jobActions Delete.png')

"Step 142: Click on button Delete2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 142-Click on button Delete2 - Navigate to page teamproject.png')

"Step 143: Click on link dynamicObject (UntitledTestRun3) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild_2, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 143-Click on link dynamicObject UntitledTestRun3 - Navigate to page teamprojectgridplanjob.png')

"Step 144: Click on link configuration (Sessions3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_14, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_14, 'link_configuration_team_id': link_configuration_team_id_14, 'link_configuration_project_id': link_configuration_project_id_14, 'link_configuration_job_id': link_configuration_job_id_14, 'link_configuration_plan_id': link_configuration_plan_id_14]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 144-Click on link configuration Sessions3 - Navigate to page teamprojectgridplanjob.png')

"Step 145: Click on link configuration (Configuration5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_15, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_15, 'link_configuration_team_id': link_configuration_team_id_15, 'link_configuration_project_id': link_configuration_project_id_15, 'link_configuration_job_id': link_configuration_job_id_15, 'link_configuration_plan_id': link_configuration_plan_id_15]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 145-Click on link configuration Configuration5.png')

"Step 146: Delete selected items from the test execution list"

deleteItemsFromExecutionList.execute(data_path_3, Integer.valueOf(index_3))

"Step 147: Click on link dynamicObject (UntitledTestRun2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild_3, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 147-Click on link dynamicObject UntitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 148: Click on link configuration (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_16, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_16, 'link_configuration_team_id': link_configuration_team_id_16, 'link_configuration_project_id': link_configuration_project_id_16, 'link_configuration_job_id': link_configuration_job_id_16, 'link_configuration_plan_id': link_configuration_plan_id_16]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 148-Click on link configuration Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 149: Click on span Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/span_Object'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 149-Click on span Object.png')

"Step 150: Delete selected items from the test execution list"

deleteItemsFromExecutionList.execute(data_path_4, Integer.valueOf(index_4))

"Step 151: Click on link projectNavigation (Calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_11, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_14]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 151-Click on link projectNavigation Calendar.png')

"Step 152: Click on div testRun (TestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class_7, 'div_testRun_internalText': div_testRun_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 152-Click on div testRun TestRun2.png')

"Step 153: Click on div testRun (TestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class_8, 'div_testRun_internalText': div_testRun_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 153-Click on div testRun TestRun3.png')

"Step 154: Click on div testRun (TestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class_9, 'div_testRun_internalText': div_testRun_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 154-Click on div testRun TestRun2.png')

"Step 155: Click on div testRun (TestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRun', ['div_testRun_class': div_testRun_class_10, 'div_testRun_internalText': div_testRun_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 155-Click on div testRun TestRun3.png')

"Step 156: Click on div Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Object'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 156-Click on div Object.png')

"Step 157: Click on link projectNavigation (Schedules3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_12, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_15]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 157-Click on link projectNavigation Schedules3.png')

"Step 158: Click on div dynamicObject (Object2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1', ['div_dynamicObject_internalText': div_dynamicObject_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 158-Click on div dynamicObject Object2 - Navigate to page .png')

"Step 159: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC110-Schedule Test Runs and Manage Test Cases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}