import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.configureTestSuiteAndRun

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

"Step 4: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 4-Click on i object.png')

"Step 5: Click on header testRunHeaders (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 5-Click on header testRunHeaders UntitledTestRun3.png')

"Step 6: Click on i dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject', ['i_dynamicObject_internalHasText': i_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 6-Click on i dynamicObject object2.png')

"Step 7: Click on i dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject', ['i_dynamicObject_internalHasText': i_dynamicObject_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 7-Click on i dynamicObject object2.png')

"Step 8: Click on button SessionsTab2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab2_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 8-Click on button SessionsTab2.png')

"Step 9: Click on button FailedTestResultsTab2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResultsTab2'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 9-Click on button FailedTestResultsTab2.png')

"Step 10: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 10-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 11: Click on link testSuites (TestSuites) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName, 'link_testSuites_team_id': link_testSuites_team_id, 'link_testSuites_project_id': link_testSuites_project_id, 'link_testSuites_test_suites_id': link_testSuites_test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 11-Click on link testSuites TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 12: Click on link testSuiteDetails (AndroidTestSuite) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteDetails', ['link_testSuiteDetails_internalRoleRowName': link_testSuiteDetails_internalRoleRowName, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id, 'link_testSuiteDetails_executions_id': link_testSuiteDetails_executions_id, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 12-Click on link testSuiteDetails AndroidTestSuite - Navigate to page teamprojectexecutions.png')

"Step 13: Click on link TestResults6 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults6_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 13-Click on link TestResults6 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 14: Click on span PassedTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_PassedTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 14-Click on span PassedTestCase.png')

"Step 15: Click on div InfoSidebarCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_InfoSidebarCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 15-Click on div InfoSidebarCloseButton.png')

"Step 16: Click on link Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 16-Click on link Settings.png')

"Step 17: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_0, Integer.valueOf(index_0))

"Step 18: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 18-Click on button Settings.png')

"Step 19: Click on div dynamicObject (MuiBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 19-Click on div dynamicObject MuiBackdrop.png')

"Step 20: Click on link testLinks (Integrations)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testLinks', ['link_testLinks_nthChild': link_testLinks_nthChild, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 20-Click on link testLinks Integrations.png')

"Step 21: Click on div integrationTools (CodelessAutomationTool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class, 'div_integrationTools_internalRoleTreeitemName': div_integrationTools_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 21-Click on div integrationTools CodelessAutomationTool.png')

"Step 22: Click on div integrationTools (ExpandMoreIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 22-Click on div integrationTools ExpandMoreIcon.png')

"Step 23: Click on div integrationTools (ALMTestManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class_2, 'div_integrationTools_internalRoleTreeitemName': div_integrationTools_internalRoleTreeitemName_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 23-Click on div integrationTools ALMTestManagement.png')

"Step 24: Click on div integrationTools (ExpandMoreIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 24-Click on div integrationTools ExpandMoreIcon2.png')

"Step 25: Click on div integrationTools (CICDPipeline)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class_4, 'div_integrationTools_internalRoleTreeitemName': div_integrationTools_internalRoleTreeitemName_2]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 25-Click on div integrationTools CICDPipeline.png')

"Step 26: Click on div integrationTools (ExpandMoreIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_integrationTools', ['div_integrationTools_class': div_integrationTools_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 26-Click on div integrationTools ExpandMoreIcon3.png')

"Step 27: Click on link testLinks (CustomFields)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testLinks', ['link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 27-Click on link testLinks CustomFields.png')

"Step 28: Click on link testLinks (TestCloudTunnels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testLinks', ['link_testLinks_nthChild': link_testLinks_nthChild_1, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 28-Click on link testLinks TestCloudTunnels.png')

"Step 29: Click on link testLinks (CustomFields)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testLinks', ['link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 29-Click on link testLinks CustomFields.png')

"Step 30: Click on link testLinks (Integrations)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testLinks', ['link_testLinks_nthChild': link_testLinks_nthChild_2, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 30-Click on link testLinks Integrations.png')

"Step 31: Click on div dynamicObject (GPTManualTestGenerator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 31-Click on div dynamicObject GPTManualTestGenerator.png')

"Step 32: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object2_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 32-Click on div object2.png')

"Step 33: Click on link testLinks (TestEnvironments2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testLinks', ['link_testLinks_nthChild': link_testLinks_nthChild_3, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 33-Click on link testLinks TestEnvironments2.png')

"Step 34: Click on link testLinks (ScriptRepositories3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testLinks', ['link_testLinks_nthChild': link_testLinks_nthChild_4, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 34-Click on link testLinks ScriptRepositories3.png')

"Step 35: Click on link testLinks (General)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testLinks', ['link_testLinks_nthChild': link_testLinks_nthChild_5, 'link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 35-Click on link testLinks General.png')

"Step 36: Click on link Tests5 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests5'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 36-Click on link Tests5 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 37: Click on link Executions5 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions5_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 37-Click on link Executions5 - Navigate to page teamproject.png')

"Step 38: Click on button rowSelection (SelectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection', ['button_rowSelection_internalRoleRowName': button_rowSelection_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 38-Click on button rowSelection SelectRow.png')

"Step 39: Click on div dynamicObject (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 39-Click on div dynamicObject PopoverBackdrop.png')

"Step 40: Click on link Reports6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports6'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 40-Click on link Reports6.png')

"Step 41: Click on link UploadReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_UploadReports_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 41-Click on link UploadReports.png')

"Step 42: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_1, Integer.valueOf(index_1))

