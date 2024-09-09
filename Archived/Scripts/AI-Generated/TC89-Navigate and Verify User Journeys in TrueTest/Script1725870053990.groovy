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

"Step 4: Click on link organizationSetupConfigure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_organizationSetupConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 4-Click on link organizationSetupConfigure.png')

"Step 5: Click on span settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_settings'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 5-Click on span settings.png')

"Step 6: Click on link truetestBetaConfigurePropertiesForTrueTest -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_truetestBetaConfigurePropertiesForTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 6-Click on link truetestBetaConfigurePropertiesForTrueTest - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on div httpsOspredevIrl01Vopak"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/div_httpsOspredevIrl01Vopak'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 7-Click on div httpsOspredevIrl01Vopak.png')

"Step 8: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 8-Click on button object.png')

"Step 9: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 9-Click on span object.png')

"Step 10: Click on button applicationUnderTestCancelButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_applicationUnderTestCancelButton'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 10-Click on button applicationUnderTestCancelButton.png')

"Step 11: Click on button g"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_g'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 11-Click on button g.png')

"Step 12: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 12-Click on link signOut - Navigate to page organizationhome.png')

"Step 13: Click on button settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_settings'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 13-Click on button settings.png')

"Step 14: Click on link organizationSetupConfigure -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_organizationSetupConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 14-Click on link organizationSetupConfigure - Navigate to page organizationsettingstruetest.png')

"Step 15: Click on link firstProjectAi -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_firstProjectAi'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 15-Click on link firstProjectAi - Navigate to page teamproject.png')

"Step 16: Click on link settings -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 16-Click on link settings - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 17: Click on button viewDetails -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/button_viewDetails'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 17-Click on button viewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 18: Click on div verifyLoginWithMailOtponHomePageNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_verifyLoginWithMailOtponHomePageNth0'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 18-Click on div verifyLoginWithMailOtponHomePageNth0.png')

"Step 19: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 19-Click on button object.png')

"Step 20: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 20-Click on button object2.png')

"Step 21: Click on button showDetailFlowPanel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 21-Click on button showDetailFlowPanel.png')

"Step 22: Click on button showDetailFlowPanel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 22-Click on button showDetailFlowPanel2.png')

"Step 23: Click on button showDetailFlowPanel3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 23-Click on button showDetailFlowPanel3.png')

"Step 24: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 24-Click on button object3.png')

"Step 25: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 25-Click on button object4.png')

"Step 26: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object5'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 26-Click on button object5.png')

"Step 27: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 27-Click on button object6.png')

"Step 28: Click on button object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object7'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 28-Click on button object7.png')

"Step 29: Click on button object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object8'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 29-Click on button object8.png')

"Step 30: Click on div verifyNpccreviewAccessFromPresalesPageNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_verifyNpccreviewAccessFromPresalesPageNth0'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 30-Click on div verifyNpccreviewAccessFromPresalesPageNth0.png')

"Step 31: Click on button object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object9'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 31-Click on button object9.png')

"Step 32: Click on button showDetailFlowPanel4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel4'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 32-Click on button showDetailFlowPanel4.png')

"Step 33: Click on button showDetailFlowPanel5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel5'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 33-Click on button showDetailFlowPanel5.png')

"Step 34: Click on button object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object10'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 34-Click on button object10.png')

"Step 35: Click on button object11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object11'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 35-Click on button object11.png')

"Step 36: Click on p searchPartsUsingQuick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_searchPartsUsingQuick'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 36-Click on p searchPartsUsingQuick.png')

"Step 37: Click on p submitDecisionForNpcc"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_submitDecisionForNpcc'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 37-Click on p submitDecisionForNpcc.png')

"Step 38: Click on p addEnquiryForNpcconHome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_addEnquiryForNpcconHome'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 38-Click on p addEnquiryForNpcconHome.png')

"Step 39: Click on p verifyHeaderObjectAndLoginOnHomePage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_verifyHeaderObjectAndLoginOnHomePage'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 39-Click on p verifyHeaderObjectAndLoginOnHomePage.png')

"Step 40: Click on p verifyHeaderObjectAndLoginAgainOnHomePage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_verifyHeaderObjectAndLoginAgainOnHomePage'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 40-Click on p verifyHeaderObjectAndLoginAgainOnHomePage.png')

