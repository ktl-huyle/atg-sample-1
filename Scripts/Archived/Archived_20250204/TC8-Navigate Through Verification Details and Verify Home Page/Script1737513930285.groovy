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

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link SignOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_home/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on link SignOut.png')

"Step 3: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_home/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on span SettingsButton.png')

"Step 4: Click on link TrueTestBetaConfigure -> Navigate to page 'organization settings#organization/*/settings/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_home/link_TrueTestBetaConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link TrueTestBetaConfigure - Navigate to page organization settingsorganizationsettings.png')

"Step 5: Click on div OrganizationSettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_settings/div_OrganizationSettings'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on div OrganizationSettings.png')

"Step 6: Click on button Tracking"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_settings/button_Tracking'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on button Tracking.png')

"Step 7: Click on span Edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_settings/span_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on span Edit.png')

"Step 8: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_settings/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on button Cancel.png')

"Step 9: Click on button G"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_settings/button_G'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on button G.png')

"Step 10: Click on link SignOut -> Navigate to page 'organization home#organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_settings/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on link SignOut - Navigate to page organization homeorganizationhome.png')

"Step 11: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on button Settings.png')

"Step 12: Click on link TrueTestBetaConfigure2 -> Navigate to page 'organization settings#organization/*/settings/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_home/link_TrueTestBetaConfigure2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on link TrueTestBetaConfigure2 - Navigate to page organization settingsorganizationsettings.png')

"Step 13: Click on link FirstProjectAI -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/settings/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_organization_settings/link_FirstProjectAI'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on link FirstProjectAI - Navigate to page team projectteamproject.png')

"Step 14: Click on link testNavigation (TrueTest) -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/link_testNavigation"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/link_testNavigation', ['link_testNavigation_nthChild': link_testNavigation_nthChild, 'path_param_6': path_param_6, 'project_id': project_id, 'path_param_5': path_param_5, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on link testNavigation TrueTest - Navigate to page team project detailsteamproject.png')

"Step 15: Click on button ViewDetails -> Navigate to page 'team project#team/*/project/*/*/*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_details/button_ViewDetails'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Click on button ViewDetails - Navigate to page team projectteamproject.png')

"Step 16: Click on div verificationDetails (VerifyLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/div_verificationDetails"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/div_verificationDetails', ['div_verificationDetails_nthChild': div_verificationDetails_nthChild, 'div_verificationDetails_internalHasText': div_verificationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on div verificationDetails VerifyLogin.png')

"Step 17: Click on button dynamicAction (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on button dynamicAction Unknown.png')

"Step 18: Click on button dynamicAction (Unknown2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_1, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on button dynamicAction Unknown2.png')

"Step 19: Click on button detailFlow (ShowDetailFlow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_detailFlow"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_detailFlow', ['button_detailFlow_nthChild': button_detailFlow_nthChild, 'button_detailFlow_divNthChild': button_detailFlow_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on button detailFlow ShowDetailFlow.png')

"Step 20: Click on button detailFlow (ShowDetailFlow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_detailFlow"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_detailFlow', ['button_detailFlow_nthChild': button_detailFlow_nthChild_1, 'button_detailFlow_divNthChild': button_detailFlow_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20-Click on button detailFlow ShowDetailFlow2.png')

"Step 21: Click on button detailFlow (ShowDetailFlow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_detailFlow"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_detailFlow', ['button_detailFlow_nthChild': button_detailFlow_nthChild_2, 'button_detailFlow_divNthChild': button_detailFlow_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21-Click on button detailFlow ShowDetailFlow3.png')

"Step 22: Click on button dynamicAction (Unknown3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_2, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 22-Click on button dynamicAction Unknown3.png')

"Step 23: Click on button dynamicAction (Unknown4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_3, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 23-Click on button dynamicAction Unknown4.png')

"Step 24: Click on button dynamicAction (Unknown5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_4, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 24-Click on button dynamicAction Unknown5.png')

"Step 25: Click on button dynamicAction (Unknown6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_5, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 25-Click on button dynamicAction Unknown6.png')

