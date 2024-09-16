import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.scheduleMultipleTestRuns
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link testRuns4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 4-Click on link testRuns4.png')

"Step 5: Schedule multiple test runs with server URL and environment settings."

scheduleMultipleTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 6-Click on div object4.png')

"Step 7: Click on div testRunDetails (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 7-Click on div testRunDetails object5.png')

"Step 8: Click on div testRunDetails (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 8-Click on div testRunDetails object6.png')

"Step 9: Click on div testRunDetails (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 9-Click on div testRunDetails object5.png')

"Step 10: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 10-Click on button object.png')

"Step 11: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 11-Click on link reports - Navigate to page teamproject.png')

"Step 12: Click on link testRuns5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 12-Click on link testRuns5.png')

"Step 13: Click on div allTestRunsNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_allTestRunsNth0'))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 13-Click on div allTestRunsNth0.png')

"Step 14: Click on label testResults (failed)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 14-Click on label testResults failed.png')

"Step 15: Click on label testResults (passed)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_1, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 15-Click on label testResults passed.png')

"Step 16: Click on label testResults (failed2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_2, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 16-Click on label testResults failed2.png')

"Step 17: Click on label testResults (failed3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_3, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 17-Click on label testResults failed3.png')

"Step 18: Click on button deleteAction (delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction', ['button_deleteAction_internalRoleButtonName': button_deleteAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 18-Click on button deleteAction delete.png')

"Step 19: Click on div object42"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object42'))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 19-Click on div object42.png')

"Step 20: Click on link executions7 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions7'))

WebUI.takeScreenshot(reportLocation + '/TC391/Step 20-Click on link executions7 - Navigate to page teamprojecttest-runs.png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC391-Manage Test Runs and Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}