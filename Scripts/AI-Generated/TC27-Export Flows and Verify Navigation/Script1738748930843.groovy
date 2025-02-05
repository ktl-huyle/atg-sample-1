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

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 2-Click on span SettingsButton.png')

"Step 3: Click on link TrueTestBetaConfigure -> Navigate to page 'organization settings#organization/*/settings/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 3-Click on link TrueTestBetaConfigure - Navigate to page organization settingsorganizationsettings.png')

"Step 4: Click on link TrueTestVersion -> Navigate to page 'organization settings#organization/*/settings/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_TrueTestVersion'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 4-Click on link TrueTestVersion - Navigate to page organization settingsorganizationsettings.png')

"Step 5: Click on link DigitalJamaica -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_DigitalJamaica'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 5-Click on link DigitalJamaica - Navigate to page team projectteamproject.png')

"Step 6: Click on link TrueTest -> Navigate to page 'team project#team/*/project/*/*/*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 6-Click on link TrueTest - Navigate to page team projectteamproject.png')

"Step 7: Click on div UserJourneyGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserJourneyGraph'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 7-Click on div UserJourneyGraph.png')

"Step 8: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 8-Click on input SearchFlows.png')

"Step 9: Click on button navigationActions (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 9-Click on button navigationActions ExpandGraph.png')

"Step 10: Click on button ExportAllFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ExportAllFlows'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 10-Click on button ExportAllFlows.png')

"Step 11: Click on link DownloadCSV"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_DownloadCSV'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 11-Click on link DownloadCSV.png')

"Step 12: Click on span Settings3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings3'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 12-Click on span Settings3.png')

"Step 13: Click on link TrueTestBetaConfigure -> Navigate to page 'organization settings#organization/*/settings/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 13-Click on link TrueTestBetaConfigure - Navigate to page organization settingsorganizationsettings.png')

"Step 14: Click on link TrueTestVersion -> Navigate to page 'organization settings#organization/*/settings/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_TrueTestVersion'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 14-Click on link TrueTestVersion - Navigate to page organization settingsorganizationsettings.png')

"Step 15: Click on div QAFlowStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_QAFlowStatus'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 15-Click on div QAFlowStatus.png')

"Step 16: Click on div GridCellLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_GridCellLink'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 16-Click on div GridCellLink.png')

"Step 17: Click on p InstallTrueTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/p_InstallTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 17-Click on p InstallTrueTest.png')

"Step 18: Click on link DigitalJamaica -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_DigitalJamaica'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 18-Click on link DigitalJamaica - Navigate to page team projectteamproject.png')

"Step 19: Click on link TrueTest -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 19-Click on link TrueTest - Navigate to page team project detailsteamproject.png')

"Step 20: Click on button ViewDetails -> Navigate to page 'team project#team/*/project/*/*/*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/button_ViewDetails'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 20-Click on button ViewDetails - Navigate to page team projectteamproject.png')

"Step 21: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 21-Click on input SearchFlows2.png')

"Step 22: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 22-Enter input value in input SearchFlows2.png')

"Step 23: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 23-Click on input SearchFlows2.png')

"Step 24: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2_1)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 24-Enter input value in input SearchFlows2.png')

"Step 25: Click on p navigationVerification (VerifyNavigationHome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_navigationVerification"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_navigationVerification', ['p_navigationVerification_class': p_navigationVerification_class, 'p_navigationVerification_internalLabel': p_navigationVerification_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 25-Click on p navigationVerification VerifyNavigationHome.png')

"Step 26: Click on button navigationActions (NextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 26-Click on button navigationActions NextPage.png')

"Step 27: Click on p navigationVerification (VerifyInternetBundles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_navigationVerification"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_navigationVerification', ['p_navigationVerification_class': p_navigationVerification_class_1, 'p_navigationVerification_internalLabel': p_navigationVerification_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 27-Click on p navigationVerification VerifyInternetBundles.png')

"Step 28: Click on button detailActions (UnknownAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_detailActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_detailActions', ['button_detailActions_class': button_detailActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 28-Click on button detailActions UnknownAction.png')

"Step 29: Click on button navigationActions (NextPage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 29-Click on button navigationActions NextPage2.png')

"Step 30: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 30-Click on input SearchFlows2.png')

"Step 31: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2_2)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 31-Enter input value in input SearchFlows2.png')

"Step 32: Click on p navigationVerification (NavigateInteract)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_navigationVerification"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_navigationVerification', ['p_navigationVerification_class': p_navigationVerification_class_2, 'p_navigationVerification_internalLabel': p_navigationVerification_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 32-Click on p navigationVerification NavigateInteract.png')

"Step 33: Click on button detailActions (ShowDetailFlow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_detailActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_detailActions', ['button_detailActions_class': button_detailActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 33-Click on button detailActions ShowDetailFlow.png')

"Step 34: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 34-Click on input SearchFlows2.png')

"Step 35: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2_3)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 35-Enter input value in input SearchFlows2.png')

"Step 36: Click on button detailActions (ShowDetailFlow2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_detailActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_detailActions', ['button_detailActions_class': button_detailActions_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 36-Click on button detailActions ShowDetailFlow2 - Navigate to page .png')

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC27-Export Flows and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}