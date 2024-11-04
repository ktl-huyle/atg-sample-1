import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link testExecutionDetails (ExecutionDetails) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testExecutionDetails', ['link_testExecutionDetails_class': link_testExecutionDetails_class, 'link_testExecutionDetails_nthChild': link_testExecutionDetails_nthChild, 'link_testExecutionDetails_internalRoleLinkName': link_testExecutionDetails_internalRoleLinkName, 'link_testExecutionDetails_executions_id': link_testExecutionDetails_executions_id, 'link_testExecutionDetails_team_id': link_testExecutionDetails_team_id, 'link_testExecutionDetails_project_id': link_testExecutionDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 4-Click on link testExecutionDetails ExecutionDetails - Navigate to page teamprojectexecutions.png')

"Step 5: Click on link TestResults5 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults5'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 5-Click on link TestResults5 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 6: Click on link Files4 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Files4'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 6-Click on link Files4 - Navigate to page teamprojectexecutionsfiles.png')

"Step 7: Click on link Defects -> Navigate to page 'team/*/project/*/executions/*/defect'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_Defects'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 7-Click on link Defects - Navigate to page teamprojectexecutionsdefect.png')

"Step 8: Click on div TestRunLink -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/defect?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_defect/div_TestRunLink'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 8-Click on div TestRunLink - Navigate to page teamprojectexecutionsfiles.png')

"Step 9: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 9-Click on link TestRuns - Navigate to page teamproject.png')

"Step 10: Click on link TestRuns8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 10-Click on link TestRuns8.png')

"Step 11: Click on link executionDetails (Execution2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_executions_id': link_executionDetails_executions_id, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_team_id': link_executionDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 11-Click on link executionDetails Execution2 - Navigate to page teamprojectexecutions.png')

"Step 12: Click on div StatusBar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_StatusBar'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 12-Click on div StatusBar.png')

"Step 13: Click on div StatusBar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_StatusBar'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 13-Click on div StatusBar.png')

"Step 14: Click on link TestResults6 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults6'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 14-Click on link TestResults6 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 15: Click on link Summary2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 15-Click on link Summary2 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on link Summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 16-Click on link Summary.png')

"Step 17: Click on link TestResults6 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults6'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 17-Click on link TestResults6 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 18: Click on link Summary2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 18-Click on link Summary2 - Navigate to page teamprojectexecutions.png')

"Step 19: Click on link TestRuns4 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns4_1'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 19-Click on link TestRuns4 - Navigate to page teamproject.png')

"Step 20: Click on link TestRuns8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 20-Click on link TestRuns8.png')

"Step 21: Click on link Overview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Overview'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 21-Click on link Overview.png')

"Step 22: Click on link testManagement (TestRuns9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 22-Click on link testManagement TestRuns9.png')

"Step 23: Click on link Dashboard4 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard4'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 23-Click on link Dashboard4 - Navigate to page teamproject.png')

"Step 24: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 24-Click on body object.png')

"Step 25: Click on link Dashboard5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard5'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 25-Click on link Dashboard5.png')

"Step 26: Click on link Tests6 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests6'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 26-Click on link Tests6 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 27: Click on link Executions5 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions5'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 27-Click on link Executions5 - Navigate to page teamproject.png')

"Step 28: Click on header testRuns (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 28-Click on header testRuns UntitledTestRun2.png')

"Step 29: Click on button Details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 29-Click on button Details - Navigate to page teamprojectexecutions.png')

"Step 30: Click on label NeedReview -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_NeedReview'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 30-Click on label NeedReview - Navigate to page teamproject.png')

"Step 31: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 31-Click on button Close.png')

"Step 32: Click on link Executions10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions10'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 32-Click on link Executions10.png')

"Step 33: Click on button projectActions (Alloy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 33-Click on button projectActions Alloy.png')

"Step 34: Click on link Tests7 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests7'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 34-Click on link Tests7 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 35: Click on span treeSwitchers (TreeSwitcher12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 35-Click on span treeSwitchers TreeSwitcher12.png')

