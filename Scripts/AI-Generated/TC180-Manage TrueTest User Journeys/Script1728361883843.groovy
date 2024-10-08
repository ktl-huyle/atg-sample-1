import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 4: Click on link SignOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 4-Click on link SignOut.png')

"Step 5: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 5-Click on span Settings.png')

"Step 6: Click on link TrueTestBeta -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBeta'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 6-Click on link TrueTestBeta - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on div gridCell (GridCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_gridCell"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_gridCell', ['div_gridCell_internalRoleGridcellName': div_gridCell_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 7-Click on div gridCell GridCell.png')

"Step 8: Click on button TrueTestActivePause"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_TrueTestActivePause'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 8-Click on button TrueTestActivePause.png')

"Step 9: Click on span Edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/span_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 9-Click on span Edit.png')

"Step 10: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 10-Click on button Cancel.png')

"Step 11: Click on button Gayatri"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_Gayatri'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 11-Click on button Gayatri.png')

"Step 12: Click on link SignOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 12-Click on link SignOut - Navigate to page organizationhome.png')

"Step 13: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 13-Click on button Settings.png')

"Step 14: Click on link TrueTestBetaConfigure -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 14-Click on link TrueTestBetaConfigure - Navigate to page organizationsettingstruetest.png')

"Step 15: Click on link firstProjectAI (FirstProjectAI) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_firstProjectAI"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_firstProjectAI', ['link_firstProjectAI_internalRoleLinkName': link_firstProjectAI_internalRoleLinkName, 'link_firstProjectAI_project_id': link_firstProjectAI_project_id, 'link_firstProjectAI_team_id': link_firstProjectAI_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 15-Click on link firstProjectAI FirstProjectAI - Navigate to page teamproject.png')

"Step 16: Click on link TrueTestMenu -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestMenu'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 16-Click on link TrueTestMenu - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 17: Click on button viewDetails (ViewDetails) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 17-Click on button viewDetails ViewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 18: Click on div dynamicObject (VerifyLoginWithMailOTP)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_dynamicObject', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild, 'div_dynamicObject_internalHasText': div_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 18-Click on div dynamicObject VerifyLoginWithMailOTP.png')

"Step 19: Click on button dynamicObject (MuiButtonBase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 19-Click on button dynamicObject MuiButtonBase.png')

"Step 20: Click on button dynamicObject (MuiButtonBase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_1, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 20-Click on button dynamicObject MuiButtonBase2.png')

"Step 21: Click on button dynamicObject (ShowDetailFlowPanel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 21-Click on button dynamicObject ShowDetailFlowPanel.png')

"Step 22: Click on button dynamicObject (ShowDetailFlowPanel2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_1, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 22-Click on button dynamicObject ShowDetailFlowPanel2.png')

"Step 23: Click on button dynamicObject (ShowDetailFlowPanel3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_2, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 23-Click on button dynamicObject ShowDetailFlowPanel3.png')

"Step 24: Click on button dynamicObject (MuiButtonBase3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_2, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 24-Click on button dynamicObject MuiButtonBase3.png')

"Step 25: Click on button dynamicObject (MuiButtonBase4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_3, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 25-Click on button dynamicObject MuiButtonBase4.png')

"Step 26: Click on button dynamicObject (MuiButtonBase5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_4, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 26-Click on button dynamicObject MuiButtonBase5.png')

"Step 27: Click on button dynamicObject (MuiButtonBase6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_5, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 27-Click on button dynamicObject MuiButtonBase6.png')

"Step 28: Click on button dynamicObject (MuiButtonBase7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_6, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 28-Click on button dynamicObject MuiButtonBase7.png')

"Step 29: Click on button dynamicObject (MuiButtonBase8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_7, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 29-Click on button dynamicObject MuiButtonBase8.png')

"Step 30: Click on div dynamicObject (VerifyNPCCReviewAccess)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_dynamicObject', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild_1, 'div_dynamicObject_internalHasText': div_dynamicObject_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 30-Click on div dynamicObject VerifyNPCCReviewAccess.png')

"Step 31: Click on button dynamicObject (MuiButtonBase9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_8, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_10]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 31-Click on button dynamicObject MuiButtonBase9.png')

"Step 32: Click on button dynamicObject (ShowDetailFlowPanel4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_3, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_11]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 32-Click on button dynamicObject ShowDetailFlowPanel4.png')

"Step 33: Click on button dynamicObject (ShowDetailFlowPanel5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_4, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_12]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 33-Click on button dynamicObject ShowDetailFlowPanel5.png')

"Step 34: Click on button dynamicObject (MuiButtonBase10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_9, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_13]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 34-Click on button dynamicObject MuiButtonBase10.png')

