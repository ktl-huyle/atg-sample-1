import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

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

TrueTestScripts.navigate("team/*/project/*/*")

"Step 4: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 4-Click on i object.png')

"Step 5: Click on header testRunDetails (UntitledTestRun7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 5-Click on header testRunDetails UntitledTestRun7.png')

"Step 6: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 6-Click on i object2.png')

"Step 7: Click on i object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_object2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 7-Click on i object2.png')

"Step 8: Click on button SessionsTab4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab4'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 8-Click on button SessionsTab4.png')

"Step 9: Click on button FailedTestResultsTab2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResultsTab2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 9-Click on button FailedTestResultsTab2.png')

"Step 10: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 10-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 11: Click on link testSuites (TestSuites) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id, 'test_suites_id': test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 11-Click on link testSuites TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 12: Click on link testSuites (AndroidTestSuite) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites', ['link_testSuites_internalRoleRowName': link_testSuites_internalRoleRowName, 'team_id': team_id_1, 'executions_id': executions_id, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 12-Click on link testSuites AndroidTestSuite - Navigate to page teamprojectexecutions.png')

"Step 13: Click on link TestResults10 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults10'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 13-Click on link TestResults10 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 14: Click on span PassedTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_PassedTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 14-Click on span PassedTestCase.png')

"Step 15: Click on div InfoSidebarCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_InfoSidebarCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 15-Click on div InfoSidebarCloseButton.png')

"Step 16: Click on link Settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 16-Click on link Settings - Navigate to page teamproject.png')

"Step 17: Click on label enableBDDReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_enableBDDReports'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 17-Click on label enableBDDReports.png')

"Step 18: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_save2_1'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 18-Click on button save2.png')

"Step 19: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 19-Click on button Settings.png')

"Step 20: Click on div testOptions (MuiBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testOptions', ['div_testOptions_class': div_testOptions_class]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 20-Click on div testOptions MuiBackdrop.png')

"Step 21: Click on link testResources (Integrations2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 21-Click on link testResources Integrations2.png')

"Step 22: Click on div teamProjectDetails (CodelessAutomationTool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails', ['div_teamProjectDetails_class': div_teamProjectDetails_class, 'div_teamProjectDetails_internalRoleTreeitemName': div_teamProjectDetails_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 22-Click on div teamProjectDetails CodelessAutomationTool.png')

"Step 23: Click on div teamProjectDetails (ExpandMoreIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails', ['div_teamProjectDetails_class': div_teamProjectDetails_class_1, 'div_teamProjectDetails_internalRoleTreeitemName': div_teamProjectDetails_internalRoleTreeitemName_1]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 23-Click on div teamProjectDetails ExpandMoreIcon.png')

"Step 24: Click on div teamProjectDetails (ALMTestManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails', ['div_teamProjectDetails_class': div_teamProjectDetails_class_2, 'div_teamProjectDetails_internalRoleTreeitemName': div_teamProjectDetails_internalRoleTreeitemName_2]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 24-Click on div teamProjectDetails ALMTestManagement.png')

"Step 25: Click on div teamProjectDetails (ExpandMoreIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails', ['div_teamProjectDetails_class': div_teamProjectDetails_class_3, 'div_teamProjectDetails_internalRoleTreeitemName': div_teamProjectDetails_internalRoleTreeitemName_3]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 25-Click on div teamProjectDetails ExpandMoreIcon2.png')

"Step 26: Click on div teamProjectDetails (CICDPipeline)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails', ['div_teamProjectDetails_class': div_teamProjectDetails_class_4, 'div_teamProjectDetails_internalRoleTreeitemName': div_teamProjectDetails_internalRoleTreeitemName_4]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 26-Click on div teamProjectDetails CICDPipeline.png')

"Step 27: Click on div teamProjectDetails (ExpandMoreIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectDetails', ['div_teamProjectDetails_class': div_teamProjectDetails_class_5, 'div_teamProjectDetails_internalRoleTreeitemName': div_teamProjectDetails_internalRoleTreeitemName_5]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 27-Click on div teamProjectDetails ExpandMoreIcon3.png')

