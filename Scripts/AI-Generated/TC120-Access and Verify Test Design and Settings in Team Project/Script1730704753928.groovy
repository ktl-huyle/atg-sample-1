import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts

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

"Step 4: Click on button notification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/button_notification'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 4-Click on button notification.png')

"Step 5: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 5-Click on div backdrop.png')

"Step 6: Click on link testCases -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 6-Click on link testCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 7: Click on button firstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_firstProject'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 7-Click on button firstProject.png')

"Step 8: Click on div dashboardComponents (topNavbar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dashboardComponents'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 8-Click on div dashboardComponents topNavbar.png')

"Step 9: Click on link settingsOption (settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_settingsOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_settingsOption', ['link_settingsOption_nthChild': link_settingsOption_nthChild, 'link_settingsOption_internalRoleLinkName': link_settingsOption_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 9-Click on link settingsOption settings - Navigate to page teamproject.png')

"Step 10: Click on link navigationOptions (scriptRepositories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions', ['link_navigationOptions_nthChild': link_navigationOptions_nthChild, 'link_navigationOptions_internalRoleLinkName': link_navigationOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 10-Click on link navigationOptions scriptRepositories.png')

"Step 11: Click on link navigationOptions (testEnvironments)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions', ['link_navigationOptions_nthChild': link_navigationOptions_nthChild_1, 'link_navigationOptions_internalRoleLinkName': link_navigationOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 11-Click on link navigationOptions testEnvironments.png')

"Step 12: Click on link agentSettings (agentLocalSettings) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_agentSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_agentSettings', ['link_agentSettings_local_id': link_agentSettings_local_id, 'link_agentSettings_organization_id': link_agentSettings_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 12-Click on link agentSettings agentLocalSettings - Navigate to page organizationsettingsagentlocal.png')

"Step 13: Click on link executionDetails -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_executionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 13-Click on link executionDetails - Navigate to page teamprojectexecutions.png')

"Step 14: Click on link requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_requirements'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 14-Click on link requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 15: Click on link testCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 15-Click on link testCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 16: Click on link defectManagement (defects) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defectManagement', ['link_defectManagement_internalRoleLinkName': link_defectManagement_internalRoleLinkName, 'link_defectManagement_team_id': link_defectManagement_team_id, 'link_defectManagement_project_id': link_defectManagement_project_id, 'link_defectManagement_path_param_5': link_defectManagement_path_param_5]))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 16-Click on link defectManagement defects - Navigate to page teamproject.png')

"Step 17: Click on link navigationOptions (visualTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions', ['link_navigationOptions_internalRoleLinkName': link_navigationOptions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 17-Click on link navigationOptions visualTesting.png')

"Step 18: Click on link navigationOptions (testRuns)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions', ['link_navigationOptions_nthChild': link_navigationOptions_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 18-Click on link navigationOptions testRuns.png')

"Step 19: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 19-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on div dashboardComponents (dashboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dashboardComponents'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 20-Click on div dashboardComponents dashboard.png')

"Step 21: Click on link testSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites_1'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 21-Click on link testSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 22: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 22-Click on link dashboard - Navigate to page teamproject.png')

"Step 23: Click on span settingsDisplay (Settings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_settingsDisplay"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_settingsDisplay', ['span_settingsDisplay_internalRoleButtonName': span_settingsDisplay_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 23-Click on span settingsDisplay Settings.png')

"Step 24: Click on link projectManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_projectManagement'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 24-Click on link projectManagement - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC120-Access and Verify Test Design and Settings in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}