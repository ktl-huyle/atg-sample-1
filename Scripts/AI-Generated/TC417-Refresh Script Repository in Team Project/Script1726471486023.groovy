import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/test-project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-project/${GlobalVariable.test_project_id}")

"Step 4: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC417/Step 4-Click on link dashboard - Navigate to page teamproject.png')

"Step 5: Click on link testRuns4 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC417/Step 5-Click on link testRuns4 - Navigate to page teamprojecttest-runs.png')

"Step 6: Click on link settings -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC417/Step 6-Click on link settings - Navigate to page teamprojectsettings.png')

"Step 7: Click on link scriptRepositories -> Navigate to page 'team/*/project/*/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_scriptRepositories'))

WebUI.takeScreenshot(reportLocation + '/TC417/Step 7-Click on link scriptRepositories - Navigate to page teamprojecttest-project.png')

"Step 8: Click on td projectDetails (katalonWebsiteGit)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_projectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_projectDetails', ['td_projectDetails_internalRoleCellName': td_projectDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC417/Step 8-Click on td projectDetails katalonWebsiteGit.png')

"Step 9: Click on link testAutomationLinks (katalonWebsiteGit) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testAutomationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testAutomationLinks', ['link_testAutomationLinks_trNthChild': link_testAutomationLinks_trNthChild, 'link_testAutomationLinks_internalRoleLinkName': link_testAutomationLinks_internalRoleLinkName, 'link_testAutomationLinks_project_id': link_testAutomationLinks_project_id, 'link_testAutomationLinks_test_project_id': link_testAutomationLinks_test_project_id, 'link_testAutomationLinks_team_id': link_testAutomationLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC417/Step 9-Click on link testAutomationLinks katalonWebsiteGit - Navigate to page teamprojecttest-project.png')

"Step 10: Click on button refreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_refreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC417/Step 10-Click on button refreshScriptRepository.png')

"Step 11: Click on button refreshScriptRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_refreshScriptRepository2'))

WebUI.takeScreenshot(reportLocation + '/TC417/Step 11-Click on button refreshScriptRepository2.png')

"Step 12: Click on button refreshScriptRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_refreshScriptRepository2'))

WebUI.takeScreenshot(reportLocation + '/TC417/Step 12-Click on button refreshScriptRepository2.png')

"Step 13: Click on link dashboard2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC417/Step 13-Click on link dashboard2 - Navigate to page teamproject.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC417-Refresh Script Repository in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}