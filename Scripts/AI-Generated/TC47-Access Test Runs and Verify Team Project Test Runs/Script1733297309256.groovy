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

"Step 3: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on link Executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 4-Click on link Executions.png')

"Step 5: Click on link Executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 5-Click on link Executions.png')

"Step 6: Click on link Schedules -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Schedules'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 6-Click on link Schedules - Navigate to page teamproject.png')

"Step 7: Click on link reportsSettings (Settings19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportsSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportsSettings', ['link_reportsSettings_nthChild': link_reportsSettings_nthChild, 'link_reportsSettings_internalRoleLinkName': link_reportsSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 7-Click on link reportsSettings Settings19.png')

"Step 8: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 8-Click on link testEnvironments TestEnvironments39.png')

"Step 9: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild_1, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 9-Click on link testEnvironments TestEnvironments39.png')

"Step 10: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions_1'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 10-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC47-Access Test Runs and Verify Team Project Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}