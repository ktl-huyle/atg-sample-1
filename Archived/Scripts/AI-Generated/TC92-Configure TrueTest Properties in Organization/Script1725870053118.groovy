import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on span settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_settings'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 4-Click on span settings.png')

"Step 5: Click on link truetestBetaConfigurePropertiesForTrueTest -> Navigate to page 'organization/*/settings/truetest'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_truetestBetaConfigurePropertiesForTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 5-Click on link truetestBetaConfigurePropertiesForTrueTest - Navigate to page organizationsettingstruetest.png')

"Step 6: Click on link 45 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_45'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 6-Click on link 45 - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on link firstProjectAi -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_firstProjectAi'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 7-Click on link firstProjectAi - Navigate to page teamproject.png')

"Step 8: Click on link settings -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 8-Click on link settings - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 9: Click on div graphVisualizationUserJourney"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_graphVisualizationUserJourney'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 9-Click on div graphVisualizationUserJourney.png')

"Step 10: Click on input privateSwitchBase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_privateSwitchBase'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 10-Click on input privateSwitchBase.png')

"Step 11: Click on button expandGraphBtn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_expandGraphBtn'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 11-Click on button expandGraphBtn.png')

"Step 12: Click on button exportAllFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_exportAllFlows'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 12-Click on button exportAllFlows.png')

"Step 13: Click on link subscribe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_subscribe'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 13-Click on link subscribe.png')

"Step 14: Click on span settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/span_settings'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 14-Click on span settings.png')

"Step 15: Click on link trueTestBetaConfigure -> Navigate to page 'organization/*/settings/truetest'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_trueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 15-Click on link trueTestBetaConfigure - Navigate to page organizationsettingstruetest.png')

"Step 16: Click on link 45 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_45'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 16-Click on link 45 - Navigate to page organizationsettingstruetest.png')

"Step 17: Click on div qaJamaicaFlowEcommerceActive"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/div_qaJamaicaFlowEcommerceActive'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 17-Click on div qaJamaicaFlowEcommerceActive.png')

"Step 18: Click on div httpsFlistjamDiscoverflowLlaDigital"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/div_httpsFlistjamDiscoverflowLlaDigital'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 18-Click on div httpsFlistjamDiscoverflowLlaDigital.png')

"Step 19: Click on p installTrueTestOnYour"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/p_installTrueTestOnYour'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 19-Click on p installTrueTestOnYour.png')

"Step 20: Click on link firstProjectAi -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_firstProjectAi'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 20-Click on link firstProjectAi - Navigate to page teamproject.png')

"Step 21: Click on link settings -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 21-Click on link settings - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 22: Click on button viewDetails -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/button_viewDetails'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 22-Click on button viewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 23: Click on input searchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 23-Click on input searchFlows.png')

"Step 24: Enter input value in input searchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlows'), input_searchFlows)

WebUI.takeScreenshot(reportLocation + '/TC92/Step 24-Enter input value in input searchFlows.png')

"Step 25: Click on input searchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 25-Click on input searchFlows.png')

"Step 26: Enter input value in input searchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlows'), input_searchFlows)

WebUI.takeScreenshot(reportLocation + '/TC92/Step 26-Enter input value in input searchFlows.png')

"Step 27: Click on p verifyNavigationToHome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_verifyNavigationToHome'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 27-Click on p verifyNavigationToHome.png')

"Step 28: Click on button goToNextPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_goToNextPage'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 28-Click on button goToNextPage.png')

"Step 29: Click on p submitDecisionForNpcc"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_submitDecisionForNpcc'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 29-Click on p submitDecisionForNpcc.png')

"Step 30: Click on button chevronRight5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_chevronRight5'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 30-Click on button chevronRight5.png')

"Step 31: Click on button goToNextPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_goToNextPage'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 31-Click on button goToNextPage.png')

"Step 32: Click on input searchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 32-Click on input searchFlows.png')

"Step 33: Enter input value in input searchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlows'), input_searchFlows)

WebUI.takeScreenshot(reportLocation + '/TC92/Step 33-Enter input value in input searchFlows.png')

"Step 34: Click on p verifyNavigationToHome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_verifyNavigationToHome'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 34-Click on p verifyNavigationToHome.png')

"Step 35: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 35-Click on button object.png')

"Step 36: Click on input searchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlows'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 36-Click on input searchFlows.png')

"Step 37: Enter input value in input searchFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/input_searchFlows'), input_searchFlows)

WebUI.takeScreenshot(reportLocation + '/TC92/Step 37-Enter input value in input searchFlows.png')

"Step 38: Click on button object2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 38-Click on button object2 - Navigate to page .png')

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC92-Configure TrueTest Properties in Organization_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}