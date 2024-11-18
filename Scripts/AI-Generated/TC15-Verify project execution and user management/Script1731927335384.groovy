import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

TrueTestScripts.navigate("team/*/project/*")

"Step 4: Click on link Executions3 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions3'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on link Executions3 - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on div testRunDetails (ParallelSuite751)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on div testRunDetails ParallelSuite751.png')

"Step 6: Click on div testRunDetails (ParallelSuite749)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on div testRunDetails ParallelSuite749.png')

"Step 7: Click on div testRunDetails (ParallelSuite750)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on div testRunDetails ParallelSuite750.png')

"Step 8: Click on div testRunDetails (ParallelSuite751)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on div testRunDetails ParallelSuite751.png')

"Step 9: Click on button JobReady"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_JobReady'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on button JobReady.png')

"Step 10: Click on div MyOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_MyOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 10-Click on div MyOrganization.png')

"Step 11: Click on link viewAllProjects (ViewAllProjects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/link_viewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 11-Click on link viewAllProjects ViewAllProjects.png')

"Step 12: Click on div CurrentReadyTechJob"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CurrentReadyTechJob'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 12-Click on div CurrentReadyTechJob.png')

"Step 13: Click on link JRJobReady -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_JRJobReady'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 13-Click on link JRJobReady - Navigate to page teamproject.png')

"Step 14: Click on span settingsOptions (Settings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_settingsOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_settingsOptions', ['span_settingsOptions_internalRoleButtonName': span_settingsOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 14-Click on span settingsOptions Settings.png')

"Step 15: Click on link OrganizationManagement -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_OrganizationManagement'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 15-Click on link OrganizationManagement - Navigate to page teamproject.png')

"Step 16: Click on p ReadyCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/p_ReadyCase'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 16-Click on p ReadyCase.png')

"Step 17: Click on input SelectUsersToAdd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SelectUsersToAdd'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 17-Click on input SelectUsersToAdd.png')

"Step 18: Enter input value in input SelectUsersToAdd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SelectUsersToAdd'), input_SelectUsersToAdd)

WebUI.takeScreenshot(reportLocation + '/TC15/Step 18-Enter input value in input SelectUsersToAdd.png')

"Step 19: Click on div ProjectProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ProjectProfile'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 19-Click on div ProjectProfile.png')

"Step 20: Click on input SelectTimeZone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SelectTimeZone'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 20-Click on input SelectTimeZone.png')

"Step 21: Click on div reportOptions (EnableBDDReports)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_reportOptions'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 21-Click on div reportOptions EnableBDDReports.png')

"Step 22: Click on div UnknownContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnknownContent'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 22-Click on div UnknownContent.png')

"Step 23: Click on span settingsOptions (Settings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_settingsOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_settingsOptions', ['span_settingsOptions_internalRoleButtonName': span_settingsOptions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 23-Click on span settingsOptions Settings.png')

"Step 24: Click on div dynamicObject (MuiBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 24-Click on div dynamicObject MuiBackdrop.png')

"Step 25: Click on div UnknownContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnknownContent'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 25-Click on div UnknownContent.png')

"Step 26: Enter input value in input SelectUsersToAdd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SelectUsersToAdd'), input_SelectUsersToAdd_1)

WebUI.takeScreenshot(reportLocation + '/TC15/Step 26-Enter input value in input SelectUsersToAdd.png')

"Step 27: Click on div teamReadyCase (TeamReadyCase) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamReadyCase'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 27-Click on div teamReadyCase TeamReadyCase - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Verify project execution and user management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}