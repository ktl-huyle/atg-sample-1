import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.searchTestRunDetails
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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 4-Click on link Reports - Navigate to page teamproject.png')

"Step 5: Click on link RunFrequency -> Navigate to page 'team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_RunFrequency'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 5-Click on link RunFrequency - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 6: Click on link SummaryByTestResult -> Navigate to page 'team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_SummaryByTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 6-Click on link SummaryByTestResult - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 7: Click on link TestRuns3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 7-Click on link TestRuns3.png')

"Step 8: Search and view details of test run results."

searchTestRunDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on span Past30Days"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Past30Days'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 9-Click on span Past30Days.png')

"Step 10: Click on button dateSelection (JulyDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection', ['button_dateSelection_class': button_dateSelection_class, 'button_dateSelection_class_1': button_dateSelection_class_1, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 10-Click on button dateSelection JulyDate.png')

"Step 11: Click on button dateSelection (JulyEndDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dateSelection', ['button_dateSelection_class': button_dateSelection_class_1, 'button_dateSelection_class_1': button_dateSelection_class_1_1, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 11-Click on button dateSelection JulyEndDate.png')

"Step 12: Click on button ApplyFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ApplyFilter'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 12-Click on button ApplyFilter.png')

"Step 13: Click on link SummaryByTestResult2 -> Navigate to page 'team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_SummaryByTestResult2'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 13-Click on link SummaryByTestResult2 - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 14: Click on link FailedTestResults -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_FailedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 14-Click on link FailedTestResults - Navigate to page teamproject.png')

"Step 15: Click on list Overview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/list_Overview'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 15-Click on list Overview.png')

"Step 16: Click on link RunFrequency -> Navigate to page 'team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_RunFrequency'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 16-Click on link RunFrequency - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 17: Click on link Defects -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_Defects'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 17-Click on link Defects - Navigate to page teamproject.png')

"Step 18: Click on link TestCases2 -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestCases2'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 18-Click on link TestCases2 - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 19: Click on button MaintainerAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_MaintainerAll'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 19-Click on button MaintainerAll.png')

"Step 20: Click on button LastRunAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_LastRunAll'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 20-Click on button LastRunAll.png')

"Step 21: Click on button LastRunAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_LastRunAll'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 21-Click on button LastRunAll.png')

"Step 22: Click on button TypeAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_TypeAll'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 22-Click on button TypeAll.png')

"Step 23: Click on button PathAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_PathAll'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 23-Click on button PathAll.png')

"Step 24: Click on button StatusAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_StatusAll'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 24-Click on button StatusAll.png')

"Step 25: Click on span FailedStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/span_FailedStatus'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 25-Click on span FailedStatus.png')

"Step 26: Click on span LastRunAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/span_LastRunAll'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 26-Click on span LastRunAll.png')

"Step 27: Click on button ChooseDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_ChooseDate'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 27-Click on button ChooseDate.png')

"Step 28: Click on div AugustDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/div_AugustDate'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 28-Click on div AugustDate.png')

"Step 29: Click on button PreviousMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_PreviousMonth'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 29-Click on button PreviousMonth.png')

"Step 30: Click on button PreviousMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_PreviousMonth'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 30-Click on button PreviousMonth.png')

"Step 31: Click on div DayOfWeek"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/div_DayOfWeek'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 31-Click on div DayOfWeek.png')

"Step 32: Click on button dateSelection (JuneDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/button_dateSelection', ['button_dateSelection_nthChild': button_dateSelection_nthChild, 'button_dateSelection_nthChild_1': button_dateSelection_nthChild_1, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 32-Click on button dateSelection JuneDate.png')

"Step 33: Click on button ChooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_ChooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 33-Click on button ChooseDate2.png')

"Step 34: Click on button PreviousMonth2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_PreviousMonth2'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 34-Click on button PreviousMonth2.png')

"Step 35: Click on button dateSelection (JulyEndDate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/button_dateSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/button_dateSelection', ['button_dateSelection_nthChild': button_dateSelection_nthChild_1, 'button_dateSelection_nthChild_1': button_dateSelection_nthChild_1_1, 'button_dateSelection_internalLabel': button_dateSelection_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 35-Click on button dateSelection JulyEndDate.png')

"Step 36: Click on button Update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_Update'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 36-Click on button Update.png')

"Step 37: Click on input WithinValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/input_WithinValue'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 37-Click on input WithinValue.png')

"Step 38: Click on select WithinTimeUnit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/select_WithinTimeUnit'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 38-Click on select WithinTimeUnit.png')

"Step 39: Click on select WithinTimeUnit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/select_WithinTimeUnit'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 39-Click on select WithinTimeUnit.png')

"Step 40: Click on input WithinValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/input_WithinValue'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 40-Click on input WithinValue.png')

"Step 41: Enter input value in input WithinValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/input_WithinValue'), input_WithinValue)

WebUI.takeScreenshot(reportLocation + '/TC75/Step 41-Enter input value in input WithinValue.png')

"Step 42: Click on button Update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_Update'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 42-Click on button Update.png')

"Step 43: Click on td TestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/td_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 43-Click on td TestCases.png')

"Step 44: Click on div Mexico"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/div_Mexico'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 44-Click on div Mexico.png')

"Step 45: Click on link testCases (TestCases) -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_reports_test_maintenance/link_testCases', ['link_testCases_internalRoleLinkName': link_testCases_internalRoleLinkName, 'link_testCases_team_id': link_testCases_team_id, 'link_testCases_project_id': link_testCases_project_id, 'link_testCases_test_cases_id': link_testCases_test_cases_id]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 45-Click on link testCases TestCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 46: Click on button uploadedData (UploadedData) -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedData', ['button_uploadedData_internalHasText': button_uploadedData_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 46-Click on button uploadedData UploadedData - Navigate to page teamprojecttest-designtest-cases.png')

"Step 47: Click on div testCases (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 47-Click on div testCases UploadedData.png')

"Step 48: Click on div testCases (TestCases4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 48-Click on div testCases TestCases4.png')

"Step 49: Click on span treeSwitchers (TreeSwitcher14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_2', ['span_treeSwitchers_nthChild': span_treeSwitchers_nthChild, 'span_treeSwitchers_class': span_treeSwitchers_class, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 49-Click on span treeSwitchers TreeSwitcher14.png')

"Step 50: Click on div testCases (LaptopTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 50-Click on div testCases LaptopTesting.png')

"Step 51: Click on div testCases (LaptopTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 51-Click on div testCases LaptopTesting.png')

"Step 52: Click on div testCases (KatalonCloud2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 52-Click on div testCases KatalonCloud2.png')

"Step 53: Click on button AddTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_AddTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 53-Click on button AddTestCase.png')

"Step 54: Click on div CreateTestCase -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_CreateTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 54-Click on div CreateTestCase - Navigate to page teamprojecttest-designtest-cases.png')

"Step 55: Click on button uploadedData (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/button_uploadedData', ['button_uploadedData_internalHasText': button_uploadedData_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 55-Click on button uploadedData UploadedData.png')

"Step 56: Click on link TestSuites8 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites8'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 56-Click on link TestSuites8 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 57: Click on span CaretDown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_CaretDown'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 57-Click on span CaretDown.png')

"Step 58: Click on span svgIcons (SvgIcon2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_svgIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_svgIcons', ['span_svgIcons_class': span_svgIcons_class]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 58-Click on span svgIcons SvgIcon2 - Navigate to page .png')

"Step 59: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC75-View Test Case Summary in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}