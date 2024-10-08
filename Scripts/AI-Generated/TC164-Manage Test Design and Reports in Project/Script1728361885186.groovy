import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.downloadAgentAndCopyLinks
import internal.GlobalVariable
import truetest.common.configureTestSuiteSettings
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration

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

WebUI.takeScreenshot(reportLocation + '/TC164/Step 4-Click on link DockerEnvironment - Navigate to page organizationsettingstest-environment-installationdocker-agent.png')

"Step 5: Click on link LocalEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/test-environment-installation/docker-agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation_docker/link_LocalEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 5-Click on link LocalEnvironment.png')

"Step 6: Download the agent and copy necessary links for setup."

downloadAgentAndCopyLinks.execute()

"Step 7: Configure settings for the test suite and save changes."

configureTestSuiteSettings.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on link testManagement (History)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 8-Click on link testManagement History.png')

"Step 9: Click on header testRunDetails (ScheduleTestRunAgent)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 9-Click on header testRunDetails ScheduleTestRunAgent.png')

"Step 10: Click on button Sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 10-Click on button Sessions.png')

"Step 11: Click on button FailedTestResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 11-Click on button FailedTestResults.png')

"Step 12: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 12-Click on link Dashboard - Navigate to page teamproject.png')

"Step 13: Click on link Planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 13-Click on link Planning - Navigate to page teamprojectreleases.png')

"Step 14: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 14-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 15: Click on link TestSuites2 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 15-Click on link TestSuites2 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 16: Click on link TestCases2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 16-Click on link TestCases2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 17: Click on span treeSwitchers (Icon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 17-Click on span treeSwitchers Icon.png')

"Step 18: Click on span treeSwitchers (KatalonStudioTestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 18-Click on span treeSwitchers KatalonStudioTestCases.png')

"Step 19: Click on span treeSwitchers (TreeSwitcher3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 19-Click on span treeSwitchers TreeSwitcher3.png')

"Step 20: Click on link TestSuites2 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 20-Click on link TestSuites2 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 21: Click on link TestObjects -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestObjects_1'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 21-Click on link TestObjects - Navigate to page teamprojecttest-designtest-objects.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC164-Manage Test Design and Reports in Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}