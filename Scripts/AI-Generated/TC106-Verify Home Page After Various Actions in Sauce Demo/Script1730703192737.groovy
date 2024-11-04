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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link Dashboard7 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard7'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 4-Click on link Dashboard7 - Navigate to page teamproject.png')

"Step 5: Click on button dateSelection (ChooseDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 5-Click on button dateSelection ChooseDate.png')

"Step 6: Click on button dateSelection (Date)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2', ['button_dateSelection_nthChild': button_dateSelection_nthChild_1, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 6-Click on button dateSelection Date.png')

"Step 7: Click on link Reports15 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports15'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 7-Click on link Reports15 - Navigate to page teamproject.png')

"Step 8: Click on link TestRuns15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns15'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 8-Click on link TestRuns15.png')

"Step 9: Click on link TestSuiteRun -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestSuiteRun'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 9-Click on link TestSuiteRun - Navigate to page teamprojectexecutions.png')

"Step 10: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Dashboard_1'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 10-Click on link Dashboard - Navigate to page teamproject.png')

"Step 11: Click on link Tests12 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests12'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 11-Click on link Tests12 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 12: Click on link Reports3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 12-Click on link Reports3 - Navigate to page teamproject.png')

"Step 13: Click on link TestRuns15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns15'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 13-Click on link TestRuns15.png')

"Step 14: Click on label testSuiteResults (TestSuitePassed985)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults', ['label_testSuiteResults_for': label_testSuiteResults_for, 'label_testSuiteResults_internalRoleRowName': label_testSuiteResults_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 14-Click on label testSuiteResults TestSuitePassed985.png')

"Step 15: Click on link TestSuiteCollectionRetryPassedInvestStarter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestSuiteCollectionRetryPassedInvestStarter'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 15-Click on link TestSuiteCollectionRetryPassedInvestStarter.png')

"Step 16: Click on label testSuiteResults (TestSuitePassed985)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults', ['label_testSuiteResults_for': label_testSuiteResults_for_1, 'label_testSuiteResults_internalRoleRowName': label_testSuiteResults_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 16-Click on label testSuiteResults TestSuitePassed985.png')

"Step 17: Click on label testSuiteResults (TestSuitePassed986)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults', ['label_testSuiteResults_for': label_testSuiteResults_for_2, 'label_testSuiteResults_internalRoleRowName': label_testSuiteResults_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 17-Click on label testSuiteResults TestSuitePassed986.png')

"Step 18: Click on button testSuiteResults (TestSuitePassed985)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_testSuiteResults', ['button_testSuiteResults_trNthChild': button_testSuiteResults_trNthChild, 'button_testSuiteResults_internalRoleRowName': button_testSuiteResults_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 18-Click on button testSuiteResults TestSuitePassed985.png')

"Step 19: Click on button deleteActions (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_deleteActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_deleteActions', ['button_deleteActions_internalRoleButtonName': button_deleteActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 19-Click on button deleteActions Delete.png')

"Step 20: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 20-Click on button Delete2.png')

"Step 21: Click on button closeActions (CloseButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 21-Click on button closeActions CloseButton2.png')

"Step 22: Click on button userActions (Aishah)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_userActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_userActions', ['button_userActions_nthChild': button_userActions_nthChild, 'button_userActions_internalRoleButtonName': button_userActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 22-Click on button userActions Aishah.png')

"Step 23: Click on link signOut (SignOut) -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_signOut"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_signOut', ['link_signOut_internalRoleLinkName': link_signOut_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 23-Click on link signOut SignOut - Navigate to page organizationhome.png')

"Step 24: Click on span organizationNames (MyOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames', ['span_organizationNames_internalRoleButtonName': span_organizationNames_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 24-Click on span organizationNames MyOrganization.png')

"Step 25: Click on link myOrganizations (MyOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_myOrganizations"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_myOrganizations', ['link_myOrganizations_class': link_myOrganizations_class, 'link_myOrganizations_internalRoleLinkName': link_myOrganizations_internalRoleLinkName, 'link_myOrganizations_organization_id': link_myOrganizations_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 25-Click on link myOrganizations MyOrganization.png')

