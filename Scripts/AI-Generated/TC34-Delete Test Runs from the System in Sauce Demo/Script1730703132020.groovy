import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.deleteTestRuns
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link Settings4 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings4'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 4-Click on link Settings4 - Navigate to page teamproject.png')

"Step 5: Click on link Executions8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions8'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 5-Click on link Executions8.png')

"Step 6: Click on link testManagement (Schedules)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': link_testManagement_nthChild, 'link_testManagement_internalRoleLinkName': link_testManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 6-Click on link testManagement Schedules.png')

"Step 7: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 7-Click on input Search.png')

"Step 8: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 8-Enter input value in input Search.png')

"Step 9: Click on link testSuiteDetails (TokenManager) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 9-Click on link testSuiteDetails TokenManager - Navigate to page teamprojectgridplanjob.png')

"Step 10: Click on link configurationDetails (Configuration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id, 'link_configurationDetails_job_id': link_configurationDetails_job_id, 'link_configurationDetails_project_id': link_configurationDetails_project_id, 'link_configurationDetails_team_id': link_configurationDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 10-Click on link configurationDetails Configuration.png')

"Step 11: Delete specified test runs from the system."

deleteTestRuns.execute(data_path_0, Integer.valueOf(index_0))

"Step 12: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 12-Click on input Search.png')

"Step 13: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search_1)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 13-Enter input value in input Search.png')

"Step 14: Click on link testSuiteDetails (TestService) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_trNthChild': link_testSuiteDetails_trNthChild, 'link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName_1, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id_1, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id_1, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 14-Click on link testSuiteDetails TestService - Navigate to page teamprojectgridplanjob.png')

"Step 15: Click on link configurationDetails (Configuration2) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_1, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_1, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_1, 'link_configurationDetails_job_id': link_configurationDetails_job_id_1, 'link_configurationDetails_project_id': link_configurationDetails_project_id_1, 'link_configurationDetails_team_id': link_configurationDetails_team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 15-Click on link configurationDetails Configuration2 - Navigate to page teamprojectgridplanjob.png')

"Step 16: Click on p ConfigType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/p_ConfigType'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 16-Click on p ConfigType.png')

"Step 17: Click on p ConfigType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/p_ConfigType'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 17-Click on p ConfigType.png')

"Step 18: Click on link calendarDetails (Schedules) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails', ['link_calendarDetails_internalRoleLinkName': link_calendarDetails_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 18-Click on link calendarDetails Schedules - Navigate to page teamproject.png')

"Step 19: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 19-Click on input Search.png')

"Step 20: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search_2)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 20-Enter input value in input Search.png')

"Step 21: Click on link testSuiteDetails (TokenManager2) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_trNthChild': link_testSuiteDetails_trNthChild_1, 'link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName_2, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id_2, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id_2, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 21-Click on link testSuiteDetails TokenManager2 - Navigate to page teamprojectgridplanjob.png')

"Step 22: Click on link configurationDetails (Configuration3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_2, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_2, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_2, 'link_configurationDetails_job_id': link_configurationDetails_job_id_2, 'link_configurationDetails_project_id': link_configurationDetails_project_id_2, 'link_configurationDetails_team_id': link_configurationDetails_team_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 22-Click on link configurationDetails Configuration3 - Navigate to page teamprojectgridplanjob.png')

"Step 23: Click on link configurationDetails (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_3, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_3, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_3, 'link_configurationDetails_job_id': link_configurationDetails_job_id_3, 'link_configurationDetails_project_id': link_configurationDetails_project_id_3, 'link_configurationDetails_team_id': link_configurationDetails_team_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 23-Click on link configurationDetails Sessions.png')

"Step 24: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 24-Click on button Run.png')

"Step 25: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 25-Click on div Backdrop.png')

"Step 26: Click on link configurationDetails (Configuration3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_4, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_4, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_4, 'link_configurationDetails_job_id': link_configurationDetails_job_id_4, 'link_configurationDetails_project_id': link_configurationDetails_project_id_4, 'link_configurationDetails_team_id': link_configurationDetails_team_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 26-Click on link configurationDetails Configuration3.png')

"Step 27: Click on link testRuns (TestRuns) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 27-Click on link testRuns TestRuns - Navigate to page teamprojectgridplanjob.png')

