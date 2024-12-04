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

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 4-Click on link signOut.png')

"Step 5: Click on span settingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 5-Click on span settingsButton.png')

"Step 6: Click on link truetestConfigure -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBeta_Configure'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 6-Click on link truetestConfigure - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on div organizationLink (organizationLink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/div_dynamicObject_1', ['div_organizationLink_internalRoleGridcellName': div_organizationLink_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 7-Click on div organizationLink organizationLink.png')

"Step 8: Click on button trackingAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_Tracking'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 8-Click on button trackingAction.png')

"Step 9: Click on span editButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/span_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 9-Click on span editButton.png')

"Step 10: Click on button cancelDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 10-Click on button cancelDialog.png')

"Step 11: Click on button userProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_G'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 11-Click on button userProfile.png')

"Step 12: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 12-Click on link signOut - Navigate to page organizationhome.png')

"Step 13: Click on button settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 13-Click on button settings.png')

"Step 14: Click on link truetestConfigure2 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBeta_Configure2'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 14-Click on link truetestConfigure2 - Navigate to page organizationsettingstruetest.png')

"Step 15: Click on link dynamicObject (firstProjectAI) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_truetest/link_dynamicObject', ['link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 15-Click on link dynamicObject firstProjectAI - Navigate to page teamproject.png')

"Step 16: Click on link truetestMenu -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 16-Click on link truetestMenu - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 17: Click on button viewDetails (viewDetails) -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 17-Click on button viewDetails viewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 18: Click on div serviceReview (verifyLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_serviceReview"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_serviceReview', ['div_serviceReview_nthChild': div_serviceReview_nthChild, 'div_serviceReview_internalHasText': div_serviceReview_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 18-Click on div serviceReview verifyLogin.png')

"Step 19: Click on button actionButton (actionButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 19-Click on button actionButton actionButton.png')

"Step 20: Click on button actionButton (actionButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_1, 'button_actionButton_divNthChild': button_actionButton_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 20-Click on button actionButton actionButton2.png')

"Step 21: Click on button showDetailFlow (showDetailFlow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 21-Click on button showDetailFlow showDetailFlow.png')

"Step 22: Click on button showDetailFlow (showDetailFlow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_1, 'button_showDetailFlow_divNthChild': button_showDetailFlow_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 22-Click on button showDetailFlow showDetailFlow2.png')

"Step 23: Click on button showDetailFlow (showDetailFlow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_2, 'button_showDetailFlow_divNthChild': button_showDetailFlow_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 23-Click on button showDetailFlow showDetailFlow3.png')

"Step 24: Click on button actionButton (actionButton3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_2, 'button_actionButton_divNthChild': button_actionButton_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 24-Click on button actionButton actionButton3.png')

"Step 25: Click on button actionButton (actionButton4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_3, 'button_actionButton_divNthChild': button_actionButton_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 25-Click on button actionButton actionButton4.png')

"Step 26: Click on button actionButton (actionButton5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_4, 'button_actionButton_divNthChild': button_actionButton_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 26-Click on button actionButton actionButton5.png')

"Step 27: Click on button actionButton (actionButton6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_5, 'button_actionButton_divNthChild': button_actionButton_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 27-Click on button actionButton actionButton6.png')

"Step 28: Click on button actionButton (actionButton7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_6, 'button_actionButton_divNthChild': button_actionButton_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 28-Click on button actionButton actionButton7.png')

"Step 29: Click on button actionButton (actionButton8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_7, 'button_actionButton_divNthChild': button_actionButton_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 29-Click on button actionButton actionButton8.png')

"Step 30: Click on div serviceReview (verifyNPCCReview)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_serviceReview"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_serviceReview', ['div_serviceReview_nthChild': div_serviceReview_nthChild_1, 'div_serviceReview_internalHasText': div_serviceReview_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 30-Click on div serviceReview verifyNPCCReview.png')

"Step 31: Click on button actionButton (actionButton9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_8, 'button_actionButton_divNthChild': button_actionButton_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 31-Click on button actionButton actionButton9.png')

"Step 32: Click on button showDetailFlow (showDetailFlow4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 32-Click on button showDetailFlow showDetailFlow4.png')

"Step 33: Click on button showDetailFlow (showDetailFlow5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 33-Click on button showDetailFlow showDetailFlow5.png')

"Step 34: Click on button actionButton (actionButton10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_9, 'button_actionButton_divNthChild': button_actionButton_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 34-Click on button actionButton actionButton10.png')

"Step 35: Click on button actionButton (actionButton11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_10, 'button_actionButton_divNthChild': button_actionButton_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 35-Click on button actionButton actionButton11.png')

"Step 36: Click on p navigationVerification (searchParts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject_1', ['p_navigationVerification_class': p_navigationVerification_class, 'p_navigationVerification_internalText': p_navigationVerification_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 36-Click on p navigationVerification searchParts.png')

"Step 37: Click on p navigationVerification (submitDecision)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject_1', ['p_navigationVerification_class': p_navigationVerification_class_1, 'p_navigationVerification_internalText': p_navigationVerification_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 37-Click on p navigationVerification submitDecision.png')

"Step 38: Click on p navigationVerification (addEnquiry)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject_1', ['p_navigationVerification_class': p_navigationVerification_class_2, 'p_navigationVerification_internalText': p_navigationVerification_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 38-Click on p navigationVerification addEnquiry.png')

"Step 39: Click on p navigationVerification (verifyHeaderLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject_1', ['p_navigationVerification_class': p_navigationVerification_class_3, 'p_navigationVerification_internalText': p_navigationVerification_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 39-Click on p navigationVerification verifyHeaderLogin.png')

"Step 40: Click on p navigationVerification (verifyHeaderLoginAgain)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_dynamicObject_1', ['p_navigationVerification_class': p_navigationVerification_class_4, 'p_navigationVerification_internalText': p_navigationVerification_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 40-Click on p navigationVerification verifyHeaderLoginAgain.png')

"Step 41: Click on button nextPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_GoToNextPage'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 41-Click on button nextPage.png')

"Step 42: Click on div serviceReview (openServiceSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_serviceReview"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_serviceReview', ['div_serviceReview_nthChild': div_serviceReview_nthChild_2, 'div_serviceReview_internalHasText': div_serviceReview_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 42-Click on div serviceReview openServiceSearch.png')

"Step 43: Click on button expandGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_ExpandGraph'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 43-Click on button expandGraph.png')

"Step 44: Click on body mainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 44-Click on body mainContent.png')

"Step 45: Click on item flowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/item_FlowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 45-Click on item flowsWithoutTestCases.png')

"Step 46: Click on body mainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 46-Click on body mainContent.png')

"Step 47: Click on button userProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_userProfile'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 47-Click on button userProfile.png')

"Step 48: Click on link signOut -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC129/Step 48-Click on link signOut - Navigate to page logout.png')

"Step 49: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC129-Configure TrueTest Settings and Logout Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}