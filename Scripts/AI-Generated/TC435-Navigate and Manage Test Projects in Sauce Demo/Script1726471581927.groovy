import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.createNewGitConnection
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.scheduleTestRunWithActiveTunnels
import katalon.common.createGitConnectionWithCredentials
import katalon.common.deleteTestRun

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link noDataProjects (fpFirstProjectNoData3) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects', ['link_noDataProjects_internalRoleLinkName': link_noDataProjects_internalRoleLinkName, 'link_noDataProjects_team_id': link_noDataProjects_team_id, 'link_noDataProjects_project_id': link_noDataProjects_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 2-Click on link noDataProjects fpFirstProjectNoData3 - Navigate to page teamproject.png')

"Step 3: Click on link viewAll -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_viewAll'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 3-Click on link viewAll - Navigate to page teamprojectreleases.png')

"Step 4: Click on link requirements2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_requirements2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 4-Click on link requirements2 - Navigate to page teamproject.png')

"Step 5: Click on link releases -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_releases'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 5-Click on link releases - Navigate to page teamprojectreleases.png')

"Step 6: Click on link projectSettings (settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases/link_projectSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases/link_projectSettings', ['link_projectSettings_nthChild': link_projectSettings_nthChild, 'link_projectSettings_internalRoleLinkName': link_projectSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 6-Click on link projectSettings settings - Navigate to page teamproject.png')

"Step 7: Click on link projectNavigation (scriptRepositories6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 7-Click on link projectNavigation scriptRepositories6.png')

"Step 8: Click on link connectGitRepository -> Navigate to page 'team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_connectGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 8-Click on link connectGitRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 9: Click on div gitActions (useKatalonsSample)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitActions', ['div_gitActions_nthChild': div_gitActions_nthChild, 'div_gitActions_internalHasText': div_gitActions_internalHasText, 'div_gitActions_dataTestid': div_gitActions_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 9-Click on div gitActions useKatalonsSample.png')

"Step 10: Click on div gitSetUpUseSample"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_gitSetUpUseSample'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 10-Click on div gitSetUpUseSample.png')

"Step 11: Click on div gitActions (createAnewGit) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitActions', ['div_gitActions_nthChild': div_gitActions_nthChild_1, 'div_gitActions_internalHasText': div_gitActions_internalHasText_1, 'div_gitActions_dataTestid': div_gitActions_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 11-Click on div gitActions createAnewGit - Navigate to page teamproject.png')

"Step 12: Login into Application"

TrueTestScripts.login()

"Step 13: Click on link testEnvironments -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_testEnvironments_1'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 13-Click on link testEnvironments - Navigate to page teamproject.png')

"Step 14: Click on link createLocalTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_createLocalTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 14-Click on link createLocalTestEnvironment.png')

"Step 15: Create a new Git connection using repository URL and credentials."

createGitConnectionWithCredentials.execute()

"Step 16: Click on link agentSetup3 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_agentSetup3'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 16-Click on link agentSetup3 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 17: Click on input username -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/input_username'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 17-Click on input username - Navigate to page organizationsettingsagent.png')

"Step 18: Click on link agentManagement (myAgent2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentManagement', ['link_agentManagement_local_id': link_agentManagement_local_id, 'link_agentManagement_organization_id': link_agentManagement_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 18-Click on link agentManagement myAgent2.png')

"Step 19: Create a new Git connection using personal access token."

createNewGitConnection.execute()

"Step 20: Click on link agentSetup2 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_agentSetup2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 20-Click on link agentSetup2 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 21: Click on button createNewGitConnect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/button_createNewGitConnect'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 21-Click on button createNewGitConnect.png')

"Step 22: Schedule a test run with selected active tunnels and environments."

scheduleTestRunWithActiveTunnels.execute(data_path_0, Integer.valueOf(index_0))

"Step 23: Click on link projectNavigation (schedules2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_1, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 23-Click on link projectNavigation schedules2.png')

