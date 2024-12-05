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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 4-Click on span Settings.png')

"Step 5: Click on link TrueTestBetaConfigure -> Navigate to page 'organization/*/settings/truetest'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 5-Click on link TrueTestBetaConfigure - Navigate to page organizationsettingstruetest.png')

"Step 6: Click on link Execution45 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_Execution45'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 6-Click on link Execution45 - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on link firstProjectAI (LLA Digital Jamaica E Commerce Flow) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_firstProjectAI"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_firstProjectAI', ['link_firstProjectAI_internalRoleLinkName': link_firstProjectAI_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 7-Click on link firstProjectAI LLA Digital Jamaica E Commerce Flow - Navigate to page teamproject.png')

"Step 8: Click on link TrueTestMenu -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestMenu'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 8-Click on link TrueTestMenu - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 9: Click on div UserJourneyGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_UserJourneyGraph'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 9-Click on div UserJourneyGraph.png')

"Step 10: Click on input ControlledCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_ControlledCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 10-Click on input ControlledCheckbox.png')

"Step 11: Click on button ExpandGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_ExpandGraph'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 11-Click on button ExpandGraph.png')

"Step 12: Click on button ExportAllFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_ExportAllFlows'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 12-Click on button ExportAllFlows.png')

"Step 13: Click on link DownloadCSV"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_DownloadCSV'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 13-Click on link DownloadCSV.png')

"Step 14: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 14-Click on span SettingsButton.png')

"Step 15: Click on link TrueTestBetaConfigure -> Navigate to page 'organization/*/settings/truetest'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 15-Click on link TrueTestBetaConfigure - Navigate to page organizationsettingstruetest.png')

"Step 16: Click on link Execution45 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_Execution45'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 16-Click on link Execution45 - Navigate to page organizationsettingstruetest.png')

"Step 17: Click on div QA Jamaica Flow E Commerce Active"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/div_QA_Jamaica_Flow_E_Commerce_Active'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 17-Click on div QA Jamaica Flow E Commerce Active.png')

"Step 18: Click on div gridCellLinks (GridCellLink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_gridCellLinks'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 18-Click on div gridCellLinks GridCellLink.png')

"Step 19: Click on p InstallTrueTestInstruction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/p_InstallTrueTestInstruction'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 19-Click on p InstallTrueTestInstruction.png')

"Step 20: Click on link firstProjectAI (LLA Digital Jamaica E Commerce Flow) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_firstProjectAI"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_firstProjectAI', ['link_firstProjectAI_internalRoleLinkName': link_firstProjectAI_internalRoleLinkName_1, 'team_id': team_id_1, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 20-Click on link firstProjectAI LLA Digital Jamaica E Commerce Flow - Navigate to page teamproject.png')

"Step 21: Click on link TrueTestMenu2 -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestMenu'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 21-Click on link TrueTestMenu2 - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 22: Click on button viewDetails (ViewDetails) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 22-Click on button viewDetails ViewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 23: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 23-Click on input SearchFlows.png')

"Step 24: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'), input_SearchFlows2)

WebUI.takeScreenshot(reportLocation + '/TC52/Step 24-Enter input value in input SearchFlows2.png')

"Step 25: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 25-Click on input SearchFlows.png')

"Step 26: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'), input_SearchFlows2_1)

WebUI.takeScreenshot(reportLocation + '/TC52/Step 26-Enter input value in input SearchFlows2.png')

"Step 27: Click on p userJourneyActions (VerifyNavigationToHome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 27-Click on p userJourneyActions VerifyNavigationToHome.png')

"Step 28: Click on button GoToNextPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_GoToNextPage'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 28-Click on button GoToNextPage.png')

"Step 29: Click on p userJourneyActions (VerifyInternetBundles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 29-Click on p userJourneyActions VerifyInternetBundles.png')

"Step 30: Click on button detailFlowPanels (ShowDetailFlowPanel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 30-Click on button detailFlowPanels ShowDetailFlowPanel.png')

"Step 31: Click on button GoToNextPage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_GoToNextPage2'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 31-Click on button GoToNextPage2.png')

"Step 32: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 32-Click on input SearchFlows.png')

"Step 33: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'), input_SearchFlows2_2)

WebUI.takeScreenshot(reportLocation + '/TC52/Step 33-Enter input value in input SearchFlows2.png')

"Step 34: Click on p userJourneyActions (NavigateAndInteract)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 34-Click on p userJourneyActions NavigateAndInteract.png')

"Step 35: Click on button detailFlowPanels (ShowDetailFlowPanel2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 35-Click on button detailFlowPanels ShowDetailFlowPanel2.png')

"Step 36: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 36-Click on input SearchFlows.png')

"Step 37: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'), input_SearchFlows2_3)

WebUI.takeScreenshot(reportLocation + '/TC52/Step 37-Enter input value in input SearchFlows2.png')

"Step 38: Click on button detailFlowPanels (ShowDetailFlowPanel3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 38-Click on button detailFlowPanels ShowDetailFlowPanel3 - Navigate to page .png')

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC52-Export User Journey Flows and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}