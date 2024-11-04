import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.configureTestSuiteAndRun
import truetest.common.openAndUpdateProject
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.downloadAgentAndConfigurations
import truetest.common.deleteTestRuns

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link projectResources (FirstProject3) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources', ['link_projectResources_internalRoleLinkName': link_projectResources_internalRoleLinkName, 'link_projectResources_project_id': link_projectResources_project_id, 'link_projectResources_team_id': link_projectResources_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 2-Click on link projectResources FirstProject3 - Navigate to page teamproject.png')

"Step 3: Click on link ViewAll -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewAll'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 3-Click on link ViewAll - Navigate to page teamprojectreleases.png')

"Step 4: Click on link Requirements3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements3'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 4-Click on link Requirements3 - Navigate to page teamproject.png')

"Step 5: Click on link Releases -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Releases'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 5-Click on link Releases - Navigate to page teamprojectreleases.png')

"Step 6: Click on link settings (Settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases/link_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases/link_settings', ['link_settings_nthChild': link_settings_nthChild, 'link_settings_internalRoleLinkName': link_settings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 6-Click on link settings Settings - Navigate to page teamproject.png')

"Step 7: Click on link testManagement (ScriptRepositories5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 7-Click on link testManagement ScriptRepositories5.png')

"Step 8: Click on link ConnectGitRepository -> Navigate to page 'team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConnectGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 8-Click on link ConnectGitRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 9: Click on div gitSetup (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup', ['div_gitSetup_nthChild': div_gitSetup_nthChild, 'div_gitSetup_dataTestid': div_gitSetup_dataTestid, 'div_gitSetup_internalHasText': div_gitSetup_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 9-Click on div gitSetup object.png')

"Step 10: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 10-Click on div object2.png')

"Step 11: Click on div gitSetup (CreateNewGit)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup', ['div_gitSetup_nthChild': div_gitSetup_nthChild_1, 'div_gitSetup_dataTestid': div_gitSetup_dataTestid_1, 'div_gitSetup_internalHasText': div_gitSetup_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 11-Click on div gitSetup CreateNewGit.png')

"Step 12: Login into Application"

TrueTestScripts.login()

"Step 13: Click on link TestEnvironments -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_TestEnvironments_1'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 13-Click on link TestEnvironments - Navigate to page teamproject.png')

"Step 14: Click on link CreateLocalTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_CreateLocalTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 14-Click on link CreateLocalTestEnvironment.png')

"Step 15: Download agent and configuration settings for testing."

downloadAgentAndConfigurations.execute()

"Step 16: Click on link AgentSetup3 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup3'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 16-Click on link AgentSetup3 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 17: Click on link TestEnvironments2 -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_TestEnvironments2'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 17-Click on link TestEnvironments2 - Navigate to page organizationsettingsagent.png')

"Step 18: Click on link agentSettings (MyAgent2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentSettings', ['link_agentSettings_local_id': link_agentSettings_local_id, 'link_agentSettings_organization_id': link_agentSettings_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 18-Click on link agentSettings MyAgent2.png')

"Step 19: Open projects and update their settings."

openAndUpdateProject.execute()

"Step 20: Click on link AgentSetup2 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSetup2'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 20-Click on link AgentSetup2 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 21: Click on link ScheduleTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 21-Click on link ScheduleTestRuns.png')

"Step 22: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_0, Integer.valueOf(index_0))

"Step 23: Click on link testManagement (Schedules3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_1, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 23-Click on link testManagement Schedules3.png')

"Step 24: Click on link testSuiteDetails (UntitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 24-Click on link testSuiteDetails UntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 25: Click on link configurationDetails (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id, 'link_configurationDetails_team_id': link_configurationDetails_team_id, 'link_configurationDetails_project_id': link_configurationDetails_project_id, 'link_configurationDetails_job_id': link_configurationDetails_job_id]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 25-Click on link configurationDetails Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 26: Click on link configurationDetails (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_1, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_1, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_1, 'link_configurationDetails_team_id': link_configurationDetails_team_id_1, 'link_configurationDetails_project_id': link_configurationDetails_project_id_1, 'link_configurationDetails_job_id': link_configurationDetails_job_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 26-Click on link configurationDetails Sessions2.png')

