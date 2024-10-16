import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

WebUI.takeScreenshot(reportLocation + '/TC163/Step 4-Click on span SettingsButton.png')

"Step 5: Click on link TrueTestBetaConfigure -> Navigate to page 'organization settings#organization/{*}/settings/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 5-Click on link TrueTestBetaConfigure - Navigate to page organization settingsorganizationsettings.png')

"Step 6: Click on link TrueTest45 -> Navigate to page 'organization settings#organization/{*}/settings/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_TrueTest45'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 6-Click on link TrueTest45 - Navigate to page organization settingsorganizationsettings.png')

"Step 7: Click on link organizationProjects (ECommerceFlow) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationProjects', ['link_organizationProjects_internalRoleLinkName': link_organizationProjects_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 7-Click on link organizationProjects ECommerceFlow - Navigate to page team projectteamproject.png')

"Step 8: Click on link TrueTest -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 8-Click on link TrueTest - Navigate to page team projectteamproject.png')

"Step 9: Click on div UserJourneyGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserJourneyGraph'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 9-Click on div UserJourneyGraph.png')

"Step 10: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 10-Click on input SearchFlows.png')

"Step 11: Click on button navigationActions (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 11-Click on button navigationActions ExpandGraph.png')

"Step 12: Click on button ExportAllFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ExportAllFlows'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 12-Click on button ExportAllFlows.png')

"Step 13: Click on link DownloadCSV"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_DownloadCSV'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 13-Click on link DownloadCSV.png')

"Step 14: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 14-Click on span Settings.png')

"Step 15: Click on link TrueTestBetaConfigure -> Navigate to page 'organization settings#organization/{*}/settings/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 15-Click on link TrueTestBetaConfigure - Navigate to page organization settingsorganizationsettings.png')

"Step 16: Click on link TrueTest45 -> Navigate to page 'organization settings#organization/{*}/settings/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_TrueTest45'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 16-Click on link TrueTest45 - Navigate to page organization settingsorganizationsettings.png')

"Step 17: Click on div QAFlowECommerceActive"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/div_QAFlowECommerceActive'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 17-Click on div QAFlowECommerceActive.png')

"Step 18: Click on div organizationInfo (GridCellURL)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings/div_organizationInfo'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 18-Click on div organizationInfo GridCellURL.png')

"Step 19: Click on p InstallTrueTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/p_InstallTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 19-Click on p InstallTrueTest.png')

"Step 20: Click on link organizationProjects (ECommerceFlow) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationProjects', ['link_organizationProjects_internalRoleLinkName': link_organizationProjects_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 20-Click on link organizationProjects ECommerceFlow - Navigate to page team projectteamproject.png')

"Step 21: Click on link TrueTest -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 21-Click on link TrueTest - Navigate to page team projectteamproject.png')

"Step 22: Click on button viewDetails (ViewDetails) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 22-Click on button viewDetails ViewDetails - Navigate to page team projectteamproject.png')

"Step 23: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 23-Click on input SearchFlows2.png')

"Step 24: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2)

WebUI.takeScreenshot(reportLocation + '/TC163/Step 24-Enter input value in input SearchFlows2.png')

"Step 25: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 25-Click on input SearchFlows2.png')

"Step 26: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2)

WebUI.takeScreenshot(reportLocation + '/TC163/Step 26-Enter input value in input SearchFlows2.png')

"Step 27: Click on p enquiryActions (VerifyNavigation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions', ['p_enquiryActions_class': p_enquiryActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 27-Click on p enquiryActions VerifyNavigation.png')

"Step 28: Click on button navigationActions (NextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 28-Click on button navigationActions NextPage.png')

"Step 29: Click on p enquiryActions (VerifyInternetBundles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions', ['p_enquiryActions_class': p_enquiryActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 29-Click on p enquiryActions VerifyInternetBundles.png')

"Step 30: Click on button actionSteps (UnknownAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 30-Click on button actionSteps UnknownAction.png')

"Step 31: Click on button navigationActions (NextPage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 31-Click on button navigationActions NextPage2.png')

"Step 32: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 32-Click on input SearchFlows2.png')

"Step 33: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2)

WebUI.takeScreenshot(reportLocation + '/TC163/Step 33-Enter input value in input SearchFlows2.png')

"Step 34: Click on p enquiryActions (NavigateInteract)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions', ['p_enquiryActions_class': p_enquiryActions_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 34-Click on p enquiryActions NavigateInteract.png')

"Step 35: Click on button actionSteps (ShowDetailFlow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 35-Click on button actionSteps ShowDetailFlow.png')

"Step 36: Click on input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 36-Click on input SearchFlows2.png')

"Step 37: Enter input value in input SearchFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_SearchFlows2'), input_SearchFlows2)

WebUI.takeScreenshot(reportLocation + '/TC163/Step 37-Enter input value in input SearchFlows2.png')

"Step 38: Click on button actionSteps (ShowDetailFlow2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 38-Click on button actionSteps ShowDetailFlow2 - Navigate to page .png')

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC163-Configure true test settings and manage user journeys in organization_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}