import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

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

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 4-Click on link signOut.png')

"Step 5: Click on span settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_settings'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 5-Click on span settings.png')

"Step 6: Click on link truetestBetaConfigurePropertiesForTrueTest -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_truetestBetaConfigurePropertiesForTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 6-Click on link truetestBetaConfigurePropertiesForTrueTest - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on div httpsLinks (httpsOspredevIrl01Vopak)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_httpsLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_httpsLinks', ['div_httpsLinks_internalRoleGridcellName': div_httpsLinks_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 7-Click on div httpsLinks httpsOspredevIrl01Vopak.png')

"Step 8: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 8-Click on button object.png')

"Step 9: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 9-Click on span object.png')

"Step 10: Click on button applicationUnderTestCancelButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_applicationUnderTestCancelButton'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 10-Click on button applicationUnderTestCancelButton.png')

"Step 11: Click on button g"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_g'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 11-Click on button g.png')

"Step 12: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 12-Click on link signOut - Navigate to page organizationhome.png')

"Step 13: Click on button settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_settings'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 13-Click on button settings.png')

"Step 14: Click on link truetestBetaConfigure -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_truetestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 14-Click on link truetestBetaConfigure - Navigate to page organizationsettingstruetest.png')

"Step 15: Click on link projectLinks (firstProjectAi) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'link_projectLinks_team_id': link_projectLinks_team_id, 'link_projectLinks_project_id': link_projectLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 15-Click on link projectLinks firstProjectAi - Navigate to page teamproject.png')

"Step 16: Click on link truetestUserJourneys -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_truetestUserJourneys'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 16-Click on link truetestUserJourneys - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 17: Click on button viewDetails (viewDetails) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 17-Click on button viewDetails viewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 18: Click on div userJourneyActions (verifyLoginWithMailOtponHomePageNth0)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 18-Click on div userJourneyActions verifyLoginWithMailOtponHomePageNth0.png')

"Step 19: Click on button userJourneyActions (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 19-Click on button userJourneyActions object.png')

"Step 20: Click on button userJourneyActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_1, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 20-Click on button userJourneyActions object2.png')

"Step 21: Click on button userJourneyPanels (showDetailFlowPanel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels', ['button_userJourneyPanels_nthChild': button_userJourneyPanels_nthChild, 'button_userJourneyPanels_divNthChild': button_userJourneyPanels_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 21-Click on button userJourneyPanels showDetailFlowPanel.png')

"Step 22: Click on button userJourneyPanels (showDetailFlowPanel2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels', ['button_userJourneyPanels_nthChild': button_userJourneyPanels_nthChild_1, 'button_userJourneyPanels_divNthChild': button_userJourneyPanels_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 22-Click on button userJourneyPanels showDetailFlowPanel2.png')

"Step 23: Click on button userJourneyPanels (showDetailFlowPanel3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels', ['button_userJourneyPanels_nthChild': button_userJourneyPanels_nthChild_2, 'button_userJourneyPanels_divNthChild': button_userJourneyPanels_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 23-Click on button userJourneyPanels showDetailFlowPanel3.png')

"Step 24: Click on button userJourneyActions (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_2, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 24-Click on button userJourneyActions object3.png')

"Step 25: Click on button userJourneyActions (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_3, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 25-Click on button userJourneyActions object4.png')

"Step 26: Click on button userJourneyActions (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_4, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 26-Click on button userJourneyActions object5.png')

"Step 27: Click on button userJourneyActions (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_5, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 27-Click on button userJourneyActions object6.png')

"Step 28: Click on button userJourneyActions (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_6, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 28-Click on button userJourneyActions object7.png')

"Step 29: Click on button userJourneyActions (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_7, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 29-Click on button userJourneyActions object8.png')

"Step 30: Click on div userJourneyActions (verifyNpccreviewAccessFromPresalesPageNth0)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild_1, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 30-Click on div userJourneyActions verifyNpccreviewAccessFromPresalesPageNth0.png')

"Step 31: Click on button userJourneyActions (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_8, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 31-Click on button userJourneyActions object9.png')

"Step 32: Click on button userJourneyPanels (showDetailFlowPanel4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels', ['button_userJourneyPanels_nthChild': button_userJourneyPanels_nthChild_3, 'button_userJourneyPanels_divNthChild': button_userJourneyPanels_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 32-Click on button userJourneyPanels showDetailFlowPanel4.png')

"Step 33: Click on button userJourneyPanels (showDetailFlowPanel5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels', ['button_userJourneyPanels_nthChild': button_userJourneyPanels_nthChild_4, 'button_userJourneyPanels_divNthChild': button_userJourneyPanels_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 33-Click on button userJourneyPanels showDetailFlowPanel5.png')