"Step 26: Click on span organizationNames (MyOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames', ['span_organizationNames_internalRoleButtonName': span_organizationNames_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 26-Click on span organizationNames MyOrganization.png')

"Step 27: Click on div organizationDetails (CurrentMO)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails', ['div_organizationDetails_nthChild': div_organizationDetails_nthChild, 'div_organizationDetails_internalHasText': div_organizationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 27-Click on div organizationDetails CurrentMO.png')

"Step 28: Click on div organizationDetails (AllMO)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails', ['div_organizationDetails_nthChild': div_organizationDetails_nthChild_1, 'div_organizationDetails_internalHasText': div_organizationDetails_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 28-Click on div organizationDetails AllMO.png')

"Step 29: Click on div WelcomeMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_WelcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 29-Click on div WelcomeMessage.png')

"Step 30: Click on button userProfile (RubathrahVeerakkumaran)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_userProfile"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_userProfile', ['button_userProfile_internalRoleButtonName': button_userProfile_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 30-Click on button userProfile RubathrahVeerakkumaran.png')

"Step 31: Click on link SignOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 31-Click on link SignOut.png')

"Step 32: Click on span organizationNames (QA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames', ['span_organizationNames_internalRoleButtonName': span_organizationNames_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 32-Click on span organizationNames QA.png')

"Step 33: Click on div currentOrganizationDetails (CurrentQQA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails', ['div_currentOrganizationDetails_class': div_currentOrganizationDetails_class, 'div_currentOrganizationDetails_internalHasText': div_currentOrganizationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 33-Click on div currentOrganizationDetails CurrentQQA.png')

"Step 34: Click on link agentSettings (RREG iConnect) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_agentSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_agentSettings', ['link_agentSettings_nthChild': link_agentSettings_nthChild, 'link_agentSettings_internalRoleLinkName': link_agentSettings_internalRoleLinkName, 'link_agentSettings_team_id': link_agentSettings_team_id, 'link_agentSettings_project_id': link_agentSettings_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 34-Click on link agentSettings RREG iConnect - Navigate to page teamproject.png')

"Step 35: Click on link Reports15 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports15'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 35-Click on link Reports15 - Navigate to page teamproject.png')

"Step 36: Click on link TestRuns15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns15'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 36-Click on link TestRuns15.png')

"Step 37: Click on label testSuiteResults (TestSuitePassed985)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults', ['label_testSuiteResults_for': label_testSuiteResults_for_3, 'label_testSuiteResults_internalRoleRowName': label_testSuiteResults_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 37-Click on label testSuiteResults TestSuitePassed985.png')

"Step 38: Click on button deleteActions (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_deleteActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_deleteActions', ['button_deleteActions_internalRoleButtonName': button_deleteActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 38-Click on button deleteActions Delete.png')

"Step 39: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 39-Click on button Delete2.png')

"Step 40: Click on button closeActions (CloseButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 40-Click on button closeActions CloseButton2.png')

"Step 41: Click on div successMessages (AppContainer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_successMessages'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 41-Click on div successMessages AppContainer.png')

"Step 42: Click on button userActions (Aishah)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_userActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_userActions', ['button_userActions_nthChild': button_userActions_nthChild_1, 'button_userActions_internalRoleButtonName': button_userActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 42-Click on button userActions Aishah.png')

"Step 43: Click on link SwitchAccount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_SwitchAccount'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 43-Click on link SwitchAccount.png')

"Step 44: Click on button userActions (Aishah)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_userActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_userActions', ['button_userActions_nthChild': button_userActions_nthChild_2, 'button_userActions_internalRoleButtonName': button_userActions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 44-Click on button userActions Aishah.png')

"Step 45: Click on link signOut (SignOut) -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_signOut"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_signOut', ['link_signOut_internalRoleLinkName': link_signOut_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 45-Click on link signOut SignOut - Navigate to page organizationhome.png')

"Step 46: Click on span organizationNames (QA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationNames', ['span_organizationNames_internalRoleButtonName': span_organizationNames_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 46-Click on span organizationNames QA.png')

"Step 47: Click on div organizationDetails (CurrentQQA2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails', ['div_organizationDetails_nthChild': div_organizationDetails_nthChild_2, 'div_organizationDetails_internalHasText': div_organizationDetails_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 47-Click on div organizationDetails CurrentQQA2.png')

