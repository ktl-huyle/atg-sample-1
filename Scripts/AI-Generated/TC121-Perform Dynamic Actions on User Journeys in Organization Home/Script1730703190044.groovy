import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 4: Click on button katalonAI (KatalonAI)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdminActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAdminActions_1', ['button_katalonAI_internalRoleButtonName': button_katalonAI_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 4-Click on button katalonAI KatalonAI.png')

"Step 5: Click on link ecoOrganization (EcoOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_ecoOrganization"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_ecoOrganization', ['link_ecoOrganization_class': link_ecoOrganization_class, 'link_ecoOrganization_internalRoleLinkName': link_ecoOrganization_internalRoleLinkName, 'link_ecoOrganization_organization_id': link_ecoOrganization_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 5-Click on link ecoOrganization EcoOrganization.png')

"Step 6: Click on link ecoShopNoData (ESEcoShopNoData) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_ecoShopNoData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_ecoShopNoData', ['link_ecoShopNoData_internalRoleLinkName': link_ecoShopNoData_internalRoleLinkName, 'link_ecoShopNoData_team_id': link_ecoShopNoData_team_id, 'link_ecoShopNoData_project_id': link_ecoShopNoData_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 6-Click on link ecoShopNoData ESEcoShopNoData - Navigate to page teamproject.png')

"Step 7: Click on link TrueTest -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTest3'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 7-Click on link TrueTest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 8: Click on button ViewDetails -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/button_viewDetails'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 8-Click on button ViewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 9: Click on button dynamicAction (MuiButtonBase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 9-Click on button dynamicAction MuiButtonBase.png')

"Step 10: Click on div TestSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_TestSteps'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 10-Click on div TestSteps.png')

"Step 11: Click on button dynamicAction (MuiButtonBase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_1, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 11-Click on button dynamicAction MuiButtonBase2.png')

"Step 12: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class, 'p_loginSteps_internalText': p_loginSteps_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 12-Click on p loginSteps LoginStepThree.png')

"Step 13: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_1, 'p_loginSteps_internalText': p_loginSteps_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 13-Click on p loginSteps LoginStepThree.png')

"Step 14: Click on button showDetailFlow (ShowDetailFlowPanel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_2', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild, 'button_showDetailFlow_divNthChild': button_showDetailFlow_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 14-Click on button showDetailFlow ShowDetailFlowPanel.png')

"Step 15: Click on div NavigationAndClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigationAndClick'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 15-Click on div NavigationAndClick.png')

"Step 16: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_2, 'p_loginSteps_internalText': p_loginSteps_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 16-Click on p loginSteps LoginStepThree.png')

"Step 17: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_3, 'p_loginSteps_internalText': p_loginSteps_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 17-Click on p loginSteps LoginStepThree.png')

"Step 18: Click on button dynamicAction (UnknownAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_2, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 18-Click on button dynamicAction UnknownAction.png')

"Step 19: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_4, 'p_loginSteps_internalText': p_loginSteps_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 19-Click on p loginSteps LoginStepThree.png')

"Step 20: Click on button showDetailFlow (ShowDetailFlowPanel2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_2', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_1, 'button_showDetailFlow_divNthChild': button_showDetailFlow_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 20-Click on button showDetailFlow ShowDetailFlowPanel2.png')

"Step 21: Click on button dynamicAction (UnknownAction2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_3, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 21-Click on button dynamicAction UnknownAction2.png')

"Step 22: Click on p loginSteps (LoginStepEight)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_5, 'p_loginSteps_internalText': p_loginSteps_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 22-Click on p loginSteps LoginStepEight.png')

"Step 23: Click on p loginSteps (LoginStepEight)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_6, 'p_loginSteps_internalText': p_loginSteps_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 23-Click on p loginSteps LoginStepEight.png')

