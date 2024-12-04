import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on div recentProjects (recentProjects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_recentProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_recentProjects', ['div_recentProjects_internalText': div_recentProjects_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 4-Click on div recentProjects recentProjects.png')

"Step 5: Click on link participantManagement (testExecution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_participantManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_participantManagement', ['link_participantManagement_class': link_participantManagement_class, 'link_participantManagement_nthChild': link_participantManagement_nthChild, 'link_participantManagement_internalRoleLinkName': link_participantManagement_internalRoleLinkName, 'executions_id': executions_id, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 5-Click on link participantManagement testExecution - Navigate to page teamprojectexecutions.png')

"Step 6: Click on td coordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_coordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 6-Click on td coordinatorCore.png')

"Step 7: Click on link dynamicObject (testSuitesCoordinatorCore) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'project_id': project_id_1, 'test_suites_id': test_suites_id, 'team_id': team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 7-Click on link dynamicObject testSuitesCoordinatorCore - Navigate to page teamprojecttest-designtest-suites.png')

"Step 8: Click on link dynamicObject (testExecutionCoordinatorCore) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_dynamicObject', ['link_dynamicObject_internalRoleRowName': link_dynamicObject_internalRoleRowName, 'executions_id': executions_id_1, 'project_id': project_id_2, 'team_id': team_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 8-Click on link dynamicObject testExecutionCoordinatorCore - Navigate to page teamprojectexecutions.png')

"Step 9: Click on tr passedCoordinatorCore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/tr_passedCoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 9-Click on tr passedCoordinatorCore.png')

"Step 10: Click on td durationInfo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_durationInfo'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 10-Click on td durationInfo - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC130-Manage Recent Projects and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}