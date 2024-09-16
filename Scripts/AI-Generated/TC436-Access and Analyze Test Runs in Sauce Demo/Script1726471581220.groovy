import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

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

"Step 4: Click on link dashboard7 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_dashboard7'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 4-Click on link dashboard7 - Navigate to page teamproject.png')

"Step 5: Click on button dateActions (chooseDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_1', ['button_dateActions_nthChild': button_dateActions_nthChild, 'button_dateActions_internalLabel': button_dateActions_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 5-Click on button dateActions chooseDate.png')

"Step 6: Click on button dateActions (aug21)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2', ['button_dateActions_nthChild': button_dateActions_nthChild_1, 'button_dateActions_internalLabel': button_dateActions_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 6-Click on button dateActions aug21.png')

"Step 7: Click on link reports16 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports16'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 7-Click on link reports16 - Navigate to page teamproject.png')

"Step 8: Click on link testRuns16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns16'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 8-Click on link testRuns16.png')

"Step 9: Click on link testSuiteCollectionRunAllPassed -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testSuiteCollectionRunAllPassed'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 9-Click on link testSuiteCollectionRunAllPassed - Navigate to page teamprojectexecutions.png')

"Step 10: Click on link dashboard2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 10-Click on link dashboard2 - Navigate to page teamproject.png')

"Step 11: Click on link tests14 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests14'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 11-Click on link tests14 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 12: Click on link reports3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_reports3'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 12-Click on link reports3 - Navigate to page teamproject.png')

"Step 13: Click on link testRuns16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns16'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 13-Click on link testRuns16.png')

"Step 14: Click on label testResults (passedTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 14-Click on label testResults passedTestSuite.png')

"Step 15: Click on link testSuiteCollectionRetryPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testSuiteCollectionRetryPassed'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 15-Click on link testSuiteCollectionRetryPassed.png')

"Step 16: Click on label testResults (passedTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_1, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 16-Click on label testResults passedTestSuite.png')

"Step 17: Click on label testResults (passedTestSuite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_2, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 17-Click on label testResults passedTestSuite2.png')

"Step 18: Click on button testSuiteStatus (passedTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_testSuiteStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_testSuiteStatus', ['button_testSuiteStatus_trNthChild': button_testSuiteStatus_trNthChild, 'button_testSuiteStatus_internalRoleRowName': button_testSuiteStatus_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 18-Click on button testSuiteStatus passedTestSuite.png')

"Step 19: Click on button deleteAction (delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction', ['button_deleteAction_internalRoleButtonName': button_deleteAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 19-Click on button deleteAction delete.png')

"Step 20: Click on div object42"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object42'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 20-Click on div object42.png')

"Step 21: Click on button objectActions (object27)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 21-Click on button objectActions object27.png')

"Step 22: Click on button objectActions (object30)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_3', ['button_objectActions_nthChild': button_objectActions_nthChild, 'button_objectActions_internalRoleButtonName': button_objectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 22-Click on button objectActions object30.png')

"Step 23: Click on link signOut (signOut) -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_signOut"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_signOut', ['link_signOut_internalRoleLinkName': link_signOut_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 23-Click on link signOut signOut - Navigate to page organizationhome.png')

"Step 24: Click on span organizationDetails (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationDetails', ['span_organizationDetails_internalRoleButtonName': span_organizationDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 24-Click on span organizationDetails object2.png')

"Step 25: Click on link organizationLinks (myOrganization01)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_class': link_organizationLinks_class, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName, 'link_organizationLinks_organization_id': link_organizationLinks_organization_id]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 25-Click on link organizationLinks myOrganization01.png')

"Step 26: Click on span organizationDetails (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationDetails', ['span_organizationDetails_internalRoleButtonName': span_organizationDetails_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 26-Click on span organizationDetails object2.png')

"Step 27: Click on div organizationDetails (currentMomyOrganization012)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_2', ['div_organizationDetails_nthChild': div_organizationDetails_nthChild, 'div_organizationDetails_internalHasText': div_organizationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 27-Click on div organizationDetails currentMomyOrganization012.png')

