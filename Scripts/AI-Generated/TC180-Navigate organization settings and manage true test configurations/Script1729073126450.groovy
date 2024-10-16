import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

WebUI.takeScreenshot(reportLocation + '/TC180/Step 4-Click on link SignOut.png')

"Step 5: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 5-Click on span SettingsButton.png')

"Step 6: Click on link TrueTestBeta -> Navigate to page 'organization settings#organization/{*}/settings/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBeta'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 6-Click on link TrueTestBeta - Navigate to page organization settingsorganizationsettings.png')

"Step 7: Click on div organizationInfo (organizationLink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings/div_organizationInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings/div_organizationInfo', ['div_organizationInfo_internalRoleGridcellName': div_organizationInfo_internalRoleGridcellName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 7-Click on div organizationInfo organizationLink.png')

"Step 8: Click on button trackingAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_trackingAction'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 8-Click on button trackingAction.png')

"Step 9: Click on span editMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/span_editMenu'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 9-Click on span editMenu.png')

"Step 10: Click on button cancelDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_cancelDialog'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 10-Click on button cancelDialog.png')

"Step 11: Click on button gayatriAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/button_gayatriAction'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 11-Click on button gayatriAction.png')

"Step 12: Click on link signOut -> Navigate to page 'organization home#organization/{*}/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 12-Click on link signOut - Navigate to page organization homeorganizationhome.png')

"Step 13: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 13-Click on button Settings.png')

"Step 14: Click on link TrueTestBetaConfigure2 -> Navigate to page 'organization settings#organization/{*}/settings/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TrueTestBetaConfigure2'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 14-Click on link TrueTestBetaConfigure2 - Navigate to page organization settingsorganizationsettings.png')

"Step 15: Click on link organizationProjects (firstProjectAI) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings/link_organizationProjects', ['link_organizationProjects_internalRoleLinkName': link_organizationProjects_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 15-Click on link organizationProjects firstProjectAI - Navigate to page team projectteamproject.png')

"Step 16: Click on link TrueTestMenu -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestMenu'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 16-Click on link TrueTestMenu - Navigate to page team projectteamproject.png')

"Step 17: Click on button viewDetails (viewDetails) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_viewDetails', ['button_viewDetails_internalRoleRowName': button_viewDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 17-Click on button viewDetails viewDetails - Navigate to page team projectteamproject.png')

"Step 18: Click on div serviceSearch (verifyLoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_serviceSearch"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_serviceSearch', ['div_serviceSearch_nthChild': div_serviceSearch_nthChild, 'div_serviceSearch_internalHasText': div_serviceSearch_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 18-Click on div serviceSearch verifyLoginStep.png')

"Step 19: Click on button actionSteps (actionStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 19-Click on button actionSteps actionStep.png')

"Step 20: Click on button actionSteps (actionStep2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_1, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 20-Click on button actionSteps actionStep2.png')

"Step 21: Click on button showDetailFlows (showDetailFlow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows', ['button_showDetailFlows_nthChild': button_showDetailFlows_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 21-Click on button showDetailFlows showDetailFlow.png')

"Step 22: Click on button showDetailFlows (showDetailFlow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows', ['button_showDetailFlows_nthChild': button_showDetailFlows_nthChild_1, 'button_showDetailFlows_divNthChild': button_showDetailFlows_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 22-Click on button showDetailFlows showDetailFlow2.png')

"Step 23: Click on button showDetailFlows (showDetailFlow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows', ['button_showDetailFlows_nthChild': button_showDetailFlows_nthChild_2, 'button_showDetailFlows_divNthChild': button_showDetailFlows_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 23-Click on button showDetailFlows showDetailFlow3.png')

"Step 24: Click on button actionSteps (actionStep3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_2, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 24-Click on button actionSteps actionStep3.png')

"Step 25: Click on button actionSteps (actionStep4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_3, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 25-Click on button actionSteps actionStep4.png')

"Step 26: Click on button actionSteps (actionStep5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_4, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 26-Click on button actionSteps actionStep5.png')

