import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_organizationAction_1', ['button_katalonAI_internalRoleButtonName': button_katalonAI_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on button katalonAI KatalonAI.png')

"Step 5: Click on link organizationLinks (EcoOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_1', ['link_organizationLinks_class': link_organizationLinks_class, 'link_organizationLinks_organization_id': link_organizationLinks_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on link organizationLinks EcoOrganization.png')

"Step 6: Click on link organizationLinks (ES EcoShop) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName, 'link_organizationLinks_project_id': link_organizationLinks_project_id, 'link_organizationLinks_team_id': link_organizationLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on link organizationLinks ES EcoShop - Navigate to page teamproject.png')

"Step 7: Click on link TrueTestMenu -> Navigate to page 'team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TrueTestMenu2'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on link TrueTestMenu - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 8: Click on button ViewDetails -> Navigate to page 'team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys/button_viewDetails'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on button ViewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 9: Click on button muiButtons (MuiButtonBase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons', ['button_muiButtons_class': button_muiButtons_class]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on button muiButtons MuiButtonBase.png')

"Step 10: Click on div TestSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_TestSteps'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 10-Click on div TestSteps.png')

"Step 11: Click on button muiButtons (MuiButtonBase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons', ['button_muiButtons_class': button_muiButtons_class_1, 'button_muiButtons_divNthChild': button_muiButtons_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 11-Click on button muiButtons MuiButtonBase2.png')

"Step 12: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class, 'p_loginSteps_internalText': p_loginSteps_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 12-Click on p loginSteps LoginStep.png')

"Step 13: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_1, 'p_loginSteps_internalText': p_loginSteps_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 13-Click on p loginSteps LoginStep.png')

"Step 14: Click on button detailFlowPanels (ShowDetailFlowPanel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_2', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 14-Click on button detailFlowPanels ShowDetailFlowPanel.png')

"Step 15: Click on div NavigateToClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigateToClick'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 15-Click on div NavigateToClick.png')

"Step 16: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_2, 'p_loginSteps_internalText': p_loginSteps_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 16-Click on p loginSteps LoginStep.png')

"Step 17: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_3, 'p_loginSteps_internalText': p_loginSteps_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 17-Click on p loginSteps LoginStep.png')

"Step 18: Click on button muiButtons (MuiButtonBase3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons', ['button_muiButtons_class': button_muiButtons_class_2, 'button_muiButtons_divNthChild': button_muiButtons_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 18-Click on button muiButtons MuiButtonBase3.png')

"Step 19: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_4, 'p_loginSteps_internalText': p_loginSteps_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 19-Click on p loginSteps LoginStep.png')

"Step 20: Click on button detailFlowPanels (ShowDetailFlowPanel2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_2', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_1, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 20-Click on button detailFlowPanels ShowDetailFlowPanel2.png')

"Step 21: Click on button muiButtons (MuiButtonBase4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons', ['button_muiButtons_class': button_muiButtons_class_3, 'button_muiButtons_divNthChild': button_muiButtons_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 21-Click on button muiButtons MuiButtonBase4.png')

"Step 22: Click on p loginSteps (LoginStep2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_5, 'p_loginSteps_internalText': p_loginSteps_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 22-Click on p loginSteps LoginStep2.png')

"Step 23: Click on p loginSteps (LoginStep2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_6, 'p_loginSteps_internalText': p_loginSteps_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 23-Click on p loginSteps LoginStep2.png')

"Step 24: Click on button detailFlowPanels (ShowDetailFlowPanel3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_2', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_2, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 24-Click on button detailFlowPanels ShowDetailFlowPanel3.png')

"Step 25: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_7, 'p_loginSteps_internalText': p_loginSteps_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 25-Click on p loginSteps LoginStep.png')

"Step 26: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_8, 'p_loginSteps_internalText': p_loginSteps_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 26-Click on p loginSteps LoginStep.png')