"Step 28: Click on div organizationDetails (allMomyOrganization01)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_2', ['div_organizationDetails_nthChild': div_organizationDetails_nthChild_1, 'div_organizationDetails_internalHasText': div_organizationDetails_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 28-Click on div organizationDetails allMomyOrganization01.png')

"Step 29: Click on div welcomeToMyOrganization01"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_welcomeToMyOrganization01'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 29-Click on div welcomeToMyOrganization01.png')

"Step 30: Click on button objectActions (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_objectActions', ['button_objectActions_internalRoleButtonName': button_objectActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 30-Click on button objectActions object3.png')

"Step 31: Click on link signOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 31-Click on link signOut.png')

"Step 32: Click on span organizationDetails (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationDetails', ['span_organizationDetails_internalRoleButtonName': span_organizationDetails_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 32-Click on span organizationDetails object3.png')

"Step 33: Click on div organizationDetails (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_1', ['div_organizationDetails_class': div_organizationDetails_class, 'div_organizationDetails_internalHasText': div_organizationDetails_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 33-Click on div organizationDetails object11.png')

"Step 34: Click on link organizationLinks (rRegIconnect) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_1', ['link_organizationLinks_nthChild': link_organizationLinks_nthChild, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName_1, 'link_organizationLinks_project_id': link_organizationLinks_project_id, 'link_organizationLinks_team_id': link_organizationLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 34-Click on link organizationLinks rRegIconnect - Navigate to page teamproject.png')

"Step 35: Click on link reports16 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports16'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 35-Click on link reports16 - Navigate to page teamproject.png')

"Step 36: Click on link testRuns16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns16'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 36-Click on link testRuns16.png')

"Step 37: Click on label testResults (passedTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_3, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 37-Click on label testResults passedTestSuite.png')

"Step 38: Click on button deleteAction (delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction', ['button_deleteAction_internalRoleButtonName': button_deleteAction_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 38-Click on button deleteAction delete.png')

"Step 39: Click on div object42"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object42'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 39-Click on div object42.png')

"Step 40: Click on button objectActions (object27)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 40-Click on button objectActions object27.png')

"Step 41: Click on div objectDetails (object78)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 41-Click on div objectDetails object78.png')

"Step 42: Click on button objectActions (object30)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_3', ['button_objectActions_nthChild': button_objectActions_nthChild_1, 'button_objectActions_internalRoleButtonName': button_objectActions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 42-Click on button objectActions object30.png')

"Step 43: Click on link switchAccount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_switchAccount'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 43-Click on link switchAccount.png')

"Step 44: Click on button objectActions (object30)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_3', ['button_objectActions_nthChild': button_objectActions_nthChild_2, 'button_objectActions_internalRoleButtonName': button_objectActions_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 44-Click on button objectActions object30.png')

"Step 45: Click on link signOut (signOut) -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_signOut"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_signOut', ['link_signOut_internalRoleLinkName': link_signOut_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 45-Click on link signOut signOut - Navigate to page organizationhome.png')

"Step 46: Click on span organizationDetails (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationDetails', ['span_organizationDetails_internalRoleButtonName': span_organizationDetails_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 46-Click on span organizationDetails object3.png')

"Step 47: Click on div organizationDetails (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_2', ['div_organizationDetails_nthChild': div_organizationDetails_nthChild_2, 'div_organizationDetails_internalHasText': div_organizationDetails_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 47-Click on div organizationDetails object12.png')

"Step 48: Click on link organizationLinks (rRegIconnect2) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_1', ['link_organizationLinks_nthChild': link_organizationLinks_nthChild_1, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName_2, 'link_organizationLinks_project_id': link_organizationLinks_project_id_1, 'link_organizationLinks_team_id': link_organizationLinks_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 48-Click on link organizationLinks rRegIconnect2 - Navigate to page teamproject.png')