"Step 28: Click on link configurationDetails (Configuration3) -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_5, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_5, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_5, 'link_configurationDetails_job_id': link_configurationDetails_job_id_5, 'link_configurationDetails_project_id': link_configurationDetails_project_id_5, 'link_configurationDetails_team_id': link_configurationDetails_team_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 28-Click on link configurationDetails Configuration3 - Navigate to page teamprojectgridplanjob.png')

"Step 29: Click on link configurationDetails (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_6, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_6, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_6, 'link_configurationDetails_job_id': link_configurationDetails_job_id_6, 'link_configurationDetails_project_id': link_configurationDetails_project_id_6, 'link_configurationDetails_team_id': link_configurationDetails_team_id_6]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 29-Click on link configurationDetails Sessions.png')

"Step 30: Click on link configurationDetails (Configuration3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_7, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_7, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_7, 'link_configurationDetails_job_id': link_configurationDetails_job_id_7, 'link_configurationDetails_project_id': link_configurationDetails_project_id_7, 'link_configurationDetails_team_id': link_configurationDetails_team_id_7]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 30-Click on link configurationDetails Configuration3.png')

"Step 31: Click on link testRuns (TestRuns) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild_1, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 31-Click on link testRuns TestRuns - Navigate to page teamprojectgridplanjob.png')

"Step 32: Click on link configurationDetails (Configuration3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_configurationDetails', ['link_configurationDetails_nthChild': link_configurationDetails_nthChild_8, 'link_configurationDetails_internalRoleLinkName': link_configurationDetails_internalRoleLinkName_8, 'link_configurationDetails_plan_id': link_configurationDetails_plan_id_8, 'link_configurationDetails_job_id': link_configurationDetails_job_id_8, 'link_configurationDetails_project_id': link_configurationDetails_project_id_8, 'link_configurationDetails_team_id': link_configurationDetails_team_id_8]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 32-Click on link configurationDetails Configuration3.png')

"Step 33: Click on link calendarDetails (Schedules) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_calendarDetails', ['link_calendarDetails_internalRoleLinkName': link_calendarDetails_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 33-Click on link calendarDetails Schedules - Navigate to page teamproject.png')

"Step 34: Click on input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Search'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 34-Click on input Search.png')

"Step 35: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Search'), input_Search_3)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 35-Enter input value in input Search.png')

"Step 36: Click on link testSuiteDetails (TestService) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testSuiteDetails', ['link_testSuiteDetails_trNthChild': link_testSuiteDetails_trNthChild_2, 'link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName_3, 'link_testSuiteDetails_team_id': link_testSuiteDetails_team_id_3, 'link_testSuiteDetails_plan_id': link_testSuiteDetails_plan_id_3, 'link_testSuiteDetails_project_id': link_testSuiteDetails_project_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 36-Click on link testSuiteDetails TestService - Navigate to page teamprojectgridplanjob.png')

"Step 37: Click on link testRunDetails (TestRunId) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid_plan_job/link_testRunDetails', ['link_testRunDetails_trNthChild': link_testRunDetails_trNthChild, 'link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName, 'link_testRunDetails_team_id': link_testRunDetails_team_id, 'link_testRunDetails_executions_id': link_testRunDetails_executions_id, 'link_testRunDetails_project_id': link_testRunDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 37-Click on link testRunDetails TestRunId - Navigate to page teamprojectexecutions.png')

"Step 38: Click on link TestResults3 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults3_1'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 38-Click on link TestResults3 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 39: Click on th Summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/th_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 39-Click on th Summary.png')

"Step 40: Click on th Summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/th_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 40-Click on th Summary.png')

"Step 41: Click on div ReviewStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_ReviewStatus'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 41-Click on div ReviewStatus.png')

"Step 42: Click on link Files2 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Files2'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 42-Click on link Files2 - Navigate to page teamprojectexecutionsfiles.png')

"Step 43: Click on link TestResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_TestResults'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 43-Click on link TestResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 44: Click on link Summary -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 44-Click on link Summary - Navigate to page teamprojectexecutions.png')

"Step 45: Click on link TestResults3 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults3_1'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 45-Click on link TestResults3 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 46: Click on link Summary -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 46-Click on link Summary - Navigate to page teamprojectexecutions.png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC34-Delete Test Runs from the System in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}