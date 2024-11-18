import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

TrueTestScripts.navigate("team/*/project/*/test-runs")

"Step 4: Click on link Executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link Executions.png')

"Step 5: Click on link Executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link Executions.png')

"Step 6: Click on link Schedules -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Schedules'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link Schedules - Navigate to page teamproject.png')

"Step 7: Click on link Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link Settings.png')

"Step 8: Click on link testManagementOptions (TestEnvironments)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions', ['link_testManagementOptions_nthChild': link_testManagementOptions_nthChild, 'link_testManagementOptions_internalRoleLinkName': link_testManagementOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link testManagementOptions TestEnvironments.png')

"Step 9: Click on link testManagementOptions (ScriptRepositories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions', ['link_testManagementOptions_nthChild': link_testManagementOptions_nthChild_1, 'link_testManagementOptions_internalRoleLinkName': link_testManagementOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link testManagementOptions ScriptRepositories.png')

"Step 10: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Manage Test Runs in Team Project Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}