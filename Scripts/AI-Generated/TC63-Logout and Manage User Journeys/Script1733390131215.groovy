import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 4: Click on link signOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 4-Click on link signOut.png')

"Step 5: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 5-Click on span Settings.png')

"Step 6: Click on link truetestBetaConfigure -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_truetestBetaConfigure_1'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 6-Click on link truetestBetaConfigure - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on div gridCellLinks (vopakURL)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_gridCellLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_gridCellLinks', ['div_gridCellLinks_internalRoleGridcellName': div_gridCellLinks_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 7-Click on div gridCellLinks vopakURL.png')

"Step 8: Click on button vopakTrueTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_vopakTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 8-Click on button vopakTrueTest.png')

"Step 9: Click on span edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/span_edit'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 9-Click on span edit.png')

"Step 10: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 10-Click on button cancel.png')

"Step 11: Click on button G"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_G'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 11-Click on button G.png')

"Step 12: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 12-Click on link signOut - Navigate to page organizationhome.png')

"Step 13: Click on button settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_settings'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 13-Click on button settings.png')

"Step 14: Click on link truetestBetaConfigure2 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_truetestBetaConfigure2'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 14-Click on link truetestBetaConfigure2 - Navigate to page organizationsettingstruetest.png')

"Step 15: Click on link firstProjectAI (firstProjectAI) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_firstProjectAI"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_firstProjectAI', ['link_firstProjectAI_internalRoleLinkName': link_firstProjectAI_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 15-Click on link firstProjectAI firstProjectAI - Navigate to page teamproject.png')

"Step 16: Click on link truetest -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 16-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 17: Click on button viewDetails (viewDetails) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 17-Click on button viewDetails viewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 18: Click on div userJourneyActions (verifyLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 18-Click on div userJourneyActions verifyLogin.png')

"Step 19: Click on button detailFlowPanels (treeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 19-Click on button detailFlowPanels treeSwitcher.png')

"Step 20: Click on button detailFlowPanels (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_1, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 20-Click on button detailFlowPanels object.png')

"Step 21: Click on button detailFlowPanels (ShowDetailFlowPanel4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 21-Click on button detailFlowPanels ShowDetailFlowPanel4.png')

"Step 22: Click on button detailFlowPanels (ShowDetailFlowPanel5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_1, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 22-Click on button detailFlowPanels ShowDetailFlowPanel5.png')

"Step 23: Click on button detailFlowPanels (ShowDetailFlowPanel6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_2, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 23-Click on button detailFlowPanels ShowDetailFlowPanel6.png')

"Step 24: Click on button detailFlowPanels (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_2, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 24-Click on button detailFlowPanels object2.png')

"Step 25: Click on button detailFlowPanels (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_3, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 25-Click on button detailFlowPanels object3.png')

"Step 26: Click on button detailFlowPanels (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_4, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 26-Click on button detailFlowPanels object4.png')

"Step 27: Click on button detailFlowPanels (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_5, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 27-Click on button detailFlowPanels object5.png')

"Step 28: Click on button detailFlowPanels (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_6, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 28-Click on button detailFlowPanels object6.png')

"Step 29: Click on button detailFlowPanels (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_7, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 29-Click on button detailFlowPanels object7.png')

"Step 30: Click on div userJourneyActions (VerifyNPCCReviewAccess)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild_1, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 30-Click on div userJourneyActions VerifyNPCCReviewAccess.png')

"Step 31: Click on button detailFlowPanels (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_8, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 31-Click on button detailFlowPanels object8.png')

"Step 32: Click on button detailFlowPanels (ShowDetailFlowPanel7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 32-Click on button detailFlowPanels ShowDetailFlowPanel7.png')

"Step 33: Click on button detailFlowPanels (ShowDetailFlowPanel8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_1', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 33-Click on button detailFlowPanels ShowDetailFlowPanel8.png')

"Step 34: Click on button detailFlowPanels (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_9, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_10]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 34-Click on button detailFlowPanels object9.png')

"Step 35: Click on button detailFlowPanels (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels', ['button_detailFlowPanels_class': button_detailFlowPanels_class_10, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_11]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 35-Click on button detailFlowPanels object10.png')

"Step 36: Click on p userJourneyActions (SearchPartsUsingQuick)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 36-Click on p userJourneyActions SearchPartsUsingQuick.png')

"Step 37: Click on p userJourneyActions (SubmitDecisionForNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_1, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 37-Click on p userJourneyActions SubmitDecisionForNPCC.png')

"Step 38: Click on p userJourneyActions (AddEnquiryForNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_2, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 38-Click on p userJourneyActions AddEnquiryForNPCC.png')

"Step 39: Click on p userJourneyActions (VerifyHeaderObjectAndLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_3, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 39-Click on p userJourneyActions VerifyHeaderObjectAndLogin.png')

"Step 40: Click on p userJourneyActions (VerifyHeaderObjectAndLoginAgain)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_4, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 40-Click on p userJourneyActions VerifyHeaderObjectAndLoginAgain.png')

"Step 41: Click on button GoToNextPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_GoToNextPage'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 41-Click on button GoToNextPage.png')

"Step 42: Click on div userJourneyActions (OpenServiceSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild_2, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 42-Click on div userJourneyActions OpenServiceSearch.png')

"Step 43: Click on button ExpandGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_ExpandGraph'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 43-Click on button ExpandGraph.png')

"Step 44: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 44-Click on body object.png')

"Step 45: Click on item FlowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/item_FlowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 45-Click on item FlowsWithoutTestCases.png')

"Step 46: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 46-Click on body object.png')

"Step 47: Click on button Shamika"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_Shamika'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 47-Click on button Shamika.png')

"Step 48: Click on link SignOut -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 48-Click on link SignOut - Navigate to page logout.png')

"Step 49: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC63-Logout and Manage User Journeys_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}