"Step 34: Click on button userJourneyActions (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_9, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 34-Click on button userJourneyActions object10.png')

"Step 35: Click on button userJourneyActions (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_10, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 35-Click on button userJourneyActions object11.png')

"Step 36: Click on p userJourneyActions (searchPartsUsingQuick)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 36-Click on p userJourneyActions searchPartsUsingQuick.png')

"Step 37: Click on p userJourneyActions (submitDecisionForNpcc)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_1, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 37-Click on p userJourneyActions submitDecisionForNpcc.png')

"Step 38: Click on p userJourneyActions (addEnquiryForNpcconHome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_2, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 38-Click on p userJourneyActions addEnquiryForNpcconHome.png')

"Step 39: Click on p userJourneyActions (verifyHeaderObjectAndLoginOnHomePage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_3, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 39-Click on p userJourneyActions verifyHeaderObjectAndLoginOnHomePage.png')

"Step 40: Click on p userJourneyActions (verifyHeaderObjectAndLoginAgainOnHomePage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_4, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 40-Click on p userJourneyActions verifyHeaderObjectAndLoginAgainOnHomePage.png')

"Step 41: Click on button navigationActions (goToNextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 41-Click on button navigationActions goToNextPage.png')

"Step 42: Click on div userJourneyActions (openServiceSearchFromPresalesPageNth0)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild_2, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 42-Click on div userJourneyActions openServiceSearchFromPresalesPageNth0.png')

"Step 43: Click on button navigationActions (expandGraphBtn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 43-Click on button navigationActions expandGraphBtn.png')

"Step 44: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 44-Click on body object.png')

"Step 45: Click on item flowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/item_flowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 45-Click on item flowsWithoutTestCases.png')

"Step 46: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 46-Click on body object.png')

"Step 47: Click on button shamika"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_shamika'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 47-Click on button shamika.png')

"Step 48: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 48-Click on link signOut - Navigate to page organizationhome.png')

"Step 49: Click on button organizationManagement (katalonAi)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationManagement', ['button_organizationManagement_internalRoleButtonName': button_organizationManagement_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 49-Click on button organizationManagement katalonAi.png')

"Step 50: Click on link organizationLinks (ecoOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_class': link_organizationLinks_class, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName, 'link_organizationLinks_organization_id': link_organizationLinks_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 50-Click on link organizationLinks ecoOrganization.png')

"Step 51: Click on link noDataProjects (esEcoShopNoData) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects', ['link_noDataProjects_internalRoleLinkName': link_noDataProjects_internalRoleLinkName, 'link_noDataProjects_team_id': link_noDataProjects_team_id, 'link_noDataProjects_project_id': link_noDataProjects_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 51-Click on link noDataProjects esEcoShopNoData - Navigate to page teamproject.png')

"Step 52: Click on link truetest -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 52-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 53: Click on button viewDetails (viewDetails2) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 53-Click on button viewDetails viewDetails2 - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 54: Click on button userJourneyActions (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_11]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 54-Click on button userJourneyActions object.png')

"Step 55: Click on div testStepsNavigateTo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_testStepsNavigateTo'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 55-Click on div testStepsNavigateTo.png')

"Step 56: Click on button userJourneyActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_12, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_10]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 56-Click on button userJourneyActions object2.png')

"Step 57: Click on p loginActions (login3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class, 'p_loginActions_internalText': p_loginActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 57-Click on p loginActions login3.png')

"Step 58: Click on p loginActions (login3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_1, 'p_loginActions_internalText': p_loginActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 58-Click on p loginActions login3.png')

"Step 59: Click on button userJourneyPanels (showDetailFlowPanel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels', ['button_userJourneyPanels_nthChild': button_userJourneyPanels_nthChild_5, 'button_userJourneyPanels_divNthChild': button_userJourneyPanels_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 59-Click on button userJourneyPanels showDetailFlowPanel.png')

"Step 60: Click on div navigateToClickOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_navigateToClickOn'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 60-Click on div navigateToClickOn.png')

"Step 61: Click on p loginActions (login3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_2, 'p_loginActions_internalText': p_loginActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 61-Click on p loginActions login3.png')

"Step 62: Click on p loginActions (login3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_3, 'p_loginActions_internalText': p_loginActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 62-Click on p loginActions login3.png')

"Step 63: Click on button userJourneyActions (chevronRight)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_13, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_11]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 63-Click on button userJourneyActions chevronRight.png')

"Step 64: Click on p loginActions (login3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_4, 'p_loginActions_internalText': p_loginActions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 64-Click on p loginActions login3.png')

