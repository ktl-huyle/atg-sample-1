import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/*/home")

"Step 4: Click on link projectLinks (FirstProject3) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 4-Click on link projectLinks FirstProject3 - Navigate to page teamproject.png')

"Step 5: Click on link ViewAll -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewAll'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 5-Click on link ViewAll - Navigate to page teamprojectreleases.png')

"Step 6: Click on link Requirements3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 6-Click on link Requirements3 - Navigate to page teamproject.png')

"Step 7: Click on link Releases -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Releases'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 7-Click on link Releases - Navigate to page teamprojectreleases.png')

"Step 8: Click on link reports (Settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases/link_reports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases/link_reports', ['link_reports_nthChild': link_reports_nthChild, 'link_reports_internalRoleLinkName': link_reports_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 8-Click on link reports Settings - Navigate to page teamproject.png')

"Step 9: Click on link testResources (ScriptRepositories5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 9-Click on link testResources ScriptRepositories5.png')

"Step 10: Click on link ConnectGitRepository -> Navigate to page 'team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConnectGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 10-Click on link ConnectGitRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 11: Click on div gitSetup (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup', ['div_gitSetup_nthChild': div_gitSetup_nthChild, 'div_gitSetup_dataTestid': div_gitSetup_dataTestid, 'div_gitSetup_internalHasText': div_gitSetup_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 11-Click on div gitSetup object.png')

"Step 12: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 12-Click on div object2.png')

"Step 13: Click on div gitSetup (CreateNewGit)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup', ['div_gitSetup_nthChild': div_gitSetup_nthChild_1, 'div_gitSetup_dataTestid': div_gitSetup_dataTestid_1, 'div_gitSetup_internalHasText': div_gitSetup_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 13-Click on div gitSetup CreateNewGit.png')

"Step 14: Click on input repository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_repository'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 14-Click on input repository.png')

"Step 15: Enter input value in input repository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_repository'), input_repository)

WebUI.takeScreenshot(reportLocation + '/TC93/Step 15-Enter input value in input repository.png')

"Step 16: Click on div objectDetails (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_objectDetails'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 16-Click on div objectDetails object3.png')

"Step 17: Enter input value in input repository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_repository'), input_repository_1)

WebUI.takeScreenshot(reportLocation + '/TC93/Step 17-Enter input value in input repository.png')

"Step 18: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 18-Click on input Username.png')

"Step 19: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username'), input_Username)

WebUI.takeScreenshot(reportLocation + '/TC93/Step 19-Enter input value in input Username.png')

"Step 20: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 20-Click on input Password.png')

"Step 21: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Password'), input_Password)

WebUI.takeScreenshot(reportLocation + '/TC93/Step 21-Enter input value in input Password.png')

"Step 22: Click on button Connect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/button_Connect'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 22-Click on button Connect.png')

"Step 23: Click on button Connect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/button_Connect'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 23-Click on button Connect.png')

"Step 24: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 24-Click on input name.png')

"Step 25: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 25-Click on div object4.png')

"Step 26: Click on div gitSetup (gitSetUpCreateNew)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup_1', ['div_gitSetup_dataTestid': div_gitSetup_dataTestid_2]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 26-Click on div gitSetup gitSetUpCreateNew.png')

"Step 27: Click on div gitSetUpUseSample"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_gitSetUpUseSample'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 27-Click on div gitSetUpUseSample.png')

"Step 28: Click on div gitSetup (gitSetUpUseSample2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup_1', ['div_gitSetup_dataTestid': div_gitSetup_dataTestid_3]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 28-Click on div gitSetup gitSetUpUseSample2.png')

"Step 29: Click on div gitSetup (CreateNewGit)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_git_test_project_setup/div_gitSetup', ['div_gitSetup_nthChild': div_gitSetup_nthChild_2, 'div_gitSetup_dataTestid': div_gitSetup_dataTestid_4, 'div_gitSetup_internalHasText': div_gitSetup_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 29-Click on div gitSetup CreateNewGit.png')

"Step 30: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 30-Click on div object4.png')

"Step 31: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 31-Click on div object5.png')

"Step 32: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 32-Click on div object4.png')

"Step 33: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 33-Click on span object.png')

"Step 34: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 34-Click on div object6.png')

"Step 35: Click on button create -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 35-Click on button create - Navigate to page teamprojecttest-project.png')

"Step 36: Click on link TestEnvironments2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_TestEnvironments2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 36-Click on link TestEnvironments2 - Navigate to page teamproject.png')

"Step 37: Click on link CreateLocalTestEnvironment -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_CreateLocalTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 37-Click on link CreateLocalTestEnvironment - Navigate to page organizationsettingstest-environment-installation.png')

"Step 38: Click on button DownloadAgent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/button_DownloadAgent'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 38-Click on button DownloadAgent.png')

"Step 39: Click on link Copy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 39-Click on link Copy.png')

"Step 40: Click on link Copy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 40-Click on link Copy2.png')

"Step 41: Click on link Copy3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 41-Click on link Copy3.png')

"Step 42: Click on span StepConnector"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/span_StepConnector'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 42-Click on span StepConnector.png')

"Step 43: Click on link Copy3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 43-Click on link Copy3.png')

"Step 44: Click on link Copy4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 44-Click on link Copy4.png')

"Step 45: Click on link TestEnvironments -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 45-Click on link TestEnvironments - Navigate to page organizationsettingsagent.png')

"Step 46: Click on link AgentSetup2 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 46-Click on link AgentSetup2 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 47: Click on link TestEnvironments -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 47-Click on link TestEnvironments - Navigate to page organizationsettingsagent.png')

"Step 48: Click on link agentSettings (MyAgent) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentSettings', ['organization_id': organization_id, 'local_id': local_id]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 48-Click on link agentSettings MyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 49: Click on input SelectProjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/input_SelectProjects'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 49-Click on input SelectProjects.png')

"Step 50: Click on button Open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Open'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 50-Click on button Open.png')

"Step 51: Click on input SelectProjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/input_SelectProjects'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 51-Click on input SelectProjects.png')

"Step 52: Click on button Open2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Open2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 52-Click on button Open2.png')

"Step 53: Click on div FirstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 53-Click on div FirstProject.png')

"Step 54: Click on form Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/form_Name'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 54-Click on form Name.png')

"Step 55: Click on span FirstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 55-Click on span FirstProject.png')

"Step 56: Click on button Open2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Open2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 56-Click on button Open2.png')

"Step 57: Click on div Column12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_Column12'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 57-Click on div Column12.png')

"Step 58: Click on span FirstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 58-Click on span FirstProject.png')

"Step 59: Click on button Open2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Open2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 59-Click on button Open2.png')

"Step 60: Click on div UpdateOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_UpdateOption'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 60-Click on div UpdateOption.png')

"Step 61: Click on span FirstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 61-Click on span FirstProject.png')

"Step 62: Click on button Update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_Update'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 62-Click on button Update.png')

"Step 63: Click on link AgentSetup -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 63-Click on link AgentSetup - Navigate to page organizationsettingstest-environment-installation.png')

"Step 64: Click on link ScheduleTestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 64-Click on link ScheduleTestRuns - Navigate to page teamproject.png')

"Step 65: Click on div scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 65-Click on div scheduleTestRun.png')

"Step 66: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 66-Click on div object3.png')

"Step 67: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 67-Click on div object3.png')

"Step 68: Click on div TestSuiteIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 68-Click on div TestSuiteIcon2.png')

"Step 69: Click on div TestSuiteIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 69-Click on div TestSuiteIcon2.png')

"Step 70: Click on div TestSuiteIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 70-Click on div TestSuiteIcon2.png')

"Step 71: Click on div TestSuiteIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 71-Click on div TestSuiteIcon2.png')

"Step 72: Click on div ExecutionProfileIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 72-Click on div ExecutionProfileIcon2.png')

"Step 73: Click on div ExecutionProfileIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 73-Click on div ExecutionProfileIcon2.png')

"Step 74: Click on div TestSuiteIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 74-Click on div TestSuiteIcon2.png')

"Step 75: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 75-Click on div object4.png')

"Step 76: Click on div TestSuiteIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 76-Click on div TestSuiteIcon2.png')

"Step 77: Click on button TestSuiteCollection2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestSuiteCollection2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 77-Click on button TestSuiteCollection2.png')

"Step 78: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 78-Click on div object5.png')

"Step 79: Click on div TestSuiteCollection3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteCollection3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 79-Click on div TestSuiteCollection3.png')

"Step 80: Click on div TestSuiteCollection3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteCollection3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 80-Click on div TestSuiteCollection3.png')

"Step 81: Click on div TestSuiteCollection3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteCollection3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 81-Click on div TestSuiteCollection3.png')

"Step 82: Click on button TestSuite2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestSuite2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 82-Click on button TestSuite2.png')

"Step 83: Click on div SelectEnvironment4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 83-Click on div SelectEnvironment4.png')

"Step 84: Click on div SelectEnvironment5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment5'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 84-Click on div SelectEnvironment5.png')

"Step 85: Click on button Run4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 85-Click on button Run4.png')

"Step 86: Click on div SelectEnvironment4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 86-Click on div SelectEnvironment4.png')

"Step 87: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 87-Click on div object6.png')

"Step 88: Click on div ReactSelectControlIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControlIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 88-Click on div ReactSelectControlIndicator2.png')

"Step 89: Click on div ReactSelectControlIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControlIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 89-Click on div ReactSelectControlIndicator2.png')

"Step 90: Click on item MoreOptions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 90-Click on item MoreOptions2.png')

"Step 91: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 91-Click on div object7.png')

"Step 92: Click on button mobileBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_mobileBrowsers_1'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 92-Click on button mobileBrowsers.png')

"Step 93: Click on button webServices"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_webServices_1'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 93-Click on button webServices.png')

"Step 94: Click on input RadioButtonA3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButtonA3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 94-Click on input RadioButtonA3.png')

"Step 95: Click on div BrowserTypeIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_BrowserTypeIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 95-Click on div BrowserTypeIndicator2.png')

"Step 96: Click on div Indicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 96-Click on div Indicator2.png')

"Step 97: Click on div object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 97-Click on div object8.png')

"Step 98: Click on div ExecutionProfileDetail3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileDetail3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 98-Click on div ExecutionProfileDetail3.png')

"Step 99: Click on div ExecutionProfileDetail3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileDetail3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 99-Click on div ExecutionProfileDetail3.png')

"Step 100: Click on div BrowserTypeIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_BrowserTypeIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 100-Click on div BrowserTypeIndicator2.png')

"Step 101: Click on div object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object9'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 101-Click on div object9.png')

"Step 102: Click on div ExecutionProfileDetail3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileDetail3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 102-Click on div ExecutionProfileDetail3.png')

"Step 103: Click on div ExecutionProfileDetail3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileDetail3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 103-Click on div ExecutionProfileDetail3.png')

"Step 104: Click on div ExecutionProfileDetail3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileDetail3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 104-Click on div ExecutionProfileDetail3.png')

"Step 105: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 105-Click on button Save3.png')

"Step 106: Click on div UnknownContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnknownContent2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 106-Click on div UnknownContent2.png')

"Step 107: Click on div UnknownContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnknownContent2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 107-Click on div UnknownContent2.png')

"Step 108: Click on label repeat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_repeat'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 108-Click on label repeat.png')

"Step 109: Click on input endTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_endTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 109-Click on input endTime.png')

"Step 110: Click on button chooseDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_chooseDate_1'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 110-Click on button chooseDate.png')

"Step 111: Click on button projectActions (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions_1', ['button_projectActions_internalRoleTabName': button_projectActions_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 111-Click on button projectActions object.png')

"Step 112: Click on label objectName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_objectName'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 112-Click on label objectName.png')

"Step 113: Click on button TestSuite3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestSuite3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 113-Click on button TestSuite3.png')

"Step 114: Click on label objectName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_objectName'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 114-Click on label objectName.png')

"Step 115: Click on label objectName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_objectName'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 115-Click on label objectName.png')

"Step 116: Click on div object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object10'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 116-Click on div object10.png')

"Step 117: Click on div Days"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Days'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 117-Click on div Days.png')

"Step 118: Click on button Schedule"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Schedule'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 118-Click on button Schedule.png')

"Step 119: Click on link testResources (Schedules3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_1, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 119-Click on link testResources Schedules3.png')

"Step 120: Click on link untitledTestRuns (UntitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns', ['link_untitledTestRuns_trNthChild': link_untitledTestRuns_trNthChild, 'link_untitledTestRuns_internalRoleLinkName': link_untitledTestRuns_internalRoleLinkName, 'team_id': team_id_1, 'plan_id': plan_id, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 120-Click on link untitledTestRuns UntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 121: Click on link configuration (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName, 'team_id': team_id_2, 'plan_id': plan_id_1, 'job_id': job_id, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 121-Click on link configuration Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 122: Click on link configuration (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_1, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_1, 'team_id': team_id_3, 'plan_id': plan_id_2, 'job_id': job_id_1, 'project_id': project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 122-Click on link configuration Sessions2.png')

"Step 123: Click on link testRuns (TestRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 123-Click on link testRuns TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 124: Click on link calendar (Calendar) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendar"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendar', ['link_calendar_internalRoleLinkName': link_calendar_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 124-Click on link calendar Calendar - Navigate to page teamproject.png')

"Step 125: Click on link testResources (Schedules4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_2, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 125-Click on link testResources Schedules4.png')

"Step 126: Click on div dashboard (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dashboard"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dashboard', ['div_dashboard_internalText': div_dashboard_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 126-Click on div dashboard object11.png')

"Step 127: Click on link untitledTestRuns (UntitledTestRun) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns', ['link_untitledTestRuns_trNthChild': link_untitledTestRuns_trNthChild_1, 'link_untitledTestRuns_internalRoleLinkName': link_untitledTestRuns_internalRoleLinkName_1, 'team_id': team_id_4, 'plan_id': plan_id_3, 'project_id': project_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 127-Click on link untitledTestRuns UntitledTestRun - Navigate to page teamprojectgridplanjob.png')

"Step 128: Click on button IncompleteTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteTest'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 128-Click on button IncompleteTest.png')

"Step 129: Click on div objectDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_objectDetails'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 129-Click on div objectDetails object.png')

"Step 130: Click on div testRunDetails (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails', ['div_testRunDetails_internalText': div_testRunDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 130-Click on div testRunDetails UntitledTestRun.png')

"Step 131: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 131-Click on div object2.png')

"Step 132: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 132-Click on label object.png')

"Step 133: Click on th Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/th_Name'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 133-Click on th Name.png')

"Step 134: Click on button IncompleteTest2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteTest2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 134-Click on button IncompleteTest2.png')

"Step 135: Click on div objectDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_objectDetails'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 135-Click on div objectDetails object.png')

"Step 136: Click on link configuration (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_2, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_2, 'team_id': team_id_5, 'plan_id': plan_id_4, 'job_id': job_id_2, 'project_id': project_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 136-Click on link configuration Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 137: Click on link configuration (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_3, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_3, 'team_id': team_id_6, 'plan_id': plan_id_5, 'job_id': job_id_3, 'project_id': project_id_6]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 137-Click on link configuration Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 138: Click on link configuration (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_4, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_4, 'team_id': team_id_7, 'plan_id': plan_id_6, 'job_id': job_id_4, 'project_id': project_id_7]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 138-Click on link configuration Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 139: Click on link MyAgent -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_MyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 139-Click on link MyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 140: Click on span FirstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 140-Click on span FirstProject.png')

"Step 141: Click on span FirstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/span_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 141-Click on span FirstProject.png')

"Step 142: Click on input SelectProjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/input_SelectProjects'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 142-Click on input SelectProjects.png')

"Step 143: Click on div UpdateOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/div_UpdateOption'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 143-Click on div UpdateOption.png')

"Step 144: Click on button object -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 144-Click on button object - Navigate to page organizationhome.png')

"Step 145: Click on link executionDetails (UntitledTestRun) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails', ['link_executionDetails_class': link_executionDetails_class, 'link_executionDetails_nthChild': link_executionDetails_nthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'team_id': team_id_8, 'executions_id': executions_id, 'project_id': project_id_8]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 145-Click on link executionDetails UntitledTestRun - Navigate to page teamprojectexecutions.png')

"Step 146: Click on link TestResults11 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults11'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 146-Click on link TestResults11 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 147: Click on link Summary3 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 147-Click on link Summary3 - Navigate to page teamprojectexecutions.png')

"Step 148: Click on div TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 148-Click on div TestRun.png')

"Step 149: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Requirements_1'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 149-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 150: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases_1'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 150-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 151: Click on link defects (VisualTesting) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects', ['link_defects_internalRoleLinkName': link_defects_internalRoleLinkName, 'team_id': team_id_9, 'path_param_5': path_param_5, 'project_id': project_id_9]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 151-Click on link defects VisualTesting - Navigate to page teamproject.png')

"Step 152: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 152-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 153: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 153-Click on link TestRuns - Navigate to page teamproject.png')

"Step 154: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 154-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 155: Click on item TestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/item_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 155-Click on item TestCases.png')

"Step 156: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases_1'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 156-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 157: Click on link defects (Defects) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects', ['link_defects_internalRoleLinkName': link_defects_internalRoleLinkName_1, 'team_id': team_id_10, 'path_param_5': path_param_5_1, 'project_id': project_id_10]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 157-Click on link defects Defects - Navigate to page teamproject.png')

"Step 158: Click on link testResources (VisualTesting2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_3, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 158-Click on link testResources VisualTesting2.png')

"Step 159: Click on link FirstProject -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 159-Click on link FirstProject - Navigate to page teamprojectreleases.png')

"Step 160: Click on link Tests5 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests5'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 160-Click on link Tests5 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 161: Click on span SvgIcon2 -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_SvgIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 161-Click on span SvgIcon2 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 162: Click on link settings (Settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_settings', ['link_settings_internalRoleLinkName': link_settings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 162-Click on link settings Settings - Navigate to page teamproject.png')

"Step 163: Click on link testResources (TestCloudTunnels5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_4, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 163-Click on link testResources TestCloudTunnels5.png')

"Step 164: Click on link testResources (Integrations3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_5, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 164-Click on link testResources Integrations3.png')

"Step 165: Click on link testResources (TestEnvironments3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_6, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 165-Click on link testResources TestEnvironments3.png')

"Step 166: Click on link Reports12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports12'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 166-Click on link Reports12.png')

"Step 167: Click on link Dashboard5 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard5'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 167-Click on link Dashboard5 - Navigate to page teamproject.png')

"Step 168: Click on link Planning6 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning6'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 168-Click on link Planning6 - Navigate to page teamprojectreleases.png')

"Step 169: Click on link Requirements3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 169-Click on link Requirements3 - Navigate to page teamproject.png')

"Step 170: Click on link Settings9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings9'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 170-Click on link Settings9.png')

"Step 171: Click on link Reports12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports12'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 171-Click on link Reports12.png')

"Step 172: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 172-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 173: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases_1'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 173-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 174: Click on link defects (Defects) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects', ['link_defects_internalRoleLinkName': link_defects_internalRoleLinkName_2, 'team_id': team_id_11, 'path_param_5': path_param_5_2, 'project_id': project_id_11]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 174-Click on link defects Defects - Navigate to page teamproject.png')

"Step 175: Click on link testResources (VisualTesting2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_7, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 175-Click on link testResources VisualTesting2.png')

"Step 176: Click on button projectActions (FirstProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 176-Click on button projectActions FirstProject.png')

"Step 177: Click on link myOrganization (MyOrganization) -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_myOrganization"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_myOrganization', ['organization_id': organization_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 177-Click on link myOrganization MyOrganization - Navigate to page organizationhome.png')

"Step 178: Click on link executionDetails (TestRun) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails', ['link_executionDetails_class': link_executionDetails_class_1, 'link_executionDetails_nthChild': link_executionDetails_nthChild_1, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'team_id': team_id_12, 'executions_id': executions_id_1, 'project_id': project_id_12]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 178-Click on link executionDetails TestRun - Navigate to page teamprojectexecutions.png')

"Step 179: Click on div TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 179-Click on div TestRun.png')

"Step 180: Click on link MyAgent -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_MyAgent'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 180-Click on link MyAgent - Navigate to page organizationsettingsagent.png')

"Step 181: Click on link AgentSetup2 -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 181-Click on link AgentSetup2 - Navigate to page organizationsettingstest-environment-installation.png')

"Step 182: Click on link ScheduleTestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 182-Click on link ScheduleTestRuns - Navigate to page teamproject.png')

"Step 183: Click on div ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ScheduleTestRun_1'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 183-Click on div ScheduleTestRun.png')

"Step 184: Click on div SelectEnvironment4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 184-Click on div SelectEnvironment4.png')

"Step 185: Click on item MoreOptions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 185-Click on item MoreOptions2.png')

"Step 186: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 186-Click on div object7.png')

"Step 187: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 187-Click on div object7.png')

"Step 188: Click on input RadioButtonA3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButtonA3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 188-Click on input RadioButtonA3.png')

"Step 189: Click on div ReactSelectValueContainer3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectValueContainer3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 189-Click on div ReactSelectValueContainer3.png')

"Step 190: Click on div object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 190-Click on div object8.png')

"Step 191: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 191-Click on button Save3.png')

"Step 192: Click on input Name4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 192-Click on input Name4.png')

"Step 193: Click on input Name4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 193-Click on input Name4.png')

"Step 194: Click on input Name4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 194-Click on input Name4.png')

"Step 195: Click on div Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Name3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 195-Click on div Name3.png')

"Step 196: Enter input value in input Name4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name4'), input_Name4)

WebUI.takeScreenshot(reportLocation + '/TC93/Step 196-Enter input value in input Name4.png')

"Step 197: Click on div UnknownContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnknownContent2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 197-Click on div UnknownContent2.png')

"Step 198: Click on label repeat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_repeat'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 198-Click on label repeat.png')

"Step 199: Click on button ChooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ChooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 199-Click on button ChooseDate2.png')

"Step 200: Click on input ConfirmStartTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_ConfirmStartTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 200-Click on input ConfirmStartTime.png')

"Step 201: Click on button ChooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ChooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 201-Click on button ChooseDate2.png')

"Step 202: Click on input ConfirmStartTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_ConfirmStartTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 202-Click on input ConfirmStartTime.png')

"Step 203: Click on input ConfirmStartTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_ConfirmStartTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 203-Click on input ConfirmStartTime.png')

"Step 204: Click on input ConfirmStartTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_ConfirmStartTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 204-Click on input ConfirmStartTime.png')

"Step 205: Click on input ConfirmStartTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_ConfirmStartTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 205-Click on input ConfirmStartTime.png')

"Step 206: Click on button ChooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ChooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 206-Click on button ChooseDate2.png')

"Step 207: Click on button PickTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_PickTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 207-Click on button PickTime.png')

"Step 208: Click on div Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 208-Click on div Unknown.png')

"Step 209: Click on button ChooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ChooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 209-Click on button ChooseDate2.png')

"Step 210: Click on button PickTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_PickTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 210-Click on button PickTime.png')

"Step 211: Click on div Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 211-Click on div Unknown.png')

"Step 212: Click on button ChooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ChooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 212-Click on button ChooseDate2.png')

"Step 213: Click on button PickTime2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_PickTime2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 213-Click on button PickTime2.png')

"Step 214: Click on div Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 214-Click on div Unknown.png')

"Step 215: Click on input endTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_endTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 215-Click on input endTime.png')

"Step 216: Click on input endTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_endTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 216-Click on input endTime.png')

"Step 217: Click on button chooseDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_chooseDate_1'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 217-Click on button chooseDate.png')

"Step 218: Click on button projectActions (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions_1', ['button_projectActions_internalRoleTabName': button_projectActions_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 218-Click on button projectActions object.png')

"Step 219: Click on div Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 219-Click on div Unknown.png')

"Step 220: Click on div Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 220-Click on div Unknown.png')

"Step 221: Click on button ChooseDate3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ChooseDate3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 221-Click on button ChooseDate3.png')

"Step 222: Click on button PickTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_PickTime'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 222-Click on button PickTime.png')

"Step 223: Click on div Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 223-Click on div Unknown.png')

"Step 224: Click on div Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 224-Click on div Unknown.png')

"Step 225: Click on div Days2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Days2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 225-Click on div Days2.png')

"Step 226: Click on button Schedule"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Schedule'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 226-Click on button Schedule.png')

"Step 227: Click on link testResources (Schedules3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_8, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 227-Click on link testResources Schedules3.png')

"Step 228: Click on link untitledTestRuns (UntitledTestRun2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns', ['link_untitledTestRuns_trNthChild': link_untitledTestRuns_trNthChild_2, 'link_untitledTestRuns_internalRoleLinkName': link_untitledTestRuns_internalRoleLinkName_2, 'team_id': team_id_13, 'plan_id': plan_id_7, 'project_id': project_id_13]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 228-Click on link untitledTestRuns UntitledTestRun2 - Navigate to page teamprojectgridplanjob.png')

"Step 229: Click on div testRunDetails (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/div_testRunDetails', ['div_testRunDetails_internalText': div_testRunDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 229-Click on div testRunDetails UntitledTestRun.png')

"Step 230: Click on button IncompleteTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_IncompleteTest'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 230-Click on button IncompleteTest.png')

"Step 231: Click on link configuration (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_5, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_5, 'team_id': team_id_14, 'plan_id': plan_id_8, 'job_id': job_id_5, 'project_id': project_id_14]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 231-Click on link configuration Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 232: Click on link configuration (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_6, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_6, 'team_id': team_id_15, 'plan_id': plan_id_9, 'job_id': job_id_6, 'project_id': project_id_15]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 232-Click on link configuration Sessions2.png')

"Step 233: Click on link configuration (Configuration4) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_7, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_7, 'team_id': team_id_16, 'plan_id': plan_id_10, 'job_id': job_id_7, 'project_id': project_id_16]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 233-Click on link configuration Configuration4 - Navigate to page teamprojectgridplanjob.png')

"Step 234: Click on link configuration (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_8, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_8, 'team_id': team_id_17, 'plan_id': plan_id_11, 'job_id': job_id_8, 'project_id': project_id_17]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 234-Click on link configuration Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 235: Click on link configuration (Configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_9, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_9, 'team_id': team_id_18, 'plan_id': plan_id_12, 'job_id': job_id_9, 'project_id': project_id_18]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 235-Click on link configuration Configuration4.png')

"Step 236: Click on link testRuns (TestRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild_1, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 236-Click on link testRuns TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 237: Click on link configuration (Sessions2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_10, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_10, 'team_id': team_id_19, 'plan_id': plan_id_13, 'job_id': job_id_10, 'project_id': project_id_19]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 237-Click on link configuration Sessions2 - Navigate to page teamprojectgridplanjob.png')

"Step 238: Click on link Schedules2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 238-Click on link Schedules2 - Navigate to page teamproject.png')

"Step 239: Click on link testResources (Calendar2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_9, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_9]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 239-Click on link testResources Calendar2.png')

"Step 240: Click on button Month"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Month'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 240-Click on button Month.png')

"Step 241: Click on div testRuns (TestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRuns', ['div_testRuns_class': div_testRuns_class, 'div_testRuns_internalText': div_testRuns_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 241-Click on div testRuns TestRun.png')

"Step 242: Click on div testRuns (TestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRuns', ['div_testRuns_class': div_testRuns_class_1, 'div_testRuns_internalText': div_testRuns_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 242-Click on div testRuns TestRun2.png')

"Step 243: Click on link Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 243-Click on link Details2 - Navigate to page teamprojectexecutions.png')

"Step 244: Click on link TestResults11 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults11'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 244-Click on link TestResults11 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 245: Click on link Summary3 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 245-Click on link Summary3 - Navigate to page teamprojectexecutions.png')

"Step 246: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 246-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 247: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 247-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 248: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 248-Click on link TestRuns - Navigate to page teamproject.png')

"Step 249: Click on link Settings9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings9'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 249-Click on link Settings9.png')

"Step 250: Click on link testResources (ScriptRepositories5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_10, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_10]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 250-Click on link testResources ScriptRepositories5.png')

"Step 251: Click on link testResources (TestEnvironments3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_11, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_11]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 251-Click on link testResources TestEnvironments3.png')

"Step 252: Click on link TestCloud -> Navigate to page 'team/*/project/*/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 252-Click on link TestCloud - Navigate to page teamprojectagenttest-cloud.png')

"Step 253: Click on link Local -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_test_cloud/link_Local'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 253-Click on link Local - Navigate to page teamproject.png')

"Step 254: Click on link agentSettings (MyAgent) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_agentSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_agentSettings', ['organization_id': organization_id_2, 'local_id': local_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 254-Click on link agentSettings MyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 255: Click on link AgentSetup -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 255-Click on link AgentSetup - Navigate to page organizationsettingstest-environment-installation.png')

"Step 256: Click on link ScheduleTestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 256-Click on link ScheduleTestRuns - Navigate to page teamproject.png')

"Step 257: Click on div TestSuiteIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 257-Click on div TestSuiteIcon2.png')

"Step 258: Click on div TestSuites2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 258-Click on div TestSuites2.png')

"Step 259: Click on div SelectEnvironment4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 259-Click on div SelectEnvironment4.png')

"Step 260: Click on input RadioButtonA3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButtonA3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 260-Click on input RadioButtonA3.png')

"Step 261: Click on div ReactSelectValueContainer3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectValueContainer3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 261-Click on div ReactSelectValueContainer3.png')

"Step 262: Click on div CreatedWithSketch3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketch3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 262-Click on div CreatedWithSketch3.png')

"Step 263: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 263-Click on button Save3.png')

"Step 264: Click on button Run4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run4'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 264-Click on button Run4.png')

"Step 265: Click on div testRuns (TestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRuns', ['div_testRuns_class': div_testRuns_class_2, 'div_testRuns_internalText': div_testRuns_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 265-Click on div testRuns TestRun3.png')

"Step 266: Click on div testRuns (TestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRuns', ['div_testRuns_class': div_testRuns_class_3, 'div_testRuns_internalText': div_testRuns_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 266-Click on div testRuns TestRun4.png')

"Step 267: Click on div testRuns (TestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRuns', ['div_testRuns_class': div_testRuns_class_4, 'div_testRuns_internalText': div_testRuns_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 267-Click on div testRuns TestRun3.png')

"Step 268: Click on div testRuns (TestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRuns', ['div_testRuns_class': div_testRuns_class_5, 'div_testRuns_internalText': div_testRuns_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 268-Click on div testRuns TestRun4.png')

"Step 269: Click on div testRuns (TestRun5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRuns', ['div_testRuns_class': div_testRuns_class_6, 'div_testRuns_internalText': div_testRuns_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 269-Click on div testRuns TestRun5.png')

"Step 270: Click on link testResources (Schedules4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_12, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_12]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 270-Click on link testResources Schedules4.png')

"Step 271: Click on button TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 271-Click on button TestRun.png')

"Step 272: Click on link untitledTestRuns (UntitledTestRun3) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns', ['link_untitledTestRuns_trNthChild': link_untitledTestRuns_trNthChild_3, 'link_untitledTestRuns_internalRoleLinkName': link_untitledTestRuns_internalRoleLinkName_3, 'team_id': team_id_20, 'plan_id': plan_id_14, 'project_id': project_id_20]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 272-Click on link untitledTestRuns UntitledTestRun3 - Navigate to page teamprojectgridplanjob.png')

"Step 273: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 273-Click on label object.png')

"Step 274: Click on button jobActions (Delete3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_jobActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_jobActions', ['button_jobActions_internalRoleButtonName': button_jobActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 274-Click on button jobActions Delete3.png')

"Step 275: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 275-Click on button Delete2.png')

"Step 276: Click on link Schedules2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 276-Click on link Schedules2 - Navigate to page teamproject.png')

"Step 277: Click on link untitledTestRun (UntitledTestRun4) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRun', ['team_id': team_id_21, 'plan_id': plan_id_15, 'project_id': project_id_21]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 277-Click on link untitledTestRun UntitledTestRun4 - Navigate to page teamprojectgridplanjob.png')

"Step 278: Click on link configuration (Configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_11, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_11, 'team_id': team_id_22, 'plan_id': plan_id_16, 'job_id': job_id_11, 'project_id': project_id_22]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 278-Click on link configuration Configuration4.png')

"Step 279: Click on link configuration (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_12, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_12, 'team_id': team_id_23, 'plan_id': plan_id_17, 'job_id': job_id_12, 'project_id': project_id_23]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 279-Click on link configuration Sessions2.png')

"Step 280: Click on link configuration (Configuration4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_13, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_13, 'team_id': team_id_24, 'plan_id': plan_id_18, 'job_id': job_id_13, 'project_id': project_id_24]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 280-Click on link configuration Configuration4.png')

"Step 281: Click on link testRuns (TestRuns2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild_2, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 281-Click on link testRuns TestRuns2 - Navigate to page teamprojectgridplanjob.png')

"Step 282: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 282-Click on label object.png')

"Step 283: Click on button jobActions (Delete3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_jobActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_jobActions', ['button_jobActions_internalRoleButtonName': button_jobActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 283-Click on button jobActions Delete3.png')

"Step 284: Click on button Delete2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 284-Click on button Delete2 - Navigate to page teamproject.png')

"Step 285: Click on link untitledTestRuns (UntitledTestRun3) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_untitledTestRuns', ['link_untitledTestRuns_trNthChild': link_untitledTestRuns_trNthChild_4, 'link_untitledTestRuns_internalRoleLinkName': link_untitledTestRuns_internalRoleLinkName_4, 'team_id': team_id_25, 'plan_id': plan_id_19, 'project_id': project_id_25]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 285-Click on link untitledTestRuns UntitledTestRun3 - Navigate to page teamprojectgridplanjob.png')

"Step 286: Click on link configuration (Sessions3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_14, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_14, 'team_id': team_id_26, 'plan_id': plan_id_20, 'job_id': job_id_14, 'project_id': project_id_26]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 286-Click on link configuration Sessions3 - Navigate to page teamprojectgridplanjob.png')

"Step 287: Click on link configuration (Configuration5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configuration', ['link_configuration_nthChild': link_configuration_nthChild_15, 'link_configuration_internalRoleLinkName': link_configuration_internalRoleLinkName_15, 'team_id': team_id_27, 'plan_id': plan_id_21, 'job_id': job_id_15, 'project_id': project_id_27]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 287-Click on link configuration Configuration5.png')

"Step 288: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 288-Click on button Delete.png')

"Step 289: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 289-Click on button Delete2.png')

"Step 290: Click on input SpinButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/input_SpinButton'))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 290-Click on input SpinButton - Navigate to page .png')

"Step 291: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC93-Verify Home Page Navigation After Test Run Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}