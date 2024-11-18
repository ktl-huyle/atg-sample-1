import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/*/home")

"Step 4: Click on div recentProjects (RecentProjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_recentProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_recentProjects', ['div_recentProjects_internalText': div_recentProjects_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 4-Click on div recentProjects RecentProjects2.png')

"Step 5: Click on link testExecutionOptions (TestExecution3827) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionOptions', ['link_testExecutionOptions_nthChild': link_testExecutionOptions_nthChild, 'link_testExecutionOptions_class': link_testExecutionOptions_class, 'link_testExecutionOptions_internalRoleLinkName': link_testExecutionOptions_internalRoleLinkName, 'executions_id': executions_id, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 5-Click on link testExecutionOptions TestExecution3827 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on td CoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_CoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 6-Click on td CoordinatorCore.png')

"Step 7: Click on link testSuites (TestSuitesCoordinatorCore) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName, 'team_id': team_id_1, 'project_id': project_id_1, 'test_suites_id': test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 7-Click on link testSuites TestSuitesCoordinatorCore - Navigate to page teamprojecttest-designtest-suites.png')

"Step 8: Click on link testSuiteOptions (PassedCoordinatorCore) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteOptions', ['link_testSuiteOptions_internalRoleRowName': link_testSuiteOptions_internalRoleRowName, 'executions_id': executions_id_1, 'team_id': team_id_2, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 8-Click on link testSuiteOptions PassedCoordinatorCore - Navigate to page teamprojectexecutions.png')

"Step 9: Click on tr PassedCoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/tr_PassedCoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 9-Click on tr PassedCoordinatorCore.png')

"Step 10: Click on td DurationStarted -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_DurationStarted'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 10-Click on td DurationStarted - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC53-Navigate to Test Suites from Recent Projects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}