"Step 28: Click on link testResources (CustomFields)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_1, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 28-Click on link testResources CustomFields.png')

"Step 29: Click on link testResources (TestCloudTunnels4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_2, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 29-Click on link testResources TestCloudTunnels4.png')

"Step 30: Click on link testResources (CustomFields)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_3, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 30-Click on link testResources CustomFields.png')

"Step 31: Click on link testResources (Integrations2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_4, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 31-Click on link testResources Integrations2.png')

"Step 32: Click on div testOptions (GPTManualTestGenerator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testOptions', ['div_testOptions_class': div_testOptions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 32-Click on div testOptions GPTManualTestGenerator.png')

"Step 33: Click on div objectDetails (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 33-Click on div objectDetails object2.png')

"Step 34: Click on link testResources (TestEnvironments2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_5, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 34-Click on link testResources TestEnvironments2.png')

"Step 35: Click on link testResources (ScriptRepositories4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_6, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 35-Click on link testResources ScriptRepositories4.png')

"Step 36: Click on link testResources (General2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_7, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 36-Click on link testResources General2.png')

"Step 37: Click on link Tests9 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests9'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 37-Click on link Tests9 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 38: Click on link Executions5 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions5'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 38-Click on link Executions5 - Navigate to page teamproject.png')

"Step 39: Click on button selectRow (SelectRow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_selectRow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_selectRow', ['button_selectRow_internalRoleRowName': button_selectRow_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 39-Click on button selectRow SelectRow2.png')

"Step 40: Click on div testOptions (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testOptions', ['div_testOptions_class': div_testOptions_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 40-Click on div testOptions PopoverBackdrop.png')

"Step 41: Click on link Reports10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports10'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 41-Click on link Reports10.png')

"Step 42: Click on link UploadReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_UploadReports'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 42-Click on link UploadReports.png')

"Step 43: Click on input katalonReportFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_katalonReportFiles'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 43-Click on input katalonReportFiles.png')

"Step 44: Click on input tagEntity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_tagEntity'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 44-Click on input tagEntity.png')

"Step 45: Click on div customFields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_customFields'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 45-Click on div customFields.png')

"Step 46: Click on button import"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_import'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 46-Click on button import.png')

"Step 47: Click on link Reports11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports11'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 47-Click on link Reports11.png')

"Step 48: Click on link testResources (TestRuns9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild_8, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName_8]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 48-Click on link testResources TestRuns9.png')

"Step 49: Click on link TestRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns10'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 49-Click on link TestRuns10.png')

"Step 50: Click on link executionDetails (object) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'team_id': team_id_2, 'executions_id': executions_id_1, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 50-Click on link executionDetails object - Navigate to page teamprojectexecutions.png')

"Step 51: Click on link TestResults10 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults10'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 51-Click on link TestResults10 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 52: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 52-Click on label object.png')

"Step 53: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 53-Click on label object.png')

"Step 54: Click on button testResultActions (ExternalLink) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class, 'button_testResultActions_nth': button_testResultActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 54-Click on button testResultActions ExternalLink - Navigate to page teamprojectexecutionstest-result.png')

"Step 55: Click on span logItems (StartListenerAction2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems', ['span_logItems_nthChild': span_logItems_nthChild, 'span_logItems_internalHasText': span_logItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 55-Click on span logItems StartListenerAction2.png')

"Step 56: Click on span logItems (StartListenerAction3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems', ['span_logItems_nthChild': span_logItems_nthChild_1, 'span_logItems_internalHasText': span_logItems_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 56-Click on span logItems StartListenerAction3.png')

"Step 57: Click on span logItems (CreatedWithSketchtool4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItems', ['span_logItems_nthChild': span_logItems_nthChild_2, 'span_logItems_internalHasText': span_logItems_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 57-Click on span logItems CreatedWithSketchtool4.png')

