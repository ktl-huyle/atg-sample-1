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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link TestSuiteCollectionRunAllPassedEnrichFlexPlus -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestSuiteCollectionRunAllPassedEnrichFlexPlus'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on link TestSuiteCollectionRunAllPassedEnrichFlexPlus - Navigate to page teamprojectexecutions.png')

"Step 5: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Dashboard_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on link Dashboard - Navigate to page teamproject.png')

"Step 6: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests2_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 7: Click on link testDesignNavigation (Reports) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testDesignNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/link_testDesignNavigation', ['link_testDesignNavigation_internalRoleLinkName': link_testDesignNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on link testDesignNavigation Reports - Navigate to page teamproject.png')

"Step 8: Click on link TestRuns5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns5_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on link TestRuns5.png')

"Step 9: Click on label testSuiteStatus (Passed985TestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus', ['label_testSuiteStatus_for': label_testSuiteStatus_for, 'label_testSuiteStatus_internalRoleRowName': label_testSuiteStatus_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Click on label testSuiteStatus Passed985TestSuite.png')

"Step 10: Click on link TestSuiteCollectionRetryPassedInvestStarter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestSuiteCollectionRetryPassedInvestStarter'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 10-Click on link TestSuiteCollectionRetryPassedInvestStarter.png')

"Step 11: Click on label testSuiteStatus (Passed985TestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus', ['label_testSuiteStatus_for': label_testSuiteStatus_for_1, 'label_testSuiteStatus_internalRoleRowName': label_testSuiteStatus_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 11-Click on label testSuiteStatus Passed985TestSuite.png')

"Step 12: Click on label testSuiteStatus (Passed986TestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus', ['label_testSuiteStatus_for': label_testSuiteStatus_for_2, 'label_testSuiteStatus_internalRoleRowName': label_testSuiteStatus_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 12-Click on label testSuiteStatus Passed986TestSuite.png')

"Step 13: Click on button Passed985TestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Passed985TestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 13-Click on button Passed985TestSuite.png')

"Step 14: Click on button deleteAction (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_delete_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_delete_1', ['button_deleteAction_internalRoleButtonName': button_deleteAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 14-Click on button deleteAction Delete.png')

"Step 15: Click on button DeleteDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_DeleteDialog'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 15-Click on button DeleteDialog.png')

"Step 16: Click on button alertClose (AlertClose3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 16-Click on button alertClose AlertClose3.png')

"Step 17: Click on button userActions (A)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_userActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_userActions', ['button_userActions_nthChild': button_userActions_nthChild, 'button_userActions_internalRoleButtonName': button_userActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 17-Click on button userActions A.png')

"Step 18: Click on link signOut (SignOut) -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_signOut"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_signOut', ['link_signOut_internalRoleLinkName': link_signOut_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 18-Click on link signOut SignOut - Navigate to page organizationhome.png')

"Step 19: Click on span organizationNames (MyOrganization01)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames', ['span_organizationNames_internalRoleButtonName': span_organizationNames_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 19-Click on span organizationNames MyOrganization01.png')

"Step 20: Click on link organizationLinks (MyOrganization01)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_1', ['link_organizationLinks_class': link_organizationLinks_class, 'link_organizationLinks_organization_id': link_organizationLinks_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 20-Click on link organizationLinks MyOrganization01.png')

"Step 21: Click on span organizationNames (MyOrganization01)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames', ['span_organizationNames_internalRoleButtonName': span_organizationNames_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 21-Click on span organizationNames MyOrganization01.png')

"Step 22: Click on div organizationStatus (CurrentMO)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationStatus', ['div_organizationStatus_nthChild': div_organizationStatus_nthChild, 'div_organizationStatus_internalHasText': div_organizationStatus_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 22-Click on div organizationStatus CurrentMO.png')

"Step 23: Click on div organizationStatus (AllMO)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationStatus', ['div_organizationStatus_nthChild': div_organizationStatus_nthChild_1, 'div_organizationStatus_internalHasText': div_organizationStatus_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 23-Click on div organizationStatus AllMO.png')

"Step 24: Click on div WelcomeToMyOrganization01"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_WelcomeToMyOrganization01'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 24-Click on div WelcomeToMyOrganization01.png')

"Step 25: Click on button userActions (RV)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_userActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_userActions', ['button_userActions_internalRoleButtonName': button_userActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 25-Click on button userActions RV.png')

"Step 26: Click on link SignOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 26-Click on link SignOut.png')

"Step 27: Click on span organizationNames (QA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames', ['span_organizationNames_internalRoleButtonName': span_organizationNames_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 27-Click on span organizationNames QA.png')

"Step 28: Click on div CurrentQ"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_CurrentQ'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 28-Click on div CurrentQ.png')

"Step 29: Click on link RREG iConnect -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_RREG_iConnect'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 29-Click on link RREG iConnect - Navigate to page teamproject.png')

"Step 30: Click on link Reports4 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 30-Click on link Reports4 - Navigate to page teamproject.png')

"Step 31: Click on link TestRuns5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns5_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 31-Click on link TestRuns5.png')

"Step 32: Click on label testSuiteStatus (Passed985TestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus', ['label_testSuiteStatus_for': label_testSuiteStatus_for_3, 'label_testSuiteStatus_internalRoleRowName': label_testSuiteStatus_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 32-Click on label testSuiteStatus Passed985TestSuite.png')

"Step 33: Click on button deleteAction (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_delete_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_delete_1', ['button_deleteAction_internalRoleButtonName': button_deleteAction_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 33-Click on button deleteAction Delete.png')

