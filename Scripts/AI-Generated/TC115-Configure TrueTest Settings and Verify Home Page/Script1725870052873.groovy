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

"Step 4: Click on link signOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_organizationSetupConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 4-Click on link signOut.png')

"Step 5: Click on span settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_settings'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 5-Click on span settings.png')

"Step 6: Click on link truetestBetaConfigurePropertiesForTrueTest -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_truetestBetaConfigurePropertiesForTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 6-Click on link truetestBetaConfigurePropertiesForTrueTest - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on div httpsOspredevIrl01Vopak"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/div_httpsOspredevIrl01Vopak'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 7-Click on div httpsOspredevIrl01Vopak.png')

"Step 8: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 8-Click on button object.png')

"Step 9: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 9-Click on span object.png')

"Step 10: Click on button applicationUnderTestCancelButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_applicationUnderTestCancelButton'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 10-Click on button applicationUnderTestCancelButton.png')

"Step 11: Click on button g"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_g'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 11-Click on button g.png')

"Step 12: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 12-Click on link signOut - Navigate to page organizationhome.png')

"Step 13: Click on button settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_settings'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 13-Click on button settings.png')

"Step 14: Click on link signOut -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_organizationSetupConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 14-Click on link signOut - Navigate to page organizationsettingstruetest.png')

"Step 15: Click on link firstProjectAi -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_firstProjectAi'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 15-Click on link firstProjectAi - Navigate to page teamproject.png')

"Step 16: Click on link truetestUserJourneys -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 16-Click on link truetestUserJourneys - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 17: Click on button viewDetails -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/button_viewDetails'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 17-Click on button viewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 18: Click on div verifyLoginWithMailOtponHomePageNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_verifyLoginWithMailOtponHomePageNth0'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 18-Click on div verifyLoginWithMailOtponHomePageNth0.png')

"Step 19: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 19-Click on button object.png')

"Step 20: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 20-Click on button object2.png')

"Step 21: Click on button showDetailFlowPanel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 21-Click on button showDetailFlowPanel.png')

"Step 22: Click on button showDetailFlowPanel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel2'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 22-Click on button showDetailFlowPanel2.png')

"Step 23: Click on button showDetailFlowPanel3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel3'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 23-Click on button showDetailFlowPanel3.png')

"Step 24: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object3'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 24-Click on button object3.png')

"Step 25: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 25-Click on button object4.png')

"Step 26: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object5'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 26-Click on button object5.png')

"Step 27: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 27-Click on button object6.png')

"Step 28: Click on button object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object7'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 28-Click on button object7.png')

"Step 29: Click on button object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object8'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 29-Click on button object8.png')

"Step 30: Click on div verifyNpccreviewAccessFromPresalesPageNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_verifyNpccreviewAccessFromPresalesPageNth0'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 30-Click on div verifyNpccreviewAccessFromPresalesPageNth0.png')

"Step 31: Click on button object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object9'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 31-Click on button object9.png')

"Step 32: Click on button showDetailFlowPanel4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel4'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 32-Click on button showDetailFlowPanel4.png')

"Step 33: Click on button showDetailFlowPanel5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel5'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 33-Click on button showDetailFlowPanel5.png')

"Step 34: Click on button object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object10'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 34-Click on button object10.png')

"Step 35: Click on button object11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object11'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 35-Click on button object11.png')

"Step 36: Click on p searchPartsUsingQuick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_searchPartsUsingQuick'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 36-Click on p searchPartsUsingQuick.png')

"Step 37: Click on p submitDecisionForNpcc"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_submitDecisionForNpcc'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 37-Click on p submitDecisionForNpcc.png')

"Step 38: Click on p addEnquiryForNpcconHome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_addEnquiryForNpcconHome'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 38-Click on p addEnquiryForNpcconHome.png')

"Step 39: Click on p verifyHeaderObjectAndLoginOnHomePage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_verifyHeaderObjectAndLoginOnHomePage'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 39-Click on p verifyHeaderObjectAndLoginOnHomePage.png')

"Step 40: Click on p verifyHeaderObjectAndLoginAgainOnHomePage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_verifyHeaderObjectAndLoginAgainOnHomePage'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 40-Click on p verifyHeaderObjectAndLoginAgainOnHomePage.png')

"Step 41: Click on button goToNextPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_goToNextPage'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 41-Click on button goToNextPage.png')

"Step 42: Click on div openServiceSearchFromPresalesPageNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_openServiceSearchFromPresalesPageNth0'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 42-Click on div openServiceSearchFromPresalesPageNth0.png')

"Step 43: Click on button expandGraphBtn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_expandGraphBtn'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 43-Click on button expandGraphBtn.png')

"Step 44: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 44-Click on body object.png')

"Step 45: Click on item flowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/item_flowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 45-Click on item flowsWithoutTestCases.png')

"Step 46: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 46-Click on body object.png')

"Step 47: Click on button shamika"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_shamika'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 47-Click on button shamika.png')

"Step 48: Click on link signOut -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC115/Step 48-Click on link signOut - Navigate to page .png')

"Step 49: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC115-Configure TrueTest Settings and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}