"Step 24: Click on link testServiceRuns (untitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns', ['link_testServiceRuns_internalRoleLinkName': link_testServiceRuns_internalRoleLinkName, 'link_testServiceRuns_project_id': link_testServiceRuns_project_id, 'link_testServiceRuns_team_id': link_testServiceRuns_team_id, 'link_testServiceRuns_plan_id': link_testServiceRuns_plan_id]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 24-Click on link testServiceRuns untitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 25: Click on link configurationSessions (configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName, 'link_configurationSessions_team_id': link_configurationSessions_team_id, 'link_configurationSessions_job_id': link_configurationSessions_job_id, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id, 'link_configurationSessions_project_id': link_configurationSessions_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 25-Click on link configurationSessions configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 26: Click on link configurationSessions (sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_1, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_1, 'link_configurationSessions_team_id': link_configurationSessions_team_id_1, 'link_configurationSessions_job_id': link_configurationSessions_job_id_1, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_1, 'link_configurationSessions_project_id': link_configurationSessions_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 26-Click on link configurationSessions sessions2.png')

"Step 27: Click on link testRunManagement (testRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunManagement', ['link_testRunManagement_nthChild': link_testRunManagement_nthChild, 'link_testRunManagement_internalRoleLinkName': link_testRunManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 27-Click on link testRunManagement testRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 28: Click on link scheduleHistory (calendar2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleHistory_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleHistory_1', ['link_scheduleHistory_nthChild': link_scheduleHistory_nthChild, 'link_scheduleHistory_internalRoleLinkName': link_scheduleHistory_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 28-Click on link scheduleHistory calendar2 - Navigate to page teamproject.png')

"Step 29: Click on link projectNavigation (schedules3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_2, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 29-Click on link projectNavigation schedules3.png')

"Step 30: Click on div objectDetails (object72)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_1', ['div_objectDetails_internalText': div_objectDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 30-Click on div objectDetails object72.png')

"Step 31: Click on link testServiceRuns (untitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns', ['link_testServiceRuns_internalRoleLinkName': link_testServiceRuns_internalRoleLinkName_1, 'link_testServiceRuns_project_id': link_testServiceRuns_project_id_1, 'link_testServiceRuns_team_id': link_testServiceRuns_team_id_1, 'link_testServiceRuns_plan_id': link_testServiceRuns_plan_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 31-Click on link testServiceRuns untitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 32: Click on button incompleteUntitledTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_incompleteUntitledTest'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 32-Click on button incompleteUntitledTest.png')

"Step 33: Click on div allTestRunsTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_allTestRunsTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 33-Click on div allTestRunsTestSuite.png')

"Step 34: Click on div untitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_untitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 34-Click on div untitledTestRun.png')

"Step 35: Click on div customCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_customCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 35-Click on div customCheckbox.png')

"Step 36: Click on label customControlLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_customControlLabel'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 36-Click on label customControlLabel.png')

"Step 37: Click on th name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/th_name'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 37-Click on th name.png')

"Step 38: Click on button incompleteUntitledTest2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_incompleteUntitledTest2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 38-Click on button incompleteUntitledTest2.png')

"Step 39: Click on div allTestRunsTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_allTestRunsTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 39-Click on div allTestRunsTestSuite.png')

"Step 40: Click on link configurationSessions (configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_2, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_2, 'link_configurationSessions_team_id': link_configurationSessions_team_id_2, 'link_configurationSessions_job_id': link_configurationSessions_job_id_2, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_2, 'link_configurationSessions_project_id': link_configurationSessions_project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 40-Click on link configurationSessions configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 41: Click on link configurationSessions (sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_3, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_3, 'link_configurationSessions_team_id': link_configurationSessions_team_id_3, 'link_configurationSessions_job_id': link_configurationSessions_job_id_3, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_3, 'link_configurationSessions_project_id': link_configurationSessions_project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 41-Click on link configurationSessions sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 42: Click on link configurationSessions (configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_4, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_4, 'link_configurationSessions_team_id': link_configurationSessions_team_id_4, 'link_configurationSessions_job_id': link_configurationSessions_job_id_4, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_4, 'link_configurationSessions_project_id': link_configurationSessions_project_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 42-Click on link configurationSessions configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 43: Click on link myAgent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_myAgent'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 43-Click on link myAgent.png')

