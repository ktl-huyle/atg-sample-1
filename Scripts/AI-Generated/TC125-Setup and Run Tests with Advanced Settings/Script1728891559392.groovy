import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on div ApiKeyIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ApiKeyIcon'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 4-Click on div ApiKeyIcon.png')

"Step 5: Click on div ApiKeyIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ApiKeyIcon'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 5-Click on div ApiKeyIcon.png')

"Step 6: Click on link Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings7'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 6-Click on link Settings.png')

"Step 7: Click on span ConfigText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_ConfigText'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 7-Click on span ConfigText.png')

"Step 8: Click on pre KtStart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_KtStart'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 8-Click on pre KtStart.png')

"Step 9: Click on link testingResources (Integrations)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testingResources', ['link_testingResources_nthChild': link_testingResources_nthChild, 'link_testingResources_internalRoleLinkName': link_testingResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 9-Click on link testingResources Integrations.png')

"Step 10: Click on link testingResources (TestCloudTunnels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testingResources', ['link_testingResources_nthChild': link_testingResources_nthChild_1, 'link_testingResources_internalRoleLinkName': link_testingResources_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 10-Click on link testingResources TestCloudTunnels.png')

"Step 11: Click on button setupActions (Setup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_setupActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_setupActions', ['button_setupActions_internalRoleTabName': button_setupActions_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 11-Click on button setupActions Setup.png')

"Step 12: Click on button setupActions (Tunnels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_setupActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_setupActions', ['button_setupActions_internalRoleTabName': button_setupActions_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 12-Click on button setupActions Tunnels.png')

"Step 13: Click on link testingResources (ScriptRepositories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testingResources', ['link_testingResources_nthChild': link_testingResources_nthChild_2, 'link_testingResources_internalRoleLinkName': link_testingResources_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 13-Click on link testingResources ScriptRepositories.png')

"Step 14: Click on link externalResource (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_externalResource"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_externalResource', ['link_externalResource_trNthChild': link_externalResource_trNthChild, 'link_externalResource_internalRoleLinkName': link_externalResource_internalRoleLinkName, 'link_externalResource_project_id': link_externalResource_project_id, 'link_externalResource_test_project_id': link_externalResource_test_project_id, 'link_externalResource_team_id': link_externalResource_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 14-Click on link externalResource OracleJDE - Navigate to page teamprojecttest-project.png')

"Step 15: Click on div RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/div_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 15-Click on div RepositoryURL.png')

"Step 16: Click on button ScheduleTestRun -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 16-Click on button ScheduleTestRun - Navigate to page teamproject.png')

"Step 17: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name_1'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 17-Click on input Name.png')

"Step 18: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name_1'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 18-Click on input Name.png')

"Step 19: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name_1'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC125/Step 19-Enter input value in input Name.png')

"Step 20: Click on div TestSuiteControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteControl'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 20-Click on div TestSuiteControl.png')

"Step 21: Click on div TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 21-Click on div TestSuites.png')

"Step 22: Click on div SelectEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment_1'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 22-Click on div SelectEnvironment.png')

"Step 23: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions_1'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 23-Click on item MoreOptions.png')

"Step 24: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 24-Click on label DesktopBrowsers.png')

"Step 25: Click on div ActiveTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 25-Click on div ActiveTunnels.png')

"Step 26: Click on div UserEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserEmail'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 26-Click on div UserEmail.png')

"Step 27: Click on input IncludeAPICalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_IncludeAPICalls'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 27-Click on input IncludeAPICalls.png')

"Step 28: Click on input RadioButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButton_1'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 28-Click on input RadioButton.png')

"Step 29: Click on div ReactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl_1'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 29-Click on div ReactSelectControl.png')

"Step 30: Click on div CreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketch_1'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 30-Click on div CreatedWithSketch.png')

"Step 31: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save_1'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 31-Click on button Save.png')

"Step 32: Click on button AdvancedSettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AdvancedSettings'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 32-Click on button AdvancedSettings.png')

"Step 33: Click on div Latest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Latest'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 33-Click on div Latest.png')

"Step 34: Click on div Version"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Version'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 34-Click on div Version.png')

"Step 35: Click on div SelectRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 35-Click on div SelectRelease.png')

"Step 36: Enter input value in input ReactSelectInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ReactSelectInput'), input_ReactSelectInput)

WebUI.takeScreenshot(reportLocation + '/TC125/Step 36-Enter input value in input ReactSelectInput.png')

"Step 37: Click on div NoOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NoOptions'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 37-Click on div NoOptions.png')

"Step 38: Click on div AutocompleteControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_AutocompleteControl'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 38-Click on div AutocompleteControl.png')

"Step 39: Click on div SelectRelease2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease2'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 39-Click on div SelectRelease2.png')

"Step 40: Click on div SelectRelease3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease3'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 40-Click on div SelectRelease3.png')

"Step 41: Click on div SelectRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 41-Click on div SelectRelease.png')

"Step 42: Enter input value in input ReactSelectInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ReactSelectInput'), input_ReactSelectInput)

WebUI.takeScreenshot(reportLocation + '/TC125/Step 42-Enter input value in input ReactSelectInput.png')

"Step 43: Click on div SelectRelease2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease2'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 43-Click on div SelectRelease2.png')

"Step 44: Click on div SelectRelease4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectRelease4'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 44-Click on div SelectRelease4.png')

"Step 45: Click on button GoBack"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoBack'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 45-Click on button GoBack.png')

"Step 46: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run_1'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 46-Click on button Run.png')

"Step 47: Click on link viewTestRun (ViewCdcTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRun', ['link_viewTestRun_internalRoleLinkName': link_viewTestRun_internalRoleLinkName, 'link_viewTestRun_team_id': link_viewTestRun_team_id, 'link_viewTestRun_project_id': link_viewTestRun_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 47-Click on link viewTestRun ViewCdcTestRun.png')

"Step 48: Click on button selectRow (SelectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_selectRow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_selectRow', ['button_selectRow_internalRoleRowName': button_selectRow_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 48-Click on button selectRow SelectRow.png')

"Step 49: Click on div backdrop (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 49-Click on div backdrop PopoverBackdrop.png')

"Step 50: Click on header testRun (CdcTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 50-Click on header testRun CdcTestRun.png')

"Step 51: Click on button Sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 51-Click on button Sessions.png')

"Step 52: Click on button Sessions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Sessions2'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 52-Click on button Sessions2.png')

"Step 53: Click on button GoToDetails -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoToDetails_1'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 53-Click on button GoToDetails - Navigate to page teamprojectgridplanjob.png')

"Step 54: Click on pre logTimestamp (LogTimestamp) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/pre_logTimestamp"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/pre_logTimestamp', ['pre_logTimestamp_internalText': pre_logTimestamp_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 54-Click on pre logTimestamp LogTimestamp - Navigate to page .png')

"Step 55: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC125-Setup and Run Tests with Advanced Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}