import katalon.common.runTestsAndSearchExecutions
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 4: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 4-Click on link reports - Navigate to page teamproject.png')

"Step 5: Click on link runFrequency -> Navigate to page 'team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_runFrequency'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 5-Click on link runFrequency - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 6: Click on link testRuns -> Navigate to page 'team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 6-Click on link testRuns - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 7: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 7-Click on span object.png')

"Step 8: Run tests and search for test executions"

runTestsAndSearchExecutions.execute()

"Step 9: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 9-Click on button apply.png')

"Step 10: Click on button jul1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_jul1'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 10-Click on button jul1.png')

"Step 11: Click on button jul31"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_jul31'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 11-Click on button jul31.png')

"Step 12: Click on button apply2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_apply2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 12-Click on button apply2.png')

"Step 13: Click on link summaryByTestResult2 -> Navigate to page 'team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_summaryByTestResult2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 13-Click on link summaryByTestResult2 - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 14: Click on link failedTestResultsBeta -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_failedTestResultsBeta'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 14-Click on link failedTestResultsBeta - Navigate to page teamproject.png')

"Step 15: Click on list object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/list_object'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 15-Click on list object.png')

"Step 16: Click on link runFrequency -> Navigate to page 'team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_runFrequency'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 16-Click on link runFrequency - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 17: Click on link defects -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_defects'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 17-Click on link defects - Navigate to page teamproject.png')

"Step 18: Click on link testEnvironments -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 18-Click on link testEnvironments - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 19: Click on button maintainerAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_maintainerAll'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 19-Click on button maintainerAll.png')

"Step 20: Click on button lastRunAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_lastRunAll'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 20-Click on button lastRunAll.png')

"Step 21: Click on button lastRunAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_lastRunAll'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 21-Click on button lastRunAll.png')

"Step 22: Click on button typeAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_typeAll'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 22-Click on button typeAll.png')

"Step 23: Click on button pathAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_pathAll'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 23-Click on button pathAll.png')

"Step 24: Click on button statusAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_statusAll'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 24-Click on button statusAll.png')

"Step 25: Click on span failed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/span_failed'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 25-Click on span failed.png')

"Step 26: Click on span lastRunAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/span_lastRunAll'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 26-Click on span lastRunAll.png')

"Step 27: Click on button chooseDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_chooseDate'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 27-Click on button chooseDate.png')

"Step 28: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 28-Click on div object.png')

"Step 29: Click on button previousMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_previousMonth'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 29-Click on button previousMonth.png')

"Step 30: Click on button previousMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_previousMonth'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 30-Click on button previousMonth.png')

"Step 31: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 31-Click on div object2.png')

"Step 32: Click on button jun1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_jun1'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 32-Click on button jun1.png')

"Step 33: Click on button chooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_chooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 33-Click on button chooseDate2.png')

"Step 34: Click on button previousMonth2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_previousMonth2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 34-Click on button previousMonth2.png')

"Step 35: Click on button jul31"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_jul31'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 35-Click on button jul31.png')

"Step 36: Click on button update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_update'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 36-Click on button update.png')

"Step 37: Click on input withInValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/input_withInValue'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 37-Click on input withInValue.png')

"Step 38: Click on select withInUnit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/select_withInUnit'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 38-Click on select withInUnit.png')

"Step 39: Click on select withInUnit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/select_withInUnit'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 39-Click on select withInUnit.png')

"Step 40: Click on input withInValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/input_withInValue'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 40-Click on input withInValue.png')

"Step 41: Enter input value in input withInValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/input_withInValue'), input_withInValue)

WebUI.takeScreenshot(reportLocation + '/TC73/Step 41-Enter input value in input withInValue.png')

"Step 42: Click on button update"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/button_update'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 42-Click on button update.png')

"Step 43: Click on td mexicoTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/td_mexicoTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 43-Click on td mexicoTestCases.png')

"Step 44: Click on div mexico"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/div_mexico'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 44-Click on div mexico.png')

"Step 45: Click on link firstTestCase -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_firstTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 45-Click on link firstTestCase - Navigate to page teamprojecttest-designtest-cases.png')

"Step 46: Click on button uploadedData -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_uploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 46-Click on button uploadedData - Navigate to page teamprojecttest-designtest-cases.png')

"Step 47: Click on div uploadedData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_uploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 47-Click on div uploadedData.png')

"Step 48: Click on div testCases2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_testCases2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 48-Click on div testCases2.png')

"Step 49: Click on span object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object7_1'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 49-Click on span object8.png')

"Step 50: Click on div laptopTesting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_katalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 50-Click on div laptopTesting.png')

"Step 51: Click on div laptopTesting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_katalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 51-Click on div laptopTesting.png')

"Step 52: Click on div katalonCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_countyDemographicsAnd'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 52-Click on div katalonCloud.png')

"Step 53: Click on button testCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_testCase'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 53-Click on button testCase.png')

"Step 54: Click on div createTestCase -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_createTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 54-Click on div createTestCase - Navigate to page teamprojecttest-designtest-cases.png')

"Step 55: Click on button uploadedData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/button_uploadedData'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 55-Click on button uploadedData.png')

"Step 56: Click on link testSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 56-Click on link testSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 57: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 57-Click on span object.png')

"Step 58: Click on span object2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_object2_1'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 58-Click on span object2 - Navigate to page .png')

"Step 59: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC73-Run Tests and Verify Execution Performance_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}