"Step 44: Create a new Git connection using personal access token."

createNewGitConnection.execute()

"Step 45: Click on button leftNavbarRoleButton -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_leftNavbarRoleButton'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 45-Click on button leftNavbarRoleButton - Navigate to page organizationhome.png')

"Step 46: Click on link testRuns (untitledTestRun) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRuns', ['link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName, 'link_testRuns_executions_id': link_testRuns_executions_id, 'link_testRuns_team_id': link_testRuns_team_id, 'link_testRuns_project_id': link_testRuns_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 46-Click on link testRuns untitledTestRun - Navigate to page teamprojectexecutions.png')

"Step 47: Click on link testResults9 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults9'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 47-Click on link testResults9 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 48: Click on link summary4 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_summary4'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 48-Click on link summary4 - Navigate to page teamprojectexecutions.png')

"Step 49: Click on div testRun1UntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testRun1UntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 49-Click on div testRun1UntitledTestRun.png')

"Step 50: Click on link requirements2 -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_requirements2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 50-Click on link requirements2 - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 51: Click on link testCases2 -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testCases2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 51-Click on link testCases2 - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 52: Click on link testReports (visualTesting) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testReports_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testReports_1', ['link_testReports_internalRoleLinkName': link_testReports_internalRoleLinkName, 'link_testReports_path_param_5': link_testReports_path_param_5, 'link_testReports_project_id': link_testReports_project_id, 'link_testReports_team_id': link_testReports_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 52-Click on link testReports visualTesting - Navigate to page teamproject.png')

"Step 53: Click on link requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_requirements'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 53-Click on link requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 54: Click on link testRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 54-Click on link testRuns - Navigate to page teamproject.png')

"Step 55: Click on link requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_requirements'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 55-Click on link requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 56: Click on item testCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/item_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 56-Click on item testCases.png')

"Step 57: Click on link testCases2 -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testCases2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 57-Click on link testCases2 - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 58: Click on link testReports (defects2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testReports_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testReports_1', ['link_testReports_internalRoleLinkName': link_testReports_internalRoleLinkName_1, 'link_testReports_path_param_5': link_testReports_path_param_5_1, 'link_testReports_project_id': link_testReports_project_id_1, 'link_testReports_team_id': link_testReports_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 58-Click on link testReports defects2 - Navigate to page teamproject.png')

"Step 59: Click on link projectNavigation (visualTesting3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 59-Click on link projectNavigation visualTesting3.png')

"Step 60: Click on link fpFirstProject -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_fpFirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 60-Click on link fpFirstProject - Navigate to page teamprojectreleases.png')

"Step 61: Click on link tests5 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_tests5'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 61-Click on link tests5 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 62: Click on span object2 -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 62-Click on span object2 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 63: Click on link testSettings (settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_testSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_testSettings', ['link_testSettings_internalRoleLinkName': link_testSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 63-Click on link testSettings settings - Navigate to page teamproject.png')

"Step 64: Click on link projectNavigation (testCloudTunnels5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_3, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 64-Click on link projectNavigation testCloudTunnels5.png')

"Step 65: Click on link projectNavigation (integrations3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_4, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 65-Click on link projectNavigation integrations3.png')

"Step 66: Click on link projectNavigation (testEnvironments5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_5, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 66-Click on link projectNavigation testEnvironments5.png')

"Step 67: Click on link reports15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports15'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 67-Click on link reports15.png')

"Step 68: Click on link dashboard6 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_dashboard6'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 68-Click on link dashboard6 - Navigate to page teamproject.png')

"Step 69: Click on link planning6 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning6'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 69-Click on link planning6 - Navigate to page teamprojectreleases.png')

"Step 70: Click on link requirements2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_requirements2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 70-Click on link requirements2 - Navigate to page teamproject.png')

"Step 71: Click on link settings5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings5'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 71-Click on link settings5.png')

"Step 72: Click on link reports15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports15'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 72-Click on link reports15.png')

