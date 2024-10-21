import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to /organization/*/settings/agent"

TrueTestScripts.navigate("/organization/${GlobalVariable.organization_id}/settings/agent")

"Step 4: Click on link agentSettings (OfflineAgentSettings) -> Navigate to page '/organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentSettings'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 4-Click on link agentSettings OfflineAgentSettings - Navigate to page organizationsettingsagentlocal.png')

"Step 5: Click on link AgentSettings -> Navigate to page '/organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSettings'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 5-Click on link AgentSettings - Navigate to page organizationsettingsagent.png')

"Step 6: Click on link Kubernetes -> Navigate to page '/organization/*/settings/agent/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 6-Click on link Kubernetes - Navigate to page organizationsettingsagent.png')

"Step 7: Click on link CircleCI -> Navigate to page '/organization/*/settings/agent/circle-ci'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_CircleCI'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 7-Click on link CircleCI - Navigate to page organizationsettingsagentcircle-ci.png')

"Step 8: Click on link Local -> Navigate to page '/organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/circle-ci?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_circle_ci/link_Local'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 8-Click on link Local - Navigate to page organizationsettingsagent.png')

"Step 9: Click on button Navigation -> Navigate to page '/organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/button_Navigation'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 9-Click on button Navigation - Navigate to page organizationhome.png')

"Step 10: Click on link projectLinks (FirstProject2) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 10-Click on link projectLinks FirstProject2 - Navigate to page teamproject.png')

"Step 11: Click on link Tests5 -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests5'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 11-Click on link Tests5 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 12: Click on link Executions7 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions7'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 12-Click on link Executions7 - Navigate to page teamprojecttest-runs.png')

"Step 13: Click on link Tests6 -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Tests6'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 13-Click on link Tests6 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on link Executions7 -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions7'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 14-Click on link Executions7 - Navigate to page teamprojecttest-runs.png')

"Step 15: Click on link Reports8 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Reports8'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 15-Click on link Reports8 - Navigate to page teamprojectoverview.png')

"Step 16: Click on link Tests -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 16-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on link TestSuites9 -> Navigate to page '/team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites9'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 17-Click on link TestSuites9 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 18: Click on link TestObjects3 -> Navigate to page '/team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestObjects3'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 18-Click on link TestObjects3 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 19: Click on button Notification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/button_Notification'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 19-Click on button Notification.png')

"Step 20: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 20-Click on div Backdrop.png')

"Step 21: Click on link TestCases -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 21-Click on link TestCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 22: Click on button FirstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 22-Click on button FirstProject.png')

"Step 23: Click on div topNavbars (TopNavbar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_topNavbars'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 23-Click on div topNavbars TopNavbar.png')

"Step 24: Click on link Settings3 -> Navigate to page '/team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Settings3'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 24-Click on link Settings3 - Navigate to page teamprojectsettings.png')

"Step 25: Click on link ScriptRepositories5 -> Navigate to page '/team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_ScriptRepositories5'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 25-Click on link ScriptRepositories5 - Navigate to page teamprojecttest-project.png')

"Step 26: Click on link TestEnvironments2 -> Navigate to page '/team/*/project/*/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_TestEnvironments2'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 26-Click on link TestEnvironments2 - Navigate to page teamprojectagent.png')

"Step 27: Click on link agentLinks (OfflineAgent) -> Navigate to page '/organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent/link_agentLinks'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 27-Click on link agentLinks OfflineAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 28: Click on link Execution129 -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_Execution129'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 28-Click on link Execution129 - Navigate to page teamprojectexecutions.png')

"Step 29: Click on link Requirements -> Navigate to page '/team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 29-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 30: Click on link TestCases -> Navigate to page '/team/*/project/*/test-reports/test-maintenance/active'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 30-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenanceactive.png')

"Step 31: Click on link Defects -> Navigate to page '/team/*/project/*/defects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/link_Defects'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 31-Click on link Defects - Navigate to page teamprojectdefects.png')

"Step 32: Click on link VisualTesting -> Navigate to page '/team/*/project/*/katalon-eyes'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/defects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_defects/link_VisualTesting'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 32-Click on link VisualTesting - Navigate to page teamprojectkatalon-eyes.png')

"Step 33: Click on link TestRuns -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/katalon-eyes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_katalon_eyes/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 33-Click on link TestRuns - Navigate to page teamprojectoverview.png')

"Step 34: Click on link Tests -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 34-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 35: Click on div topNavbars (TopNavbar2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_topNavbars'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 35-Click on div topNavbars TopNavbar2.png')

"Step 36: Click on link TestSuites9 -> Navigate to page '/team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites9'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 36-Click on link TestSuites9 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 37: Click on link Dashboard -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 37-Click on link Dashboard - Navigate to page teamproject.png')

"Step 38: Click on span settings (Settings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_settings', ['span_settings_nthChild': span_settings_nthChild, 'span_settings_internalRoleButtonName': span_settings_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 38-Click on span settings Settings.png')

"Step 39: Click on link ProjectManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ProjectManagement'))

WebUI.takeScreenshot(reportLocation + '/TC181/Step 39-Click on link ProjectManagement - Navigate to page .png')

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC181-Configure Agent Settings in Organization_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}