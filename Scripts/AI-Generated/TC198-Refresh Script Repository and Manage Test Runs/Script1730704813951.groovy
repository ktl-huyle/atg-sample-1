import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.scheduleMultipleTestRuns
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on div testRunInfo (testRunCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 4-Click on div testRunInfo testRunCell2.png')

"Step 5: Click on div sortingInfo (sortingInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_sortingInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_sortingInfo', ['div_sortingInfo_internalHasText': div_sortingInfo_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 5-Click on div sortingInfo sortingInfo.png')

"Step 6: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 6-Click on button Close2.png')

"Step 7: Schedule multiple test runs with various configurations."

scheduleMultipleTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on link Settings -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 8-Click on link Settings - Navigate to page teamprojectsettings.png')

"Step 9: Click on link ScriptRepositories -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_ScriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 9-Click on link ScriptRepositories - Navigate to page teamprojecttest-project.png')

"Step 10: Click on link testAutomationLinks (KatalonWebsite) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testAutomationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testAutomationLinks', ['link_testAutomationLinks_trNthChild': link_testAutomationLinks_trNthChild, 'link_testAutomationLinks_internalRoleLinkName': link_testAutomationLinks_internalRoleLinkName, 'link_testAutomationLinks_team_id': link_testAutomationLinks_team_id, 'link_testAutomationLinks_project_id': link_testAutomationLinks_project_id, 'link_testAutomationLinks_test_project_id': link_testAutomationLinks_test_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 10-Click on link testAutomationLinks KatalonWebsite - Navigate to page teamprojecttest-project.png')

"Step 11: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 11-Click on button RefreshScriptRepository.png')

"Step 12: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 12-Click on link Dashboard - Navigate to page teamproject.png')

"Step 13: Click on link Executions2 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 13-Click on link Executions2 - Navigate to page teamprojecttest-runs.png')

"Step 14: Click on link Settings -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 14-Click on link Settings - Navigate to page teamprojectsettings.png')

"Step 15: Click on link ScriptRepositories -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_ScriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 15-Click on link ScriptRepositories - Navigate to page teamprojecttest-project.png')

"Step 16: Click on td testAutomation (KatalonWebsite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testAutomation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testAutomation', ['td_testAutomation_internalRoleCellName': td_testAutomation_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 16-Click on td testAutomation KatalonWebsite.png')

"Step 17: Click on link testAutomationLinks (KatalonWebsite) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testAutomationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testAutomationLinks', ['link_testAutomationLinks_trNthChild': link_testAutomationLinks_trNthChild_1, 'link_testAutomationLinks_internalRoleLinkName': link_testAutomationLinks_internalRoleLinkName_1, 'link_testAutomationLinks_team_id': link_testAutomationLinks_team_id_1, 'link_testAutomationLinks_project_id': link_testAutomationLinks_project_id_1, 'link_testAutomationLinks_test_project_id': link_testAutomationLinks_test_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 17-Click on link testAutomationLinks KatalonWebsite - Navigate to page teamprojecttest-project.png')

"Step 18: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 18-Click on button RefreshScriptRepository.png')

"Step 19: Click on button RefreshScriptRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository2'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 19-Click on button RefreshScriptRepository2.png')

"Step 20: Click on button RefreshScriptRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository2'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 20-Click on button RefreshScriptRepository2.png')

"Step 21: Click on link Dashboard2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_Dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC198/Step 21-Click on link Dashboard2 - Navigate to page teamproject.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC198-Refresh Script Repository and Manage Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}