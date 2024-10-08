import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on div recentProjects (RecentProjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_recentProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_recentProjects', ['div_recentProjects_internalText': div_recentProjects_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 4-Click on div recentProjects RecentProjects2.png')

"Step 5: Click on link testRunLinks (ProjectExecution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRunLinks', ['link_testRunLinks_class': link_testRunLinks_class, 'link_testRunLinks_nthChild': link_testRunLinks_nthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName, 'link_testRunLinks_team_id': link_testRunLinks_team_id, 'link_testRunLinks_executions_id': link_testRunLinks_executions_id, 'link_testRunLinks_project_id': link_testRunLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 5-Click on link testRunLinks ProjectExecution - Navigate to page teamprojectexecutions.png')

"Step 6: Click on td CoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_CoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 6-Click on td CoordinatorCore.png')

"Step 7: Click on link testSuiteLinks (TestSuitesCoordinatorCore) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteLinks', ['link_testSuiteLinks_trNthChild': link_testSuiteLinks_trNthChild, 'link_testSuiteLinks_internalRoleLinkName': link_testSuiteLinks_internalRoleLinkName, 'link_testSuiteLinks_team_id': link_testSuiteLinks_team_id, 'link_testSuiteLinks_project_id': link_testSuiteLinks_project_id, 'link_testSuiteLinks_test_suites_id': link_testSuiteLinks_test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 7-Click on link testSuiteLinks TestSuitesCoordinatorCore - Navigate to page teamprojecttest-designtest-suites.png')

"Step 8: Click on link testSuiteLinks (CoordinatorCore) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks', ['link_testSuiteLinks_internalRoleRowName': link_testSuiteLinks_internalRoleRowName, 'link_testSuiteLinks_team_id': link_testSuiteLinks_team_id_1, 'link_testSuiteLinks_project_id': link_testSuiteLinks_project_id_1, 'link_testSuiteLinks_executions_id': link_testSuiteLinks_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 8-Click on link testSuiteLinks CoordinatorCore - Navigate to page teamprojectexecutions.png')

"Step 9: Click on tr PassedCoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/tr_PassedCoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 9-Click on tr PassedCoordinatorCore.png')

"Step 10: Click on td Duration -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_Duration'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 10-Click on td Duration - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC31-Navigate Recent Projects and Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}