"Step 73: Click on link requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_requirements'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 73-Click on link requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 74: Click on link testCases2 -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testCases2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 74-Click on link testCases2 - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 75: Click on link testReports (defects2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testReports_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testReports_1', ['link_testReports_internalRoleLinkName': link_testReports_internalRoleLinkName_2, 'link_testReports_path_param_5': link_testReports_path_param_5_2, 'link_testReports_project_id': link_testReports_project_id_2, 'link_testReports_team_id': link_testReports_team_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 75-Click on link testReports defects2 - Navigate to page teamproject.png')

"Step 76: Click on link projectNavigation (visualTesting3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 76-Click on link projectNavigation visualTesting3.png')

"Step 77: Click on button projectActions (firstProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 77-Click on button projectActions firstProject.png')

"Step 78: Click on link myOrganization01 -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_myOrganization01'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 78-Click on link myOrganization01 - Navigate to page organizationhome.png')

"Step 79: Click on link testRuns (untitledTestRun2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRuns', ['link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName_1, 'link_testRuns_executions_id': link_testRuns_executions_id_1, 'link_testRuns_team_id': link_testRuns_team_id_1, 'link_testRuns_project_id': link_testRuns_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 79-Click on link testRuns untitledTestRun2 - Navigate to page teamprojectexecutions.png')

"Step 80: Click on div testRun1UntitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_testRun1UntitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 80-Click on div testRun1UntitledTestRun.png')

"Step 81: Click on link myAgent -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_myAgent'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 81-Click on link myAgent - Navigate to page organizationsettingsagent.png')

"Step 82: Click on link agentSetup3 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_agentSetup3'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 82-Click on link agentSetup3 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 83: Click on button createNewGitConnect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/button_createNewGitConnect'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 83-Click on button createNewGitConnect.png')

"Step 84: Schedule a test run with selected active tunnels and environments."

scheduleTestRunWithActiveTunnels.execute(data_path_1, Integer.valueOf(index_1))

"Step 85: Click on link projectNavigation (schedules2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_6, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 85-Click on link projectNavigation schedules2.png')

"Step 86: Click on link testServiceRuns (untitledTestRun2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns', ['link_testServiceRuns_trNthChild': link_testServiceRuns_trNthChild, 'link_testServiceRuns_internalRoleLinkName': link_testServiceRuns_internalRoleLinkName_2, 'link_testServiceRuns_project_id': link_testServiceRuns_project_id_2, 'link_testServiceRuns_team_id': link_testServiceRuns_team_id_2, 'link_testServiceRuns_plan_id': link_testServiceRuns_plan_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 86-Click on link testServiceRuns untitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 87: Click on div untitledTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_untitledTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 87-Click on div untitledTestRun.png')

"Step 88: Click on button incompleteUntitledTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_incompleteUntitledTest'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 88-Click on button incompleteUntitledTest.png')

"Step 89: Click on link configurationSessions (configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_5, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_5, 'link_configurationSessions_team_id': link_configurationSessions_team_id_5, 'link_configurationSessions_job_id': link_configurationSessions_job_id_5, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_5, 'link_configurationSessions_project_id': link_configurationSessions_project_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 89-Click on link configurationSessions configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 90: Click on link configurationSessions (sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_6, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_6, 'link_configurationSessions_team_id': link_configurationSessions_team_id_6, 'link_configurationSessions_job_id': link_configurationSessions_job_id_6, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_6, 'link_configurationSessions_project_id': link_configurationSessions_project_id_6]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 90-Click on link configurationSessions sessions2.png')

"Step 91: Click on link configurationSessions (configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_7, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_7, 'link_configurationSessions_team_id': link_configurationSessions_team_id_7, 'link_configurationSessions_job_id': link_configurationSessions_job_id_7, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_7, 'link_configurationSessions_project_id': link_configurationSessions_project_id_7]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 91-Click on link configurationSessions configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 92: Click on link configurationSessions (sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_8, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_8, 'link_configurationSessions_team_id': link_configurationSessions_team_id_8, 'link_configurationSessions_job_id': link_configurationSessions_job_id_8, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_8, 'link_configurationSessions_project_id': link_configurationSessions_project_id_8]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 92-Click on link configurationSessions sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 93: Click on link configurationSessions (configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_9, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_9, 'link_configurationSessions_team_id': link_configurationSessions_team_id_9, 'link_configurationSessions_job_id': link_configurationSessions_job_id_9, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_9, 'link_configurationSessions_project_id': link_configurationSessions_project_id_9]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 93-Click on link configurationSessions configuration4.png')