"Step 48: Click on link agentSettings (RREG iConnect2) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_agentSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_agentSettings', ['link_agentSettings_nthChild': link_agentSettings_nthChild_1, 'link_agentSettings_internalRoleLinkName': link_agentSettings_internalRoleLinkName_1, 'link_agentSettings_team_id': link_agentSettings_team_id_1, 'link_agentSettings_project_id': link_agentSettings_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 48-Click on link agentSettings RREG iConnect2 - Navigate to page teamproject.png')

"Step 49: Click on link Reports15 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports15'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 49-Click on link Reports15 - Navigate to page teamproject.png')

"Step 50: Click on link TestRuns15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns15'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 50-Click on link TestRuns15.png')

"Step 51: Click on label testSuiteResults (TestSuitePassed985)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults', ['label_testSuiteResults_for': label_testSuiteResults_for_4, 'label_testSuiteResults_internalRoleRowName': label_testSuiteResults_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 51-Click on label testSuiteResults TestSuitePassed985.png')

"Step 52: Click on label testSuiteResults (TestSuitePassed986)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testSuiteResults', ['label_testSuiteResults_for': label_testSuiteResults_for_5, 'label_testSuiteResults_internalRoleRowName': label_testSuiteResults_internalRoleRowName_5]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 52-Click on label testSuiteResults TestSuitePassed986.png')

"Step 53: Click on button deleteActions (Delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_deleteActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_deleteActions', ['button_deleteActions_internalRoleButtonName': button_deleteActions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 53-Click on button deleteActions Delete.png')

"Step 54: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 54-Click on button Delete2.png')

"Step 55: Click on link Dashboard7 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard7'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 55-Click on link Dashboard7 - Navigate to page teamproject.png')

"Step 56: Click on button Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 56-Click on button Refresh.png')

"Step 57: Click on button Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 57-Click on button Refresh.png')

"Step 58: Click on button dateSelection (ChooseDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_2, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 58-Click on button dateSelection ChooseDate.png')

"Step 59: Click on button dateSelection (Date)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2', ['button_dateSelection_nthChild': button_dateSelection_nthChild_3, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 59-Click on button dateSelection Date.png')

"Step 60: Click on button Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 60-Click on button Refresh.png')

"Step 61: Click on div NewFailures2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures2'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 61-Click on div NewFailures2.png')

"Step 62: Click on button dateSelection (ChooseDate2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_4, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 62-Click on button dateSelection ChooseDate2.png')

"Step 63: Click on button dateSelection (Aug21)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2', ['button_dateSelection_nthChild': button_dateSelection_nthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 63-Click on button dateSelection Aug21.png')

"Step 64: Click on button ChooseDate3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ChooseDate3'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 64-Click on button ChooseDate3.png')

"Step 65: Click on div Aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Aug19'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 65-Click on div Aug19.png')

"Step 66: Click on div Aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Aug19'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 66-Click on div Aug19.png')

"Step 67: Click on button dateSelection (Aug212)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 67-Click on button dateSelection Aug212.png')

"Step 68: Click on div Aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Aug19'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 68-Click on div Aug19.png')

"Step 69: Click on button dateSelection (Aug22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 69-Click on button dateSelection Aug22.png')

"Step 70: Click on button dateSelection (ChooseDate4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_6, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 70-Click on button dateSelection ChooseDate4.png')

"Step 71: Click on button dateSelection (Aug19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2', ['button_dateSelection_nthChild': button_dateSelection_nthChild_7, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 71-Click on button dateSelection Aug19.png')

"Step 72: Click on button dateSelection (ChooseDate2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_8, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 72-Click on button dateSelection ChooseDate2.png')

"Step 73: Click on button dateSelection (Aug24)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_2', ['button_dateSelection_nthChild': button_dateSelection_nthChild_9, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 73-Click on button dateSelection Aug24.png')

"Step 74: Click on div TestActivities"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestActivities'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 74-Click on div TestActivities.png')

"Step 75: Click on div NewFailures2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures2'))

WebUI.takeScreenshot(reportLocation + '/TC106/Step 75-Click on div NewFailures2 - Navigate to page .png')

"Step 76: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC106-Verify Home Page After Various Actions in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}