"Step 58: Click on span executingTestCases (CreatedWithSketchtool5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_executingTestCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_executingTestCases', ['span_executingTestCases_class': span_executingTestCases_class, 'span_executingTestCases_internalHasText': span_executingTestCases_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 58-Click on span executingTestCases CreatedWithSketchtool5.png')

"Step 59: Click on span executingTestCases (ExecutingTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_executingTestCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_executingTestCases', ['span_executingTestCases_class': span_executingTestCases_class_1, 'span_executingTestCases_internalHasText': span_executingTestCases_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 59-Click on span executingTestCases ExecutingTestCase.png')

"Step 60: Click on span executingTestCases (ExecutingTestCase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_executingTestCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_executingTestCases', ['span_executingTestCases_class': span_executingTestCases_class_2, 'span_executingTestCases_internalHasText': span_executingTestCases_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 60-Click on span executingTestCases ExecutingTestCase2.png')

"Step 61: Click on span executingTestCases (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_executingTestCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_executingTestCases', ['span_executingTestCases_class': span_executingTestCases_class_3, 'span_executingTestCases_internalHasText': span_executingTestCases_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 61-Click on span executingTestCases object.png')

"Step 62: Click on span objectDetails (object2) -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_objectDetails'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 62-Click on span objectDetails object2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 63: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 63-Click on link Reports.png')

"Step 64: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 64-Click on link Reports.png')

"Step 65: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 65-Click on link Reports.png')

"Step 66: Click on link Summary2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 66-Click on link Summary2 - Navigate to page teamprojectexecutions.png')

"Step 67: Click on link Reports2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 67-Click on link Reports2.png')

"Step 68: Click on link Executions3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Executions3'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 68-Click on link Executions3 - Navigate to page teamproject.png')

"Step 69: Click on header testRunDetails (UntitledTestRun7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 69-Click on header testRunDetails UntitledTestRun7.png')

"Step 70: Click on button Icon4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Icon4'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 70-Click on button Icon4.png')

"Step 71: Click on div testOptions (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testOptions', ['div_testOptions_class': div_testOptions_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 71-Click on div testOptions PopoverBackdrop.png')

"Step 72: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 72-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 73: Click on link testSuites (AndroidTestSuite) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild_1, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName_1, 'team_id': team_id_3, 'project_id': project_id_3, 'test_suites_id': test_suites_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 73-Click on link testSuites AndroidTestSuite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 74: Click on link testSuites (AndroidTestSuite2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuites', ['link_testSuites_internalRoleRowName': link_testSuites_internalRoleRowName_1, 'team_id': team_id_4, 'executions_id': executions_id_2, 'project_id': project_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 74-Click on link testSuites AndroidTestSuite2 - Navigate to page teamprojectexecutions.png')

"Step 75: Click on link TestResults10 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults10'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 75-Click on link TestResults10 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 76: Click on button testResultActions (ExternalLink) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testResultActions', ['button_testResultActions_class': button_testResultActions_class_1, 'button_testResultActions_nth': button_testResultActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 76-Click on button testResultActions ExternalLink - Navigate to page teamprojectexecutionstest-result.png')

"Step 77: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 77-Click on div object.png')

"Step 78: Click on link Requests2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Requests2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 78-Click on link Requests2 - Navigate to page teamprojectexecutionstest-resultrequests.png')

"Step 79: Click on link TestObjects2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_requests/link_TestObjects2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 79-Click on link TestObjects2 - Navigate to page teamprojectexecutionstest-resulttest-objects.png')

"Step 80: Click on link Comments -> Navigate to page 'team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_test_objects/link_Comments'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 80-Click on link Comments - Navigate to page teamprojectexecutionstest-resultcomments.png')

"Step 81: Click on link ReRuns2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_comments/link_ReRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 81-Click on link ReRuns2 - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 82: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC89-Verify Test Result Actions and Reports Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}