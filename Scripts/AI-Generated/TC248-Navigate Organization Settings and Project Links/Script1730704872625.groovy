import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 4: Click on link agentSettings (agentSettings) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_agent/link_agentSettings', ['link_agentSettings_local_id': link_agentSettings_local_id, 'link_agentSettings_organization_id': link_agentSettings_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 4-Click on link agentSettings agentSettings - Navigate to page organizationsettingsagentlocal.png')

"Step 5: Click on link agentSettingsOverview -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_agentSettingsOverview'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 5-Click on link agentSettingsOverview - Navigate to page organizationsettingsagent.png')

"Step 6: Click on link kubernetesSettings -> Navigate to page 'organization/*/settings/agent/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_kubernetesSettings'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 6-Click on link kubernetesSettings - Navigate to page organizationsettingsagent.png')

"Step 7: Click on link circleCISettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_circleCISettings'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 7-Click on link circleCISettings.png')

"Step 8: Click on link localSettings -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_localSettings'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 8-Click on link localSettings - Navigate to page organizationsettingsagent.png')

"Step 9: Click on button navigation -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/button_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 9-Click on button navigation - Navigate to page organizationhome.png')

"Step 10: Click on link projectLinks (firstProjectExecution) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'link_projectLinks_project_id': link_projectLinks_project_id, 'link_projectLinks_team_id': link_projectLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 10-Click on link projectLinks firstProjectExecution - Navigate to page teamproject.png')

"Step 11: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests_3'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 11-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 12: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions_1'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 12-Click on link executions - Navigate to page teamproject.png')

"Step 13: Click on link tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 13-Click on link tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions_1'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 14-Click on link executions - Navigate to page teamproject.png')

"Step 15: Click on link reports2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports2_2'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 15-Click on link reports2.png')

"Step 16: Click on link tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 16-Click on link tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on link testSuites3 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites_1'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 17-Click on link testSuites3 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 18: Click on link testObjects -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_testObjects_1'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 18-Click on link testObjects - Navigate to page teamprojecttest-designtest-objects.png')

"Step 19: Click on button notification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/button_notification'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 19-Click on button notification.png')

"Step 20: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 20-Click on div backdrop.png')

"Step 21: Click on link testCases -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 21-Click on link testCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 22: Click on button firstProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_firstProject'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 22-Click on button firstProject.png')

"Step 23: Click on div topNavbar (topNavbar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dashboardComponents'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 23-Click on div topNavbar topNavbar.png')

"Step 24: Click on link settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_settings_1'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 24-Click on link settings - Navigate to page teamproject.png')

"Step 25: Click on link dynamicLinks (scriptRepositories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1', ['link_dynamicLinks_nthChild': link_dynamicLinks_nthChild, 'link_dynamicLinks_internalRoleLinkName': link_dynamicLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 25-Click on link dynamicLinks scriptRepositories.png')

"Step 26: Click on link dynamicLinks (testEnvironments)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1', ['link_dynamicLinks_nthChild': link_dynamicLinks_nthChild_1, 'link_dynamicLinks_internalRoleLinkName': link_dynamicLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 26-Click on link dynamicLinks testEnvironments.png')

"Step 27: Click on link agentLocalSettings (agentLocalSettings) -> Navigate to page 'organization/*/settings/agent/local/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_agentLocalSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_agentLocalSettings', ['link_agentLocalSettings_local_id': link_agentLocalSettings_local_id, 'link_agentLocalSettings_organization_id': link_agentLocalSettings_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 27-Click on link agentLocalSettings agentLocalSettings - Navigate to page organizationsettingsagentlocal.png')

"Step 28: Click on link executionDetails -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent/local/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent_local/link_executionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 28-Click on link executionDetails - Navigate to page teamprojectexecutions.png')

"Step 29: Click on link requirements -> Navigate to page 'team/*/project/*/test-reports/test-design/requirement-test-run-coverage'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_requirements'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 29-Click on link requirements - Navigate to page teamprojecttest-reportstest-designrequirement-test-run-coverage.png')

"Step 30: Click on link testCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-design/requirement-test-run-coverage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_design_requirement_test_run/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 30-Click on link testCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 31: Click on link defects (defects) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_defects', ['link_defects_internalRoleLinkName': link_defects_internalRoleLinkName, 'link_defects_path_param_5': link_defects_path_param_5, 'link_defects_project_id': link_defects_project_id, 'link_defects_team_id': link_defects_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 31-Click on link defects defects - Navigate to page teamproject.png')

"Step 32: Click on link dynamicLinks (visualTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1', ['link_dynamicLinks_internalRoleLinkName': link_dynamicLinks_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 32-Click on link dynamicLinks visualTesting.png')

"Step 33: Click on link dynamicLinks (testRuns)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicLinks_1', ['link_dynamicLinks_nthChild': link_dynamicLinks_nthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 33-Click on link dynamicLinks testRuns.png')

"Step 34: Click on link tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 34-Click on link tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 35: Click on div topNavbar (dashboard)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_dashboardComponents'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 35-Click on div topNavbar dashboard.png')

"Step 36: Click on link testSuites3 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites_1'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 36-Click on link testSuites3 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 37: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 37-Click on link dashboard - Navigate to page teamproject.png')

"Step 38: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 38-Click on span Settings.png')

"Step 39: Click on link projectManagement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_projectManagement'))

WebUI.takeScreenshot(reportLocation + '/TC248/Step 39-Click on link projectManagement - Navigate to page .png')

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC248-Navigate Organization Settings and Project Links_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}