import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link SignOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 4-Click on link SignOut.png')

"Step 5: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 5-Click on span Settings.png')

"Step 6: Click on link TrueTestBetaConfigure2 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure2'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 6-Click on link TrueTestBetaConfigure2 - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on div dynamicObject (VopakTrueTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_dynamicObject', ['div_dynamicObject_internalRoleGridcellName': div_dynamicObject_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 7-Click on div dynamicObject VopakTrueTest.png')

"Step 8: Click on button VopakTrueTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_VopakTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 8-Click on button VopakTrueTest.png')

"Step 9: Click on span Edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/span_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 9-Click on span Edit.png')

"Step 10: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 10-Click on button Cancel.png')

"Step 11: Click on button Gayatri"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_Gayatri'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 11-Click on button Gayatri.png')

"Step 12: Click on link SignOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 12-Click on link SignOut - Navigate to page organizationhome.png')

"Step 13: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 13-Click on button Settings.png')

"Step 14: Click on link TrueTestBetaConfigure3 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure3'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 14-Click on link TrueTestBetaConfigure3 - Navigate to page organizationsettingstruetest.png')

"Step 15: Click on link projectLinks (FirstProjectAI) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'link_projectLinks_project_id': link_projectLinks_project_id, 'link_projectLinks_team_id': link_projectLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 15-Click on link projectLinks FirstProjectAI - Navigate to page teamproject.png')

"Step 16: Click on link TrueTest2 -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest2'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 16-Click on link TrueTest2 - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 17: Click on button viewDetails (ViewDetails2) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 17-Click on button viewDetails ViewDetails2 - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 18: Click on div userJourneyActions (VerifyLoginWithMailOTP)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 18-Click on div userJourneyActions VerifyLoginWithMailOTP.png')

"Step 19: Click on button dynamicActions (MuiButtonBase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 19-Click on button dynamicActions MuiButtonBase.png')

"Step 20: Click on button dynamicActions (MuiButtonBase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_1, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 20-Click on button dynamicActions MuiButtonBase2.png')

"Step 21: Click on button showDetailFlowPanels (ShowDetailFlowPanel3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels', ['button_showDetailFlowPanels_nthChild': button_showDetailFlowPanels_nthChild, 'button_showDetailFlowPanels_divNthChild': button_showDetailFlowPanels_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 21-Click on button showDetailFlowPanels ShowDetailFlowPanel3.png')

"Step 22: Click on button showDetailFlowPanels (ShowDetailFlowPanel4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels', ['button_showDetailFlowPanels_nthChild': button_showDetailFlowPanels_nthChild_1, 'button_showDetailFlowPanels_divNthChild': button_showDetailFlowPanels_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 22-Click on button showDetailFlowPanels ShowDetailFlowPanel4.png')

"Step 23: Click on button showDetailFlowPanels (ShowDetailFlowPanel5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels', ['button_showDetailFlowPanels_nthChild': button_showDetailFlowPanels_nthChild_2, 'button_showDetailFlowPanels_divNthChild': button_showDetailFlowPanels_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 23-Click on button showDetailFlowPanels ShowDetailFlowPanel5.png')

"Step 24: Click on button dynamicActions (MuiButtonBase3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_2, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 24-Click on button dynamicActions MuiButtonBase3.png')

"Step 25: Click on button dynamicActions (MuiButtonBase4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_3, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 25-Click on button dynamicActions MuiButtonBase4.png')

"Step 26: Click on button dynamicActions (MuiButtonBase5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_4, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 26-Click on button dynamicActions MuiButtonBase5.png')

"Step 27: Click on button dynamicActions (MuiButtonBase6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_5, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 27-Click on button dynamicActions MuiButtonBase6.png')

"Step 28: Click on button dynamicActions (MuiButtonBase7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_6, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 28-Click on button dynamicActions MuiButtonBase7.png')