"Step 94: Click on link testRunManagement (testRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunManagement', ['link_testRunManagement_nthChild': link_testRunManagement_nthChild_1, 'link_testRunManagement_internalRoleLinkName': link_testRunManagement_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 94-Click on link testRunManagement testRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 95: Click on link configurationSessions (sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_10, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_10, 'link_configurationSessions_team_id': link_configurationSessions_team_id_10, 'link_configurationSessions_job_id': link_configurationSessions_job_id_10, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_10, 'link_configurationSessions_project_id': link_configurationSessions_project_id_10]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 95-Click on link configurationSessions sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 96: Click on link scheduleHistory (schedules2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleHistory', ['link_scheduleHistory_internalRoleLinkName': link_scheduleHistory_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 96-Click on link scheduleHistory schedules2 - Navigate to page teamproject.png')

"Step 97: Click on link projectNavigation (calendar2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_7, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_9]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 97-Click on link projectNavigation calendar2.png')

"Step 98: Click on button month"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_month'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 98-Click on button month.png')

"Step 99: Click on div testRunDetails (untitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class, 'div_testRunDetails_internalText': div_testRunDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 99-Click on div testRunDetails untitledTestRun.png')

"Step 100: Click on div testRunDetails (object73)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 100-Click on div testRunDetails object73.png')

"Step 101: Click on link details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_details2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 101-Click on link details2 - Navigate to page teamprojectexecutions.png')

"Step 102: Click on link testResults9 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults9'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 102-Click on link testResults9 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 103: Click on link summary4 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_summary4'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 103-Click on link summary4 - Navigate to page teamprojectexecutions.png')

"Step 104: Click on link testCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 104-Click on link testCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 105: Click on link requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_requirements'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 105-Click on link requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 106: Click on link testRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 106-Click on link testRuns - Navigate to page teamproject.png')

"Step 107: Click on link settings5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings5'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 107-Click on link settings5.png')

"Step 108: Click on link projectNavigation (scriptRepositories6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_8, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_10]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 108-Click on link projectNavigation scriptRepositories6.png')

"Step 109: Click on link projectNavigation (testEnvironments5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_9, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_11]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 109-Click on link projectNavigation testEnvironments5.png')

"Step 110: Click on link testCloud -> Navigate to page 'team/*/project/*/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCloud'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 110-Click on link testCloud - Navigate to page teamprojectagenttest-cloud.png')

"Step 111: Click on link local -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_test_cloud/link_local'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 111-Click on link local - Navigate to page teamproject.png')

"Step 112: Click on link agentLinks (myAgent) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_agentLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_agentLinks', ['link_agentLinks_local_id': link_agentLinks_local_id, 'link_agentLinks_organization_id': link_agentLinks_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 112-Click on link agentLinks myAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 113: Click on link agentSetup2 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_agentSetup2'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 113-Click on link agentSetup2 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 114: Click on button createNewGitConnect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/button_createNewGitConnect'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 114-Click on button createNewGitConnect.png')

"Step 115: Schedule a test run with selected active tunnels and environments."

scheduleTestRunWithActiveTunnels.execute(data_path_2, Integer.valueOf(index_2))

"Step 116: Click on div testRunDetails (testRun1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_2, 'div_testRunDetails_internalText': div_testRunDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 116-Click on div testRunDetails testRun1.png')

"Step 117: Click on div testRunDetails (untitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_3, 'div_testRunDetails_internalText': div_testRunDetails_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 117-Click on div testRunDetails untitledTestRun2.png')

"Step 118: Click on div testRunDetails (testRun1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_4, 'div_testRunDetails_internalText': div_testRunDetails_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 118-Click on div testRunDetails testRun1.png')

