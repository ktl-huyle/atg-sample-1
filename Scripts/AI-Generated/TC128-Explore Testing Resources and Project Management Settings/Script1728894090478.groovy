import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to team/*/project/*/test-design/test-objects"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-design/test-objects")

"Step 4: Click on button Notification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/button_Notification'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 4-Click on button Notification.png')

"Step 5: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 5-Click on div Backdrop.png')

"Step 6: Click on link TestCases -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 6-Click on link TestCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 7: Click on button FirstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_FirstProject'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 7-Click on button FirstProject.png')

"Step 8: Click on div topNavbar (TopNavbar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_topNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 8-Click on div topNavbar TopNavbar.png')

"Step 9: Click on link settings (Settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_settings', ['link_settings_nthChild': link_settings_nthChild, 'link_settings_internalRoleLinkName': link_settings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 9-Click on link settings Settings - Navigate to page teamproject.png')

"Step 10: Click on link testingResources (ScriptRepositories2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testingResources', ['link_testingResources_nthChild': link_testingResources_nthChild, 'link_testingResources_internalRoleLinkName': link_testingResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 10-Click on link testingResources ScriptRepositories2.png')

"Step 11: Click on link testingResources (TestEnvironments)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testingResources', ['link_testingResources_nthChild': link_testingResources_nthChild_1, 'link_testingResources_internalRoleLinkName': link_testingResources_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 11-Click on link testingResources TestEnvironments.png')

"Step 12: Click on link offlineAgent (OfflineMyAgent) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_offlineAgent"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_offlineAgent', ['link_offlineAgent_local_id': link_offlineAgent_local_id, 'link_offlineAgent_organization_id': link_offlineAgent_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 12-Click on link offlineAgent OfflineMyAgent - Navigate to page organizationsettingsagentlocal.png')

"Step 13: Click on link Execution129 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_Execution129'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 13-Click on link Execution129 - Navigate to page teamprojectexecutions.png')

"Step 14: Click on link Requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 14-Click on link Requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 15: Click on link TestCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 15-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 16: Click on link defects (Defects) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects', ['link_defects_internalRoleLinkName': link_defects_internalRoleLinkName, 'link_defects_path_param_5': link_defects_path_param_5, 'link_defects_team_id': link_defects_team_id, 'link_defects_project_id': link_defects_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 16-Click on link defects Defects - Navigate to page teamproject.png')

"Step 17: Click on link testingResources (VisualTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testingResources', ['link_testingResources_internalRoleLinkName': link_testingResources_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 17-Click on link testingResources VisualTesting.png')

"Step 18: Click on link testingResources (TestRuns3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testingResources', ['link_testingResources_nthChild': link_testingResources_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 18-Click on link testingResources TestRuns3.png')

"Step 19: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 19-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on div topNavbar (TopNavbar2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_topNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 20-Click on div topNavbar TopNavbar2.png')

"Step 21: Click on link TestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 21-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 22: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 22-Click on link Dashboard - Navigate to page teamproject.png')

"Step 23: Click on span settings (Settings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_settings', ['span_settings_internalRoleButtonName': span_settings_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 23-Click on span settings Settings.png')

"Step 24: Click on link ProjectManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ProjectManagement'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 24-Click on link ProjectManagement - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC128-Explore Testing Resources and Project Management Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}