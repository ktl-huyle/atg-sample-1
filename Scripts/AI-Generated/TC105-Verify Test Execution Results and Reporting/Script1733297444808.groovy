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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on i Icon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_Icon'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 4-Click on i Icon.png')

"Step 5: Click on header UntitledTestRun (UntitledTestRun17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_UntitledTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_UntitledTestRun', ['header_UntitledTestRun_internalRoleHeadingName': header_UntitledTestRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 5-Click on header UntitledTestRun UntitledTestRun17.png')

"Step 6: Click on i dynamicObject (TotalTests)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject', ['i_dynamicObject_internalHasText': i_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 6-Click on i dynamicObject TotalTests.png')

"Step 7: Click on i dynamicObject (TotalTests)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject', ['i_dynamicObject_internalHasText': i_dynamicObject_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 7-Click on i dynamicObject TotalTests.png')

"Step 8: Click on button SessionsTab (SessionsTab8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_SessionsTab"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_SessionsTab', ['button_SessionsTab_internalRoleTabName': button_SessionsTab_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 8-Click on button SessionsTab SessionsTab8.png')

"Step 9: Click on button SessionsTab (SessionsTab8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_SessionsTab"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_SessionsTab', ['button_SessionsTab_internalRoleTabName': button_SessionsTab_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 9-Click on button SessionsTab SessionsTab8.png')

"Step 10: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 10-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 11: Click on link dynamicObject (iOSTestSuite) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id, 'test_suites_id': test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 11-Click on link dynamicObject iOSTestSuite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 12: Click on link dynamicObject (TestExecution) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_dynamicObject', ['link_dynamicObject_internalRoleRowName': link_dynamicObject_internalRoleRowName, 'team_id': team_id_1, 'executions_id': executions_id, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 12-Click on link dynamicObject TestExecution - Navigate to page teamprojectexecutions.png')

"Step 13: Click on link TestResults8 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults8'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 13-Click on link TestResults8 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 14: Click on span PassedTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_PassedTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 14-Click on span PassedTestCase.png')

"Step 15: Click on div InfoSidebar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_InfoSidebar'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 15-Click on div InfoSidebar.png')

"Step 16: Click on link Settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 16-Click on link Settings - Navigate to page teamproject.png')

"Step 17: Click on label enableBDDReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_enableBDDReports'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 17-Click on label enableBDDReports.png')

"Step 18: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 18-Click on button save2.png')

"Step 19: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 19-Click on button Settings.png')

"Step 20: Click on div MuiBackdropRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 20-Click on div MuiBackdropRoot.png')

"Step 21: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 21-Click on link testEnvironments TestEnvironments39.png')

"Step 22: Click on div dynamicObject (CodelessAutomationTool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class, 'div_dynamicObject_internalRoleTreeitemName': div_dynamicObject_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 22-Click on div dynamicObject CodelessAutomationTool.png')

"Step 23: Click on div dynamicObject (ExpandMoreIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 23-Click on div dynamicObject ExpandMoreIcon.png')

"Step 24: Click on div dynamicObject (ALMTestManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class_2, 'div_dynamicObject_internalRoleTreeitemName': div_dynamicObject_internalRoleTreeitemName_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 24-Click on div dynamicObject ALMTestManagement.png')

"Step 25: Click on div dynamicObject (ExpandMoreIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 25-Click on div dynamicObject ExpandMoreIcon2.png')

"Step 26: Click on div dynamicObject (CICDPipeline)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class_4, 'div_dynamicObject_internalRoleTreeitemName': div_dynamicObject_internalRoleTreeitemName_2]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 26-Click on div dynamicObject CICDPipeline.png')

"Step 27: Click on div dynamicObject (ExpandMoreIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_2', ['div_dynamicObject_class': div_dynamicObject_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 27-Click on div dynamicObject ExpandMoreIcon3.png')

"Step 28: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild_1, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 28-Click on link testEnvironments TestEnvironments39.png')