"Step 119: Click on div testRunDetails (untitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_5, 'div_testRunDetails_internalText': div_testRunDetails_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 119-Click on div testRunDetails untitledTestRun2.png')

"Step 120: Click on div testRunDetails (object74)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_6]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 120-Click on div testRunDetails object74.png')

"Step 121: Click on link projectNavigation (schedules3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_10, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_12]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 121-Click on link projectNavigation schedules3.png')

"Step 122: Click on button testRun1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_testRun1'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 122-Click on button testRun1.png')

"Step 123: Click on link testServiceRuns (untitledTestRun3) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns', ['link_testServiceRuns_trNthChild': link_testServiceRuns_trNthChild_1, 'link_testServiceRuns_internalRoleLinkName': link_testServiceRuns_internalRoleLinkName_3, 'link_testServiceRuns_project_id': link_testServiceRuns_project_id_3, 'link_testServiceRuns_team_id': link_testServiceRuns_team_id_3, 'link_testServiceRuns_plan_id': link_testServiceRuns_plan_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 123-Click on link testServiceRuns untitledTestRun3 - Navigate to page teamprojectgridplanjob.png')

"Step 124: Click on label customControlLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_customControlLabel'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 124-Click on label customControlLabel.png')

"Step 125: Click on button runActions (delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_runActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_runActions', ['button_runActions_internalRoleButtonName': button_runActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 125-Click on button runActions delete.png')

"Step 126: Click on button incompleteUntitledTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_incompleteUntitledTest'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 126-Click on button incompleteUntitledTest.png')

"Step 127: Click on link scheduleHistory (schedules2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_scheduleHistory', ['link_scheduleHistory_internalRoleLinkName': link_scheduleHistory_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 127-Click on link scheduleHistory schedules2 - Navigate to page teamproject.png')

"Step 128: Click on link untitledTestRun4 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_untitledTestRun4'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 128-Click on link untitledTestRun4 - Navigate to page teamprojectgridplanjob.png')

"Step 129: Click on link configurationSessions (configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_11, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_11, 'link_configurationSessions_team_id': link_configurationSessions_team_id_11, 'link_configurationSessions_job_id': link_configurationSessions_job_id_11, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_11, 'link_configurationSessions_project_id': link_configurationSessions_project_id_11]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 129-Click on link configurationSessions configuration4.png')

"Step 130: Click on link configurationSessions (sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_12, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_12, 'link_configurationSessions_team_id': link_configurationSessions_team_id_12, 'link_configurationSessions_job_id': link_configurationSessions_job_id_12, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_12, 'link_configurationSessions_project_id': link_configurationSessions_project_id_12]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 130-Click on link configurationSessions sessions2.png')

"Step 131: Click on link configurationSessions (configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_13, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_13, 'link_configurationSessions_team_id': link_configurationSessions_team_id_13, 'link_configurationSessions_job_id': link_configurationSessions_job_id_13, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_13, 'link_configurationSessions_project_id': link_configurationSessions_project_id_13]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 131-Click on link configurationSessions configuration4.png')

"Step 132: Click on link testRunManagement (testRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunManagement', ['link_testRunManagement_nthChild': link_testRunManagement_nthChild_2, 'link_testRunManagement_internalRoleLinkName': link_testRunManagement_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 132-Click on link testRunManagement testRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 133: Click on label customControlLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_customControlLabel'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 133-Click on label customControlLabel.png')

"Step 134: Click on button runActions (delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_runActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_runActions', ['button_runActions_internalRoleButtonName': button_runActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 134-Click on button runActions delete.png')

"Step 135: Click on link configurationSessions (sessions2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_14, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_14, 'link_configurationSessions_team_id': link_configurationSessions_team_id_14, 'link_configurationSessions_job_id': link_configurationSessions_job_id_14, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_14, 'link_configurationSessions_project_id': link_configurationSessions_project_id_14]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 135-Click on link configurationSessions sessions2 - Navigate to page teamproject.png')

