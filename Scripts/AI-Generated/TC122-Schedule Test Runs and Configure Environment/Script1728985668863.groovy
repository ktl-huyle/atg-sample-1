import truetest.common.configureTestEnvironmentAndSaveSettings
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 3: Navigate to /team/*/project/*/test-project"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-project")

"Step 4: Click on td testProject (TestProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject', ['td_testProject_internalRoleCellName': td_testProject_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 4-Click on td testProject TestProject.png')

"Step 5: Click on td testProject (TestProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject', ['td_testProject_internalRoleCellName': td_testProject_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 5-Click on td testProject TestProject.png')

"Step 6: Click on link testProjects (TestProject2) -> Navigate to page '/team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects', ['link_testProjects_trNthChild': link_testProjects_trNthChild, 'link_testProjects_internalRoleLinkName': link_testProjects_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 6-Click on link testProjects TestProject2 - Navigate to page teamprojecttest-project.png')

"Step 7: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 7-Click on button RefreshScriptRepository.png')

"Step 8: Click on button AlertButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_AlertButton'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 8-Click on button AlertButton.png')

"Step 9: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 9-Click on button ScheduleTestRun.png')

"Step 10: Configure test environment and save settings"

configureTestEnvironmentAndSaveSettings.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on button Alert"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_Alert'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 11-Click on button Alert.png')

"Step 12: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 12-Click on span Settings.png')

"Step 13: Click on link OrganizationSetup -> Navigate to page '/organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/link_OrganizationSetup'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 13-Click on link OrganizationSetup - Navigate to page organizationsettingsagent.png')

"Step 14: Click on link AgentSetup -> Navigate to page '/team/*/project/*/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 14-Click on link AgentSetup - Navigate to page teamprojecttest-planning.png')

"Step 15: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 15-Click on button ScheduleTestRun.png')

"Step 16: Configure test environment and save settings"

configureTestEnvironmentAndSaveSettings.execute(data_path_1, Integer.valueOf(index_1))

"Step 17: Click on link testRunViews (ViewEPPs) -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_testRunViews"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_planning/link_testRunViews', ['link_testRunViews_internalRoleLinkName': link_testRunViews_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 17-Click on link testRunViews ViewEPPs - Navigate to page teamprojecttest-runs.png')

"Step 18: Click on header testRunTitles (EPPsAutomationTest) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 18-Click on header testRunTitles EPPsAutomationTest - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC122-Schedule Test Runs and Configure Environment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}