"Step 34: Click on button DeleteDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_DeleteDialog'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 34-Click on button DeleteDialog.png')

"Step 35: Click on button alertClose (AlertClose3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 35-Click on button alertClose AlertClose3.png')

"Step 36: Click on div App"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_App'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 36-Click on div App.png')

"Step 37: Click on button userActions (A)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_userActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_userActions', ['button_userActions_nthChild': button_userActions_nthChild_1, 'button_userActions_internalRoleButtonName': button_userActions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 37-Click on button userActions A.png')

"Step 38: Click on link SwitchAccount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_SwitchAccount'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 38-Click on link SwitchAccount.png')

"Step 39: Click on button userActions (A)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_userActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_userActions', ['button_userActions_nthChild': button_userActions_nthChild_2, 'button_userActions_internalRoleButtonName': button_userActions_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 39-Click on button userActions A.png')

"Step 40: Click on link signOut (SignOut) -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_signOut"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_signOut', ['link_signOut_internalRoleLinkName': link_signOut_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 40-Click on link signOut SignOut - Navigate to page organizationhome.png')

"Step 41: Click on span organizationNames (QA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames', ['span_organizationNames_internalRoleButtonName': span_organizationNames_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 41-Click on span organizationNames QA.png')

"Step 42: Click on div organizationStatus (CurrentQ2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationStatus', ['div_organizationStatus_nthChild': div_organizationStatus_nthChild_2, 'div_organizationStatus_internalHasText': div_organizationStatus_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 42-Click on div organizationStatus CurrentQ2.png')

"Step 43: Click on link RREG iConnect2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_RREG_iConnect2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 43-Click on link RREG iConnect2 - Navigate to page teamproject.png')

"Step 44: Click on link Reports4 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 44-Click on link Reports4 - Navigate to page teamproject.png')

"Step 45: Click on link TestRuns5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns5_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 45-Click on link TestRuns5.png')

"Step 46: Click on label testSuiteStatus (Passed985TestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus', ['label_testSuiteStatus_for': label_testSuiteStatus_for_4, 'label_testSuiteStatus_internalRoleRowName': label_testSuiteStatus_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 46-Click on label testSuiteStatus Passed985TestSuite.png')

"Step 47: Click on label testSuiteStatus (Passed986TestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteStatus', ['label_testSuiteStatus_for': label_testSuiteStatus_for_5, 'label_testSuiteStatus_internalRoleRowName': label_testSuiteStatus_internalRoleRowName_5]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 47-Click on label testSuiteStatus Passed986TestSuite.png')

"Step 48: Click on button deleteAction (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_delete_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_delete_1', ['button_deleteAction_internalRoleButtonName': button_deleteAction_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 48-Click on button deleteAction Delete.png')

"Step 49: Click on button DeleteDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_DeleteDialog'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 49-Click on button DeleteDialog.png')

"Step 50: Click on link Dashboard3 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard3_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 50-Click on link Dashboard3 - Navigate to page teamproject.png')

"Step 51: Click on button Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 51-Click on button Refresh.png')

"Step 52: Click on button Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 52-Click on button Refresh.png')

"Step 53: Click on button dateSelection (ChooseDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 53-Click on button dateSelection ChooseDate.png')

"Step 54: Click on button augustDates (Aug21)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_augustDates"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_augustDates', ['button_augustDates_nthChild': button_augustDates_nthChild, 'button_augustDates_internalLabel': button_augustDates_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 54-Click on button augustDates Aug21.png')

"Step 55: Click on button Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 55-Click on button Refresh.png')

"Step 56: Click on div NewFailures"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 56-Click on div NewFailures.png')

"Step 57: Click on button dateSelection (ChooseDate2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_1, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 57-Click on button dateSelection ChooseDate2.png')

"Step 58: Click on button augustDates (Aug212)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_augustDates"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_augustDates', ['button_augustDates_nthChild': button_augustDates_nthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 58-Click on button augustDates Aug212.png')

"Step 59: Click on button ChooseDate3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ChooseDate3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 59-Click on button ChooseDate3.png')

"Step 60: Click on div Aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Aug19'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 60-Click on div Aug19.png')

"Step 61: Click on div Aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Aug19'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 61-Click on div Aug19.png')

"Step 62: Click on button augustDates (Aug213)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_augustDates'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 62-Click on button augustDates Aug213.png')

"Step 63: Click on div Aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Aug19'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 63-Click on div Aug19.png')

"Step 64: Click on button augustDates (Aug22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_augustDates'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 64-Click on button augustDates Aug22.png')

"Step 65: Click on button dateSelection (ChooseDate4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_2, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 65-Click on button dateSelection ChooseDate4.png')

"Step 66: Click on button augustDates (Aug19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_augustDates"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_augustDates', ['button_augustDates_nthChild': button_augustDates_nthChild_2, 'button_augustDates_internalLabel': button_augustDates_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 66-Click on button augustDates Aug19.png')

"Step 67: Click on button dateSelection (ChooseDate2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_3, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 67-Click on button dateSelection ChooseDate2.png')

"Step 68: Click on button augustDates (August24)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_augustDates"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_augustDates', ['button_augustDates_nthChild': button_augustDates_nthChild_3, 'button_augustDates_internalLabel': button_augustDates_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 68-Click on button augustDates August24.png')

"Step 69: Click on div TestActivitiesFromTo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestActivitiesFromTo'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 69-Click on div TestActivitiesFromTo.png')

"Step 70: Click on div NewFailures -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 70-Click on div NewFailures - Navigate to page .png')

"Step 71: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Delete Test Suites and Verify Organization Status_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}