"Step 26: Click on button dynamicAction (Unknown7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_6, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 26-Click on button dynamicAction Unknown7.png')

"Step 27: Click on button dynamicAction (Unknown8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_7, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 27-Click on button dynamicAction Unknown8.png')

"Step 28: Click on div verificationDetails (VerifyNPCCReview)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/div_verificationDetails"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/div_verificationDetails', ['div_verificationDetails_nthChild': div_verificationDetails_nthChild_1, 'div_verificationDetails_internalHasText': div_verificationDetails_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 28-Click on div verificationDetails VerifyNPCCReview.png')

"Step 29: Click on button dynamicAction (Unknown9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_8, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 29-Click on button dynamicAction Unknown9.png')

"Step 30: Click on button detailFlow (ShowDetailFlow4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_detailFlow"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_detailFlow', ['button_detailFlow_nthChild': button_detailFlow_nthChild_3, 'button_detailFlow_divNthChild': button_detailFlow_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 30-Click on button detailFlow ShowDetailFlow4.png')

"Step 31: Click on button detailFlow (ShowDetailFlow5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_detailFlow"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_detailFlow', ['button_detailFlow_nthChild': button_detailFlow_nthChild_4, 'button_detailFlow_divNthChild': button_detailFlow_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 31-Click on button detailFlow ShowDetailFlow5.png')

"Step 32: Click on button dynamicAction (Unknown10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_9, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_9]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 32-Click on button dynamicAction Unknown10.png')

"Step 33: Click on button dynamicAction (Unknown11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_10, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_10]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 33-Click on button dynamicAction Unknown11.png')

"Step 34: Click on p verificationActions (SearchParts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/p_verificationActions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/p_verificationActions', ['p_verificationActions_class': p_verificationActions_class, 'p_verificationActions_internalText': p_verificationActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 34-Click on p verificationActions SearchParts.png')

"Step 35: Click on p verificationActions (SubmitDecision)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/p_verificationActions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/p_verificationActions', ['p_verificationActions_class': p_verificationActions_class_1, 'p_verificationActions_internalText': p_verificationActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 35-Click on p verificationActions SubmitDecision.png')

"Step 36: Click on p verificationActions (AddEnquiry)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/p_verificationActions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/p_verificationActions', ['p_verificationActions_class': p_verificationActions_class_2, 'p_verificationActions_internalText': p_verificationActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 36-Click on p verificationActions AddEnquiry.png')

"Step 37: Click on p verificationActions (VerifyHeaderLogin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/p_verificationActions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/p_verificationActions', ['p_verificationActions_class': p_verificationActions_class_3, 'p_verificationActions_internalText': p_verificationActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 37-Click on p verificationActions VerifyHeaderLogin.png')

"Step 38: Click on p verificationActions (VerifyHeaderLoginAgain)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/p_verificationActions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/p_verificationActions', ['p_verificationActions_class': p_verificationActions_class_4, 'p_verificationActions_internalText': p_verificationActions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 38-Click on p verificationActions VerifyHeaderLoginAgain.png')

"Step 39: Click on button navigationControl (NextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_navigationControl'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 39-Click on button navigationControl NextPage.png')

"Step 40: Click on div verificationDetails (OpenServiceSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/div_verificationDetails"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/div_verificationDetails', ['div_verificationDetails_nthChild': div_verificationDetails_nthChild_2, 'div_verificationDetails_internalHasText': div_verificationDetails_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 40-Click on div verificationDetails OpenServiceSearch.png')

"Step 41: Click on button navigationControl (ExpandGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/button_navigationControl'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 41-Click on button navigationControl ExpandGraph.png')

"Step 42: Click on body Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project/body_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 42-Click on body Unknown.png')

"Step 43: Click on item FlowsWithoutTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project/item_FlowsWithoutTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 43-Click on item FlowsWithoutTestCases.png')

"Step 44: Click on body Unknown -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project/body_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 44-Click on body Unknown - Navigate to page .png')

"Step 45: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Navigate Through Verification Details and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}