"Step 41: Click on button goToNextPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_goToNextPage'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 41-Click on button goToNextPage.png')

"Step 42: Click on div openServiceSearchFromPresalesPageNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_openServiceSearchFromPresalesPageNth0'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 42-Click on div openServiceSearchFromPresalesPageNth0.png')

"Step 43: Click on button expandGraphBtn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_expandGraphBtn'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 43-Click on button expandGraphBtn.png')

"Step 44: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 44-Click on body object.png')

"Step 45: Click on item flowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/item_flowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 45-Click on item flowsWithoutTestCases.png')

"Step 46: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 46-Click on body object.png')

"Step 47: Click on button shamika"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_shamika'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 47-Click on button shamika.png')

"Step 48: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 48-Click on link signOut - Navigate to page organizationhome.png')

"Step 49: Click on button surbanaJurong"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_surbanaJurong'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 49-Click on button surbanaJurong.png')

"Step 50: Click on link ecoOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ecoOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 50-Click on link ecoOrganization.png')

"Step 51: Click on link ojOracleJde -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ojOracleJde'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 51-Click on link ojOracleJde - Navigate to page teamproject.png')

"Step 52: Click on link settings -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 52-Click on link settings - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 53: Click on button viewDetails -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/button_viewDetails'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 53-Click on button viewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 54: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 54-Click on button object.png')

"Step 55: Click on div testStepsNavigateTo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_testStepsNavigateTo'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 55-Click on div testStepsNavigateTo.png')

"Step 56: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 56-Click on button object2.png')

"Step 57: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 57-Click on p login3.png')

"Step 58: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 58-Click on p login3.png')

"Step 59: Click on button showDetailFlowPanel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 59-Click on button showDetailFlowPanel.png')

"Step 60: Click on div navigateToClickOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_navigateToClickOn'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 60-Click on div navigateToClickOn.png')

"Step 61: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 61-Click on p login3.png')

"Step 62: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 62-Click on p login3.png')

"Step 63: Click on button chevronRight"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_chevronRight'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 63-Click on button chevronRight.png')

"Step 64: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 64-Click on p login3.png')

"Step 65: Click on button showDetailFlowPanel3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 65-Click on button showDetailFlowPanel3.png')

"Step 66: Click on button chevronRight2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_chevronRight2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 66-Click on button chevronRight2.png')

"Step 67: Click on p login8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login8'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 67-Click on p login8.png')

"Step 68: Click on p login8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login8'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 68-Click on p login8.png')

"Step 69: Click on button showDetailFlowPanel6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel6'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 69-Click on button showDetailFlowPanel6.png')

"Step 70: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 70-Click on p login3.png')

"Step 71: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 71-Click on p login3.png')

"Step 72: Click on button chevronRight3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_chevronRight3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 72-Click on button chevronRight3.png')

"Step 73: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 73-Click on p login3.png')

"Step 74: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 74-Click on p login3.png')

"Step 75: Click on button chevronRight4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_chevronRight4'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 75-Click on button chevronRight4.png')

"Step 76: Click on div navigateToClickOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_navigateToClickOn'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 76-Click on div navigateToClickOn.png')

"Step 77: Click on div navigateToClickOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_navigateToClickOn'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 77-Click on div navigateToClickOn.png')

"Step 78: Click on button showDetailFlowPanel7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel7'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 78-Click on button showDetailFlowPanel7.png')

"Step 79: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 79-Click on p login3.png')

"Step 80: Click on p login3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 80-Click on p login3.png')

"Step 81: Click on button showDetailFlowPanel8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanel8'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 81-Click on button showDetailFlowPanel8.png')

"Step 82: Click on button chevronLeft"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_chevronLeft'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 82-Click on button chevronLeft.png')

"Step 83: Click on button chevronLeft"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_chevronLeft'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 83-Click on button chevronLeft.png')

"Step 84: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object5'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 84-Click on button object5.png')

"Step 85: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 85-Click on button object6.png')

"Step 86: Click on p login2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 86-Click on p login2.png')

"Step 87: Click on p login2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 87-Click on p login2.png')

"Step 88: Click on p login2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 88-Click on p login2.png')

"Step 89: Click on p login2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/p_login2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 89-Click on p login2 - Navigate to page .png')

"Step 90: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC89-Navigate and Verify User Journeys in TrueTest_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}