"Step 29: Click on button dynamicActions (MuiButtonBase8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_7, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 29-Click on button dynamicActions MuiButtonBase8.png')

"Step 30: Click on div userJourneyActions (VerifyNPCCReviewAccess)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild_1, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 30-Click on div userJourneyActions VerifyNPCCReviewAccess.png')

"Step 31: Click on button dynamicActions (MuiButtonBase9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_8, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 31-Click on button dynamicActions MuiButtonBase9.png')

"Step 32: Click on button showDetailFlowPanels (ShowDetailFlowPanel6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels', ['button_showDetailFlowPanels_nthChild': button_showDetailFlowPanels_nthChild_3, 'button_showDetailFlowPanels_divNthChild': button_showDetailFlowPanels_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 32-Click on button showDetailFlowPanels ShowDetailFlowPanel6.png')

"Step 33: Click on button showDetailFlowPanels (ShowDetailFlowPanel7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels', ['button_showDetailFlowPanels_nthChild': button_showDetailFlowPanels_nthChild_4, 'button_showDetailFlowPanels_divNthChild': button_showDetailFlowPanels_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 33-Click on button showDetailFlowPanels ShowDetailFlowPanel7.png')

"Step 34: Click on button dynamicActions (MuiButtonBase10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_9, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 34-Click on button dynamicActions MuiButtonBase10.png')

"Step 35: Click on button dynamicActions (MuiButtonBase11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_10, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 35-Click on button dynamicActions MuiButtonBase11.png')

"Step 36: Click on p userJourneySteps (SearchPartsUsingQuick)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps', ['p_userJourneySteps_class': p_userJourneySteps_class, 'p_userJourneySteps_internalText': p_userJourneySteps_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 36-Click on p userJourneySteps SearchPartsUsingQuick.png')

"Step 37: Click on p userJourneySteps (SubmitDecisionForNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps', ['p_userJourneySteps_class': p_userJourneySteps_class_1, 'p_userJourneySteps_internalText': p_userJourneySteps_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 37-Click on p userJourneySteps SubmitDecisionForNPCC.png')

"Step 38: Click on p userJourneySteps (AddEnquiryForNPCCOnHome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps', ['p_userJourneySteps_class': p_userJourneySteps_class_2, 'p_userJourneySteps_internalText': p_userJourneySteps_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 38-Click on p userJourneySteps AddEnquiryForNPCCOnHome.png')

"Step 39: Click on p userJourneySteps (VerifyHeaderObjectAndLoginOnHomePage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps', ['p_userJourneySteps_class': p_userJourneySteps_class_3, 'p_userJourneySteps_internalText': p_userJourneySteps_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 39-Click on p userJourneySteps VerifyHeaderObjectAndLoginOnHomePage.png')

"Step 40: Click on p userJourneySteps (VerifyHeaderObjectAndLoginAgainOnHomePage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneySteps', ['p_userJourneySteps_class': p_userJourneySteps_class_4, 'p_userJourneySteps_internalText': p_userJourneySteps_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 40-Click on p userJourneySteps VerifyHeaderObjectAndLoginAgainOnHomePage.png')

"Step 41: Click on button navigationActions (GoToNextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 41-Click on button navigationActions GoToNextPage.png')

"Step 42: Click on div userJourneyActions (OpenServiceSearchFromPresalesPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild_2, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 42-Click on div userJourneyActions OpenServiceSearchFromPresalesPage.png')

"Step 43: Click on button navigationActions (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 43-Click on button navigationActions ExpandGraph.png')

"Step 44: Click on body MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 44-Click on body MainContent.png')

"Step 45: Click on item FlowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/item_FlowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 45-Click on item FlowsWithoutTestCases.png')

"Step 46: Click on body MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 46-Click on body MainContent.png')

"Step 47: Click on button Shamika"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_Shamika'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 47-Click on button Shamika.png')

"Step 48: Click on link SignOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 48-Click on link SignOut - Navigate to page organizationhome.png')