"Step 35: Click on button dynamicObject (MuiButtonBase11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_10, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_14]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 35-Click on button dynamicObject MuiButtonBase11.png')

"Step 36: Click on p dynamicObject (SearchPartsUsingQuick)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject', ['p_dynamicObject_class': p_dynamicObject_class, 'p_dynamicObject_internalText': p_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 36-Click on p dynamicObject SearchPartsUsingQuick.png')

"Step 37: Click on p dynamicObject (SubmitDecisionForNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject', ['p_dynamicObject_class': p_dynamicObject_class_1, 'p_dynamicObject_internalText': p_dynamicObject_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 37-Click on p dynamicObject SubmitDecisionForNPCC.png')

"Step 38: Click on p dynamicObject (AddEnquiryForNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject', ['p_dynamicObject_class': p_dynamicObject_class_2, 'p_dynamicObject_internalText': p_dynamicObject_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 38-Click on p dynamicObject AddEnquiryForNPCC.png')

"Step 39: Click on p dynamicObject (VerifyHeaderObjectAndLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject', ['p_dynamicObject_class': p_dynamicObject_class_3, 'p_dynamicObject_internalText': p_dynamicObject_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 39-Click on p dynamicObject VerifyHeaderObjectAndLogin.png')

"Step 40: Click on p dynamicObject (VerifyHeaderObjectAndLoginAgain)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject', ['p_dynamicObject_class': p_dynamicObject_class_4, 'p_dynamicObject_internalText': p_dynamicObject_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 40-Click on p dynamicObject VerifyHeaderObjectAndLoginAgain.png')

"Step 41: Click on button navigationActions (GoToNextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 41-Click on button navigationActions GoToNextPage.png')

"Step 42: Click on div dynamicObject (OpenServiceSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_dynamicObject', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild_2, 'div_dynamicObject_internalHasText': div_dynamicObject_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 42-Click on div dynamicObject OpenServiceSearch.png')

"Step 43: Click on button navigationActions (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 43-Click on button navigationActions ExpandGraph.png')

"Step 44: Click on body TrueTestUserJourneys"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_TrueTestUserJourneys'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 44-Click on body TrueTestUserJourneys.png')

"Step 45: Click on item FlowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/item_FlowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 45-Click on item FlowsWithoutTestCases.png')

"Step 46: Click on body TrueTestUserJourneys"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_TrueTestUserJourneys'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 46-Click on body TrueTestUserJourneys.png')

"Step 47: Click on button Shamika"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_Shamika'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 47-Click on button Shamika.png')

"Step 48: Click on link SignOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 48-Click on link SignOut - Navigate to page organizationhome.png')

"Step 49: Click on button organizationSelection (KatalonAI)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationSelection', ['button_organizationSelection_internalRoleButtonName': button_organizationSelection_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 49-Click on button organizationSelection KatalonAI.png')

"Step 50: Click on link organizationLinks (EcoOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_class': link_organizationLinks_class, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName, 'link_organizationLinks_organization_id': link_organizationLinks_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 50-Click on link organizationLinks EcoOrganization.png')

"Step 51: Click on link projectLinks (ES EcoShop) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'link_projectLinks_project_id': link_projectLinks_project_id, 'link_projectLinks_team_id': link_projectLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 51-Click on link projectLinks ES EcoShop - Navigate to page teamproject.png')

"Step 52: Click on link TrueTestMenu2 -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestMenu2'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 52-Click on link TrueTestMenu2 - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 53: Click on button viewDetails (ViewDetails2) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 53-Click on button viewDetails ViewDetails2 - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 54: Click on button dynamicObject (MuiButtonBase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_11]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 54-Click on button dynamicObject MuiButtonBase.png')

"Step 55: Click on div TestSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_TestSteps'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 55-Click on div TestSteps.png')

"Step 56: Click on button dynamicObject (MuiButtonBase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_12, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_15]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 56-Click on button dynamicObject MuiButtonBase2.png')

"Step 57: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class, 'p_loginSteps_internalText': p_loginSteps_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 57-Click on p loginSteps LoginStep.png')

"Step 58: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_1, 'p_loginSteps_internalText': p_loginSteps_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 58-Click on p loginSteps LoginStep.png')

"Step 59: Click on button dynamicObject (ShowDetailFlowPanel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_5, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_16]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 59-Click on button dynamicObject ShowDetailFlowPanel.png')

"Step 60: Click on div NavigateToClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigateToClick'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 60-Click on div NavigateToClick.png')

"Step 61: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_2, 'p_loginSteps_internalText': p_loginSteps_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 61-Click on p loginSteps LoginStep.png')

