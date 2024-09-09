import katalon.truetest.TrueTestScripts
import katalon.common.configureTestSettingsAndRunSuites
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link testCloudTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 4-Click on link testCloudTunnels.png')

"Step 5: Click on link testRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 5-Click on link testRuns.png')

"Step 6: Click on span settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_settings'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 6-Click on span settings.png')

"Step 7: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 7-Click on div object5.png')

"Step 8: Click on link testCloudTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 8-Click on link testCloudTunnels.png')

"Step 9: Click on button setup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_setup'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 9-Click on button setup.png')

"Step 10: Click on button download"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_download'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 10-Click on button download.png')

"Step 11: Click on div object13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object13'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 11-Click on div object13.png')

"Step 12: Click on div object13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object13'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 12-Click on div object13.png')

"Step 13: Click on link settings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings2'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 13-Click on link settings2.png')

"Step 14: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 14-Click on span object.png')

"Step 15: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_object'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 15-Click on pre object.png')

"Step 16: Click on link integrations"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_integrations'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 16-Click on link integrations.png')

"Step 17: Click on link testCloudTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCloudTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 17-Click on link testCloudTunnels.png')

"Step 18: Click on button setup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_setup'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 18-Click on button setup.png')

"Step 19: Click on button tunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_tunnels'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 19-Click on button tunnels.png')

"Step 20: Click on link scriptRepositories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 20-Click on link scriptRepositories.png')

"Step 21: Click on link oracleJde -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_oracleJde'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 21-Click on link oracleJde - Navigate to page teamprojecttest-project.png')

"Step 22: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 22-Click on div object.png')

"Step 23: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 23-Click on button scheduleTestRun.png')

"Step 24: Configure test settings and run test suites"

configureTestSettingsAndRunSuites.execute(data_path_0, Integer.valueOf(index_0))

"Step 25: Click on link viewEppsAutomationTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_viewEppsAutomationTest'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 25-Click on link viewEppsAutomationTest.png')

"Step 26: Click on button selectRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_selectRow'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 26-Click on button selectRow.png')

"Step 27: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 27-Click on div object5.png')

"Step 28: Click on header object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/header_object'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 28-Click on header object.png')

"Step 29: Click on button sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 29-Click on button sessions.png')

"Step 30: Click on button sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_sessions'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 30-Click on button sessions.png')

"Step 31: Click on button object5 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object5'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 31-Click on button object5 - Navigate to page teamprojectgridplanjob.png')

"Step 32: Click on pre object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/pre_object'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 32-Click on pre object - Navigate to page .png')

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC60-Setup Test Cloud Tunnels and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}