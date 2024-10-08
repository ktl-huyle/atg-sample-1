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

"Step 3: Navigate to organization/*/settings/agent"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/settings/agent")

"Step 4: Click on link agentLinks (OfflineMyAgent) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentLinks', ['link_agentLinks_local_id': link_agentLinks_local_id, 'link_agentLinks_organization_id': link_agentLinks_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 4-Click on link agentLinks OfflineMyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 5: Click on link AgentSettings -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_AgentSettings'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 5-Click on link AgentSettings - Navigate to page organizationsettingsagent.png')

"Step 6: Click on link Kubernetes -> Navigate to page 'organization/*/settings/agent/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 6-Click on link Kubernetes - Navigate to page organizationsettingsagent.png')

"Step 7: Click on link CircleCI"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_CircleCI'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 7-Click on link CircleCI.png')

"Step 8: Click on link Local -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_Local'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 8-Click on link Local - Navigate to page organizationsettingsagent.png')

"Step 9: Click on button Navigation -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/button_Navigation'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 9-Click on button Navigation - Navigate to page organizationhome.png')

"Step 10: Click on link projectLinks (FirstProject) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'link_projectLinks_project_id': link_projectLinks_project_id, 'link_projectLinks_team_id': link_projectLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 10-Click on link projectLinks FirstProject - Navigate to page teamproject.png')

"Step 11: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 11-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 12: Click on link Executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 12-Click on link Executions - Navigate to page teamproject.png')

"Step 13: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests2_1'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 13-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on link Executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 14-Click on link Executions - Navigate to page teamproject.png')

"Step 15: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 15-Click on link Reports.png')

"Step 16: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests2_1'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 16-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on link TestSuites3 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 17-Click on link TestSuites3 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 18: Click on link TestObjects2 -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 18-Click on link TestObjects2 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 19: Click on button Notification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/button_Notification'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 19-Click on button Notification.png')

"Step 20: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 20-Click on div Backdrop.png')

"Step 21: Click on link TestCases -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 21-Click on link TestCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 22: Click on button FirstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 22-Click on button FirstProject.png')

"Step 23: Click on div topNavbars (TopNavbar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_topNavbars'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 23-Click on div topNavbars TopNavbar.png')

"Step 24: Click on link Settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 24-Click on link Settings - Navigate to page teamproject.png')

"Step 25: Click on link testManagement (ScriptRepositories2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 25-Click on link testManagement ScriptRepositories2.png')

"Step 26: Click on link testManagement (TestEnvironments)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_1, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 26-Click on link testManagement TestEnvironments.png')

"Step 27: Click on link agentLinks (OfflineMyAgent) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_agentLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_agentLinks', ['link_agentLinks_local_id': link_agentLinks_local_id_1, 'link_agentLinks_organization_id': link_agentLinks_organization_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 27-Click on link agentLinks OfflineMyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 28: Click on link Execution129 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_Execution129'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 28-Click on link Execution129 - Navigate to page teamprojectexecutions.png')

"Step 29: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 29-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 30: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 30-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 31: Click on link defects (Defects) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects', ['link_defects_internalRoleLinkName': link_defects_internalRoleLinkName, 'link_defects_project_id': link_defects_project_id, 'link_defects_team_id': link_defects_team_id, 'link_defects_path_param_5': link_defects_path_param_5]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 31-Click on link defects Defects - Navigate to page teamproject.png')

"Step 32: Click on link testManagement (VisualTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 32-Click on link testManagement VisualTesting.png')

"Step 33: Click on link testManagement (TestRuns3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 33-Click on link testManagement TestRuns3.png')

"Step 34: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests2_1'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 34-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 35: Click on div topNavbars (TopNavbar2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_topNavbars'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 35-Click on div topNavbars TopNavbar2.png')

"Step 36: Click on link TestSuites3 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 36-Click on link TestSuites3 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 37: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 37-Click on link Dashboard - Navigate to page teamproject.png')

"Step 38: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 38-Click on span Settings.png')

"Step 39: Click on link ProjectManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ProjectManagement'))

WebUI.takeScreenshot(reportLocation + '/TC169/Step 39-Click on link ProjectManagement - Navigate to page .png')

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC169-Manage Agents and Verify Organization Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}