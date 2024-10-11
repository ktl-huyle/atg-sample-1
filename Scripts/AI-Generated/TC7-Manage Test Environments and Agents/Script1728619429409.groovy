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

"Step 3: Navigate to organization/*/settings/test-environment-installation"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/settings/test-environment-installation")

"Step 4: Click on link DockerEnvironment -> Navigate to page 'organization/*/settings/test-environment-installation/docker-agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_DockerEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on link DockerEnvironment - Navigate to page organizationsettingstest-environment-installationdocker-agent.png')

"Step 5: Click on link LocalEnvironment -> Navigate to page 'organization/*/settings/test-environment-installation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation/docker-agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation_docker/link_LocalEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on link LocalEnvironment - Navigate to page organizationsettingstest-environment-installation.png')

"Step 6: Click on link Copy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on link Copy.png')

"Step 7: Click on link Copy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on link Copy2.png')

"Step 8: Click on link ScheduleTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_ScheduleTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on link ScheduleTestRuns.png')

"Step 9: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on link projectNavigation (History)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on link projectNavigation History.png')

"Step 11: Click on header testRunAgents (ScheduleTestRunAgent)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunAgents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunAgents', ['header_testRunAgents_internalRoleHeadingName': header_testRunAgents_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on header testRunAgents ScheduleTestRunAgent.png')

"Step 12: Click on button testResults (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_testResults', ['button_testResults_internalRoleTabName': button_testResults_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on button testResults Sessions.png')

"Step 13: Click on button testResults (FailedTestResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_testResults', ['button_testResults_internalRoleTabName': button_testResults_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on button testResults FailedTestResults.png')

"Step 14: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on link Dashboard - Navigate to page teamproject.png')

"Step 15: Click on link Planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on link Planning - Navigate to page teamprojectreleases.png')

"Step 16: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on link TestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 18: Click on link TestCases -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestCases_1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18-Click on link TestCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 19: Click on span testCaseDetails (Icon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseDetails'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19-Click on span testCaseDetails Icon.png')

"Step 20: Click on span testCaseDetails (KatalonStudioTestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseDetails'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20-Click on span testCaseDetails KatalonStudioTestCases.png')

"Step 21: Click on span testCaseDetails (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseDetails'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21-Click on span testCaseDetails TreeSwitcher.png')

"Step 22: Click on link TestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 23: Click on link TestObjects -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 23-Click on link TestObjects - Navigate to page teamprojecttest-designtest-objects.png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Manage Test Environments and Agents_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}