"Step 136: Click on link testServiceRuns (untitledTestRun3) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns', ['link_testServiceRuns_trNthChild': link_testServiceRuns_trNthChild_2, 'link_testServiceRuns_internalRoleLinkName': link_testServiceRuns_internalRoleLinkName_4, 'link_testServiceRuns_project_id': link_testServiceRuns_project_id_4, 'link_testServiceRuns_team_id': link_testServiceRuns_team_id_4, 'link_testServiceRuns_plan_id': link_testServiceRuns_plan_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 136-Click on link testServiceRuns untitledTestRun3 - Navigate to page teamprojectgridplanjob.png')

"Step 137: Click on link configurationSessions (sessions3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_15, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_15, 'link_configurationSessions_team_id': link_configurationSessions_team_id_15, 'link_configurationSessions_job_id': link_configurationSessions_job_id_15, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_15, 'link_configurationSessions_project_id': link_configurationSessions_project_id_15]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 137-Click on link configurationSessions sessions3 - Navigate to page teamprojectgridplanjob.png')

"Step 138: Click on link configurationSessions (configuration5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_16, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_16, 'link_configurationSessions_team_id': link_configurationSessions_team_id_16, 'link_configurationSessions_job_id': link_configurationSessions_job_id_16, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_16, 'link_configurationSessions_project_id': link_configurationSessions_project_id_16]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 138-Click on link configurationSessions configuration5.png')

"Step 139: Delete a specified test run from the project."

deleteTestRun.execute(data_path_3, Integer.valueOf(index_3))

"Step 140: Click on link testServiceRuns (untitledTestRun2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testServiceRuns', ['link_testServiceRuns_trNthChild': link_testServiceRuns_trNthChild_3, 'link_testServiceRuns_internalRoleLinkName': link_testServiceRuns_internalRoleLinkName_5, 'link_testServiceRuns_project_id': link_testServiceRuns_project_id_5, 'link_testServiceRuns_team_id': link_testServiceRuns_team_id_5, 'link_testServiceRuns_plan_id': link_testServiceRuns_plan_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 140-Click on link testServiceRuns untitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 141: Click on link configurationSessions (sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationSessions', ['link_configurationSessions_nthChild': link_configurationSessions_nthChild_17, 'link_configurationSessions_internalRoleLinkName': link_configurationSessions_internalRoleLinkName_17, 'link_configurationSessions_team_id': link_configurationSessions_team_id_17, 'link_configurationSessions_job_id': link_configurationSessions_job_id_17, 'link_configurationSessions_plan_id': link_configurationSessions_plan_id_17, 'link_configurationSessions_project_id': link_configurationSessions_project_id_17]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 141-Click on link configurationSessions sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 142: Click on span failed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/span_failed'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 142-Click on span failed.png')

"Step 143: Delete a specified test run from the project."

deleteTestRun.execute(data_path_4, Integer.valueOf(index_4))

"Step 144: Click on link projectNavigation (calendar2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_11, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_13]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 144-Click on link projectNavigation calendar2.png')

"Step 145: Click on div testRunDetails (object75)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_7, 'div_testRunDetails_internalText': div_testRunDetails_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 145-Click on div testRunDetails object75.png')

"Step 146: Click on div testRunDetails (object76)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_8, 'div_testRunDetails_internalText': div_testRunDetails_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 146-Click on div testRunDetails object76.png')

"Step 147: Click on div testRunDetails (object75)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_9, 'div_testRunDetails_internalText': div_testRunDetails_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 147-Click on div testRunDetails object75.png')

"Step 148: Click on div testRunDetails (object76)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_10, 'div_testRunDetails_internalText': div_testRunDetails_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 148-Click on div testRunDetails object76.png')

"Step 149: Click on div infoSidebarHeaderCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_infoSidebarHeaderCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 149-Click on div infoSidebarHeaderCloseButton.png')

"Step 150: Click on link projectNavigation (schedules3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_12, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_14]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 150-Click on link projectNavigation schedules3.png')

"Step 151: Click on div objectDetails (object77) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_1', ['div_objectDetails_internalText': div_objectDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC435/Step 151-Click on div objectDetails object77 - Navigate to page .png')

"Step 152: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC435-Navigate and Manage Test Projects in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}