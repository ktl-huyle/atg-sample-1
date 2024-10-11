import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.scheduleAndRunTestDemo

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

"Step 3: Navigate to team/*/project/*/test-project"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-project")

"Step 4: Click on td testProject (TestProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject', ['td_testProject_internalRoleCellName': td_testProject_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 4-Click on td testProject TestProject.png')

"Step 5: Click on td testProject (TestProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject', ['td_testProject_internalRoleCellName': td_testProject_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 5-Click on td testProject TestProject.png')

"Step 6: Click on link testProjectNavigation (TestProject) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjectNavigation', ['link_testProjectNavigation_trNthChild': link_testProjectNavigation_trNthChild, 'link_testProjectNavigation_internalRoleLinkName': link_testProjectNavigation_internalRoleLinkName, 'link_testProjectNavigation_project_id': link_testProjectNavigation_project_id, 'link_testProjectNavigation_test_project_id': link_testProjectNavigation_test_project_id, 'link_testProjectNavigation_team_id': link_testProjectNavigation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 6-Click on link testProjectNavigation TestProject - Navigate to page teamprojecttest-project.png')

"Step 7: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 7-Click on button RefreshScriptRepository.png')

"Step 8: Click on button AlertButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_AlertButton'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 8-Click on button AlertButton.png')

"Step 9: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 9-Click on button ScheduleTestRun.png')

"Step 10: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 11-Click on span Settings.png')

"Step 12: Click on link OrganizationSetup -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_OrganizationSetup'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 12-Click on link OrganizationSetup - Navigate to page organizationsettingsagent.png')

"Step 13: Click on link AgentSetup -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 13-Click on link AgentSetup - Navigate to page teamproject.png')

"Step 14: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 14-Click on button ScheduleTestRun.png')

"Step 15: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_1, Integer.valueOf(index_1))

"Step 16: Click on link ViewEPPsAutomationTest -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewEPPsAutomationTest'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 16-Click on link ViewEPPsAutomationTest - Navigate to page teamprojecttest-runs.png')

"Step 17: Click on header testRunDetails (EPPsAutomationTest) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 17-Click on header testRunDetails EPPsAutomationTest - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC35-Schedule Test Runs with Configuration_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}