"Step 29: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild_2, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 29-Click on link testEnvironments TestEnvironments39.png')

"Step 30: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild_3, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 30-Click on link testEnvironments TestEnvironments39.png')

"Step 31: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild_4, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName_4]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 31-Click on link testEnvironments TestEnvironments39.png')

"Step 32: Click on div GPTManualTestGenerator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_GPTManualTestGenerator'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 32-Click on div GPTManualTestGenerator.png')

"Step 33: Click on div Integrations"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 33-Click on div Integrations.png')

"Step 34: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild_5, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName_5]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 34-Click on link testEnvironments TestEnvironments39.png')

"Step 35: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild_6, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName_6]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 35-Click on link testEnvironments TestEnvironments39.png')

"Step 36: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild_7, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName_7]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 36-Click on link testEnvironments TestEnvironments39.png')

"Step 37: Click on link Tests10 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests10'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 37-Click on link Tests10 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 38: Click on link Executions6 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions6'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 38-Click on link Executions6 - Navigate to page teamproject.png')

"Step 39: Click on button selectRow (SelectRow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_selectRow"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_selectRow', ['button_selectRow_internalRoleRowName': button_selectRow_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 39-Click on button selectRow SelectRow3.png')

"Step 40: Click on div PopoverBackdrop (PopoverBackdrop3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_PopoverBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 40-Click on div PopoverBackdrop PopoverBackdrop3.png')

"Step 41: Click on link reportsSettings (Settings19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportsSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportsSettings', ['link_reportsSettings_nthChild': link_reportsSettings_nthChild, 'link_reportsSettings_internalRoleLinkName': link_reportsSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 41-Click on link reportsSettings Settings19.png')

"Step 42: Click on link UploadReports2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_UploadReports2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 42-Click on link UploadReports2.png')

"Step 43: Click on input katalonReportFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_katalonReportFiles'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 43-Click on input katalonReportFiles.png')

"Step 44: Click on input tagEntity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_tagEntity'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 44-Click on input tagEntity.png')

"Step 45: Click on div customFields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_customFields'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 45-Click on div customFields.png')

"Step 46: Click on button import"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_import'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 46-Click on button import.png')

"Step 47: Click on link Executions (Executions8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_Executions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_Executions', ['link_Executions_internalRoleLinkName': link_Executions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 47-Click on link Executions Executions8.png')

"Step 48: Click on link testCloudTunnels (TestCloudTunnels7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testCloudTunnels"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testCloudTunnels', ['link_testCloudTunnels_internalRoleLinkName': link_testCloudTunnels_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 48-Click on link testCloudTunnels TestCloudTunnels7.png')

"Step 49: Click on link testRuns (testRuns19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 49-Click on link testRuns testRuns19.png')

"Step 50: Click on link executionDetails (TestRun) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'team_id': team_id_2, 'executions_id': executions_id_1, 'project_id': project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 50-Click on link executionDetails TestRun - Navigate to page teamprojectexecutions.png')

"Step 51: Click on link TestResults8 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults8'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 51-Click on link TestResults8 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 52: Click on label Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_Object'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 52-Click on label Object.png')

"Step 53: Click on label Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/label_Object'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 53-Click on label Object.png')

"Step 54: Click on button TestResultDetails (TestResultDetails3) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_TestResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_TestResultDetails', ['button_TestResultDetails_class': button_TestResultDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 54-Click on button TestResultDetails TestResultDetails3 - Navigate to page teamprojectexecutionstest-result.png')

"Step 55: Click on span logItem (LogItem7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItem"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItem', ['span_logItem_nthChild': span_logItem_nthChild, 'span_logItem_internalHasText': span_logItem_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 55-Click on span logItem LogItem7.png')

"Step 56: Click on span logItem (StartListenerAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItem'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 56-Click on span logItem StartListenerAction.png')

"Step 57: Click on span logItem (CreatedWithSketchtool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItem"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_logItem', ['span_logItem_nthChild': span_logItem_nthChild_1, 'span_logItem_internalHasText': span_logItem_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 57-Click on span logItem CreatedWithSketchtool.png')