"Step 27: Click on button actionSteps (actionStep6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_5, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 27-Click on button actionSteps actionStep6.png')

"Step 28: Click on button actionSteps (actionStep7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_6, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 28-Click on button actionSteps actionStep7.png')

"Step 29: Click on button actionSteps (actionStep8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_7, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 29-Click on button actionSteps actionStep8.png')

"Step 30: Click on div serviceSearch (verifyNPCCStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_serviceSearch"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_serviceSearch', ['div_serviceSearch_nthChild': div_serviceSearch_nthChild_1, 'div_serviceSearch_internalHasText': div_serviceSearch_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 30-Click on div serviceSearch verifyNPCCStep.png')

"Step 31: Click on button actionSteps (actionStep9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_8, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 31-Click on button actionSteps actionStep9.png')

"Step 32: Click on button showDetailFlows (showDetailFlow4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows', ['button_showDetailFlows_nthChild': button_showDetailFlows_nthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 32-Click on button showDetailFlows showDetailFlow4.png')

"Step 33: Click on button showDetailFlows (showDetailFlow5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_showDetailFlows', ['button_showDetailFlows_nthChild': button_showDetailFlows_nthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 33-Click on button showDetailFlows showDetailFlow5.png')

"Step 34: Click on button actionSteps (actionStep10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_9, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 34-Click on button actionSteps actionStep10.png')

"Step 35: Click on button actionSteps (actionStep11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_actionSteps', ['button_actionSteps_class': button_actionSteps_class_10, 'button_actionSteps_divNthChild': button_actionSteps_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 35-Click on button actionSteps actionStep11.png')

"Step 36: Click on p enquiryActions (searchPartsQuick)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions', ['p_enquiryActions_class': p_enquiryActions_class, 'p_enquiryActions_internalText': p_enquiryActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 36-Click on p enquiryActions searchPartsQuick.png')

"Step 37: Click on p enquiryActions (submitDecisionNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions', ['p_enquiryActions_class': p_enquiryActions_class_1, 'p_enquiryActions_internalText': p_enquiryActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 37-Click on p enquiryActions submitDecisionNPCC.png')

"Step 38: Click on p enquiryActions (addEnquiryNPCC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions', ['p_enquiryActions_class': p_enquiryActions_class_2, 'p_enquiryActions_internalText': p_enquiryActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 38-Click on p enquiryActions addEnquiryNPCC.png')

"Step 39: Click on p enquiryActions (verifyHeaderLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions', ['p_enquiryActions_class': p_enquiryActions_class_3, 'p_enquiryActions_internalText': p_enquiryActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 39-Click on p enquiryActions verifyHeaderLogin.png')

"Step 40: Click on p enquiryActions (verifyHeaderLoginAgain)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/p_enquiryActions', ['p_enquiryActions_class': p_enquiryActions_class_4, 'p_enquiryActions_internalText': p_enquiryActions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 40-Click on p enquiryActions verifyHeaderLoginAgain.png')

"Step 41: Click on button navigationActions (NextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 41-Click on button navigationActions NextPage.png')

"Step 42: Click on div serviceSearch (openServiceSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_serviceSearch"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_serviceSearch', ['div_serviceSearch_nthChild': div_serviceSearch_nthChild_2, 'div_serviceSearch_internalHasText': div_serviceSearch_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 42-Click on div serviceSearch openServiceSearch.png')

"Step 43: Click on button navigationActions (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_navigationActions'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 43-Click on button navigationActions ExpandGraph.png')

"Step 44: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 44-Click on body PageContent.png')

"Step 45: Click on item flowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_flowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 45-Click on item flowsWithoutTestCases.png')

"Step 46: Click on body PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 46-Click on body PageContent.png')

"Step 47: Click on button shamikaAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_shamikaAction'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 47-Click on button shamikaAction.png')

"Step 48: Click on link SignOut -> Navigate to page 'user action#logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC180/Step 48-Click on link SignOut - Navigate to page user actionlogout.png')

"Step 49: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC180-Navigate organization settings and manage true test configurations_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}