"Step 62: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_3, 'p_loginSteps_internalText': p_loginSteps_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 62-Click on p loginSteps LoginStep.png')

"Step 63: Click on button dynamicObject (MuiButtonBase12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_13, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_17]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 63-Click on button dynamicObject MuiButtonBase12.png')

"Step 64: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_4, 'p_loginSteps_internalText': p_loginSteps_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 64-Click on p loginSteps LoginStep.png')

"Step 65: Click on button dynamicObject (ShowDetailFlowPanel3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_6, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_18]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 65-Click on button dynamicObject ShowDetailFlowPanel3.png')

"Step 66: Click on button dynamicObject (MuiButtonBase13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_14, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_19]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 66-Click on button dynamicObject MuiButtonBase13.png')

"Step 67: Click on p loginSteps (LoginStep2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_5, 'p_loginSteps_internalText': p_loginSteps_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 67-Click on p loginSteps LoginStep2.png')

"Step 68: Click on p loginSteps (LoginStep2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_6, 'p_loginSteps_internalText': p_loginSteps_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 68-Click on p loginSteps LoginStep2.png')

"Step 69: Click on button dynamicObject (ShowDetailFlowPanel6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_7, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_20]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 69-Click on button dynamicObject ShowDetailFlowPanel6.png')

"Step 70: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_7, 'p_loginSteps_internalText': p_loginSteps_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 70-Click on p loginSteps LoginStep.png')

"Step 71: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_8, 'p_loginSteps_internalText': p_loginSteps_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 71-Click on p loginSteps LoginStep.png')

"Step 72: Click on button dynamicObject (MuiButtonBase14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_15, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_21]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 72-Click on button dynamicObject MuiButtonBase14.png')

"Step 73: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_9, 'p_loginSteps_internalText': p_loginSteps_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 73-Click on p loginSteps LoginStep.png')

"Step 74: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_10, 'p_loginSteps_internalText': p_loginSteps_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 74-Click on p loginSteps LoginStep.png')

"Step 75: Click on button dynamicObject (MuiButtonBase15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_16, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_22]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 75-Click on button dynamicObject MuiButtonBase15.png')

"Step 76: Click on div NavigateToClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigateToClick'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 76-Click on div NavigateToClick.png')

"Step 77: Click on div NavigateToClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigateToClick'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 77-Click on div NavigateToClick.png')

"Step 78: Click on button dynamicObject (ShowDetailFlowPanel7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_8, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_23]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 78-Click on button dynamicObject ShowDetailFlowPanel7.png')

"Step 79: Click on p loginSteps (LoginNavigateToPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_11, 'p_loginSteps_internalText': p_loginSteps_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 79-Click on p loginSteps LoginNavigateToPage.png')

"Step 80: Click on p loginSteps (LoginNavigateToPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_12, 'p_loginSteps_internalText': p_loginSteps_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 80-Click on p loginSteps LoginNavigateToPage.png')

"Step 81: Click on button dynamicObject (ShowDetailFlowPanel8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_9, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_24]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 81-Click on button dynamicObject ShowDetailFlowPanel8.png')

"Step 82: Click on button dynamicObject (MuiButtonBase16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_17, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_25]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 82-Click on button dynamicObject MuiButtonBase16.png')

"Step 83: Click on button dynamicObject (MuiButtonBase17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_18, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_26]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 83-Click on button dynamicObject MuiButtonBase17.png')

"Step 84: Click on button dynamicObject (MuiButtonBase5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_19, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_27]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 84-Click on button dynamicObject MuiButtonBase5.png')

"Step 85: Click on button dynamicObject (MuiButtonBase6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject', ['button_dynamicObject_class': button_dynamicObject_class_20, 'button_dynamicObject_divNthChild': button_dynamicObject_divNthChild_28]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 85-Click on button dynamicObject MuiButtonBase6.png')

"Step 86: Click on p loginSteps (LoginStep3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_13, 'p_loginSteps_internalText': p_loginSteps_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 86-Click on p loginSteps LoginStep3.png')

"Step 87: Click on p loginSteps (LoginStep3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_14, 'p_loginSteps_internalText': p_loginSteps_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 87-Click on p loginSteps LoginStep3.png')

"Step 88: Click on p loginSteps (LoginStep3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_15, 'p_loginSteps_internalText': p_loginSteps_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 88-Click on p loginSteps LoginStep3.png')

"Step 89: Click on p loginSteps (LoginStep3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_16, 'p_loginSteps_internalText': p_loginSteps_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 89-Click on p loginSteps LoginStep3 - Navigate to page .png')

"Step 90: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC180-Manage TrueTest User Journeys_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}