import truetest.common.configureTestSuiteAndRun
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 4: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 4-Click on button Settings.png')

"Step 5: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 5-Click on div Backdrop.png')

"Step 6: Click on link projectResources (KP KMS POC) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources', ['link_projectResources_internalRoleLinkName': link_projectResources_internalRoleLinkName, 'link_projectResources_project_id': link_projectResources_project_id, 'link_projectResources_team_id': link_projectResources_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 6-Click on link projectResources KP KMS POC - Navigate to page teamproject.png')

"Step 7: Click on link Settings8 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings8'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 7-Click on link Settings8 - Navigate to page teamproject.png')

"Step 8: Click on link testManagement (ScriptRepositories6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 8-Click on link testManagement ScriptRepositories6.png')

"Step 9: Click on link integrations (SGDP Int) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_integrations"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_integrations', ['link_integrations_trNthChild': link_integrations_trNthChild, 'link_integrations_internalRoleLinkName': link_integrations_internalRoleLinkName, 'link_integrations_test_project_id': link_integrations_test_project_id, 'link_integrations_team_id': link_integrations_team_id, 'link_integrations_project_id': link_integrations_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 9-Click on link integrations SGDP Int - Navigate to page teamprojecttest-project.png')

"Step 10: Click on button Edit2 -> Navigate to page 'team/*/project/*/test-project/*/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_Edit2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 10-Click on button Edit2 - Navigate to page teamprojecttest-projectedit.png')

"Step 11: Click on input UploadFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_edit/input_UploadFile'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 11-Click on input UploadFile.png')

"Step 12: Click on button Save -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_edit/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 12-Click on button Save - Navigate to page teamprojecttest-project.png')

"Step 13: Click on button ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 13-Click on button ScheduleTestRun2.png')

"Step 14: Configure test suite settings and initiate test run."

configureTestSuiteAndRun.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on div Today"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Today'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 15-Click on div Today.png')

"Step 16: Click on link viewTestRuns (ViewSGDP)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRuns', ['link_viewTestRuns_internalRoleLinkName': link_viewTestRuns_internalRoleLinkName, 'link_viewTestRuns_project_id': link_viewTestRuns_project_id, 'link_viewTestRuns_team_id': link_viewTestRuns_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 16-Click on link viewTestRuns ViewSGDP.png')

"Step 17: Click on header testRuns (SGDPSp)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 17-Click on header testRuns SGDPSp.png')

"Step 18: Click on button SessionsTab2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 18-Click on button SessionsTab2.png')

"Step 19: Click on div Count"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Count'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 19-Click on div Count.png')

"Step 20: Click on i dynamicObject (Count)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject', ['i_dynamicObject_internalHasText': i_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 20-Click on i dynamicObject Count.png')

"Step 21: Click on div Count2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Count2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 21-Click on div Count2.png')

"Step 22: Click on button GoToDetails2 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoToDetails2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 22-Click on button GoToDetails2 - Navigate to page teamprojectgridplanjob.png')

"Step 23: Click on link Reports2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 23-Click on link Reports2 - Navigate to page teamproject.png')

"Step 24: Click on link TestRuns14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns14'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 24-Click on link TestRuns14.png')

"Step 25: Click on link executionDetails (TestRun6) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 25-Click on link executionDetails TestRun6 - Navigate to page teamprojectexecutions.png')

"Step 26: Click on div testCases (TestCase3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases', ['div_testCases_class': div_testCases_class, 'div_testCases_internalText': div_testCases_internalText, 'div_testCases_nth': div_testCases_nth]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 26-Click on div testCases TestCase3.png')

"Step 27: Click on div testCases (TestCase4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases', ['div_testCases_class': div_testCases_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 27-Click on div testCases TestCase4.png')

"Step 28: Click on div testCases (TestCase5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases', ['div_testCases_class': div_testCases_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 28-Click on div testCases TestCase5.png')

"Step 29: Click on div testCases (TestCase6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases', ['div_testCases_class': div_testCases_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 29-Click on div testCases TestCase6.png')

"Step 30: Click on link Page22"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Page22'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 30-Click on link Page22.png')

"Step 31: Click on div RightSidebar3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar3'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 31-Click on div RightSidebar3.png')

"Step 32: Click on link testSuites (Sprint) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName, 'link_testSuites_project_id': link_testSuites_project_id, 'link_testSuites_team_id': link_testSuites_team_id, 'link_testSuites_test_suites_id': link_testSuites_test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 32-Click on link testSuites Sprint - Navigate to page teamprojecttest-designtest-suites.png')

"Step 33: Click on link Reports2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Reports2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 33-Click on link Reports2 - Navigate to page teamproject.png')

"Step 34: Click on link TestRuns14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns14'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 34-Click on link TestRuns14.png')

"Step 35: Click on link executionDetails (TestRun6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_1, 'link_executionDetails_project_id': link_executionDetails_project_id_1, 'link_executionDetails_team_id': link_executionDetails_team_id_1, 'link_executionDetails_executions_id': link_executionDetails_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 35-Click on link executionDetails TestRun6.png')

"Step 36: Click on button selectRows (SelectRow4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_selectRows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_selectRows', ['button_selectRows_internalRoleRowName': button_selectRows_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 36-Click on button selectRows SelectRow4.png')

"Step 37: Click on div dynamicObject (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 37-Click on div dynamicObject PopoverBackdrop.png')

"Step 38: Click on header testRuns (SGDPSp)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 38-Click on header testRuns SGDPSp.png')

"Step 39: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 39-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 40: Click on link TestRuns8 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 40-Click on link TestRuns8 - Navigate to page teamproject.png')

"Step 41: Click on link Reports14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports14'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 41-Click on link Reports14.png')

"Step 42: Click on link Reports14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports14'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 42-Click on link Reports14.png')

"Step 43: Click on link TestRuns14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns14'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 43-Click on link TestRuns14.png')

"Step 44: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC105-Integrate Test Management Settings in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}