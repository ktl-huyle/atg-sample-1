import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 3: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on link Executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 4-Click on link Executions.png')

"Step 5: Click on link Executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 5-Click on link Executions.png')

"Step 6: Click on link Schedules2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Schedules2_1'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 6-Click on link Schedules2 - Navigate to page teamproject.png')

"Step 7: Click on link Settings4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings4_1'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 7-Click on link Settings4.png')

"Step 8: Click on link navigationLinks (TestEnvironments)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks', ['link_navigationLinks_nthChild': link_navigationLinks_nthChild, 'link_navigationLinks_internalRoleLinkName': link_navigationLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 8-Click on link navigationLinks TestEnvironments.png')

"Step 9: Click on link navigationLinks (ScriptRepositories2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationLinks', ['link_navigationLinks_nthChild': link_navigationLinks_nthChild_1, 'link_navigationLinks_internalRoleLinkName': link_navigationLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 9-Click on link navigationLinks ScriptRepositories2.png')

"Step 10: Click on link Executions6 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions6'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 10-Click on link Executions6 - Navigate to page teamprojecttest-runs.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC175-Access test runs and verify executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}