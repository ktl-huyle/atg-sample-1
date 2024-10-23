import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 3: Navigate to /team/*/project/*/executions"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions")

"Step 4: Click on link Dashboard -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 4-Click on link Dashboard - Navigate to page teamproject.png')

"Step 5: Click on button dateSelection (ChooseDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection', ['button_dateSelection_nthChild': button_dateSelection_nthChild, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 5-Click on button dateSelection ChooseDate.png')

"Step 6: Click on button dateSelection (Aug21)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_1, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 6-Click on button dateSelection Aug21.png')

"Step 7: Click on link Reports7 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports7'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 7-Click on link Reports7 - Navigate to page teamprojectoverview.png')

"Step 8: Click on link TestRuns14 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns14'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 8-Click on link TestRuns14 - Navigate to page teamprojectexecutions.png')

"Step 9: Click on link TestSuiteRun -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestSuiteRun'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 9-Click on link TestSuiteRun - Navigate to page teamprojectexecutions.png')

"Step 10: Click on link Dashboard -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 10-Click on link Dashboard - Navigate to page teamproject.png')

"Step 11: Click on link Tests6 -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests6'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 11-Click on link Tests6 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 12: Click on link Reports3 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 12-Click on link Reports3 - Navigate to page teamprojectoverview.png')

"Step 13: Click on link TestRuns14 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns14'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 13-Click on link TestRuns14 - Navigate to page teamprojectexecutions.png')

"Step 14: Click on label executionStatus (PassedTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus', ['label_executionStatus_for': label_executionStatus_for, 'label_executionStatus_internalRoleRowName': label_executionStatus_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 14-Click on label executionStatus PassedTestSuite.png')

"Step 15: Click on link TestSuiteRetry"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestSuiteRetry'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 15-Click on link TestSuiteRetry.png')

"Step 16: Click on label executionStatus (PassedTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus', ['label_executionStatus_for': label_executionStatus_for_1, 'label_executionStatus_internalRoleRowName': label_executionStatus_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 16-Click on label executionStatus PassedTestSuite.png')

"Step 17: Click on label executionStatus (PassedTestSuite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus', ['label_executionStatus_for': label_executionStatus_for_2, 'label_executionStatus_internalRoleRowName': label_executionStatus_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 17-Click on label executionStatus PassedTestSuite2.png')

"Step 18: Click on button testSuiteActions (PassedTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testSuiteActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testSuiteActions', ['button_testSuiteActions_trNthChild': button_testSuiteActions_trNthChild, 'button_testSuiteActions_internalRoleRowName': button_testSuiteActions_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 18-Click on button testSuiteActions PassedTestSuite.png')

"Step 19: Click on button executionDeletion (deleteExecution3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_executionDeletion"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_executionDeletion', ['button_executionDeletion_internalRoleButtonName': button_executionDeletion_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 19-Click on button executionDeletion deleteExecution3.png')

"Step 20: Click on button deleteExecution2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_deleteExecution2'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 20-Click on button deleteExecution2.png')

"Step 21: Click on link SignOut -> Navigate to page '/organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 21-Click on link SignOut - Navigate to page organizationhome.png')

"Step 22: Click on span organizationSelect (MyOrganization01)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelect', ['span_organizationSelect_internalRoleButtonName': span_organizationSelect_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 22-Click on span organizationSelect MyOrganization01.png')

"Step 23: Click on link organizationLinks (MyOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_class': link_organizationLinks_class, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 23-Click on link organizationLinks MyOrganization.png')

"Step 24: Click on span organizationSelect (MyOrganization01)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelect', ['span_organizationSelect_internalRoleButtonName': span_organizationSelect_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 24-Click on span organizationSelect MyOrganization01.png')

"Step 25: Click on div organizationDetails (CurrentMO)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_1', ['div_organizationDetails_nthChild': div_organizationDetails_nthChild, 'div_organizationDetails_internalHasText': div_organizationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 25-Click on div organizationDetails CurrentMO.png')

"Step 26: Click on div organizationDetails (AllMO)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_1', ['div_organizationDetails_nthChild': div_organizationDetails_nthChild_1, 'div_organizationDetails_internalHasText': div_organizationDetails_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 26-Click on div organizationDetails AllMO.png')

"Step 27: Click on div WelcomeToMyOrganization01"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_WelcomeToMyOrganization01'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 27-Click on div WelcomeToMyOrganization01.png')

"Step 28: Click on button userButtons (RV)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_userButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_userButtons', ['button_userButtons_internalRoleButtonName': button_userButtons_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 28-Click on button userButtons RV.png')

"Step 29: Click on link SignOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 29-Click on link SignOut.png')

"Step 30: Click on span organizationSelect (QA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelect', ['span_organizationSelect_internalRoleButtonName': span_organizationSelect_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 30-Click on span organizationSelect QA.png')

"Step 31: Click on div currentOrganizationDetails (CurrentQ)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails', ['div_currentOrganizationDetails_class': div_currentOrganizationDetails_class, 'div_currentOrganizationDetails_internalHasText': div_currentOrganizationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 31-Click on div currentOrganizationDetails CurrentQ.png')

"Step 32: Click on link organizationLinks (RREG iConnect) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2', ['link_organizationLinks_nthChild': link_organizationLinks_nthChild, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 32-Click on link organizationLinks RREG iConnect - Navigate to page teamproject.png')

"Step 33: Click on link Reports7 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports7'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 33-Click on link Reports7 - Navigate to page teamprojectoverview.png')