"Step 49: Click on button organizationAdminActions (KatalonAI)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdminActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdminActions', ['button_organizationAdminActions_internalRoleButtonName': button_organizationAdminActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 49-Click on button organizationAdminActions KatalonAI.png')

"Step 50: Click on link organizationLinks (EcoOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_class': link_organizationLinks_class, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName, 'link_organizationLinks_organization_id': link_organizationLinks_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 50-Click on link organizationLinks EcoOrganization.png')

"Step 51: Click on link projectLinks (ESEcoShopNoData) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName_1, 'link_projectLinks_project_id': link_projectLinks_project_id_1, 'link_projectLinks_team_id': link_projectLinks_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 51-Click on link projectLinks ESEcoShopNoData - Navigate to page teamproject.png')

"Step 52: Click on link TrueTest3 -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest3'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 52-Click on link TrueTest3 - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 53: Click on button viewDetails (ViewDetails3) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 53-Click on button viewDetails ViewDetails3 - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 54: Click on button dynamicActions (MuiButtonBase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_11]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 54-Click on button dynamicActions MuiButtonBase.png')

"Step 55: Click on div TestSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_TestSteps'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 55-Click on div TestSteps.png')

"Step 56: Click on button dynamicActions (MuiButtonBase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_12, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_10]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 56-Click on button dynamicActions MuiButtonBase2.png')

"Step 57: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class, 'p_loginSteps_internalText': p_loginSteps_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 57-Click on p loginSteps LoginStepThree.png')

"Step 58: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_1, 'p_loginSteps_internalText': p_loginSteps_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 58-Click on p loginSteps LoginStepThree.png')

"Step 59: Click on button showDetailFlowPanels (ShowDetailFlowPanel3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels', ['button_showDetailFlowPanels_nthChild': button_showDetailFlowPanels_nthChild_5, 'button_showDetailFlowPanels_divNthChild': button_showDetailFlowPanels_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 59-Click on button showDetailFlowPanels ShowDetailFlowPanel3.png')

"Step 60: Click on div NavigationAndClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigationAndClick'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 60-Click on div NavigationAndClick.png')

"Step 61: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_2, 'p_loginSteps_internalText': p_loginSteps_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 61-Click on p loginSteps LoginStepThree.png')

"Step 62: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_3, 'p_loginSteps_internalText': p_loginSteps_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 62-Click on p loginSteps LoginStepThree.png')

"Step 63: Click on button dynamicActions (UnknownAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_13, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_11]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 63-Click on button dynamicActions UnknownAction.png')

"Step 64: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_4, 'p_loginSteps_internalText': p_loginSteps_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 64-Click on p loginSteps LoginStepThree.png')

"Step 65: Click on button showDetailFlowPanels (ShowDetailFlowPanel5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels', ['button_showDetailFlowPanels_nthChild': button_showDetailFlowPanels_nthChild_6, 'button_showDetailFlowPanels_divNthChild': button_showDetailFlowPanels_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 65-Click on button showDetailFlowPanels ShowDetailFlowPanel5.png')

"Step 66: Click on button dynamicActions (UnknownAction2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_14, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_12]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 66-Click on button dynamicActions UnknownAction2.png')

"Step 67: Click on p loginSteps (LoginStepEight)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_5, 'p_loginSteps_internalText': p_loginSteps_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 67-Click on p loginSteps LoginStepEight.png')

"Step 68: Click on p loginSteps (LoginStepEight)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_6, 'p_loginSteps_internalText': p_loginSteps_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 68-Click on p loginSteps LoginStepEight.png')

"Step 69: Click on button showDetailFlowPanels (ShowDetailFlowPanel8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels', ['button_showDetailFlowPanels_nthChild': button_showDetailFlowPanels_nthChild_7, 'button_showDetailFlowPanels_divNthChild': button_showDetailFlowPanels_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 69-Click on button showDetailFlowPanels ShowDetailFlowPanel8.png')