"Step 58: Click on span dynamicObject (CreatedWithSketchtool2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject', ['span_dynamicObject_class': span_dynamicObject_class, 'span_dynamicObject_internalHasText': span_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 58-Click on span dynamicObject CreatedWithSketchtool2.png')

"Step 59: Click on span dynamicObject (ExecutingTestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 59-Click on span dynamicObject ExecutingTestCase.png')

"Step 60: Click on span dynamicObject (ExecutingTestCase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject', ['span_dynamicObject_class': span_dynamicObject_class_1, 'span_dynamicObject_internalHasText': span_dynamicObject_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 60-Click on span dynamicObject ExecutingTestCase2.png')

"Step 61: Click on span dynamicObject (ElseIfPlatformName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/span_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 61-Click on span dynamicObject ElseIfPlatformName.png')

"Step 62: Click on span ElseIfPlatformName2 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/span_ElseIfPlatformName2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 62-Click on span ElseIfPlatformName2 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 63: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 63-Click on link Reports.png')

"Step 64: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 64-Click on link Reports.png')

"Step 65: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 65-Click on link Reports.png')

"Step 66: Click on link Summary3 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary3'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 66-Click on link Summary3 - Navigate to page teamprojectexecutions.png')

"Step 67: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 67-Click on link Reports.png')

"Step 68: Click on link executionDetails (Executions2) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails_2', ['link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 68-Click on link executionDetails Executions2 - Navigate to page teamproject.png')

"Step 69: Click on header UntitledTestRun (UntitledTestRun17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_UntitledTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_UntitledTestRun', ['header_UntitledTestRun_internalRoleHeadingName': header_UntitledTestRun_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 69-Click on header UntitledTestRun UntitledTestRun17.png')

"Step 70: Click on button TestRunDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestRunDetail'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 70-Click on button TestRunDetail.png')

"Step 71: Click on div PopoverBackdrop (PopoverBackdrop3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_PopoverBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 71-Click on div PopoverBackdrop PopoverBackdrop3.png')

"Step 72: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 72-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 73: Click on link dynamicObject (AndroidTestSuite) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild_1, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName_1, 'team_id': team_id_3, 'project_id': project_id_3, 'test_suites_id': test_suites_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 73-Click on link dynamicObject AndroidTestSuite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 74: Click on link dynamicObject (AndroidTestSuite) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_dynamicObject', ['link_dynamicObject_internalRoleRowName': link_dynamicObject_internalRoleRowName_1, 'team_id': team_id_4, 'executions_id': executions_id_2, 'project_id': project_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 74-Click on link dynamicObject AndroidTestSuite - Navigate to page teamprojectexecutions.png')

"Step 75: Click on link TestResults8 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults8'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 75-Click on link TestResults8 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 76: Click on button TestResultDetails (TestResultDetails3) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_TestResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_TestResultDetails', ['button_TestResultDetails_class': button_TestResultDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 76-Click on button TestResultDetails TestResultDetails3 - Navigate to page teamprojectexecutionstest-result.png')

"Step 77: Click on div CreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_CreatedWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 77-Click on div CreatedWithSketch.png')

"Step 78: Click on link Requests2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Requests2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 78-Click on link Requests2 - Navigate to page teamprojectexecutionstest-resultrequests.png')

"Step 79: Click on link TestObjects2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_requests/link_TestObjects2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 79-Click on link TestObjects2 - Navigate to page teamprojectexecutionstest-resulttest-objects.png')

"Step 80: Click on link Comments -> Navigate to page 'team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_test_objects/link_Comments'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 80-Click on link Comments - Navigate to page teamprojectexecutionstest-resultcomments.png')

"Step 81: Click on link ReRuns2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_comments/link_ReRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 81-Click on link ReRuns2 - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 82: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC105-Verify Test Execution Results and Reporting_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}