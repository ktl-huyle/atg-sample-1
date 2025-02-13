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

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on span SettingsButton.png')

"Step 3: Click on link TrueTestBetaConfigure -> Navigate to page 'organization settings#organization/*/settings/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on link TrueTestBetaConfigure - Navigate to page organization settingsorganizationsettings.png')

"Step 4: Click on link TrueTestVersion -> Navigate to page 'organization settings#organization/*/settings/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_TrueTestVersion'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on link TrueTestVersion - Navigate to page organization settingsorganizationsettings.png')

"Step 5: Click on link DigitalJamaica -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_DigitalJamaica'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on link DigitalJamaica - Navigate to page team projectteamproject.png')

"Step 6: Click on link TrueTest -> Navigate to page 'team project#team/*/project/*/*/*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on link TrueTest - Navigate to page team projectteamproject.png')

"Step 7: Click on div UserJourneyGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserJourneyGraph'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on div UserJourneyGraph.png')

"Step 8: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on input SearchFlows.png')

"Step 9: Click on button ExpandGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ExpandGraph'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on button ExpandGraph.png')

"Step 10: Click on button ExportAllFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ExportAllFlows'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on button ExportAllFlows.png')

"Step 11: Click on link DownloadCSV"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_DownloadCSV'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on link DownloadCSV.png')

"Step 12: Click on span Settings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on span Settings2.png')

"Step 13: Click on link TrueTestBetaConfigure -> Navigate to page 'organization settings#organization/*/settings/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Click on link TrueTestBetaConfigure - Navigate to page organization settingsorganizationsettings.png')

"Step 14: Click on link TrueTestVersion -> Navigate to page 'organization settings#organization/*/settings/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_TrueTestVersion'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on link TrueTestVersion - Navigate to page organization settingsorganizationsettings.png')

"Step 15: Click on div QAFlowStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_QAFlowStatus'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15-Click on div QAFlowStatus.png')

"Step 16: Click on div GridCellLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_GridCellLink'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 16-Click on div GridCellLink.png')

"Step 17: Click on p InstallTrueTest -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/p_InstallTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17-Click on p InstallTrueTest - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Configure True Test Settings in Organization_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}