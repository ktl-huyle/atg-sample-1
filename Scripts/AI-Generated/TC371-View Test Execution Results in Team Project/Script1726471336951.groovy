import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

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

"Step 4: Click on link noDataProjects (rRdCrewPaycalMaxtermTl) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects', ['link_noDataProjects_internalRoleLinkName': link_noDataProjects_internalRoleLinkName, 'link_noDataProjects_team_id': link_noDataProjects_team_id, 'link_noDataProjects_project_id': link_noDataProjects_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC371/Step 4-Click on link noDataProjects rRdCrewPaycalMaxtermTl - Navigate to page teamproject.png')

"Step 5: Click on link reports2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports2'))

WebUI.takeScreenshot(reportLocation + '/TC371/Step 5-Click on link reports2 - Navigate to page teamproject.png')

"Step 6: Click on link testRuns3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC371/Step 6-Click on link testRuns3.png')

"Step 7: Click on link executionObjects (executions2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects', ['link_executionObjects_trNthChild': link_executionObjects_trNthChild, 'link_executionObjects_internalRoleLinkName': link_executionObjects_internalRoleLinkName, 'link_executionObjects_team_id': link_executionObjects_team_id, 'link_executionObjects_project_id': link_executionObjects_project_id, 'link_executionObjects_executions_id': link_executionObjects_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC371/Step 7-Click on link executionObjects executions2 - Navigate to page teamprojectexecutions.png')

"Step 8: Click on span executionStatus (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_executionStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_executionStatus', ['span_executionStatus_class': span_executionStatus_class, 'span_executionStatus_internalRoleButtonName': span_executionStatus_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC371/Step 8-Click on span executionStatus object.png')

"Step 9: Click on div sidebarLayoutRightSidebar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_sidebarLayoutRightSidebar'))

WebUI.takeScreenshot(reportLocation + '/TC371/Step 9-Click on div sidebarLayoutRightSidebar.png')

"Step 10: Click on button failedMv013NormalOrder -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_failedMv013NormalOrder'))

WebUI.takeScreenshot(reportLocation + '/TC371/Step 10-Click on button failedMv013NormalOrder - Navigate to page teamprojectexecutionstest-result.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC371-View Test Execution Results in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}