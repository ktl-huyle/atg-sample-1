import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectLinks (NoDataDisplay) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 4-Click on link projectLinks NoDataDisplay - Navigate to page teamproject.png')

"Step 5: Click on link CreateRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_CreateRelease'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 5-Click on link CreateRelease.png')

"Step 6: Click on link Executions2 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 6-Click on link Executions2 - Navigate to page teamprojecttest-runs.png')

"Step 7: Click on link Reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 7-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 8: Click on link Settings -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 8-Click on link Settings - Navigate to page teamprojectsettings.png')

"Step 9: Click on link ScriptRepositories -> Navigate to page '/team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_ScriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 9-Click on link ScriptRepositories - Navigate to page teamprojecttest-project.png')

"Step 10: Click on link TestEnvironments -> Navigate to page '/team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 10-Click on link TestEnvironments - Navigate to page teamprojectagent.png')

"Step 11: Click on list LocalKubernetes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/list_LocalKubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 11-Click on list LocalKubernetes.png')

"Step 12: Click on link Kubernetes -> Navigate to page '/team/*/project/*/agent/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 12-Click on link Kubernetes - Navigate to page teamprojectagent.png')

"Step 13: Click on link CircleCI -> Navigate to page '/team/*/project/*/agent/circle-ci'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_CircleCI'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 13-Click on link CircleCI - Navigate to page teamprojectagentcircle-ci.png')

"Step 14: Click on link TestCloud -> Navigate to page '/team/*/project/*/agent/test-cloud'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/circle-ci?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_circle_ci/link_TestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 14-Click on link TestCloud - Navigate to page teamprojectagenttest-cloud.png')

"Step 15: Click on link Integrations -> Navigate to page '/team/*/project/*/integrations'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent_test_cloud/link_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 15-Click on link Integrations - Navigate to page teamprojectintegrations.png')

"Step 16: Click on div integrationDetails (Jenkins)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_integrations/div_integrationDetails', ['div_integrationDetails_nthChild': div_integrationDetails_nthChild, 'div_integrationDetails_nth': div_integrationDetails_nth, 'div_integrationDetails_internalHasText': div_integrationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 16-Click on div integrationDetails Jenkins.png')

"Step 17: Click on link TestCloudTunnels2 -> Navigate to page '/team/*/project/*/testCloudTunnel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/integrations?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_integrations/link_TestCloudTunnels2'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 17-Click on link TestCloudTunnels2 - Navigate to page teamprojecttestCloudTunnel.png')

"Step 18: Click on button tunnelSetup (Setup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/testCloudTunnel?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_testCloudTunnel/button_tunnelSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_testCloudTunnel/button_tunnelSetup', ['button_tunnelSetup_internalRoleTabName': button_tunnelSetup_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 18-Click on button tunnelSetup Setup.png')

"Step 19: Click on link CustomFields -> Navigate to page '/team/*/project/*/custom-fields'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/testCloudTunnel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_CustomFields'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 19-Click on link CustomFields - Navigate to page teamprojectcustom-fields.png')

"Step 20: Click on link Dashboard -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_custom_fields/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 20-Click on link Dashboard - Navigate to page teamproject.png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC115-Create Release and Access Project Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}