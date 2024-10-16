import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to organization/{*}/home"

TrueTestScripts.navigate("organization/{*}/home")

"Step 4: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on span SettingsButton.png')

"Step 5: Click on link TrueTestBetaConfigure -> Navigate to page 'organization settings#organization/{*}/settings/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Click on link TrueTestBetaConfigure - Navigate to page organization settingsorganizationsettings.png')

"Step 6: Click on link TrueTest45 -> Navigate to page 'organization settings#organization/{*}/settings/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_TrueTest45'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Click on link TrueTest45 - Navigate to page organization settingsorganizationsettings.png')

"Step 7: Click on link organizationSettings (ECommerceFlow) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationSettings', ['link_organizationSettings_internalRoleLinkName': link_organizationSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 7-Click on link organizationSettings ECommerceFlow - Navigate to page team projectteamproject.png')

"Step 8: Click on link TrueTest -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Click on link TrueTest - Navigate to page team projectteamproject.png')

"Step 9: Click on div UserJourneyGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserJourneyGraph'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 9-Click on div UserJourneyGraph.png')

"Step 10: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 10-Click on input SearchFlows.png')

"Step 11: Click on button navigation (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 11-Click on button navigation ExpandGraph.png')

"Step 12: Click on button ExportAllFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ExportAllFlows'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 12-Click on button ExportAllFlows.png')

"Step 13: Click on link DownloadCSV"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_DownloadCSV'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 13-Click on link DownloadCSV.png')

"Step 14: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 14-Click on span Settings.png')

"Step 15: Click on link TrueTestBetaConfigure -> Navigate to page 'organization settings#organization/{*}/settings/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 15-Click on link TrueTestBetaConfigure - Navigate to page organization settingsorganizationsettings.png')

"Step 16: Click on link TrueTest45 -> Navigate to page 'organization settings#organization/{*}/settings/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_TrueTest45'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 16-Click on link TrueTest45 - Navigate to page organization settingsorganizationsettings.png')

"Step 17: Click on div QAFlowECommerceActive"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_QAFlowECommerceActive'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 17-Click on div QAFlowECommerceActive.png')

"Step 18: Click on div organizationDetails (GridCellURL)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings/div_organizationDetails'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 18-Click on div organizationDetails GridCellURL.png')

"Step 19: Click on p InstallTrueTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/p_InstallTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 19-Click on p InstallTrueTest.png')

"Step 20: Click on link organizationSettings (ECommerceFlow) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationSettings', ['link_organizationSettings_internalRoleLinkName': link_organizationSettings_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 20-Click on link organizationSettings ECommerceFlow - Navigate to page team projectteamproject.png')

"Step 21: Click on link TrueTest -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 21-Click on link TrueTest - Navigate to page team projectteamproject.png')

"Step 22: Click on button viewDetails (ViewDetails) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 22-Click on button viewDetails ViewDetails - Navigate to page team projectteamproject.png')

"Step 23: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 23-Click on input SearchFlows2.png')

"Step 24: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 24-Enter input value in input SearchFlows2.png')

"Step 25: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 25-Click on input SearchFlows2.png')

"Step 26: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 26-Enter input value in input SearchFlows2.png')

"Step 27: Click on p verificationSteps (VerifyNavigation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps', ['p_verificationSteps_class': p_verificationSteps_class]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 27-Click on p verificationSteps VerifyNavigation.png')

"Step 28: Click on button navigation (NextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 28-Click on button navigation NextPage.png')

"Step 29: Click on p verificationSteps (VerifyInternetBundles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps', ['p_verificationSteps_class': p_verificationSteps_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 29-Click on p verificationSteps VerifyInternetBundles.png')

"Step 30: Click on button actionSteps (UnknownAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 30-Click on button actionSteps UnknownAction.png')

"Step 31: Click on button navigation (NextPage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 31-Click on button navigation NextPage2.png')

"Step 32: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 32-Click on input SearchFlows2.png')

"Step 33: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 33-Enter input value in input SearchFlows2.png')

"Step 34: Click on p verificationSteps (NavigateInteract)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps', ['p_verificationSteps_class': p_verificationSteps_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 34-Click on p verificationSteps NavigateInteract.png')

"Step 35: Click on button actionSteps (ShowDetailFlow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 35-Click on button actionSteps ShowDetailFlow.png')

"Step 36: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 36-Click on input SearchFlows2.png')

"Step 37: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 37-Enter input value in input SearchFlows2.png')

"Step 38: Click on button actionSteps (ShowDetailFlow2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 38-Click on button actionSteps ShowDetailFlow2 - Navigate to page .png')

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Configure TrueTest Settings and Verify Flows_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}