import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 4: Click on div WelcomeMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_welcome/div_WelcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 4-Click on div WelcomeMessage.png')

"Step 5: Click on div qualityEngineers (DeveloperRole) -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_welcome/div_qualityEngineers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_welcome/div_qualityEngineers', ['div_qualityEngineers_nthChild': div_qualityEngineers_nthChild, 'div_qualityEngineers_internalHasText': div_qualityEngineers_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 5-Click on div qualityEngineers DeveloperRole - Navigate to page organizationhome.png')

"Step 6: Click on button userProfile (UserInitials)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_userProfile"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_userProfile', ['button_userProfile_internalRoleButtonName': button_userProfile_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 6-Click on button userProfile UserInitials.png')

"Step 7: Click on link SignOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 7-Click on link SignOut.png')

"Step 8: Click on button organizationManagement (OrganizationSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement', ['button_organizationManagement_internalRoleButtonName': button_organizationManagement_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 8-Click on button organizationManagement OrganizationSelection.png')

"Step 9: Click on div currentOrganizationDetails (CurrentOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails', ['div_currentOrganizationDetails_class': div_currentOrganizationDetails_class, 'div_currentOrganizationDetails_internalHasText': div_currentOrganizationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 9-Click on div currentOrganizationDetails CurrentOrganization.png')

"Step 10: Click on link agentSettings (MTMaxisTQAKatalon) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_agentSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_agentSettings', ['link_agentSettings_nthChild': link_agentSettings_nthChild, 'link_agentSettings_internalRoleLinkName': link_agentSettings_internalRoleLinkName, 'link_agentSettings_team_id': link_agentSettings_team_id, 'link_agentSettings_project_id': link_agentSettings_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 10-Click on link agentSettings MTMaxisTQAKatalon - Navigate to page teamproject.png')

"Step 11: Click on link Executions11 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions11'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 11-Click on link Executions11 - Navigate to page teamproject.png')

"Step 12: Click on div TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 12-Click on div TestSuiteCollection.png')

"Step 13: Click on div ExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 13-Click on div ExecutionDetails.png')

"Step 14: Click on link testManagement (Schedules2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 14-Click on link testManagement Schedules2.png')

"Step 15: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 15-Click on input Search.png')

"Step 16: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 16-Enter input value in input Search.png')

"Step 17: Click on link testSuiteDetails (TestSuite) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 17-Click on link testSuiteDetails TestSuite - Navigate to page teamprojectgridplanjob.png')

"Step 18: Click on button Run2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Run2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 18-Click on button Run2.png')

"Step 19: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 19-Click on div Backdrop.png')

"Step 20: Click on button gridActions (Run3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/button_gridActions', ['button_gridActions_internalRoleButtonName': button_gridActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 20-Click on button gridActions Run3.png')

"Step 21: Click on div HistoryCalendarSchedules"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_HistoryCalendarSchedules'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 21-Click on div HistoryCalendarSchedules.png')

"Step 22: Click on link calendarDetails (History) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails_1', ['link_calendarDetails_nthChild': link_calendarDetails_nthChild, 'link_calendarDetails_internalRoleLinkName': link_calendarDetails_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 22-Click on link calendarDetails History - Navigate to page teamproject.png')

"Step 23: Click on link testManagement (History2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 23-Click on link testManagement History2.png')

"Step 24: Click on link testManagement (Schedules2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_1, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 24-Click on link testManagement Schedules2.png')

"Step 25: Click on link testManagement (History3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_2, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 25-Click on link testManagement History3.png')

"Step 26: Click on link testManagement (Calendar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_3, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 26-Click on link testManagement Calendar.png')

"Step 27: Click on link testManagement (Schedules2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild_4, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 27-Click on link testManagement Schedules2.png')

"Step 28: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 28-Click on input Search.png')

"Step 29: Enter input value in input Search -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search_1)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 29-Enter input value in input Search - Navigate to page .png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC51-Navigate to Welcome Page and Sign Out in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}