"Step 27: Click on link testRuns (TestRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 27-Click on link testRuns TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 28: Click on link calendarDetails (Calendar2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails_1', ['link_calendarDetails_nthChild': link_calendarDetails_nthChild, 'link_calendarDetails_internalRoleLinkName': link_calendarDetails_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 28-Click on link calendarDetails Calendar2 - Navigate to page teamproject.png')

"Step 29: Click on link testManagement (Schedules4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_2, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 29-Click on link testManagement Schedules4.png')

"Step 30: Click on div dynamicObject (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1', ['div_dynamicObject_internalText': div_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 30-Click on div dynamicObject object8.png')

"Step 31: Click on link testSuiteDetails (UntitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName_1, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id_1, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id_1, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 31-Click on link testSuiteDetails UntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 32: Click on button IncompleteTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteTest'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 32-Click on button IncompleteTest.png')

"Step 33: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 33-Click on div object.png')

"Step 34: Click on div testRunDetails (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails', ['div_testRunDetails_internalText': div_testRunDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 34-Click on div testRunDetails UntitledTestRun.png')

"Step 35: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 35-Click on div object2.png')

"Step 36: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 36-Click on label object.png')

"Step 37: Click on th Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/th_Name'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 37-Click on th Name.png')

"Step 38: Click on button IncompleteTest2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteTest2'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 38-Click on button IncompleteTest2.png')

"Step 39: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 39-Click on div object.png')

"Step 40: Click on link configurationDetails (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_2, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_2, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_2, 'link_configurationDetails_team_id': link_configurationDetails_team_id_2, 'link_configurationDetails_project_id': link_configurationDetails_project_id_2, 'link_configurationDetails_job_id': link_configurationDetails_job_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 40-Click on link configurationDetails Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 41: Click on link configurationDetails (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_3, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_3, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_3, 'link_configurationDetails_team_id': link_configurationDetails_team_id_3, 'link_configurationDetails_project_id': link_configurationDetails_project_id_3, 'link_configurationDetails_job_id': link_configurationDetails_job_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 41-Click on link configurationDetails Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 42: Click on link configurationDetails (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_4, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_4, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_4, 'link_configurationDetails_team_id': link_configurationDetails_team_id_4, 'link_configurationDetails_project_id': link_configurationDetails_project_id_4, 'link_configurationDetails_job_id': link_configurationDetails_job_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 42-Click on link configurationDetails Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 43: Click on link MyAgent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_MyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 43-Click on link MyAgent.png')

"Step 44: Open projects and update their settings."

openAndUpdateProject.execute()

"Step 45: Click on button object -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 45-Click on button object - Navigate to page organizationhome.png')

"Step 46: Click on link testExecutionDetails (UntitledTestRun) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionDetails', ['link_testExecutionDetails_internalRoleLinkName': link_testExecutionDetails_internalRoleLinkName, 'link_testExecutionDetails_project_id': link_testExecutionDetails_project_id, 'link_testExecutionDetails_executions_id': link_testExecutionDetails_executions_id, 'link_testExecutionDetails_team_id': link_testExecutionDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 46-Click on link testExecutionDetails UntitledTestRun - Navigate to page teamprojectexecutions.png')

"Step 47: Click on link TestResults12 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults12'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 47-Click on link TestResults12 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 48: Click on link Summary4 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary4'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 48-Click on link Summary4 - Navigate to page teamprojectexecutions.png')

"Step 49: Click on div TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 49-Click on div TestRun.png')

"Step 50: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Requirements_1'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 50-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 51: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases_1'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 51-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 52: Click on link defectManagement (VisualTesting) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectManagement_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectManagement_1', ['link_defectManagement_internalRoleLinkName': link_defectManagement_internalRoleLinkName, 'link_defectManagement_project_id': link_defectManagement_project_id, 'link_defectManagement_team_id': link_defectManagement_team_id, 'link_defectManagement_path_param_5': link_defectManagement_path_param_5]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 52-Click on link defectManagement VisualTesting - Navigate to page teamproject.png')