"Step 65: Click on button userJourneyPanels (showDetailFlowPanel3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels', ['button_userJourneyPanels_nthChild': button_userJourneyPanels_nthChild_6, 'button_userJourneyPanels_divNthChild': button_userJourneyPanels_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 65-Click on button userJourneyPanels showDetailFlowPanel3.png')

"Step 66: Click on button userJourneyActions (chevronRight2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_14, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_12]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 66-Click on button userJourneyActions chevronRight2.png')

"Step 67: Click on p loginActions (login8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_5, 'p_loginActions_internalText': p_loginActions_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 67-Click on p loginActions login8.png')

"Step 68: Click on p loginActions (login8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_6, 'p_loginActions_internalText': p_loginActions_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 68-Click on p loginActions login8.png')

"Step 69: Click on button userJourneyPanels (showDetailFlowPanel6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels', ['button_userJourneyPanels_nthChild': button_userJourneyPanels_nthChild_7, 'button_userJourneyPanels_divNthChild': button_userJourneyPanels_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 69-Click on button userJourneyPanels showDetailFlowPanel6.png')

"Step 70: Click on p loginActions (login3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_7, 'p_loginActions_internalText': p_loginActions_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 70-Click on p loginActions login3.png')

"Step 71: Click on p loginActions (login3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_8, 'p_loginActions_internalText': p_loginActions_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 71-Click on p loginActions login3.png')

"Step 72: Click on button userJourneyActions (chevronRight3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_15, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_13]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 72-Click on button userJourneyActions chevronRight3.png')

"Step 73: Click on p loginActions (login3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_9, 'p_loginActions_internalText': p_loginActions_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 73-Click on p loginActions login3.png')

"Step 74: Click on p loginActions (login3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_10, 'p_loginActions_internalText': p_loginActions_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 74-Click on p loginActions login3.png')

"Step 75: Click on button userJourneyActions (chevronRight4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_16, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_14]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 75-Click on button userJourneyActions chevronRight4.png')

"Step 76: Click on div navigateToClickOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_navigateToClickOn'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 76-Click on div navigateToClickOn.png')

"Step 77: Click on div navigateToClickOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_navigateToClickOn'))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 77-Click on div navigateToClickOn.png')

"Step 78: Click on button userJourneyPanels (showDetailFlowPanel7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels', ['button_userJourneyPanels_nthChild': button_userJourneyPanels_nthChild_8, 'button_userJourneyPanels_divNthChild': button_userJourneyPanels_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 78-Click on button userJourneyPanels showDetailFlowPanel7.png')

"Step 79: Click on p loginActions (loginNavigateToPageSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_11, 'p_loginActions_internalText': p_loginActions_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 79-Click on p loginActions loginNavigateToPageSearch.png')

"Step 80: Click on p loginActions (loginNavigateToPageSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_12, 'p_loginActions_internalText': p_loginActions_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 80-Click on p loginActions loginNavigateToPageSearch.png')

"Step 81: Click on button userJourneyPanels (showDetailFlowPanel8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyPanels', ['button_userJourneyPanels_nthChild': button_userJourneyPanels_nthChild_9, 'button_userJourneyPanels_divNthChild': button_userJourneyPanels_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 81-Click on button userJourneyPanels showDetailFlowPanel8.png')

"Step 82: Click on button userJourneyActions (chevronLeft)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_17, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_15]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 82-Click on button userJourneyActions chevronLeft.png')

"Step 83: Click on button userJourneyActions (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_18, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_16]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 83-Click on button userJourneyActions object12.png')

"Step 84: Click on button userJourneyActions (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_19, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_17]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 84-Click on button userJourneyActions object5.png')

"Step 85: Click on button userJourneyActions (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_userJourneyActions', ['button_userJourneyActions_class': button_userJourneyActions_class_20, 'button_userJourneyActions_divNthChild': button_userJourneyActions_divNthChild_18]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 85-Click on button userJourneyActions object6.png')

"Step 86: Click on p loginActions (login2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_13, 'p_loginActions_internalText': p_loginActions_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 86-Click on p loginActions login2.png')

"Step 87: Click on p loginActions (login2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_14, 'p_loginActions_internalText': p_loginActions_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 87-Click on p loginActions login2.png')

"Step 88: Click on p loginActions (login2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_15, 'p_loginActions_internalText': p_loginActions_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 88-Click on p loginActions login2.png')

"Step 89: Click on p loginActions (login2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginActions', ['p_loginActions_class': p_loginActions_class_16, 'p_loginActions_internalText': p_loginActions_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC389/Step 89-Click on p loginActions login2 - Navigate to page .png')

"Step 90: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC389-Sign Out and Manage User Journeys_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}