"Step 49: Click on link reports16 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports16'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 49-Click on link reports16 - Navigate to page teamproject.png')

"Step 50: Click on link testRuns16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns16'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 50-Click on link testRuns16.png')

"Step 51: Click on label testResults (passedTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_4, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 51-Click on label testResults passedTestSuite.png')

"Step 52: Click on label testResults (passedTestSuite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/label_testResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/label_testResults', ['label_testResults_for': label_testResults_for_5, 'label_testResults_internalRoleRowName': label_testResults_internalRoleRowName_5]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 52-Click on label testResults passedTestSuite2.png')

"Step 53: Click on button deleteAction (delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_deleteAction', ['button_deleteAction_internalRoleButtonName': button_deleteAction_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 53-Click on button deleteAction delete.png')

"Step 54: Click on div object42"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object42'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 54-Click on div object42.png')

"Step 55: Click on link dashboard7 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_dashboard7'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 55-Click on link dashboard7 - Navigate to page teamproject.png')

"Step 56: Click on button refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 56-Click on button refresh.png')

"Step 57: Click on button refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 57-Click on button refresh.png')

"Step 58: Click on button dateActions (chooseDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_1', ['button_dateActions_nthChild': button_dateActions_nthChild_2, 'button_dateActions_internalLabel': button_dateActions_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 58-Click on button dateActions chooseDate.png')

"Step 59: Click on button dateActions (aug21)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2', ['button_dateActions_nthChild': button_dateActions_nthChild_3, 'button_dateActions_internalLabel': button_dateActions_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 59-Click on button dateActions aug21.png')

"Step 60: Click on button refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 60-Click on button refresh.png')

"Step 61: Click on div object79"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object79'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 61-Click on div object79.png')

"Step 62: Click on button dateActions (chooseDate2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_1', ['button_dateActions_nthChild': button_dateActions_nthChild_4, 'button_dateActions_internalLabel': button_dateActions_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 62-Click on button dateActions chooseDate2.png')

"Step 63: Click on button dateActions (object31)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2', ['button_dateActions_nthChild': button_dateActions_nthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 63-Click on button dateActions object31.png')

"Step 64: Click on button chooseDate3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_chooseDate3'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 64-Click on button chooseDate3.png')

"Step 65: Click on div aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_aug19'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 65-Click on div aug19.png')

"Step 66: Click on div aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_aug19'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 66-Click on div aug19.png')

"Step 67: Click on button dateActions (object32)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 67-Click on button dateActions object32.png')

"Step 68: Click on div aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_aug19'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 68-Click on div aug19.png')

"Step 69: Click on button dateActions (aug22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 69-Click on button dateActions aug22.png')

"Step 70: Click on button dateActions (object33)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_1', ['button_dateActions_nthChild': button_dateActions_nthChild_6, 'button_dateActions_internalLabel': button_dateActions_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 70-Click on button dateActions object33.png')

"Step 71: Click on button dateActions (aug19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2', ['button_dateActions_nthChild': button_dateActions_nthChild_7, 'button_dateActions_internalLabel': button_dateActions_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 71-Click on button dateActions aug19.png')

"Step 72: Click on button dateActions (chooseDate2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_1', ['button_dateActions_nthChild': button_dateActions_nthChild_8, 'button_dateActions_internalLabel': button_dateActions_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 72-Click on button dateActions chooseDate2.png')

"Step 73: Click on button dateActions (aug24)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateActions_2', ['button_dateActions_nthChild': button_dateActions_nthChild_9, 'button_dateActions_internalLabel': button_dateActions_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 73-Click on button dateActions aug24.png')

"Step 74: Click on div testActivitiesFromTo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testActivitiesFromTo'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 74-Click on div testActivitiesFromTo.png')

"Step 75: Click on div object79 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object79'))

WebUI.takeScreenshot(reportLocation + '/TC436/Step 75-Click on div object79 - Navigate to page .png')

"Step 76: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC436-Access and Analyze Test Runs in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}