import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.common.scheduleAndRunTestDemo
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration

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

WebUI.takeScreenshot(reportLocation + '/TC111/Step 4-Click on button Settings.png')

"Step 5: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop_1'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 5-Click on div Backdrop.png')

"Step 6: Click on link projectNavigation (KPKMSPOC) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName, 'link_projectNavigation_project_id': link_projectNavigation_project_id, 'link_projectNavigation_team_id': link_projectNavigation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 6-Click on link projectNavigation KPKMSPOC - Navigate to page teamproject.png')

"Step 7: Click on link Settings5 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings5'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 7-Click on link Settings5 - Navigate to page teamproject.png')

"Step 8: Click on link projectNavigation (ScriptRepositories6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': link_projectNavigation_nthChild, 'link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 8-Click on link projectNavigation ScriptRepositories6.png')

"Step 9: Click on link dynamicObject (SGDPInt) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'link_dynamicObject_team_id': link_dynamicObject_team_id, 'link_dynamicObject_test_project_id': link_dynamicObject_test_project_id, 'link_dynamicObject_project_id': link_dynamicObject_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 9-Click on link dynamicObject SGDPInt - Navigate to page teamprojecttest-project.png')

"Step 10: Click on button Edit2 -> Navigate to page 'team/*/project/*/test-project/*/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_Edit2'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 10-Click on button Edit2 - Navigate to page teamprojecttest-projectedit.png')

"Step 11: Click on input UploadFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_edit/input_UploadFile'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 11-Click on input UploadFile.png')

"Step 12: Click on button Save -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_edit/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 12-Click on button Save - Navigate to page teamprojecttest-project.png')

"Step 13: Click on button ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 13-Click on button ScheduleTestRun2.png')

"Step 14: Schedule a test run with configuration and environment selection"

scheduleAndRunTestDemo.execute(data_path_0, Integer.valueOf(index_0))

"Step 15: Click on div TodayAugust"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TodayAugust'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 15-Click on div TodayAugust.png')

"Step 16: Click on link testRunNavigation (ViewSGDPSp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunNavigation_1', ['link_testRunNavigation_internalRoleLinkName': link_testRunNavigation_internalRoleLinkName, 'link_testRunNavigation_team_id': link_testRunNavigation_team_id, 'link_testRunNavigation_project_id': link_testRunNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 16-Click on link testRunNavigation ViewSGDPSp2.png')

"Step 17: Click on header testRun (SGDPSp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 17-Click on header testRun SGDPSp2.png')

"Step 18: Click on button Sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 18-Click on button Sessions.png')

"Step 19: Click on div 43"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_43'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 19-Click on div 43.png')

"Step 20: Click on i dynamicObject (43)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/i_dynamicObject', ['i_dynamicObject_internalHasText': i_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 20-Click on i dynamicObject 43.png')

"Step 21: Click on div 25"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_25'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 21-Click on div 25.png')

"Step 22: Click on button GoToDetails2 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoToDetails'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 22-Click on button GoToDetails2 - Navigate to page teamprojectgridplanjob.png')

"Step 23: Click on link Reports2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 23-Click on link Reports2 - Navigate to page teamproject.png')

"Step 24: Click on link TestRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 24-Click on link TestRuns10.png')

"Step 25: Click on link executionNavigation (143) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation', ['link_executionNavigation_trNthChild': link_executionNavigation_trNthChild, 'link_executionNavigation_team_id': link_executionNavigation_team_id, 'link_executionNavigation_project_id': link_executionNavigation_project_id, 'link_executionNavigation_executions_id': link_executionNavigation_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 25-Click on link executionNavigation 143 - Navigate to page teamprojectexecutions.png')

"Step 26: Click on div testCases (TestCasesHirerJourneyAutoLoanDP152)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases', ['div_testCases_class': div_testCases_class, 'div_testCases_internalText': div_testCases_internalText, 'div_testCases_nth': div_testCases_nth]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 26-Click on div testCases TestCasesHirerJourneyAutoLoanDP152.png')

"Step 27: Click on div testCases (TestCasesHirerJourneyAutoLoanDP76PRTC03)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases', ['div_testCases_class': div_testCases_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 27-Click on div testCases TestCasesHirerJourneyAutoLoanDP76PRTC03.png')

"Step 28: Click on div testCases (TestCasesHirerJourneyAutoLoanDP76PRTC05)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases', ['div_testCases_class': div_testCases_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 28-Click on div testCases TestCasesHirerJourneyAutoLoanDP76PRTC05.png')

"Step 29: Click on div testCases (PassedTestCasesHirerJourneyAutoLoanDP152)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases', ['div_testCases_class': div_testCases_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 29-Click on div testCases PassedTestCasesHirerJourneyAutoLoanDP152.png')

"Step 30: Click on link Page22"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Page2_1'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 30-Click on link Page22.png')

"Step 31: Click on div RightSidebar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 31-Click on div RightSidebar.png')

"Step 32: Click on link testSuiteNavigation (Sprint) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuiteNavigation', ['link_testSuiteNavigation_internalRoleLinkName': link_testSuiteNavigation_internalRoleLinkName, 'link_testSuiteNavigation_project_id': link_testSuiteNavigation_project_id, 'link_testSuiteNavigation_test_suites_id': link_testSuiteNavigation_test_suites_id, 'link_testSuiteNavigation_team_id': link_testSuiteNavigation_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 32-Click on link testSuiteNavigation Sprint - Navigate to page teamprojecttest-designtest-suites.png')

"Step 33: Click on link Reports3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 33-Click on link Reports3 - Navigate to page teamproject.png')

"Step 34: Click on link TestRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 34-Click on link TestRuns10.png')

"Step 35: Click on link executionNavigation (143)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionNavigation', ['link_executionNavigation_trNthChild': link_executionNavigation_trNthChild_1, 'link_executionNavigation_team_id': link_executionNavigation_team_id_1, 'link_executionNavigation_project_id': link_executionNavigation_project_id_1, 'link_executionNavigation_executions_id': link_executionNavigation_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 35-Click on link executionNavigation 143.png')

"Step 36: Click on button rowSelection (SelectRowSGDPSp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_rowSelection', ['button_rowSelection_internalRoleRowName': button_rowSelection_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 36-Click on button rowSelection SelectRowSGDPSp2.png')

"Step 37: Click on div menu (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 37-Click on div menu PopoverBackdrop.png')

"Step 38: Click on header testRun (SGDPSp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 38-Click on header testRun SGDPSp2.png')

"Step 39: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 39-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 40: Click on link TestRuns8 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 40-Click on link TestRuns8 - Navigate to page teamproject.png')

"Step 41: Click on link Reports11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports11'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 41-Click on link Reports11.png')

"Step 42: Click on link Reports11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports11'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 42-Click on link Reports11.png')

"Step 43: Click on link TestRuns10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 43-Click on link TestRuns10.png')

"Step 44: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC111-Edit Test Project Settings and Schedule Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}