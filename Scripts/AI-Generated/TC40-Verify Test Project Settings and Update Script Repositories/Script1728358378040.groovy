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

"Step 3: Navigate to team/*/project/*/test-project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-project/${GlobalVariable.test_project_id}")

"Step 4: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 4-Click on link Dashboard - Navigate to page teamproject.png')

"Step 5: Click on link Executions7 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions7'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 5-Click on link Executions7 - Navigate to page teamprojecttest-runs.png')

"Step 6: Click on link Settings -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 6-Click on link Settings - Navigate to page teamprojectsettings.png')

"Step 7: Click on link ScriptRepositories -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_ScriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 7-Click on link ScriptRepositories - Navigate to page teamprojecttest-project.png')

"Step 8: Click on td testProjectLinks (katalonWebsite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProjectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProjectLinks', ['td_testProjectLinks_internalRoleCellName': td_testProjectLinks_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 8-Click on td testProjectLinks katalonWebsite.png')

"Step 9: Click on link testProjectLinks (katalonWebsite) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjectLinks', ['link_testProjectLinks_trNthChild': link_testProjectLinks_trNthChild, 'link_testProjectLinks_internalRoleLinkName': link_testProjectLinks_internalRoleLinkName, 'link_testProjectLinks_test_project_id': link_testProjectLinks_test_project_id, 'link_testProjectLinks_team_id': link_testProjectLinks_team_id, 'link_testProjectLinks_project_id': link_testProjectLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 9-Click on link testProjectLinks katalonWebsite - Navigate to page teamprojecttest-project.png')

"Step 10: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 10-Click on button RefreshScriptRepository.png')

"Step 11: Click on button RefreshScriptRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository2'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 11-Click on button RefreshScriptRepository2.png')

"Step 12: Click on button RefreshScriptRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository2'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 12-Click on button RefreshScriptRepository2.png')

"Step 13: Click on link Dashboard2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_Dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 13-Click on link Dashboard2 - Navigate to page teamproject.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC40-Verify Test Project Settings and Update Script Repositories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}