"Step 53: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 53-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 54: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 54-Click on link TestRuns - Navigate to page teamproject.png')

"Step 55: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 55-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 56: Click on item TestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/item_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 56-Click on item TestCases.png')

"Step 57: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases_1'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 57-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 58: Click on link defectManagement (Defects) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectManagement_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectManagement_1', ['link_defectManagement_internalRoleLinkName': link_defectManagement_internalRoleLinkName_1, 'link_defectManagement_project_id': link_defectManagement_project_id_1, 'link_defectManagement_team_id': link_defectManagement_team_id_1, 'link_defectManagement_path_param_5': link_defectManagement_path_param_5_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 58-Click on link defectManagement Defects - Navigate to page teamproject.png')

"Step 59: Click on link testManagement (VisualTesting2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 59-Click on link testManagement VisualTesting2.png')

"Step 60: Click on link FirstProject -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 60-Click on link FirstProject - Navigate to page teamprojectreleases.png')

"Step 61: Click on link Tests6 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests6'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 61-Click on link Tests6 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 62: Click on span SvgIcon3 -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_SvgIcon3'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 62-Click on span SvgIcon3 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 63: Click on link testSettings (Settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_testSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_testSettings', ['link_testSettings_internalRoleLinkName': link_testSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 63-Click on link testSettings Settings - Navigate to page teamproject.png')

"Step 64: Click on link testManagement (TestCloudTunnels5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_3, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 64-Click on link testManagement TestCloudTunnels5.png')

"Step 65: Click on link testManagement (Integrations3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_4, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 65-Click on link testManagement Integrations3.png')

"Step 66: Click on link testManagement (TestEnvironments4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_5, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 66-Click on link testManagement TestEnvironments4.png')

"Step 67: Click on link Reports13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports13'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 67-Click on link Reports13.png')

"Step 68: Click on link Dashboard6 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard6'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 68-Click on link Dashboard6 - Navigate to page teamproject.png')

"Step 69: Click on link Planning7 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning7'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 69-Click on link Planning7 - Navigate to page teamprojectreleases.png')

"Step 70: Click on link Requirements3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements3'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 70-Click on link Requirements3 - Navigate to page teamproject.png')

"Step 71: Click on link Settings7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings7'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 71-Click on link Settings7.png')

"Step 72: Click on link Reports13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports13'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 72-Click on link Reports13.png')

"Step 73: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 73-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 74: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases_1'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 74-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 75: Click on link defectManagement (Defects) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectManagement_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectManagement_1', ['link_defectManagement_internalRoleLinkName': link_defectManagement_internalRoleLinkName_2, 'link_defectManagement_project_id': link_defectManagement_project_id_2, 'link_defectManagement_team_id': link_defectManagement_team_id_2, 'link_defectManagement_path_param_5': link_defectManagement_path_param_5_2]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 75-Click on link defectManagement Defects - Navigate to page teamproject.png')

"Step 76: Click on link testManagement (VisualTesting2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 76-Click on link testManagement VisualTesting2.png')

"Step 77: Click on button projectActions (FirstProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 77-Click on button projectActions FirstProject.png')

"Step 78: Click on link MyOrganization -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_MyOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 78-Click on link MyOrganization - Navigate to page organizationhome.png')

"Step 79: Click on link testExecutionDetails (TestRun) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionDetails', ['link_testExecutionDetails_internalRoleLinkName': link_testExecutionDetails_internalRoleLinkName_1, 'link_testExecutionDetails_project_id': link_testExecutionDetails_project_id_1, 'link_testExecutionDetails_executions_id': link_testExecutionDetails_executions_id_1, 'link_testExecutionDetails_team_id': link_testExecutionDetails_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 79-Click on link testExecutionDetails TestRun - Navigate to page teamprojectexecutions.png')

"Step 80: Click on div TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 80-Click on div TestRun.png')

