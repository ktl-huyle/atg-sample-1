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

WebUI.takeScreenshot(reportLocation + '/TC41/Step 4-Click on link signOut.png')

"Step 5: Click on span settingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_settingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 5-Click on span settingsButton.png')

"Step 6: Click on link truetestConfigure -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_truetestConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 6-Click on link truetestConfigure - Navigate to page organizationsettingstruetest.png')

"Step 7: Click on div organizationLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/div_organizationLink'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 7-Click on div organizationLink.png')

"Step 8: Click on button trackingAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_trackingAction'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 8-Click on button trackingAction.png')

"Step 9: Click on span editButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/span_editButton'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 9-Click on span editButton.png')

"Step 10: Click on button cancelDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_cancelDialog'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 10-Click on button cancelDialog.png')

"Step 11: Click on button userProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/button_userProfile'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 11-Click on button userProfile.png')

"Step 12: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 12-Click on link signOut - Navigate to page organizationhome.png')

"Step 13: Click on button settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_settings'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 13-Click on button settings.png')

"Step 14: Click on link truetestConfigure2 -> Navigate to page 'organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_truetestConfigure2'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 14-Click on link truetestConfigure2 - Navigate to page organizationsettingstruetest.png')

"Step 15: Click on link dynamicObject -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_truetest/link_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 15-Click on link dynamicObject - Navigate to page teamproject.png')

"Step 16: Click on link truetestMenu -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_truetestMenu'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 16-Click on link truetestMenu - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 17: Click on button viewDetails -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/button_viewDetails'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 17-Click on button viewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 18: Click on div userJourneyActions (verifyLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 18-Click on div userJourneyActions verifyLogin.png')

"Step 19: Click on button actionButton (actionButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 19-Click on button actionButton actionButton.png')

"Step 20: Click on button actionButton (actionButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_1, 'button_actionButton_divNthChild': button_actionButton_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 20-Click on button actionButton actionButton2.png')

"Step 21: Click on button showDetailFlow (showDetailFlow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 21-Click on button showDetailFlow showDetailFlow.png')

"Step 22: Click on button showDetailFlow (showDetailFlow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_1, 'button_showDetailFlow_divNthChild': button_showDetailFlow_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 22-Click on button showDetailFlow showDetailFlow2.png')

"Step 23: Click on button showDetailFlow (showDetailFlow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_2, 'button_showDetailFlow_divNthChild': button_showDetailFlow_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 23-Click on button showDetailFlow showDetailFlow3.png')

"Step 24: Click on button actionButton (actionButton3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_2, 'button_actionButton_divNthChild': button_actionButton_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 24-Click on button actionButton actionButton3.png')

"Step 25: Click on button actionButton (actionButton4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_3, 'button_actionButton_divNthChild': button_actionButton_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 25-Click on button actionButton actionButton4.png')

"Step 26: Click on button actionButton (actionButton5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_4, 'button_actionButton_divNthChild': button_actionButton_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 26-Click on button actionButton actionButton5.png')

"Step 27: Click on button actionButton (actionButton6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_5, 'button_actionButton_divNthChild': button_actionButton_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 27-Click on button actionButton actionButton6.png')

"Step 28: Click on button actionButton (actionButton7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_6, 'button_actionButton_divNthChild': button_actionButton_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 28-Click on button actionButton actionButton7.png')

"Step 29: Click on button actionButton (actionButton8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_7, 'button_actionButton_divNthChild': button_actionButton_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 29-Click on button actionButton actionButton8.png')

"Step 30: Click on div userJourneyActions (verifyNPCCReview)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild_1, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 30-Click on div userJourneyActions verifyNPCCReview.png')

"Step 31: Click on button actionButton (actionButton9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_8, 'button_actionButton_divNthChild': button_actionButton_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 31-Click on button actionButton actionButton9.png')

"Step 32: Click on button showDetailFlow (showDetailFlow4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 32-Click on button showDetailFlow showDetailFlow4.png')

"Step 33: Click on button showDetailFlow (showDetailFlow5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_showDetailFlow', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 33-Click on button showDetailFlow showDetailFlow5.png')

"Step 34: Click on button actionButton (actionButton10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_9, 'button_actionButton_divNthChild': button_actionButton_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 34-Click on button actionButton actionButton10.png')

"Step 35: Click on button actionButton (actionButton11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_actionButton', ['button_actionButton_class': button_actionButton_class_10, 'button_actionButton_divNthChild': button_actionButton_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 35-Click on button actionButton actionButton11.png')

"Step 36: Click on p userJourneyActions (searchParts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 36-Click on p userJourneyActions searchParts.png')

"Step 37: Click on p userJourneyActions (submitDecision)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_1, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 37-Click on p userJourneyActions submitDecision.png')

"Step 38: Click on p userJourneyActions (addEnquiry)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_2, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 38-Click on p userJourneyActions addEnquiry.png')

"Step 39: Click on p userJourneyActions (verifyHeaderLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_3, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 39-Click on p userJourneyActions verifyHeaderLogin.png')

"Step 40: Click on p userJourneyActions (verifyHeaderLoginAgain)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_userJourneyActions', ['p_userJourneyActions_class': p_userJourneyActions_class_4, 'p_userJourneyActions_internalText': p_userJourneyActions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 40-Click on p userJourneyActions verifyHeaderLoginAgain.png')

"Step 41: Click on button nextPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_nextPage'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 41-Click on button nextPage.png')

"Step 42: Click on div userJourneyActions (openServiceSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/div_userJourneyActions', ['div_userJourneyActions_nthChild': div_userJourneyActions_nthChild_2, 'div_userJourneyActions_internalHasText': div_userJourneyActions_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 42-Click on div userJourneyActions openServiceSearch.png')

"Step 43: Click on button expandGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/button_expandGraph'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 43-Click on button expandGraph.png')

"Step 44: Click on body mainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_mainContent'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 44-Click on body mainContent.png')

"Step 45: Click on item flowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/item_flowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 45-Click on item flowsWithoutTestCases.png')

"Step 46: Click on body mainContent -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/body_mainContent'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 46-Click on body mainContent - Navigate to page .png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC41-Manage User Journeys and Settings in Sauce Demo Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}