"Step 43: Click on link Reports7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports7'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 43-Click on link Reports7.png')

"Step 44: Click on link testLinks (TestRuns2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testLinks', ['link_testLinks_internalRoleLinkName': link_testLinks_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 44-Click on link testLinks TestRuns2.png')

"Step 45: Click on link TestRuns3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns3_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 45-Click on link TestRuns3.png')

"Step 46: Click on link testRunLinks (object) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunLinks', ['link_testRunLinks_trNthChild': link_testRunLinks_trNthChild, 'link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName, 'link_testRunLinks_executions_id': link_testRunLinks_executions_id, 'link_testRunLinks_project_id': link_testRunLinks_project_id, 'link_testRunLinks_team_id': link_testRunLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 46-Click on link testRunLinks object - Navigate to page teamprojectexecutions.png')

"Step 47: Click on link TestResults6 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults6_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 47-Click on link TestResults6 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 48: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 48-Click on label object.png')

"Step 49: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 49-Click on label object.png')

"Step 50: Click on button externalLink (ExternalLink) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_externalLink"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_externalLink', ['button_externalLink_class': button_externalLink_class, 'button_externalLink_nth': button_externalLink_nth]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 50-Click on button externalLink ExternalLink - Navigate to page teamprojectexecutionstest-result.png')

"Step 51: Click on span logItems (StartListenerAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems', ['span_logItems_nthChild': span_logItems_nthChild, 'span_logItems_internalHasText': span_logItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 51-Click on span logItems StartListenerAction.png')

"Step 52: Click on span logItems (StartListenerAction2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 52-Click on span logItems StartListenerAction2.png')

"Step 53: Click on span logItems (CreatedWithSketchtool2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems', ['span_logItems_nthChild': span_logItems_nthChild_1, 'span_logItems_internalHasText': span_logItems_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 53-Click on span logItems CreatedWithSketchtool2.png')

"Step 54: Click on span testCaseExecution (CreatedWithSketchtool3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution', ['span_testCaseExecution_class': span_testCaseExecution_class, 'span_testCaseExecution_internalHasText': span_testCaseExecution_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 54-Click on span testCaseExecution CreatedWithSketchtool3.png')

"Step 55: Click on span testCaseExecution (ExecutingTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 55-Click on span testCaseExecution ExecutingTestCase.png')

"Step 56: Click on span testCaseExecution (ExecutingTestCase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution', ['span_testCaseExecution_class': span_testCaseExecution_class_1, 'span_testCaseExecution_internalHasText': span_testCaseExecution_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 56-Click on span testCaseExecution ExecutingTestCase2.png')

"Step 57: Click on span testCaseExecution (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_testCaseExecution'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 57-Click on span testCaseExecution object.png')

"Step 58: Click on span object2 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 58-Click on span object2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 59: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 59-Click on link Reports.png')

"Step 60: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 60-Click on link Reports.png')

"Step 61: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 61-Click on link Reports.png')

"Step 62: Click on link Summary -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 62-Click on link Summary - Navigate to page teamprojectexecutions.png')

"Step 63: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 63-Click on link Reports.png')

"Step 64: Click on link executionLinks (Executions2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks_1', ['link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 64-Click on link executionLinks Executions2 - Navigate to page teamproject.png')

"Step 65: Click on header testRunHeaders (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 65-Click on header testRunHeaders UntitledTestRun3.png')

"Step 66: Click on button Icon3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Icon3_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 66-Click on button Icon3.png')

"Step 67: Click on div dynamicObject (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 67-Click on div dynamicObject PopoverBackdrop.png')

"Step 68: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 68-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 69: Click on link testSuites (AndroidTestSuite) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild_1, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName_1, 'link_testSuites_team_id': link_testSuites_team_id_1, 'link_testSuites_project_id': link_testSuites_project_id_1, 'link_testSuites_test_suites_id': link_testSuites_test_suites_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 69-Click on link testSuites AndroidTestSuite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 70: Click on link testSuiteDetails (AndroidTestSuite2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteDetails', ['link_testSuiteDetails_internalRoleRowName': link_testSuiteDetails_internalRoleRowName_1, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id_1, 'link_testSuiteDetails_executions_id': link_testSuiteDetails_executions_id_1, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 70-Click on link testSuiteDetails AndroidTestSuite2 - Navigate to page teamprojectexecutions.png')

"Step 71: Click on link TestResults6 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults6_1'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 71-Click on link TestResults6 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 72: Click on button externalLink (ExternalLink) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_externalLink"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_externalLink', ['button_externalLink_class': button_externalLink_class_1, 'button_externalLink_nth': button_externalLink_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 72-Click on button externalLink ExternalLink - Navigate to page teamprojectexecutionstest-result.png')

"Step 73: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 73-Click on div object.png')

"Step 74: Click on link Requests2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Requests2'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 74-Click on link Requests2 - Navigate to page teamprojectexecutionstest-resultrequests.png')

"Step 75: Click on link TestObjects2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_requests/link_TestObjects2'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 75-Click on link TestObjects2 - Navigate to page teamprojectexecutionstest-resulttest-objects.png')

"Step 76: Click on link Comments -> Navigate to page 'team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_test_objects/link_Comments'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 76-Click on link Comments - Navigate to page teamprojectexecutionstest-resultcomments.png')

"Step 77: Click on link ReRuns2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_comments/link_ReRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC311/Step 77-Click on link ReRuns2 - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 78: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC311-Manage Test Suites and Configure Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}