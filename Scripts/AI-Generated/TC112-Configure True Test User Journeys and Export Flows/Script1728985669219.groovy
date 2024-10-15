import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 3: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 4-Click on span SettingsButton.png')

"Step 5: Click on link TrueTestBetaConfigure -> Navigate to page '/organization/*/settings/truetest'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 5-Click on link TrueTestBetaConfigure - Navigate to page organizationsettingstruetest.png')

"Step 6: Click on link Execution -> Navigate to page '/organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_Execution'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 6-Click on link Execution - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on link projectLinks (ECommerceFlow) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 7-Click on link projectLinks ECommerceFlow - Navigate to page teamproject.png')

"Step 8: Click on link TrueTest -> Navigate to page '/team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 8-Click on link TrueTest - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 9: Click on div UserJourneyVisualization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_UserJourneyVisualization'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 9-Click on div UserJourneyVisualization.png')

"Step 10: Click on input Checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_Checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 10-Click on input Checkbox.png')

"Step 11: Click on button navigationButtons (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationButtons'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 11-Click on button navigationButtons ExpandGraph.png')

"Step 12: Click on button ExportAllFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_ExportAllFlows'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 12-Click on button ExportAllFlows.png')

"Step 13: Click on link DownloadCSV"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_DownloadCSV'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 13-Click on link DownloadCSV.png')

"Step 14: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 14-Click on span Settings.png')

"Step 15: Click on link TrueTestBetaConfigure -> Navigate to page '/organization/*/settings/truetest'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 15-Click on link TrueTestBetaConfigure - Navigate to page organizationsettingstruetest.png')

"Step 16: Click on link Execution -> Navigate to page '/organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_Execution'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 16-Click on link Execution - Navigate to page organizationsettingstruetest.png')

"Step 17: Click on div QA JamaicaFlow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/div_QA_JamaicaFlow'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 17-Click on div QA JamaicaFlow.png')

"Step 18: Click on div gridCells (GridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_gridCells'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 18-Click on div gridCells GridCell.png')

"Step 19: Click on p InstallTrueTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/p_InstallTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 19-Click on p InstallTrueTest.png')

"Step 20: Click on link projectLinks (ECommerceFlow) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 20-Click on link projectLinks ECommerceFlow - Navigate to page teamproject.png')

"Step 21: Click on link TrueTest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 21-Click on link TrueTest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 22: Click on button viewDetails (ViewDetails) -> Navigate to page '/team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 22-Click on button viewDetails ViewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 23: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 23-Click on input SearchFlows.png')

"Step 24: Enter input value in input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'), input_SearchFlows)

WebUI.takeScreenshot(reportLocation + '/TC112/Step 24-Enter input value in input SearchFlows.png')

"Step 25: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 25-Click on input SearchFlows.png')

"Step 26: Enter input value in input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'), input_SearchFlows)

WebUI.takeScreenshot(reportLocation + '/TC112/Step 26-Enter input value in input SearchFlows.png')

"Step 27: Click on p userJourneySteps (VerifyNavigationHome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps', ['p_userJourneySteps_class': p_userJourneySteps_class]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 27-Click on p userJourneySteps VerifyNavigationHome.png')

"Step 28: Click on button navigationButtons (GoToNextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationButtons'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 28-Click on button navigationButtons GoToNextPage.png')

"Step 29: Click on p userJourneySteps (VerifyInternetBundles)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps', ['p_userJourneySteps_class': p_userJourneySteps_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 29-Click on p userJourneySteps VerifyInternetBundles.png')

"Step 30: Click on button dynamicObject (NavigateInteract)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 30-Click on button dynamicObject NavigateInteract.png')

"Step 31: Click on button navigationButtons (GoToNextPage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationButtons'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 31-Click on button navigationButtons GoToNextPage2.png')

"Step 32: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 32-Click on input SearchFlows.png')

"Step 33: Enter input value in input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'), input_SearchFlows)

WebUI.takeScreenshot(reportLocation + '/TC112/Step 33-Enter input value in input SearchFlows.png')

"Step 34: Click on p userJourneySteps (NavigateInteract)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps', ['p_userJourneySteps_class': p_userJourneySteps_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 34-Click on p userJourneySteps NavigateInteract.png')

"Step 35: Click on button dynamicObject (ShowDetailFlowPanel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 35-Click on button dynamicObject ShowDetailFlowPanel.png')

"Step 36: Click on input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 36-Click on input SearchFlows.png')

"Step 37: Enter input value in input SearchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_SearchFlows'), input_SearchFlows)

WebUI.takeScreenshot(reportLocation + '/TC112/Step 37-Enter input value in input SearchFlows.png')

"Step 38: Click on button dynamicObject (ShowDetailFlowPanel2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 38-Click on button dynamicObject ShowDetailFlowPanel2 - Navigate to page .png')

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC112-Configure True Test User Journeys and Export Flows_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}