import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts

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

WebUI.takeScreenshot(reportLocation + '/TC437/Step 4-Click on link SignOut.png')

"Step 5: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 5-Click on span SettingsButton.png')

"Step 6: Click on link TrueTestBeta -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBeta'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 6-Click on link TrueTestBeta - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on div gridCells (GridCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_gridCells', ['div_gridCells_internalRoleGridcellName': div_gridCells_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 7-Click on div gridCells GridCell2.png')

"Step 8: Click on button TrueTestActivePause"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_TrueTestActivePause'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 8-Click on button TrueTestActivePause.png')

"Step 9: Click on span Edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/span_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 9-Click on span Edit.png')

"Step 10: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 10-Click on button Cancel.png')

"Step 11: Click on button Gayatri"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_Gayatri'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 11-Click on button Gayatri.png')

"Step 12: Click on link SignOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 12-Click on link SignOut - Navigate to page organizationhome.png')

"Step 13: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 13-Click on button Settings.png')

"Step 14: Click on link TrueTestBetaConfigure2 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure2'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 14-Click on link TrueTestBetaConfigure2 - Navigate to page organizationsettingstruetest.png')

"Step 15: Click on link organizationProjects (FirstProjectAI) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_organizationProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_organizationProjects', ['link_organizationProjects_internalRoleLinkName': link_organizationProjects_internalRoleLinkName, 'link_organizationProjects_team_id': link_organizationProjects_team_id, 'link_organizationProjects_project_id': link_organizationProjects_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 15-Click on link organizationProjects FirstProjectAI - Navigate to page teamproject.png')

"Step 16: Click on link TrueTestMenu -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestMenu'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 16-Click on link TrueTestMenu - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 17: Click on button viewDetails (ViewDetails2) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 17-Click on button viewDetails ViewDetails2 - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 18: Click on div userJourneyVerifications (VerifyLoginWithMailOTP)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyVerifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyVerifications', ['div_userJourneyVerifications_nthChild': div_userJourneyVerifications_nthChild, 'div_userJourneyVerifications_internalHasText': div_userJourneyVerifications_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 18-Click on div userJourneyVerifications VerifyLoginWithMailOTP.png')

"Step 19: Click on button detailFlowPanels (MuiButtonBase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 19-Click on button detailFlowPanels MuiButtonBase.png')

"Step 20: Click on button detailFlowPanels (MuiButtonBase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_1, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 20-Click on button detailFlowPanels MuiButtonBase2.png')

"Step 21: Click on button detailFlowPanels (ShowDetailFlowPanel3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 21-Click on button detailFlowPanels ShowDetailFlowPanel3.png')

"Step 22: Click on button detailFlowPanels (ShowDetailFlowPanel4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_1, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 22-Click on button detailFlowPanels ShowDetailFlowPanel4.png')

"Step 23: Click on button detailFlowPanels (ShowDetailFlowPanel5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_2, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 23-Click on button detailFlowPanels ShowDetailFlowPanel5.png')

"Step 24: Click on button detailFlowPanels (MuiButtonBase3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_2, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 24-Click on button detailFlowPanels MuiButtonBase3.png')

"Step 25: Click on button detailFlowPanels (MuiButtonBase4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_3, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 25-Click on button detailFlowPanels MuiButtonBase4.png')

"Step 26: Click on button detailFlowPanels (MuiButtonBase5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_4, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 26-Click on button detailFlowPanels MuiButtonBase5.png')

"Step 27: Click on button detailFlowPanels (MuiButtonBase6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_5, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 27-Click on button detailFlowPanels MuiButtonBase6.png')

"Step 28: Click on button detailFlowPanels (MuiButtonBase7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_6, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 28-Click on button detailFlowPanels MuiButtonBase7.png')

"Step 29: Click on button detailFlowPanels (MuiButtonBase8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_7, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 29-Click on button detailFlowPanels MuiButtonBase8.png')

"Step 30: Click on div userJourneyVerifications (VerifyNPCCReviewAccess)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyVerifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyVerifications', ['div_userJourneyVerifications_nthChild': div_userJourneyVerifications_nthChild_1, 'div_userJourneyVerifications_internalHasText': div_userJourneyVerifications_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 30-Click on div userJourneyVerifications VerifyNPCCReviewAccess.png')

"Step 31: Click on button detailFlowPanels (MuiButtonBase9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_8, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 31-Click on button detailFlowPanels MuiButtonBase9.png')

"Step 32: Click on button detailFlowPanels (ShowDetailFlowPanel6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 32-Click on button detailFlowPanels ShowDetailFlowPanel6.png')

"Step 33: Click on button detailFlowPanels (ShowDetailFlowPanel7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 33-Click on button detailFlowPanels ShowDetailFlowPanel7.png')

"Step 34: Click on button detailFlowPanels (MuiButtonBase10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_9, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_10]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 34-Click on button detailFlowPanels MuiButtonBase10.png')

"Step 35: Click on button detailFlowPanels (MuiButtonBase11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_10, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_11]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 35-Click on button detailFlowPanels MuiButtonBase11.png')

"Step 36: Click on p userJourneyActions (SearchPartsUsingQuick)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 36-Click on p userJourneyActions SearchPartsUsingQuick.png')

"Step 37: Click on p userJourneyActions (SubmitDecisionForNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_1, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 37-Click on p userJourneyActions SubmitDecisionForNPCC.png')

"Step 38: Click on p userJourneyActions (AddEnquiryForNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_2, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 38-Click on p userJourneyActions AddEnquiryForNPCC.png')

"Step 39: Click on p userJourneyActions (VerifyHeaderObjectAndLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_3, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 39-Click on p userJourneyActions VerifyHeaderObjectAndLogin.png')

"Step 40: Click on p userJourneyActions (VerifyHeaderObjectAndLoginAgain)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_4, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 40-Click on p userJourneyActions VerifyHeaderObjectAndLoginAgain.png')

"Step 41: Click on button navigationButtons (GoToNextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationButtons'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 41-Click on button navigationButtons GoToNextPage.png')

"Step 42: Click on div userJourneyVerifications (OpenServiceSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyVerifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyVerifications', ['div_userJourneyVerifications_nthChild': div_userJourneyVerifications_nthChild_2, 'div_userJourneyVerifications_internalHasText': div_userJourneyVerifications_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 42-Click on div userJourneyVerifications OpenServiceSearch.png')

"Step 43: Click on button navigationButtons (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationButtons'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 43-Click on button navigationButtons ExpandGraph.png')

"Step 44: Click on body TrueTestUserJourneys"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_TrueTestUserJourneys'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 44-Click on body TrueTestUserJourneys.png')

"Step 45: Click on item FlowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/item_FlowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 45-Click on item FlowsWithoutTestCases.png')

"Step 46: Click on body TrueTestUserJourneys"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_TrueTestUserJourneys'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 46-Click on body TrueTestUserJourneys.png')

"Step 47: Click on button Shamika"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_Shamika'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 47-Click on button Shamika.png')

"Step 48: Click on link SignOut -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC437/Step 48-Click on link SignOut - Navigate to page logout.png')

"Step 49: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC437-Configure True Test Settings and Logout in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}