"Step 24: Click on button showDetailFlow (ShowDetailFlowPanel3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_2', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_2, 'button_showDetailFlow_divNthChild': button_showDetailFlow_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 24-Click on button showDetailFlow ShowDetailFlowPanel3.png')

"Step 25: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_7, 'p_loginSteps_internalText': p_loginSteps_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 25-Click on p loginSteps LoginStepThree.png')

"Step 26: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_8, 'p_loginSteps_internalText': p_loginSteps_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 26-Click on p loginSteps LoginStepThree.png')

"Step 27: Click on button dynamicAction (UnknownAction3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_4, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 27-Click on button dynamicAction UnknownAction3.png')

"Step 28: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_9, 'p_loginSteps_internalText': p_loginSteps_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 28-Click on p loginSteps LoginStepThree.png')

"Step 29: Click on p loginSteps (LoginStepThree)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_10, 'p_loginSteps_internalText': p_loginSteps_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 29-Click on p loginSteps LoginStepThree.png')

"Step 30: Click on button dynamicAction (UnknownAction4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_5, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 30-Click on button dynamicAction UnknownAction4.png')

"Step 31: Click on div NavigationAndClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigationAndClick'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 31-Click on div NavigationAndClick.png')

"Step 32: Click on div NavigationAndClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigationAndClick'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 32-Click on div NavigationAndClick.png')

"Step 33: Click on button showDetailFlow (ShowDetailFlowPanel4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_2', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_3, 'button_showDetailFlow_divNthChild': button_showDetailFlow_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 33-Click on button showDetailFlow ShowDetailFlowPanel4.png')

"Step 34: Click on p loginSteps (LoginNavigateToSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_11, 'p_loginSteps_internalText': p_loginSteps_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 34-Click on p loginSteps LoginNavigateToSearch.png')

"Step 35: Click on p loginSteps (LoginNavigateToSearch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_12, 'p_loginSteps_internalText': p_loginSteps_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 35-Click on p loginSteps LoginNavigateToSearch.png')

"Step 36: Click on button showDetailFlow (ShowDetailFlowPanel5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_detailFlowPanels_2', ['button_showDetailFlow_nthChild': button_showDetailFlow_nthChild_4, 'button_showDetailFlow_divNthChild': button_showDetailFlow_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 36-Click on button showDetailFlow ShowDetailFlowPanel5.png')

"Step 37: Click on button dynamicAction (UnknownAction5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_6, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 37-Click on button dynamicAction UnknownAction5.png')

"Step 38: Click on button dynamicAction (UnknownAction6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_7, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 38-Click on button dynamicAction UnknownAction6.png')

"Step 39: Click on button dynamicAction (MuiButtonBase3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_8, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 39-Click on button dynamicAction MuiButtonBase3.png')

"Step 40: Click on button dynamicAction (MuiButtonBase4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicAction', ['button_dynamicAction_class': button_dynamicAction_class_9, 'button_dynamicAction_divNthChild': button_dynamicAction_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 40-Click on button dynamicAction MuiButtonBase4.png')

"Step 41: Click on p loginSteps (LoginStepTwo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_13, 'p_loginSteps_internalText': p_loginSteps_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 41-Click on p loginSteps LoginStepTwo.png')

"Step 42: Click on p loginSteps (LoginStepTwo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_14, 'p_loginSteps_internalText': p_loginSteps_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 42-Click on p loginSteps LoginStepTwo.png')

"Step 43: Click on p loginSteps (LoginStepTwo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_15, 'p_loginSteps_internalText': p_loginSteps_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 43-Click on p loginSteps LoginStepTwo.png')

"Step 44: Click on p loginSteps (LoginStepTwo) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginSteps', ['p_loginSteps_class': p_loginSteps_class_16, 'p_loginSteps_internalText': p_loginSteps_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 44-Click on p loginSteps LoginStepTwo - Navigate to page .png')

"Step 45: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC121-Perform Dynamic Actions on User Journeys in Organization Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}