"Step 27: Click on button muiButtons (MuiButtonBase5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons', ['button_muiButtons_class': button_muiButtons_class_4, 'button_muiButtons_divNthChild': button_muiButtons_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 27-Click on button muiButtons MuiButtonBase5.png')

"Step 28: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_9, 'p_loginSteps_internalText': p_loginSteps_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 28-Click on p loginSteps LoginStep.png')

"Step 29: Click on p loginSteps (LoginStep)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_10, 'p_loginSteps_internalText': p_loginSteps_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 29-Click on p loginSteps LoginStep.png')

"Step 30: Click on button muiButtons (MuiButtonBase6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons', ['button_muiButtons_class': button_muiButtons_class_5, 'button_muiButtons_divNthChild': button_muiButtons_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 30-Click on button muiButtons MuiButtonBase6.png')

"Step 31: Click on div NavigateToClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigateToClick'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 31-Click on div NavigateToClick.png')

"Step 32: Click on div NavigateToClick"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_truetest_user_journeys_aut/div_NavigateToClick'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 32-Click on div NavigateToClick.png')

"Step 33: Click on button detailFlowPanels (ShowDetailFlowPanel4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_2', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_3, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 33-Click on button detailFlowPanels ShowDetailFlowPanel4.png')

"Step 34: Click on p loginSteps (LoginNavigateToPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_11, 'p_loginSteps_internalText': p_loginSteps_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 34-Click on p loginSteps LoginNavigateToPage.png')

"Step 35: Click on p loginSteps (LoginNavigateToPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_12, 'p_loginSteps_internalText': p_loginSteps_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 35-Click on p loginSteps LoginNavigateToPage.png')

"Step 36: Click on button detailFlowPanels (ShowDetailFlowPanel5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_dynamicObject_2', ['button_detailFlowPanels_nthChild': button_detailFlowPanels_nthChild_4, 'button_detailFlowPanels_divNthChild': button_detailFlowPanels_divNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 36-Click on button detailFlowPanels ShowDetailFlowPanel5.png')

"Step 37: Click on button muiButtons (MuiButtonBase7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons', ['button_muiButtons_class': button_muiButtons_class_6, 'button_muiButtons_divNthChild': button_muiButtons_divNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 37-Click on button muiButtons MuiButtonBase7.png')

"Step 38: Click on button muiButtons (MuiButtonBase8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons', ['button_muiButtons_class': button_muiButtons_class_7, 'button_muiButtons_divNthChild': button_muiButtons_divNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 38-Click on button muiButtons MuiButtonBase8.png')

"Step 39: Click on button muiButtons (MuiButtonBase9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons', ['button_muiButtons_class': button_muiButtons_class_8, 'button_muiButtons_divNthChild': button_muiButtons_divNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 39-Click on button muiButtons MuiButtonBase9.png')

"Step 40: Click on button muiButtons (MuiButtonBase10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/button_muiButtons', ['button_muiButtons_class': button_muiButtons_class_9, 'button_muiButtons_divNthChild': button_muiButtons_divNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 40-Click on button muiButtons MuiButtonBase10.png')

"Step 41: Click on p loginSteps (LoginStep3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_13, 'p_loginSteps_internalText': p_loginSteps_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 41-Click on p loginSteps LoginStep3.png')

"Step 42: Click on p loginSteps (LoginStep3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_14, 'p_loginSteps_internalText': p_loginSteps_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 42-Click on p loginSteps LoginStep3.png')

"Step 43: Click on p loginSteps (LoginStep3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_15, 'p_loginSteps_internalText': p_loginSteps_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 43-Click on p loginSteps LoginStep3.png')

"Step 44: Click on p loginSteps (LoginStep3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_truetest_user_journeys_aut/p_loginStep_1', ['p_loginSteps_class': p_loginSteps_class_16, 'p_loginSteps_internalText': p_loginSteps_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 44-Click on p loginSteps LoginStep3 - Navigate to page .png')

"Step 45: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Navigate and Verify User Journeys_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}