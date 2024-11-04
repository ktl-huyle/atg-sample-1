import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Executions5 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions5_1'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 4-Click on link Executions5 - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on div testRunInfo (ParallelSuite751)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 5-Click on div testRunInfo ParallelSuite751.png')

"Step 6: Click on div testRunInfo (ParallelSuite749)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 6-Click on div testRunInfo ParallelSuite749.png')

"Step 7: Click on div testRunInfo (ParallelSuite750)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 7-Click on div testRunInfo ParallelSuite750.png')

"Step 8: Click on div testRunInfo (ParallelSuite751)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunInfo', ['div_testRunInfo_internalRoleCellName': div_testRunInfo_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 8-Click on div testRunInfo ParallelSuite751.png')

"Step 9: Click on button JobReady"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_JobReady'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 9-Click on button JobReady.png')

"Step 10: Click on div MyOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_MyOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 10-Click on div MyOrganization.png')

"Step 11: Click on link ViewAllProjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ViewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 11-Click on link ViewAllProjects.png')

"Step 12: Click on div CurrentReadyTechJob"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CurrentReadyTechJob'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 12-Click on div CurrentReadyTechJob.png')

"Step 13: Click on link JRJobReady -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_JRJobReady'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 13-Click on link JRJobReady - Navigate to page teamproject.png')

"Step 14: Click on span settings (Settings2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_settings', ['span_settings_nthChild': span_settings_nthChild, 'span_settings_internalRoleButtonName': span_settings_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 14-Click on span settings Settings2.png')

"Step 15: Click on link OrganizationManagement -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_OrganizationManagement'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 15-Click on link OrganizationManagement - Navigate to page teamproject.png')

"Step 16: Click on p ReadyCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/p_ReadyCase'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 16-Click on p ReadyCase.png')

"Step 17: Click on input SelectUsersToAdd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SelectUsersToAdd'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 17-Click on input SelectUsersToAdd.png')

"Step 18: Enter input value in input SelectUsersToAdd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SelectUsersToAdd'), input_SelectUsersToAdd)

WebUI.takeScreenshot(reportLocation + '/TC237/Step 18-Enter input value in input SelectUsersToAdd.png')

"Step 19: Click on div ProjectProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ProjectProfile'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 19-Click on div ProjectProfile.png')

"Step 20: Click on input SelectTimeZone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SelectTimeZone'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 20-Click on input SelectTimeZone.png')

"Step 21: Click on div EnableBDDReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_EnableBDDReports'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 21-Click on div EnableBDDReports.png')

"Step 22: Click on div UnknownContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnknownContent'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 22-Click on div UnknownContent.png')

"Step 23: Click on span settings (Settings2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_settings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_settings', ['span_settings_nthChild': span_settings_nthChild_1, 'span_settings_internalRoleButtonName': span_settings_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 23-Click on span settings Settings2.png')

"Step 24: Click on div dynamicObject (MuiBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 24-Click on div dynamicObject MuiBackdrop.png')

"Step 25: Click on div UnknownContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnknownContent'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 25-Click on div UnknownContent.png')

"Step 26: Enter input value in input SelectUsersToAdd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SelectUsersToAdd'), input_SelectUsersToAdd_1)

WebUI.takeScreenshot(reportLocation + '/TC237/Step 26-Enter input value in input SelectUsersToAdd.png')

"Step 27: Click on div TeamReadyCase -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TeamReadyCase'))

WebUI.takeScreenshot(reportLocation + '/TC237/Step 27-Click on div TeamReadyCase - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC237-Manage Team Project Settings and Users_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}