"Step 81: Click on link MyAgent -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_MyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 81-Click on link MyAgent - Navigate to page organizationsettingsagent.png')

"Step 82: Click on link AgentSetup3 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup3'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 82-Click on link AgentSetup3 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 83: Click on link ScheduleTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 83-Click on link ScheduleTestRuns.png')

"Step 84: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_1, Integer.valueOf(index_1))

"Step 85: Click on link testManagement (Schedules3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_6, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 85-Click on link testManagement Schedules3.png')

"Step 86: Click on link testSuiteDetails (UntitledTestRun2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_trNthChild': link_testSuiteDetails_trNthChild, 'link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName_2, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id_2, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id_2, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 86-Click on link testSuiteDetails UntitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 87: Click on div testRunDetails (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails', ['div_testRunDetails_internalText': div_testRunDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 87-Click on div testRunDetails UntitledTestRun.png')

"Step 88: Click on button IncompleteTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteTest'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 88-Click on button IncompleteTest.png')

"Step 89: Click on link configurationDetails (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_5, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_5, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_5, 'link_configurationDetails_team_id': link_configurationDetails_team_id_5, 'link_configurationDetails_project_id': link_configurationDetails_project_id_5, 'link_configurationDetails_job_id': link_configurationDetails_job_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 89-Click on link configurationDetails Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 90: Click on link configurationDetails (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_6, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_6, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_6, 'link_configurationDetails_team_id': link_configurationDetails_team_id_6, 'link_configurationDetails_project_id': link_configurationDetails_project_id_6, 'link_configurationDetails_job_id': link_configurationDetails_job_id_6]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 90-Click on link configurationDetails Sessions2.png')

"Step 91: Click on link configurationDetails (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_7, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_7, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_7, 'link_configurationDetails_team_id': link_configurationDetails_team_id_7, 'link_configurationDetails_project_id': link_configurationDetails_project_id_7, 'link_configurationDetails_job_id': link_configurationDetails_job_id_7]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 91-Click on link configurationDetails Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 92: Click on link configurationDetails (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_8, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_8, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_8, 'link_configurationDetails_team_id': link_configurationDetails_team_id_8, 'link_configurationDetails_project_id': link_configurationDetails_project_id_8, 'link_configurationDetails_job_id': link_configurationDetails_job_id_8]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 92-Click on link configurationDetails Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 93: Click on link configurationDetails (Configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_9, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_9, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_9, 'link_configurationDetails_team_id': link_configurationDetails_team_id_9, 'link_configurationDetails_project_id': link_configurationDetails_project_id_9, 'link_configurationDetails_job_id': link_configurationDetails_job_id_9]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 93-Click on link configurationDetails Configuration4.png')

"Step 94: Click on link testRuns (TestRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild_1, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 94-Click on link testRuns TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 95: Click on link configurationDetails (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_10, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_10, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_10, 'link_configurationDetails_team_id': link_configurationDetails_team_id_10, 'link_configurationDetails_project_id': link_configurationDetails_project_id_10, 'link_configurationDetails_job_id': link_configurationDetails_job_id_10]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 95-Click on link configurationDetails Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 96: Click on link calendarDetails (Schedules2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails', ['link_calendarDetails_internalRoleLinkName': link_calendarDetails_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 96-Click on link calendarDetails Schedules2 - Navigate to page teamproject.png')

"Step 97: Click on link testManagement (Calendar3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_7, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_9]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 97-Click on link testManagement Calendar3.png')

"Step 98: Click on button Month"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Month'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 98-Click on button Month.png')

"Step 99: Click on div testRunDetails (TestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class, 'div_testRunDetails_internalText': div_testRunDetails_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 99-Click on div testRunDetails TestRun.png')

"Step 100: Click on div testRunDetails (TestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 100-Click on div testRunDetails TestRun2.png')

"Step 101: Click on link Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 101-Click on link Details2 - Navigate to page teamprojectexecutions.png')

"Step 102: Click on link TestResults12 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults12'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 102-Click on link TestResults12 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 103: Click on link Summary4 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary4'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 103-Click on link Summary4 - Navigate to page teamprojectexecutions.png')

