import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/*/home")

"Step 4: Click on link signOut (SignOut)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_signOut"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_signOut', ['link_signOut_internalRoleLinkName': link_signOut_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 4-Click on link signOut SignOut.png')

"Step 5: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 5-Click on span Settings.png')

"Step 6: Click on link TrueTestBetaConfigure2 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 6-Click on link TrueTestBetaConfigure2 - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on div projectDetails (VopakTrueTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_projectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_projectDetails', ['div_projectDetails_internalRoleGridcellName': div_projectDetails_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 7-Click on div projectDetails VopakTrueTest.png')

"Step 8: Click on button vopakActions (VopakTrueTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/button_vopakActions'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 8-Click on button vopakActions VopakTrueTest.png')

"Step 9: Click on span Edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/span_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 9-Click on span Edit.png')

"Step 10: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 10-Click on button Cancel.png')

"Step 11: Click on button Gayatri"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_Gayatri'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 11-Click on button Gayatri.png')

"Step 12: Click on link SignOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 12-Click on link SignOut - Navigate to page organizationhome.png')

"Step 13: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 13-Click on button Settings.png')

"Step 14: Click on link TrueTestBetaConfigure3 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure3'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 14-Click on link TrueTestBetaConfigure3 - Navigate to page organizationsettingstruetest.png')

"Step 15: Click on link projectLinks (FirstProjectAI) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 15-Click on link projectLinks FirstProjectAI - Navigate to page teamproject.png')

"Step 16: Click on link TrueTest3 -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest3'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 16-Click on link TrueTest3 - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 17: Click on button viewDetails (ViewDetails2) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 17-Click on button viewDetails ViewDetails2 - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 18: Click on div userJourneyDetails (VerifyLoginWithMailOTP)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyDetails', ['div_userJourneyDetails_nthChild': div_userJourneyDetails_nthChild, 'div_userJourneyDetails_internalHasText': div_userJourneyDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 18-Click on div userJourneyDetails VerifyLoginWithMailOTP.png')

"Step 19: Click on button detailFlowPanel (MuiButtonBase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 19-Click on button detailFlowPanel MuiButtonBase.png')

"Step 20: Click on button detailFlowPanel (MuiButtonBase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class_1, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 20-Click on button detailFlowPanel MuiButtonBase2.png')

"Step 21: Click on button detailFlowPanel (ShowDetailFlowPanel3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel_1', ['button_detailFlowPanel_nthChild': button_detailFlowPanel_nthChild, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 21-Click on button detailFlowPanel ShowDetailFlowPanel3.png')

"Step 22: Click on button detailFlowPanel (ShowDetailFlowPanel4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel_1', ['button_detailFlowPanel_nthChild': button_detailFlowPanel_nthChild_1, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 22-Click on button detailFlowPanel ShowDetailFlowPanel4.png')

"Step 23: Click on button detailFlowPanel (ShowDetailFlowPanel5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel_1', ['button_detailFlowPanel_nthChild': button_detailFlowPanel_nthChild_2, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 23-Click on button detailFlowPanel ShowDetailFlowPanel5.png')

"Step 24: Click on button detailFlowPanel (MuiButtonBase3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class_2, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 24-Click on button detailFlowPanel MuiButtonBase3.png')

"Step 25: Click on button detailFlowPanel (MuiButtonBase4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class_3, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 25-Click on button detailFlowPanel MuiButtonBase4.png')

"Step 26: Click on button detailFlowPanel (MuiButtonBase5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class_4, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 26-Click on button detailFlowPanel MuiButtonBase5.png')

"Step 27: Click on button detailFlowPanel (MuiButtonBase6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class_5, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 27-Click on button detailFlowPanel MuiButtonBase6.png')

"Step 28: Click on button detailFlowPanel (MuiButtonBase7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class_6, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 28-Click on button detailFlowPanel MuiButtonBase7.png')

"Step 29: Click on button detailFlowPanel (MuiButtonBase8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class_7, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_10]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 29-Click on button detailFlowPanel MuiButtonBase8.png')

"Step 30: Click on div userJourneyDetails (VerifyNPCCReviewAccess)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyDetails', ['div_userJourneyDetails_nthChild': div_userJourneyDetails_nthChild_1, 'div_userJourneyDetails_internalHasText': div_userJourneyDetails_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 30-Click on div userJourneyDetails VerifyNPCCReviewAccess.png')

"Step 31: Click on button detailFlowPanel (MuiButtonBase9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class_8, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_11]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 31-Click on button detailFlowPanel MuiButtonBase9.png')

"Step 32: Click on button detailFlowPanel (ShowDetailFlowPanel6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel_1', ['button_detailFlowPanel_nthChild': button_detailFlowPanel_nthChild_3, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_12]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 32-Click on button detailFlowPanel ShowDetailFlowPanel6.png')

"Step 33: Click on button detailFlowPanel (ShowDetailFlowPanel7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel_1', ['button_detailFlowPanel_nthChild': button_detailFlowPanel_nthChild_4, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_13]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 33-Click on button detailFlowPanel ShowDetailFlowPanel7.png')

"Step 34: Click on button detailFlowPanel (MuiButtonBase10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class_9, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_14]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 34-Click on button detailFlowPanel MuiButtonBase10.png')

"Step 35: Click on button detailFlowPanel (MuiButtonBase11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanel', ['button_detailFlowPanel_class': button_detailFlowPanel_class_10, 'button_detailFlowPanel_divNthChild': button_detailFlowPanel_divNthChild_15]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 35-Click on button detailFlowPanel MuiButtonBase11.png')

"Step 36: Click on p userJourneyDetails (SearchPartsUsingQuick)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyDetails', ['p_userJourneyDetails_class': p_userJourneyDetails_class, 'p_userJourneyDetails_internalText': p_userJourneyDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 36-Click on p userJourneyDetails SearchPartsUsingQuick.png')

"Step 37: Click on p userJourneyDetails (SubmitDecisionForNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyDetails', ['p_userJourneyDetails_class': p_userJourneyDetails_class_1, 'p_userJourneyDetails_internalText': p_userJourneyDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 37-Click on p userJourneyDetails SubmitDecisionForNPCC.png')

"Step 38: Click on p userJourneyDetails (AddEnquiryForNPCCOnHome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyDetails', ['p_userJourneyDetails_class': p_userJourneyDetails_class_2, 'p_userJourneyDetails_internalText': p_userJourneyDetails_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 38-Click on p userJourneyDetails AddEnquiryForNPCCOnHome.png')

"Step 39: Click on p userJourneyDetails (VerifyHeaderObjectAndLoginOnHomePage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyDetails', ['p_userJourneyDetails_class': p_userJourneyDetails_class_3, 'p_userJourneyDetails_internalText': p_userJourneyDetails_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 39-Click on p userJourneyDetails VerifyHeaderObjectAndLoginOnHomePage.png')

"Step 40: Click on p userJourneyDetails (VerifyHeaderObjectAndLoginAgainOnHomePage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyDetails', ['p_userJourneyDetails_class': p_userJourneyDetails_class_4, 'p_userJourneyDetails_internalText': p_userJourneyDetails_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 40-Click on p userJourneyDetails VerifyHeaderObjectAndLoginAgainOnHomePage.png')

"Step 41: Click on button navigationActions (GoToNextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 41-Click on button navigationActions GoToNextPage.png')

"Step 42: Click on div userJourneyDetails (OpenServiceSearchFromPresalesPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyDetails', ['div_userJourneyDetails_nthChild': div_userJourneyDetails_nthChild_2, 'div_userJourneyDetails_internalHasText': div_userJourneyDetails_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 42-Click on div userJourneyDetails OpenServiceSearchFromPresalesPage.png')

"Step 43: Click on button navigationActions (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 43-Click on button navigationActions ExpandGraph.png')

"Step 44: Click on body MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 44-Click on body MainContent.png')

"Step 45: Click on item FlowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/item_FlowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 45-Click on item FlowsWithoutTestCases.png')

"Step 46: Click on body MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 46-Click on body MainContent.png')

"Step 47: Click on button Shamika"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_Shamika'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 47-Click on button Shamika.png')

"Step 48: Click on link SignOut -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 48-Click on link SignOut - Navigate to page logout.png')

"Step 49: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC82-Configure User Journey Details and Sign Out_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}