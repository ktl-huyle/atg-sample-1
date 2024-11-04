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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on div ApiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ApiKey'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 4-Click on div ApiKey.png')

"Step 5: Click on div ApiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ApiKey'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 5-Click on div ApiKey.png')

"Step 6: Click on link Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings_1'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 6-Click on link Settings.png')

"Step 7: Click on span ConfigCommand"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_ConfigCommand'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 7-Click on span ConfigCommand.png')

"Step 8: Click on pre KtStart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_KtStart'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 8-Click on pre KtStart.png')

"Step 9: Click on link navigationOptions (Integrations)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions', ['link_navigationOptions_nthChild': link_navigationOptions_nthChild, 'link_navigationOptions_internalRoleLinkName': link_navigationOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 9-Click on link navigationOptions Integrations.png')

"Step 10: Click on link navigationOptions (TestCloudTunnels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions', ['link_navigationOptions_nthChild': link_navigationOptions_nthChild_1, 'link_navigationOptions_internalRoleLinkName': link_navigationOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 10-Click on link navigationOptions TestCloudTunnels.png')

"Step 11: Click on button setupTunnels (Setup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_setupTunnels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_setupTunnels', ['button_setupTunnels_internalRoleTabName': button_setupTunnels_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 11-Click on button setupTunnels Setup.png')

"Step 12: Click on button setupTunnels (Tunnels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_setupTunnels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_setupTunnels', ['button_setupTunnels_internalRoleTabName': button_setupTunnels_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 12-Click on button setupTunnels Tunnels.png')

"Step 13: Click on link navigationOptions (ScriptRepositories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_navigationOptions', ['link_navigationOptions_nthChild': link_navigationOptions_nthChild_2, 'link_navigationOptions_internalRoleLinkName': link_navigationOptions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 13-Click on link navigationOptions ScriptRepositories.png')

"Step 14: Click on link externalResource (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_externalResource"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_externalResource', ['link_externalResource_trNthChild': link_externalResource_trNthChild, 'link_externalResource_internalRoleLinkName': link_externalResource_internalRoleLinkName, 'link_externalResource_project_id': link_externalResource_project_id, 'link_externalResource_team_id': link_externalResource_team_id, 'link_externalResource_test_project_id': link_externalResource_test_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 14-Click on link externalResource OracleJDE - Navigate to page teamprojecttest-project.png')

"Step 15: Click on div RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/div_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 15-Click on div RepositoryURL.png')

"Step 16: Click on button ScheduleTestRun -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 16-Click on button ScheduleTestRun - Navigate to page teamproject.png')

"Step 17: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 17-Click on input Name.png')

"Step 18: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 18-Click on input Name.png')

"Step 19: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC117/Step 19-Enter input value in input Name.png')

"Step 20: Click on div TestSuiteControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteControl'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 20-Click on div TestSuiteControl.png')

"Step 21: Click on div TestSuiteOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteOption'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 21-Click on div TestSuiteOption.png')

"Step 22: Click on div SelectEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 22-Click on div SelectEnvironment.png')

"Step 23: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 23-Click on item MoreOptions.png')

"Step 24: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 24-Click on label DesktopBrowsers.png')

"Step 25: Click on div ActiveTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 25-Click on div ActiveTunnels.png')

"Step 26: Click on div UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserEmail2'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 26-Click on div UserEmail.png')

"Step 27: Click on input IncludeAPICalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_IncludeAPICalls'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 27-Click on input IncludeAPICalls.png')

"Step 28: Click on input RadioButtonA"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButtonA'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 28-Click on input RadioButtonA.png')

"Step 29: Click on div Indicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 29-Click on div Indicator.png')

"Step 30: Click on div CreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 30-Click on div CreatedWithSketch.png')

"Step 31: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 31-Click on button Save.png')

"Step 32: Click on button AdvancedSettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AdvancedSettings'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 32-Click on button AdvancedSettings.png')

"Step 33: Click on div Latest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Latest'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 33-Click on div Latest.png')

"Step 34: Click on div VersionNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_VersionNumber'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 34-Click on div VersionNumber.png')

"Step 35: Click on div SelectRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 35-Click on div SelectRelease.png')

"Step 36: Enter input value in input ReleaseInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ReleaseInput'), input_ReleaseInput)

WebUI.takeScreenshot(reportLocation + '/TC117/Step 36-Enter input value in input ReleaseInput.png')

"Step 37: Click on div NoOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NoOptions'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 37-Click on div NoOptions.png')

"Step 38: Click on div AutocompleteControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_AutocompleteControl'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 38-Click on div AutocompleteControl.png')

"Step 39: Click on div SelectReleaseOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectReleaseOption'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 39-Click on div SelectReleaseOption.png')

"Step 40: Click on div SelectRelease2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease2'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 40-Click on div SelectRelease2.png')

"Step 41: Click on div SelectRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 41-Click on div SelectRelease.png')

"Step 42: Enter input value in input ReleaseInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ReleaseInput'), input_ReleaseInput_1)

WebUI.takeScreenshot(reportLocation + '/TC117/Step 42-Enter input value in input ReleaseInput.png')

"Step 43: Click on div SelectReleaseOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectReleaseOption'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 43-Click on div SelectReleaseOption.png')

"Step 44: Click on div SelectReleaseOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectReleaseOption2'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 44-Click on div SelectReleaseOption2.png')

"Step 45: Click on button GoBack"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoBack'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 45-Click on button GoBack.png')

"Step 46: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 46-Click on button Run.png')

"Step 47: Click on link viewTestRun (ViewCdcTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRun', ['link_viewTestRun_internalRoleLinkName': link_viewTestRun_internalRoleLinkName, 'link_viewTestRun_team_id': link_viewTestRun_team_id, 'link_viewTestRun_project_id': link_viewTestRun_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 47-Click on link viewTestRun ViewCdcTestRun.png')

"Step 48: Click on button selectRowAction (SelectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_selectRowAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_selectRowAction', ['button_selectRowAction_internalRoleRowName': button_selectRowAction_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 48-Click on button selectRowAction SelectRow.png')

"Step 49: Click on div backdrop (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_3'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 49-Click on div backdrop PopoverBackdrop.png')

"Step 50: Click on header testRunInfo (CdcTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunInfo', ['header_testRunInfo_internalRoleHeadingName': header_testRunInfo_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 50-Click on header testRunInfo CdcTestRun.png')

"Step 51: Click on button SessionsTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab_1'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 51-Click on button SessionsTab.png')

"Step 52: Click on button Sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 52-Click on button Sessions.png')

"Step 53: Click on button GoToDetails -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 53-Click on button GoToDetails - Navigate to page teamprojectgridplanjob.png')

"Step 54: Click on pre logOutput (LogOutput) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/pre_logOutput"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/pre_logOutput', ['pre_logOutput_internalText': pre_logOutput_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 54-Click on pre logOutput LogOutput - Navigate to page .png')

"Step 55: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC117-Setup and Run Test with Advanced Settings in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}