"Step 104: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 104-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 105: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 105-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 106: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 106-Click on link TestRuns - Navigate to page teamproject.png')

"Step 107: Click on link Settings7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings7'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 107-Click on link Settings7.png')

"Step 108: Click on link testManagement (ScriptRepositories5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_8, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_10]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 108-Click on link testManagement ScriptRepositories5.png')

"Step 109: Click on link testManagement (TestEnvironments4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_9, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_11]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 109-Click on link testManagement TestEnvironments4.png')

"Step 110: Click on link TestCloud -> Navigate to page 'team/*/project/*/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 110-Click on link TestCloud - Navigate to page teamprojectagenttest-cloud.png')

"Step 111: Click on link Local -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_test_cloud/link_Local'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 111-Click on link Local - Navigate to page teamproject.png')

"Step 112: Click on link agentSettings (MyAgent) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_agentLocalSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_agentLocalSettings', ['link_agentLocalSettings_local_id': link_agentLocalSettings_local_id, 'link_agentLocalSettings_organization_id': link_agentLocalSettings_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 112-Click on link agentSettings MyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 113: Click on link AgentSetup2 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSetup2'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 113-Click on link AgentSetup2 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 114: Click on link ScheduleTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 114-Click on link ScheduleTestRuns.png')

"Step 115: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_2, Integer.valueOf(index_2))

"Step 116: Click on div testRunDetails (TestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_2, 'div_testRunDetails_internalText': div_testRunDetails_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 116-Click on div testRunDetails TestRun3.png')

"Step 117: Click on div testRunDetails (TestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_3, 'div_testRunDetails_internalText': div_testRunDetails_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 117-Click on div testRunDetails TestRun4.png')

"Step 118: Click on div testRunDetails (TestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_4, 'div_testRunDetails_internalText': div_testRunDetails_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 118-Click on div testRunDetails TestRun3.png')

"Step 119: Click on div testRunDetails (TestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_5, 'div_testRunDetails_internalText': div_testRunDetails_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 119-Click on div testRunDetails TestRun4.png')

"Step 120: Click on div testRunDetails (TestRun5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_6]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 120-Click on div testRunDetails TestRun5.png')

"Step 121: Click on link testManagement (Schedules4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_10, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_12]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 121-Click on link testManagement Schedules4.png')

"Step 122: Click on button TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 122-Click on button TestRun.png')

"Step 123: Click on link testSuiteDetails (UntitledTestRun3) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_trNthChild': link_testSuiteDetails_trNthChild_1, 'link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName_3, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id_3, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id_3, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 123-Click on link testSuiteDetails UntitledTestRun3 - Navigate to page teamprojectgridplanjob.png')

"Step 124: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 124-Click on label object.png')

"Step 125: Click on button gridActions (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions', ['button_gridActions_internalRoleButtonName': button_gridActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 125-Click on button gridActions Delete.png')

"Step 126: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 126-Click on button Delete2.png')

"Step 127: Click on link calendarDetails (Schedules2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails', ['link_calendarDetails_internalRoleLinkName': link_calendarDetails_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 127-Click on link calendarDetails Schedules2 - Navigate to page teamproject.png')

"Step 128: Click on link UntitledTestRun4 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_UntitledTestRun4'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 128-Click on link UntitledTestRun4 - Navigate to page teamprojectgridplanjob.png')

"Step 129: Click on link configurationDetails (Configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_11, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_11, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_11, 'link_configurationDetails_team_id': link_configurationDetails_team_id_11, 'link_configurationDetails_project_id': link_configurationDetails_project_id_11, 'link_configurationDetails_job_id': link_configurationDetails_job_id_11]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 129-Click on link configurationDetails Configuration4.png')

"Step 130: Click on link configurationDetails (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_12, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_12, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_12, 'link_configurationDetails_team_id': link_configurationDetails_team_id_12, 'link_configurationDetails_project_id': link_configurationDetails_project_id_12, 'link_configurationDetails_job_id': link_configurationDetails_job_id_12]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 130-Click on link configurationDetails Sessions2.png')