"Step 70: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_7, 'p_loginSteps_internalText': p_loginSteps_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 70-Click on p loginSteps LoginStepThree.png')

"Step 71: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_8, 'p_loginSteps_internalText': p_loginSteps_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 71-Click on p loginSteps LoginStepThree.png')

"Step 72: Click on button dynamicActions (UnknownAction3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_15, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_13]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 72-Click on button dynamicActions UnknownAction3.png')

"Step 73: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_9, 'p_loginSteps_internalText': p_loginSteps_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 73-Click on p loginSteps LoginStepThree.png')

"Step 74: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_10, 'p_loginSteps_internalText': p_loginSteps_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 74-Click on p loginSteps LoginStepThree.png')

"Step 75: Click on button dynamicActions (UnknownAction4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_16, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_14]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 75-Click on button dynamicActions UnknownAction4.png')

"Step 76: Click on div NavigationAndClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigationAndClick'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 76-Click on div NavigationAndClick.png')

"Step 77: Click on div NavigationAndClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigationAndClick'))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 77-Click on div NavigationAndClick.png')

"Step 78: Click on button showDetailFlowPanels (ShowDetailFlowPanel9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels', ['button_showDetailFlowPanels_nthChild': button_showDetailFlowPanels_nthChild_8, 'button_showDetailFlowPanels_divNthChild': button_showDetailFlowPanels_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 78-Click on button showDetailFlowPanels ShowDetailFlowPanel9.png')

"Step 79: Click on p loginSteps (LoginNavigateToSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_11, 'p_loginSteps_internalText': p_loginSteps_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 79-Click on p loginSteps LoginNavigateToSearch.png')

"Step 80: Click on p loginSteps (LoginNavigateToSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_12, 'p_loginSteps_internalText': p_loginSteps_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 80-Click on p loginSteps LoginNavigateToSearch.png')

"Step 81: Click on button showDetailFlowPanels (ShowDetailFlowPanel10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlowPanels', ['button_showDetailFlowPanels_nthChild': button_showDetailFlowPanels_nthChild_9, 'button_showDetailFlowPanels_divNthChild': button_showDetailFlowPanels_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 81-Click on button showDetailFlowPanels ShowDetailFlowPanel10.png')

"Step 82: Click on button dynamicActions (UnknownAction5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_17, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_15]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 82-Click on button dynamicActions UnknownAction5.png')

"Step 83: Click on button dynamicActions (UnknownAction6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_18, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_16]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 83-Click on button dynamicActions UnknownAction6.png')

"Step 84: Click on button dynamicActions (MuiButtonBase5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_19, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_17]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 84-Click on button dynamicActions MuiButtonBase5.png')

"Step 85: Click on button dynamicActions (MuiButtonBase6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicActions', ['button_dynamicActions_class': button_dynamicActions_class_20, 'button_dynamicActions_divNthChild': button_dynamicActions_divNthChild_18]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 85-Click on button dynamicActions MuiButtonBase6.png')

"Step 86: Click on p loginSteps (LoginStepTwo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_13, 'p_loginSteps_internalText': p_loginSteps_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 86-Click on p loginSteps LoginStepTwo.png')

"Step 87: Click on p loginSteps (LoginStepTwo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_14, 'p_loginSteps_internalText': p_loginSteps_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 87-Click on p loginSteps LoginStepTwo.png')

"Step 88: Click on p loginSteps (LoginStepTwo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_15, 'p_loginSteps_internalText': p_loginSteps_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 88-Click on p loginSteps LoginStepTwo.png')

"Step 89: Click on p loginSteps (LoginStepTwo) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_16, 'p_loginSteps_internalText': p_loginSteps_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC235/Step 89-Click on p loginSteps LoginStepTwo - Navigate to page .png')

"Step 90: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC235-Configure and Manage TrueTest User Journeys_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}