import truetest.common.viewExecutionDetailsAndLinks
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to /team/*/project/*"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Reports3 -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 4-Click on link Reports3 - Navigate to page teamprojectoverview.png')

"Step 5: Click on link RunFrequency -> Navigate to page '/team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_RunFrequency'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 5-Click on link RunFrequency - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 6: Click on link SummaryByTestResult -> Navigate to page '/team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_SummaryByTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 6-Click on link SummaryByTestResult - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 7: Click on link TestRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_TestRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 7-Click on link TestRuns2.png')

"Step 8: View execution details and related test run links"

viewExecutionDetailsAndLinks.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on span past30Days"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_past30Days'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 9-Click on span past30Days.png')

"Step 10: Click on button dateSelection (jul1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dateSelection', ['button_dateSelection_class_1': button_dateSelection_class_1, 'button_dateSelection_class': button_dateSelection_class, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 10-Click on button dateSelection jul1.png')

"Step 11: Click on button dateSelection (jul31)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dateSelection', ['button_dateSelection_class_1': button_dateSelection_class_1_1, 'button_dateSelection_class': button_dateSelection_class_1, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 11-Click on button dateSelection jul31.png')

"Step 12: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 12-Click on button apply.png')

"Step 13: Click on link summaryByTestResult -> Navigate to page '/team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_summaryByTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 13-Click on link summaryByTestResult - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 14: Click on link FailedTestResults -> Navigate to page '/team/*/project/*/failed-test-result'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_FailedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 14-Click on link FailedTestResults - Navigate to page teamprojectfailed-test-result.png')

"Step 15: Click on list OverviewTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/failed-test-result?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_failed_test_result/list_OverviewTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 15-Click on list OverviewTestRuns.png')

"Step 16: Click on link RunFrequency -> Navigate to page '/team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/failed-test-result?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_failed_test_result/link_RunFrequency'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 16-Click on link RunFrequency - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 17: Click on link Defects -> Navigate to page '/team/*/project/*/defects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_Defects'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 17-Click on link Defects - Navigate to page teamprojectdefects.png')

"Step 18: Click on link TestCases -> Navigate to page '/team/*/project/*/test-reports/test-maintenance/active'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/defects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_defects/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 18-Click on link TestCases - Navigate to page teamprojecttest-reportstest-maintenanceactive.png')

"Step 19: Click on button MaintainerAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_MaintainerAll'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 19-Click on button MaintainerAll.png')

"Step 20: Click on button LastRunAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_LastRunAll'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 20-Click on button LastRunAll.png')

"Step 21: Click on button LastRunAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_LastRunAll'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 21-Click on button LastRunAll.png')

"Step 22: Click on button TypeAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_TypeAll'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 22-Click on button TypeAll.png')

"Step 23: Click on button PathAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_PathAll'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 23-Click on button PathAll.png')

"Step 24: Click on button StatusAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_StatusAll'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 24-Click on button StatusAll.png')

"Step 25: Click on span Failed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/span_Failed'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 25-Click on span Failed.png')

"Step 26: Click on span LastRunAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/span_LastRunAll'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 26-Click on span LastRunAll.png')

"Step 27: Click on button ChooseDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_ChooseDate'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 27-Click on button ChooseDate.png')

"Step 28: Click on div August2024"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/div_August2024'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 28-Click on div August2024.png')

"Step 29: Click on button PreviousMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_PreviousMonth'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 29-Click on button PreviousMonth.png')

"Step 30: Click on button PreviousMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_PreviousMonth'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 30-Click on button PreviousMonth.png')

"Step 31: Click on div DaysOfMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/div_DaysOfMonth'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 31-Click on div DaysOfMonth.png')

"Step 32: Click on button dateSelection (Jun1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance_active/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance_active/button_dateSelection', ['button_dateSelection_nthChild_1': button_dateSelection_nthChild_1, 'button_dateSelection_nthChild': button_dateSelection_nthChild, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 32-Click on button dateSelection Jun1.png')

"Step 33: Click on button ChooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_ChooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 33-Click on button ChooseDate2.png')

"Step 34: Click on button PreviousMonth2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_PreviousMonth2'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 34-Click on button PreviousMonth2.png')

"Step 35: Click on button dateSelection (Jul31)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance_active/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance_active/button_dateSelection', ['button_dateSelection_nthChild_1': button_dateSelection_nthChild_1_1, 'button_dateSelection_nthChild': button_dateSelection_nthChild_1, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 35-Click on button dateSelection Jul31.png')

"Step 36: Click on button Update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_Update'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 36-Click on button Update.png')

"Step 37: Click on input WithinValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/input_WithinValue'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 37-Click on input WithinValue.png')

"Step 38: Click on select WithinTimeUnit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/select_WithinTimeUnit'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 38-Click on select WithinTimeUnit.png')

"Step 39: Click on select WithinTimeUnit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/select_WithinTimeUnit'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 39-Click on select WithinTimeUnit.png')

"Step 40: Click on input WithinValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/input_WithinValue'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 40-Click on input WithinValue.png')

"Step 41: Enter input value in input WithinValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/input_WithinValue'), input_WithinValue)

WebUI.takeScreenshot(reportLocation + '/TC177/Step 41-Enter input value in input WithinValue.png')

"Step 42: Click on button Update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/button_Update'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 42-Click on button Update.png')

"Step 43: Click on td MexicoTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/td_MexicoTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 43-Click on td MexicoTestCases.png')

"Step 44: Click on div Mexico"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance_active/div_Mexico'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 44-Click on div Mexico.png')

"Step 45: Click on link testCaseLinks (Mexico) -> Navigate to page '/team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/active?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance_active/link_testCaseLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance_active/link_testCaseLinks', ['link_testCaseLinks_internalRoleLinkName': link_testCaseLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 45-Click on link testCaseLinks Mexico - Navigate to page teamprojecttest-designtest-cases.png')

"Step 46: Click on button uploadedDataActions (UploadedData) -> Navigate to page '/team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedDataActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedDataActions', ['button_uploadedDataActions_internalHasText': button_uploadedDataActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 46-Click on button uploadedDataActions UploadedData - Navigate to page teamprojecttest-designtest-cases.png')

"Step 47: Click on div testCases (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 47-Click on div testCases UploadedData.png')

"Step 48: Click on div testCases (TestCases3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 48-Click on div testCases TestCases3.png')

"Step 49: Click on span treeSwitchers (TreeSwitcher13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild, 'span_treeSwitchers_class': span_treeSwitchers_class, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 49-Click on span treeSwitchers TreeSwitcher13.png')

"Step 50: Click on div testCases (LaptopTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 50-Click on div testCases LaptopTesting.png')

"Step 51: Click on div testCases (LaptopTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 51-Click on div testCases LaptopTesting.png')

"Step 52: Click on div testCases (KatalonCloud2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 52-Click on div testCases KatalonCloud2.png')

"Step 53: Click on button AddTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_AddTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 53-Click on button AddTestCase.png')

"Step 54: Click on div CreateTestCase -> Navigate to page '/team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_CreateTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 54-Click on div CreateTestCase - Navigate to page teamprojecttest-designtest-cases.png')

"Step 55: Click on button uploadedDataActions (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedDataActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedDataActions', ['button_uploadedDataActions_internalHasText': button_uploadedDataActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 55-Click on button uploadedDataActions UploadedData.png')

"Step 56: Click on link TestSuites8 -> Navigate to page '/team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites8'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 56-Click on link TestSuites8 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 57: Click on span CaretDown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_CaretDown'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 57-Click on span CaretDown.png')

"Step 58: Click on span treeSwitcherIcons (Object2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcherIcons', ['span_treeSwitcherIcons_class': span_treeSwitcherIcons_class]))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 58-Click on span treeSwitcherIcons Object2 - Navigate to page .png')

"Step 59: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC177-Generate Reports on Test Execution Performance_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}