"Step 131: Click on link configurationDetails (Configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_13, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_13, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_13, 'link_configurationDetails_team_id': link_configurationDetails_team_id_13, 'link_configurationDetails_project_id': link_configurationDetails_project_id_13, 'link_configurationDetails_job_id': link_configurationDetails_job_id_13]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 131-Click on link configurationDetails Configuration4.png')

"Step 132: Click on link testRuns (TestRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild_2, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 132-Click on link testRuns TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 133: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 133-Click on label object.png')

"Step 134: Click on button gridActions (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions', ['button_gridActions_internalRoleButtonName': button_gridActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 134-Click on button gridActions Delete.png')

"Step 135: Click on button Delete2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 135-Click on button Delete2 - Navigate to page teamproject.png')

"Step 136: Click on link testSuiteDetails (UntitledTestRun3) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_trNthChild': link_testSuiteDetails_trNthChild_2, 'link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName_4, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id_4, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id_4, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 136-Click on link testSuiteDetails UntitledTestRun3 - Navigate to page teamprojectgridplanjob.png')

"Step 137: Click on link configurationDetails (Sessions3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_14, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_14, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_14, 'link_configurationDetails_team_id': link_configurationDetails_team_id_14, 'link_configurationDetails_project_id': link_configurationDetails_project_id_14, 'link_configurationDetails_job_id': link_configurationDetails_job_id_14]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 137-Click on link configurationDetails Sessions3 - Navigate to page teamprojectgridplanjob.png')

"Step 138: Click on link configurationDetails (Configuration5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_15, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_15, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_15, 'link_configurationDetails_team_id': link_configurationDetails_team_id_15, 'link_configurationDetails_project_id': link_configurationDetails_project_id_15, 'link_configurationDetails_job_id': link_configurationDetails_job_id_15]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 138-Click on link configurationDetails Configuration5.png')

"Step 139: Delete specified test runs from the system."

deleteTestRuns.execute(data_path_3, Integer.valueOf(index_3))

"Step 140: Click on link testSuiteDetails (UntitledTestRun2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_trNthChild': link_testSuiteDetails_trNthChild_3, 'link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName_5, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id_5, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id_5, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 140-Click on link testSuiteDetails UntitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 141: Click on link configurationDetails (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_16, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_16, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_16, 'link_configurationDetails_team_id': link_configurationDetails_team_id_16, 'link_configurationDetails_project_id': link_configurationDetails_project_id_16, 'link_configurationDetails_job_id': link_configurationDetails_job_id_16]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 141-Click on link configurationDetails Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 142: Click on span Failed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/span_Failed'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 142-Click on span Failed.png')

"Step 143: Delete specified test runs from the system."

deleteTestRuns.execute(data_path_4, Integer.valueOf(index_4))

"Step 144: Click on link testManagement (Calendar3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_11, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_13]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 144-Click on link testManagement Calendar3.png')

"Step 145: Click on div testRunDetails (TestRun6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_7, 'div_testRunDetails_internalText': div_testRunDetails_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 145-Click on div testRunDetails TestRun6.png')

"Step 146: Click on div testRunDetails (TestRun7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_8, 'div_testRunDetails_internalText': div_testRunDetails_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 146-Click on div testRunDetails TestRun7.png')

"Step 147: Click on div testRunDetails (TestRun6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_9, 'div_testRunDetails_internalText': div_testRunDetails_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 147-Click on div testRunDetails TestRun6.png')

"Step 148: Click on div testRunDetails (TestRun7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_class': div_testRunDetails_class_10, 'div_testRunDetails_internalText': div_testRunDetails_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 148-Click on div testRunDetails TestRun7.png')

"Step 149: Click on div CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 149-Click on div CloseButton.png')

"Step 150: Click on link testManagement (Schedules4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_12, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_14]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 150-Click on link testManagement Schedules4.png')

"Step 151: Click on div dynamicObject (Info) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1', ['div_dynamicObject_internalText': div_dynamicObject_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 151-Click on div dynamicObject Info - Navigate to page .png')

"Step 152: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC104-Delete Test Runs from Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}