"Step 36: Click on span treeSwitchers (Icon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 36-Click on span treeSwitchers Icon2.png')

"Step 37: Click on span treeSwitchers (TestCases3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 37-Click on span treeSwitchers TestCases3.png')

"Step 38: Click on span treeSwitchers (TreeSwitcher13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 38-Click on span treeSwitchers TreeSwitcher13.png')

"Step 39: Click on span treeSwitchers (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 39-Click on span treeSwitchers object.png')

"Step 40: Click on link Dashboard2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Dashboard2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 40-Click on link Dashboard2 - Navigate to page teamproject.png')

"Step 41: Click on link Planning5 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning5'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 41-Click on link Planning5 - Navigate to page teamprojectreleases.png')

"Step 42: Click on link Tests5 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests5'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 42-Click on link Tests5 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 43: Click on link Tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 43-Click on link Tests.png')

"Step 44: Click on item TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/item_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 44-Click on item TestSuites.png')

"Step 45: Click on link TestSuites7 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites7'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 45-Click on link TestSuites7 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 46: Click on link TestObjects2 -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestObjects2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 46-Click on link TestObjects2 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 47: Click on link testSettings (Executions) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_testSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_testSettings', ['link_testSettings_internalRoleLinkName': link_testSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 47-Click on link testSettings Executions - Navigate to page teamproject.png')

"Step 48: Click on header testRuns (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 48-Click on header testRuns UntitledTestRun2.png')

"Step 49: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 49-Click on button Close.png')

"Step 50: Click on header testRuns (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 50-Click on header testRuns UntitledTestRun3.png')

"Step 51: Click on div TestRunDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestRunDetail'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 51-Click on div TestRunDetail.png')

"Step 52: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 52-Click on button Close.png')

"Step 53: Click on header testRuns (UntitledTestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRuns', ['header_testRuns_internalRoleHeadingName': header_testRuns_internalRoleHeadingName_3]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 53-Click on header testRuns UntitledTestRun4.png')

"Step 54: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 54-Click on button Close.png')

"Step 55: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 55-Click on button Close2.png')

"Step 56: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 56-Click on button Close2.png')

"Step 57: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 57-Click on input DateRange.png')

"Step 58: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 58-Click on body object.png')

"Step 59: Click on div dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 59-Click on div dynamicObject object.png')

"Step 60: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 60-Click on div object2.png')

"Step 61: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 61-Click on div object3.png')

"Step 62: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 62-Click on body object.png')

"Step 63: Click on div dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 63-Click on div dynamicObject object.png')

"Step 64: Click on input Executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Executor'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 64-Click on input Executor.png')

"Step 65: Click on div ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 65-Click on div ScheduleTestRun.png')

"Step 66: Click on label Status"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_Status'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 66-Click on label Status.png')

"Step 67: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 67-Click on body object.png')

"Step 68: Click on div dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 68-Click on div dynamicObject object.png')

"Step 69: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 69-Click on div object4.png')

"Step 70: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 70-Click on input DateRange.png')

"Step 71: Click on button gridCells (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 71-Click on button gridCells object.png')

"Step 72: Click on div dynamicObject (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1', ['div_dynamicObject_internalText': div_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 72-Click on div dynamicObject object5.png')

"Step 73: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 73-Click on button Close2.png')

"Step 74: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 74-Click on button Close2.png')

"Step 75: Click on button Close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 75-Click on button Close2.png')

"Step 76: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 76-Click on body object.png')

"Step 77: Click on div dynamicObject (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 77-Click on div dynamicObject object6.png')

"Step 78: Click on input DateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_DateRange'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 78-Click on input DateRange.png')

"Step 79: Click on button monthNavigation (PreviousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 79-Click on button monthNavigation PreviousMonth.png')

"Step 80: Click on button gridCells (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_gridCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_gridCells', ['button_gridCells_class': button_gridCells_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 80-Click on button gridCells object2.png')

"Step 81: Click on div ScheduleTestRun -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 81-Click on div ScheduleTestRun - Navigate to page .png')

"Step 82: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC47-Schedule Test Runs with Various Configurations in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}