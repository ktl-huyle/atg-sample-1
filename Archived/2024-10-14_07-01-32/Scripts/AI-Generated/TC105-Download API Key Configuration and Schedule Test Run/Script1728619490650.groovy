import truetest.common.scheduleAndRunTestDemo
import truetest.custom.TrueTestScripts
import truetest.common.downloadApiKeyConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 4: Click on link projectNavigation (TestCloudTunnels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 4-Click on link projectNavigation TestCloudTunnels.png')

"Step 5: Click on link projectNavigation (General)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 5-Click on link projectNavigation General.png')

"Step 6: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 6-Click on span Settings.png')

"Step 7: Click on div menu (Backdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 7-Click on div menu Backdrop.png')

"Step 8: Click on link projectNavigation (TestCloudTunnels2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_1, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 8-Click on link projectNavigation TestCloudTunnels2.png')

"Step 9: Click on button teamSetup (Setup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_teamSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_teamSetup', ['button_teamSetup_internalRoleTabName': button_teamSetup_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 9-Click on button teamSetup Setup.png')

"Step 10: Download API key configuration and settings"

downloadApiKeyConfiguration.execute()

"Step 11: Click on link projectNavigation (Integrations)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_2, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 11-Click on link projectNavigation Integrations.png')

"Step 12: Click on link projectNavigation (TestCloudTunnels2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_3, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 12-Click on link projectNavigation TestCloudTunnels2.png')

"Step 13: Click on button teamSetup (Setup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_teamSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_teamSetup', ['button_teamSetup_internalRoleTabName': button_teamSetup_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 13-Click on button teamSetup Setup.png')

"Step 14: Click on button teamSetup (Tunnels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_teamSetup"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_teamSetup', ['button_teamSetup_internalRoleTabName': button_teamSetup_internalRoleTabName_2]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 14-Click on button teamSetup Tunnels.png')

"Step 15: Click on link projectNavigation (ScriptRepositories2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild_4, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 15-Click on link projectNavigation ScriptRepositories2.png')

"Step 16: Click on link dynamicObject (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'link_dynamicObject_test_project_id': link_dynamicObject_test_project_id, 'link_dynamicObject_project_id': link_dynamicObject_project_id, 'link_dynamicObject_team_id': link_dynamicObject_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 16-Click on link dynamicObject OracleJDE - Navigate to page teamprojecttest-project.png')

"Step 17: Click on div RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/div_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 17-Click on div RepositoryURL.png')

"Step 18: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 18-Click on button ScheduleTestRun.png')

"Step 19: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_0, Integer.valueOf(index_0))

"Step 20: Click on link testRunNavigation (ViewCdcTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation_1', ['link_testRunNavigation_internalRoleLinkName': link_testRunNavigation_internalRoleLinkName, 'link_testRunNavigation_team_id': link_testRunNavigation_team_id, 'link_testRunNavigation_project_id': link_testRunNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 20-Click on link testRunNavigation ViewCdcTestRun.png')

"Step 21: Click on button rowSelection (SelectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection', ['button_rowSelection_internalRoleRowName': button_rowSelection_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 21-Click on button rowSelection SelectRow.png')

"Step 22: Click on div menu (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 22-Click on div menu PopoverBackdrop.png')

"Step 23: Click on header testRun (CdcTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 23-Click on header testRun CdcTestRun.png')

"Step 24: Click on button Sessions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Sessions2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 24-Click on button Sessions2.png')

"Step 25: Click on button Sessions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Sessions3'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 25-Click on button Sessions3.png')

"Step 26: Click on button GoToDetails -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoToDetails_1'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 26-Click on button GoToDetails - Navigate to page teamprojectgridplanjob.png')

"Step 27: Click on pre logInfo (LogTimestamp) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/pre_logInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/pre_logInfo', ['pre_logInfo_internalText': pre_logInfo_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 27-Click on pre logInfo LogTimestamp - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC105-Download API Key Configuration and Schedule Test Run_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}