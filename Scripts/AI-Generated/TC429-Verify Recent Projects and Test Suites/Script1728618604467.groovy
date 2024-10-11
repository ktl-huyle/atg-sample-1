import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
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

"Step 4: Click on div RecentProjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_RecentProjects'))

WebUI.takeScreenshot(reportLocation + '/TC429/Step 4-Click on div RecentProjects.png')

"Step 5: Click on link projectExecutionDetails (ProjectExecution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecutionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecutionDetails', ['link_projectExecutionDetails_class': link_projectExecutionDetails_class, 'link_projectExecutionDetails_nthChild': link_projectExecutionDetails_nthChild, 'link_projectExecutionDetails_internalRoleLinkName': link_projectExecutionDetails_internalRoleLinkName, 'link_projectExecutionDetails_project_id': link_projectExecutionDetails_project_id, 'link_projectExecutionDetails_executions_id': link_projectExecutionDetails_executions_id, 'link_projectExecutionDetails_team_id': link_projectExecutionDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC429/Step 5-Click on link projectExecutionDetails ProjectExecution - Navigate to page teamprojectexecutions.png')

"Step 6: Click on td CoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_CoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC429/Step 6-Click on td CoordinatorCore.png')

"Step 7: Click on link testSuites (TestSuitesCoordinatorCore) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName, 'link_testSuites_test_suites_id': link_testSuites_test_suites_id, 'link_testSuites_team_id': link_testSuites_team_id, 'link_testSuites_project_id': link_testSuites_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC429/Step 7-Click on link testSuites TestSuitesCoordinatorCore - Navigate to page teamprojecttest-designtest-suites.png')

"Step 8: Click on link testResults (CoordinatorCore) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testResults', ['link_testResults_internalRoleRowName': link_testResults_internalRoleRowName, 'link_testResults_team_id': link_testResults_team_id, 'link_testResults_executions_id': link_testResults_executions_id, 'link_testResults_project_id': link_testResults_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC429/Step 8-Click on link testResults CoordinatorCore - Navigate to page teamprojectexecutions.png')

"Step 9: Click on tr PassedCoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/tr_PassedCoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC429/Step 9-Click on tr PassedCoordinatorCore.png')

"Step 10: Click on td Duration -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_Duration'))

WebUI.takeScreenshot(reportLocation + '/TC429/Step 10-Click on td Duration - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC429-Verify Recent Projects and Test Suites_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}