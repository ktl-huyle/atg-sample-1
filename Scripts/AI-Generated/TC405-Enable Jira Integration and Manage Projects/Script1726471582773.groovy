import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link noDataProjects (scSynergyCareManagerNoData) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects', ['link_noDataProjects_internalRoleLinkName': link_noDataProjects_internalRoleLinkName, 'link_noDataProjects_team_id': link_noDataProjects_team_id, 'link_noDataProjects_project_id': link_noDataProjects_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 2-Click on link noDataProjects scSynergyCareManagerNoData - Navigate to page teamproject.png')

"Step 3: Click on button enableJiraIntegration -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_enableJiraIntegration'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 3-Click on button enableJiraIntegration - Navigate to page teamproject.png')

"Step 4: Click on link jiraAddOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_jiraAddOn'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 4-Click on link jiraAddOn.png')

"Step 5: Click on link jiraAddOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_jiraAddOn'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 5-Click on link jiraAddOn.png')

"Step 6: Click on div object55"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object55'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 6-Click on div object55.png')

"Step 7: Click on div object56"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object56'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 7-Click on div object56.png')

"Step 8: Click on input serverUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_serverUrl'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 8-Click on input serverUrl.png')

"Step 9: Enter input value in input serverUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_serverUrl'), input_serverUrl)

WebUI.takeScreenshot(reportLocation + '/TC405/Step 9-Enter input value in input serverUrl.png')

"Step 10: Click on div object57"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object57'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 10-Click on div object57.png')

"Step 11: Enter input value in input serverUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_serverUrl'), input_serverUrl)

WebUI.takeScreenshot(reportLocation + '/TC405/Step 11-Enter input value in input serverUrl.png')

"Step 12: Click on div object57"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object57'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 12-Click on div object57.png')

"Step 13: Click on div object57"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object57'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 13-Click on div object57.png')

"Step 14: Click on input username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_username'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 14-Click on input username.png')

"Step 15: Click on div object58"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object58'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 15-Click on div object58.png')

"Step 16: Click on div object57"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object57'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 16-Click on div object57.png')

"Step 17: Click on link planning3 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning3'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 17-Click on link planning3 - Navigate to page teamprojectreleases.png')

"Step 18: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 18-Click on link dashboard - Navigate to page teamproject.png')

"Step 19: Click on div object59"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object59'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 19-Click on div object59.png')

"Step 20: Click on div object60"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object60'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 20-Click on div object60.png')

"Step 21: Click on div object60"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object60'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 21-Click on div object60.png')

"Step 22: Click on link tests6 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests6'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 22-Click on link tests6 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 23: Click on link executions3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions3'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 23-Click on link executions3 - Navigate to page teamproject.png')

"Step 24: Click on link planning3 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning3'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 24-Click on link planning3 - Navigate to page teamprojectreleases.png')

"Step 25: Click on link tests4 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_tests4'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 25-Click on link tests4 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 26: Click on link testSuites4 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites4'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 26-Click on link testSuites4 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 27: Click on span katalonCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_katalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 27-Click on span katalonCloud.png')

"Step 28: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 28-Click on span object.png')

"Step 29: Click on link settingUpScriptRepository -> Navigate to page 'team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_settingUpScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 29-Click on link settingUpScriptRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 30: Click on div object -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 30-Click on div object - Navigate to page teamproject.png')

"Step 31: Login into Application"

TrueTestScripts.login()

"Step 32: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 32-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 33: Click on span objectDetails (object16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1', ['span_objectDetails_divNthChild': span_objectDetails_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 33-Click on span objectDetails object16.png')

"Step 34: Click on span objectElements (object17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_divNthChild': span_objectElements_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 34-Click on span objectElements object17.png')

"Step 35: Click on link testSuites5 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites5'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 35-Click on link testSuites5 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 36: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 36-Click on link reports - Navigate to page teamproject.png')

"Step 37: Click on link planning4 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning4'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 37-Click on link planning4 - Navigate to page teamprojectreleases.png')

"Step 38: Click on link requirements -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_requirements_1'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 38-Click on link requirements - Navigate to page teamproject.png')

"Step 39: Click on button objectActions (object26)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class, 'button_objectActions_nth': button_objectActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 39-Click on button objectActions object26.png')

"Step 40: Click on div object61"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object61'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 40-Click on div object61.png')

"Step 41: Click on button objectActions (object27)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 41-Click on button objectActions object27.png')

"Step 42: Click on div object62"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object62'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 42-Click on div object62.png')

"Step 43: Click on div object63"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object63_1'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 43-Click on div object63.png')

"Step 44: Click on span settings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_settings2'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 44-Click on span settings2.png')

"Step 45: Click on div objectComponents (object41)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents', ['div_objectComponents_class': div_objectComponents_class]))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 45-Click on div objectComponents object41.png')

"Step 46: Click on link dashboard5 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_dashboard5'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 46-Click on link dashboard5 - Navigate to page teamproject.png')

"Step 47: Click on div object64"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object64'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 47-Click on div object64.png')

"Step 48: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/td_object'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 48-Click on td object.png')

"Step 49: Click on div object65"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object65'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 49-Click on div object65.png')

"Step 50: Click on link reports8 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports8'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 50-Click on link reports8 - Navigate to page teamproject.png')

"Step 51: Click on link summaryByTestResult2 -> Navigate to page 'team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_summaryByTestResult2'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 51-Click on link summaryByTestResult2 - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 52: Click on link testRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 52-Click on link testRuns - Navigate to page teamproject.png')

"Step 53: Click on link runFrequency2 -> Navigate to page 'team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_runFrequency2'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 53-Click on link runFrequency2 - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 54: Click on link failedTestResultsBeta -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_failedTestResultsBeta'))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 54-Click on link failedTestResultsBeta - Navigate to page teamproject.png')

"Step 55: Click on link projectNavigation (defects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 55-Click on link projectNavigation defects.png')

"Step 56: Click on link projectNavigation (visualTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC405/Step 56-Click on link projectNavigation visualTesting.png')

"Step 57: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC405-Enable Jira Integration and Manage Projects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}