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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Executions4 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 4-Click on link Executions4 - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on div testRunItems (ParallelSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 5-Click on div testRunItems ParallelSuite.png')

"Step 6: Click on div testRunItems (ParallelSuite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 6-Click on div testRunItems ParallelSuite2.png')

"Step 7: Click on div testRunItems (ParallelSuite3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 7-Click on div testRunItems ParallelSuite3.png')

"Step 8: Click on div testRunItems (ParallelSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 8-Click on div testRunItems ParallelSuite.png')

"Step 9: Click on button JobReady"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_JobReady'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 9-Click on button JobReady.png')

"Step 10: Click on div MyOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_MyOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 10-Click on div MyOrganization.png')

"Step 11: Click on link ViewAllProjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ViewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 11-Click on link ViewAllProjects.png')

"Step 12: Click on div CurrentRReadyTech"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CurrentRReadyTech'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 12-Click on div CurrentRReadyTech.png')

"Step 13: Click on link JRJobReady -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_JRJobReady'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 13-Click on link JRJobReady - Navigate to page teamproject.png')

"Step 14: Click on span dynamicObject (Settings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_dynamicObject', ['span_dynamicObject_nthChild': span_dynamicObject_nthChild, 'span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 14-Click on span dynamicObject Settings.png')

"Step 15: Click on link OrganizationManagementEdit -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_OrganizationManagementEdit'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 15-Click on link OrganizationManagementEdit - Navigate to page teamproject.png')

"Step 16: Click on p ReadyCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/p_ReadyCase'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 16-Click on p ReadyCase.png')

"Step 17: Click on input UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_UserEmail'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 17-Click on input UserEmail.png')

"Step 18: Enter input value in input UserEmail2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_UserEmail'), input_UserEmail2)

WebUI.takeScreenshot(reportLocation + '/TC52/Step 18-Enter input value in input UserEmail2.png')

"Step 19: Click on div ProjectProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ProjectProfile'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 19-Click on div ProjectProfile.png')

"Step 20: Click on input TimezoneConfig"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_TimezoneConfig'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 20-Click on input TimezoneConfig.png')

"Step 21: Click on div EnableBDDReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_EnableBDDReports'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 21-Click on div EnableBDDReports.png')

"Step 22: Click on div MuiInputBaseRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiInputBaseRoot'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 22-Click on div MuiInputBaseRoot.png')

"Step 23: Click on span Settings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 23-Click on span Settings2.png')

"Step 24: Click on div MuiBackdropRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 24-Click on div MuiBackdropRoot.png')

"Step 25: Click on div MuiInputBaseRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiInputBaseRoot'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 25-Click on div MuiInputBaseRoot.png')

"Step 26: Enter input value in input UserEmail2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_UserEmail'), input_UserEmail2_1)

WebUI.takeScreenshot(reportLocation + '/TC52/Step 26-Enter input value in input UserEmail2.png')

"Step 27: Click on div TeamReadyCase -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TeamReadyCase'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 27-Click on div TeamReadyCase - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC52-Manage Test Runs and Verify Project Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}