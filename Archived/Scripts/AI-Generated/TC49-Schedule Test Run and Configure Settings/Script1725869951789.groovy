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

"Step 3: Navigate to team/*/project/*/test-project"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-project")

"Step 4: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/td_object'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 4-Click on td object.png')

"Step 5: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/td_object'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 5-Click on td object.png')

"Step 6: Click on link encompassOpsTestAutomation -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_ehsTestAutomationGit'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 6-Click on link encompassOpsTestAutomation - Navigate to page teamprojecttest-project.png')

"Step 7: Click on button refreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_refreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 7-Click on button refreshScriptRepository.png')

"Step 8: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 8-Click on button object.png')

"Step 9: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 9-Click on button scheduleTestRun.png')

"Step 10: Configure test settings and run test suites"

configureTestSettingsAndRunSuites.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 11-Click on button object.png')

"Step 12: Click on span settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_settings'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 12-Click on span settings.png')

"Step 13: Click on link organizationSetupConfigure -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_organizationSetupConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 13-Click on link organizationSetupConfigure - Navigate to page organizationsettingsagent.png')

"Step 14: Click on link agentSetup -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_agentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 14-Click on link agentSetup - Navigate to page teamproject.png')

"Step 15: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 15-Click on button scheduleTestRun.png')

"Step 16: Configure test settings and run test suites"

configureTestSettingsAndRunSuites.execute(data_path_1, Integer.valueOf(index_1))

"Step 17: Click on link viewEppsAutomationTest -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_viewEppsAutomationTest'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 17-Click on link viewEppsAutomationTest - Navigate to page teamprojecttest-runs.png')

"Step 18: Click on header object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/header_object'))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 18-Click on header object - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC49-Schedule Test Run and Configure Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}