"Step 34: Click on link TestRuns14 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns14'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 34-Click on link TestRuns14 - Navigate to page teamprojectexecutions.png')

"Step 35: Click on label executionStatus (PassedTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus', ['label_executionStatus_for': label_executionStatus_for_3, 'label_executionStatus_internalRoleRowName': label_executionStatus_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 35-Click on label executionStatus PassedTestSuite.png')

"Step 36: Click on button executionDeletion (deleteExecution3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_executionDeletion"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_executionDeletion', ['button_executionDeletion_internalRoleButtonName': button_executionDeletion_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 36-Click on button executionDeletion deleteExecution3.png')

"Step 37: Click on button deleteExecution2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_deleteExecution2'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 37-Click on button deleteExecution2.png')

"Step 38: Click on link SignOut -> Navigate to page '/organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_SignOut'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 38-Click on link SignOut - Navigate to page organizationhome.png')

"Step 39: Click on span organizationSelect (QA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelect', ['span_organizationSelect_internalRoleButtonName': span_organizationSelect_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 39-Click on span organizationSelect QA.png')

"Step 40: Click on div organizationDetails (CurrentQ2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_organizationDetails_1', ['div_organizationDetails_nthChild': div_organizationDetails_nthChild_2, 'div_organizationDetails_internalHasText': div_organizationDetails_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 40-Click on div organizationDetails CurrentQ2.png')

"Step 41: Click on link organizationLinks (RREG iConnect2) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2', ['link_organizationLinks_nthChild': link_organizationLinks_nthChild_1, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 41-Click on link organizationLinks RREG iConnect2 - Navigate to page teamproject.png')

"Step 42: Click on link Reports7 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports7'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 42-Click on link Reports7 - Navigate to page teamprojectoverview.png')

"Step 43: Click on link TestRuns14 -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns14'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 43-Click on link TestRuns14 - Navigate to page teamprojectexecutions.png')

"Step 44: Click on label executionStatus (PassedTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus', ['label_executionStatus_for': label_executionStatus_for_4, 'label_executionStatus_internalRoleRowName': label_executionStatus_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 44-Click on label executionStatus PassedTestSuite.png')

"Step 45: Click on label executionStatus (PassedTestSuite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_executionStatus', ['label_executionStatus_for': label_executionStatus_for_5, 'label_executionStatus_internalRoleRowName': label_executionStatus_internalRoleRowName_5]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 45-Click on label executionStatus PassedTestSuite2.png')

"Step 46: Click on button executionDeletion (deleteExecution3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_executionDeletion"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_executionDeletion', ['button_executionDeletion_internalRoleButtonName': button_executionDeletion_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 46-Click on button executionDeletion deleteExecution3.png')

"Step 47: Click on button deleteExecution2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_deleteExecution2'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 47-Click on button deleteExecution2.png')

"Step 48: Click on link Dashboard -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 48-Click on link Dashboard - Navigate to page teamproject.png')

"Step 49: Click on button Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 49-Click on button Refresh.png')

"Step 50: Click on button Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 50-Click on button Refresh.png')

"Step 51: Click on button dateSelection (ChooseDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection', ['button_dateSelection_nthChild': button_dateSelection_nthChild_2, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 51-Click on button dateSelection ChooseDate.png')

"Step 52: Click on button dateSelection (Aug21)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_3, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 52-Click on button dateSelection Aug21.png')

"Step 53: Click on button Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 53-Click on button Refresh.png')

"Step 54: Click on div NewFailures"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 54-Click on div NewFailures.png')

"Step 55: Click on button dateSelection (ChooseDate2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection', ['button_dateSelection_nthChild': button_dateSelection_nthChild_4, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 55-Click on button dateSelection ChooseDate2.png')

"Step 56: Click on button dateSelection (Aug212)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 56-Click on button dateSelection Aug212.png')

"Step 57: Click on button ChooseDate3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ChooseDate3'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 57-Click on button ChooseDate3.png')

"Step 58: Click on div Aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Aug19'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 58-Click on div Aug19.png')

"Step 59: Click on div Aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Aug19'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 59-Click on div Aug19.png')

"Step 60: Click on button dateSelection (Aug213)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 60-Click on button dateSelection Aug213.png')

"Step 61: Click on div Aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Aug19'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 61-Click on div Aug19.png')

"Step 62: Click on button dateSelection (Aug22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 62-Click on button dateSelection Aug22.png')

"Step 63: Click on button dateSelection (ChooseDate4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection', ['button_dateSelection_nthChild': button_dateSelection_nthChild_6, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 63-Click on button dateSelection ChooseDate4.png')

"Step 64: Click on button dateSelection (Aug19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_7, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 64-Click on button dateSelection Aug19.png')

"Step 65: Click on button dateSelection (ChooseDate2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection', ['button_dateSelection_nthChild': button_dateSelection_nthChild_8, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 65-Click on button dateSelection ChooseDate2.png')

"Step 66: Click on button dateSelection (August24)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection_1', ['button_dateSelection_nthChild': button_dateSelection_nthChild_9, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 66-Click on button dateSelection August24.png')

"Step 67: Click on div TestActivitiesFromTo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestActivitiesFromTo'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 67-Click on div TestActivitiesFromTo.png')

"Step 68: Click on div NewFailures -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures'))

WebUI.takeScreenshot(reportLocation + '/TC202/Step 68-Click on div NewFailures - Navigate to page .png')

"Step 69: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC202-Manage Test Execution and Reporting Activities_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}