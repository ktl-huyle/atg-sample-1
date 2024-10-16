import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to organization/{*}/home"

TrueTestScripts.navigate("organization/{*}/home")

"Step 4: Click on link SignOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 4-Click on link SignOut.png')

"Step 5: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 5-Click on span SettingsButton.png')

"Step 6: Click on link TrueTestBeta -> Navigate to page 'organization settings#organization/{*}/settings/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBeta'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 6-Click on link TrueTestBeta - Navigate to page organization settingsorganizationsettings.png')

"Step 7: Click on div organizationDetails (organizationLink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings/div_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings/div_organizationDetails', ['div_organizationDetails_internalRoleGridcellName': div_organizationDetails_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 7-Click on div organizationDetails organizationLink.png')

"Step 8: Click on button trackingAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_trackingAction'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 8-Click on button trackingAction.png')

"Step 9: Click on span editMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/span_editMenu'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 9-Click on span editMenu.png')

"Step 10: Click on button cancelDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_cancelDialog'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 10-Click on button cancelDialog.png')

"Step 11: Click on button gayatriAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_gayatriAction'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 11-Click on button gayatriAction.png')

"Step 12: Click on link signOut -> Navigate to page 'organization home#organization/{*}/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 12-Click on link signOut - Navigate to page organization homeorganizationhome.png')

"Step 13: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 13-Click on button Settings.png')

"Step 14: Click on link TrueTestBetaConfigure2 -> Navigate to page 'organization settings#organization/{*}/settings/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure2'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 14-Click on link TrueTestBetaConfigure2 - Navigate to page organization settingsorganizationsettings.png')

"Step 15: Click on link organizationSettings (firstProjectAI) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationSettings', ['link_organizationSettings_internalRoleLinkName': link_organizationSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 15-Click on link organizationSettings firstProjectAI - Navigate to page team projectteamproject.png')

"Step 16: Click on link TrueTestMenu -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestMenu'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 16-Click on link TrueTestMenu - Navigate to page team projectteamproject.png')

"Step 17: Click on button viewDetails (viewDetails) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 17-Click on button viewDetails viewDetails - Navigate to page team projectteamproject.png')

"Step 18: Click on div loginVerification (verifyLoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_loginVerification"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_loginVerification', ['div_loginVerification_nthChild': div_loginVerification_nthChild, 'div_loginVerification_internalHasText': div_loginVerification_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 18-Click on div loginVerification verifyLoginStep.png')

"Step 19: Click on button actionSteps (actionStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 19-Click on button actionSteps actionStep.png')

"Step 20: Click on button actionSteps (actionStep2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_1, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 20-Click on button actionSteps actionStep2.png')

"Step 21: Click on button showDetailFlows (showDetailFlow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows', ['button_showDetailFlows_nthChild': button_showDetailFlows_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 21-Click on button showDetailFlows showDetailFlow.png')

"Step 22: Click on button showDetailFlows (showDetailFlow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows', ['button_showDetailFlows_nthChild': button_showDetailFlows_nthChild_1, 'button_showDetailFlows_divNthChild': button_showDetailFlows_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 22-Click on button showDetailFlows showDetailFlow2.png')

"Step 23: Click on button showDetailFlows (showDetailFlow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows', ['button_showDetailFlows_nthChild': button_showDetailFlows_nthChild_2, 'button_showDetailFlows_divNthChild': button_showDetailFlows_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 23-Click on button showDetailFlows showDetailFlow3.png')

"Step 24: Click on button actionSteps (actionStep3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_2, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 24-Click on button actionSteps actionStep3.png')

"Step 25: Click on button actionSteps (actionStep4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_3, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 25-Click on button actionSteps actionStep4.png')

"Step 26: Click on button actionSteps (actionStep5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_4, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 26-Click on button actionSteps actionStep5.png')

"Step 27: Click on button actionSteps (actionStep6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_5, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 27-Click on button actionSteps actionStep6.png')

"Step 28: Click on button actionSteps (actionStep7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_6, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 28-Click on button actionSteps actionStep7.png')

"Step 29: Click on button actionSteps (actionStep8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_7, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 29-Click on button actionSteps actionStep8.png')

"Step 30: Click on div loginVerification (verifyNPCCStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_loginVerification"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_loginVerification', ['div_loginVerification_nthChild': div_loginVerification_nthChild_1, 'div_loginVerification_internalHasText': div_loginVerification_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 30-Click on div loginVerification verifyNPCCStep.png')

"Step 31: Click on button actionSteps (actionStep9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_8, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 31-Click on button actionSteps actionStep9.png')

"Step 32: Click on button showDetailFlows (showDetailFlow4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows', ['button_showDetailFlows_nthChild': button_showDetailFlows_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 32-Click on button showDetailFlows showDetailFlow4.png')

"Step 33: Click on button showDetailFlows (showDetailFlow5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows', ['button_showDetailFlows_nthChild': button_showDetailFlows_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 33-Click on button showDetailFlows showDetailFlow5.png')

"Step 34: Click on button actionSteps (actionStep10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_9, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 34-Click on button actionSteps actionStep10.png')

"Step 35: Click on button actionSteps (actionStep11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_10, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 35-Click on button actionSteps actionStep11.png')

"Step 36: Click on p verificationSteps (searchPartsQuick)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps', ['p_verificationSteps_class': p_verificationSteps_class, 'p_verificationSteps_internalText': p_verificationSteps_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 36-Click on p verificationSteps searchPartsQuick.png')

"Step 37: Click on p verificationSteps (submitDecisionNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps', ['p_verificationSteps_class': p_verificationSteps_class_1, 'p_verificationSteps_internalText': p_verificationSteps_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 37-Click on p verificationSteps submitDecisionNPCC.png')

"Step 38: Click on p verificationSteps (addEnquiryNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps', ['p_verificationSteps_class': p_verificationSteps_class_2, 'p_verificationSteps_internalText': p_verificationSteps_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 38-Click on p verificationSteps addEnquiryNPCC.png')

"Step 39: Click on p verificationSteps (verifyHeaderLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps', ['p_verificationSteps_class': p_verificationSteps_class_3, 'p_verificationSteps_internalText': p_verificationSteps_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 39-Click on p verificationSteps verifyHeaderLogin.png')

"Step 40: Click on p verificationSteps (verifyHeaderLoginAgain)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_verificationSteps', ['p_verificationSteps_class': p_verificationSteps_class_4, 'p_verificationSteps_internalText': p_verificationSteps_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 40-Click on p verificationSteps verifyHeaderLoginAgain.png')

"Step 41: Click on button navigation (NextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 41-Click on button navigation NextPage.png')

"Step 42: Click on div loginVerification (openServiceSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_loginVerification"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_loginVerification', ['div_loginVerification_nthChild': div_loginVerification_nthChild_2, 'div_loginVerification_internalHasText': div_loginVerification_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 42-Click on div loginVerification openServiceSearch.png')

"Step 43: Click on button navigation (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 43-Click on button navigation ExpandGraph.png')

"Step 44: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 44-Click on body PageContent.png')

"Step 45: Click on item flowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_flowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 45-Click on item flowsWithoutTestCases.png')

"Step 46: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 46-Click on body PageContent.png')

"Step 47: Click on button shamikaAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_shamikaAction'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 47-Click on button shamikaAction.png')

"Step 48: Click on link SignOut -> Navigate to page 'user action#logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 48-Click on link SignOut - Navigate to page user actionlogout.png')

"Step 49: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC36-Manage TrueTest Beta Settings and User Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}